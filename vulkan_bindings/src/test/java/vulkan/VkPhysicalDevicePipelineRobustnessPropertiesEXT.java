package vulkan;

public record VkPhysicalDevicePipelineRobustnessPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$defaultRobustnessStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$defaultRobustnessStorageBuffers = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$defaultRobustnessUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$defaultRobustnessUniformBuffers = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$defaultRobustnessVertexInputs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$defaultRobustnessVertexInputs = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$defaultRobustnessImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$defaultRobustnessImages = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$defaultRobustnessStorageBuffers,
            LAYOUT$defaultRobustnessUniformBuffers,
            LAYOUT$defaultRobustnessVertexInputs,
            LAYOUT$defaultRobustnessImages
    ).withName("VkPhysicalDevicePipelineRobustnessPropertiesEXT");

    public VkPhysicalDevicePipelineRobustnessPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int defaultRobustnessStorageBuffers() {return this.ptr.get(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers);}
    public void defaultRobustnessStorageBuffers(int value) {this.ptr.set(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers, value);}
    public java.lang.foreign.MemorySegment defaultRobustnessStorageBuffers_ptr() {return this.ptr.asSlice(OFFSET$defaultRobustnessStorageBuffers, LAYOUT$defaultRobustnessStorageBuffers);}

    public int defaultRobustnessUniformBuffers() {return this.ptr.get(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers);}
    public void defaultRobustnessUniformBuffers(int value) {this.ptr.set(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers, value);}
    public java.lang.foreign.MemorySegment defaultRobustnessUniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$defaultRobustnessUniformBuffers, LAYOUT$defaultRobustnessUniformBuffers);}

    public int defaultRobustnessVertexInputs() {return this.ptr.get(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs);}
    public void defaultRobustnessVertexInputs(int value) {this.ptr.set(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs, value);}
    public java.lang.foreign.MemorySegment defaultRobustnessVertexInputs_ptr() {return this.ptr.asSlice(OFFSET$defaultRobustnessVertexInputs, LAYOUT$defaultRobustnessVertexInputs);}

    public int defaultRobustnessImages() {return this.ptr.get(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages);}
    public void defaultRobustnessImages(int value) {this.ptr.set(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages, value);}
    public java.lang.foreign.MemorySegment defaultRobustnessImages_ptr() {return this.ptr.asSlice(OFFSET$defaultRobustnessImages, LAYOUT$defaultRobustnessImages);}
}
