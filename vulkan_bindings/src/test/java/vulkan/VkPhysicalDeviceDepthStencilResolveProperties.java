package vulkan;

public record VkPhysicalDeviceDepthStencilResolveProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedDepthResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedDepthResolveModes = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedStencilResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedStencilResolveModes = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$independentResolveNone = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$independentResolveNone = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$independentResolve = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$independentResolve = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$supportedDepthResolveModes,
			LAYOUT$supportedStencilResolveModes,
			LAYOUT$independentResolveNone,
			LAYOUT$independentResolve
	).withName("VkPhysicalDeviceDepthStencilResolveProperties");

	public VkPhysicalDeviceDepthStencilResolveProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int supportedDepthResolveModes() {return this.ptr.get(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes);}
	public void supportedDepthResolveModes(int value) {this.ptr.set(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes, value);}
	public java.lang.foreign.MemorySegment supportedDepthResolveModes_ptr() {return this.ptr.asSlice(OFFSET$supportedDepthResolveModes, LAYOUT$supportedDepthResolveModes);}

	public int supportedStencilResolveModes() {return this.ptr.get(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes);}
	public void supportedStencilResolveModes(int value) {this.ptr.set(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes, value);}
	public java.lang.foreign.MemorySegment supportedStencilResolveModes_ptr() {return this.ptr.asSlice(OFFSET$supportedStencilResolveModes, LAYOUT$supportedStencilResolveModes);}

	public int independentResolveNone() {return this.ptr.get(LAYOUT$independentResolveNone, OFFSET$independentResolveNone);}
	public void independentResolveNone(int value) {this.ptr.set(LAYOUT$independentResolveNone, OFFSET$independentResolveNone, value);}
	public java.lang.foreign.MemorySegment independentResolveNone_ptr() {return this.ptr.asSlice(OFFSET$independentResolveNone, LAYOUT$independentResolveNone);}

	public int independentResolve() {return this.ptr.get(LAYOUT$independentResolve, OFFSET$independentResolve);}
	public void independentResolve(int value) {this.ptr.set(LAYOUT$independentResolve, OFFSET$independentResolve, value);}
	public java.lang.foreign.MemorySegment independentResolve_ptr() {return this.ptr.asSlice(OFFSET$independentResolve, LAYOUT$independentResolve);}
}
