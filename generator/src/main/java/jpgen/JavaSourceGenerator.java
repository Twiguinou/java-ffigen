package jpgen;

import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import javax.annotation.Nullable;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.ValueLayout;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static jpgen.DataSourceHelper.*;

public class JavaSourceGenerator
{
    private final String m_javaPackage;
    private final String m_headerName;
    private final Map<Declaration<?>, String> nameReferences;

    public JavaSourceGenerator(String javaPackage, String headerName, Map<Declaration<?>, String> nameReferences)
    {
        this.m_javaPackage = javaPackage;
        this.m_headerName = headerName;
        this.nameReferences = nameReferences;
    }

    private static String stringifyTypeClass(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, Class<? extends ValueLayout> layoutInterface, _) -> layoutInterface.getCanonicalName();
            case TypeManifold.Pointer _, FunctionType.Callback _ -> ADDRESS_LAYOUT_CLASSPATH;
            case TypeManifold.Array _ -> SEQUENCE_LAYOUT_CLASSPATH;
            case EnumType(_, TypeManifold.Primitive integerType, _) -> stringifyTypeClass(integerType);
            case RecordType(_, RecordType.Shape shape, _, _, _) when shape == RecordType.Shape.STRUCT -> STRUCT_LAYOUT_CLASSPATH;
            case RecordType(_, RecordType.Shape shape, _, _, _) when shape == RecordType.Shape.UNION -> UNION_LAYOUT_CLASSPATH;
            case TypeManifold.Typedef(_, TypeManifold underlying) -> stringifyTypeClass(underlying);
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

    private static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    private static TypeManifold flattenType(TypeManifold type)
    {
        if (type instanceof TypeManifold.Typedef(_, TypeManifold underlying))
        {
            return flattenType(underlying);
        }
        return type;
    }

    private String stringifyTypeReference(TypeManifold type)
    {
        return switch (type)
        {
            case TypeManifold.Primitive(_, _, _, String layoutFieldName) -> STR."\{VALUE_LAYOUT_CLASSPATH}.\{layoutFieldName}";
            case TypeManifold.Pointer _, FunctionType.Callback _ -> STR."\{VALUE_LAYOUT_CLASSPATH}.ADDRESS";
            case TypeManifold.Array(long length, TypeManifold elementType) when length > 0 -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{length}, \{this.stringifyTypeReference(elementType)})";
            case TypeManifold.Array(_, TypeManifold elementType) -> STR."\{MEMORY_LAYOUT_CLASSPATH}.sequenceLayout(\{this.stringifyTypeReference(elementType)})";
            case EnumType(_, TypeManifold.Primitive integerType, _) -> this.stringifyTypeReference(integerType);
            case RecordType recordType -> STR."\{this.nameReferences.get(recordType)}.gStructLayout";
            case TypeManifold.Typedef(_, TypeManifold underlying) -> this.stringifyTypeReference(underlying);
            default -> throw new IllegalArgumentException(STR."Could not resolve type reference: \{type}");
        };
    }

    private String nativeTypeClassPath(TypeManifold type)
    {
        return type instanceof RecordType ? MEMORY_SEGMENT_CLASSPATH : getJavaType(type, this.nameReferences);
    }

    public String generateEnum(EnumType enumType)
    {
        StringBuilder source = new StringBuilder();
        String className = this.nameReferences.get(enumType);

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{className}\{LINE_SEPARATOR}");
        source.append(STR."{private \{className}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // CONSTANTS
        String typeSpelling = getJavaType(enumType, this.nameReferences);
        for (EnumType.Constant constant : enumType.constants())
        {
            withIndent(source, 1, STR."public static final \{typeSpelling} \{constant.name()} = \{constant.value()};\{LINE_SEPARATOR}");
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public @Nullable String generateRecord(RecordType recordType)
    {
        Optional<MemoryLayout> layoutReference = recordType.getLayout();
        if (layoutReference.isEmpty())
        {
            return null;
        }

        GroupLayout layout = (GroupLayout) layoutReference.get();
        StringBuilder source = new StringBuilder();
        String className = this.nameReferences.get(recordType);

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{className}(\{MEMORY_SEGMENT_CLASSPATH} ptr)\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // LAYOUT INFO
        int unnamedIndex = 0;
        for (RecordType.Field field : recordType.fields())
        {
            if (field.bitfield())
            {
                continue;
            }

            if (field.name().isPresent())
            {
                String fieldName = field.name().get();
                withIndent(source, 1, STR."public static final \{stringifyTypeClass(field.type())} LAYOUT$\{fieldName} = \{this.stringifyTypeReference(field.type())}.withName(\"\{fieldName}\");\{LINE_SEPARATOR}");
                withIndent(source, 1, STR."public static final long OFFSET$\{fieldName} = \{field.offset() / 8}L;\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 1, STR."private static final \{stringifyTypeClass(field.type())} UNNAMED_LAYOUT\{unnamedIndex} = \{this.stringifyTypeReference(field.type())};\{LINE_SEPARATOR}");
                ++unnamedIndex;
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
        unnamedIndex = 0;
        for (int i = 0; i < layout.memberLayouts().size(); i++)
        {
            String suffix = i == layout.memberLayouts().size() - 1 ? "" : ",";
            MemoryLayout memberLayout = layout.memberLayouts().get(i);
            if (memberLayout instanceof PaddingLayout)
            {
                withIndent(source, 3, STR."\{MEMORY_LAYOUT_CLASSPATH}.paddingLayout(\{memberLayout.byteSize()})\{suffix}\{LINE_SEPARATOR}");
            }
            else if (memberLayout.name().isPresent())
            {
                withIndent(source, 3, STR."LAYOUT$\{memberLayout.name().get()}\{suffix}\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 3, STR."UNNAMED_LAYOUT\{unnamedIndex}\{suffix}\{LINE_SEPARATOR}");
                ++unnamedIndex;
            }
        }
        recordType.name().ifPresentOrElse(name -> withIndent(source, 1, STR.").withName(\"\{name}\");\{LINE_SEPARATOR}"), () -> withIndent(source, 1, STR.");\{LINE_SEPARATOR}"));

        // ALLOCATOR
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{className}(\{SEGMENT_ALLOCATOR_CLASSPATH} allocator)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this(allocator.allocate(gStructLayout));\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // FIELD ACCESS
        for (RecordType.Field field : recordType.fields())
        {
            if (field.name().isEmpty() || field.bitfield())
            {
                continue;
            }

            String fieldName = field.name().get();
            source.append(LINE_SEPARATOR);
            switch (flattenType(field.type()))
            {
                case TypeManifold.Primitive primitiveType when primitiveType == TypeManifold.CHARACTER ->
                {
                    withIndent(source, 1, STR."public char \{fieldName}() {return (char)this.ptr.get(LAYOUT$\{fieldName}, OFFSET$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{fieldName}(char value) {this.ptr.set(LAYOUT$\{fieldName}, OFFSET$\{fieldName}, (byte)value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}_ptr() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Primitive _, TypeManifold.Pointer _, EnumType _ ->
                {
                    String typeClass = getJavaType(field.type(), this.nameReferences);
                    withIndent(source, 1, STR."public \{typeClass} \{fieldName}() {return this.ptr.get(LAYOUT$\{fieldName}, OFFSET$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{fieldName}(\{typeClass} value) {this.ptr.set(LAYOUT$\{fieldName}, OFFSET$\{fieldName}, value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}_ptr() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                }
                case RecordType nestedRecord ->
                {
                    String nestedRecordClass = this.nameReferences.get(nestedRecord);
                    withIndent(source, 1, STR."public \{nestedRecordClass} \{fieldName}() {return new \{nestedRecordClass}(this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName}));}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Primitive primitiveType) when primitiveType == TypeManifold.CHARACTER ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public char \{fieldName}(int i) {return (char)this.\{fieldName}().getAtIndex(\{this.stringifyTypeReference(primitiveType)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{fieldName}(int i, char value) {this.\{fieldName}().setAtIndex(\{this.stringifyTypeReference(primitiveType)}, i, (byte)value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Primitive primitiveType) ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{primitiveType.name()} \{fieldName}(int i) {return this.\{fieldName}().getAtIndex(\{this.stringifyTypeReference(primitiveType)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{fieldName}(int i, \{primitiveType.name()} value) {this.\{fieldName}().setAtIndex(\{this.stringifyTypeReference(primitiveType)}, i, value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, TypeManifold.Pointer pointer) ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}(int i) {return this.\{fieldName}().getAtIndex(\{this.stringifyTypeReference(pointer)}, i);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{fieldName}(int i, \{MEMORY_SEGMENT_CLASSPATH} value) {this.\{fieldName}().setAtIndex(\{this.stringifyTypeReference(pointer)}, i, value);}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Array(_, RecordType nestedRecord) ->
                {
                    String nestedRecordClass = this.nameReferences.get(nestedRecord);
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}() {return this.ptr.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{nestedRecordClass} \{fieldName}(int i) {return new \{nestedRecordClass}(this.\{fieldName}().asSlice(i * \{nestedRecordClass}.gStructLayout.byteSize(), \{nestedRecordClass}.gStructLayout));}\{LINE_SEPARATOR}");
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
        withIndent(source, 1, STR."public static final \{LINKER_CLASSPATH} gSystemLinker;\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."public static final \{SYMBOL_LOOKUP_CLASSPATH} gLibLookup;\{LINE_SEPARATOR}");

        // METHOD HANDLES
        if (!functions.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (FunctionType.Declaration function : functions)
            {
                withIndent(source, 1, STR."public static final \{MEMORY_SEGMENT_CLASSPATH} MTD_ADDRESS$\{function.fname()};\{LINE_SEPARATOR}");
                withIndent(source, 1, STR."public static final \{METHOD_HANDLE_CLASSPATH} MTD$\{function.fname()};\{LINE_SEPARATOR}");
            }
        }

        // FUNCTION BODIES
        for (FunctionType.Declaration function : functions)
        {
            source.append(LINE_SEPARATOR);
            source.append(STR."\{functionBody(function, 1, STR."MTD$\{function.fname()}", this.nameReferences)}\{LINE_SEPARATOR}");
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
                withIndent(source, 2, STR."MTD_ADDRESS$\{function.fname()} = gLibLookup.find(\"\{function.fname()}\").orElseThrow();\{LINE_SEPARATOR}");
                withIndent(source, 2, STR."MTD$\{function.fname()} = gSystemLinker.downcallHandle(MTD_ADDRESS$\{function.fname()}, \{FUNCTION_DESCRIPTOR_CLASSPATH}");
                if (function.innerType().resultType() == TypeManifold.VOID)
                {
                    source.append(".ofVoid(");
                    if (function.argNames().length > 0)
                    {
                        source.append(parameterLayoutReference(function.innerType().argTypes()[0], this.nameReferences));
                        for (int i = 1; i < function.argNames().length; i++)
                        {
                            source.append(STR.", \{parameterLayoutReference(function.innerType().argTypes()[i], this.nameReferences)}");
                        }
                    }
                }
                else
                {
                    source.append(STR.".of(\{parameterLayoutReference(function.innerType().resultType(), this.nameReferences)}");
                    for (TypeManifold argType : function.innerType().argTypes())
                    {
                        source.append(STR.", \{parameterLayoutReference(argType, this.nameReferences)}");
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
        String className = this.nameReferences.get(callback);
        boolean needsTranslation = callbackNeedsTranslation(callback);
        String[] resolvedArgNames = resolveFunctionArgNames(callback.innerType(), callback.argNames());

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
                source.append(parameterLayoutReference(callback.innerType().argTypes()[0], this.nameReferences));
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(STR.", \{parameterLayoutReference(callback.innerType().argTypes()[i], this.nameReferences)}");
                }
            }
        }
        else
        {
            source.append(STR.".of(\{parameterLayoutReference(callback.innerType().resultType(), this.nameReferences)}");
            for (TypeManifold argType : callback.innerType().argTypes())
            {
                source.append(STR.", \{parameterLayoutReference(argType, this.nameReferences)}");
            }
        }
        source.append(STR.");\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."\{METHOD_HANDLE_CLASSPATH} gUpcallStub = \{NATIVE_TYPES_CLASSPATH}.initUpcallStub(gDescriptor, \"invoke\", \{className}.class);\{LINE_SEPARATOR}");

        // USER INVOKE
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."\{getJavaType(callback.innerType().resultType(), this.nameReferences)} invoke(");
        if (resolvedArgNames.length > 0)
        {
            source.append(STR."\{getJavaType(callback.innerType().argTypes()[0], this.nameReferences)} \{resolvedArgNames[0]}");
            for (int i = 1; i < resolvedArgNames.length; i++)
            {
                source.append(STR.", \{getJavaType(callback.innerType().argTypes()[i], this.nameReferences)} \{resolvedArgNames[i]}");
            }
        }
        source.append(STR.");\{LINE_SEPARATOR}");

        if (needsTranslation)
        {
            // TRANSLATION FOR RECORD TYPES
            source.append(LINE_SEPARATOR);
            withIndent(source, 1, STR."default \{this.nativeTypeClassPath(callback.innerType().resultType())} invoke(");
            if (resolvedArgNames.length > 0)
            {
                source.append(STR."\{this.nativeTypeClassPath(callback.innerType().argTypes()[0])} \{resolvedArgNames[0]}");
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(STR.", \{this.nativeTypeClassPath(callback.innerType().argTypes()[i])} \{resolvedArgNames[i]}");
                }
            }
            source.append(STR.")\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."{\{LINE_SEPARATOR}");

            withIndent(source, 2, callback.innerType().resultType() == TypeManifold.VOID ? "this.invoke(" : "return this.invoke(");
            if (resolvedArgNames.length > 0)
            {
                source.append(callback.innerType().argTypes()[0] instanceof RecordType recordType ? STR."new \{getJavaType(recordType, this.nameReferences)}(\{resolvedArgNames[0]})" : resolvedArgNames[0]);
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(callback.innerType().argTypes()[i] instanceof RecordType recordType ? STR.", new \{getJavaType(recordType, this.nameReferences)}(\{resolvedArgNames[i]})" : STR.", \{resolvedArgNames[i]}");
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
