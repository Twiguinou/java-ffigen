package vulkan;

public record VkPipelineDepthStencilStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthTestEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthTestEnable = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthWriteEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthWriteEnable = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthCompareOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthCompareOp = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBoundsTestEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthBoundsTestEnable = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilTestEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stencilTestEnable = 36L;
    public static final java.lang.foreign.GroupLayout LAYOUT$front = vulkan.VkStencilOpState.gStructLayout;
    public static final long OFFSET$front = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$back = vulkan.VkStencilOpState.gStructLayout;
    public static final long OFFSET$back = 68L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minDepthBounds = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minDepthBounds = 96L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxDepthBounds = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxDepthBounds = 100L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$depthTestEnable,
            LAYOUT$depthWriteEnable,
            LAYOUT$depthCompareOp,
            LAYOUT$depthBoundsTestEnable,
            LAYOUT$stencilTestEnable,
            LAYOUT$front,
            LAYOUT$back,
            LAYOUT$minDepthBounds,
            LAYOUT$maxDepthBounds
    ).withName("VkPipelineDepthStencilStateCreateInfo");

    public VkPipelineDepthStencilStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public int depthTestEnable() {return this.ptr.get(LAYOUT$depthTestEnable, OFFSET$depthTestEnable);}
    public void depthTestEnable(int value) {this.ptr.set(LAYOUT$depthTestEnable, OFFSET$depthTestEnable, value);}
    public java.lang.foreign.MemorySegment depthTestEnable_ptr() {return this.ptr.asSlice(OFFSET$depthTestEnable, LAYOUT$depthTestEnable);}

    public int depthWriteEnable() {return this.ptr.get(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable);}
    public void depthWriteEnable(int value) {this.ptr.set(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable, value);}
    public java.lang.foreign.MemorySegment depthWriteEnable_ptr() {return this.ptr.asSlice(OFFSET$depthWriteEnable, LAYOUT$depthWriteEnable);}

    public int depthCompareOp() {return this.ptr.get(LAYOUT$depthCompareOp, OFFSET$depthCompareOp);}
    public void depthCompareOp(int value) {this.ptr.set(LAYOUT$depthCompareOp, OFFSET$depthCompareOp, value);}
    public java.lang.foreign.MemorySegment depthCompareOp_ptr() {return this.ptr.asSlice(OFFSET$depthCompareOp, LAYOUT$depthCompareOp);}

    public int depthBoundsTestEnable() {return this.ptr.get(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable);}
    public void depthBoundsTestEnable(int value) {this.ptr.set(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable, value);}
    public java.lang.foreign.MemorySegment depthBoundsTestEnable_ptr() {return this.ptr.asSlice(OFFSET$depthBoundsTestEnable, LAYOUT$depthBoundsTestEnable);}

    public int stencilTestEnable() {return this.ptr.get(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable);}
    public void stencilTestEnable(int value) {this.ptr.set(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable, value);}
    public java.lang.foreign.MemorySegment stencilTestEnable_ptr() {return this.ptr.asSlice(OFFSET$stencilTestEnable, LAYOUT$stencilTestEnable);}

    public vulkan.VkStencilOpState front() {return new vulkan.VkStencilOpState(this.ptr.asSlice(OFFSET$front, LAYOUT$front));}

    public vulkan.VkStencilOpState back() {return new vulkan.VkStencilOpState(this.ptr.asSlice(OFFSET$back, LAYOUT$back));}

    public float minDepthBounds() {return this.ptr.get(LAYOUT$minDepthBounds, OFFSET$minDepthBounds);}
    public void minDepthBounds(float value) {this.ptr.set(LAYOUT$minDepthBounds, OFFSET$minDepthBounds, value);}
    public java.lang.foreign.MemorySegment minDepthBounds_ptr() {return this.ptr.asSlice(OFFSET$minDepthBounds, LAYOUT$minDepthBounds);}

    public float maxDepthBounds() {return this.ptr.get(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds);}
    public void maxDepthBounds(float value) {this.ptr.set(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds, value);}
    public java.lang.foreign.MemorySegment maxDepthBounds_ptr() {return this.ptr.asSlice(OFFSET$maxDepthBounds, LAYOUT$maxDepthBounds);}
}
