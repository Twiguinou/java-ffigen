package vulkan;

public record VkSparseMemoryBind(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$resourceOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$resourceOffset = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$memory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$memory = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$memoryOffset = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$resourceOffset,
            LAYOUT$size,
            LAYOUT$memory,
            LAYOUT$memoryOffset,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSparseMemoryBind");

    public VkSparseMemoryBind(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long resourceOffset() {return this.ptr.get(LAYOUT$resourceOffset, OFFSET$resourceOffset);}
    public void resourceOffset(long value) {this.ptr.set(LAYOUT$resourceOffset, OFFSET$resourceOffset, value);}
    public java.lang.foreign.MemorySegment resourceOffset_ptr() {return this.ptr.asSlice(OFFSET$resourceOffset, LAYOUT$resourceOffset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT$memory, OFFSET$memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$memory, OFFSET$memory, value);}
    public java.lang.foreign.MemorySegment memory_ptr() {return this.ptr.asSlice(OFFSET$memory, LAYOUT$memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);}
    public java.lang.foreign.MemorySegment memoryOffset_ptr() {return this.ptr.asSlice(OFFSET$memoryOffset, LAYOUT$memoryOffset);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}
