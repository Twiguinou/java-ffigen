package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.methodType;
import static java.lang.reflect.Modifier.isAbstract;

public final class NativeProxies
{private NativeProxies() {}

    private static final DirectMethodHandleDesc BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC;
    static final MethodHandle INT_TO_BOOLEAN, BOOLEAN_TO_INT;

    static MethodType methodDescriptor(Method method)
    {
        return methodType(method.getReturnType(), method.getParameterTypes());
    }

    @Deprecated @SuppressWarnings("unused")
    public static MethodHandle bootstrapDowncallHandle(MethodHandles.Lookup lookup, String name, Class<?> clazz, int index)
    {
        try
        {
            DowncallDispatcher dispatcher = classDataAt(lookup, DEFAULT_NAME, DowncallDispatcher.class, 0);
            Method method = classDataAt(lookup, DEFAULT_NAME, Method.class, 1 + index);

            MethodHandle handle = dispatcher.dispatch(method);
            MethodType expectedMethodType = methodDescriptor(method);
            if (!handle.type().equals(expectedMethodType))
            {
                throw new IllegalArgumentException("The provided method handle does not match the parent method type: expected %s got %s"
                    .formatted(expectedMethodType, handle.type())
                );
            }

            return handle;
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T make(MethodHandles.Lookup lookup, Class<? extends T> clazz, DowncallDispatcher dispatcher)
    {
        if (clazz.isAnnotation() || !clazz.isInterface())
        {
            throw new IllegalArgumentException("Input class must be an interface.");
        }

        if (clazz.isSealed())
        {
            throw new IllegalArgumentException("Input class must not be sealed.");
        }

        List<Method> generated = Arrays.stream(clazz.getMethods())
            .filter(method -> isAbstract(method.getModifiers()))
            .toList();

        ClassDesc superclassDesc = clazz.describeConstable().orElseThrow();
        ClassDesc classDescriptor = ClassDesc.of(lookup.lookupClass().getPackageName(), clazz.getSimpleName() + "$NativeProxyImplementation$");
        byte[] bytecode = ClassFile.of().build(classDescriptor, classFile ->
        {
            classFile.withFlags(ACC_PRIVATE | ACC_FINAL);
            classFile.withSuperclass(CD_Object);
            classFile.withInterfaceSymbols(superclassDesc);

            classFile.withMethodBody(INIT_NAME, MTD_void, ACC_PRIVATE, code -> code
                .aload(0)
                .invokespecial(CD_Object, INIT_NAME, MTD_void)
                .return_()
            );

            for (ListIterator<Method> iterator = generated.listIterator(); iterator.hasNext();)
            {
                int index = iterator.nextIndex();
                Method method = iterator.next();

                MethodTypeDesc methodType = methodDescriptor(method).describeConstable().orElseThrow();
                classFile.withMethodBody(method.getName(), methodType, ACC_PUBLIC, code ->
                {
                    code.loadConstant(DynamicConstantDesc.of(BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC, index));
                    for (int i = 0; i < methodType.parameterCount(); i++)
                    {
                        code.loadLocal(TypeKind.from(methodType.parameterType(i)), code.parameterSlot(i));
                    }

                    code.invokevirtual(CD_MethodHandle, "invokeExact", methodType);
                    code.return_(TypeKind.from(methodType.returnType()));
                });
            }
        });

        try
        {
            MethodHandles.Lookup proxyLookup = lookup.defineHiddenClassWithClassData(bytecode, Stream.concat(
                Stream.of(dispatcher),
                generated.stream()
            ).toList(), true);
            return (T) proxyLookup.findConstructor(proxyLookup.lookupClass(), methodType(void.class)).invoke();
        }
        catch (Throwable e)
        {
            throw new RuntimeException(e);
        }
    }

    static MethodHandle findGroupWrapper(MethodHandles.Lookup lookup, Class<?> clazz)
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
    }

    static MethodHandle findGroupUnwrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        try
        {
            return lookup.findVirtual(clazz, "pointer", methodType(MemorySegment.class));
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
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
        BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC = ConstantDescs.ofConstantBootstrap(
            NativeProxies.class.describeConstable().orElseThrow(), "bootstrapDowncallHandle", CD_MethodHandle, CD_int
        );

        MethodHandles.Lookup lookup = publicLookup();
        try
        {
            INT_TO_BOOLEAN = lookup.findStatic(NativeProxies.class, "intToBoolean", methodType(boolean.class, int.class));
            BOOLEAN_TO_INT = lookup.findStatic(NativeProxies.class, "booleanToInt", methodType(int.class, boolean.class));
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
