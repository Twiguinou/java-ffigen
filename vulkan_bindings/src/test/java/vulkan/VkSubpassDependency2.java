package vulkan;

public record VkSubpassDependency2(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcSubpass = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcSubpass = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstSubpass = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstSubpass = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcStageMask = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstStageMask = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcAccessMask = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstAccessMask = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dependencyFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dependencyFlags = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewOffset = 44L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcSubpass,
			LAYOUT$dstSubpass,
			LAYOUT$srcStageMask,
			LAYOUT$dstStageMask,
			LAYOUT$srcAccessMask,
			LAYOUT$dstAccessMask,
			LAYOUT$dependencyFlags,
			LAYOUT$viewOffset
	).withName("VkSubpassDependency2");

	public VkSubpassDependency2(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int srcSubpass() {return this.ptr.get(LAYOUT$srcSubpass, OFFSET$srcSubpass);}
	public void srcSubpass(int value) {this.ptr.set(LAYOUT$srcSubpass, OFFSET$srcSubpass, value);}
	public java.lang.foreign.MemorySegment srcSubpass_ptr() {return this.ptr.asSlice(OFFSET$srcSubpass, LAYOUT$srcSubpass);}

	public int dstSubpass() {return this.ptr.get(LAYOUT$dstSubpass, OFFSET$dstSubpass);}
	public void dstSubpass(int value) {this.ptr.set(LAYOUT$dstSubpass, OFFSET$dstSubpass, value);}
	public java.lang.foreign.MemorySegment dstSubpass_ptr() {return this.ptr.asSlice(OFFSET$dstSubpass, LAYOUT$dstSubpass);}

	public int srcStageMask() {return this.ptr.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);}
	public void srcStageMask(int value) {this.ptr.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);}
	public java.lang.foreign.MemorySegment srcStageMask_ptr() {return this.ptr.asSlice(OFFSET$srcStageMask, LAYOUT$srcStageMask);}

	public int dstStageMask() {return this.ptr.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);}
	public void dstStageMask(int value) {this.ptr.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);}
	public java.lang.foreign.MemorySegment dstStageMask_ptr() {return this.ptr.asSlice(OFFSET$dstStageMask, LAYOUT$dstStageMask);}

	public int srcAccessMask() {return this.ptr.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);}
	public void srcAccessMask(int value) {this.ptr.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);}
	public java.lang.foreign.MemorySegment srcAccessMask_ptr() {return this.ptr.asSlice(OFFSET$srcAccessMask, LAYOUT$srcAccessMask);}

	public int dstAccessMask() {return this.ptr.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);}
	public void dstAccessMask(int value) {this.ptr.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);}
	public java.lang.foreign.MemorySegment dstAccessMask_ptr() {return this.ptr.asSlice(OFFSET$dstAccessMask, LAYOUT$dstAccessMask);}

	public int dependencyFlags() {return this.ptr.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);}
	public void dependencyFlags(int value) {this.ptr.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);}
	public java.lang.foreign.MemorySegment dependencyFlags_ptr() {return this.ptr.asSlice(OFFSET$dependencyFlags, LAYOUT$dependencyFlags);}

	public int viewOffset() {return this.ptr.get(LAYOUT$viewOffset, OFFSET$viewOffset);}
	public void viewOffset(int value) {this.ptr.set(LAYOUT$viewOffset, OFFSET$viewOffset, value);}
	public java.lang.foreign.MemorySegment viewOffset_ptr() {return this.ptr.asSlice(OFFSET$viewOffset, LAYOUT$viewOffset);}
}
