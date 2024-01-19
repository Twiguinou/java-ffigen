package vulkan;

public record VkPhysicalDeviceHostImageCopyPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$copySrcLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$copySrcLayoutCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCopySrcLayouts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCopySrcLayouts = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$copyDstLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$copyDstLayoutCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCopyDstLayouts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCopyDstLayouts = 40L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$optimalTilingLayoutUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$optimalTilingLayoutUUID = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$identicalMemoryTypeRequirements = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$identicalMemoryTypeRequirements = 64L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$copySrcLayoutCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pCopySrcLayouts,
			LAYOUT$copyDstLayoutCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pCopyDstLayouts,
			LAYOUT$optimalTilingLayoutUUID,
			LAYOUT$identicalMemoryTypeRequirements,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceHostImageCopyPropertiesEXT");

	public VkPhysicalDeviceHostImageCopyPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int copySrcLayoutCount() {return this.ptr.get(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount);}
	public void copySrcLayoutCount(int value) {this.ptr.set(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount, value);}
	public java.lang.foreign.MemorySegment copySrcLayoutCount_ptr() {return this.ptr.asSlice(OFFSET$copySrcLayoutCount, LAYOUT$copySrcLayoutCount);}

	public java.lang.foreign.MemorySegment pCopySrcLayouts() {return this.ptr.get(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts);}
	public void pCopySrcLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts, value);}
	public java.lang.foreign.MemorySegment pCopySrcLayouts_ptr() {return this.ptr.asSlice(OFFSET$pCopySrcLayouts, LAYOUT$pCopySrcLayouts);}

	public int copyDstLayoutCount() {return this.ptr.get(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount);}
	public void copyDstLayoutCount(int value) {this.ptr.set(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount, value);}
	public java.lang.foreign.MemorySegment copyDstLayoutCount_ptr() {return this.ptr.asSlice(OFFSET$copyDstLayoutCount, LAYOUT$copyDstLayoutCount);}

	public java.lang.foreign.MemorySegment pCopyDstLayouts() {return this.ptr.get(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts);}
	public void pCopyDstLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts, value);}
	public java.lang.foreign.MemorySegment pCopyDstLayouts_ptr() {return this.ptr.asSlice(OFFSET$pCopyDstLayouts, LAYOUT$pCopyDstLayouts);}

	public java.lang.foreign.MemorySegment optimalTilingLayoutUUID() {return this.ptr.asSlice(OFFSET$optimalTilingLayoutUUID, LAYOUT$optimalTilingLayoutUUID);}
	public char optimalTilingLayoutUUID(int i) {return (char)this.optimalTilingLayoutUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void optimalTilingLayoutUUID(int i, char value) {this.optimalTilingLayoutUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int identicalMemoryTypeRequirements() {return this.ptr.get(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements);}
	public void identicalMemoryTypeRequirements(int value) {this.ptr.set(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements, value);}
	public java.lang.foreign.MemorySegment identicalMemoryTypeRequirements_ptr() {return this.ptr.asSlice(OFFSET$identicalMemoryTypeRequirements, LAYOUT$identicalMemoryTypeRequirements);}
}
