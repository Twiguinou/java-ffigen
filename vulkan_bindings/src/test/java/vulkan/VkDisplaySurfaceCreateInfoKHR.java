package vulkan;

public record VkDisplaySurfaceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$displayMode = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$displayMode = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$planeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$planeIndex = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$planeStackIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$planeStackIndex = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transform = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$transform = 40L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$globalAlpha = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$globalAlpha = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$alphaMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$alphaMode = 48L;
	public static final java.lang.foreign.GroupLayout LAYOUT$imageExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$imageExtent = 52L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$displayMode,
			LAYOUT$planeIndex,
			LAYOUT$planeStackIndex,
			LAYOUT$transform,
			LAYOUT$globalAlpha,
			LAYOUT$alphaMode,
			LAYOUT$imageExtent,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDisplaySurfaceCreateInfoKHR");

	public VkDisplaySurfaceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public java.lang.foreign.MemorySegment displayMode() {return this.ptr.get(LAYOUT$displayMode, OFFSET$displayMode);}
	public void displayMode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$displayMode, OFFSET$displayMode, value);}
	public java.lang.foreign.MemorySegment displayMode_ptr() {return this.ptr.asSlice(OFFSET$displayMode, LAYOUT$displayMode);}

	public int planeIndex() {return this.ptr.get(LAYOUT$planeIndex, OFFSET$planeIndex);}
	public void planeIndex(int value) {this.ptr.set(LAYOUT$planeIndex, OFFSET$planeIndex, value);}
	public java.lang.foreign.MemorySegment planeIndex_ptr() {return this.ptr.asSlice(OFFSET$planeIndex, LAYOUT$planeIndex);}

	public int planeStackIndex() {return this.ptr.get(LAYOUT$planeStackIndex, OFFSET$planeStackIndex);}
	public void planeStackIndex(int value) {this.ptr.set(LAYOUT$planeStackIndex, OFFSET$planeStackIndex, value);}
	public java.lang.foreign.MemorySegment planeStackIndex_ptr() {return this.ptr.asSlice(OFFSET$planeStackIndex, LAYOUT$planeStackIndex);}

	public int transform() {return this.ptr.get(LAYOUT$transform, OFFSET$transform);}
	public void transform(int value) {this.ptr.set(LAYOUT$transform, OFFSET$transform, value);}
	public java.lang.foreign.MemorySegment transform_ptr() {return this.ptr.asSlice(OFFSET$transform, LAYOUT$transform);}

	public float globalAlpha() {return this.ptr.get(LAYOUT$globalAlpha, OFFSET$globalAlpha);}
	public void globalAlpha(float value) {this.ptr.set(LAYOUT$globalAlpha, OFFSET$globalAlpha, value);}
	public java.lang.foreign.MemorySegment globalAlpha_ptr() {return this.ptr.asSlice(OFFSET$globalAlpha, LAYOUT$globalAlpha);}

	public int alphaMode() {return this.ptr.get(LAYOUT$alphaMode, OFFSET$alphaMode);}
	public void alphaMode(int value) {this.ptr.set(LAYOUT$alphaMode, OFFSET$alphaMode, value);}
	public java.lang.foreign.MemorySegment alphaMode_ptr() {return this.ptr.asSlice(OFFSET$alphaMode, LAYOUT$alphaMode);}

	public vulkan.VkExtent2D imageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));}
}
