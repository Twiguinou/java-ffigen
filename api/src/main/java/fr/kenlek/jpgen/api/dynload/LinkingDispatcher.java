package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static fr.kenlek.jpgen.api.dynload.NativeProxies.methodDescriptor;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.methodType;
import static java.lang.reflect.Modifier.isStatic;

public class LinkingDispatcher implements DowncallDispatcher, UpcallDispatcher
{
    private static final MethodHandle LINKER_UPCALL_STUB, METHOD_HANDLE_BIND_TO;
    private static final Map<Method, MethodHandle> UPCALL_METHODS;

    protected final Linker m_linker;
    protected final SymbolLookup m_lookup;
    protected final UpcallTransformer m_upcallTransformer;
    private final SynchronizedWeakMap<Class<?>, MethodHandle> m_upcallCache = new SynchronizedWeakMap<>();
    protected final MethodHandle m_upcallStub;

    public LinkingDispatcher(Linker linker, SymbolLookup lookup, UpcallTransformer upcallTransformer)
    {
        this.m_linker = linker;
        this.m_lookup = lookup;
        this.m_upcallTransformer = upcallTransformer;
        this.m_upcallStub = LINKER_UPCALL_STUB.bindTo(linker);
    }

    public LinkingDispatcher(SymbolLookup lookup, UpcallTransformer upcallTransformer)
    {
        this(SYSTEM_LINKER, lookup, upcallTransformer);
    }

    public LinkingDispatcher(SymbolLookup lookup)
    {
        this(lookup, UpcallTransformer.IDENTITY);
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

    protected MemorySegment findSymbolAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.m_lookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Could not resolve function address for symbols: " + symbols));
    }

    protected MemorySegment findSymbolAddress(Method method)
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

        return this.findSymbolAddress(symbols);
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

    protected MethodHandle dispatchDowncall(Method method)
    {
        if (method.isAnnotationPresent(Variable.class))
        {
            return MethodHandles.constant(MemorySegment.class, this.findSymbolAddress(method));
        }

        Linker.Option[] options = resolveLinkerOptions(method).toArray(Linker.Option[]::new);
        FunctionDescriptor descriptor = this.resolveFunctionDescriptor(method);

        if (method.isAnnotationPresent(Unbound.class))
        {
            return this.m_linker.downcallHandle(descriptor, options);
        }

        return this.m_linker.downcallHandle(this.findSymbolAddress(method), descriptor, options);
    }

    @Override
    public MethodHandle dispatch(Method method)
    {
        return Optional.ofNullable(UPCALL_METHODS.get(method))
            .map(handle -> handle.bindTo(this))
            .orElseGet(() -> this.dispatchDowncall(method));
    }

    protected MethodHandle resolveUpcallMaker(Class<?> clazz)
    {
        MethodHandles.Lookup lookup = publicLookup();
        Method target = Arrays.stream(clazz.getMethods())
            .filter(method -> method.isAnnotationPresent(UpcallTarget.class))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("Could not find any upcall target: " + clazz));

        FunctionDescriptor descriptor = this.resolveFunctionDescriptor(target);
        MethodType descriptorType = descriptor.toMethodType();

        MethodHandle stubMaker = insertArguments(this.m_upcallStub, 1, descriptor);
        stubMaker = insertArguments(stubMaker, 2, (Object) resolveLinkerOptions(target).toArray(Linker.Option[]::new));
        try
        {
            MethodHandle resolved = lookup.unreflect(target);
            if (!isStatic(target.getModifiers()))
            {
                descriptorType = descriptorType.insertParameterTypes(0, resolved.type().parameterType(0));
            }

            resolved = this.m_upcallTransformer.transform(target, descriptorType, resolved);
            return isStatic(target.getModifiers())
                ? stubMaker.bindTo(resolved)
                : filterArguments(stubMaker, 0, METHOD_HANDLE_BIND_TO.bindTo(resolved));
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> MemorySegment dispatch(Arena arena, Class<? super T> clazz, T instance)
    {
        try
        {
            return (MemorySegment) this.m_upcallCache.get(clazz, this::resolveUpcallMaker).invoke(instance, arena);
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    @Override
    public MemorySegment dispatch(Arena arena, Class<?> clazz)
    {
        try
        {
            return (MemorySegment) this.m_upcallCache.get(clazz, this::resolveUpcallMaker).invoke(arena);
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    static
    {
        MethodHandles.Lookup lookup = lookup();

        UPCALL_METHODS = Arrays.stream(UpcallDispatcher.class.getMethods())
            .collect(Collectors.toUnmodifiableMap(Function.identity(), method ->
            {
                try
                {
                    return lookup.findVirtual(UpcallDispatcher.class, method.getName(), methodDescriptor(method));
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            }));

        try
        {
            LINKER_UPCALL_STUB = lookup.findVirtual(
                Linker.class, "upcallStub",
                methodType(MemorySegment.class, MethodHandle.class, FunctionDescriptor.class, Arena.class, Linker.Option[].class)
            );
            METHOD_HANDLE_BIND_TO = lookup.findVirtual(
                MethodHandle.class, "bindTo",
                methodType(MethodHandle.class, Object.class)
            );
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
