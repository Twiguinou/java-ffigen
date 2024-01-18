package vulkan;

public record VkPhysicalDeviceShaderTileImageFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageColorReadAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderTileImageColorReadAccess = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageDepthReadAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderTileImageDepthReadAccess = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageStencilReadAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderTileImageStencilReadAccess = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderTileImageColorReadAccess,
			LAYOUT$shaderTileImageDepthReadAccess,
			LAYOUT$shaderTileImageStencilReadAccess,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceShaderTileImageFeaturesEXT");

	public VkPhysicalDeviceShaderTileImageFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderTileImageColorReadAccess() {return this.ptr.get(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess);}
	public void shaderTileImageColorReadAccess(int value) {this.ptr.set(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess, value);}
	public java.lang.foreign.MemorySegment shaderTileImageColorReadAccess_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageColorReadAccess, LAYOUT$shaderTileImageColorReadAccess);}

	public int shaderTileImageDepthReadAccess() {return this.ptr.get(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess);}
	public void shaderTileImageDepthReadAccess(int value) {this.ptr.set(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess, value);}
	public java.lang.foreign.MemorySegment shaderTileImageDepthReadAccess_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageDepthReadAccess, LAYOUT$shaderTileImageDepthReadAccess);}

	public int shaderTileImageStencilReadAccess() {return this.ptr.get(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess);}
	public void shaderTileImageStencilReadAccess(int value) {this.ptr.set(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess, value);}
	public java.lang.foreign.MemorySegment shaderTileImageStencilReadAccess_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageStencilReadAccess, LAYOUT$shaderTileImageStencilReadAccess);}
}
