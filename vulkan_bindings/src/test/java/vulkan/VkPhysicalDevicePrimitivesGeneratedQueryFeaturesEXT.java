package vulkan;

public record VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitivesGeneratedQuery = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitivesGeneratedQuery = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitivesGeneratedQueryWithRasterizerDiscard = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitivesGeneratedQueryWithNonZeroStreams = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitivesGeneratedQueryWithNonZeroStreams = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$primitivesGeneratedQuery,
			LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard,
			LAYOUT$primitivesGeneratedQueryWithNonZeroStreams,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT");

	public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int primitivesGeneratedQuery() {return this.ptr.get(LAYOUT$primitivesGeneratedQuery, OFFSET$primitivesGeneratedQuery);}
	public void primitivesGeneratedQuery(int value) {this.ptr.set(LAYOUT$primitivesGeneratedQuery, OFFSET$primitivesGeneratedQuery, value);}
	public java.lang.foreign.MemorySegment primitivesGeneratedQuery_ptr() {return this.ptr.asSlice(OFFSET$primitivesGeneratedQuery, LAYOUT$primitivesGeneratedQuery);}

	public int primitivesGeneratedQueryWithRasterizerDiscard() {return this.ptr.get(LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard, OFFSET$primitivesGeneratedQueryWithRasterizerDiscard);}
	public void primitivesGeneratedQueryWithRasterizerDiscard(int value) {this.ptr.set(LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard, OFFSET$primitivesGeneratedQueryWithRasterizerDiscard, value);}
	public java.lang.foreign.MemorySegment primitivesGeneratedQueryWithRasterizerDiscard_ptr() {return this.ptr.asSlice(OFFSET$primitivesGeneratedQueryWithRasterizerDiscard, LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard);}

	public int primitivesGeneratedQueryWithNonZeroStreams() {return this.ptr.get(LAYOUT$primitivesGeneratedQueryWithNonZeroStreams, OFFSET$primitivesGeneratedQueryWithNonZeroStreams);}
	public void primitivesGeneratedQueryWithNonZeroStreams(int value) {this.ptr.set(LAYOUT$primitivesGeneratedQueryWithNonZeroStreams, OFFSET$primitivesGeneratedQueryWithNonZeroStreams, value);}
	public java.lang.foreign.MemorySegment primitivesGeneratedQueryWithNonZeroStreams_ptr() {return this.ptr.asSlice(OFFSET$primitivesGeneratedQueryWithNonZeroStreams, LAYOUT$primitivesGeneratedQueryWithNonZeroStreams);}
}
