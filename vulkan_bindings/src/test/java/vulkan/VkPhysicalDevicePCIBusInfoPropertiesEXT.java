package vulkan;

public record VkPhysicalDevicePCIBusInfoPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pciDomain = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pciDomain = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pciBus = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pciBus = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pciDevice = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pciDevice = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pciFunction = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pciFunction = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$pciDomain,
			LAYOUT$pciBus,
			LAYOUT$pciDevice,
			LAYOUT$pciFunction
	).withName("VkPhysicalDevicePCIBusInfoPropertiesEXT");

	public VkPhysicalDevicePCIBusInfoPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int pciDomain() {return this.ptr.get(LAYOUT$pciDomain, OFFSET$pciDomain);}
	public void pciDomain(int value) {this.ptr.set(LAYOUT$pciDomain, OFFSET$pciDomain, value);}
	public java.lang.foreign.MemorySegment pciDomain_ptr() {return this.ptr.asSlice(OFFSET$pciDomain, LAYOUT$pciDomain);}

	public int pciBus() {return this.ptr.get(LAYOUT$pciBus, OFFSET$pciBus);}
	public void pciBus(int value) {this.ptr.set(LAYOUT$pciBus, OFFSET$pciBus, value);}
	public java.lang.foreign.MemorySegment pciBus_ptr() {return this.ptr.asSlice(OFFSET$pciBus, LAYOUT$pciBus);}

	public int pciDevice() {return this.ptr.get(LAYOUT$pciDevice, OFFSET$pciDevice);}
	public void pciDevice(int value) {this.ptr.set(LAYOUT$pciDevice, OFFSET$pciDevice, value);}
	public java.lang.foreign.MemorySegment pciDevice_ptr() {return this.ptr.asSlice(OFFSET$pciDevice, LAYOUT$pciDevice);}

	public int pciFunction() {return this.ptr.get(LAYOUT$pciFunction, OFFSET$pciFunction);}
	public void pciFunction(int value) {this.ptr.set(LAYOUT$pciFunction, OFFSET$pciFunction, value);}
	public java.lang.foreign.MemorySegment pciFunction_ptr() {return this.ptr.asSlice(OFFSET$pciFunction, LAYOUT$pciFunction);}
}
