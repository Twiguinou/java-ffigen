package jpgen.data;

import java.lang.foreign.MemoryLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record RecordType(String name, Shape shape, Field[] fields, long size, long alignment) implements Declaration
{
    public record Field(String name, TypeManifold type, long offset, boolean bitfield)
    {
        @Override
        public String toString()
        {
            return this.bitfield ? STR."Bitfield[\{this.name}(\{this.offset}):\{this.type}]" : STR."Field[\{this.name}(\{this.offset}):\{this.type}]";
        }
    }

    public enum Shape
    {
        STRUCT,
        UNION
    }

    private Optional<MemoryLayout> computeLayoutStruct()
    {
        List<MemoryLayout> memberLayouts = new ArrayList<>();
        long expectedOffset = 0;
        for (Field field : this.fields)
        {
            if (field.bitfield)
            {
                continue;
            }

            long fieldByteOffset = field.offset / 8;
            if (fieldByteOffset > expectedOffset)
            {
                memberLayouts.add(MemoryLayout.paddingLayout(fieldByteOffset - expectedOffset));
            }

            Optional<MemoryLayout> fieldLayout = field.type.getLayout();
            if (fieldLayout.isEmpty())
            {
                return Optional.empty();
            }

            memberLayouts.add(fieldLayout.get());
            expectedOffset = fieldByteOffset + fieldLayout.get().byteSize();
        }

        if (this.size > expectedOffset)
        {
            memberLayouts.add(MemoryLayout.paddingLayout(this.size - expectedOffset));
        }

        return Optional.of(MemoryLayout.structLayout(memberLayouts.toArray(MemoryLayout[]::new)).withByteAlignment(this.alignment));
    }

    private Optional<MemoryLayout> computeLayoutUnion()
    {
        List<MemoryLayout> memberLayouts = new ArrayList<>();
        for (Field field : this.fields)
        {
            Optional<MemoryLayout> fieldLayout = field.type.getLayout().map(layout -> layout.withByteAlignment(Math.max(this.alignment, layout.byteAlignment())));
            if (fieldLayout.isEmpty())
            {
                return Optional.empty();
            }

            memberLayouts.add(fieldLayout.get());
        }

        return Optional.of(MemoryLayout.unionLayout(memberLayouts.toArray(MemoryLayout[]::new)).withByteAlignment(this.alignment));
    }

    @Override
    public Optional<MemoryLayout> getLayout()
    {
        if (this.fields.length == 0)
        {
            return Optional.empty();
        }

        return this.shape == Shape.UNION ? this.computeLayoutUnion() : this.computeLayoutStruct();
    }

    @Override
    public String toString()
    {
        if (this.fields.length == 0)
        {
            return STR."IncompleteRecord[\{this.name}:\{this.shape}]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.fields[0]);
        for (int i = 1; i < this.fields.length; i++)
        {
            builder.append(STR.",\{this.fields[i]}");
        }

        return STR."Record[\{this.name}:\{this.shape}, fields={\{builder.toString()}}, size=\{this.size}, alignment=\{this.alignment}]";
    }
}
