package vulkan;

public record VkCopyMemoryIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$srcAddress = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dstAddress = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$srcAddress,
            LAYOUT$dstAddress,
            LAYOUT$size
    ).withName("VkCopyMemoryIndirectCommandNV");

    public VkCopyMemoryIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long srcAddress() {return this.ptr.get(LAYOUT$srcAddress, OFFSET$srcAddress);}
    public void srcAddress(long value) {this.ptr.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);}
    public java.lang.foreign.MemorySegment srcAddress_ptr() {return this.ptr.asSlice(OFFSET$srcAddress, LAYOUT$srcAddress);}

    public long dstAddress() {return this.ptr.get(LAYOUT$dstAddress, OFFSET$dstAddress);}
    public void dstAddress(long value) {this.ptr.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);}
    public java.lang.foreign.MemorySegment dstAddress_ptr() {return this.ptr.asSlice(OFFSET$dstAddress, LAYOUT$dstAddress);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}
