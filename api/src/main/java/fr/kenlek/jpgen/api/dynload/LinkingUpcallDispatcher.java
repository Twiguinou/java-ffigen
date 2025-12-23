package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.methodType;
import static java.lang.reflect.Modifier.isStatic;

public class LinkingUpcallDispatcher extends Dispatcher implements UpcallDispatcher
{
    private static final MethodHandle LINKER_UPCALL_STUB, METHOD_HANDLE_BIND_TO;

    protected final UpcallTransformer m_upcallTransformer;
    private final SynchronizedWeakMap<Class<?>, MethodHandle> m_upcallCache = new SynchronizedWeakMap<>();
    protected final MethodHandle m_upcallStub;

    public LinkingUpcallDispatcher(Linker linker, UpcallTransformer upcallTransformer)
    {
        super(linker);
        this.m_upcallTransformer = upcallTransformer;
        this.m_upcallStub = LINKER_UPCALL_STUB.bindTo(linker);
    }

    public LinkingUpcallDispatcher(UpcallTransformer upcallTransformer)
    {
        this(SYSTEM_LINKER, upcallTransformer);
    }

    public LinkingUpcallDispatcher()
    {
        this(UpcallTransformer.IDENTITY);
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
