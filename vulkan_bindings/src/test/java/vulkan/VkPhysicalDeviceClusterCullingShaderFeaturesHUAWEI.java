package vulkan;

public record VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clustercullingShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$clustercullingShader = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewClusterCullingShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewClusterCullingShader = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$clustercullingShader,
            LAYOUT$multiviewClusterCullingShader
    ).withName("VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI");

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int clustercullingShader() {return this.ptr.get(LAYOUT$clustercullingShader, OFFSET$clustercullingShader);}
    public void clustercullingShader(int value) {this.ptr.set(LAYOUT$clustercullingShader, OFFSET$clustercullingShader, value);}
    public java.lang.foreign.MemorySegment clustercullingShader_ptr() {return this.ptr.asSlice(OFFSET$clustercullingShader, LAYOUT$clustercullingShader);}

    public int multiviewClusterCullingShader() {return this.ptr.get(LAYOUT$multiviewClusterCullingShader, OFFSET$multiviewClusterCullingShader);}
    public void multiviewClusterCullingShader(int value) {this.ptr.set(LAYOUT$multiviewClusterCullingShader, OFFSET$multiviewClusterCullingShader, value);}
    public java.lang.foreign.MemorySegment multiviewClusterCullingShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewClusterCullingShader, LAYOUT$multiviewClusterCullingShader);}
}
