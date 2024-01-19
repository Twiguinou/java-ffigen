package vulkan;

public record VkPhysicalDeviceSubgroupSizeControlFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSizeControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupSizeControl = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeFullSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeFullSubgroups = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$subgroupSizeControl,
            LAYOUT$computeFullSubgroups
    ).withName("VkPhysicalDeviceSubgroupSizeControlFeatures");

    public VkPhysicalDeviceSubgroupSizeControlFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int subgroupSizeControl() {return this.ptr.get(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl);}
    public void subgroupSizeControl(int value) {this.ptr.set(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl, value);}
    public java.lang.foreign.MemorySegment subgroupSizeControl_ptr() {return this.ptr.asSlice(OFFSET$subgroupSizeControl, LAYOUT$subgroupSizeControl);}

    public int computeFullSubgroups() {return this.ptr.get(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups);}
    public void computeFullSubgroups(int value) {this.ptr.set(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups, value);}
    public java.lang.foreign.MemorySegment computeFullSubgroups_ptr() {return this.ptr.asSlice(OFFSET$computeFullSubgroups, LAYOUT$computeFullSubgroups);}
}
