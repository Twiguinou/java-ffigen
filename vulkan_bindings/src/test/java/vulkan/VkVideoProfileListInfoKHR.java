package vulkan;

public record VkVideoProfileListInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$profileCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$profileCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pProfiles = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pProfiles = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$profileCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pProfiles
    ).withName("VkVideoProfileListInfoKHR");

    public VkVideoProfileListInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int profileCount() {return this.ptr.get(LAYOUT$profileCount, OFFSET$profileCount);}
    public void profileCount(int value) {this.ptr.set(LAYOUT$profileCount, OFFSET$profileCount, value);}
    public java.lang.foreign.MemorySegment profileCount_ptr() {return this.ptr.asSlice(OFFSET$profileCount, LAYOUT$profileCount);}

    public java.lang.foreign.MemorySegment pProfiles() {return this.ptr.get(LAYOUT$pProfiles, OFFSET$pProfiles);}
    public void pProfiles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pProfiles, OFFSET$pProfiles, value);}
    public java.lang.foreign.MemorySegment pProfiles_ptr() {return this.ptr.asSlice(OFFSET$pProfiles, LAYOUT$pProfiles);}
}
