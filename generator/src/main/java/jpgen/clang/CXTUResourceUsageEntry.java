package jpgen.clang;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$amount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$amount = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$kind,
            LAYOUT$amount
    ).withName("CXTUResourceUsageEntry");

    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public int amount() {return this.ptr.get(LAYOUT$amount, OFFSET$amount);}
    public void amount(int value) {this.ptr.set(LAYOUT$amount, OFFSET$amount, value);}
    public java.lang.foreign.MemorySegment amount_ptr() {return this.ptr.asSlice(OFFSET$amount, LAYOUT$amount);}
}
