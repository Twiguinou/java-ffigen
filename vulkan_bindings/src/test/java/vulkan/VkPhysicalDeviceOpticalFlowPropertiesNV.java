package vulkan;

public record VkPhysicalDeviceOpticalFlowPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedOutputGridSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedOutputGridSizes = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedHintGridSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedHintGridSizes = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hintSupported = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hintSupported = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$costSupported = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$costSupported = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bidirectionalFlowSupported = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bidirectionalFlowSupported = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$globalFlowSupported = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$globalFlowSupported = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minWidth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minWidth = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minHeight = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxWidth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxWidth = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxHeight = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxNumRegionsOfInterest = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxNumRegionsOfInterest = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$supportedOutputGridSizes,
            LAYOUT$supportedHintGridSizes,
            LAYOUT$hintSupported,
            LAYOUT$costSupported,
            LAYOUT$bidirectionalFlowSupported,
            LAYOUT$globalFlowSupported,
            LAYOUT$minWidth,
            LAYOUT$minHeight,
            LAYOUT$maxWidth,
            LAYOUT$maxHeight,
            LAYOUT$maxNumRegionsOfInterest,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceOpticalFlowPropertiesNV");

    public VkPhysicalDeviceOpticalFlowPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int supportedOutputGridSizes() {return this.ptr.get(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes);}
    public void supportedOutputGridSizes(int value) {this.ptr.set(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes, value);}
    public java.lang.foreign.MemorySegment supportedOutputGridSizes_ptr() {return this.ptr.asSlice(OFFSET$supportedOutputGridSizes, LAYOUT$supportedOutputGridSizes);}

    public int supportedHintGridSizes() {return this.ptr.get(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes);}
    public void supportedHintGridSizes(int value) {this.ptr.set(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes, value);}
    public java.lang.foreign.MemorySegment supportedHintGridSizes_ptr() {return this.ptr.asSlice(OFFSET$supportedHintGridSizes, LAYOUT$supportedHintGridSizes);}

    public int hintSupported() {return this.ptr.get(LAYOUT$hintSupported, OFFSET$hintSupported);}
    public void hintSupported(int value) {this.ptr.set(LAYOUT$hintSupported, OFFSET$hintSupported, value);}
    public java.lang.foreign.MemorySegment hintSupported_ptr() {return this.ptr.asSlice(OFFSET$hintSupported, LAYOUT$hintSupported);}

    public int costSupported() {return this.ptr.get(LAYOUT$costSupported, OFFSET$costSupported);}
    public void costSupported(int value) {this.ptr.set(LAYOUT$costSupported, OFFSET$costSupported, value);}
    public java.lang.foreign.MemorySegment costSupported_ptr() {return this.ptr.asSlice(OFFSET$costSupported, LAYOUT$costSupported);}

    public int bidirectionalFlowSupported() {return this.ptr.get(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported);}
    public void bidirectionalFlowSupported(int value) {this.ptr.set(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported, value);}
    public java.lang.foreign.MemorySegment bidirectionalFlowSupported_ptr() {return this.ptr.asSlice(OFFSET$bidirectionalFlowSupported, LAYOUT$bidirectionalFlowSupported);}

    public int globalFlowSupported() {return this.ptr.get(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported);}
    public void globalFlowSupported(int value) {this.ptr.set(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported, value);}
    public java.lang.foreign.MemorySegment globalFlowSupported_ptr() {return this.ptr.asSlice(OFFSET$globalFlowSupported, LAYOUT$globalFlowSupported);}

    public int minWidth() {return this.ptr.get(LAYOUT$minWidth, OFFSET$minWidth);}
    public void minWidth(int value) {this.ptr.set(LAYOUT$minWidth, OFFSET$minWidth, value);}
    public java.lang.foreign.MemorySegment minWidth_ptr() {return this.ptr.asSlice(OFFSET$minWidth, LAYOUT$minWidth);}

    public int minHeight() {return this.ptr.get(LAYOUT$minHeight, OFFSET$minHeight);}
    public void minHeight(int value) {this.ptr.set(LAYOUT$minHeight, OFFSET$minHeight, value);}
    public java.lang.foreign.MemorySegment minHeight_ptr() {return this.ptr.asSlice(OFFSET$minHeight, LAYOUT$minHeight);}

    public int maxWidth() {return this.ptr.get(LAYOUT$maxWidth, OFFSET$maxWidth);}
    public void maxWidth(int value) {this.ptr.set(LAYOUT$maxWidth, OFFSET$maxWidth, value);}
    public java.lang.foreign.MemorySegment maxWidth_ptr() {return this.ptr.asSlice(OFFSET$maxWidth, LAYOUT$maxWidth);}

    public int maxHeight() {return this.ptr.get(LAYOUT$maxHeight, OFFSET$maxHeight);}
    public void maxHeight(int value) {this.ptr.set(LAYOUT$maxHeight, OFFSET$maxHeight, value);}
    public java.lang.foreign.MemorySegment maxHeight_ptr() {return this.ptr.asSlice(OFFSET$maxHeight, LAYOUT$maxHeight);}

    public int maxNumRegionsOfInterest() {return this.ptr.get(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest);}
    public void maxNumRegionsOfInterest(int value) {this.ptr.set(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest, value);}
    public java.lang.foreign.MemorySegment maxNumRegionsOfInterest_ptr() {return this.ptr.asSlice(OFFSET$maxNumRegionsOfInterest, LAYOUT$maxNumRegionsOfInterest);}
}
