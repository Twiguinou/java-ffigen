package vulkan;

public record VkVideoDecodeInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$srcBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$srcBuffer = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcBufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$srcBufferOffset = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$srcBufferRange = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstPictureResource = vulkan.VkVideoPictureResourceInfoKHR.gStructLayout;
    public static final long OFFSET$dstPictureResource = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSetupReferenceSlot = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSetupReferenceSlot = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$referenceSlotCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$referenceSlotCount = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pReferenceSlots = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pReferenceSlots = 112L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$srcBuffer,
            LAYOUT$srcBufferOffset,
            LAYOUT$srcBufferRange,
            LAYOUT$dstPictureResource,
            LAYOUT$pSetupReferenceSlot,
            LAYOUT$referenceSlotCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pReferenceSlots
    ).withName("VkVideoDecodeInfoKHR");

    public VkVideoDecodeInfoKHR(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment srcBuffer() {return this.ptr.get(LAYOUT$srcBuffer, OFFSET$srcBuffer);}
    public void srcBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcBuffer, OFFSET$srcBuffer, value);}
    public java.lang.foreign.MemorySegment srcBuffer_ptr() {return this.ptr.asSlice(OFFSET$srcBuffer, LAYOUT$srcBuffer);}

    public long srcBufferOffset() {return this.ptr.get(LAYOUT$srcBufferOffset, OFFSET$srcBufferOffset);}
    public void srcBufferOffset(long value) {this.ptr.set(LAYOUT$srcBufferOffset, OFFSET$srcBufferOffset, value);}
    public java.lang.foreign.MemorySegment srcBufferOffset_ptr() {return this.ptr.asSlice(OFFSET$srcBufferOffset, LAYOUT$srcBufferOffset);}

    public long srcBufferRange() {return this.ptr.get(LAYOUT$srcBufferRange, OFFSET$srcBufferRange);}
    public void srcBufferRange(long value) {this.ptr.set(LAYOUT$srcBufferRange, OFFSET$srcBufferRange, value);}
    public java.lang.foreign.MemorySegment srcBufferRange_ptr() {return this.ptr.asSlice(OFFSET$srcBufferRange, LAYOUT$srcBufferRange);}

    public vulkan.VkVideoPictureResourceInfoKHR dstPictureResource() {return new vulkan.VkVideoPictureResourceInfoKHR(this.ptr.asSlice(OFFSET$dstPictureResource, LAYOUT$dstPictureResource));}

    public java.lang.foreign.MemorySegment pSetupReferenceSlot() {return this.ptr.get(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot);}
    public void pSetupReferenceSlot(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot, value);}
    public java.lang.foreign.MemorySegment pSetupReferenceSlot_ptr() {return this.ptr.asSlice(OFFSET$pSetupReferenceSlot, LAYOUT$pSetupReferenceSlot);}

    public int referenceSlotCount() {return this.ptr.get(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount);}
    public void referenceSlotCount(int value) {this.ptr.set(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount, value);}
    public java.lang.foreign.MemorySegment referenceSlotCount_ptr() {return this.ptr.asSlice(OFFSET$referenceSlotCount, LAYOUT$referenceSlotCount);}

    public java.lang.foreign.MemorySegment pReferenceSlots() {return this.ptr.get(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots);}
    public void pReferenceSlots(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots, value);}
    public java.lang.foreign.MemorySegment pReferenceSlots_ptr() {return this.ptr.asSlice(OFFSET$pReferenceSlots, LAYOUT$pReferenceSlots);}
}
