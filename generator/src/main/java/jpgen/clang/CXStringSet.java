package jpgen.clang;

public record CXStringSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$Strings = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$Strings = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$Count = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$Strings,
            LAYOUT$Count,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXStringSet");

    public CXStringSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXStringSet getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXStringSet(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment Strings() {return this.ptr.get(LAYOUT$Strings, OFFSET$Strings);}
    public void Strings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$Strings, OFFSET$Strings, value);}
    public java.lang.foreign.MemorySegment Strings_ptr() {return this.ptr.asSlice(OFFSET$Strings, LAYOUT$Strings);}

    public int Count() {return this.ptr.get(LAYOUT$Count, OFFSET$Count);}
    public void Count(int value) {this.ptr.set(LAYOUT$Count, OFFSET$Count, value);}
    public java.lang.foreign.MemorySegment Count_ptr() {return this.ptr.asSlice(OFFSET$Count, LAYOUT$Count);}
}
