package vulkan;

public record VkOpticalFlowSessionCreatePrivateDataInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$id = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$id = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPrivateData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPrivateData = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$id,
            LAYOUT$size,
            LAYOUT$pPrivateData
    ).withName("VkOpticalFlowSessionCreatePrivateDataInfoNV");

    public VkOpticalFlowSessionCreatePrivateDataInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int id() {return this.ptr.get(LAYOUT$id, OFFSET$id);}
    public void id(int value) {this.ptr.set(LAYOUT$id, OFFSET$id, value);}
    public java.lang.foreign.MemorySegment id_ptr() {return this.ptr.asSlice(OFFSET$id, LAYOUT$id);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment pPrivateData() {return this.ptr.get(LAYOUT$pPrivateData, OFFSET$pPrivateData);}
    public void pPrivateData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPrivateData, OFFSET$pPrivateData, value);}
    public java.lang.foreign.MemorySegment pPrivateData_ptr() {return this.ptr.asSlice(OFFSET$pPrivateData, LAYOUT$pPrivateData);}
}
