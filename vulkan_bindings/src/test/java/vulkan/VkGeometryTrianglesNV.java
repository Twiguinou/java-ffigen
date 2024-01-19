package vulkan;

public record VkGeometryTrianglesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vertexData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vertexData = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vertexOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vertexOffset = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vertexCount = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vertexStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vertexStride = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vertexFormat = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$indexData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$indexData = 56L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$indexOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$indexOffset = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$indexCount = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$indexType = 76L;
    public static final java.lang.foreign.AddressLayout LAYOUT$transformData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$transformData = 80L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$transformOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$transformOffset = 88L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$vertexData,
            LAYOUT$vertexOffset,
            LAYOUT$vertexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$vertexStride,
            LAYOUT$vertexFormat,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$indexData,
            LAYOUT$indexOffset,
            LAYOUT$indexCount,
            LAYOUT$indexType,
            LAYOUT$transformData,
            LAYOUT$transformOffset
    ).withName("VkGeometryTrianglesNV");

    public VkGeometryTrianglesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment vertexData() {return this.ptr.get(LAYOUT$vertexData, OFFSET$vertexData);}
    public void vertexData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vertexData, OFFSET$vertexData, value);}
    public java.lang.foreign.MemorySegment vertexData_ptr() {return this.ptr.asSlice(OFFSET$vertexData, LAYOUT$vertexData);}

    public long vertexOffset() {return this.ptr.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);}
    public void vertexOffset(long value) {this.ptr.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);}
    public java.lang.foreign.MemorySegment vertexOffset_ptr() {return this.ptr.asSlice(OFFSET$vertexOffset, LAYOUT$vertexOffset);}

    public int vertexCount() {return this.ptr.get(LAYOUT$vertexCount, OFFSET$vertexCount);}
    public void vertexCount(int value) {this.ptr.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);}
    public java.lang.foreign.MemorySegment vertexCount_ptr() {return this.ptr.asSlice(OFFSET$vertexCount, LAYOUT$vertexCount);}

    public long vertexStride() {return this.ptr.get(LAYOUT$vertexStride, OFFSET$vertexStride);}
    public void vertexStride(long value) {this.ptr.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);}
    public java.lang.foreign.MemorySegment vertexStride_ptr() {return this.ptr.asSlice(OFFSET$vertexStride, LAYOUT$vertexStride);}

    public int vertexFormat() {return this.ptr.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);}
    public void vertexFormat(int value) {this.ptr.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);}
    public java.lang.foreign.MemorySegment vertexFormat_ptr() {return this.ptr.asSlice(OFFSET$vertexFormat, LAYOUT$vertexFormat);}

    public java.lang.foreign.MemorySegment indexData() {return this.ptr.get(LAYOUT$indexData, OFFSET$indexData);}
    public void indexData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$indexData, OFFSET$indexData, value);}
    public java.lang.foreign.MemorySegment indexData_ptr() {return this.ptr.asSlice(OFFSET$indexData, LAYOUT$indexData);}

    public long indexOffset() {return this.ptr.get(LAYOUT$indexOffset, OFFSET$indexOffset);}
    public void indexOffset(long value) {this.ptr.set(LAYOUT$indexOffset, OFFSET$indexOffset, value);}
    public java.lang.foreign.MemorySegment indexOffset_ptr() {return this.ptr.asSlice(OFFSET$indexOffset, LAYOUT$indexOffset);}

    public int indexCount() {return this.ptr.get(LAYOUT$indexCount, OFFSET$indexCount);}
    public void indexCount(int value) {this.ptr.set(LAYOUT$indexCount, OFFSET$indexCount, value);}
    public java.lang.foreign.MemorySegment indexCount_ptr() {return this.ptr.asSlice(OFFSET$indexCount, LAYOUT$indexCount);}

    public int indexType() {return this.ptr.get(LAYOUT$indexType, OFFSET$indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT$indexType, OFFSET$indexType, value);}
    public java.lang.foreign.MemorySegment indexType_ptr() {return this.ptr.asSlice(OFFSET$indexType, LAYOUT$indexType);}

    public java.lang.foreign.MemorySegment transformData() {return this.ptr.get(LAYOUT$transformData, OFFSET$transformData);}
    public void transformData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$transformData, OFFSET$transformData, value);}
    public java.lang.foreign.MemorySegment transformData_ptr() {return this.ptr.asSlice(OFFSET$transformData, LAYOUT$transformData);}

    public long transformOffset() {return this.ptr.get(LAYOUT$transformOffset, OFFSET$transformOffset);}
    public void transformOffset(long value) {this.ptr.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);}
    public java.lang.foreign.MemorySegment transformOffset_ptr() {return this.ptr.asSlice(OFFSET$transformOffset, LAYOUT$transformOffset);}
}
