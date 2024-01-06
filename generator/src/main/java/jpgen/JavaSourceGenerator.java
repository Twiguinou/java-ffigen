package jpgen;

import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.lang.foreign.*;
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

    private final String m_javaPackage;
    private final Map<Declaration, String> m_nameReferences = new HashMap<>();

    public JavaSourceGenerator(String javaPackage, Collection<Declaration> types)
    {
        this.m_javaPackage = javaPackage;

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

    private static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    public String generateEnum(EnumType enumType)
    {
        StringBuilder source = new StringBuilder();
        String className = enumType.name();

        // HEADER
        source.append(STR."package \{this.m_javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{className}\{LINE_SEPARATOR}");
        source.append(STR."{private \{className}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // CONSTANTS
        String typeSpelling = enumType.integerType().name();
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
            if (!field.name().isBlank())
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
            if (field.name().isBlank())
            {
                continue;
            }

            source.append(LINE_SEPARATOR);
            switch (field.type())
            {
                case TypeManifold.Primitive(String name, _, _, _) ->
                {
                    withIndent(source, 1, STR."public \{name} \{field.name()}() {return this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(\{name} value) {this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                }
                case TypeManifold.Pointer _ ->
                {
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}() {return this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(\{MEMORY_SEGMENT_CLASSPATH} value) {this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                }
                case EnumType(_, TypeManifold.Primitive(String name, _, _, _), _) ->
                {
                    withIndent(source, 1, STR."public \{name} \{field.name()}() {return this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public void \{field.name()}(\{name} value) {this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, value);}\{LINE_SEPARATOR}");
                    withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
                }
                case RecordType nestedRecord ->
                {
                    String nestedRecordClass = this.m_nameReferences.get(nestedRecord);
                    withIndent(source, 1, STR."public \{nestedRecordClass} \{field.name()}() {return new \{nestedRecordClass}(this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()}));}\{LINE_SEPARATOR}");
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
}
