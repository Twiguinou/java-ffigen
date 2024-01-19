package vulkan;

public record VkResolveImageInfo2(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$srcImage = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$srcImage = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcImageLayout = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$dstImage = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$dstImage = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstImageLayout = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$regionCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$regionCount = 44L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pRegions = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pRegions = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcImage,
			LAYOUT$srcImageLayout,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$dstImage,
			LAYOUT$dstImageLayout,
			LAYOUT$regionCount,
			LAYOUT$pRegions
	).withName("VkResolveImageInfo2");

	public VkResolveImageInfo2(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment srcImage() {return this.ptr.get(LAYOUT$srcImage, OFFSET$srcImage);}
	public void srcImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcImage, OFFSET$srcImage, value);}
	public java.lang.foreign.MemorySegment srcImage_ptr() {return this.ptr.asSlice(OFFSET$srcImage, LAYOUT$srcImage);}

	public int srcImageLayout() {return this.ptr.get(LAYOUT$srcImageLayout, OFFSET$srcImageLayout);}
	public void srcImageLayout(int value) {this.ptr.set(LAYOUT$srcImageLayout, OFFSET$srcImageLayout, value);}
	public java.lang.foreign.MemorySegment srcImageLayout_ptr() {return this.ptr.asSlice(OFFSET$srcImageLayout, LAYOUT$srcImageLayout);}

	public java.lang.foreign.MemorySegment dstImage() {return this.ptr.get(LAYOUT$dstImage, OFFSET$dstImage);}
	public void dstImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstImage, OFFSET$dstImage, value);}
	public java.lang.foreign.MemorySegment dstImage_ptr() {return this.ptr.asSlice(OFFSET$dstImage, LAYOUT$dstImage);}

	public int dstImageLayout() {return this.ptr.get(LAYOUT$dstImageLayout, OFFSET$dstImageLayout);}
	public void dstImageLayout(int value) {this.ptr.set(LAYOUT$dstImageLayout, OFFSET$dstImageLayout, value);}
	public java.lang.foreign.MemorySegment dstImageLayout_ptr() {return this.ptr.asSlice(OFFSET$dstImageLayout, LAYOUT$dstImageLayout);}

	public int regionCount() {return this.ptr.get(LAYOUT$regionCount, OFFSET$regionCount);}
	public void regionCount(int value) {this.ptr.set(LAYOUT$regionCount, OFFSET$regionCount, value);}
	public java.lang.foreign.MemorySegment regionCount_ptr() {return this.ptr.asSlice(OFFSET$regionCount, LAYOUT$regionCount);}

	public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT$pRegions, OFFSET$pRegions);}
	public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRegions, OFFSET$pRegions, value);}
	public java.lang.foreign.MemorySegment pRegions_ptr() {return this.ptr.asSlice(OFFSET$pRegions, LAYOUT$pRegions);}
}
