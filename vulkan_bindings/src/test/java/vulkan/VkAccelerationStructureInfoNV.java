package vulkan;

public record VkAccelerationStructureInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$instanceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$instanceCount = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$geometryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$geometryCount = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pGeometries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pGeometries = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$type,
            LAYOUT$flags,
            LAYOUT$instanceCount,
            LAYOUT$geometryCount,
            LAYOUT$pGeometries
    ).withName("VkAccelerationStructureInfoNV");

    public VkAccelerationStructureInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int instanceCount() {return this.ptr.get(LAYOUT$instanceCount, OFFSET$instanceCount);}
    public void instanceCount(int value) {this.ptr.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);}
    public java.lang.foreign.MemorySegment instanceCount_ptr() {return this.ptr.asSlice(OFFSET$instanceCount, LAYOUT$instanceCount);}

    public int geometryCount() {return this.ptr.get(LAYOUT$geometryCount, OFFSET$geometryCount);}
    public void geometryCount(int value) {this.ptr.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);}
    public java.lang.foreign.MemorySegment geometryCount_ptr() {return this.ptr.asSlice(OFFSET$geometryCount, LAYOUT$geometryCount);}

    public java.lang.foreign.MemorySegment pGeometries() {return this.ptr.get(LAYOUT$pGeometries, OFFSET$pGeometries);}
    public void pGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);}
    public java.lang.foreign.MemorySegment pGeometries_ptr() {return this.ptr.asSlice(OFFSET$pGeometries, LAYOUT$pGeometries);}
}
