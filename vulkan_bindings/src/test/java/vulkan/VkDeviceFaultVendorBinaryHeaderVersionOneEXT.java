package vulkan;

public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$headerSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$headerSize = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$headerVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$headerVersion = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vendorID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vendorID = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$deviceID = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$driverVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$driverVersion = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$pipelineCacheUUID = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$applicationNameOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$applicationNameOffset = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$applicationVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$applicationVersion = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$engineNameOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$engineNameOffset = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$engineVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$engineVersion = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$apiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$apiVersion = 52L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$headerSize,
			LAYOUT$headerVersion,
			LAYOUT$vendorID,
			LAYOUT$deviceID,
			LAYOUT$driverVersion,
			LAYOUT$pipelineCacheUUID,
			LAYOUT$applicationNameOffset,
			LAYOUT$applicationVersion,
			LAYOUT$engineNameOffset,
			LAYOUT$engineVersion,
			LAYOUT$apiVersion
	).withName("VkDeviceFaultVendorBinaryHeaderVersionOneEXT");

	public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int headerSize() {return this.ptr.get(LAYOUT$headerSize, OFFSET$headerSize);}
	public void headerSize(int value) {this.ptr.set(LAYOUT$headerSize, OFFSET$headerSize, value);}
	public java.lang.foreign.MemorySegment headerSize_ptr() {return this.ptr.asSlice(OFFSET$headerSize, LAYOUT$headerSize);}

	public int headerVersion() {return this.ptr.get(LAYOUT$headerVersion, OFFSET$headerVersion);}
	public void headerVersion(int value) {this.ptr.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);}
	public java.lang.foreign.MemorySegment headerVersion_ptr() {return this.ptr.asSlice(OFFSET$headerVersion, LAYOUT$headerVersion);}

	public int vendorID() {return this.ptr.get(LAYOUT$vendorID, OFFSET$vendorID);}
	public void vendorID(int value) {this.ptr.set(LAYOUT$vendorID, OFFSET$vendorID, value);}
	public java.lang.foreign.MemorySegment vendorID_ptr() {return this.ptr.asSlice(OFFSET$vendorID, LAYOUT$vendorID);}

	public int deviceID() {return this.ptr.get(LAYOUT$deviceID, OFFSET$deviceID);}
	public void deviceID(int value) {this.ptr.set(LAYOUT$deviceID, OFFSET$deviceID, value);}
	public java.lang.foreign.MemorySegment deviceID_ptr() {return this.ptr.asSlice(OFFSET$deviceID, LAYOUT$deviceID);}

	public int driverVersion() {return this.ptr.get(LAYOUT$driverVersion, OFFSET$driverVersion);}
	public void driverVersion(int value) {this.ptr.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);}
	public java.lang.foreign.MemorySegment driverVersion_ptr() {return this.ptr.asSlice(OFFSET$driverVersion, LAYOUT$driverVersion);}

	public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET$pipelineCacheUUID, LAYOUT$pipelineCacheUUID);}
	public char pipelineCacheUUID(int i) {return (char)this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void pipelineCacheUUID(int i, char value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int applicationNameOffset() {return this.ptr.get(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset);}
	public void applicationNameOffset(int value) {this.ptr.set(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset, value);}
	public java.lang.foreign.MemorySegment applicationNameOffset_ptr() {return this.ptr.asSlice(OFFSET$applicationNameOffset, LAYOUT$applicationNameOffset);}

	public int applicationVersion() {return this.ptr.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);}
	public void applicationVersion(int value) {this.ptr.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);}
	public java.lang.foreign.MemorySegment applicationVersion_ptr() {return this.ptr.asSlice(OFFSET$applicationVersion, LAYOUT$applicationVersion);}

	public int engineNameOffset() {return this.ptr.get(LAYOUT$engineNameOffset, OFFSET$engineNameOffset);}
	public void engineNameOffset(int value) {this.ptr.set(LAYOUT$engineNameOffset, OFFSET$engineNameOffset, value);}
	public java.lang.foreign.MemorySegment engineNameOffset_ptr() {return this.ptr.asSlice(OFFSET$engineNameOffset, LAYOUT$engineNameOffset);}

	public int engineVersion() {return this.ptr.get(LAYOUT$engineVersion, OFFSET$engineVersion);}
	public void engineVersion(int value) {this.ptr.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);}
	public java.lang.foreign.MemorySegment engineVersion_ptr() {return this.ptr.asSlice(OFFSET$engineVersion, LAYOUT$engineVersion);}

	public int apiVersion() {return this.ptr.get(LAYOUT$apiVersion, OFFSET$apiVersion);}
	public void apiVersion(int value) {this.ptr.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);}
	public java.lang.foreign.MemorySegment apiVersion_ptr() {return this.ptr.asSlice(OFFSET$apiVersion, LAYOUT$apiVersion);}
}
