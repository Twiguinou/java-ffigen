package vulkan;

public record VkImportSemaphoreFdInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$semaphore = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$semaphore = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$handleType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$handleType = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fd = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$semaphore,
            LAYOUT$flags,
            LAYOUT$handleType,
            LAYOUT$fd,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkImportSemaphoreFdInfoKHR");

    public VkImportSemaphoreFdInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment semaphore() {return this.ptr.get(LAYOUT$semaphore, OFFSET$semaphore);}
    public void semaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$semaphore, OFFSET$semaphore, value);}
    public java.lang.foreign.MemorySegment semaphore_ptr() {return this.ptr.asSlice(OFFSET$semaphore, LAYOUT$semaphore);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int handleType() {return this.ptr.get(LAYOUT$handleType, OFFSET$handleType);}
    public void handleType(int value) {this.ptr.set(LAYOUT$handleType, OFFSET$handleType, value);}
    public java.lang.foreign.MemorySegment handleType_ptr() {return this.ptr.asSlice(OFFSET$handleType, LAYOUT$handleType);}

    public int fd() {return this.ptr.get(LAYOUT$fd, OFFSET$fd);}
    public void fd(int value) {this.ptr.set(LAYOUT$fd, OFFSET$fd, value);}
    public java.lang.foreign.MemorySegment fd_ptr() {return this.ptr.asSlice(OFFSET$fd, LAYOUT$fd);}
}
