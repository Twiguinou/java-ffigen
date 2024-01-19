package vulkan;

public record VkAabbPositionsKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minX = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minX = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minY = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minY = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minZ = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minZ = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxX = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxX = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxY = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxY = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxZ = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxZ = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$minX,
            LAYOUT$minY,
            LAYOUT$minZ,
            LAYOUT$maxX,
            LAYOUT$maxY,
            LAYOUT$maxZ
    ).withName("VkAabbPositionsKHR");

    public VkAabbPositionsKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public float minX() {return this.ptr.get(LAYOUT$minX, OFFSET$minX);}
    public void minX(float value) {this.ptr.set(LAYOUT$minX, OFFSET$minX, value);}
    public java.lang.foreign.MemorySegment minX_ptr() {return this.ptr.asSlice(OFFSET$minX, LAYOUT$minX);}

    public float minY() {return this.ptr.get(LAYOUT$minY, OFFSET$minY);}
    public void minY(float value) {this.ptr.set(LAYOUT$minY, OFFSET$minY, value);}
    public java.lang.foreign.MemorySegment minY_ptr() {return this.ptr.asSlice(OFFSET$minY, LAYOUT$minY);}

    public float minZ() {return this.ptr.get(LAYOUT$minZ, OFFSET$minZ);}
    public void minZ(float value) {this.ptr.set(LAYOUT$minZ, OFFSET$minZ, value);}
    public java.lang.foreign.MemorySegment minZ_ptr() {return this.ptr.asSlice(OFFSET$minZ, LAYOUT$minZ);}

    public float maxX() {return this.ptr.get(LAYOUT$maxX, OFFSET$maxX);}
    public void maxX(float value) {this.ptr.set(LAYOUT$maxX, OFFSET$maxX, value);}
    public java.lang.foreign.MemorySegment maxX_ptr() {return this.ptr.asSlice(OFFSET$maxX, LAYOUT$maxX);}

    public float maxY() {return this.ptr.get(LAYOUT$maxY, OFFSET$maxY);}
    public void maxY(float value) {this.ptr.set(LAYOUT$maxY, OFFSET$maxY, value);}
    public java.lang.foreign.MemorySegment maxY_ptr() {return this.ptr.asSlice(OFFSET$maxY, LAYOUT$maxY);}

    public float maxZ() {return this.ptr.get(LAYOUT$maxZ, OFFSET$maxZ);}
    public void maxZ(float value) {this.ptr.set(LAYOUT$maxZ, OFFSET$maxZ, value);}
    public java.lang.foreign.MemorySegment maxZ_ptr() {return this.ptr.asSlice(OFFSET$maxZ, LAYOUT$maxZ);}
}
