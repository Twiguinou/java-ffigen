package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

import java.util.List;
import java.util.stream.Collectors;

public final class CodeUtils
{private CodeUtils() {}

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
    public static final String HOST = "fr.kenlek.jpgen.Host";
    public static final String MEMBER = "fr.kenlek.jpgen.Member";

    public static String makeFunctionDescriptor(FunctionType functionType, LayoutReference.Descriptor reference)
    {
        StringBuilder code = new StringBuilder();
        code.append(FUNCTION_DESCRIPTOR);
        if (functionType.isVoid())
        {
            code.append(".ofVoid(");
        }
        else
        {
            code.append(".of(").append(functionType.returnType().process(reference));
            if (!functionType.parametersTypes().isEmpty()) code.append(", ");
        }

        code.append(functionType.parametersTypes().stream()
                .map(type -> type.process(reference))
                .collect(Collectors.joining(", ")));

        code.append(")");
        return code.toString();
    }

    public static String makeJavaParameters(TypeReference reference, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> String.format("%s %s", parameter.type().process(reference), parameter.name()))
                .collect(Collectors.joining(", "));
    }

    public static String processParameters(boolean wrap, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> parameter.type().process(new TypeOp(wrap, parameter.name())))
                .collect(Collectors.joining(", "));
    }
}
