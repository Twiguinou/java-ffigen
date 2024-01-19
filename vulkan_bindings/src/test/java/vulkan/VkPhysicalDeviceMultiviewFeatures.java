package vulkan;

public record VkPhysicalDeviceMultiviewFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiview = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiview = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewGeometryShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewGeometryShader = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewTessellationShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewTessellationShader = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$multiview,
            LAYOUT$multiviewGeometryShader,
            LAYOUT$multiviewTessellationShader,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceMultiviewFeatures");

    public VkPhysicalDeviceMultiviewFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int multiview() {return this.ptr.get(LAYOUT$multiview, OFFSET$multiview);}
    public void multiview(int value) {this.ptr.set(LAYOUT$multiview, OFFSET$multiview, value);}
    public java.lang.foreign.MemorySegment multiview_ptr() {return this.ptr.asSlice(OFFSET$multiview, LAYOUT$multiview);}

    public int multiviewGeometryShader() {return this.ptr.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);}
    public void multiviewGeometryShader(int value) {this.ptr.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);}
    public java.lang.foreign.MemorySegment multiviewGeometryShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewGeometryShader, LAYOUT$multiviewGeometryShader);}

    public int multiviewTessellationShader() {return this.ptr.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);}
    public void multiviewTessellationShader(int value) {this.ptr.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);}
    public java.lang.foreign.MemorySegment multiviewTessellationShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewTessellationShader, LAYOUT$multiviewTessellationShader);}
}
