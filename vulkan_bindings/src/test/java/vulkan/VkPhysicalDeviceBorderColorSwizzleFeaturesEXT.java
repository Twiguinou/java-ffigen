package vulkan;

public record VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$borderColorSwizzle = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$borderColorSwizzle = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$borderColorSwizzleFromImage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$borderColorSwizzleFromImage = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$borderColorSwizzle,
            LAYOUT$borderColorSwizzleFromImage
    ).withName("VkPhysicalDeviceBorderColorSwizzleFeaturesEXT");

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int borderColorSwizzle() {return this.ptr.get(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle);}
    public void borderColorSwizzle(int value) {this.ptr.set(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle, value);}
    public java.lang.foreign.MemorySegment borderColorSwizzle_ptr() {return this.ptr.asSlice(OFFSET$borderColorSwizzle, LAYOUT$borderColorSwizzle);}

    public int borderColorSwizzleFromImage() {return this.ptr.get(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage);}
    public void borderColorSwizzleFromImage(int value) {this.ptr.set(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage, value);}
    public java.lang.foreign.MemorySegment borderColorSwizzleFromImage_ptr() {return this.ptr.asSlice(OFFSET$borderColorSwizzleFromImage, LAYOUT$borderColorSwizzleFromImage);}
}
