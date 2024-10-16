package fr.kenlek.jpgen;

import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.EnumConstantHint;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.TypeLocationHint;
import fr.kenlek.jpgen.data.TypeOperationHint;
import fr.kenlek.jpgen.data.LayoutReferenceHint;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.EnumType;
import fr.kenlek.jpgen.data.FunctionType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.WriteLocation;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ClassMaker
{
    public static final String VALUE_LAYOUT = "java.lang.foreign.ValueLayout";
    public static final String MEMORY_LAYOUT = "java.lang.foreign.MemoryLayout";
    public static final String SEQUENCE_LAYOUT = "java.lang.foreign.SequenceLayout";
    public static final String FUNCTION_DESCRIPTOR = "java.lang.foreign.FunctionDescriptor";
    public static final String METHOD_HANDLE = "java.lang.invoke.MethodHandle";
    public static final String FOREIGN_UTILS = "fr.kenlek.jpgen.ForeignUtils";
    public static final String UNBOUNDED_POINTER = String.format("%s.UNBOUNDED_POINTER", FOREIGN_UTILS);
    public static final String MEMORY_SEGMENT = "java.lang.foreign.MemorySegment";
    public static final String ARENA = "java.lang.foreign.Arena";
    public static final String STRUCT_LAYOUT = "java.lang.foreign.StructLayout";
    public static final String UNION_LAYOUT = "java.lang.foreign.UnionLayout";
    public static final String SEGMENT_ALLOCATOR = "java.lang.foreign.SegmentAllocator";
    public static final String CONSUMER = "java.util.function.Consumer";
    public static final String THROWABLE = "java.lang.Throwable";
    public static final String ASSERTION_ERROR = "java.lang.AssertionError";
    public static final String LAYOUT_DATA = "fr.kenlek.jpgen.LayoutData";
    public static final String LIST = "java.util.List";

    private final Declaration.Layouts m_layouts;
    private final LayoutReferenceHint.Descriptor m_descriptorReference;
    private final LayoutReferenceHint.Physical m_physicalReference;

    public ClassMaker(Declaration.Layouts layouts)
    {
        this.m_layouts = layouts;
        this.m_descriptorReference = new LayoutReferenceHint.Descriptor(this.m_layouts.path());
        this.m_physicalReference = new LayoutReferenceHint.Physical(this.m_layouts.path());
    }

    private static String makeJavaParameters(TypeLocationHint hint, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> String.format("%s %s", parameter.type().process(hint), parameter.name()))
                .collect(Collectors.joining(", "));
    }

    private static String processParameters(TypeOperationHint.Kind kind, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> parameter.type().process(new TypeOperationHint(kind, parameter.name())))
                .collect(Collectors.joining(", "));
    }

    public static Declaration.JavaPath emitClassPrefix(PrintingContext context, Declaration declaration) throws IOException
    {
        context.breakLine("/* Automatically generated source file, do not edit! */");
        Declaration.JavaPath path = declaration.path();
        if (!path.parent().isEmpty())
        {
            context.breakLine("package %s;", path.parent());
            context.breakLine();
        }

        return path;
    }

    public static void makeEnum(PrintingContext context, EnumType.Decl declaration) throws IOException
    {
        String typeString = declaration.process(TypeLocationHint.ENUM_CONSTANT);
        Declaration.JavaPath path = emitClassPrefix(context, declaration);

        context.breakLine("public final class %s", path.name());
        context.breakLine("{private %s() {}", path.name()).pushControlFlow();

        context.breakLine();
        for (EnumType.Constant constant : declaration.constants)
        {
            context.breakLine("public static final %s %s = %s;",
                    typeString, constant.name(), declaration.process(new EnumConstantHint(constant.value())));
        }

        context.popControlFlow().breakLine('}');
    }

    public void makeLayouts(PrintingContext context) throws IOException
    {
        Declaration.JavaPath path = emitClassPrefix(context, this.m_layouts);

        context.breakLine("public final class %s", path.name());
        context.breakLine("{private %s() {}", path.name()).pushControlFlow();

        context.breakLine();
        for (Type type : this.m_layouts.types())
        {
            type.write(context, WriteLocation.Static.LAYOUTS_CLASS);
        }

        context.popControlFlow().breakLine('}');
    }

    private String makeFunctionDescriptor(FunctionType functionType)
    {
        StringBuilder code = new StringBuilder();
        code.append(FUNCTION_DESCRIPTOR);
        if (functionType.isVoid())
        {
            code.append(".ofVoid(");
        }
        else
        {
            code.append(".of(").append(functionType.returnType().process(this.m_descriptorReference));
            if (!functionType.parametersTypes().isEmpty()) code.append(", ");
        }

        code.append(functionType.parametersTypes().stream()
                .map(type -> type.process(this.m_descriptorReference))
                .collect(Collectors.joining(", ")));

        code.append(")");
        return code.toString();
    }

    public void makeCallback(PrintingContext context, CallbackDeclaration declaration) throws IOException
    {
        FunctionType descriptorType = declaration.descriptorType().orElseThrow();
        List<FunctionType.Parameter> parameters = declaration.parameters().orElseThrow();
        boolean redirect = descriptorType.hasTranslatableTypes();
        boolean isVoid = descriptorType.isVoid();

        Declaration.JavaPath path = emitClassPrefix(context, declaration);

        context.breakLine("public interface %s", path.name());
        context.breakLine('{').pushControlFlow();

        context.breakLine("%s %s = %s;", FUNCTION_DESCRIPTOR, declaration.descriptorName,
                this.makeFunctionDescriptor(descriptorType));
        context.breakLine("%s %s = %s.initUpcallStub(%s, \"%s\", %s.class);",
                METHOD_HANDLE, declaration.stubName, FOREIGN_UTILS, declaration.descriptorName,
                redirect ? "_invoke" : "invoke", path.name());

        context.breakLine();
        context.breakLine("%s invoke(%s);",
                descriptorType.returnType().process(TypeLocationHint.CALLBACK),
                makeJavaParameters(TypeLocationHint.CALLBACK, parameters));

        if (redirect)
        {
            context.breakLine();
            context.breakLine("default %s _invoke(%s)",
                    descriptorType.returnType().process(TypeLocationHint.CALLBACK_RAW),
                    makeJavaParameters(TypeLocationHint.CALLBACK_RAW, parameters));
            context.breakLine('{').pushControlFlow();

            String result = String.format("this.invoke(%s)", processParameters(TypeOperationHint.Kind.WRAPPING, parameters));
            if (!isVoid) context.append("return ");
            context.append(descriptorType.returnType().process(new TypeOperationHint(TypeOperationHint.Kind.UNWRAPPING, result)))
                    .breakLine(';');

            context.popControlFlow().breakLine('}');
        }

        context.breakLine();
        context.breakLine("default %s makeHandle(%s arena)", MEMORY_SEGMENT, ARENA);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return %s.SYSTEM_LINKER.upcallStub(%s.bindTo(this), %s, arena);",
                FOREIGN_UTILS, declaration.stubName, declaration.descriptorName);
        context.popControlFlow().breakLine('}');

        context.popControlFlow().breakLine('}');
    }

    public void makeRecord(PrintingContext context, RecordType.Decl declaration) throws IOException
    {
        Declaration.JavaPath path = emitClassPrefix(context, declaration);
        String pointer = String.format("this.%s", declaration.pointerName);
        String layout = declaration.process(this.m_physicalReference);

        context.breakLine("public record %s(%s %s)", path.name(), MEMORY_SEGMENT, declaration.pointerName);
        context.breakLine('{').pushControlFlow();

        context.breakLine("public %s(%s allocator)", path.name(), SEGMENT_ALLOCATOR);
        context.breakLine('{').pushControlFlow();
        context.breakLine("this(allocator.allocate(%s));", layout);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public static %s getAtIndex(%s buffer, long index)", path.name(), MEMORY_SEGMENT);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return new %1$s(buffer.asSlice(index * %2$s.byteSize(), %2$s));", path.name(), layout);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public static void setAtIndex(%s buffer, long index, %s value)", MEMORY_SEGMENT, path.name());
        context.breakLine('{').pushControlFlow();
        context.breakLine("%1$s.copy(value.%2$s, 0, buffer, index * %3$s.byteSize(), %3$s.byteSize());",
                MEMORY_SEGMENT, declaration.pointerName, layout);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public void copyFrom(%s other)", path.name());
        context.breakLine('{').pushControlFlow();
        context.breakLine("%1$s.copy(other.%2$s, 0, %3$s, 0, %4$s.byteSize());",
                MEMORY_SEGMENT, declaration.pointerName, pointer, layout);
        context.popControlFlow().breakLine('}');

        for (int i = 0; i < declaration.members.size(); i++)
        {
            declaration.members.get(i).type().write(context,
                    new WriteLocation.RecordAccess(this.m_layouts.path(), declaration, i));
        }

        context.popControlFlow().breakLine('}');
    }

    public void makeHeader(PrintingContext context, HeaderDeclaration declaration) throws IOException
    {
        Declaration.JavaPath path = emitClassPrefix(context, declaration);

        context.breakLine("public final class %s", path.name());
        context.breakLine("{private %s() {}", path.name()).pushControlFlow();

        if (!declaration.constants().isEmpty())
        {
            context.breakLine();
            for (HeaderDeclaration.Constant constant : declaration.constants())
            {
                context.breakLine("public static final %s %s = %s;",
                        constant.type(), constant.name(), constant.value());
            }
        }

        for (HeaderDeclaration.Binding binding : declaration.bindings())
        {
            FunctionType descriptorType = binding.descriptorType().orElseThrow();
            List<FunctionType.Parameter> parameters = binding.parameters().orElseThrow();
            boolean needsAllocator = descriptorType.hasCompositeReturnType();
            context.breakLine();

            String handle;
            if (binding instanceof HeaderDeclaration.IndirectBinding indirect)
            {
                handle = indirect.handle;
            }
            else
            {
                context.breakLine("public static final %1$s MTD_ADDRESS__%2$s = %3$s.GLOBAL_LOOKUP.findOrThrow(\"%2$s\");",
                        MEMORY_SEGMENT, binding.name, FOREIGN_UTILS);
                context.breakLine("public static final %1$s MTD__%2$s = %3$s.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__%2$s, %4$s);",
                        METHOD_HANDLE, binding.name, FOREIGN_UTILS, this.makeFunctionDescriptor(descriptorType));

                handle = String.format("MTD__%s", binding.name);
            }

            // on a single line
            context.append("public static %s %s(",
                    descriptorType.returnType().process(TypeLocationHint.FUNCTION), binding.name);
            if (needsAllocator)
            {
                context.append("%s %s", SEGMENT_ALLOCATOR, binding.allocatorName);
                if (!parameters.isEmpty()) context.append(", ");
            }
            context.breakLine("%s)", makeJavaParameters(TypeLocationHint.FUNCTION, parameters));
            context.breakLine('{').pushControlFlow();

            StringBuilder result = new StringBuilder();
            result.append(handle).append(".invokeExact(");
            if (needsAllocator)
            {
                result.append(binding.allocatorName);
                if (!parameters.isEmpty()) result.append(", ");
            }
            result.append(processParameters(TypeOperationHint.Kind.UNWRAPPING, parameters)).append(")");

            context.append("try {");
            if (!descriptorType.isVoid()) context.append("return ");
            context.breakLine("%s;}", descriptorType.returnType().process(new TypeOperationHint(TypeOperationHint.Kind.WRAPPING, result.toString())));
            context.breakLine("catch (%s _) {throw new %s();}", THROWABLE, ASSERTION_ERROR);

            context.popControlFlow().breakLine('}');
        }

        context.popControlFlow().breakLine('}');
    }
}
