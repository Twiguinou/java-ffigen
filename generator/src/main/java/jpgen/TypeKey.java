package jpgen;

import jpgen.clang.CXType;

import java.lang.foreign.SegmentAllocator;

import static jpgen.clang.Index_h.*;

public record TypeKey(CXType internal)
{
    public TypeKey(SegmentAllocator allocator, TypeKey old)
    {
        this(new CXType(allocator.allocate(CXType.gStructLayout).copyFrom(old.internal.ptr())));
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof TypeKey(CXType ctype) && clang_equalTypes(ctype, this.internal) != 0);
    }

    @Override
    public int hashCode()
    {
        /*try (Arena arena = Arena.ofConfined())
        {
            return ForeignUtils.retrieveString(clang_getTypeSpelling(arena, this.internal)).hashCode();
        }*/
        long data1 = this.internal.data(0).address();
        long data2 = this.internal.data(1).address();
        // from JOML's Vector2L
        long result = 1;
        result = 31 * result + data1;
        result = 31 * result + data2;
        return (int) (result ^ (result >> 32));
    }
}
