package vulkan;

public record VkDeviceOrHostAddressConstKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$deviceAddress = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$hostAddress = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$hostAddress = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$deviceAddress,
            LAYOUT$hostAddress
    ).withName("VkDeviceOrHostAddressConstKHR");

    public VkDeviceOrHostAddressConstKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long deviceAddress() {return this.ptr.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);}
    public java.lang.foreign.MemorySegment deviceAddress_ptr() {return this.ptr.asSlice(OFFSET$deviceAddress, LAYOUT$deviceAddress);}

    public java.lang.foreign.MemorySegment hostAddress() {return this.ptr.get(LAYOUT$hostAddress, OFFSET$hostAddress);}
    public void hostAddress(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$hostAddress, OFFSET$hostAddress, value);}
    public java.lang.foreign.MemorySegment hostAddress_ptr() {return this.ptr.asSlice(OFFSET$hostAddress, LAYOUT$hostAddress);}
}
