package vulkan;

public record VkPhysicalDeviceVulkan13Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustImageAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$robustImageAccess = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inlineUniformBlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inlineUniformBlock = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineCreationCacheControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineCreationCacheControl = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$privateData = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$privateData = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDemoteToHelperInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDemoteToHelperInvocation = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTerminateInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderTerminateInvocation = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSizeControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupSizeControl = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeFullSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeFullSubgroups = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$synchronization2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$synchronization2 = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureCompressionASTC_HDR = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$textureCompressionASTC_HDR = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderZeroInitializeWorkgroupMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderZeroInitializeWorkgroupMemory = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dynamicRendering = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dynamicRendering = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderIntegerDotProduct = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderIntegerDotProduct = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maintenance4 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maintenance4 = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$robustImageAccess,
            LAYOUT$inlineUniformBlock,
            LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind,
            LAYOUT$pipelineCreationCacheControl,
            LAYOUT$privateData,
            LAYOUT$shaderDemoteToHelperInvocation,
            LAYOUT$shaderTerminateInvocation,
            LAYOUT$subgroupSizeControl,
            LAYOUT$computeFullSubgroups,
            LAYOUT$synchronization2,
            LAYOUT$textureCompressionASTC_HDR,
            LAYOUT$shaderZeroInitializeWorkgroupMemory,
            LAYOUT$dynamicRendering,
            LAYOUT$shaderIntegerDotProduct,
            LAYOUT$maintenance4,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceVulkan13Features");

    public VkPhysicalDeviceVulkan13Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int robustImageAccess() {return this.ptr.get(LAYOUT$robustImageAccess, OFFSET$robustImageAccess);}
    public void robustImageAccess(int value) {this.ptr.set(LAYOUT$robustImageAccess, OFFSET$robustImageAccess, value);}
    public java.lang.foreign.MemorySegment robustImageAccess_ptr() {return this.ptr.asSlice(OFFSET$robustImageAccess, LAYOUT$robustImageAccess);}

    public int inlineUniformBlock() {return this.ptr.get(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock);}
    public void inlineUniformBlock(int value) {this.ptr.set(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock, value);}
    public java.lang.foreign.MemorySegment inlineUniformBlock_ptr() {return this.ptr.asSlice(OFFSET$inlineUniformBlock, LAYOUT$inlineUniformBlock);}

    public int descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind);}
    public void descriptorBindingInlineUniformBlockUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment descriptorBindingInlineUniformBlockUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind);}

    public int pipelineCreationCacheControl() {return this.ptr.get(LAYOUT$pipelineCreationCacheControl, OFFSET$pipelineCreationCacheControl);}
    public void pipelineCreationCacheControl(int value) {this.ptr.set(LAYOUT$pipelineCreationCacheControl, OFFSET$pipelineCreationCacheControl, value);}
    public java.lang.foreign.MemorySegment pipelineCreationCacheControl_ptr() {return this.ptr.asSlice(OFFSET$pipelineCreationCacheControl, LAYOUT$pipelineCreationCacheControl);}

    public int privateData() {return this.ptr.get(LAYOUT$privateData, OFFSET$privateData);}
    public void privateData(int value) {this.ptr.set(LAYOUT$privateData, OFFSET$privateData, value);}
    public java.lang.foreign.MemorySegment privateData_ptr() {return this.ptr.asSlice(OFFSET$privateData, LAYOUT$privateData);}

    public int shaderDemoteToHelperInvocation() {return this.ptr.get(LAYOUT$shaderDemoteToHelperInvocation, OFFSET$shaderDemoteToHelperInvocation);}
    public void shaderDemoteToHelperInvocation(int value) {this.ptr.set(LAYOUT$shaderDemoteToHelperInvocation, OFFSET$shaderDemoteToHelperInvocation, value);}
    public java.lang.foreign.MemorySegment shaderDemoteToHelperInvocation_ptr() {return this.ptr.asSlice(OFFSET$shaderDemoteToHelperInvocation, LAYOUT$shaderDemoteToHelperInvocation);}

    public int shaderTerminateInvocation() {return this.ptr.get(LAYOUT$shaderTerminateInvocation, OFFSET$shaderTerminateInvocation);}
    public void shaderTerminateInvocation(int value) {this.ptr.set(LAYOUT$shaderTerminateInvocation, OFFSET$shaderTerminateInvocation, value);}
    public java.lang.foreign.MemorySegment shaderTerminateInvocation_ptr() {return this.ptr.asSlice(OFFSET$shaderTerminateInvocation, LAYOUT$shaderTerminateInvocation);}

    public int subgroupSizeControl() {return this.ptr.get(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl);}
    public void subgroupSizeControl(int value) {this.ptr.set(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl, value);}
    public java.lang.foreign.MemorySegment subgroupSizeControl_ptr() {return this.ptr.asSlice(OFFSET$subgroupSizeControl, LAYOUT$subgroupSizeControl);}

    public int computeFullSubgroups() {return this.ptr.get(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups);}
    public void computeFullSubgroups(int value) {this.ptr.set(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups, value);}
    public java.lang.foreign.MemorySegment computeFullSubgroups_ptr() {return this.ptr.asSlice(OFFSET$computeFullSubgroups, LAYOUT$computeFullSubgroups);}

    public int synchronization2() {return this.ptr.get(LAYOUT$synchronization2, OFFSET$synchronization2);}
    public void synchronization2(int value) {this.ptr.set(LAYOUT$synchronization2, OFFSET$synchronization2, value);}
    public java.lang.foreign.MemorySegment synchronization2_ptr() {return this.ptr.asSlice(OFFSET$synchronization2, LAYOUT$synchronization2);}

    public int textureCompressionASTC_HDR() {return this.ptr.get(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR);}
    public void textureCompressionASTC_HDR(int value) {this.ptr.set(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR, value);}
    public java.lang.foreign.MemorySegment textureCompressionASTC_HDR_ptr() {return this.ptr.asSlice(OFFSET$textureCompressionASTC_HDR, LAYOUT$textureCompressionASTC_HDR);}

    public int shaderZeroInitializeWorkgroupMemory() {return this.ptr.get(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory);}
    public void shaderZeroInitializeWorkgroupMemory(int value) {this.ptr.set(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory, value);}
    public java.lang.foreign.MemorySegment shaderZeroInitializeWorkgroupMemory_ptr() {return this.ptr.asSlice(OFFSET$shaderZeroInitializeWorkgroupMemory, LAYOUT$shaderZeroInitializeWorkgroupMemory);}

    public int dynamicRendering() {return this.ptr.get(LAYOUT$dynamicRendering, OFFSET$dynamicRendering);}
    public void dynamicRendering(int value) {this.ptr.set(LAYOUT$dynamicRendering, OFFSET$dynamicRendering, value);}
    public java.lang.foreign.MemorySegment dynamicRendering_ptr() {return this.ptr.asSlice(OFFSET$dynamicRendering, LAYOUT$dynamicRendering);}

    public int shaderIntegerDotProduct() {return this.ptr.get(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct);}
    public void shaderIntegerDotProduct(int value) {this.ptr.set(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct, value);}
    public java.lang.foreign.MemorySegment shaderIntegerDotProduct_ptr() {return this.ptr.asSlice(OFFSET$shaderIntegerDotProduct, LAYOUT$shaderIntegerDotProduct);}

    public int maintenance4() {return this.ptr.get(LAYOUT$maintenance4, OFFSET$maintenance4);}
    public void maintenance4(int value) {this.ptr.set(LAYOUT$maintenance4, OFFSET$maintenance4, value);}
    public java.lang.foreign.MemorySegment maintenance4_ptr() {return this.ptr.asSlice(OFFSET$maintenance4, LAYOUT$maintenance4);}
}
