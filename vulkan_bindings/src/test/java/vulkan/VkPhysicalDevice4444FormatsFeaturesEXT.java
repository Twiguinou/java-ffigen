package vulkan;

public record VkPhysicalDevice4444FormatsFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$formatA4R4G4B4 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$formatA4R4G4B4 = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$formatA4B4G4R4 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$formatA4B4G4R4 = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$formatA4R4G4B4,
			LAYOUT$formatA4B4G4R4
	).withName("VkPhysicalDevice4444FormatsFeaturesEXT");

	public VkPhysicalDevice4444FormatsFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int formatA4R4G4B4() {return this.ptr.get(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4);}
	public void formatA4R4G4B4(int value) {this.ptr.set(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4, value);}
	public java.lang.foreign.MemorySegment formatA4R4G4B4_ptr() {return this.ptr.asSlice(OFFSET$formatA4R4G4B4, LAYOUT$formatA4R4G4B4);}

	public int formatA4B4G4R4() {return this.ptr.get(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4);}
	public void formatA4B4G4R4(int value) {this.ptr.set(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4, value);}
	public java.lang.foreign.MemorySegment formatA4B4G4R4_ptr() {return this.ptr.asSlice(OFFSET$formatA4B4G4R4, LAYOUT$formatA4B4G4R4);}
}
