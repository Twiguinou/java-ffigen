package vulkan;

public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$perViewRenderAreaCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$perViewRenderAreaCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPerViewRenderAreas = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPerViewRenderAreas = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$perViewRenderAreaCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPerViewRenderAreas
    ).withName("VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM");

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int perViewRenderAreaCount() {return this.ptr.get(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount);}
    public void perViewRenderAreaCount(int value) {this.ptr.set(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount, value);}
    public java.lang.foreign.MemorySegment perViewRenderAreaCount_ptr() {return this.ptr.asSlice(OFFSET$perViewRenderAreaCount, LAYOUT$perViewRenderAreaCount);}

    public java.lang.foreign.MemorySegment pPerViewRenderAreas() {return this.ptr.get(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas);}
    public void pPerViewRenderAreas(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas, value);}
    public java.lang.foreign.MemorySegment pPerViewRenderAreas_ptr() {return this.ptr.asSlice(OFFSET$pPerViewRenderAreas, LAYOUT$pPerViewRenderAreas);}
}
