package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public class LinkingDowncallDispatcher implements DowncallDispatcher
{
    protected sealed interface LayoutRequest permits ParameterLayoutRequest, ReturnTypeLayoutRequest
    {
        Method method();

        Class<?> type();

        AnnotatedElement annotations();
    }

    protected record ParameterLayoutRequest(Method method, Parameter parameter) implements LayoutRequest
    {
        @Override
        public Class<?> type()
        {
            return this.parameter().getType();
        }

        @Override
        public AnnotatedElement annotations()
        {
            return this.parameter();
        }
    }

    protected record ReturnTypeLayoutRequest(Method method) implements LayoutRequest
    {
        @Override
        public Class<?> type()
        {
            return this.method().getReturnType();
        }

        @Override
        public AnnotatedElement annotations()
        {
            return this.method();
        }
    }

    public static final LinkingDowncallDispatcher DEFAULT = new LinkingDowncallDispatcher(SymbolLookup.loaderLookup());

    public final SymbolLookup symbolLookup;
    public final Linker linker;

    public LinkingDowncallDispatcher(SymbolLookup symbolLookup, Linker linker)
    {
        this.symbolLookup = symbolLookup;
        this.linker = linker;
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

    private static <T> Optional<T> tryGetFieldValue(Class<T> type, Field field)
    {
        try
        {
            return Optional.of(type.cast(field.get(null)));
        }
        catch (Throwable _)
        {
            return Optional.empty();
        }
    }

    private static <T> Optional<T> tryGetMethodValue(Class<T> type, Method method)
    {
        try
        {
            return Optional.of(type.cast(method.invoke(null)));
        }
        catch (Throwable _)
        {
            return Optional.empty();
        }
    }

    public static Optional<MemoryLayout> findLayoutInContainer(Class<?> clazz, Predicate<String> registeredPredicate, Predicate<String> unknownPredicate)
    {
        Field fallbackField = null;
        Method fallbackMethod = null;

        for (Field field : clazz.getFields())
        {
            int mods = field.getModifiers();
            if (!Modifier.isStatic(mods) || !Modifier.isPublic(mods) || !MemoryLayout.class.isAssignableFrom(field.getType()))
            {
                continue;
            }

            Layout.Value value = field.getAnnotation(Layout.Value.class);
            if (value != null && registeredPredicate.test(value.value()))
            {
                MemoryLayout memoryLayout = tryGetFieldValue(MemoryLayout.class, field).orElse(null);
                if (memoryLayout != null)
                {
                    return Optional.of(memoryLayout);
                }
            }

            if (unknownPredicate.test(field.getName()))
            {
                fallbackField = field;
            }
        }

        for (Method method : clazz.getMethods())
        {
            if (!Modifier.isStatic(method.getModifiers()) || !MemoryLayout.class.isAssignableFrom(method.getReturnType()) ||
                method.getParameterCount() != 0)
            {
                continue;
            }

            Layout.Value value = method.getAnnotation(Layout.Value.class);
            if (value != null && registeredPredicate.test(value.value()))
            {
                MemoryLayout memoryLayout = tryGetMethodValue(MemoryLayout.class, method).orElse(null);
                if (memoryLayout != null)
                {
                    return Optional.of(memoryLayout);
                }
            }

            if (unknownPredicate.test(method.getName()))
            {
                fallbackMethod = method;
            }
        }

        Optional<MemoryLayout> layout = tryGetFieldValue(MemoryLayout.class, fallbackField);
        return layout.isPresent() ? layout : tryGetMethodValue(MemoryLayout.class, fallbackMethod);
    }

    protected MemorySegment findFunctionAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.symbolLookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new RuntimeException(
                "Could not resolve function address for symbols: ".concat(symbols.toString())
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

    protected List<Linker.Option> resolveLinkerOptions(Method method)
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

    protected MemoryLayout resolveTypeLayout(LayoutRequest request)
    {
        return Optional.ofNullable(request.annotations().getAnnotation(Layout.class))
            .map(layoutInfo ->
            {
                MemoryLayout layout;
                if (layoutInfo.container().equals(void.class))
                {
                    layout = Objects.requireNonNull(
                        this.linker.canonicalLayouts().get(layoutInfo.value()),
                        () -> "Unable to resolve canonical layout: ".concat(layoutInfo.value())
                    );
                }
                else
                {
                    Predicate<String> elementPredicate = Predicate.isEqual(layoutInfo.value());
                    layout = findLayoutInContainer(layoutInfo.container(), elementPredicate, elementPredicate)
                        .orElseThrow(() -> new RuntimeException(
                            "Unable to resolve memory layout %s in container %s".formatted(layoutInfo.value(), layoutInfo.container().getName())
                        ));
                }

                if (layoutInfo.referenced())
                {
                    layout = ADDRESS.withTargetLayout(layout);
                }

                return layout;
            })
            .or(() -> resolveBaseLayout(request.type()))
            .or(() -> findLayoutInContainer(request.type(), _ -> true, _ -> false))
            .orElseThrow(() -> new RuntimeException("Unable to resolve layout for type: ".concat(request.type().getName())));
    }

    protected FunctionDescriptor resolveFunctionDescriptor(Method method)
    {
        List<Parameter> parameters = Arrays.asList(method.getParameters());

        Unbound unbound = method.getAnnotation(Unbound.class);
        if (unbound != null && !unbound.value())
        {
            if (parameters.isEmpty() || !parameters.getFirst().getType().equals(MemorySegment.class))
            {
                throw new IllegalArgumentException("The leading parameter of an unbound function must be a MemorySegment.");
            }

            parameters = parameters.subList(1, parameters.size());
        }

        MemoryLayout returnLayout;
        if (!method.getReturnType().equals(void.class))
        {
            returnLayout = this.resolveTypeLayout(new ReturnTypeLayoutRequest(method));
            if (returnLayout instanceof GroupLayout && !method.isAnnotationPresent(IgnoreAllocator.class))
            {
                if (parameters.isEmpty() || !parameters.getFirst().getType().equals(SegmentAllocator.class))
                {
                    throw new IllegalArgumentException("The first parameter of a composite returning function, or the second if the function is unbound, must be of SegmentAllocator type.");
                }

                parameters = parameters.subList(1, parameters.size());
            }
        }
        else
        {
            returnLayout = null;
        }

        StateAware stateAware = method.getAnnotation(StateAware.class);
        if (stateAware != null && !stateAware.ignoreSegment() && (parameters.isEmpty() || !parameters.getFirst().getType().equals(MemorySegment.class)))
        {
            throw new IllegalArgumentException("A MemorySegment parameter must be provided when capturing call state for a downcall. After the function's address and allocator if those are needed.");
        }

        MemoryLayout[] parameterLayouts = parameters.stream()
            .map(parameter -> this.resolveTypeLayout(new ParameterLayoutRequest(method, parameter)))
            .toArray(MemoryLayout[]::new);
        return returnLayout == null ? FunctionDescriptor.ofVoid(parameterLayouts) : FunctionDescriptor.of(returnLayout, parameterLayouts);
    }

    @Override
    public MethodHandle dispatch(Method method)
    {
        Linker.Option[] options = this.resolveLinkerOptions(method).toArray(Linker.Option[]::new);
        FunctionDescriptor descriptor = this.resolveFunctionDescriptor(method);

        if (method.isAnnotationPresent(Unbound.class))
        {
            return this.linker.downcallHandle(descriptor, options);
        }

        return this.linker.downcallHandle(this.findFunctionAddress(method), descriptor, options);
    }
}
