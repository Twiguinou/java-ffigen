package vulkan;

public record VkExtensionProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$extensionName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$extensionName = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$specVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$specVersion = 256L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$extensionName,
			LAYOUT$specVersion
	).withName("VkExtensionProperties");

	public VkExtensionProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment extensionName() {return this.ptr.asSlice(OFFSET$extensionName, LAYOUT$extensionName);}
	public char extensionName(int i) {return (char)this.extensionName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void extensionName(int i, char value) {this.extensionName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int specVersion() {return this.ptr.get(LAYOUT$specVersion, OFFSET$specVersion);}
	public void specVersion(int value) {this.ptr.set(LAYOUT$specVersion, OFFSET$specVersion, value);}
	public java.lang.foreign.MemorySegment specVersion_ptr() {return this.ptr.asSlice(OFFSET$specVersion, LAYOUT$specVersion);}
}
