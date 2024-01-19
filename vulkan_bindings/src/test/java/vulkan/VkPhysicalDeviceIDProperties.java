package vulkan;

public record VkPhysicalDeviceIDProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$deviceUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$deviceUUID = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$driverUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$driverUUID = 32L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$deviceLUID = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$deviceLUID = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceNodeMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceNodeMask = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceLUIDValid = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceLUIDValid = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceUUID,
            LAYOUT$driverUUID,
            LAYOUT$deviceLUID,
            LAYOUT$deviceNodeMask,
            LAYOUT$deviceLUIDValid
    ).withName("VkPhysicalDeviceIDProperties");

    public VkPhysicalDeviceIDProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment deviceUUID() {return this.ptr.asSlice(OFFSET$deviceUUID, LAYOUT$deviceUUID);}
    public char deviceUUID(int i) {return (char)this.deviceUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void deviceUUID(int i, char value) {this.deviceUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment driverUUID() {return this.ptr.asSlice(OFFSET$driverUUID, LAYOUT$driverUUID);}
    public char driverUUID(int i) {return (char)this.driverUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void driverUUID(int i, char value) {this.driverUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment deviceLUID() {return this.ptr.asSlice(OFFSET$deviceLUID, LAYOUT$deviceLUID);}
    public char deviceLUID(int i) {return (char)this.deviceLUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void deviceLUID(int i, char value) {this.deviceLUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int deviceNodeMask() {return this.ptr.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);}
    public void deviceNodeMask(int value) {this.ptr.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);}
    public java.lang.foreign.MemorySegment deviceNodeMask_ptr() {return this.ptr.asSlice(OFFSET$deviceNodeMask, LAYOUT$deviceNodeMask);}

    public int deviceLUIDValid() {return this.ptr.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);}
    public void deviceLUIDValid(int value) {this.ptr.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);}
    public java.lang.foreign.MemorySegment deviceLUIDValid_ptr() {return this.ptr.asSlice(OFFSET$deviceLUIDValid, LAYOUT$deviceLUIDValid);}
}
