package vulkan;

public record VkSurfacePresentScalingCapabilitiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedPresentScaling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedPresentScaling = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedPresentGravityX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedPresentGravityX = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedPresentGravityY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedPresentGravityY = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minScaledImageExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minScaledImageExtent = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxScaledImageExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxScaledImageExtent = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$supportedPresentScaling,
            LAYOUT$supportedPresentGravityX,
            LAYOUT$supportedPresentGravityY,
            LAYOUT$minScaledImageExtent,
            LAYOUT$maxScaledImageExtent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSurfacePresentScalingCapabilitiesEXT");

    public VkSurfacePresentScalingCapabilitiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int supportedPresentScaling() {return this.ptr.get(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling);}
    public void supportedPresentScaling(int value) {this.ptr.set(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling, value);}
    public java.lang.foreign.MemorySegment supportedPresentScaling_ptr() {return this.ptr.asSlice(OFFSET$supportedPresentScaling, LAYOUT$supportedPresentScaling);}

    public int supportedPresentGravityX() {return this.ptr.get(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX);}
    public void supportedPresentGravityX(int value) {this.ptr.set(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX, value);}
    public java.lang.foreign.MemorySegment supportedPresentGravityX_ptr() {return this.ptr.asSlice(OFFSET$supportedPresentGravityX, LAYOUT$supportedPresentGravityX);}

    public int supportedPresentGravityY() {return this.ptr.get(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY);}
    public void supportedPresentGravityY(int value) {this.ptr.set(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY, value);}
    public java.lang.foreign.MemorySegment supportedPresentGravityY_ptr() {return this.ptr.asSlice(OFFSET$supportedPresentGravityY, LAYOUT$supportedPresentGravityY);}

    public vulkan.VkExtent2D minScaledImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minScaledImageExtent, LAYOUT$minScaledImageExtent));}

    public vulkan.VkExtent2D maxScaledImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxScaledImageExtent, LAYOUT$maxScaledImageExtent));}
}
