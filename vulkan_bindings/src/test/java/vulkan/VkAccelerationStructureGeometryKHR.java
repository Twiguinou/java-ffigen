package vulkan;

public record VkAccelerationStructureGeometryKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$geometryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$geometryType = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$geometry = vulkan.VkAccelerationStructureGeometryDataKHR.gStructLayout;
    public static final long OFFSET$geometry = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 88L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$geometryType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$geometry,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkAccelerationStructureGeometryKHR");

    public VkAccelerationStructureGeometryKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int geometryType() {return this.ptr.get(LAYOUT$geometryType, OFFSET$geometryType);}
    public void geometryType(int value) {this.ptr.set(LAYOUT$geometryType, OFFSET$geometryType, value);}
    public java.lang.foreign.MemorySegment geometryType_ptr() {return this.ptr.asSlice(OFFSET$geometryType, LAYOUT$geometryType);}

    public vulkan.VkAccelerationStructureGeometryDataKHR geometry() {return new vulkan.VkAccelerationStructureGeometryDataKHR(this.ptr.asSlice(OFFSET$geometry, LAYOUT$geometry));}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}
