package vulkan;

public record VkDeviceMemoryReportCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 20L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$memoryObjectId = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$memoryObjectId = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$objectType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$objectType = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$objectHandle = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$objectHandle = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$heapIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$heapIndex = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$type,
            LAYOUT$memoryObjectId,
            LAYOUT$size,
            LAYOUT$objectType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$objectHandle,
            LAYOUT$heapIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceMemoryReportCallbackDataEXT");

    public VkDeviceMemoryReportCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
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

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public long memoryObjectId() {return this.ptr.get(LAYOUT$memoryObjectId, OFFSET$memoryObjectId);}
    public void memoryObjectId(long value) {this.ptr.set(LAYOUT$memoryObjectId, OFFSET$memoryObjectId, value);}
    public java.lang.foreign.MemorySegment memoryObjectId_ptr() {return this.ptr.asSlice(OFFSET$memoryObjectId, LAYOUT$memoryObjectId);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int objectType() {return this.ptr.get(LAYOUT$objectType, OFFSET$objectType);}
    public void objectType(int value) {this.ptr.set(LAYOUT$objectType, OFFSET$objectType, value);}
    public java.lang.foreign.MemorySegment objectType_ptr() {return this.ptr.asSlice(OFFSET$objectType, LAYOUT$objectType);}

    public long objectHandle() {return this.ptr.get(LAYOUT$objectHandle, OFFSET$objectHandle);}
    public void objectHandle(long value) {this.ptr.set(LAYOUT$objectHandle, OFFSET$objectHandle, value);}
    public java.lang.foreign.MemorySegment objectHandle_ptr() {return this.ptr.asSlice(OFFSET$objectHandle, LAYOUT$objectHandle);}

    public int heapIndex() {return this.ptr.get(LAYOUT$heapIndex, OFFSET$heapIndex);}
    public void heapIndex(int value) {this.ptr.set(LAYOUT$heapIndex, OFFSET$heapIndex, value);}
    public java.lang.foreign.MemorySegment heapIndex_ptr() {return this.ptr.asSlice(OFFSET$heapIndex, LAYOUT$heapIndex);}
}
