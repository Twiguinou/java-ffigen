package fr.kenlek.jpgen.api.dynload;

import java.lang.classfile.ClassFile;
import java.lang.classfile.TypeKind;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.DirectMethodHandleDesc;
import java.lang.constant.DynamicConstantDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.classfile.ClassFile.ACC_PUBLIC;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.reflect.AccessFlag.*;

public final class NativeProxies
{private NativeProxies() {}

    private static final ClassDesc CLASS_DESC = NativeProxies.class.describeConstable().orElseThrow();
    private static final DirectMethodHandleDesc BOOTSTRAP_DOWNCALL_HANDLE_MTD_DESC = ConstantDescs.ofConstantBootstrap(
        CLASS_DESC, "bootstrapDowncallHandle", CD_MethodHandle, CD_int
    );

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

        ClassDesc classDescriptor = ClassDesc.of(methodLookup.lookupClass().getPackageName(), interfaceClass.getSimpleName().concat("$NPI$"));
        byte[] classBytes = ClassFile.of().build(classDescriptor, classBuilder ->
        {
            classBuilder.withFlags(PUBLIC, FINAL);
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
}
