package vulkan;

public record VkPhysicalDeviceMeshShaderFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$taskShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$taskShader = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshShader = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewMeshShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewMeshShader = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveFragmentShadingRateMeshShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveFragmentShadingRateMeshShader = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshShaderQueries = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshShaderQueries = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$taskShader,
            LAYOUT$meshShader,
            LAYOUT$multiviewMeshShader,
            LAYOUT$primitiveFragmentShadingRateMeshShader,
            LAYOUT$meshShaderQueries,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceMeshShaderFeaturesEXT");

    public VkPhysicalDeviceMeshShaderFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int taskShader() {return this.ptr.get(LAYOUT$taskShader, OFFSET$taskShader);}
    public void taskShader(int value) {this.ptr.set(LAYOUT$taskShader, OFFSET$taskShader, value);}
    public java.lang.foreign.MemorySegment taskShader_ptr() {return this.ptr.asSlice(OFFSET$taskShader, LAYOUT$taskShader);}

    public int meshShader() {return this.ptr.get(LAYOUT$meshShader, OFFSET$meshShader);}
    public void meshShader(int value) {this.ptr.set(LAYOUT$meshShader, OFFSET$meshShader, value);}
    public java.lang.foreign.MemorySegment meshShader_ptr() {return this.ptr.asSlice(OFFSET$meshShader, LAYOUT$meshShader);}

    public int multiviewMeshShader() {return this.ptr.get(LAYOUT$multiviewMeshShader, OFFSET$multiviewMeshShader);}
    public void multiviewMeshShader(int value) {this.ptr.set(LAYOUT$multiviewMeshShader, OFFSET$multiviewMeshShader, value);}
    public java.lang.foreign.MemorySegment multiviewMeshShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewMeshShader, LAYOUT$multiviewMeshShader);}

    public int primitiveFragmentShadingRateMeshShader() {return this.ptr.get(LAYOUT$primitiveFragmentShadingRateMeshShader, OFFSET$primitiveFragmentShadingRateMeshShader);}
    public void primitiveFragmentShadingRateMeshShader(int value) {this.ptr.set(LAYOUT$primitiveFragmentShadingRateMeshShader, OFFSET$primitiveFragmentShadingRateMeshShader, value);}
    public java.lang.foreign.MemorySegment primitiveFragmentShadingRateMeshShader_ptr() {return this.ptr.asSlice(OFFSET$primitiveFragmentShadingRateMeshShader, LAYOUT$primitiveFragmentShadingRateMeshShader);}

    public int meshShaderQueries() {return this.ptr.get(LAYOUT$meshShaderQueries, OFFSET$meshShaderQueries);}
    public void meshShaderQueries(int value) {this.ptr.set(LAYOUT$meshShaderQueries, OFFSET$meshShaderQueries, value);}
    public java.lang.foreign.MemorySegment meshShaderQueries_ptr() {return this.ptr.asSlice(OFFSET$meshShaderQueries, LAYOUT$meshShaderQueries);}
}
