package vulkan;

public record VkSwapchainCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$surface = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$surface = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minImageCount = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageFormat = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageColorSpace = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageColorSpace = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$imageExtent = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageArrayLayers = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageUsage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageUsage = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageSharingMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageSharingMode = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueFamilyIndexCount = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pQueueFamilyIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pQueueFamilyIndices = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preTransform = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preTransform = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$compositeAlpha = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$presentMode = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clipped = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$clipped = 92L;
    public static final java.lang.foreign.AddressLayout LAYOUT$oldSwapchain = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$oldSwapchain = 96L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$surface,
            LAYOUT$minImageCount,
            LAYOUT$imageFormat,
            LAYOUT$imageColorSpace,
            LAYOUT$imageExtent,
            LAYOUT$imageArrayLayers,
            LAYOUT$imageUsage,
            LAYOUT$imageSharingMode,
            LAYOUT$queueFamilyIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pQueueFamilyIndices,
            LAYOUT$preTransform,
            LAYOUT$compositeAlpha,
            LAYOUT$presentMode,
            LAYOUT$clipped,
            LAYOUT$oldSwapchain
    ).withName("VkSwapchainCreateInfoKHR");

    public VkSwapchainCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment surface() {return this.ptr.get(LAYOUT$surface, OFFSET$surface);}
    public void surface(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$surface, OFFSET$surface, value);}
    public java.lang.foreign.MemorySegment surface_ptr() {return this.ptr.asSlice(OFFSET$surface, LAYOUT$surface);}

    public int minImageCount() {return this.ptr.get(LAYOUT$minImageCount, OFFSET$minImageCount);}
    public void minImageCount(int value) {this.ptr.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);}
    public java.lang.foreign.MemorySegment minImageCount_ptr() {return this.ptr.asSlice(OFFSET$minImageCount, LAYOUT$minImageCount);}

    public int imageFormat() {return this.ptr.get(LAYOUT$imageFormat, OFFSET$imageFormat);}
    public void imageFormat(int value) {this.ptr.set(LAYOUT$imageFormat, OFFSET$imageFormat, value);}
    public java.lang.foreign.MemorySegment imageFormat_ptr() {return this.ptr.asSlice(OFFSET$imageFormat, LAYOUT$imageFormat);}

    public int imageColorSpace() {return this.ptr.get(LAYOUT$imageColorSpace, OFFSET$imageColorSpace);}
    public void imageColorSpace(int value) {this.ptr.set(LAYOUT$imageColorSpace, OFFSET$imageColorSpace, value);}
    public java.lang.foreign.MemorySegment imageColorSpace_ptr() {return this.ptr.asSlice(OFFSET$imageColorSpace, LAYOUT$imageColorSpace);}

    public vulkan.VkExtent2D imageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));}

    public int imageArrayLayers() {return this.ptr.get(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers);}
    public void imageArrayLayers(int value) {this.ptr.set(LAYOUT$imageArrayLayers, OFFSET$imageArrayLayers, value);}
    public java.lang.foreign.MemorySegment imageArrayLayers_ptr() {return this.ptr.asSlice(OFFSET$imageArrayLayers, LAYOUT$imageArrayLayers);}

    public int imageUsage() {return this.ptr.get(LAYOUT$imageUsage, OFFSET$imageUsage);}
    public void imageUsage(int value) {this.ptr.set(LAYOUT$imageUsage, OFFSET$imageUsage, value);}
    public java.lang.foreign.MemorySegment imageUsage_ptr() {return this.ptr.asSlice(OFFSET$imageUsage, LAYOUT$imageUsage);}

    public int imageSharingMode() {return this.ptr.get(LAYOUT$imageSharingMode, OFFSET$imageSharingMode);}
    public void imageSharingMode(int value) {this.ptr.set(LAYOUT$imageSharingMode, OFFSET$imageSharingMode, value);}
    public java.lang.foreign.MemorySegment imageSharingMode_ptr() {return this.ptr.asSlice(OFFSET$imageSharingMode, LAYOUT$imageSharingMode);}

    public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);}
    public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);}
    public java.lang.foreign.MemorySegment queueFamilyIndexCount_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndexCount, LAYOUT$queueFamilyIndexCount);}

    public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);}
    public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);}
    public java.lang.foreign.MemorySegment pQueueFamilyIndices_ptr() {return this.ptr.asSlice(OFFSET$pQueueFamilyIndices, LAYOUT$pQueueFamilyIndices);}

    public int preTransform() {return this.ptr.get(LAYOUT$preTransform, OFFSET$preTransform);}
    public void preTransform(int value) {this.ptr.set(LAYOUT$preTransform, OFFSET$preTransform, value);}
    public java.lang.foreign.MemorySegment preTransform_ptr() {return this.ptr.asSlice(OFFSET$preTransform, LAYOUT$preTransform);}

    public int compositeAlpha() {return this.ptr.get(LAYOUT$compositeAlpha, OFFSET$compositeAlpha);}
    public void compositeAlpha(int value) {this.ptr.set(LAYOUT$compositeAlpha, OFFSET$compositeAlpha, value);}
    public java.lang.foreign.MemorySegment compositeAlpha_ptr() {return this.ptr.asSlice(OFFSET$compositeAlpha, LAYOUT$compositeAlpha);}

    public int presentMode() {return this.ptr.get(LAYOUT$presentMode, OFFSET$presentMode);}
    public void presentMode(int value) {this.ptr.set(LAYOUT$presentMode, OFFSET$presentMode, value);}
    public java.lang.foreign.MemorySegment presentMode_ptr() {return this.ptr.asSlice(OFFSET$presentMode, LAYOUT$presentMode);}

    public int clipped() {return this.ptr.get(LAYOUT$clipped, OFFSET$clipped);}
    public void clipped(int value) {this.ptr.set(LAYOUT$clipped, OFFSET$clipped, value);}
    public java.lang.foreign.MemorySegment clipped_ptr() {return this.ptr.asSlice(OFFSET$clipped, LAYOUT$clipped);}

    public java.lang.foreign.MemorySegment oldSwapchain() {return this.ptr.get(LAYOUT$oldSwapchain, OFFSET$oldSwapchain);}
    public void oldSwapchain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$oldSwapchain, OFFSET$oldSwapchain, value);}
    public java.lang.foreign.MemorySegment oldSwapchain_ptr() {return this.ptr.asSlice(OFFSET$oldSwapchain, LAYOUT$oldSwapchain);}
}
