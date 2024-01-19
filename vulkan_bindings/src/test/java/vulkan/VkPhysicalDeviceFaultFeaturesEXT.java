package vulkan;

public record VkPhysicalDeviceFaultFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceFault = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceFault = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceFaultVendorBinary = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceFaultVendorBinary = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceFault,
            LAYOUT$deviceFaultVendorBinary
    ).withName("VkPhysicalDeviceFaultFeaturesEXT");

    public VkPhysicalDeviceFaultFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int deviceFault() {return this.ptr.get(LAYOUT$deviceFault, OFFSET$deviceFault);}
    public void deviceFault(int value) {this.ptr.set(LAYOUT$deviceFault, OFFSET$deviceFault, value);}
    public java.lang.foreign.MemorySegment deviceFault_ptr() {return this.ptr.asSlice(OFFSET$deviceFault, LAYOUT$deviceFault);}

    public int deviceFaultVendorBinary() {return this.ptr.get(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary);}
    public void deviceFaultVendorBinary(int value) {this.ptr.set(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary, value);}
    public java.lang.foreign.MemorySegment deviceFaultVendorBinary_ptr() {return this.ptr.asSlice(OFFSET$deviceFaultVendorBinary, LAYOUT$deviceFaultVendorBinary);}
}
