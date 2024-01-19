package vulkan;

public record VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$image2DViewOf3D = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$image2DViewOf3D = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampler2DViewOf3D = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sampler2DViewOf3D = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$image2DViewOf3D,
			LAYOUT$sampler2DViewOf3D
	).withName("VkPhysicalDeviceImage2DViewOf3DFeaturesEXT");

	public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int image2DViewOf3D() {return this.ptr.get(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D);}
	public void image2DViewOf3D(int value) {this.ptr.set(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D, value);}
	public java.lang.foreign.MemorySegment image2DViewOf3D_ptr() {return this.ptr.asSlice(OFFSET$image2DViewOf3D, LAYOUT$image2DViewOf3D);}

	public int sampler2DViewOf3D() {return this.ptr.get(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D);}
	public void sampler2DViewOf3D(int value) {this.ptr.set(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D, value);}
	public java.lang.foreign.MemorySegment sampler2DViewOf3D_ptr() {return this.ptr.asSlice(OFFSET$sampler2DViewOf3D, LAYOUT$sampler2DViewOf3D);}
}
