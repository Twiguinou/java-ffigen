package vulkan;

public record VkDeviceFaultInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$description = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAddressInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAddressInfos = 272L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVendorInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVendorInfos = 280L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVendorBinaryData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVendorBinaryData = 288L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$description,
            LAYOUT$pAddressInfos,
            LAYOUT$pVendorInfos,
            LAYOUT$pVendorBinaryData
    ).withName("VkDeviceFaultInfoEXT");

    public VkDeviceFaultInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
    public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pAddressInfos() {return this.ptr.get(LAYOUT$pAddressInfos, OFFSET$pAddressInfos);}
    public void pAddressInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAddressInfos, OFFSET$pAddressInfos, value);}
    public java.lang.foreign.MemorySegment pAddressInfos_ptr() {return this.ptr.asSlice(OFFSET$pAddressInfos, LAYOUT$pAddressInfos);}

    public java.lang.foreign.MemorySegment pVendorInfos() {return this.ptr.get(LAYOUT$pVendorInfos, OFFSET$pVendorInfos);}
    public void pVendorInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVendorInfos, OFFSET$pVendorInfos, value);}
    public java.lang.foreign.MemorySegment pVendorInfos_ptr() {return this.ptr.asSlice(OFFSET$pVendorInfos, LAYOUT$pVendorInfos);}

    public java.lang.foreign.MemorySegment pVendorBinaryData() {return this.ptr.get(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData);}
    public void pVendorBinaryData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData, value);}
    public java.lang.foreign.MemorySegment pVendorBinaryData_ptr() {return this.ptr.asSlice(OFFSET$pVendorBinaryData, LAYOUT$pVendorBinaryData);}
}
