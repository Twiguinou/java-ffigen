package vulkan;

public record VkPhysicalDeviceVulkan11Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageBuffer16BitAccess = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storagePushConstant16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storagePushConstant16 = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageInputOutput16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageInputOutput16 = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiview = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiview = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewGeometryShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewGeometryShader = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiviewTessellationShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$multiviewTessellationShader = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variablePointersStorageBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$variablePointersStorageBuffer = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variablePointers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$variablePointers = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$protectedMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$protectedMemory = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samplerYcbcrConversion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$samplerYcbcrConversion = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDrawParameters = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDrawParameters = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$storageBuffer16BitAccess,
            LAYOUT$uniformAndStorageBuffer16BitAccess,
            LAYOUT$storagePushConstant16,
            LAYOUT$storageInputOutput16,
            LAYOUT$multiview,
            LAYOUT$multiviewGeometryShader,
            LAYOUT$multiviewTessellationShader,
            LAYOUT$variablePointersStorageBuffer,
            LAYOUT$variablePointers,
            LAYOUT$protectedMemory,
            LAYOUT$samplerYcbcrConversion,
            LAYOUT$shaderDrawParameters
    ).withName("VkPhysicalDeviceVulkan11Features");

    public VkPhysicalDeviceVulkan11Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int storageBuffer16BitAccess() {return this.ptr.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);}
    public void storageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment storageBuffer16BitAccess_ptr() {return this.ptr.asSlice(OFFSET$storageBuffer16BitAccess, LAYOUT$storageBuffer16BitAccess);}

    public int uniformAndStorageBuffer16BitAccess() {return this.ptr.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);}
    public void uniformAndStorageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment uniformAndStorageBuffer16BitAccess_ptr() {return this.ptr.asSlice(OFFSET$uniformAndStorageBuffer16BitAccess, LAYOUT$uniformAndStorageBuffer16BitAccess);}

    public int storagePushConstant16() {return this.ptr.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);}
    public void storagePushConstant16(int value) {this.ptr.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);}
    public java.lang.foreign.MemorySegment storagePushConstant16_ptr() {return this.ptr.asSlice(OFFSET$storagePushConstant16, LAYOUT$storagePushConstant16);}

    public int storageInputOutput16() {return this.ptr.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);}
    public void storageInputOutput16(int value) {this.ptr.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);}
    public java.lang.foreign.MemorySegment storageInputOutput16_ptr() {return this.ptr.asSlice(OFFSET$storageInputOutput16, LAYOUT$storageInputOutput16);}

    public int multiview() {return this.ptr.get(LAYOUT$multiview, OFFSET$multiview);}
    public void multiview(int value) {this.ptr.set(LAYOUT$multiview, OFFSET$multiview, value);}
    public java.lang.foreign.MemorySegment multiview_ptr() {return this.ptr.asSlice(OFFSET$multiview, LAYOUT$multiview);}

    public int multiviewGeometryShader() {return this.ptr.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);}
    public void multiviewGeometryShader(int value) {this.ptr.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);}
    public java.lang.foreign.MemorySegment multiviewGeometryShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewGeometryShader, LAYOUT$multiviewGeometryShader);}

    public int multiviewTessellationShader() {return this.ptr.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);}
    public void multiviewTessellationShader(int value) {this.ptr.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);}
    public java.lang.foreign.MemorySegment multiviewTessellationShader_ptr() {return this.ptr.asSlice(OFFSET$multiviewTessellationShader, LAYOUT$multiviewTessellationShader);}

    public int variablePointersStorageBuffer() {return this.ptr.get(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer);}
    public void variablePointersStorageBuffer(int value) {this.ptr.set(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer, value);}
    public java.lang.foreign.MemorySegment variablePointersStorageBuffer_ptr() {return this.ptr.asSlice(OFFSET$variablePointersStorageBuffer, LAYOUT$variablePointersStorageBuffer);}

    public int variablePointers() {return this.ptr.get(LAYOUT$variablePointers, OFFSET$variablePointers);}
    public void variablePointers(int value) {this.ptr.set(LAYOUT$variablePointers, OFFSET$variablePointers, value);}
    public java.lang.foreign.MemorySegment variablePointers_ptr() {return this.ptr.asSlice(OFFSET$variablePointers, LAYOUT$variablePointers);}

    public int protectedMemory() {return this.ptr.get(LAYOUT$protectedMemory, OFFSET$protectedMemory);}
    public void protectedMemory(int value) {this.ptr.set(LAYOUT$protectedMemory, OFFSET$protectedMemory, value);}
    public java.lang.foreign.MemorySegment protectedMemory_ptr() {return this.ptr.asSlice(OFFSET$protectedMemory, LAYOUT$protectedMemory);}

    public int samplerYcbcrConversion() {return this.ptr.get(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion);}
    public void samplerYcbcrConversion(int value) {this.ptr.set(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion, value);}
    public java.lang.foreign.MemorySegment samplerYcbcrConversion_ptr() {return this.ptr.asSlice(OFFSET$samplerYcbcrConversion, LAYOUT$samplerYcbcrConversion);}

    public int shaderDrawParameters() {return this.ptr.get(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters);}
    public void shaderDrawParameters(int value) {this.ptr.set(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters, value);}
    public java.lang.foreign.MemorySegment shaderDrawParameters_ptr() {return this.ptr.asSlice(OFFSET$shaderDrawParameters, LAYOUT$shaderDrawParameters);}
}
