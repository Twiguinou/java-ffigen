package vulkan;

public record VkDeviceFaultVendorInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$description = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vendorFaultCode = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vendorFaultCode = 256L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vendorFaultData = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vendorFaultData = 264L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$description,
            LAYOUT$vendorFaultCode,
            LAYOUT$vendorFaultData
    ).withName("VkDeviceFaultVendorInfoEXT");

    public VkDeviceFaultVendorInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
    public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public long vendorFaultCode() {return this.ptr.get(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode);}
    public void vendorFaultCode(long value) {this.ptr.set(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode, value);}
    public java.lang.foreign.MemorySegment vendorFaultCode_ptr() {return this.ptr.asSlice(OFFSET$vendorFaultCode, LAYOUT$vendorFaultCode);}

    public long vendorFaultData() {return this.ptr.get(LAYOUT$vendorFaultData, OFFSET$vendorFaultData);}
    public void vendorFaultData(long value) {this.ptr.set(LAYOUT$vendorFaultData, OFFSET$vendorFaultData, value);}
    public java.lang.foreign.MemorySegment vendorFaultData_ptr() {return this.ptr.asSlice(OFFSET$vendorFaultData, LAYOUT$vendorFaultData);}
}
