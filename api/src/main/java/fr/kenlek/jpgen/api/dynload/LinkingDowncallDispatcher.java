package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.reflect.Modifier.isStatic;

/// An implementation of [DowncallDispatcher] which uses Java's FFM API to produce downcalls
/// to native functions.
public class LinkingDowncallDispatcher implements DowncallDispatcher
{
    /// A simple dispatcher using the system symbol lookup implementation.
    public static final LinkingDowncallDispatcher DEFAULT = new LinkingDowncallDispatcher(SymbolLookup.loaderLookup());

    private final SymbolLookup m_symbolLookup;
    private final Linker m_linker;

    /// Constructs a downcall dispatcher with the given lookup and linker values.
    /// @param symbolLookup The symbol lookup to use when searching for function symbols.
    /// @param linker The linker to use to produce downcalls.
    public LinkingDowncallDispatcher(SymbolLookup symbolLookup, Linker linker)
    {
        this.m_symbolLookup = symbolLookup;
        this.m_linker = linker;
    }

    /// Constructs a downcall dispatcher with the given lookup and the system linker.
    /// @param symbolLookup The symbol lookup to use when searching for function symbols.
    public LinkingDowncallDispatcher(SymbolLookup symbolLookup)
    {
        this(symbolLookup, SYSTEM_LINKER);
    }

    /// Resolves the primitive layout of the given class type.
    /// @param type The type to find the layout of.
    /// @return The corresponding memory layout, if any was found.
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
        if (type.equals(MemorySegment.class)) return Optional.of(ADDRESS);

        return Optional.empty();
    }

    protected static MemoryLayout findLayoutInContainer(Class<?> clazz, String name)
    {
        try
        {
            Field field = clazz.getField(name);
            if (!isStatic(field.getModifiers()))
            {
                throw new IllegalArgumentException("Field is not static: " + field);
            }

            if (!MemoryLayout.class.isAssignableFrom(field.getType()))
            {
                throw new IllegalArgumentException("Field type is not assignable from MemoryLayout: " + field);
            }

            return (MemoryLayout) field.get(null);
        }
        catch (Throwable t)
        {
            throw new IllegalArgumentException("Unable to resolve layout in container: " + clazz, t);
        }
    }

    /// Resolve the layout indicated with the provided [Layout] directives.
    /// @param linker The linker to resolve canonical layouts from.
    /// @param layoutInfo The layout annotation to get information from.
    /// @return The resolved memory layout.
    /// @throws IllegalArgumentException if either the provided layout info indicates a canonical layout but none was found
    /// or no matching layout was found inside the container class.
    protected static MemoryLayout resolveTypeLayout(Linker linker, Layout layoutInfo)
    {
        MemoryLayout layout;
        if (layoutInfo.container().equals(void.class))
        {
            layout = linker.canonicalLayouts().get(layoutInfo.value());
            if (layout == null)
            {
                throw new IllegalArgumentException("Unable to resolve canonical layout: " + layoutInfo.value());
            }
        }
        else
        {
            layout = findLayoutInContainer(layoutInfo.container(), layoutInfo.value());
        }

        if (layoutInfo.referenced())
        {
            layout = ADDRESS.withTargetLayout(layout);
        }

        return layout;
    }

    /// Fully resolves the layout of a given type using local and class annotations.
    /// - [Layout] annotations are processed first, without the ability to fallback if present.
    /// - [Layout.Generic] and matching cases are then taken into account.
    /// - Then an attempt is made to find a layout inside the given type class.
    /// - Finally, we try to find a base layout with [#resolveBaseLayout(java.lang.Class)].
    /// @param linker The linker given to [#resolveTypeLayout(java.lang.foreign.Linker, fr.kenlek.jpgen.api.dynload.Layout)].
    /// @param classAnnotations Class level annotations for the given element.
    /// @param type The type of the element.
    /// @param annotations Local annotations for the given element.
    /// @return The resolved memory layout.
    /// @throws IllegalArgumentException if no layout was resolved.
    protected static MemoryLayout resolveTypeLayout(Linker linker, AnnotatedElement classAnnotations, Class<?> type, AnnotatedElement annotations)
    {
        return Optional.ofNullable(annotations.getAnnotation(Layout.class))
            .map(layoutInfo -> resolveTypeLayout(linker, layoutInfo))
            .or(() -> Stream.ofNullable(classAnnotations.getAnnotation(Layout.Generic.class))
                .flatMap(generic -> Arrays.stream(generic.value()))
                .filter(layoutCase -> layoutCase.target().equals(type))
                .findFirst()
                .map(layoutCase -> resolveTypeLayout(linker, layoutCase.layout())))
            .or(() -> Optional.ofNullable(type.getAnnotation(Layout.Container.class))
                .map(container -> findLayoutInContainer(type, container.value())))
            .or(() -> resolveBaseLayout(type))
            .orElseThrow(() -> new IllegalArgumentException("Unable to resolve layout for type: " + type));
    }

    /// Finds all linker options available for a given method's annotations.
    /// @param annotations Annotations to find linker options from.
    /// @return The corresponding linker options.
    public static List<Linker.Option> resolveLinkerOptions(AnnotatedElement annotations)
    {
        List<Linker.Option> options = new ArrayList<>();

        Critical critical = annotations.getAnnotation(Critical.class);
        if (critical != null)
        {
            options.add(Linker.Option.critical(critical.value()));
        }

        StateAware stateAware = annotations.getAnnotation(StateAware.class);
        if (stateAware != null)
        {
            options.add(Linker.Option.captureCallState(stateAware.value()));
        }

        return options;
    }

    /// Uses all the above methods to convert the given method to a native function descriptor.
    /// @param linker The linker given to [#resolveTypeLayout(java.lang.foreign.Linker, java.lang.reflect.AnnotatedElement, java.lang.Class, java.lang.reflect.AnnotatedElement)].
    /// @param method The method, holding its parameter and return types, along with its declaring class.
    /// @return A native function descriptor for the given method.
    /// @throws IllegalArgumentException if the layout resolve step fails in any way.
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

    /// Finds the first available function pointer from a list of symbols.
    /// @param symbols A list of symbols to test the lookup with.
    /// @return The memory address of a compatible function pointer.
    /// @throws IllegalArgumentException if none of the given symbols resolved to a function pointer.
    protected MemorySegment findFunctionAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.m_symbolLookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "Could not resolve function address for symbols: " + symbols
            ));
    }

    /// The equivalent of [#findFunctionAddress(java.util.List)] with additional support for annotation hints
    /// on abstract methods.
    /// @param method The method on which to find every information.
    /// @return The memory address of a compatible function pointer.
    /// @throws IllegalArgumentException if the method was not resolved to a function pointer.
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
    public MethodHandle dispatch(Method method)
    {
        if (method.isAnnotationPresent(Variable.class))
        {
            return MethodHandles.constant(MemorySegment.class, this.findFunctionAddress(method));
        }

        Linker.Option[] options = resolveLinkerOptions(method).toArray(Linker.Option[]::new);
        FunctionDescriptor descriptor = resolveFunctionDescriptor(this.m_linker, method);

        if (method.isAnnotationPresent(Unbound.class))
        {
            return this.m_linker.downcallHandle(descriptor, options);
        }

        return this.m_linker.downcallHandle(this.findFunctionAddress(method), descriptor, options);
    }
}
