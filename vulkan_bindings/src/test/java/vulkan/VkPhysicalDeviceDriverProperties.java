package vulkan;

public record VkPhysicalDeviceDriverProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$driverID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$driverID = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$driverName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$driverName = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$driverInfo = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$driverInfo = 276L;
	public static final java.lang.foreign.GroupLayout LAYOUT$conformanceVersion = vulkan.VkConformanceVersion.gStructLayout;
	public static final long OFFSET$conformanceVersion = 532L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$driverID,
			LAYOUT$driverName,
			LAYOUT$driverInfo,
			LAYOUT$conformanceVersion
	).withName("VkPhysicalDeviceDriverProperties");

	public VkPhysicalDeviceDriverProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int driverID() {return this.ptr.get(LAYOUT$driverID, OFFSET$driverID);}
	public void driverID(int value) {this.ptr.set(LAYOUT$driverID, OFFSET$driverID, value);}
	public java.lang.foreign.MemorySegment driverID_ptr() {return this.ptr.asSlice(OFFSET$driverID, LAYOUT$driverID);}

	public java.lang.foreign.MemorySegment driverName() {return this.ptr.asSlice(OFFSET$driverName, LAYOUT$driverName);}
	public char driverName(int i) {return (char)this.driverName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void driverName(int i, char value) {this.driverName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment driverInfo() {return this.ptr.asSlice(OFFSET$driverInfo, LAYOUT$driverInfo);}
	public char driverInfo(int i) {return (char)this.driverInfo().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void driverInfo(int i, char value) {this.driverInfo().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public vulkan.VkConformanceVersion conformanceVersion() {return new vulkan.VkConformanceVersion(this.ptr.asSlice(OFFSET$conformanceVersion, LAYOUT$conformanceVersion));}
}
