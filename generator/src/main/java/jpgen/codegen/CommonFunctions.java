package jpgen.codegen;

import jpgen.NativeTypes;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.HashSet;
import java.util.Set;

public class CommonFunctions
{
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
    public static final String LINKER_OPTION_CLASSPATH = Linker.Option.class.getCanonicalName();

    public static TypeManifold flattenType(TypeManifold type)
    {
        return type instanceof TypeManifold.Typedef(_, TypeManifold underlying) ? flattenType(underlying) : type;
    }

    public static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    public static String javaType(TypeManifold type, TypeTranslation translation)
    {
        return switch (flattenType(type))
        {
            case TypeManifold.Primitive(String name, _, _, _) -> name;
            case TypeManifold.Pointer _, TypeManifold.Array _, FunctionType.Callback _ -> MEMORY_SEGMENT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> javaType(integerType, translation);
            case RecordType _ -> translation.recordInfo(type).classpath();
            default -> throw new IllegalArgumentException(STR."Could not resolve java type for type: \{type}");
        };
    }

    public static String nativeType(TypeManifold type)
    {
        return switch (flattenType(type))
        {
            case TypeManifold.Primitive(String name, _, _, _) -> name;
            case TypeManifold.Pointer _, TypeManifold.Array _, FunctionType.Callback _, RecordType _ -> MEMORY_SEGMENT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> nativeType(integerType);
            default -> throw new IllegalArgumentException(STR."Could not resolve native type for type: \{type}");
        };
    }

    public static String layoutClass(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, Class<? extends ValueLayout> layoutClass, _) when layoutClass != null -> layoutClass.getCanonicalName();
            case TypeManifold.Pointer _, FunctionType.Callback _ -> ADDRESS_LAYOUT_CLASSPATH;
            case TypeManifold.Array _ -> SEQUENCE_LAYOUT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> layoutClass(integerType);
            case RecordType _ -> GROUP_LAYOUT_CLASSPATH;
            case TypeManifold.Typedef(_, TypeManifold underlying) -> layoutClass(underlying);
            default -> throw new IllegalArgumentException(STR."Could not resolve layout class for type: \{type}");
        };
    }

    public static String layoutInstance(TypeManifold type, TypeTranslation translation)
    {
        return switch (flattenType(type))
        {
            case TypeManifold.Primitive(_, _, _, String layoutFieldName) when layoutFieldName != null -> STR."\{VALUE_LAYOUT_CLASSPATH}.\{layoutFieldName}";
            case TypeManifold.Pointer _, FunctionType.Callback _ -> STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
            case TypeManifold.Array(long length, TypeManifold elementType) when length > 0 -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{length}, \{layoutInstance(elementType, translation)})";
            case TypeManifold.Array(_, TypeManifold elementType) -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{layoutInstance(elementType, translation)})";
            case EnumType(_, TypeManifold.Primitive integerType, _) -> layoutInstance(integerType, translation);
            case RecordType _ -> translation.recordInfo(type).layoutClasspath();
            default -> throw new IllegalArgumentException(STR."Could not resolve layout instance for type: \{type}");
        };
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

    public static String parameterLayoutInstance(TypeManifold type, TypeTranslation translation)
    {
        if (flattenType(type) instanceof TypeManifold.Array)
        {
            return STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
        }

        return layoutInstance(type, translation);
    }

    public static String functionDescriptor(FunctionType type, TypeTranslation translation)
    {
        StringBuilder source = new StringBuilder();
        source.append(FUNCTION_DESCRIPTOR_CLASSPATH);
        if (flattenType(type.resultType()) == TypeManifold.VOID)
        {
            source.append(".ofVoid(");
            if (type.argTypes().length > 0)
            {
                source.append(parameterLayoutInstance(type.argTypes()[0], translation));
                for (int i = 1; i < type.argTypes().length; i++)
                {
                    source.append(STR.", \{parameterLayoutInstance(type.argTypes()[i], translation)}");
                }
            }
        }
        else
        {
            source.append(STR.".of(\{parameterLayoutInstance(type.resultType(), translation)}");
            for (TypeManifold argType : type.argTypes())
            {
                source.append(STR.", \{parameterLayoutInstance(argType, translation)}");
            }
        }

        source.append(")");
        return source.toString();
    }

    public static boolean callbackNeedsTranslation(FunctionType.Callback callback)
    {
        if (flattenType(callback.innerType().resultType()) instanceof RecordType)
        {
            return true;
        }

        for (TypeManifold argType : callback.innerType().argTypes())
        {
            if (flattenType(argType) instanceof RecordType)
            {
                return true;
            }
        }

        return false;
    }
}
