package vulkan;

public record VkGeometryAABBNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$aabbData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$aabbData = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numAABBs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$numAABBs = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stride = 28L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$aabbData,
            LAYOUT$numAABBs,
            LAYOUT$stride,
            LAYOUT$offset
    ).withName("VkGeometryAABBNV");

    public VkGeometryAABBNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment aabbData() {return this.ptr.get(LAYOUT$aabbData, OFFSET$aabbData);}
    public void aabbData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$aabbData, OFFSET$aabbData, value);}
    public java.lang.foreign.MemorySegment aabbData_ptr() {return this.ptr.asSlice(OFFSET$aabbData, LAYOUT$aabbData);}

    public int numAABBs() {return this.ptr.get(LAYOUT$numAABBs, OFFSET$numAABBs);}
    public void numAABBs(int value) {this.ptr.set(LAYOUT$numAABBs, OFFSET$numAABBs, value);}
    public java.lang.foreign.MemorySegment numAABBs_ptr() {return this.ptr.asSlice(OFFSET$numAABBs, LAYOUT$numAABBs);}

    public int stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
    public void stride(int value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
    public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}
}
