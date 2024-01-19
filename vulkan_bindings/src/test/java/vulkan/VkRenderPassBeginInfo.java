package vulkan;

public record VkRenderPassBeginInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$renderPass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$renderPass = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$framebuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$framebuffer = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$renderArea = vulkan.VkRect2D.gStructLayout;
    public static final long OFFSET$renderArea = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clearValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$clearValueCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pClearValues = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pClearValues = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$renderPass,
            LAYOUT$framebuffer,
            LAYOUT$renderArea,
            LAYOUT$clearValueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pClearValues
    ).withName("VkRenderPassBeginInfo");

    public VkRenderPassBeginInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment framebuffer() {return this.ptr.get(LAYOUT$framebuffer, OFFSET$framebuffer);}
    public void framebuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$framebuffer, OFFSET$framebuffer, value);}
    public java.lang.foreign.MemorySegment framebuffer_ptr() {return this.ptr.asSlice(OFFSET$framebuffer, LAYOUT$framebuffer);}

    public vulkan.VkRect2D renderArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$renderArea, LAYOUT$renderArea));}

    public int clearValueCount() {return this.ptr.get(LAYOUT$clearValueCount, OFFSET$clearValueCount);}
    public void clearValueCount(int value) {this.ptr.set(LAYOUT$clearValueCount, OFFSET$clearValueCount, value);}
    public java.lang.foreign.MemorySegment clearValueCount_ptr() {return this.ptr.asSlice(OFFSET$clearValueCount, LAYOUT$clearValueCount);}

    public java.lang.foreign.MemorySegment pClearValues() {return this.ptr.get(LAYOUT$pClearValues, OFFSET$pClearValues);}
    public void pClearValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pClearValues, OFFSET$pClearValues, value);}
    public java.lang.foreign.MemorySegment pClearValues_ptr() {return this.ptr.asSlice(OFFSET$pClearValues, LAYOUT$pClearValues);}
}
