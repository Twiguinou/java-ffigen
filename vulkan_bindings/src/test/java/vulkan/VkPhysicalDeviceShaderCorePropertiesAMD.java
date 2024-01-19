package vulkan;

public record VkPhysicalDeviceShaderCorePropertiesAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderEngineCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderEngineCount = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderArraysPerEngineCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderArraysPerEngineCount = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeUnitsPerShaderArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeUnitsPerShaderArray = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$simdPerComputeUnit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$simdPerComputeUnit = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$wavefrontsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$wavefrontsPerSimd = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$wavefrontSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$wavefrontSize = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sgprsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sgprsPerSimd = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minSgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minSgprAllocation = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSgprAllocation = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sgprAllocationGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sgprAllocationGranularity = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vgprsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vgprsPerSimd = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minVgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minVgprAllocation = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVgprAllocation = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vgprAllocationGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vgprAllocationGranularity = 68L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderEngineCount,
            LAYOUT$shaderArraysPerEngineCount,
            LAYOUT$computeUnitsPerShaderArray,
            LAYOUT$simdPerComputeUnit,
            LAYOUT$wavefrontsPerSimd,
            LAYOUT$wavefrontSize,
            LAYOUT$sgprsPerSimd,
            LAYOUT$minSgprAllocation,
            LAYOUT$maxSgprAllocation,
            LAYOUT$sgprAllocationGranularity,
            LAYOUT$vgprsPerSimd,
            LAYOUT$minVgprAllocation,
            LAYOUT$maxVgprAllocation,
            LAYOUT$vgprAllocationGranularity
    ).withName("VkPhysicalDeviceShaderCorePropertiesAMD");

    public VkPhysicalDeviceShaderCorePropertiesAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderEngineCount() {return this.ptr.get(LAYOUT$shaderEngineCount, OFFSET$shaderEngineCount);}
    public void shaderEngineCount(int value) {this.ptr.set(LAYOUT$shaderEngineCount, OFFSET$shaderEngineCount, value);}
    public java.lang.foreign.MemorySegment shaderEngineCount_ptr() {return this.ptr.asSlice(OFFSET$shaderEngineCount, LAYOUT$shaderEngineCount);}

    public int shaderArraysPerEngineCount() {return this.ptr.get(LAYOUT$shaderArraysPerEngineCount, OFFSET$shaderArraysPerEngineCount);}
    public void shaderArraysPerEngineCount(int value) {this.ptr.set(LAYOUT$shaderArraysPerEngineCount, OFFSET$shaderArraysPerEngineCount, value);}
    public java.lang.foreign.MemorySegment shaderArraysPerEngineCount_ptr() {return this.ptr.asSlice(OFFSET$shaderArraysPerEngineCount, LAYOUT$shaderArraysPerEngineCount);}

    public int computeUnitsPerShaderArray() {return this.ptr.get(LAYOUT$computeUnitsPerShaderArray, OFFSET$computeUnitsPerShaderArray);}
    public void computeUnitsPerShaderArray(int value) {this.ptr.set(LAYOUT$computeUnitsPerShaderArray, OFFSET$computeUnitsPerShaderArray, value);}
    public java.lang.foreign.MemorySegment computeUnitsPerShaderArray_ptr() {return this.ptr.asSlice(OFFSET$computeUnitsPerShaderArray, LAYOUT$computeUnitsPerShaderArray);}

    public int simdPerComputeUnit() {return this.ptr.get(LAYOUT$simdPerComputeUnit, OFFSET$simdPerComputeUnit);}
    public void simdPerComputeUnit(int value) {this.ptr.set(LAYOUT$simdPerComputeUnit, OFFSET$simdPerComputeUnit, value);}
    public java.lang.foreign.MemorySegment simdPerComputeUnit_ptr() {return this.ptr.asSlice(OFFSET$simdPerComputeUnit, LAYOUT$simdPerComputeUnit);}

    public int wavefrontsPerSimd() {return this.ptr.get(LAYOUT$wavefrontsPerSimd, OFFSET$wavefrontsPerSimd);}
    public void wavefrontsPerSimd(int value) {this.ptr.set(LAYOUT$wavefrontsPerSimd, OFFSET$wavefrontsPerSimd, value);}
    public java.lang.foreign.MemorySegment wavefrontsPerSimd_ptr() {return this.ptr.asSlice(OFFSET$wavefrontsPerSimd, LAYOUT$wavefrontsPerSimd);}

    public int wavefrontSize() {return this.ptr.get(LAYOUT$wavefrontSize, OFFSET$wavefrontSize);}
    public void wavefrontSize(int value) {this.ptr.set(LAYOUT$wavefrontSize, OFFSET$wavefrontSize, value);}
    public java.lang.foreign.MemorySegment wavefrontSize_ptr() {return this.ptr.asSlice(OFFSET$wavefrontSize, LAYOUT$wavefrontSize);}

    public int sgprsPerSimd() {return this.ptr.get(LAYOUT$sgprsPerSimd, OFFSET$sgprsPerSimd);}
    public void sgprsPerSimd(int value) {this.ptr.set(LAYOUT$sgprsPerSimd, OFFSET$sgprsPerSimd, value);}
    public java.lang.foreign.MemorySegment sgprsPerSimd_ptr() {return this.ptr.asSlice(OFFSET$sgprsPerSimd, LAYOUT$sgprsPerSimd);}

    public int minSgprAllocation() {return this.ptr.get(LAYOUT$minSgprAllocation, OFFSET$minSgprAllocation);}
    public void minSgprAllocation(int value) {this.ptr.set(LAYOUT$minSgprAllocation, OFFSET$minSgprAllocation, value);}
    public java.lang.foreign.MemorySegment minSgprAllocation_ptr() {return this.ptr.asSlice(OFFSET$minSgprAllocation, LAYOUT$minSgprAllocation);}

    public int maxSgprAllocation() {return this.ptr.get(LAYOUT$maxSgprAllocation, OFFSET$maxSgprAllocation);}
    public void maxSgprAllocation(int value) {this.ptr.set(LAYOUT$maxSgprAllocation, OFFSET$maxSgprAllocation, value);}
    public java.lang.foreign.MemorySegment maxSgprAllocation_ptr() {return this.ptr.asSlice(OFFSET$maxSgprAllocation, LAYOUT$maxSgprAllocation);}

    public int sgprAllocationGranularity() {return this.ptr.get(LAYOUT$sgprAllocationGranularity, OFFSET$sgprAllocationGranularity);}
    public void sgprAllocationGranularity(int value) {this.ptr.set(LAYOUT$sgprAllocationGranularity, OFFSET$sgprAllocationGranularity, value);}
    public java.lang.foreign.MemorySegment sgprAllocationGranularity_ptr() {return this.ptr.asSlice(OFFSET$sgprAllocationGranularity, LAYOUT$sgprAllocationGranularity);}

    public int vgprsPerSimd() {return this.ptr.get(LAYOUT$vgprsPerSimd, OFFSET$vgprsPerSimd);}
    public void vgprsPerSimd(int value) {this.ptr.set(LAYOUT$vgprsPerSimd, OFFSET$vgprsPerSimd, value);}
    public java.lang.foreign.MemorySegment vgprsPerSimd_ptr() {return this.ptr.asSlice(OFFSET$vgprsPerSimd, LAYOUT$vgprsPerSimd);}

    public int minVgprAllocation() {return this.ptr.get(LAYOUT$minVgprAllocation, OFFSET$minVgprAllocation);}
    public void minVgprAllocation(int value) {this.ptr.set(LAYOUT$minVgprAllocation, OFFSET$minVgprAllocation, value);}
    public java.lang.foreign.MemorySegment minVgprAllocation_ptr() {return this.ptr.asSlice(OFFSET$minVgprAllocation, LAYOUT$minVgprAllocation);}

    public int maxVgprAllocation() {return this.ptr.get(LAYOUT$maxVgprAllocation, OFFSET$maxVgprAllocation);}
    public void maxVgprAllocation(int value) {this.ptr.set(LAYOUT$maxVgprAllocation, OFFSET$maxVgprAllocation, value);}
    public java.lang.foreign.MemorySegment maxVgprAllocation_ptr() {return this.ptr.asSlice(OFFSET$maxVgprAllocation, LAYOUT$maxVgprAllocation);}

    public int vgprAllocationGranularity() {return this.ptr.get(LAYOUT$vgprAllocationGranularity, OFFSET$vgprAllocationGranularity);}
    public void vgprAllocationGranularity(int value) {this.ptr.set(LAYOUT$vgprAllocationGranularity, OFFSET$vgprAllocationGranularity, value);}
    public java.lang.foreign.MemorySegment vgprAllocationGranularity_ptr() {return this.ptr.asSlice(OFFSET$vgprAllocationGranularity, LAYOUT$vgprAllocationGranularity);}
}
