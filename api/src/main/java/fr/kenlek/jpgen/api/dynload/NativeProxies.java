package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Annotation;
import java.lang.classfile.ClassFile;
import java.lang.classfile.TypeKind;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.DirectMethodHandleDesc;
import java.lang.constant.DynamicConstantDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
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

    private static Optional<MemoryLayout> resolveLayout(Class<?> clazz)
    {
        if (clazz == byte.class) return Optional.of(JAVA_BYTE);
        if (clazz == short.class) return Optional.of(JAVA_SHORT);
        if (clazz == char.class) return Optional.of(JAVA_CHAR);
        if (clazz == int.class) return Optional.of(JAVA_INT);
        if (clazz == long.class) return Optional.of(JAVA_LONG);
        if (clazz == float.class) return Optional.of(JAVA_FLOAT);
        if (clazz == double.class) return Optional.of(JAVA_DOUBLE);
        if (clazz == MemorySegment.class) return Optional.of(UNBOUNDED_POINTER);

        return Optional.empty();
    }

    private static MemoryLayout resolveLayout(ProxyConfiguration configuration, Class<?> clazz, Annotation[] annotations)
    {
        return Arrays.stream(annotations)
            .filter(Layout.class::isInstance)
            .map(annotation -> configuration.layout(((Layout)annotation).value()))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .or(() -> configuration.layout(clazz))
            .or(() -> resolveLayout(clazz))
            .orElseThrow(() -> new IllegalArgumentException("Unable to resolve memory layout for class: ".concat(clazz.toString())));
    }

    @SafeVarargs
    private static void checkAnnotationConflict(Predicate<Class<? extends Annotation>> predicate, Class<? extends Annotation>... classes)
    {
        List<Class<? extends Annotation>> present = Arrays.stream(classes)
            .filter(predicate)
            .toList();
        if (present.size() > 1)
        {
            throw new IllegalArgumentException("Conflicting annotations found: ".concat(present.toString()));
        }
    }

    private static MemoryLayout[] resolveLayouts(ProxyConfiguration configuration, Parameter[] parameters, boolean skipFirst)
    {
        return Arrays.stream(parameters)
            .skip(skipFirst ? 1 : 0)
            .peek(parameter -> checkAnnotationConflict(parameter::isAnnotationPresent, Discard.class, Layout.class))
            .filter(parameter -> !parameter.isAnnotationPresent(Discard.class))
            .map(parameter -> resolveLayout(configuration, parameter.getType(), parameter.getAnnotations()))
            .toArray(MemoryLayout[]::new);
    }

    public static MethodHandle bootstrapDowncallHandle(MethodHandles.Lookup methodLookup, String name, Class<?> typeClass, int index)
    {
        ProxyConfiguration configuration;
        Method method;
        try
        {
            configuration = MethodHandles.classDataAt(methodLookup, DEFAULT_NAME, ProxyConfiguration.class, 0);
            method = MethodHandles.classDataAt(methodLookup, DEFAULT_NAME, Method.class, 1 + index);
        }
        catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        Parameter[] parameters = method.getParameters();

        FunctionDescriptor descriptor;
        checkAnnotationConflict(method::isAnnotationPresent, Discard.class, Layout.class);
        if (method.isAnnotationPresent(Discard.class) || (method.getReturnType() == void.class && ! method.isAnnotationPresent(Layout.class)))
        {
            descriptor = FunctionDescriptor.ofVoid(resolveLayouts(configuration, method.getParameters(), false));
        }
        else
        {
            MemoryLayout returnLayout = resolveLayout(configuration, method.getReturnType(), method.getAnnotations());
            if (returnLayout instanceof GroupLayout && !method.isAnnotationPresent(IgnoreAllocator.class))
            {
                if (parameters.length == 0 || parameters[0].getType() != SegmentAllocator.class)
                {
                    throw new IllegalArgumentException("The first parameter of a composite returning function must be of SegmentAllocator type.");
                }

                descriptor = FunctionDescriptor.of(returnLayout, resolveLayouts(configuration, parameters, true));
            }
            else
            {
                descriptor = FunctionDescriptor.of(returnLayout, resolveLayouts(configuration, parameters, false));
            }
        }

        List<Linker.Option> options = new ArrayList<>();
        Optional.ofNullable(method.getAnnotation(Critical.class))
            .ifPresent(cs -> options.add(Linker.Option.critical(cs.value())));

        String target = Optional.ofNullable(method.getAnnotation(Redirect.class))
            .map(Redirect::value)
            .orElseGet(method::getName);

        List<String> transformationHints = Optional.ofNullable(method.getAnnotation(Transform.class))
            .map(t -> List.of(t.value()))
            .orElseGet(List::of);
        MethodHandle handle = configuration.linker().downcallHandle(configuration.lookup().findOrThrow(target), descriptor, options.toArray(Linker.Option[]::new));
        // We can't use Java streams for a simple foldLeft kind of operation.
        for (String hint : transformationHints)
        {
            handle = configuration.transform(handle, hint);
        }

        return handle;
    }

    @SuppressWarnings("unchecked")
    public static <T> T instantiate(Class<T> interfaceClass, ProxyConfiguration configuration, MethodHandles.Lookup methodLookup)
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
            Stream.of(configuration),
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

    public static <T> T instantiate(Class<T> interfaceClass, ProxyConfiguration configuration) throws ProxyCreationException
    {
        return instantiate(interfaceClass, configuration, MethodHandles.lookup());
    }
}
