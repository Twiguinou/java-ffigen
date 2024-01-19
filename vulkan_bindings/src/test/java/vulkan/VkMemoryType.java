package vulkan;

public record VkMemoryType(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$propertyFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$propertyFlags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$heapIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$heapIndex = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$propertyFlags,
            LAYOUT$heapIndex
    ).withName("VkMemoryType");

    public VkMemoryType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int propertyFlags() {return this.ptr.get(LAYOUT$propertyFlags, OFFSET$propertyFlags);}
    public void propertyFlags(int value) {this.ptr.set(LAYOUT$propertyFlags, OFFSET$propertyFlags, value);}
    public java.lang.foreign.MemorySegment propertyFlags_ptr() {return this.ptr.asSlice(OFFSET$propertyFlags, LAYOUT$propertyFlags);}

    public int heapIndex() {return this.ptr.get(LAYOUT$heapIndex, OFFSET$heapIndex);}
    public void heapIndex(int value) {this.ptr.set(LAYOUT$heapIndex, OFFSET$heapIndex, value);}
    public java.lang.foreign.MemorySegment heapIndex_ptr() {return this.ptr.asSlice(OFFSET$heapIndex, LAYOUT$heapIndex);}
}
