package jpgen.data2;

import jpgen.SourceScopeScanner;
import jpgen.clang.CXType;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SegmentAllocator;
import java.util.Arrays;
import java.util.Optional;

import static jpgen.clang.Index_h.*;

/**
 * Essentially a wrapper for instances of Clang's internal type representation. We mostly use it as a key in
 * the type dictionary of {@link SourceScopeScanner}.
 * @param internal The type to wrap, this object stays valid as long as the wrapped object stays accessible.
 */
public record TypeKey(CXType internal) implements Type
{
    public TypeKey(SegmentAllocator allocator, TypeKey old)
    {
        this(new CXType(allocator.allocate(CXType.gStructLayout).copyFrom(old.internal.ptr())));
    }

    @Override
    public Optional<MemoryLayout> layout()
    {
        return Optional.empty();
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof TypeKey(CXType ctype) && clang_equalTypes(ctype, this.internal) != 0);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(new long[] {
                this.internal.data(0).address(),
                this.internal.data(1).address()
        });
    }
}
