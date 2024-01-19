package vulkan;

public record VkSwapchainPresentScalingCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scalingBehavior = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$scalingBehavior = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentGravityX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$presentGravityX = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentGravityY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$presentGravityY = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$scalingBehavior,
            LAYOUT$presentGravityX,
            LAYOUT$presentGravityY,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSwapchainPresentScalingCreateInfoEXT");

    public VkSwapchainPresentScalingCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int scalingBehavior() {return this.ptr.get(LAYOUT$scalingBehavior, OFFSET$scalingBehavior);}
    public void scalingBehavior(int value) {this.ptr.set(LAYOUT$scalingBehavior, OFFSET$scalingBehavior, value);}
    public java.lang.foreign.MemorySegment scalingBehavior_ptr() {return this.ptr.asSlice(OFFSET$scalingBehavior, LAYOUT$scalingBehavior);}

    public int presentGravityX() {return this.ptr.get(LAYOUT$presentGravityX, OFFSET$presentGravityX);}
    public void presentGravityX(int value) {this.ptr.set(LAYOUT$presentGravityX, OFFSET$presentGravityX, value);}
    public java.lang.foreign.MemorySegment presentGravityX_ptr() {return this.ptr.asSlice(OFFSET$presentGravityX, LAYOUT$presentGravityX);}

    public int presentGravityY() {return this.ptr.get(LAYOUT$presentGravityY, OFFSET$presentGravityY);}
    public void presentGravityY(int value) {this.ptr.set(LAYOUT$presentGravityY, OFFSET$presentGravityY, value);}
    public java.lang.foreign.MemorySegment presentGravityY_ptr() {return this.ptr.asSlice(OFFSET$presentGravityY, LAYOUT$presentGravityY);}
}
