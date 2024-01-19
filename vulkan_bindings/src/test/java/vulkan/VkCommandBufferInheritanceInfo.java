package vulkan;

public record VkCommandBufferInheritanceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$renderPass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$renderPass = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpass = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$framebuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$framebuffer = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$occlusionQueryEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$occlusionQueryEnable = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queryFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queryFlags = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineStatistics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineStatistics = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$renderPass,
            LAYOUT$subpass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$framebuffer,
            LAYOUT$occlusionQueryEnable,
            LAYOUT$queryFlags,
            LAYOUT$pipelineStatistics,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkCommandBufferInheritanceInfo");

    public VkCommandBufferInheritanceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT$renderPass, OFFSET$renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$renderPass, OFFSET$renderPass, value);}
    public java.lang.foreign.MemorySegment renderPass_ptr() {return this.ptr.asSlice(OFFSET$renderPass, LAYOUT$renderPass);}

    public int subpass() {return this.ptr.get(LAYOUT$subpass, OFFSET$subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT$subpass, OFFSET$subpass, value);}
    public java.lang.foreign.MemorySegment subpass_ptr() {return this.ptr.asSlice(OFFSET$subpass, LAYOUT$subpass);}

    public java.lang.foreign.MemorySegment framebuffer() {return this.ptr.get(LAYOUT$framebuffer, OFFSET$framebuffer);}
    public void framebuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$framebuffer, OFFSET$framebuffer, value);}
    public java.lang.foreign.MemorySegment framebuffer_ptr() {return this.ptr.asSlice(OFFSET$framebuffer, LAYOUT$framebuffer);}

    public int occlusionQueryEnable() {return this.ptr.get(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable);}
    public void occlusionQueryEnable(int value) {this.ptr.set(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable, value);}
    public java.lang.foreign.MemorySegment occlusionQueryEnable_ptr() {return this.ptr.asSlice(OFFSET$occlusionQueryEnable, LAYOUT$occlusionQueryEnable);}

    public int queryFlags() {return this.ptr.get(LAYOUT$queryFlags, OFFSET$queryFlags);}
    public void queryFlags(int value) {this.ptr.set(LAYOUT$queryFlags, OFFSET$queryFlags, value);}
    public java.lang.foreign.MemorySegment queryFlags_ptr() {return this.ptr.asSlice(OFFSET$queryFlags, LAYOUT$queryFlags);}

    public int pipelineStatistics() {return this.ptr.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);}
    public void pipelineStatistics(int value) {this.ptr.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);}
    public java.lang.foreign.MemorySegment pipelineStatistics_ptr() {return this.ptr.asSlice(OFFSET$pipelineStatistics, LAYOUT$pipelineStatistics);}
}
