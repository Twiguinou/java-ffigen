package vulkan;

public record VkRenderPassSampleLocationsBeginInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentInitialSampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachmentInitialSampleLocationsCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAttachmentInitialSampleLocations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAttachmentInitialSampleLocations = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$postSubpassSampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$postSubpassSampleLocationsCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPostSubpassSampleLocations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPostSubpassSampleLocations = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$attachmentInitialSampleLocationsCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pAttachmentInitialSampleLocations,
            LAYOUT$postSubpassSampleLocationsCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPostSubpassSampleLocations
    ).withName("VkRenderPassSampleLocationsBeginInfoEXT");

    public VkRenderPassSampleLocationsBeginInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int attachmentInitialSampleLocationsCount() {return this.ptr.get(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount);}
    public void attachmentInitialSampleLocationsCount(int value) {this.ptr.set(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment attachmentInitialSampleLocationsCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentInitialSampleLocationsCount, LAYOUT$attachmentInitialSampleLocationsCount);}

    public java.lang.foreign.MemorySegment pAttachmentInitialSampleLocations() {return this.ptr.get(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations);}
    public void pAttachmentInitialSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations, value);}
    public java.lang.foreign.MemorySegment pAttachmentInitialSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$pAttachmentInitialSampleLocations, LAYOUT$pAttachmentInitialSampleLocations);}

    public int postSubpassSampleLocationsCount() {return this.ptr.get(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount);}
    public void postSubpassSampleLocationsCount(int value) {this.ptr.set(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment postSubpassSampleLocationsCount_ptr() {return this.ptr.asSlice(OFFSET$postSubpassSampleLocationsCount, LAYOUT$postSubpassSampleLocationsCount);}

    public java.lang.foreign.MemorySegment pPostSubpassSampleLocations() {return this.ptr.get(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations);}
    public void pPostSubpassSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations, value);}
    public java.lang.foreign.MemorySegment pPostSubpassSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$pPostSubpassSampleLocations, LAYOUT$pPostSubpassSampleLocations);}
}
