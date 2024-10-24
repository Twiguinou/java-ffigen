package fr.kenlek.jpgen;

import java.lang.foreign.MemoryLayout;

public sealed interface Member
{
    record Field(MemoryLayout layout) implements Member {}

    record Bitfield(MemoryLayout layout, long width) implements Member
    {
        public Bitfield
        {
            if (width > 0 && width > layout.byteSize() * 8)
            {
                throw new IllegalArgumentException("Bit-field is wider than underlying type!");
            }
        }
    }

    MemoryLayout layout();
}
