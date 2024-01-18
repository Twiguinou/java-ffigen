package vulkan;

public record VkTilePropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$tileSize = vulkan.VkExtent3D.gStructLayout;
	public static final long OFFSET$tileSize = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$apronSize = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$apronSize = 28L;
	public static final java.lang.foreign.GroupLayout LAYOUT$origin = vulkan.VkOffset2D.gStructLayout;
	public static final long OFFSET$origin = 36L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$tileSize,
			LAYOUT$apronSize,
			LAYOUT$origin,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkTilePropertiesQCOM");

	public VkTilePropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkExtent3D tileSize() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$tileSize, LAYOUT$tileSize));}

	public vulkan.VkExtent2D apronSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$apronSize, LAYOUT$apronSize));}

	public vulkan.VkOffset2D origin() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$origin, LAYOUT$origin));}
}
