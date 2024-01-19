package vulkan;

public record VkDeviceGroupPresentCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$presentMask = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$presentMask = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$modes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$modes = 144L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$presentMask,
            LAYOUT$modes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceGroupPresentCapabilitiesKHR");

    public VkDeviceGroupPresentCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment presentMask() {return this.ptr.asSlice(OFFSET$presentMask, LAYOUT$presentMask);}
    public int presentMask(int i) {return this.presentMask().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void presentMask(int i, int value) {this.presentMask().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int modes() {return this.ptr.get(LAYOUT$modes, OFFSET$modes);}
    public void modes(int value) {this.ptr.set(LAYOUT$modes, OFFSET$modes, value);}
    public java.lang.foreign.MemorySegment modes_ptr() {return this.ptr.asSlice(OFFSET$modes, LAYOUT$modes);}
}
