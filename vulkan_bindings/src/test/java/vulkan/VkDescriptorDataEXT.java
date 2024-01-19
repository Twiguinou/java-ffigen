package vulkan;

public record VkDescriptorDataEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$pSampler = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSampler = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCombinedImageSampler = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCombinedImageSampler = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pInputAttachmentImage = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pInputAttachmentImage = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSampledImage = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSampledImage = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStorageImage = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStorageImage = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pUniformTexelBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pUniformTexelBuffer = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStorageTexelBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStorageTexelBuffer = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pUniformBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pUniformBuffer = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStorageBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStorageBuffer = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructure = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$accelerationStructure = 0L;

	public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
			LAYOUT$pSampler,
			LAYOUT$pCombinedImageSampler,
			LAYOUT$pInputAttachmentImage,
			LAYOUT$pSampledImage,
			LAYOUT$pStorageImage,
			LAYOUT$pUniformTexelBuffer,
			LAYOUT$pStorageTexelBuffer,
			LAYOUT$pUniformBuffer,
			LAYOUT$pStorageBuffer,
			LAYOUT$accelerationStructure
	).withName("VkDescriptorDataEXT");

	public VkDescriptorDataEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment pSampler() {return this.ptr.get(LAYOUT$pSampler, OFFSET$pSampler);}
	public void pSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSampler, OFFSET$pSampler, value);}
	public java.lang.foreign.MemorySegment pSampler_ptr() {return this.ptr.asSlice(OFFSET$pSampler, LAYOUT$pSampler);}

	public java.lang.foreign.MemorySegment pCombinedImageSampler() {return this.ptr.get(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler);}
	public void pCombinedImageSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler, value);}
	public java.lang.foreign.MemorySegment pCombinedImageSampler_ptr() {return this.ptr.asSlice(OFFSET$pCombinedImageSampler, LAYOUT$pCombinedImageSampler);}

	public java.lang.foreign.MemorySegment pInputAttachmentImage() {return this.ptr.get(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage);}
	public void pInputAttachmentImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage, value);}
	public java.lang.foreign.MemorySegment pInputAttachmentImage_ptr() {return this.ptr.asSlice(OFFSET$pInputAttachmentImage, LAYOUT$pInputAttachmentImage);}

	public java.lang.foreign.MemorySegment pSampledImage() {return this.ptr.get(LAYOUT$pSampledImage, OFFSET$pSampledImage);}
	public void pSampledImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSampledImage, OFFSET$pSampledImage, value);}
	public java.lang.foreign.MemorySegment pSampledImage_ptr() {return this.ptr.asSlice(OFFSET$pSampledImage, LAYOUT$pSampledImage);}

	public java.lang.foreign.MemorySegment pStorageImage() {return this.ptr.get(LAYOUT$pStorageImage, OFFSET$pStorageImage);}
	public void pStorageImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStorageImage, OFFSET$pStorageImage, value);}
	public java.lang.foreign.MemorySegment pStorageImage_ptr() {return this.ptr.asSlice(OFFSET$pStorageImage, LAYOUT$pStorageImage);}

	public java.lang.foreign.MemorySegment pUniformTexelBuffer() {return this.ptr.get(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer);}
	public void pUniformTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer, value);}
	public java.lang.foreign.MemorySegment pUniformTexelBuffer_ptr() {return this.ptr.asSlice(OFFSET$pUniformTexelBuffer, LAYOUT$pUniformTexelBuffer);}

	public java.lang.foreign.MemorySegment pStorageTexelBuffer() {return this.ptr.get(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer);}
	public void pStorageTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer, value);}
	public java.lang.foreign.MemorySegment pStorageTexelBuffer_ptr() {return this.ptr.asSlice(OFFSET$pStorageTexelBuffer, LAYOUT$pStorageTexelBuffer);}

	public java.lang.foreign.MemorySegment pUniformBuffer() {return this.ptr.get(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer);}
	public void pUniformBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer, value);}
	public java.lang.foreign.MemorySegment pUniformBuffer_ptr() {return this.ptr.asSlice(OFFSET$pUniformBuffer, LAYOUT$pUniformBuffer);}

	public java.lang.foreign.MemorySegment pStorageBuffer() {return this.ptr.get(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer);}
	public void pStorageBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer, value);}
	public java.lang.foreign.MemorySegment pStorageBuffer_ptr() {return this.ptr.asSlice(OFFSET$pStorageBuffer, LAYOUT$pStorageBuffer);}

	public long accelerationStructure() {return this.ptr.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);}
	public void accelerationStructure(long value) {this.ptr.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);}
	public java.lang.foreign.MemorySegment accelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure);}
}
