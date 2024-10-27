package fr.kenlek.jpgen;

import java.lang.foreign.MemoryLayout;

public sealed interface Member
{
    record Field(MemoryLayout layout) implements Member {}

    record Bitfield(MemoryLayout layout, long width) implements Member
    {
        public Bitfield
        {
            if (width < 0)
            {
                throw new IllegalArgumentException("Bit-field has strictly negative width.");
            }

            if (width == 0 && layout.name().isPresent())
            {
                throw new IllegalArgumentException("Empty bit-fields must be unnamed.");
            }

            if (width > layout.byteSize() * 8)
            {
                throw new IllegalArgumentException("Bit-field is wider than its underlying type.");
            }
        }
    }

    MemoryLayout layout();
}
