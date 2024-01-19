package vulkan;

public record VkDrawMeshTasksIndirectCommandEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupCountX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$groupCountX = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupCountY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$groupCountY = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupCountZ = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$groupCountZ = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$groupCountX,
            LAYOUT$groupCountY,
            LAYOUT$groupCountZ
    ).withName("VkDrawMeshTasksIndirectCommandEXT");

    public VkDrawMeshTasksIndirectCommandEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int groupCountX() {return this.ptr.get(LAYOUT$groupCountX, OFFSET$groupCountX);}
    public void groupCountX(int value) {this.ptr.set(LAYOUT$groupCountX, OFFSET$groupCountX, value);}
    public java.lang.foreign.MemorySegment groupCountX_ptr() {return this.ptr.asSlice(OFFSET$groupCountX, LAYOUT$groupCountX);}

    public int groupCountY() {return this.ptr.get(LAYOUT$groupCountY, OFFSET$groupCountY);}
    public void groupCountY(int value) {this.ptr.set(LAYOUT$groupCountY, OFFSET$groupCountY, value);}
    public java.lang.foreign.MemorySegment groupCountY_ptr() {return this.ptr.asSlice(OFFSET$groupCountY, LAYOUT$groupCountY);}

    public int groupCountZ() {return this.ptr.get(LAYOUT$groupCountZ, OFFSET$groupCountZ);}
    public void groupCountZ(int value) {this.ptr.set(LAYOUT$groupCountZ, OFFSET$groupCountZ, value);}
    public java.lang.foreign.MemorySegment groupCountZ_ptr() {return this.ptr.asSlice(OFFSET$groupCountZ, LAYOUT$groupCountZ);}
}
