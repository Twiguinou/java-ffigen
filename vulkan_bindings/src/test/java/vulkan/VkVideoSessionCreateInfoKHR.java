package vulkan;

public record VkVideoSessionCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueFamilyIndex = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVideoProfile = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVideoProfile = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pictureFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pictureFormat = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxCodedExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxCodedExtent = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$referencePictureFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$referencePictureFormat = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDpbSlots = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDpbSlots = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxActiveReferencePictures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxActiveReferencePictures = 52L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStdHeaderVersion = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStdHeaderVersion = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$queueFamilyIndex,
            LAYOUT$flags,
            LAYOUT$pVideoProfile,
            LAYOUT$pictureFormat,
            LAYOUT$maxCodedExtent,
            LAYOUT$referencePictureFormat,
            LAYOUT$maxDpbSlots,
            LAYOUT$maxActiveReferencePictures,
            LAYOUT$pStdHeaderVersion
    ).withName("VkVideoSessionCreateInfoKHR");

    public VkVideoSessionCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int queueFamilyIndex() {return this.ptr.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);}
    public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment queueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndex, LAYOUT$queueFamilyIndex);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pVideoProfile() {return this.ptr.get(LAYOUT$pVideoProfile, OFFSET$pVideoProfile);}
    public void pVideoProfile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVideoProfile, OFFSET$pVideoProfile, value);}
    public java.lang.foreign.MemorySegment pVideoProfile_ptr() {return this.ptr.asSlice(OFFSET$pVideoProfile, LAYOUT$pVideoProfile);}

    public int pictureFormat() {return this.ptr.get(LAYOUT$pictureFormat, OFFSET$pictureFormat);}
    public void pictureFormat(int value) {this.ptr.set(LAYOUT$pictureFormat, OFFSET$pictureFormat, value);}
    public java.lang.foreign.MemorySegment pictureFormat_ptr() {return this.ptr.asSlice(OFFSET$pictureFormat, LAYOUT$pictureFormat);}

    public vulkan.VkExtent2D maxCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxCodedExtent, LAYOUT$maxCodedExtent));}

    public int referencePictureFormat() {return this.ptr.get(LAYOUT$referencePictureFormat, OFFSET$referencePictureFormat);}
    public void referencePictureFormat(int value) {this.ptr.set(LAYOUT$referencePictureFormat, OFFSET$referencePictureFormat, value);}
    public java.lang.foreign.MemorySegment referencePictureFormat_ptr() {return this.ptr.asSlice(OFFSET$referencePictureFormat, LAYOUT$referencePictureFormat);}

    public int maxDpbSlots() {return this.ptr.get(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots);}
    public void maxDpbSlots(int value) {this.ptr.set(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots, value);}
    public java.lang.foreign.MemorySegment maxDpbSlots_ptr() {return this.ptr.asSlice(OFFSET$maxDpbSlots, LAYOUT$maxDpbSlots);}

    public int maxActiveReferencePictures() {return this.ptr.get(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures);}
    public void maxActiveReferencePictures(int value) {this.ptr.set(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures, value);}
    public java.lang.foreign.MemorySegment maxActiveReferencePictures_ptr() {return this.ptr.asSlice(OFFSET$maxActiveReferencePictures, LAYOUT$maxActiveReferencePictures);}

    public java.lang.foreign.MemorySegment pStdHeaderVersion() {return this.ptr.get(LAYOUT$pStdHeaderVersion, OFFSET$pStdHeaderVersion);}
    public void pStdHeaderVersion(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdHeaderVersion, OFFSET$pStdHeaderVersion, value);}
    public java.lang.foreign.MemorySegment pStdHeaderVersion_ptr() {return this.ptr.asSlice(OFFSET$pStdHeaderVersion, LAYOUT$pStdHeaderVersion);}
}
