package vulkan;

public record VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveTopologyListRestart = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveTopologyListRestart = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveTopologyPatchListRestart = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveTopologyPatchListRestart = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$primitiveTopologyListRestart,
            LAYOUT$primitiveTopologyPatchListRestart
    ).withName("VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT");

    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int primitiveTopologyListRestart() {return this.ptr.get(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart);}
    public void primitiveTopologyListRestart(int value) {this.ptr.set(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart, value);}
    public java.lang.foreign.MemorySegment primitiveTopologyListRestart_ptr() {return this.ptr.asSlice(OFFSET$primitiveTopologyListRestart, LAYOUT$primitiveTopologyListRestart);}

    public int primitiveTopologyPatchListRestart() {return this.ptr.get(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart);}
    public void primitiveTopologyPatchListRestart(int value) {this.ptr.set(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart, value);}
    public java.lang.foreign.MemorySegment primitiveTopologyPatchListRestart_ptr() {return this.ptr.asSlice(OFFSET$primitiveTopologyPatchListRestart, LAYOUT$primitiveTopologyPatchListRestart);}
}
