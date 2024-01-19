package vulkan;

public record VkSamplerCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$magFilter = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$magFilter = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minFilter = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minFilter = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mipmapMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mipmapMode = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$addressModeU = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$addressModeU = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$addressModeV = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$addressModeV = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$addressModeW = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$addressModeW = 40L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mipLodBias = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$mipLodBias = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$anisotropyEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$anisotropyEnable = 48L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxAnisotropy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxAnisotropy = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compareEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$compareEnable = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compareOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$compareOp = 60L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minLod = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$minLod = 64L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxLod = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxLod = 68L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$borderColor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$borderColor = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$unnormalizedCoordinates = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$unnormalizedCoordinates = 76L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$magFilter,
			LAYOUT$minFilter,
			LAYOUT$mipmapMode,
			LAYOUT$addressModeU,
			LAYOUT$addressModeV,
			LAYOUT$addressModeW,
			LAYOUT$mipLodBias,
			LAYOUT$anisotropyEnable,
			LAYOUT$maxAnisotropy,
			LAYOUT$compareEnable,
			LAYOUT$compareOp,
			LAYOUT$minLod,
			LAYOUT$maxLod,
			LAYOUT$borderColor,
			LAYOUT$unnormalizedCoordinates
	).withName("VkSamplerCreateInfo");

	public VkSamplerCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int magFilter() {return this.ptr.get(LAYOUT$magFilter, OFFSET$magFilter);}
	public void magFilter(int value) {this.ptr.set(LAYOUT$magFilter, OFFSET$magFilter, value);}
	public java.lang.foreign.MemorySegment magFilter_ptr() {return this.ptr.asSlice(OFFSET$magFilter, LAYOUT$magFilter);}

	public int minFilter() {return this.ptr.get(LAYOUT$minFilter, OFFSET$minFilter);}
	public void minFilter(int value) {this.ptr.set(LAYOUT$minFilter, OFFSET$minFilter, value);}
	public java.lang.foreign.MemorySegment minFilter_ptr() {return this.ptr.asSlice(OFFSET$minFilter, LAYOUT$minFilter);}

	public int mipmapMode() {return this.ptr.get(LAYOUT$mipmapMode, OFFSET$mipmapMode);}
	public void mipmapMode(int value) {this.ptr.set(LAYOUT$mipmapMode, OFFSET$mipmapMode, value);}
	public java.lang.foreign.MemorySegment mipmapMode_ptr() {return this.ptr.asSlice(OFFSET$mipmapMode, LAYOUT$mipmapMode);}

	public int addressModeU() {return this.ptr.get(LAYOUT$addressModeU, OFFSET$addressModeU);}
	public void addressModeU(int value) {this.ptr.set(LAYOUT$addressModeU, OFFSET$addressModeU, value);}
	public java.lang.foreign.MemorySegment addressModeU_ptr() {return this.ptr.asSlice(OFFSET$addressModeU, LAYOUT$addressModeU);}

	public int addressModeV() {return this.ptr.get(LAYOUT$addressModeV, OFFSET$addressModeV);}
	public void addressModeV(int value) {this.ptr.set(LAYOUT$addressModeV, OFFSET$addressModeV, value);}
	public java.lang.foreign.MemorySegment addressModeV_ptr() {return this.ptr.asSlice(OFFSET$addressModeV, LAYOUT$addressModeV);}

	public int addressModeW() {return this.ptr.get(LAYOUT$addressModeW, OFFSET$addressModeW);}
	public void addressModeW(int value) {this.ptr.set(LAYOUT$addressModeW, OFFSET$addressModeW, value);}
	public java.lang.foreign.MemorySegment addressModeW_ptr() {return this.ptr.asSlice(OFFSET$addressModeW, LAYOUT$addressModeW);}

	public float mipLodBias() {return this.ptr.get(LAYOUT$mipLodBias, OFFSET$mipLodBias);}
	public void mipLodBias(float value) {this.ptr.set(LAYOUT$mipLodBias, OFFSET$mipLodBias, value);}
	public java.lang.foreign.MemorySegment mipLodBias_ptr() {return this.ptr.asSlice(OFFSET$mipLodBias, LAYOUT$mipLodBias);}

	public int anisotropyEnable() {return this.ptr.get(LAYOUT$anisotropyEnable, OFFSET$anisotropyEnable);}
	public void anisotropyEnable(int value) {this.ptr.set(LAYOUT$anisotropyEnable, OFFSET$anisotropyEnable, value);}
	public java.lang.foreign.MemorySegment anisotropyEnable_ptr() {return this.ptr.asSlice(OFFSET$anisotropyEnable, LAYOUT$anisotropyEnable);}

	public float maxAnisotropy() {return this.ptr.get(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy);}
	public void maxAnisotropy(float value) {this.ptr.set(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy, value);}
	public java.lang.foreign.MemorySegment maxAnisotropy_ptr() {return this.ptr.asSlice(OFFSET$maxAnisotropy, LAYOUT$maxAnisotropy);}

	public int compareEnable() {return this.ptr.get(LAYOUT$compareEnable, OFFSET$compareEnable);}
	public void compareEnable(int value) {this.ptr.set(LAYOUT$compareEnable, OFFSET$compareEnable, value);}
	public java.lang.foreign.MemorySegment compareEnable_ptr() {return this.ptr.asSlice(OFFSET$compareEnable, LAYOUT$compareEnable);}

	public int compareOp() {return this.ptr.get(LAYOUT$compareOp, OFFSET$compareOp);}
	public void compareOp(int value) {this.ptr.set(LAYOUT$compareOp, OFFSET$compareOp, value);}
	public java.lang.foreign.MemorySegment compareOp_ptr() {return this.ptr.asSlice(OFFSET$compareOp, LAYOUT$compareOp);}

	public float minLod() {return this.ptr.get(LAYOUT$minLod, OFFSET$minLod);}
	public void minLod(float value) {this.ptr.set(LAYOUT$minLod, OFFSET$minLod, value);}
	public java.lang.foreign.MemorySegment minLod_ptr() {return this.ptr.asSlice(OFFSET$minLod, LAYOUT$minLod);}

	public float maxLod() {return this.ptr.get(LAYOUT$maxLod, OFFSET$maxLod);}
	public void maxLod(float value) {this.ptr.set(LAYOUT$maxLod, OFFSET$maxLod, value);}
	public java.lang.foreign.MemorySegment maxLod_ptr() {return this.ptr.asSlice(OFFSET$maxLod, LAYOUT$maxLod);}

	public int borderColor() {return this.ptr.get(LAYOUT$borderColor, OFFSET$borderColor);}
	public void borderColor(int value) {this.ptr.set(LAYOUT$borderColor, OFFSET$borderColor, value);}
	public java.lang.foreign.MemorySegment borderColor_ptr() {return this.ptr.asSlice(OFFSET$borderColor, LAYOUT$borderColor);}

	public int unnormalizedCoordinates() {return this.ptr.get(LAYOUT$unnormalizedCoordinates, OFFSET$unnormalizedCoordinates);}
	public void unnormalizedCoordinates(int value) {this.ptr.set(LAYOUT$unnormalizedCoordinates, OFFSET$unnormalizedCoordinates, value);}
	public java.lang.foreign.MemorySegment unnormalizedCoordinates_ptr() {return this.ptr.asSlice(OFFSET$unnormalizedCoordinates, LAYOUT$unnormalizedCoordinates);}
}
