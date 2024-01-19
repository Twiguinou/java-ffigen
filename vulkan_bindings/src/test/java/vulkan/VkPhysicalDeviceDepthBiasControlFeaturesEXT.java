package vulkan;

public record VkPhysicalDeviceDepthBiasControlFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthBiasControl = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$leastRepresentableValueForceUnormRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$leastRepresentableValueForceUnormRepresentation = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$floatRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$floatRepresentation = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasExact = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthBiasExact = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$depthBiasControl,
            LAYOUT$leastRepresentableValueForceUnormRepresentation,
            LAYOUT$floatRepresentation,
            LAYOUT$depthBiasExact
    ).withName("VkPhysicalDeviceDepthBiasControlFeaturesEXT");

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int depthBiasControl() {return this.ptr.get(LAYOUT$depthBiasControl, OFFSET$depthBiasControl);}
    public void depthBiasControl(int value) {this.ptr.set(LAYOUT$depthBiasControl, OFFSET$depthBiasControl, value);}
    public java.lang.foreign.MemorySegment depthBiasControl_ptr() {return this.ptr.asSlice(OFFSET$depthBiasControl, LAYOUT$depthBiasControl);}

    public int leastRepresentableValueForceUnormRepresentation() {return this.ptr.get(LAYOUT$leastRepresentableValueForceUnormRepresentation, OFFSET$leastRepresentableValueForceUnormRepresentation);}
    public void leastRepresentableValueForceUnormRepresentation(int value) {this.ptr.set(LAYOUT$leastRepresentableValueForceUnormRepresentation, OFFSET$leastRepresentableValueForceUnormRepresentation, value);}
    public java.lang.foreign.MemorySegment leastRepresentableValueForceUnormRepresentation_ptr() {return this.ptr.asSlice(OFFSET$leastRepresentableValueForceUnormRepresentation, LAYOUT$leastRepresentableValueForceUnormRepresentation);}

    public int floatRepresentation() {return this.ptr.get(LAYOUT$floatRepresentation, OFFSET$floatRepresentation);}
    public void floatRepresentation(int value) {this.ptr.set(LAYOUT$floatRepresentation, OFFSET$floatRepresentation, value);}
    public java.lang.foreign.MemorySegment floatRepresentation_ptr() {return this.ptr.asSlice(OFFSET$floatRepresentation, LAYOUT$floatRepresentation);}

    public int depthBiasExact() {return this.ptr.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);}
    public void depthBiasExact(int value) {this.ptr.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);}
    public java.lang.foreign.MemorySegment depthBiasExact_ptr() {return this.ptr.asSlice(OFFSET$depthBiasExact, LAYOUT$depthBiasExact);}
}
