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
import java.lang.invoke.MethodType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
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

        synchronized V get(Class<?> clazz, Function<Class<?>, V> factory)
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

    private static MethodTypeDesc createMethodDescriptor(ClassDesc returnTypeDesc, Executable executable)
    {
        return MethodTypeDesc.of(
            returnTypeDesc,
            Arrays.stream(executable.getParameterTypes())
                .map(clazz -> clazz.describeConstable().orElseThrow())
                .toList()
        );
    }

    /// A bootstrap method for creating downcall handles.
    /// @deprecated This method is intended to be used internally to create downcall method handles.
    @Deprecated
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
        MethodType expectedMethodType = methodType(method.getReturnType(), method.getParameterTypes());
        if (!handle.type().equals(expectedMethodType))
        {
            throw new IllegalArgumentException("The provided method handle does not match the parent method type: expected %s got %s"
                .formatted(expectedMethodType, handle.type()));
        }

        return handle;
    }

    /// Generate a proxy class which fully implements the given abstract or interface prototype class.
    /// @param classLookup The class lookup used to load the generated proxy class. It must have full privilege access.
    /// @param clazz The abstract or interface class to implement.
    /// @param dispatcher The dispatcher used to generate downcalls.
    /// @param <T> The generated proxy class extends this type.
    /// @return A proxy class which implements all abstract methods of the given class.
    /// @throws IllegalArgumentException if the provided class is neither an interface nor abstract.
    /// @throws IllegalArgumentException if an abstract method annotated with [Dispatcher] is not void or does not return
    /// a type assignable from the initialization downcall dispatcher.
    @SuppressWarnings("unchecked")
    public static <T> Class<? extends T> implement(MethodHandles.Lookup classLookup, Class<T> clazz, DowncallDispatcher dispatcher)
    {
        if (clazz.isAnnotation() || !(clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())))
        {
            throw new IllegalArgumentException("Input class must be abstract or an interface.");
        }

        if (clazz.isSealed())
        {
            throw new IllegalArgumentException("Input class must not be sealed.");
        }


        List<Method> implementedMethods = new ArrayList<>();

        ClassDesc superclassDesc = clazz.describeConstable().orElseThrow();
        ClassDesc classDescriptor = ClassDesc.of(classLookup.lookupClass().getPackageName(), clazz.getSimpleName() + "$NPI$");
        byte[] classBytes = ClassFile.of().build(classDescriptor, classBuilder ->
        {
            classBuilder.withFlags(ACC_PUBLIC | ACC_FINAL);
            if (clazz.isInterface())
            {
                classBuilder.withSuperclass(CD_Object);
                classBuilder.withInterfaceSymbols(superclassDesc);

                classBuilder.withMethodBody(INIT_NAME, MTD_void, ACC_PUBLIC, codeBuilder -> codeBuilder
                    .aload(0)
                    .invokespecial(CD_Object, INIT_NAME, MTD_void, false)
                    .return_()
                );
            }
            else
            {
                classBuilder.withSuperclass(superclassDesc);

                for (Constructor<?> constructor : clazz.getDeclaredConstructors())
                {
                    if (Modifier.isPrivate(constructor.getModifiers()))
                    {
                        continue;
                    }

                    MethodTypeDesc constructorDesc = createMethodDescriptor(CD_void, constructor);
                    classBuilder.withMethodBody(INIT_NAME, constructorDesc, ACC_PUBLIC, codeBuilder ->
                    {
                        codeBuilder.aload(0);
                        for (int i = 0; i < constructorDesc.parameterCount(); i++)
                        {
                            codeBuilder.loadLocal(TypeKind.from(constructorDesc.parameterType(i)), codeBuilder.parameterSlot(i));
                        }

                        codeBuilder.invokespecial(superclassDesc, INIT_NAME, constructorDesc, false);
                        codeBuilder.return_();
                    });
                }
            }

            for (Method method : clazz.getMethods())
            {
                if (!Modifier.isAbstract(method.getModifiers()))
                {
                    continue;
                }

                int visibility = Modifier.isPublic(method.getModifiers()) ? ACC_PUBLIC : ACC_PROTECTED;
                MethodTypeDesc methodDesc = createMethodDescriptor(method.getReturnType().describeConstable().orElseThrow(), method);
                classBuilder.withMethodBody(method.getName(), methodDesc, visibility, codeBuilder ->
                {
                    codeBuilder.loadConstant(DynamicConstantDesc.of(BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC, implementedMethods.size()));
                    for (int i = 0; i < methodDesc.parameterCount(); i++)
                    {
                        codeBuilder.loadLocal(TypeKind.from(methodDesc.parameterType(i)), codeBuilder.parameterSlot(i));
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
            return (Class<? extends T>) classLookup.defineHiddenClassWithClassData(classBytes, classData, true).lookupClass();
        }
        catch (Throwable t)
        {
            throw new RuntimeException(t);
        }
    }

    /// This method is a shortcut to implement and instantiate a prototype class.
    /// @param classLookup The class lookup used to load the generated proxy class. It must have full privilege access.
    /// @param clazz The abstract or interface class to implement.
    /// @param dispatcher The dispatcher used to generate downcalls.
    /// @param <T> The generated proxy class extends this type.
    /// @return An implementing instance of the given prototype.
    public static <T> T instantiate(MethodHandles.Lookup classLookup, Class<? extends T> clazz, DowncallDispatcher dispatcher)
    {
        try
        {
            return implement(classLookup, clazz, dispatcher).getDeclaredConstructor().newInstance();
        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e)
        {
            throw new RuntimeException(e);
        }
    }

    /// This method is a shortcut to generate a proxy class with the default method lookup.
    /// @param clazz The abstract or interface class to implement.
    /// @param dispatcher The dispatcher used to generate downcalls.
    /// @param <T> The generated proxy class extends this type.
    /// @return A proxy class which implements all abstract methods of the given class.
    public static <T> Class<? extends T> implement(Class<T> clazz, DowncallDispatcher dispatcher)
    {
        return implement(MethodHandles.lookup(), clazz, dispatcher);
    }

    /// This method is a shortcut to implement and instantiate a prototype class with the default method lookup.
    /// @param clazz The abstract or interface class to implement.
    /// @param dispatcher The dispatcher used to generate downcalls.
    /// @param <T> The generated proxy class extends this type.
    /// @return An implementing instance of the given prototype.
    public static <T> T instantiate(Class<? extends T> clazz, DowncallDispatcher dispatcher)
    {
        return instantiate(MethodHandles.lookup(), clazz, dispatcher);
    }

    public static MethodHandle findGroupWrapper(MethodHandles.Lookup lookup, Class<?> clazz)
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

    public static MethodHandle findGroupUnwrapper(MethodHandles.Lookup lookup, Class<?> clazz)
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

    /// Generate an upcall stub of the given object using annotations to resolve layouts and transformations.
    ///
    /// This method caches the result of translation for each class.
    /// @param lookup The lookup used to wrap and unwrap [Addressable] types.
    /// @param clazz The class of the upcall target.
    /// @param linker The linker responsible for generating the original upcall stub.
    /// @param callable The receiver object.
    /// @param arena An arena and its scope to place the upcall in.
    /// @param options Optional upcall linker options.
    /// @return A function pointer to an upcall stub on the receiver.
    /// @throws IllegalArgumentException If no method annotated with [UpcallTarget] was found.
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

    @Deprecated @SuppressWarnings("DeprecatedIsStillUsed")
    public static boolean intToBoolean(int i)
    {
        return i != 0;
    }

    @Deprecated @SuppressWarnings("DeprecatedIsStillUsed")
    public static int booleanToInt(boolean b)
    {
        return b ? 1 : 0;
    }

    static
    {
        ClassDesc CD_NativeProxies = NativeProxies.class.describeConstable().orElseThrow();
        BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC = ConstantDescs.ofConstantBootstrap(
            CD_NativeProxies, "bootstrapDowncallHandle", CD_MethodHandle, CD_int
        );
    }
}
