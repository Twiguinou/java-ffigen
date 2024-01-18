package vulkan;

public record VkPerformanceCounterKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$unit = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$unit = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scope = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$scope = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storage = 24L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$uuid = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$uuid = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$unit,
			LAYOUT$scope,
			LAYOUT$storage,
			LAYOUT$uuid,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPerformanceCounterKHR");

	public VkPerformanceCounterKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int unit() {return this.ptr.get(LAYOUT$unit, OFFSET$unit);}
	public void unit(int value) {this.ptr.set(LAYOUT$unit, OFFSET$unit, value);}
	public java.lang.foreign.MemorySegment unit_ptr() {return this.ptr.asSlice(OFFSET$unit, LAYOUT$unit);}

	public int scope() {return this.ptr.get(LAYOUT$scope, OFFSET$scope);}
	public void scope(int value) {this.ptr.set(LAYOUT$scope, OFFSET$scope, value);}
	public java.lang.foreign.MemorySegment scope_ptr() {return this.ptr.asSlice(OFFSET$scope, LAYOUT$scope);}

	public int storage() {return this.ptr.get(LAYOUT$storage, OFFSET$storage);}
	public void storage(int value) {this.ptr.set(LAYOUT$storage, OFFSET$storage, value);}
	public java.lang.foreign.MemorySegment storage_ptr() {return this.ptr.asSlice(OFFSET$storage, LAYOUT$storage);}

	public java.lang.foreign.MemorySegment uuid() {return this.ptr.asSlice(OFFSET$uuid, LAYOUT$uuid);}
	public char uuid(int i) {return (char)this.uuid().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void uuid(int i, char value) {this.uuid().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
