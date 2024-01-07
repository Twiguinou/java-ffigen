package jpgen;

import jpgen.data.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.*;

public class JavaSourceGenerator
{
    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String VALUE_LAYOUT_CLASSPATH = ValueLayout.class.getCanonicalName();
    private static final String STRUCT_LAYOUT_CLASSPATH = StructLayout.class.getCanonicalName();
    private static final String UNION_LAYOUT_CLASSPATH = UnionLayout.class.getCanonicalName();
    private static final String SEQUENCE_LAYOUT_CLASSPATH = SequenceLayout.class.getCanonicalName();
    private static final String ADDRESS_LAYOUT_CLASSPATH = AddressLayout.class.getCanonicalName();
    private static final String MEMORY_LAYOUT_CLASSPATH = MemoryLayout.class.getCanonicalName();
    private static final String MEMORY_SEGMENT_CLASSPATH = MemorySegment.class.getCanonicalName();
    private static final String SEGMENT_ALLOCATOR_CLASSPATH = SegmentAllocator.class.getCanonicalName();
    private static final String LINKER_CLASSPATH = Linker.class.getCanonicalName();
    private static final String SYMBOL_LOOKUP_CLASSPATH = SymbolLookup.class.getCanonicalName();
    private static final String METHOD_HANDLE_CLASSPATH = MethodHandle.class.getCanonicalName();
    private static final String THROWABLE_CLASSPATH = Throwable.class.getCanonicalName();
    private static final String ASSERTION_ERROR_CLASSPATH = AssertionError.class.getCanonicalName();
    private static final String SYSTEM_CLASSPATH = System.class.getCanonicalName();
    private static final String FUNCTION_DESCRIPTOR_CLASSPATH = FunctionDescriptor.class.getCanonicalName();
    private static final String NATIVE_TYPES_CLASSPATH = NativeTypes.class.getCanonicalName();
    private static final String ARENA_CLASSPATH = Arena.class.getCanonicalName();

    private final String m_javaPackage;
    private final String m_headerName;
    private final Map<Declaration, String> m_nameReferences = new HashMap<>();

    public JavaSourceGenerator(String javaPackage, String headerName, Collection<Declaration> types)
    {
        this.m_javaPackage = javaPackage;
        this.m_headerName = headerName;

        Set<String> usedNames = new HashSet<>();
        // capture named declarations
        types.stream().filter(declaration -> !declaration.name().isBlank()).forEach(declaration ->
        {
            this.m_nameReferences.put(declaration, declaration.name());
            usedNames.add(declaration.name());
        });

        // then resolve names for unnamed declarations
        int index = 0;
        for (Declaration declaration : types)
        {
            if (!declaration.name().isBlank())
            {
                continue;
            }

            String name;
            do
            {
                name = STR."UnnamedType_\{index++}";
            }
            while (usedNames.contains(name));

            this.m_nameReferences.put(declaration, name);
            usedNames.add(name);
        }
    }

    private static String stringifyTypeClass(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, Class<? extends ValueLayout> layoutInterface, _) -> layoutInterface.getCanonicalName();
            case TypeManifold.Pointer _ -> ADDRESS_LAYOUT_CLASSPATH;
            case TypeManifold.Array _ -> SEQUENCE_LAYOUT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> stringifyTypeClass(integerType);
            case RecordType(_, RecordType.Shape shape, _, _, _) when shape == RecordType.Shape.STRUCT -> STRUCT_LAYOUT_CLASSPATH;
            case RecordType(_, RecordType.Shape shape, _, _, _) when shape == RecordType.Shape.UNION -> UNION_LAYOUT_CLASSPATH;
            default -> MemoryLayout.class.getCanonicalName();
        };
    }

    private static boolean callbackNeedsTranslation(FunctionType.Callback callback)
    {
        if (callback.innerType().resultType() instanceof RecordType)
        {
            return true;
        }

        for (TypeManifold argType : callback.innerType().argTypes())
        {
            if (argType instanceof RecordType)
            {
                return true;
            }
        }

        return false;
    }

    private static String[] resolveFunctionArgNames(FunctionType.Declaration declaration)
    {
        Set<String> usedNames = new HashSet<>();
        for (String defaultArgName : declaration.argNames())
        {
            if (!defaultArgName.isBlank())
            {
                usedNames.add(defaultArgName);
            }
        }

        String[] resolvedArgNames = new String[declaration.argNames().length];
        for (int i = 0; i < resolvedArgNames.length; i++)
        {
            String name;
            if (declaration.innerType().resultType() instanceof RecordType && declaration.argNames()[i].equals("allocator"))
            {
                name = "_allocator";
            }
            else if (declaration.argNames()[i].isBlank())
            {
                name = STR."arg\{i + 1}";
            }
            else
            {
                resolvedArgNames[i] = declaration.argNames()[i];
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

    private static String unwrapParameter(String parameterName, TypeManifold type)
    {
        if (type instanceof RecordType)
        {
            return STR."\{parameterName}.ptr()";
        }

        return parameterName;
    }

    private static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    private String stringifyTypeReference(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, _, String layoutFieldName) -> STR."\{VALUE_LAYOUT_CLASSPATH}.\{layoutFieldName}";
            case TypeManifold.Pointer _ -> STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
            case TypeManifold.Array(long length, TypeManifold elementType) when length > 0 -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{length}, \{this.stringifyTypeReference(elementType)})";
            case TypeManifold.Array(_, TypeManifold elementType) -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{this.stringifyTypeReference(elementType)})";
            case EnumType(_, TypeManifold.Primitive integerType, _) -> this.stringifyTypeReference(integerType);
            case RecordType recordType -> STR."\{this.m_nameReferences.get(recordType)}.gStructLayout";
            default -> throw new IllegalArgumentException(STR."Could not resolve type reference: \{type}");
        };
    }

    private String stringifyParameterTypeReference(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, _, String layoutFieldName) -> STR."\{VALUE_LAYOUT_CLASSPATH}.\{layoutFieldName}";
            case TypeManifold.Pointer _, TypeManifold.Array _ -> STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
            case EnumType(_, TypeManifold.Primitive integerType, _) -> this.stringifyTypeReference(integerType);
            case RecordType recordType -> STR."\{this.m_nameReferences.get(recordType)}.gStructLayout";
            default -> throw new IllegalArgumentException(STR."Could not resolve type reference: \{type}");
        };
    }

    public String nameOf(Declaration declaration)
    {
        return this.m_nameReferences.getOrDefault(declaration, declaration.name());
    }

    private String typeClassPath(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive primitiveType -> primitiveType.name();
            case TypeManifold.Pointer _, TypeManifold.Array _ -> MEMORY_SEGMENT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> this.typeClassPath(integerType);
            case RecordType recordType -> this.m_nameReferences.get(recordType);
            default -> throw new IllegalArgumentException(STR."Could not resolve type class: \{type}");
        };
    }

    private String nativeTypeClassPath(TypeManifold type)
    {
        return type instanceof RecordType ? MEMORY_SEGMENT_CLASSPATH : this.typeClassPath(type);
    }

    public String generateEnum(EnumType enumType)
    {
        StringBuilder source = new StringBuilder();
        String className = this.m_nameReferences.get(enumType);

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{className}\{LINE_SEPARATOR}");
        source.append(STR."{private \{className}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // CONSTANTS
        String typeSpelling = this.typeClassPath(enumType);
        for (EnumType.Constant constant : enumType.constants())
        {
            withIndent(source, 1, STR."public static final \{typeSpelling} \{constant.name()} = \{constant.value()};\{LINE_SEPARATOR}");
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public String generateRecord(RecordType recordType)
    {
        GroupLayout layout = (GroupLayout) recordType.getLayout().orElseThrow();
        StringBuilder source = new StringBuilder();
        String className = this.m_nameReferences.get(recordType);

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{className}(\{MEMORY_SEGMENT_CLASSPATH} ptr)\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // LAYOUT INFO
        for (RecordType.Field field : recordType.fields())
        {
            if (!field.name().isBlank() && !field.bitfield())
            {
                withIndent(source, 1, STR."public static final \{stringifyTypeClass(field.type())} LAYOUT$\{field.name()} = \{this.stringifyTypeReference(field.type())}.withName(\"\{field.name()}\");\{LINE_SEPARATOR}");
                withIndent(source, 1, STR."public static final long OFFSET$\{field.name()} = \{field.offset() / 8}L;\{LINE_SEPARATOR}");
            }
        }
        source.append(LINE_SEPARATOR);
        if (recordType.shape() == RecordType.Shape.STRUCT)
        {
            withIndent(source, 1, STR."public static final \{STRUCT_LAYOUT_CLASSPATH} gStructLayout = \{MEMORY_LAYOUT_CLASSPATH}.structLayout(\{LINE_SEPARATOR}");
        }
        else
        {
            withIndent(source, 1, STR."public static final \{UNION_LAYOUT_CLASSPATH} gStructLayout = \{MEMORY_LAYOUT_CLASSPATH}.unionLayout(\{LINE_SEPARATOR}");
        }
        for (int i = 0; i < layout.memberLayouts().size(); i++)
        {
            String suffix = i == layout.memberLayouts().size() - 1 ? "" : ",";
            MemoryLayout memberLayout = layout.memberLayouts().get(i);
            if (memberLayout instanceof PaddingLayout)
            {
                withIndent(source, 3, STR."\{MEMORY_LAYOUT_CLASSPATH}.paddingLayout(\{memberLayout.byteSize()})\{suffix}\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 3, STR."LAYOUT$\{memberLayout.name().orElseThrow()}\{suffix}\{LINE_SEPARATOR}");
            }
        }
        if (!recordType.name().isBlank())
        {
            withIndent(source, 1, STR.").withName(\"\{recordType.name()}\");\{LINE_SEPARATOR}");
        }
        else
        {
            withIndent(source, 1, STR.");\{LINE_SEPARATOR}");
        }

        // ALLOCATOR
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{className}(\{SEGMENT_ALLOCATOR_CLASSPATH} allocator)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this(allocator.allocate(gStructLayout));\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // FIELD ACCESS
        for (RecordType.Field field : recordType.fields())
        {
            if (field.name().isBlank() || field.bitfield())
            {
                continue;
            }

            source.append(LINE_SEPARATOR);
            switch (field.type())
            {
                case TypeManifold.Primitive primitiveType when primitiveType == TypeManifold.CHARACTER ->
                {
                    withIndent(source, 1, STR."public char \{field.name()}() {return (char)this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(char value) {this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, (byte)value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Primitive _, TypeManifold.Pointer _, EnumType _ ->
                {
                    String typeClass = this.typeClassPath(field.type());
                    withIndent(source, 1, STR."public \{typeClass} \{field.name()}() {return this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(\{typeClass} value) {this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                }
                case RecordType nestedRecord ->
                {
                    String nestedRecordClass = this.m_nameReferences.get(nestedRecord);
                    withIndent(source, 1, STR."public \{nestedRecordClass} \{field.name()}() {return new \{nestedRecordClass}(this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()}));}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Primitive primitiveType) when primitiveType == TypeManifold.CHARACTER ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public char \{field.name()}(int i) {return (char)this.\{field.name()}().getAtIndex(\{this.stringifyTypeReference(primitiveType)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(int i, char value) {this.\{field.name()}().setAtIndex(\{this.stringifyTypeReference(primitiveType)}, i, (byte)value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Primitive primitiveType) ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{primitiveType.name()} \{field.name()}(int i) {return this.\{field.name()}().getAtIndex(\{this.stringifyTypeReference(primitiveType)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(int i, \{primitiveType.name()} value) {this.\{field.name()}().setAtIndex(\{this.stringifyTypeReference(primitiveType)}, i, value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Pointer pointer) ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}(int i) {return this.\{field.name()}().getAtIndex(\{this.stringifyTypeReference(pointer)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(int i, \{MEMORY_SEGMENT_CLASSPATH} value) {this.\{field.name()}().setAtIndex(\{this.stringifyTypeReference(pointer)}, i, value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, RecordType nestedRecord) ->
                {
                    String nestedRecordClass = this.m_nameReferences.get(nestedRecord);
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{nestedRecordClass} \{field.name()}(int i) {return new \{nestedRecordClass}(this.\{field.name()}().asSlice(i * \{nestedRecordClass}.gStructLayout.byteSize(), \{nestedRecordClass}.gStructLayout));}\{LINE_SEPARATOR}");
                }
                default -> {}
            }
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public String generateHeader(String libName, Collection<FunctionType.Declaration> functions)
    {
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{this.m_headerName}\{LINE_SEPARATOR}");
        source.append(STR."{private \{this.m_headerName}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."static final \{LINKER_CLASSPATH} gSystemLinker;\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."private static final \{SYMBOL_LOOKUP_CLASSPATH} gLibLookup;\{LINE_SEPARATOR}");

        // METHOD HANDLES
        if (!functions.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (FunctionType.Declaration function : functions)
            {
                withIndent(source, 1, STR."private static final \{METHOD_HANDLE_CLASSPATH} MTD$\{function.name()};\{LINE_SEPARATOR}");
            }
        }

        // FUNCTION BODIES
        for (FunctionType.Declaration function : functions)
        {
            source.append(LINE_SEPARATOR);

            String[] resolvedArgNames = resolveFunctionArgNames(function);
            boolean needsAllocator = function.innerType().resultType() instanceof RecordType;

            // PARAMETER LIST
            withIndent(source, 1, STR."public static \{this.typeClassPath(function.innerType().resultType())} \{function.name()}(");
            if (needsAllocator)
            {
                source.append(STR."\{SEGMENT_ALLOCATOR_CLASSPATH} allocator");
            }
            if (resolvedArgNames.length > 0)
            {
                if (needsAllocator)
                {
                    source.append(STR.", \{this.typeClassPath(function.innerType().argTypes()[0])} \{resolvedArgNames[0]}");
                }
                else
                {
                    source.append(STR."\{this.typeClassPath(function.innerType().argTypes()[0])} \{resolvedArgNames[0]}");
                }

                for (int i = 1; i < resolvedArgNames.length; i++)
                {
                    source.append(STR.", \{this.typeClassPath(function.innerType().argTypes()[i])} \{resolvedArgNames[i]}");
                }
            }
            source.append(STR.")\{LINE_SEPARATOR}");

            withIndent(source, 1, STR."{\{LINE_SEPARATOR}");

            // ACTUAL CALL
            if (function.innerType().resultType() == TypeManifold.VOID)
            {
                withIndent(source, 2, STR."try {MTD$\{function.name()}.invokeExact(");
            }
            else if (function.innerType().resultType() instanceof RecordType)
            {
                withIndent(source, 2, STR."try {return new \{this.typeClassPath(function.innerType().resultType())}((\{MEMORY_SEGMENT_CLASSPATH})MTD$\{function.name()}.invokeExact(");
            }
            else
            {
                withIndent(source, 2, STR."try {return (\{this.typeClassPath(function.innerType().resultType())})MTD$\{function.name()}.invokeExact(");
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

            withIndent(source, 2, STR."catch (\{THROWABLE_CLASSPATH} _) {throw new \{ASSERTION_ERROR_CLASSPATH}();}\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."}\{LINE_SEPARATOR}");
        }

        // STATIC INIT 0
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."static\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."\{SYSTEM_CLASSPATH}.loadLibrary(\"\{libName}\");\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."gSystemLinker = \{LINKER_CLASSPATH}.nativeLinker();\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."gLibLookup = name -> \{SYMBOL_LOOKUP_CLASSPATH}.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));\{LINE_SEPARATOR}");

        // STATIC INIT 2
        if (!functions.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (FunctionType.Declaration function : functions)
            {
                withIndent(source, 2, STR."MTD$\{function.name()} = gSystemLinker.downcallHandle(gLibLookup.find(\"\{function.name()}\").orElseThrow(), \{FUNCTION_DESCRIPTOR_CLASSPATH}");
                if (function.innerType().resultType() == TypeManifold.VOID)
                {
                    source.append(".ofVoid(");
                    if (function.argNames().length > 0)
                    {
                        source.append(this.stringifyParameterTypeReference(function.innerType().argTypes()[0]));
                        for (int i = 1; i < function.argNames().length; i++)
                        {
                            source.append(STR.", \{this.stringifyParameterTypeReference(function.innerType().argTypes()[i])}");
                        }
                    }
                }
                else
                {
                    source.append(STR.".of(\{this.stringifyParameterTypeReference(function.innerType().resultType())}");
                    for (TypeManifold argType : function.innerType().argTypes())
                    {
                        source.append(STR.", \{this.stringifyParameterTypeReference(argType)}");
                    }
                }

                source.append(STR."));\{LINE_SEPARATOR}");
            }
        }
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public String generateCallback(FunctionType.Callback callback)
    {
        StringBuilder source = new StringBuilder();
        String className = this.m_nameReferences.get(callback);
        boolean needsTranslation = callbackNeedsTranslation(callback);

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public interface \{className}\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // TYPE INFO
        withIndent(source, 1, STR."\{FUNCTION_DESCRIPTOR_CLASSPATH} gDescriptor = \{FUNCTION_DESCRIPTOR_CLASSPATH}");
        if (callback.innerType().resultType() == TypeManifold.VOID)
        {
            source.append(".ofVoid(");
            if (callback.innerType().argTypes().length > 0)
            {
                source.append(this.stringifyParameterTypeReference(callback.innerType().argTypes()[0]));
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(STR.", \{this.stringifyParameterTypeReference(callback.innerType().argTypes()[i])}");
                }
            }
        }
        else
        {
            source.append(STR.".of(\{this.stringifyParameterTypeReference(callback.innerType().resultType())}");
            for (TypeManifold argType : callback.innerType().argTypes())
            {
                source.append(STR.", \{this.stringifyParameterTypeReference(argType)}");
            }
        }
        source.append(STR.");\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."\{METHOD_HANDLE_CLASSPATH} gUpcallStub = \{NATIVE_TYPES_CLASSPATH}.initUpcallStub(gDescriptor, \"invoke\", \{className}.class);\{LINE_SEPARATOR}");

        // USER INVOKE
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."\{this.typeClassPath(callback.innerType().resultType())} invoke(");
        if (callback.innerType().argTypes().length > 0)
        {
            source.append(STR."\{this.typeClassPath(callback.innerType().argTypes()[0])} arg1");
            for (int i = 1; i < callback.innerType().argTypes().length; i++)
            {
                source.append(STR.", \{this.typeClassPath(callback.innerType().argTypes()[i])} arg\{i + 1}");
            }
        }
        source.append(STR.");\{LINE_SEPARATOR}");

        if (needsTranslation)
        {
            // TRANSLATION FOR RECORD TYPES
            source.append(LINE_SEPARATOR);
            withIndent(source, 1, STR."default \{this.nativeTypeClassPath(callback.innerType().resultType())} invoke(");
            if (callback.innerType().argTypes().length > 0)
            {
                source.append(STR."\{this.nativeTypeClassPath(callback.innerType().argTypes()[0])} arg1");
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(STR.", \{this.nativeTypeClassPath(callback.innerType().argTypes()[i])} arg\{i + 1}");
                }
            }
            source.append(STR.")\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."{\{LINE_SEPARATOR}");

            withIndent(source, 2, callback.innerType().resultType() == TypeManifold.VOID ? "this.invoke(" : "return this.invoke(");
            if (callback.innerType().argTypes().length > 0)
            {
                source.append(callback.innerType().argTypes()[0] instanceof RecordType recordType ? STR."new \{this.typeClassPath(recordType)}(arg1)" : "arg1");
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(callback.innerType().argTypes()[i] instanceof RecordType recordType ? STR.", new \{this.typeClassPath(recordType)}(arg\{i + 1})" : STR.", arg\{i + 1}");
                }
            }
            source.append(")");
            if (callback.innerType().resultType() instanceof RecordType)
            {
                source.append(".ptr()");
            }
            source.append(STR.";\{LINE_SEPARATOR}");

            withIndent(source, 1, STR."}\{LINE_SEPARATOR}");
        }

        // HANDLE MAKER
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."default \{MEMORY_SEGMENT_CLASSPATH} makeHandle(\{ARENA_CLASSPATH} arena)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."return \{this.m_headerName}.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }
}
