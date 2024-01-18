package vulkan;

public record VkImageViewHandleInfoNVX(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$imageView = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$imageView = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorType = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$sampler = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$sampler = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$imageView,
			LAYOUT$descriptorType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$sampler
	).withName("VkImageViewHandleInfoNVX");

	public VkImageViewHandleInfoNVX(java.lang.foreign.SegmentAllocator allocator)
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

	public int descriptorType() {return this.ptr.get(LAYOUT$descriptorType, OFFSET$descriptorType);}
	public void descriptorType(int value) {this.ptr.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);}
	public java.lang.foreign.MemorySegment descriptorType_ptr() {return this.ptr.asSlice(OFFSET$descriptorType, LAYOUT$descriptorType);}

	public java.lang.foreign.MemorySegment sampler() {return this.ptr.get(LAYOUT$sampler, OFFSET$sampler);}
	public void sampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$sampler, OFFSET$sampler, value);}
	public java.lang.foreign.MemorySegment sampler_ptr() {return this.ptr.asSlice(OFFSET$sampler, LAYOUT$sampler);}
}
