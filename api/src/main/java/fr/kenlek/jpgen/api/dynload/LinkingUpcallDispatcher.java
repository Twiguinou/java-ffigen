package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.methodType;
import static java.lang.reflect.Modifier.isStatic;

/// The upcall version of [LinkingDowncallDispatcher]. While downcalls produce a method handle
/// that can be reshaped in many ways. Upcalls are finalized to [MemorySegment]s, which means
/// any transformation must be applied before creation.
/// In this class, transformations are given as a property inside the constructor.
///
/// This implementation attempts to weakly store previous upcall computations in order to save
/// time in later uses.
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

    /// Creates a method handle to a Java method and applies transformations on it.
    /// The result of this method is not cached and has the following descriptor:
    /// - MemorySegment(Arena) if the target is static.
    /// - MemorySegment(T, Arena) if the target is virtual.
    /// @param clazz The class inside which an upcall target must be searched.
    /// @return A method handle that creates a function pointer.
    /// @throws IllegalArgumentException If any resolving failed.
    protected MethodHandle resolveUpcallMaker(Class<?> clazz)
    {
        List<Method> candidates = Arrays.stream(clazz.getMethods())
            .filter(method -> method.isAnnotationPresent(UpcallTarget.class))
            .toList();
        if (candidates.isEmpty())
        {
            throw new IllegalArgumentException("Could not find any upcall target: " + clazz);
        }

        if (candidates.size() > 1)
        {
            throw new IllegalArgumentException("Too many upcall target candidates: " + clazz);
        }

        Method target = candidates.getFirst();

        FunctionDescriptor descriptor = this.resolveFunctionDescriptor(target);
        MethodType descriptorType = descriptor.toMethodType();

        MethodHandle stubMaker = MethodHandles.insertArguments(this.m_upcallStub, 1, descriptor);
        stubMaker = MethodHandles.insertArguments(stubMaker, 2, (Object) resolveLinkerOptions(target).toArray(Linker.Option[]::new));
        try
        {
            MethodHandle resolved = publicLookup().unreflect(target);
            if (!isStatic(target.getModifiers()))
            {
                descriptorType = descriptorType.insertParameterTypes(0, resolved.type().parameterType(0));
            }

            resolved = this.m_upcallTransformer.transform(target, descriptorType, resolved);
            return isStatic(target.getModifiers())
                ? stubMaker.bindTo(resolved)
                : MethodHandles.filterArguments(stubMaker, 0, METHOD_HANDLE_BIND_TO.bindTo(resolved));
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

    /// Computes the upcall factory method if never encountered and returns a function pointer to it.
    /// @param arena The scope associated with the function pointer.
    /// @param clazz The class containing the upcall target.
    /// @param instance The instance to bind the method handle to.
    /// @return A function pointer to the target bound to the given instance.
    /// @throws IllegalArgumentException If any resolving failed.
    @Override
    public <T> MemorySegment dispatch(Arena arena, Class<? super T> clazz, T instance)
    {
        try
        {
            MethodHandle factory = this.m_upcallCache.get(clazz, this::resolveUpcallMaker);
            if (factory.type().parameterCount() != 2)
            {
                throw new IllegalArgumentException("The upcall target is not virtual.");
            }

            return (MemorySegment) factory.invoke(instance, arena);
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    /// Static version of [#dispatch(Arena, Class, Object)].
    @Override
    public MemorySegment dispatch(Arena arena, Class<?> clazz)
    {
        try
        {
            MethodHandle factory = this.m_upcallCache.get(clazz, this::resolveUpcallMaker);
            if (factory.type().parameterCount() != 1)
            {
                throw new IllegalArgumentException("The upcall target is not static.");
            }

            return (MemorySegment) this.m_upcallCache.get(clazz, this::resolveUpcallMaker).invoke(arena);
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    static
    {
        // Linker has restricted access
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
