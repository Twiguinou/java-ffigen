package vulkan;

public record VkPipelineLibraryCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$libraryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$libraryCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pLibraries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pLibraries = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$libraryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pLibraries
    ).withName("VkPipelineLibraryCreateInfoKHR");

    public VkPipelineLibraryCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int libraryCount() {return this.ptr.get(LAYOUT$libraryCount, OFFSET$libraryCount);}
    public void libraryCount(int value) {this.ptr.set(LAYOUT$libraryCount, OFFSET$libraryCount, value);}
    public java.lang.foreign.MemorySegment libraryCount_ptr() {return this.ptr.asSlice(OFFSET$libraryCount, LAYOUT$libraryCount);}

    public java.lang.foreign.MemorySegment pLibraries() {return this.ptr.get(LAYOUT$pLibraries, OFFSET$pLibraries);}
    public void pLibraries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLibraries, OFFSET$pLibraries, value);}
    public java.lang.foreign.MemorySegment pLibraries_ptr() {return this.ptr.asSlice(OFFSET$pLibraries, LAYOUT$pLibraries);}
}
