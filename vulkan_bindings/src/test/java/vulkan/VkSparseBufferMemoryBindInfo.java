package vulkan;

public record VkSparseBufferMemoryBindInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$buffer = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bindCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bindCount = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pBinds = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pBinds = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$buffer,
            LAYOUT$bindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pBinds
    ).withName("VkSparseBufferMemoryBindInfo");

    public VkSparseBufferMemoryBindInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT$buffer, OFFSET$buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
    public java.lang.foreign.MemorySegment buffer_ptr() {return this.ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

    public int bindCount() {return this.ptr.get(LAYOUT$bindCount, OFFSET$bindCount);}
    public void bindCount(int value) {this.ptr.set(LAYOUT$bindCount, OFFSET$bindCount, value);}
    public java.lang.foreign.MemorySegment bindCount_ptr() {return this.ptr.asSlice(OFFSET$bindCount, LAYOUT$bindCount);}

    public java.lang.foreign.MemorySegment pBinds() {return this.ptr.get(LAYOUT$pBinds, OFFSET$pBinds);}
    public void pBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBinds, OFFSET$pBinds, value);}
    public java.lang.foreign.MemorySegment pBinds_ptr() {return this.ptr.asSlice(OFFSET$pBinds, LAYOUT$pBinds);}
}
