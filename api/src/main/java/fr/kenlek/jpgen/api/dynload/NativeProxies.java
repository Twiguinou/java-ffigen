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
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessFlag;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher.resolveTypeLayout;
import static java.lang.classfile.ClassFile.ACC_PUBLIC;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.invoke.MethodType.methodType;

public final class NativeProxies
{private NativeProxies() {}

    private static final ClassDesc CLASS_DESC = NativeProxies.class.describeConstable().orElseThrow();
    private static final DirectMethodHandleDesc BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC = ConstantDescs.ofConstantBootstrap(
        CLASS_DESC, "bootstrapDowncallHandle", CD_MethodHandle, CD_int
    );
    private static final Map<Class<?>, WeakReference<MethodHandle>> TARGET_CACHE = new WeakHashMap<>();
    private static final Map<Class<?>, WeakReference<MethodHandle>> WRAPPER_CACHE = new WeakHashMap<>();
    private static final Map<Class<?>, WeakReference<MethodHandle>> UNWRAPPER_CACHE = new WeakHashMap<>();

    private static MethodTypeDesc createMethodDescriptor(Method method)
    {
        return MethodTypeDesc.of(
            method.getReturnType().describeConstable().orElseThrow(),
            Arrays.stream(method.getParameterTypes())
                .map(clazz -> clazz.describeConstable().orElseThrow())
                .toList()
        );
    }

    public static MethodHandle bootstrapDowncallHandle(MethodHandles.Lookup methodLookup, String name, Class<?> typeClass, int index)
    {
        DowncallDispatcher dispatcher;
        Method method;
        try
        {
            dispatcher = MethodHandles.classDataAt(methodLookup, DEFAULT_NAME, DowncallDispatcher.class, 0);
            method = MethodHandles.classDataAt(methodLookup, DEFAULT_NAME, Method.class, 1 + index);
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        return dispatcher.dispatch(method);
    }

    @SuppressWarnings("unchecked")
    public static <T> T instantiate(Class<? extends T> interfaceClass, DowncallDispatcher dispatcher, MethodHandles.Lookup methodLookup)
        throws ProxyCreationException
    {
        if (interfaceClass.isAnnotation() || !interfaceClass.isInterface())
        {
            throw new IllegalArgumentException("Input class must be an interface.");
        }

        List<Method> implementedMethods = new ArrayList<>();

        ClassDesc classDescriptor = ClassDesc.of(methodLookup.lookupClass().getPackageName(), interfaceClass.getSimpleName() + "$NPI$");
        byte[] classBytes = ClassFile.of().build(classDescriptor, classBuilder ->
        {
            classBuilder.withFlags(AccessFlag.PUBLIC, AccessFlag.FINAL);
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
            return (T) methodLookup.defineHiddenClassWithClassData(classBytes, classData, true)
                .lookupClass()
                .getDeclaredConstructor()
                .newInstance();
        }
        catch (Throwable t)
        {
            throw new ProxyCreationException(t);
        }
    }

    public static <T> T instantiate(Class<T> interfaceClass, DowncallDispatcher dispatcher) throws ProxyCreationException
    {
        return instantiate(interfaceClass, dispatcher, MethodHandles.lookup());
    }

    static MethodHandle findGroupWrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        synchronized (WRAPPER_CACHE)
        {
            return Optional.ofNullable(WRAPPER_CACHE.get(clazz))
                .map(reference -> Optional.ofNullable(reference.get()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .orElseGet(() ->
                {
                    try
                    {
                        MethodHandle handle = lookup.findConstructor(clazz, methodType(void.class, MemorySegment.class));
                        WRAPPER_CACHE.put(clazz, new WeakReference<>(handle));
                        return handle;
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
    }

    static MethodHandle findGroupUnwrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        synchronized (UNWRAPPER_CACHE)
        {
            return Optional.ofNullable(UNWRAPPER_CACHE.get(clazz))
                .map(reference -> Optional.ofNullable(reference.get()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .orElseGet(() ->
                {
                    try
                    {
                        MethodHandle handle = lookup.findVirtual(clazz, "pointer", methodType(MemorySegment.class));
                        UNWRAPPER_CACHE.put(clazz, new WeakReference<>(handle));
                        return handle;
                    }
                    catch (NoSuchMethodException | IllegalAccessException e)
                    {
                        throw new RuntimeException(e);
                    }
                });
        }
    }

    private static FunctionDescriptor resolveUpcallDescriptor(Linker linker, Method method)
    {
        List<Parameter> parameters = Arrays.asList(method.getParameters());

        MemoryLayout[] parameterLayouts = parameters.stream()
            .map(parameter -> resolveTypeLayout(linker, new LinkingDowncallDispatcher.ParameterLayoutRequest(method, parameter)))
            .toArray(MemoryLayout[]::new);

        if (!method.getReturnType().equals(void.class))
        {
            return FunctionDescriptor.of(resolveTypeLayout(linker, new LinkingDowncallDispatcher.ReturnTypeLayoutRequest(method)), parameterLayouts);
        }

        return FunctionDescriptor.ofVoid(parameterLayouts);
    }

    public static <T> MemorySegment upcall(MethodHandles.Lookup lookup, Class<T> clazz, Linker linker, T callable, Arena arena, Linker.Option... options)
    {
        class Container
        {
            static final MethodHandle LINKER_UPCALL_STUB, METHOD_HANDLE_BIND_TO;

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

        synchronized (TARGET_CACHE)
        {
            MethodHandle handle = Optional.ofNullable(TARGET_CACHE.get(clazz))
                .map(reference -> Optional.ofNullable(reference.get()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .orElseGet(() ->
                {
                    for (Method method : clazz.getMethods())
                    {
                        if (!method.isAnnotationPresent(UpcallTarget.class))
                        {
                            continue;
                        }

                        try
                        {
                            MethodHandle resolved = lookup.unreflect(method);
                            if (Modifier.isStatic(method.getModifiers()))
                            {
                                resolved = MethodHandles.dropArguments(resolved, 0, clazz);
                            }

                            FunctionDescriptor descriptor = resolveUpcallDescriptor(linker, method);
                            if (Addressable.class.isAssignableFrom(method.getReturnType()))
                            {
                                resolved = MethodHandles.filterReturnValue(resolved, findGroupUnwrapper(lookup, method.getReturnType()));
                            }

                            Class<?>[] parameterTypes = method.getParameterTypes();
                            // skip the first parameter
                            for (int i = 1; i < parameterTypes.length; i++)
                            {
                                if (!Addressable.class.isAssignableFrom(parameterTypes[i]))
                                {
                                    continue;
                                }

                                resolved = MethodHandles.filterArguments(resolved, i, findGroupWrapper(lookup, parameterTypes[i]));
                            }

                            resolved = MethodHandles.explicitCastArguments(resolved, descriptor.toMethodType().insertParameterTypes(0, clazz));

                            MethodHandle stubMaker = MethodHandles.insertArguments(Container.LINKER_UPCALL_STUB, 2, descriptor);
                            // linker, handle, arena, options
                            // that way the corresponding function descriptor is cached for every subsequent upcall stub
                            // then we replace the first argument with the receiving instance
                            stubMaker = MethodHandles.filterArguments(stubMaker, 1, Container.METHOD_HANDLE_BIND_TO.bindTo(resolved));

                            TARGET_CACHE.put(clazz, new WeakReference<>(stubMaker));
                            return stubMaker;
                        }
                        catch (IllegalAccessException _) {}
                    }

                    throw new RuntimeException("Unable to resolve upcall target for " + callable.getClass());
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
    }

    public static <T> MemorySegment upcall(MethodHandles.Lookup lookup, Class<T> clazz, T callable, Arena arena, Linker.Option... options)
    {
        return upcall(lookup, clazz, SYSTEM_LINKER, callable, arena, options);
    }

    public static <T> MemorySegment upcall(Class<T> clazz, T callable, Arena arena, Linker.Option... options)
    {
        return upcall(MethodHandles.publicLookup(), clazz, callable, arena, options);
    }
}
