package vulkan;

public record VkPipelineVertexInputStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexBindingDescriptionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vertexBindingDescriptionCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVertexBindingDescriptions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVertexBindingDescriptions = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexAttributeDescriptionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vertexAttributeDescriptionCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVertexAttributeDescriptions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVertexAttributeDescriptions = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$vertexBindingDescriptionCount,
            LAYOUT$pVertexBindingDescriptions,
            LAYOUT$vertexAttributeDescriptionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pVertexAttributeDescriptions
    ).withName("VkPipelineVertexInputStateCreateInfo");

    public VkPipelineVertexInputStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int vertexBindingDescriptionCount() {return this.ptr.get(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount);}
    public void vertexBindingDescriptionCount(int value) {this.ptr.set(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount, value);}
    public java.lang.foreign.MemorySegment vertexBindingDescriptionCount_ptr() {return this.ptr.asSlice(OFFSET$vertexBindingDescriptionCount, LAYOUT$vertexBindingDescriptionCount);}

    public java.lang.foreign.MemorySegment pVertexBindingDescriptions() {return this.ptr.get(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions);}
    public void pVertexBindingDescriptions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions, value);}
    public java.lang.foreign.MemorySegment pVertexBindingDescriptions_ptr() {return this.ptr.asSlice(OFFSET$pVertexBindingDescriptions, LAYOUT$pVertexBindingDescriptions);}

    public int vertexAttributeDescriptionCount() {return this.ptr.get(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount);}
    public void vertexAttributeDescriptionCount(int value) {this.ptr.set(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount, value);}
    public java.lang.foreign.MemorySegment vertexAttributeDescriptionCount_ptr() {return this.ptr.asSlice(OFFSET$vertexAttributeDescriptionCount, LAYOUT$vertexAttributeDescriptionCount);}

    public java.lang.foreign.MemorySegment pVertexAttributeDescriptions() {return this.ptr.get(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions);}
    public void pVertexAttributeDescriptions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions, value);}
    public java.lang.foreign.MemorySegment pVertexAttributeDescriptions_ptr() {return this.ptr.asSlice(OFFSET$pVertexAttributeDescriptions, LAYOUT$pVertexAttributeDescriptions);}
}
