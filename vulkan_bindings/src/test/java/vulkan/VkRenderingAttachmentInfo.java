package vulkan;

public record VkRenderingAttachmentInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$imageView = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$imageView = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageLayout = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$resolveMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$resolveMode = 28L;
	public static final java.lang.foreign.AddressLayout LAYOUT$resolveImageView = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$resolveImageView = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$resolveImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$resolveImageLayout = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$loadOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$loadOp = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storeOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storeOp = 48L;
	public static final java.lang.foreign.GroupLayout LAYOUT$clearValue = vulkan.VkClearValue.gStructLayout;
	public static final long OFFSET$clearValue = 52L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$imageView,
			LAYOUT$imageLayout,
			LAYOUT$resolveMode,
			LAYOUT$resolveImageView,
			LAYOUT$resolveImageLayout,
			LAYOUT$loadOp,
			LAYOUT$storeOp,
			LAYOUT$clearValue,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkRenderingAttachmentInfo");

	public VkRenderingAttachmentInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT$imageView, OFFSET$imageView);}
	public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$imageView, OFFSET$imageView, value);}
	public java.lang.foreign.MemorySegment imageView_ptr() {return this.ptr.asSlice(OFFSET$imageView, LAYOUT$imageView);}

	public int imageLayout() {return this.ptr.get(LAYOUT$imageLayout, OFFSET$imageLayout);}
	public void imageLayout(int value) {this.ptr.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);}
	public java.lang.foreign.MemorySegment imageLayout_ptr() {return this.ptr.asSlice(OFFSET$imageLayout, LAYOUT$imageLayout);}

	public int resolveMode() {return this.ptr.get(LAYOUT$resolveMode, OFFSET$resolveMode);}
	public void resolveMode(int value) {this.ptr.set(LAYOUT$resolveMode, OFFSET$resolveMode, value);}
	public java.lang.foreign.MemorySegment resolveMode_ptr() {return this.ptr.asSlice(OFFSET$resolveMode, LAYOUT$resolveMode);}

	public java.lang.foreign.MemorySegment resolveImageView() {return this.ptr.get(LAYOUT$resolveImageView, OFFSET$resolveImageView);}
	public void resolveImageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$resolveImageView, OFFSET$resolveImageView, value);}
	public java.lang.foreign.MemorySegment resolveImageView_ptr() {return this.ptr.asSlice(OFFSET$resolveImageView, LAYOUT$resolveImageView);}

	public int resolveImageLayout() {return this.ptr.get(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout);}
	public void resolveImageLayout(int value) {this.ptr.set(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout, value);}
	public java.lang.foreign.MemorySegment resolveImageLayout_ptr() {return this.ptr.asSlice(OFFSET$resolveImageLayout, LAYOUT$resolveImageLayout);}

	public int loadOp() {return this.ptr.get(LAYOUT$loadOp, OFFSET$loadOp);}
	public void loadOp(int value) {this.ptr.set(LAYOUT$loadOp, OFFSET$loadOp, value);}
	public java.lang.foreign.MemorySegment loadOp_ptr() {return this.ptr.asSlice(OFFSET$loadOp, LAYOUT$loadOp);}

	public int storeOp() {return this.ptr.get(LAYOUT$storeOp, OFFSET$storeOp);}
	public void storeOp(int value) {this.ptr.set(LAYOUT$storeOp, OFFSET$storeOp, value);}
	public java.lang.foreign.MemorySegment storeOp_ptr() {return this.ptr.asSlice(OFFSET$storeOp, LAYOUT$storeOp);}

	public vulkan.VkClearValue clearValue() {return new vulkan.VkClearValue(this.ptr.asSlice(OFFSET$clearValue, LAYOUT$clearValue));}
}
