package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.reflect.Modifier.isStatic;

/// The base class of all downcall and upcall dispatchers.
/// In itself, this class does not accomplish anything but provides overridable methods
/// to resolve the specifics of a native proxy.
public abstract class Dispatcher
{
    private static final Map<Class<?>, MemoryLayout> BASE_LAYOUTS = Map.ofEntries(
        Map.entry(byte.class, JAVA_BYTE),
        Map.entry(boolean.class, JAVA_BOOLEAN),
        Map.entry(short.class, JAVA_SHORT),
        Map.entry(char.class, JAVA_CHAR),
        Map.entry(int.class, JAVA_INT),
        Map.entry(long.class, JAVA_LONG),
        Map.entry(float.class, JAVA_FLOAT),
        Map.entry(double.class, JAVA_DOUBLE),
        Map.entry(MemorySegment.class, ADDRESS),
        Map.entry(String.class, UNBOUNDED_POINTER)
    );

    protected final Linker m_linker;

    protected Dispatcher(Linker linker)
    {
        this.m_linker = linker;
    }

    /// Resolves linker options to use for a downcall or an upcall from a set of annotations.
    protected static List<Linker.Option> resolveLinkerOptions(AnnotatedElement annotations)
    {
        return Stream.concat(
            Stream.ofNullable(annotations.getAnnotation(Critical.class))
                .map(critical -> Linker.Option.critical(critical.value())),
            Stream.ofNullable(annotations.getAnnotation(StateAware.class))
                .map(stateAware -> Linker.Option.captureCallState(stateAware.value()))
        ).toList();
    }

    /// Helper method to find a [MemoryLayout] static field inside a class.
    /// @param clazz A class.
    /// @param name The name of the field to search for.
    /// @return A memory layout.
    /// @throws IllegalArgumentException If no compatible field could be found.
    protected static MemoryLayout findLayoutField(Class<?> clazz, String name)
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
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            throw new RuntimeException("Unable to resolve layout in container: " + clazz, e);
        }
    }

    /// @see #findLayoutField
    protected static MemoryLayout findLayoutMethod(Class<?> clazz, String name)
    {
        try
        {
            Method method = clazz.getMethod(name);
            if (!isStatic(method.getModifiers()))
            {
                throw new IllegalArgumentException("Method is not static: " + method);
            }

            if (!MemoryLayout.class.isAssignableFrom(method.getReturnType()))
            {
                throw new IllegalArgumentException("Method return type is not assignable from MemoryLayout: " + method);
            }

            return (MemoryLayout) method.invoke(null);
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {
            throw new RuntimeException("Unable to resolve layout in container: " + clazz, e);
        }
    }

    /// Attempts to resolve the memory layout of a basic type. For instance, `int` maps to
    /// [ValueLayout#JAVA_INT] and [MemorySegment] maps to [ValueLayout#ADDRESS].
    /// Basic types include:
    /// - Primitive types like: `boolean`, `byte`, `short`, `char`, `int`, `long`, `float`, `double`.
    /// - [MemorySegment].
    /// - [String] which maps to [fr.kenlek.jpgen.api.ForeignUtils#UNBOUNDED_POINTER].
    protected static Optional<MemoryLayout> resolveBaseLayout(Class<?> type)
    {
        return Optional.ofNullable(BASE_LAYOUTS.get(type));
    }

    /// Resolves the [MemoryLayout] described by a [Layout] annotation and throws an annotation
    /// if none could be found.
    /// @param layoutInfo A layout specifier annotation.
    /// @return The memory layout associated with the given annotation.
    /// @throws IllegalArgumentException If no memory layout could be resolved with the given annotation.
    /// @see Layout
    protected MemoryLayout resolveTypeLayout(Layout layoutInfo)
    {
        MemoryLayout layout;
        if (layoutInfo.container().equals(void.class))
        {
            layout = this.m_linker.canonicalLayouts().get(layoutInfo.value());
            if (layout == null)
            {
                throw new IllegalArgumentException("Unable to resolve canonical layout: " + layoutInfo.value());
            }
        }
        else
        {
            layout = switch (layoutInfo.containerKind())
            {
                case FIELD -> findLayoutField(layoutInfo.container(), layoutInfo.value());
                case METHOD -> findLayoutMethod(layoutInfo.container(), layoutInfo.value());
            };
        }

        if (layoutInfo.referenced())
        {
            layout = ADDRESS.withTargetLayout(layout);
        }

        return layout;
    }

    /// Attempts to compute the layout of an annotated element. It may fail to do so, in which
    /// case the method must return [Optional#empty].
    /// @param classAnnotations The annotations applied to the parent compound, like a class for a parameter.
    /// @param type The type to find the layout of.
    /// @param annotations The annotations directly applied to the related element (field or method).
    /// @return Nothing or a native [FunctionDescriptor].
    protected Optional<MemoryLayout> resolveTypeLayout(AnnotatedElement classAnnotations, Class<?> type, AnnotatedElement annotations)
    {
        return Optional.ofNullable(annotations.getAnnotation(Layout.class))
            .map(this::resolveTypeLayout)
            .or(() -> Stream.ofNullable(classAnnotations.getAnnotation(Layout.Generic.class))
                .flatMap(generic -> Arrays.stream(generic.value()))
                .filter(layoutCase -> layoutCase.target().equals(type))
                .findFirst()
                .map(layoutCase -> this.resolveTypeLayout(layoutCase.layout())))
            .or(() -> Optional.ofNullable(type.getAnnotation(Layout.Container.class))
                .map(container -> switch (container.kind())
                {
                    case FIELD -> findLayoutField(type, container.value());
                    case METHOD -> findLayoutMethod(type, container.value());
                }))
            .or(() -> resolveBaseLayout(type));
    }

    /// Finds the native function descriptor of a Java method.
    /// The returned value is not tied to the Java method by any contract, as such,
    /// it is possible to return effectively anything. It is to the subsequent transformations
    /// of MethodHandles to make the final callee compatible with the native descriptor.
    /// @param method The method used as reference to produce a descriptor.
    /// @return A native [FunctionDescriptor].
    /// @throws IllegalArgumentException If the method fails to resolve a descriptor.
    protected FunctionDescriptor resolveFunctionDescriptor(Method method)
    {
        return Optional.ofNullable(method.getAnnotation(Descriptor.class))
            .map(descriptor -> FunctionDescriptor.of(
                this.resolveTypeLayout(descriptor.result()),
                Arrays.stream(descriptor.parameters()).map(this::resolveTypeLayout).toArray(MemoryLayout[]::new)
            ))
            .or(() -> Optional.ofNullable(method.getAnnotation(Descriptor.Void.class))
                .map(descriptor -> FunctionDescriptor.ofVoid(
                    Arrays.stream(descriptor.value()).map(this::resolveTypeLayout).toArray(MemoryLayout[]::new)
                ))
            )
            .orElseGet(() ->
            {
                MemoryLayout[] parameterLayouts = Arrays.stream(method.getParameters())
                    .filter(parameter -> !parameter.isAnnotationPresent(Ignore.class))
                    .map(parameter -> this.resolveTypeLayout(method.getDeclaringClass(), parameter.getType(), parameter)
                        .orElseThrow(() -> new IllegalArgumentException("Unable to resolve layout for parameter: " + parameter)))
                    .toArray(MemoryLayout[]::new);

                if (method.isAnnotationPresent(Ignore.class))
                {
                    return FunctionDescriptor.ofVoid(parameterLayouts);
                }

                return this.resolveTypeLayout(method.getDeclaringClass(), method.getReturnType(), method)
                    .map(resultLayout -> FunctionDescriptor.of(resultLayout, parameterLayouts))
                    .orElseGet(() ->
                    {
                        if (method.getReturnType().equals(void.class))
                        {
                            return FunctionDescriptor.ofVoid(parameterLayouts);
                        }

                        throw new IllegalArgumentException("Unable to resolve result layout for method: " + method);
                    });
            });
    }
}
