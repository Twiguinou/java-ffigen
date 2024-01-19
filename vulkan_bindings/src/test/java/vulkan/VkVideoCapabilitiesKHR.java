package vulkan;

public record VkVideoCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minBitstreamBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minBitstreamBufferOffsetAlignment = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minBitstreamBufferSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minBitstreamBufferSizeAlignment = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pictureAccessGranularity = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$pictureAccessGranularity = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minCodedExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minCodedExtent = 48L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxCodedExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxCodedExtent = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDpbSlots = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDpbSlots = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxActiveReferencePictures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxActiveReferencePictures = 68L;
    public static final java.lang.foreign.GroupLayout LAYOUT$stdHeaderVersion = vulkan.VkExtensionProperties.gStructLayout;
    public static final long OFFSET$stdHeaderVersion = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$minBitstreamBufferOffsetAlignment,
            LAYOUT$minBitstreamBufferSizeAlignment,
            LAYOUT$pictureAccessGranularity,
            LAYOUT$minCodedExtent,
            LAYOUT$maxCodedExtent,
            LAYOUT$maxDpbSlots,
            LAYOUT$maxActiveReferencePictures,
            LAYOUT$stdHeaderVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoCapabilitiesKHR");

    public VkVideoCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
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

    public long minBitstreamBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minBitstreamBufferOffsetAlignment, OFFSET$minBitstreamBufferOffsetAlignment);}
    public void minBitstreamBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$minBitstreamBufferOffsetAlignment, OFFSET$minBitstreamBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment minBitstreamBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minBitstreamBufferOffsetAlignment, LAYOUT$minBitstreamBufferOffsetAlignment);}

    public long minBitstreamBufferSizeAlignment() {return this.ptr.get(LAYOUT$minBitstreamBufferSizeAlignment, OFFSET$minBitstreamBufferSizeAlignment);}
    public void minBitstreamBufferSizeAlignment(long value) {this.ptr.set(LAYOUT$minBitstreamBufferSizeAlignment, OFFSET$minBitstreamBufferSizeAlignment, value);}
    public java.lang.foreign.MemorySegment minBitstreamBufferSizeAlignment_ptr() {return this.ptr.asSlice(OFFSET$minBitstreamBufferSizeAlignment, LAYOUT$minBitstreamBufferSizeAlignment);}

    public vulkan.VkExtent2D pictureAccessGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$pictureAccessGranularity, LAYOUT$pictureAccessGranularity));}

    public vulkan.VkExtent2D minCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minCodedExtent, LAYOUT$minCodedExtent));}

    public vulkan.VkExtent2D maxCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxCodedExtent, LAYOUT$maxCodedExtent));}

    public int maxDpbSlots() {return this.ptr.get(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots);}
    public void maxDpbSlots(int value) {this.ptr.set(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots, value);}
    public java.lang.foreign.MemorySegment maxDpbSlots_ptr() {return this.ptr.asSlice(OFFSET$maxDpbSlots, LAYOUT$maxDpbSlots);}

    public int maxActiveReferencePictures() {return this.ptr.get(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures);}
    public void maxActiveReferencePictures(int value) {this.ptr.set(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures, value);}
    public java.lang.foreign.MemorySegment maxActiveReferencePictures_ptr() {return this.ptr.asSlice(OFFSET$maxActiveReferencePictures, LAYOUT$maxActiveReferencePictures);}

    public vulkan.VkExtensionProperties stdHeaderVersion() {return new vulkan.VkExtensionProperties(this.ptr.asSlice(OFFSET$stdHeaderVersion, LAYOUT$stdHeaderVersion));}
}
