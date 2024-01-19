package vulkan;

public record VkBufferImageCopy2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferOffset = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferRowLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferRowLength = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferImageHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferImageHeight = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$imageSubresource = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$imageOffset = 48L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageExtent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$imageExtent = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$bufferOffset,
            LAYOUT$bufferRowLength,
            LAYOUT$bufferImageHeight,
            LAYOUT$imageSubresource,
            LAYOUT$imageOffset,
            LAYOUT$imageExtent
    ).withName("VkBufferImageCopy2");

    public VkBufferImageCopy2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long bufferOffset() {return this.ptr.get(LAYOUT$bufferOffset, OFFSET$bufferOffset);}
    public void bufferOffset(long value) {this.ptr.set(LAYOUT$bufferOffset, OFFSET$bufferOffset, value);}
    public java.lang.foreign.MemorySegment bufferOffset_ptr() {return this.ptr.asSlice(OFFSET$bufferOffset, LAYOUT$bufferOffset);}

    public int bufferRowLength() {return this.ptr.get(LAYOUT$bufferRowLength, OFFSET$bufferRowLength);}
    public void bufferRowLength(int value) {this.ptr.set(LAYOUT$bufferRowLength, OFFSET$bufferRowLength, value);}
    public java.lang.foreign.MemorySegment bufferRowLength_ptr() {return this.ptr.asSlice(OFFSET$bufferRowLength, LAYOUT$bufferRowLength);}

    public int bufferImageHeight() {return this.ptr.get(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight);}
    public void bufferImageHeight(int value) {this.ptr.set(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight, value);}
    public java.lang.foreign.MemorySegment bufferImageHeight_ptr() {return this.ptr.asSlice(OFFSET$bufferImageHeight, LAYOUT$bufferImageHeight);}

    public vulkan.VkImageSubresourceLayers imageSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));}

    public vulkan.VkOffset3D imageOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));}

    public vulkan.VkExtent3D imageExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));}
}
