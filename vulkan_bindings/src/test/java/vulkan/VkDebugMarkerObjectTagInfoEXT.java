package vulkan;

public record VkDebugMarkerObjectTagInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$objectType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$objectType = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$object = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$object = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$tagName = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$tagName = 32L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$tagSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$tagSize = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pTag = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pTag = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$objectType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$object,
			LAYOUT$tagName,
			LAYOUT$tagSize,
			LAYOUT$pTag
	).withName("VkDebugMarkerObjectTagInfoEXT");

	public VkDebugMarkerObjectTagInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int objectType() {return this.ptr.get(LAYOUT$objectType, OFFSET$objectType);}
	public void objectType(int value) {this.ptr.set(LAYOUT$objectType, OFFSET$objectType, value);}
	public java.lang.foreign.MemorySegment objectType_ptr() {return this.ptr.asSlice(OFFSET$objectType, LAYOUT$objectType);}

	public long object() {return this.ptr.get(LAYOUT$object, OFFSET$object);}
	public void object(long value) {this.ptr.set(LAYOUT$object, OFFSET$object, value);}
	public java.lang.foreign.MemorySegment object_ptr() {return this.ptr.asSlice(OFFSET$object, LAYOUT$object);}

	public long tagName() {return this.ptr.get(LAYOUT$tagName, OFFSET$tagName);}
	public void tagName(long value) {this.ptr.set(LAYOUT$tagName, OFFSET$tagName, value);}
	public java.lang.foreign.MemorySegment tagName_ptr() {return this.ptr.asSlice(OFFSET$tagName, LAYOUT$tagName);}

	public long tagSize() {return this.ptr.get(LAYOUT$tagSize, OFFSET$tagSize);}
	public void tagSize(long value) {this.ptr.set(LAYOUT$tagSize, OFFSET$tagSize, value);}
	public java.lang.foreign.MemorySegment tagSize_ptr() {return this.ptr.asSlice(OFFSET$tagSize, LAYOUT$tagSize);}

	public java.lang.foreign.MemorySegment pTag() {return this.ptr.get(LAYOUT$pTag, OFFSET$pTag);}
	public void pTag(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTag, OFFSET$pTag, value);}
	public java.lang.foreign.MemorySegment pTag_ptr() {return this.ptr.asSlice(OFFSET$pTag, LAYOUT$pTag);}
}
