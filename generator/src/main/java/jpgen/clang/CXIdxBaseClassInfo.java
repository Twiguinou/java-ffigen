package jpgen.clang;

public record CXIdxBaseClassInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$base = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$base = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$loc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$loc = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$base,
            LAYOUT$cursor,
            LAYOUT$loc
    ).withName("CXIdxBaseClassInfo");

    public CXIdxBaseClassInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment base() {return this.ptr.get(LAYOUT$base, OFFSET$base);}
    public void base(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$base, OFFSET$base, value);}
    public java.lang.foreign.MemorySegment base_ptr() {return this.ptr.asSlice(OFFSET$base, LAYOUT$base);}

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
}
