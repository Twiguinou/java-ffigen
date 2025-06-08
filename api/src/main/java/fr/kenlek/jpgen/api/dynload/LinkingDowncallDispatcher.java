package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static java.lang.reflect.Modifier.isStatic;

public class LinkingDowncallDispatcher implements DowncallDispatcher
{
    public static final LinkingDowncallDispatcher DEFAULT = new LinkingDowncallDispatcher(SymbolLookup.loaderLookup());

    private final SymbolLookup m_symbolLookup;
    private final Linker m_linker;

    public LinkingDowncallDispatcher(SymbolLookup symbolLookup, Linker linker)
    {
        this.m_symbolLookup = symbolLookup;
        this.m_linker = linker;
    }

    public LinkingDowncallDispatcher(SymbolLookup symbolLookup)
    {
        this(symbolLookup, SYSTEM_LINKER);
    }

    public static Optional<MemoryLayout> resolveBaseLayout(Class<?> type)
    {
        if (type.equals(byte.class)) return Optional.of(JAVA_BYTE);
        if (type.equals(boolean.class)) return Optional.of(JAVA_BOOLEAN);
        if (type.equals(short.class)) return Optional.of(JAVA_SHORT);
        if (type.equals(char.class)) return Optional.of(JAVA_CHAR);
        if (type.equals(int.class)) return Optional.of(JAVA_INT);
        if (type.equals(long.class)) return Optional.of(JAVA_LONG);
        if (type.equals(float.class)) return Optional.of(JAVA_FLOAT);
        if (type.equals(double.class)) return Optional.of(JAVA_DOUBLE);
        if (type.equals(MemorySegment.class)) return Optional.of(UNBOUNDED_POINTER);

        return Optional.empty();
    }

    public static Optional<MemoryLayout> findLayoutInContainer(Class<?> clazz, Predicate<String> predicate)
    {
        return Stream.concat(
            Arrays.stream(clazz.getFields())
                .map(field ->
                {
                    if (!isStatic(field.getModifiers()) || !MemoryLayout.class.isAssignableFrom(field.getType()))
                    {
                        return null;
                    }

                    Layout.Value value = field.getAnnotation(Layout.Value.class);
                    if (value != null && predicate.test(value.value()))
                    {
                        try
                        {
                            return field.get(null);
                        }
                        catch (Throwable _) {}
                    }

                    return null;
                }),
            Arrays.stream(clazz.getMethods())
                .map(method ->
                {
                    if (!isStatic(method.getModifiers()) || !MemoryLayout.class.isAssignableFrom(method.getReturnType()) ||
                        method.getParameterCount() != 0)
                    {
                        return null;
                    }

                    Layout.Value value = method.getAnnotation(Layout.Value.class);
                    if (value != null && predicate.test(value.value()))
                    {
                        try
                        {
                            return method.invoke(null);
                        }
                        catch (Throwable _) {}
                    }

                    return null;
                })
        )
            .filter(Objects::nonNull)
            .map(MemoryLayout.class::cast)
            .findAny();
    }

    protected static MemoryLayout resolveTypeLayout(Linker linker, Layout layoutInfo)
    {
        MemoryLayout layout;
        if (layoutInfo.container().equals(void.class))
        {
            layout = Objects.requireNonNull(
                linker.canonicalLayouts().get(layoutInfo.value()),
                () -> "Unable to resolve canonical layout: " + layoutInfo.value()
            );
        }
        else
        {
            layout = findLayoutInContainer(layoutInfo.container(), Predicate.isEqual(layoutInfo.value()))
                .orElseThrow(() -> new RuntimeException(
                    "Unable to resolve memory layout %s in container %s".formatted(layoutInfo.value(), layoutInfo.container())
                ));
        }

        if (layoutInfo.referenced())
        {
            layout = ADDRESS.withTargetLayout(layout);
        }

        return layout;
    }

    protected static MemoryLayout resolveTypeLayout(Linker linker, AnnotatedElement classAnnotations, Class<?> type, AnnotatedElement annotations)
    {
        return Optional.ofNullable(annotations.getAnnotation(Layout.class))
            .map(layoutInfo -> resolveTypeLayout(linker, layoutInfo))
            .or(() -> Stream.ofNullable(classAnnotations.getAnnotation(Layout.Generic.class))
                .flatMap(generic -> Arrays.stream(generic.value()))
                .filter(layoutCase -> layoutCase.target().equals(type))
                .findFirst()
                .map(layoutCase -> resolveTypeLayout(linker, layoutCase.layout()))
            )
            .or(() -> resolveBaseLayout(type))
            .or(() -> findLayoutInContainer(type, _ -> true))
            .orElseThrow(() -> new RuntimeException("Unable to resolve layout for type: " + type));
    }

    public static List<Linker.Option> resolveLinkerOptions(Method method)
    {
        List<Linker.Option> options = new ArrayList<>();

        Critical critical = method.getAnnotation(Critical.class);
        if (critical != null)
        {
            options.add(Linker.Option.critical(critical.value()));
        }

        StateAware stateAware = method.getAnnotation(StateAware.class);
        if (stateAware != null)
        {
            options.add(Linker.Option.captureCallState(stateAware.value()));
        }

        return options;
    }

    protected static FunctionDescriptor resolveFunctionDescriptor(Linker linker, Method method)
    {
        MemoryLayout[] parameterLayouts = Arrays.stream(method.getParameters())
            .filter(parameter -> !parameter.isAnnotationPresent(Ignore.class))
            .map(parameter -> resolveTypeLayout(linker, method.getDeclaringClass(), parameter.getType(), parameter))
            .toArray(MemoryLayout[]::new);

        if (method.getReturnType().equals(void.class))
        {
            return FunctionDescriptor.ofVoid(parameterLayouts);
        }

        return FunctionDescriptor.of(resolveTypeLayout(linker, method.getDeclaringClass(), method.getReturnType(), method), parameterLayouts);
    }

    protected MemorySegment findFunctionAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.m_symbolLookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new RuntimeException(
                "Could not resolve function address for symbols: " + symbols
            ));
    }

    protected MemorySegment findFunctionAddress(Method method)
    {
        List<String> symbols = new ArrayList<>(1);

        Redirect redirect = method.getAnnotation(Redirect.class);
        if (redirect != null)
        {
            symbols.addAll(Arrays.asList(redirect.value()));
        }

        if (redirect == null || redirect.fallback())
        {
            Redirect.Generic generic = method.getDeclaringClass().getAnnotation(Redirect.Generic.class);
            boolean foundCase = false;
            if (generic != null)
            {
                for (Redirect.Case path : generic.value())
                {
                    if (!method.getName().matches(path.matching()))
                    {
                        continue;
                    }

                    symbols.add(path.replaceAll()
                        ? method.getName().replaceAll(path.regex(), path.value())
                        : method.getName().replaceFirst(path.regex(), path.value())
                    );

                    foundCase = true;
                    if (!generic.greedy())
                    {
                        break;
                    }
                }
            }

            if (!foundCase || generic.fallback())
            {
                symbols.add(method.getName());
            }
        }

        return this.findFunctionAddress(symbols);
    }

    @Override
    public Optional<MemorySegment> find(String name)
    {
        return this.m_symbolLookup.find(name);
    }

    @Override
    public Optional<Linker> linker()
    {
        return Optional.of(this.m_linker);
    }

    @Override
    public MethodHandle dispatch(Method method)
    {
        Linker.Option[] options = resolveLinkerOptions(method).toArray(Linker.Option[]::new);
        FunctionDescriptor descriptor = resolveFunctionDescriptor(this.m_linker, method);

        if (method.isAnnotationPresent(Unbound.class))
        {
            return this.m_linker.downcallHandle(descriptor, options);
        }

        return this.m_linker.downcallHandle(this.findFunctionAddress(method), descriptor, options);
    }
}
