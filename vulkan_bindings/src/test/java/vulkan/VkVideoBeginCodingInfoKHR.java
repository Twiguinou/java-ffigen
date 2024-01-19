package vulkan;

public record VkVideoBeginCodingInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$videoSession = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$videoSession = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$videoSessionParameters = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$videoSessionParameters = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$referenceSlotCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$referenceSlotCount = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pReferenceSlots = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pReferenceSlots = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$videoSession,
            LAYOUT$videoSessionParameters,
            LAYOUT$referenceSlotCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pReferenceSlots
    ).withName("VkVideoBeginCodingInfoKHR");

    public VkVideoBeginCodingInfoKHR(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment videoSession() {return this.ptr.get(LAYOUT$videoSession, OFFSET$videoSession);}
    public void videoSession(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$videoSession, OFFSET$videoSession, value);}
    public java.lang.foreign.MemorySegment videoSession_ptr() {return this.ptr.asSlice(OFFSET$videoSession, LAYOUT$videoSession);}

    public java.lang.foreign.MemorySegment videoSessionParameters() {return this.ptr.get(LAYOUT$videoSessionParameters, OFFSET$videoSessionParameters);}
    public void videoSessionParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$videoSessionParameters, OFFSET$videoSessionParameters, value);}
    public java.lang.foreign.MemorySegment videoSessionParameters_ptr() {return this.ptr.asSlice(OFFSET$videoSessionParameters, LAYOUT$videoSessionParameters);}

    public int referenceSlotCount() {return this.ptr.get(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount);}
    public void referenceSlotCount(int value) {this.ptr.set(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount, value);}
    public java.lang.foreign.MemorySegment referenceSlotCount_ptr() {return this.ptr.asSlice(OFFSET$referenceSlotCount, LAYOUT$referenceSlotCount);}

    public java.lang.foreign.MemorySegment pReferenceSlots() {return this.ptr.get(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots);}
    public void pReferenceSlots(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots, value);}
    public java.lang.foreign.MemorySegment pReferenceSlots_ptr() {return this.ptr.asSlice(OFFSET$pReferenceSlots, LAYOUT$pReferenceSlots);}
}
