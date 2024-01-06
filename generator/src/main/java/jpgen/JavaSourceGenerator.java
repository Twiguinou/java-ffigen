package jpgen;

import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.*;

public class JavaSourceGenerator
{
    /*private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String MEMORY_LAYOUT_CLASSPATH = MemoryLayout.class.getName();
    private static final String MEMORY_SEGMENT_CLASSPATH = MemorySegment.class.getName();
    private static final String SEGMENT_ALLOCATOR_CLASSPATH = SegmentAllocator.class.getName();

    private int m_unnamedEnumIndex = 0;
    private int m_unnamedRecordIndex = 0;
    private final Set<String> m_occupiedClassNames = new HashSet<>();
    private final Map<TypeManifold, String> m_nameReferences = new HashMap<>();

    public JavaSourceGenerator(Collection<TypeManifold> types)
    {
        for (TypeManifold type : types)
        {
            if (type instanceof Declaration declaration && !declaration.anonymous())
            {
                this.m_occupiedClassNames.add(declaration.name());
            }
        }
    }

    public static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    private String resolveEnumName(EnumType enumType)
    {
        return this.m_nameReferences.computeIfAbsent(enumType, _ ->
        {
            if (!enumType.anonymous())
            {
                return enumType.name();
            }

            String name;
            do
            {
                name = STR."UnnamedEnum_\{this.m_unnamedEnumIndex++}";
            }
            while (this.m_occupiedClassNames.contains(name));

            return name;
        });
    }

    public String generateEnum(EnumType enumType, String javaPackage)
    {
        StringBuilder source = new StringBuilder();
        String className = this.resolveEnumName(enumType);

        // HEADER
        source.append(STR."package \{javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{className}\{LINE_SEPARATOR}");
        source.append(STR."{private \{className}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // CONSTANTS
        String typeSpelling = enumType.integerType().javaType();
        for (EnumType.Constant constant : enumType.constants())
        {
            withIndent(source, 1, STR."public static final \{typeSpelling} \{constant.name()} = \{constant.value()};\{LINE_SEPARATOR}");
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private String resolveRecordName(RecordType recordType)
    {
        return this.m_nameReferences.computeIfAbsent(recordType, _ ->
        {
            if (!recordType.anonymous())
            {
                return recordType.name();
            }

            String name;
            do
            {
                name = STR."UnnamedRecord_\{this.m_unnamedRecordIndex++}";
            }
            while (this.m_occupiedClassNames.contains(name));

            return name;
        });
    }

    public String generateRecord(RecordType recordType, String javaPackage)
    {
        StringBuilder source = new StringBuilder();
        String className = this.resolveRecordName(recordType);

        // HEADER
        source.append(STR."package \{javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{className}(\{MEMORY_SEGMENT_CLASSPATH} ptr)\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // LAYOUT INFO
        // TODO: what.
        for (RecordType.Field field : recordType.fields())
        {
            withIndent(source, 1, STR."public static final \{field.type().nativeLayoutType()} LAYOUT$\{field.name()} = \{field.type().nativeLayoutReference()}.withName(\"\{field.name()}\");\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."public static final long OFFSET$\{field.name()} = \{field.offset()}L;\{LINE_SEPARATOR}");
        }
        source.append(LINE_SEPARATOR);
        if (recordType.shape() == RecordType.Shape.STRUCT)
        {
            withIndent(source, 1, STR."public static final \{MEMORY_LAYOUT_CLASSPATH} gStructLayout = \{MEMORY_LAYOUT_CLASSPATH}.structLayout(\{LINE_SEPARATOR}");
            long expectedOffset = 0;
            for (int i = 0; i < recordType.fields().length - 1; i++)
            {
                if (recordType.fields()[i].offset() > expectedOffset)
                {
                    long bytesDiff = (recordType.fields()[i].offset() - expectedOffset) / 8;
                    withIndent(source, 3, STR."java.lang.foreign.MemoryLayout.paddingLayout(\{bytesDiff}),\{LINE_SEPARATOR}");
                }
                withIndent(source, 3, STR."LAYOUT$\{recordType.fields()[i].name()},\{LINE_SEPARATOR}");
                //expectedOffset = recordType.fields()[i].offset() +
            }

            if (recordType.fields()[recordType.fields().length - 1].offset() > expectedOffset)
            {
                long bytesDiff = (recordType.fields()[recordType.fields().length - 1].offset() - expectedOffset) / 8;
                withIndent(source, 3, STR."java.lang.foreign.MemoryLayout.paddingLayout(\{bytesDiff}),\{LINE_SEPARATOR}");
            }
            withIndent(source, 3, STR."LAYOUT$\{recordType.fields()[recordType.fields().length - 1].name()},\{LINE_SEPARATOR}");
        }
        else
        {
            withIndent(source, 1, STR."public static final \{MEMORY_LAYOUT_CLASSPATH} gStructLayout = \{MEMORY_LAYOUT_CLASSPATH}.unionLayout(\{LINE_SEPARATOR}");
            for (int i = 0; i < recordType.fields().length - 1; i++)
            {
                withIndent(source, 3, STR."LAYOUT$\{recordType.fields()[i].name()},\{LINE_SEPARATOR}");
            }
            withIndent(source, 3, STR."LAYOUT$\{recordType.fields()[recordType.fields().length - 1].name()}\{LINE_SEPARATOR}");
        }
        withIndent(source, 1, STR.").withName(\"\{recordType.name()}\");\{LINE_SEPARATOR}");

        // ALLOCATOR
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{className}(\{SEGMENT_ALLOCATOR_CLASSPATH} allocator)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this(allocator.allocate(gStructLayout));\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // FIELD ACCESS
        // TODO: what2.
        for (RecordType.Field field : recordType.fields())
        {
            source.append(LINE_SEPARATOR);
            withIndent(source, 1, STR."public \{field.type().javaType()} \{field.name()}() {return this.ptr.get(LAYOUT$\{field.name()}, OFFSET$\{field.name()});}\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."public void \{field.name()}(\{field.type().javaType()} value) {return this.ptr.set(LAYOUT$\{field.name()}, OFFSET$\{field.name()}, \{field.type().unwrap("value")});}\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{field.name()}_ptr() {return this.ptr.asSlice(OFFSET$\{field.name()}, LAYOUT$\{field.name()});}\{LINE_SEPARATOR}");
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }*/
}
