package jpgen;

import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class DataSourceHelper
{private DataSourceHelper() {}

    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String VALUE_LAYOUT_CLASSPATH = ValueLayout.class.getCanonicalName();
    public static final String STRUCT_LAYOUT_CLASSPATH = StructLayout.class.getCanonicalName();
    public static final String UNION_LAYOUT_CLASSPATH = UnionLayout.class.getCanonicalName();
    public static final String SEQUENCE_LAYOUT_CLASSPATH = SequenceLayout.class.getCanonicalName();
    public static final String ADDRESS_LAYOUT_CLASSPATH = AddressLayout.class.getCanonicalName();
    public static final String MEMORY_LAYOUT_CLASSPATH = MemoryLayout.class.getCanonicalName();
    public static final String MEMORY_SEGMENT_CLASSPATH = MemorySegment.class.getCanonicalName();
    public static final String SEGMENT_ALLOCATOR_CLASSPATH = SegmentAllocator.class.getCanonicalName();
    public static final String LINKER_CLASSPATH = Linker.class.getCanonicalName();
    public static final String SYMBOL_LOOKUP_CLASSPATH = SymbolLookup.class.getCanonicalName();
    public static final String METHOD_HANDLE_CLASSPATH = MethodHandle.class.getCanonicalName();
    public static final String THROWABLE_CLASSPATH = Throwable.class.getCanonicalName();
    public static final String ASSERTION_ERROR_CLASSPATH = AssertionError.class.getCanonicalName();
    public static final String SYSTEM_CLASSPATH = System.class.getCanonicalName();
    public static final String FUNCTION_DESCRIPTOR_CLASSPATH = FunctionDescriptor.class.getCanonicalName();
    public static final String NATIVE_TYPES_CLASSPATH = NativeTypes.class.getCanonicalName();
    public static final String ARENA_CLASSPATH = Arena.class.getCanonicalName();
    public static final String GROUP_LAYOUT_CLASSPATH = GroupLayout.class.getCanonicalName();

    public static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    public static String getJavaType(TypeManifold type, Map<Declaration<?>, String> classNames)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(String name, _, _, _) -> name;
            case TypeManifold.Pointer _, TypeManifold.Array _, FunctionType.Callback _ -> MEMORY_SEGMENT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> getJavaType(integerType, classNames);
            case RecordType recordType -> classNames.get(recordType);
            case TypeManifold.Typedef(_, TypeManifold underlying) -> getJavaType(underlying, classNames);
            default -> throw new IllegalArgumentException(STR."Could not resolve java type: \{type}");
        };
    }

    public static String parameterLayoutReference(TypeManifold type, Map<Declaration<?>, String> classNames)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, _, String layoutFieldName) -> STR."\{VALUE_LAYOUT_CLASSPATH}.\{layoutFieldName}";
            case TypeManifold.Pointer _, TypeManifold.Array _, FunctionType.Callback _ -> STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
            case EnumType(_, TypeManifold.Primitive integerType, _) -> parameterLayoutReference(integerType, classNames);
            case RecordType recordType -> STR."\{classNames.get(recordType)}.gStructLayout";
            case TypeManifold.Typedef(_, TypeManifold underlying) -> parameterLayoutReference(underlying, classNames);
            default -> throw new IllegalArgumentException(STR."Could not resolve layout reference: \{type}");
        };
    }

    public static String functionDowncall(FunctionType.Declaration function, String linker, String functionAddress, Map<Declaration<?>, String> classNames)
    {
        StringBuilder source = new StringBuilder();

        source.append(STR."\{linker}.downcallHandle(\{functionAddress}, \{FUNCTION_DESCRIPTOR_CLASSPATH}");
        if (function.innerType().resultType() == TypeManifold.VOID)
        {
            source.append(".ofVoid(");
            if (function.argNames().length > 0)
            {
                source.append(parameterLayoutReference(function.innerType().argTypes()[0], classNames));
                for (int i = 1; i < function.argNames().length; i++)
                {
                    source.append(STR.", \{parameterLayoutReference(function.innerType().argTypes()[i], classNames)}");
                }
            }
        }
        else
        {
            source.append(STR.".of(\{parameterLayoutReference(function.innerType().resultType(), classNames)}");
            for (TypeManifold argType : function.innerType().argTypes())
            {
                source.append(STR.", \{parameterLayoutReference(argType, classNames)}");
            }
        }

        source.append("))");
        return source.toString();
    }

    public static String[] resolveFunctionArgNames(FunctionType function, String[] defaultNames)
    {
        Set<String> usedNames = new HashSet<>();
        for (String defaultArgName : defaultNames)
        {
            if (!defaultArgName.isBlank())
            {
                usedNames.add(defaultArgName);
            }
        }

        String[] resolvedArgNames = new String[defaultNames.length];
        for (int i = 0; i < resolvedArgNames.length; i++)
        {
            String name;
            if (function.resultType() instanceof RecordType && defaultNames[i].equals("allocator"))
            {
                name = "_allocator";
            }
            else if (defaultNames[i].isBlank())
            {
                name = STR."arg\{i + 1}";
            }
            else
            {
                resolvedArgNames[i] = defaultNames[i];
                continue;
            }

            while (usedNames.contains(name))
            {
                name = STR."_\{name}";
            }

            resolvedArgNames[i] = name;
            usedNames.add(name);
        }

        return resolvedArgNames;
    }

    public static String unwrapParameter(String parameterName, TypeManifold type)
    {
        if (type instanceof RecordType)
        {
            return STR."\{parameterName}.ptr()";
        }

        return parameterName;
    }

    public static String functionBody(FunctionType.Declaration function, int baseIndent, String handle, Map<Declaration<?>, String> classNames)
    {
        StringBuilder source = new StringBuilder();

        String[] resolvedArgNames = resolveFunctionArgNames(function.innerType(), function.argNames());
        boolean needsAllocator = function.innerType().resultType() instanceof RecordType;

        // PARAMETER LIST
        withIndent(source, baseIndent, STR."public static \{getJavaType(function.innerType().resultType(), classNames)} \{function.fname()}(");
        if (needsAllocator)
        {
            source.append(STR."\{SEGMENT_ALLOCATOR_CLASSPATH} allocator");
        }
        if (resolvedArgNames.length > 0)
        {
            if (needsAllocator)
            {
                source.append(STR.", \{getJavaType(function.innerType().argTypes()[0], classNames)} \{resolvedArgNames[0]}");
            }
            else
            {
                source.append(STR."\{getJavaType(function.innerType().argTypes()[0], classNames)} \{resolvedArgNames[0]}");
            }

            for (int i = 1; i < resolvedArgNames.length; i++)
            {
                source.append(STR.", \{getJavaType(function.innerType().argTypes()[i], classNames)} \{resolvedArgNames[i]}");
            }
        }
        source.append(STR.")\{LINE_SEPARATOR}");

        withIndent(source, baseIndent, STR."{\{LINE_SEPARATOR}");

        // ACTUAL CALL
        if (function.innerType().resultType() == TypeManifold.VOID)
        {
            withIndent(source, baseIndent + 1, STR."try {\{handle}.invokeExact(");
        }
        else if (function.innerType().resultType() instanceof RecordType)
        {
            withIndent(source, baseIndent + 1, STR."try {return new \{getJavaType(function.innerType().resultType(), classNames)}((\{MEMORY_SEGMENT_CLASSPATH})\{handle}.invokeExact(");
        }
        else
        {
            withIndent(source, baseIndent + 1, STR."try {return (\{getJavaType(function.innerType().resultType(), classNames)})\{handle}.invokeExact(");
        }
        if (needsAllocator)
        {
            source.append("allocator");
        }
        if (resolvedArgNames.length > 0)
        {
            if (needsAllocator)
            {
                source.append(STR.", \{unwrapParameter(resolvedArgNames[0], function.innerType().argTypes()[0])}");
            }
            else
            {
                source.append(unwrapParameter(resolvedArgNames[0], function.innerType().argTypes()[0]));
            }

            for (int i = 1; i < resolvedArgNames.length; i++)
            {
                source.append(STR.", \{unwrapParameter(resolvedArgNames[i], function.innerType().argTypes()[i])}");
            }
        }
        if (function.innerType().resultType() instanceof RecordType)
        {
            source.append(")");
        }
        source.append(STR.");}\{LINE_SEPARATOR}");

        withIndent(source, baseIndent + 1, STR."catch (\{THROWABLE_CLASSPATH} _) {throw new \{ASSERTION_ERROR_CLASSPATH}();}\{LINE_SEPARATOR}");
        withIndent(source, baseIndent, "}");
        return source.toString();
    }
}
