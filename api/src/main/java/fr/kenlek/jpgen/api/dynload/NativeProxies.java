package fr.kenlek.jpgen.api.dynload;

import fr.kenlek.jpgen.api.Addressable;

import java.lang.classfile.ClassFile;
import java.lang.classfile.TypeKind;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.DirectMethodHandleDesc;
import java.lang.constant.DynamicConstantDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher.resolveFunctionDescriptor;
import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.invoke.MethodType.methodType;

public final class NativeProxies
{private NativeProxies() {}

    private static final class ClassCache<V>
    {
        final Map<Class<?>, WeakReference<V>> m_storage = new WeakHashMap<>();

        ClassCache() {}

        public synchronized V get(Class<?> clazz, Function<Class<?>, V> factory)
        {
            return Optional.ofNullable(this.m_storage.get(clazz))
                .map(reference -> Optional.ofNullable(reference.get()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .orElseGet(() ->
                {
                    V computed = factory.apply(clazz);
                    this.m_storage.put(clazz, new WeakReference<>(computed));
                    return computed;
                });
        }
    }

    private static final DirectMethodHandleDesc BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC;
    private static final DirectMethodHandleDesc BOOTSTRAP_DISPATCHER_MTD_DESC;

    private static MethodTypeDesc createMethodDescriptor(Method method)
    {
        return MethodTypeDesc.of(
            method.getReturnType().describeConstable().orElseThrow(),
            Arrays.stream(method.getParameterTypes())
                .map(clazz -> clazz.describeConstable().orElseThrow())
                .toList()
        );
    }

    public static MethodHandle bootstrapDowncallHandle(MethodHandles.Lookup classLookup, String name, Class<?> typeClass, int index)
    {
        DowncallDispatcher dispatcher;
        Method method;
        try
        {
            dispatcher = MethodHandles.classDataAt(classLookup, DEFAULT_NAME, DowncallDispatcher.class, 0);
            method = MethodHandles.classDataAt(classLookup, DEFAULT_NAME, Method.class, 1 + index);
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        MethodHandle handle = dispatcher.dispatch(method);
        if (!handle.type().equals(methodType(method.getReturnType(), method.getParameterTypes())))
        {
            throw new IllegalArgumentException("The provided method handle does not match the parent method type.");
        }

        return handle;
    }

    public static DowncallDispatcher bootstrapDispatcher(MethodHandles.Lookup classLookup, String name, Class<?> typeClass)
    {
        try
        {
            return MethodHandles.classDataAt(classLookup, DEFAULT_NAME, DowncallDispatcher.class, 0);
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T instantiate(MethodHandles.Lookup classLookup, Class<? extends T> interfaceClass, DowncallDispatcher dispatcher)
    {
        if (interfaceClass.isAnnotation() || !interfaceClass.isInterface())
        {
            throw new IllegalArgumentException("Input class must be an interface.");
        }

        List<Method> implementedMethods = new ArrayList<>();

        ClassDesc classDescriptor = ClassDesc.of(classLookup.lookupClass().getPackageName(), interfaceClass.getSimpleName() + "$NPI$");
        byte[] classBytes = ClassFile.of().build(classDescriptor, classBuilder ->
        {
            classBuilder.withFlags(ACC_PUBLIC | ACC_FINAL);
            classBuilder.withSuperclass(CD_Object);
            classBuilder.withInterfaceSymbols(interfaceClass.describeConstable().orElseThrow());

            classBuilder.withMethodBody(INIT_NAME, MTD_void, ACC_PUBLIC, codeBuilder -> codeBuilder
                .aload(0)
                .invokespecial(CD_Object, INIT_NAME, MTD_void, false)
                .return_()
            );

            for (Method method : interfaceClass.getMethods())
            {
                if (!Modifier.isAbstract(method.getModifiers()))
                {
                    continue;
                }

                MethodTypeDesc methodDesc = createMethodDescriptor(method);

                if (method.isAnnotationPresent(Dispatcher.class))
                {
                    if (method.getParameterCount() != 0 || !method.getReturnType().isAssignableFrom(dispatcher.getClass()))
                    {
                        throw new IllegalArgumentException("Invalid dispatcher query method descriptor: " + method);
                    }

                    DynamicConstantDesc<MethodHandle> dispatcherConstant = DynamicConstantDesc.ofNamed(
                        BOOTSTRAP_DISPATCHER_MTD_DESC, method.getName(), DowncallDispatcher.class.describeConstable().orElseThrow()
                    );
                    classBuilder.withMethodBody(method.getName(), methodDesc, ACC_PUBLIC, codeBuilder -> codeBuilder
                        .ldc(dispatcherConstant)
                        .areturn()
                    );

                    continue;
                }

                DynamicConstantDesc<MethodHandle> handleConstant = DynamicConstantDesc.ofNamed(
                    BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC, method.getName(), CD_MethodHandle,
                    implementedMethods.size()
                );
                classBuilder.withMethodBody(method.getName(), methodDesc, ACC_PUBLIC, codeBuilder ->
                {
                    codeBuilder.ldc(handleConstant);

                    for (int j = 0; j < methodDesc.parameterCount(); j++)
                    {
                        codeBuilder.loadLocal(TypeKind.from(methodDesc.parameterType(j)), codeBuilder.parameterSlot(j));
                    }

                    codeBuilder.invokevirtual(CD_MethodHandle, "invokeExact", methodDesc);
                    codeBuilder.return_(TypeKind.from(methodDesc.returnType()));
                });

                implementedMethods.add(method);
            }
        });

        List<Object> classData = Stream.concat(
            Stream.of(dispatcher),
            implementedMethods.stream()
        ).toList();

        try
        {
            return (T) classLookup.defineHiddenClassWithClassData(classBytes, classData, true)
                .lookupClass()
                .getDeclaredConstructor()
                .newInstance();
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    public static <T> T instantiate(Class<T> interfaceClass, DowncallDispatcher dispatcher)
    {
        return instantiate(MethodHandles.lookup(), interfaceClass, dispatcher);
    }

    static MethodHandle findGroupWrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        final class Container
        {
            static final ClassCache<MethodHandle> CACHE = new ClassCache<>();
        }

        return Container.CACHE.get(clazz, _ ->
        {
            try
            {
                return lookup.findConstructor(clazz, methodType(void.class, MemorySegment.class));
            }
            catch (NoSuchMethodException _)
            {
                throw new RuntimeException("Unable to find a wrapping constructor for: " + clazz);
            }
            catch (IllegalAccessException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    static MethodHandle findGroupUnwrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        final class Container
        {
            static final ClassCache<MethodHandle> CACHE = new ClassCache<>();
        }

        return Container.CACHE.get(clazz, _ ->
        {
            try
            {
                return lookup.findVirtual(clazz, "pointer", methodType(MemorySegment.class));
            }
            catch (NoSuchMethodException | IllegalAccessException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public static <T> MemorySegment upcall(MethodHandles.Lookup lookup, Class<T> clazz, Linker linker, T callable, Arena arena, Linker.Option... options)
    {
        final class Container
        {
            static final MethodHandle LINKER_UPCALL_STUB, METHOD_HANDLE_BIND_TO;
            static final ClassCache<MethodHandle> CACHE = new ClassCache<>();

            static
            {
                MethodHandles.Lookup instrinsicLookup = MethodHandles.lookup();
                try
                {
                    LINKER_UPCALL_STUB = instrinsicLookup.findVirtual(
                        Linker.class, "upcallStub",
                        methodType(MemorySegment.class, MethodHandle.class, FunctionDescriptor.class, Arena.class, Linker.Option[].class)
                    );
                    METHOD_HANDLE_BIND_TO = instrinsicLookup.findVirtual(
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

        MethodHandle handle = Container.CACHE.get(clazz, _ ->
        {
            Method target = Arrays.stream(clazz.getMethods())
                .filter(method -> method.isAnnotationPresent(UpcallTarget.class))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Could not find any upcall target in " + clazz));

            try
            {
                MethodHandle resolved = lookup.unreflect(target);
                // that way the first parameter is always the caller object, or null if there is none
                if (Modifier.isStatic(target.getModifiers()))
                {
                    resolved = MethodHandles.dropArguments(resolved, 0, clazz);
                }

                FunctionDescriptor descriptor = resolveFunctionDescriptor(linker, target);
                if (Addressable.class.isAssignableFrom(target.getReturnType()))
                {
                    resolved = MethodHandles.filterReturnValue(resolved, findGroupUnwrapper(lookup, target.getReturnType()));
                }

                Class<?>[] parameterTypes = target.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++)
                {
                    if (!Addressable.class.isAssignableFrom(parameterTypes[i]))
                    {
                        continue;
                    }

                    resolved = MethodHandles.filterArguments(resolved, i + 1, findGroupWrapper(lookup, parameterTypes[i]));
                }

                resolved = MethodHandles.explicitCastArguments(resolved, descriptor.toMethodType().insertParameterTypes(0, clazz));

                MethodHandle stubMaker = MethodHandles.insertArguments(Container.LINKER_UPCALL_STUB, 2, descriptor);
                // linker, handle, arena, options
                // that way the corresponding function descriptor is cached for every subsequent upcall stub
                // then we replace the first argument with the receiving instance
                stubMaker = MethodHandles.filterArguments(stubMaker, 1, Container.METHOD_HANDLE_BIND_TO.bindTo(resolved));

                return stubMaker;
            }
            catch (IllegalAccessException e)
            {
                throw new RuntimeException(e);
            }
        });

        try
        {
            return (MemorySegment) handle.invokeExact(linker, callable, arena, options);
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    public static <T> MemorySegment upcall(MethodHandles.Lookup lookup, Class<T> clazz, T callable, Arena arena, Linker.Option... options)
    {
        return upcall(lookup, clazz, SYSTEM_LINKER, callable, arena, options);
    }

    public static <T> MemorySegment upcall(Class<T> clazz, T callable, Arena arena, Linker.Option... options)
    {
        return upcall(MethodHandles.publicLookup(), clazz, callable, arena, options);
    }

    static
    {
        ClassDesc CD_NativeProxies = NativeProxies.class.describeConstable().orElseThrow();
        ClassDesc CD_DowncallDispatcher = DowncallDispatcher.class.describeConstable().orElseThrow();
        BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC = ConstantDescs.ofConstantBootstrap(
            CD_NativeProxies, "bootstrapDowncallHandle", CD_MethodHandle, CD_int
        );
        BOOTSTRAP_DISPATCHER_MTD_DESC = ConstantDescs.ofConstantBootstrap(
            CD_NativeProxies, "bootstrapDispatcher", CD_DowncallDispatcher
        );
    }
}
