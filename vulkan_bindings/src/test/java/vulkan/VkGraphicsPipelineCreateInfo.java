package vulkan;

public record VkGraphicsPipelineCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStages = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStages = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVertexInputState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVertexInputState = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pInputAssemblyState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pInputAssemblyState = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pTessellationState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pTessellationState = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pViewportState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pViewportState = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRasterizationState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRasterizationState = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMultisampleState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMultisampleState = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDepthStencilState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDepthStencilState = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pColorBlendState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pColorBlendState = 88L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDynamicState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDynamicState = 96L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$renderPass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$renderPass = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpass = 120L;
    public static final java.lang.foreign.AddressLayout LAYOUT$basePipelineHandle = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$basePipelineHandle = 128L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$basePipelineIndex = 136L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$stageCount,
            LAYOUT$pStages,
            LAYOUT$pVertexInputState,
            LAYOUT$pInputAssemblyState,
            LAYOUT$pTessellationState,
            LAYOUT$pViewportState,
            LAYOUT$pRasterizationState,
            LAYOUT$pMultisampleState,
            LAYOUT$pDepthStencilState,
            LAYOUT$pColorBlendState,
            LAYOUT$pDynamicState,
            LAYOUT$layout,
            LAYOUT$renderPass,
            LAYOUT$subpass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$basePipelineHandle,
            LAYOUT$basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkGraphicsPipelineCreateInfo");

    public VkGraphicsPipelineCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int stageCount() {return this.ptr.get(LAYOUT$stageCount, OFFSET$stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT$stageCount, OFFSET$stageCount, value);}
    public java.lang.foreign.MemorySegment stageCount_ptr() {return this.ptr.asSlice(OFFSET$stageCount, LAYOUT$stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT$pStages, OFFSET$pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStages, OFFSET$pStages, value);}
    public java.lang.foreign.MemorySegment pStages_ptr() {return this.ptr.asSlice(OFFSET$pStages, LAYOUT$pStages);}

    public java.lang.foreign.MemorySegment pVertexInputState() {return this.ptr.get(LAYOUT$pVertexInputState, OFFSET$pVertexInputState);}
    public void pVertexInputState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVertexInputState, OFFSET$pVertexInputState, value);}
    public java.lang.foreign.MemorySegment pVertexInputState_ptr() {return this.ptr.asSlice(OFFSET$pVertexInputState, LAYOUT$pVertexInputState);}

    public java.lang.foreign.MemorySegment pInputAssemblyState() {return this.ptr.get(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState);}
    public void pInputAssemblyState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState, value);}
    public java.lang.foreign.MemorySegment pInputAssemblyState_ptr() {return this.ptr.asSlice(OFFSET$pInputAssemblyState, LAYOUT$pInputAssemblyState);}

    public java.lang.foreign.MemorySegment pTessellationState() {return this.ptr.get(LAYOUT$pTessellationState, OFFSET$pTessellationState);}
    public void pTessellationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTessellationState, OFFSET$pTessellationState, value);}
    public java.lang.foreign.MemorySegment pTessellationState_ptr() {return this.ptr.asSlice(OFFSET$pTessellationState, LAYOUT$pTessellationState);}

    public java.lang.foreign.MemorySegment pViewportState() {return this.ptr.get(LAYOUT$pViewportState, OFFSET$pViewportState);}
    public void pViewportState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewportState, OFFSET$pViewportState, value);}
    public java.lang.foreign.MemorySegment pViewportState_ptr() {return this.ptr.asSlice(OFFSET$pViewportState, LAYOUT$pViewportState);}

    public java.lang.foreign.MemorySegment pRasterizationState() {return this.ptr.get(LAYOUT$pRasterizationState, OFFSET$pRasterizationState);}
    public void pRasterizationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRasterizationState, OFFSET$pRasterizationState, value);}
    public java.lang.foreign.MemorySegment pRasterizationState_ptr() {return this.ptr.asSlice(OFFSET$pRasterizationState, LAYOUT$pRasterizationState);}

    public java.lang.foreign.MemorySegment pMultisampleState() {return this.ptr.get(LAYOUT$pMultisampleState, OFFSET$pMultisampleState);}
    public void pMultisampleState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMultisampleState, OFFSET$pMultisampleState, value);}
    public java.lang.foreign.MemorySegment pMultisampleState_ptr() {return this.ptr.asSlice(OFFSET$pMultisampleState, LAYOUT$pMultisampleState);}

    public java.lang.foreign.MemorySegment pDepthStencilState() {return this.ptr.get(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState);}
    public void pDepthStencilState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState, value);}
    public java.lang.foreign.MemorySegment pDepthStencilState_ptr() {return this.ptr.asSlice(OFFSET$pDepthStencilState, LAYOUT$pDepthStencilState);}

    public java.lang.foreign.MemorySegment pColorBlendState() {return this.ptr.get(LAYOUT$pColorBlendState, OFFSET$pColorBlendState);}
    public void pColorBlendState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pColorBlendState, OFFSET$pColorBlendState, value);}
    public java.lang.foreign.MemorySegment pColorBlendState_ptr() {return this.ptr.asSlice(OFFSET$pColorBlendState, LAYOUT$pColorBlendState);}

    public java.lang.foreign.MemorySegment pDynamicState() {return this.ptr.get(LAYOUT$pDynamicState, OFFSET$pDynamicState);}
    public void pDynamicState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDynamicState, OFFSET$pDynamicState, value);}
    public java.lang.foreign.MemorySegment pDynamicState_ptr() {return this.ptr.asSlice(OFFSET$pDynamicState, LAYOUT$pDynamicState);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT$renderPass, OFFSET$renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$renderPass, OFFSET$renderPass, value);}
    public java.lang.foreign.MemorySegment renderPass_ptr() {return this.ptr.asSlice(OFFSET$renderPass, LAYOUT$renderPass);}

    public int subpass() {return this.ptr.get(LAYOUT$subpass, OFFSET$subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT$subpass, OFFSET$subpass, value);}
    public java.lang.foreign.MemorySegment subpass_ptr() {return this.ptr.asSlice(OFFSET$subpass, LAYOUT$subpass);}

    public java.lang.foreign.MemorySegment basePipelineHandle() {return this.ptr.get(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle);}
    public void basePipelineHandle(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value);}
    public java.lang.foreign.MemorySegment basePipelineHandle_ptr() {return this.ptr.asSlice(OFFSET$basePipelineHandle, LAYOUT$basePipelineHandle);}

    public int basePipelineIndex() {return this.ptr.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);}
    public void basePipelineIndex(int value) {this.ptr.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);}
    public java.lang.foreign.MemorySegment basePipelineIndex_ptr() {return this.ptr.asSlice(OFFSET$basePipelineIndex, LAYOUT$basePipelineIndex);}
}
