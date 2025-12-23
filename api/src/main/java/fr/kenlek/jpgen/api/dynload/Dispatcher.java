package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.reflect.Modifier.isStatic;

public abstract class Dispatcher
{
    protected final Linker m_linker;

    protected Dispatcher(Linker linker)
    {
        this.m_linker = linker;
    }

    protected static List<Linker.Option> resolveLinkerOptions(AnnotatedElement annotations)
    {
        return Stream.concat(
            Stream.ofNullable(annotations.getAnnotation(Critical.class))
                .map(critical -> Linker.Option.critical(critical.value())),
            Stream.ofNullable(annotations.getAnnotation(StateAware.class))
                .map(stateAware -> Linker.Option.captureCallState(stateAware.value()))
        ).toList();
    }

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

    protected static Optional<MemoryLayout> resolveBaseLayout(Class<?> type)
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

    protected Optional<MemoryLayout> resolveTypeLayout(AnnotatedElement classAnnotations, Class<?> type, AnnotatedElement annotations)
    {
        return Optional.ofNullable(annotations.getAnnotation(Layout.class))
            .map(this::resolveTypeLayout)
            .or(() -> Stream.ofNullable(classAnnotations.getAnnotation(Layout.Generic.class))
                .flatMap(generic -> Arrays.stream(generic.value()))
                .filter(layoutCase -> layoutCase.target().equals(type))
                .findFirst()
                .map(layoutCase -> this.resolveTypeLayout(layoutCase.layout()))
            )
            .or(() -> Optional.ofNullable(type.getAnnotation(Layout.Container.class))
                .map(container -> switch (container.kind())
                {
                    case FIELD -> findLayoutField(type, container.value());
                    case METHOD -> findLayoutMethod(type, container.value());
                })
            )
            .or(() -> resolveBaseLayout(type));
    }

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
                        .orElseThrow(() -> new IllegalArgumentException("Unable to resolve layout for parameter: " + parameter))
                    )
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
