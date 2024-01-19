package vulkan;

public record VkPhysicalDeviceVariablePointersFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variablePointersStorageBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$variablePointersStorageBuffer = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variablePointers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$variablePointers = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$variablePointersStorageBuffer,
            LAYOUT$variablePointers
    ).withName("VkPhysicalDeviceVariablePointersFeatures");

    public VkPhysicalDeviceVariablePointersFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int variablePointersStorageBuffer() {return this.ptr.get(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer);}
    public void variablePointersStorageBuffer(int value) {this.ptr.set(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer, value);}
    public java.lang.foreign.MemorySegment variablePointersStorageBuffer_ptr() {return this.ptr.asSlice(OFFSET$variablePointersStorageBuffer, LAYOUT$variablePointersStorageBuffer);}

    public int variablePointers() {return this.ptr.get(LAYOUT$variablePointers, OFFSET$variablePointers);}
    public void variablePointers(int value) {this.ptr.set(LAYOUT$variablePointers, OFFSET$variablePointers, value);}
    public java.lang.foreign.MemorySegment variablePointers_ptr() {return this.ptr.asSlice(OFFSET$variablePointers, LAYOUT$variablePointers);}
}
