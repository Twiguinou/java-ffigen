package jpgen;

import jpgen.clang.CXType;

import java.lang.foreign.Arena;

import static jpgen.clang.Index_h.*;

public record TypeKey(CXType internal)
{
    public TypeKey(Arena arena, TypeKey old)
    {
        this(new CXType(arena.allocate(CXType.gStructLayout).copyFrom(old.internal.ptr())));
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof TypeKey(CXType ctype) && clang_equalTypes(ctype, this.internal) != 0);
    }

    @Override
    public int hashCode()
    {
        try (Arena arena = Arena.ofConfined())
        {
            return ForeignUtils.retrieveString(clang_getTypeSpelling(arena, this.internal)).hashCode();
        }
    }
}
