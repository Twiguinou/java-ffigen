package vulkan;

public record VkPhysicalDeviceProvokingVertexFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$provokingVertexLast = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$provokingVertexLast = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackPreservesProvokingVertex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$transformFeedbackPreservesProvokingVertex = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$provokingVertexLast,
			LAYOUT$transformFeedbackPreservesProvokingVertex
	).withName("VkPhysicalDeviceProvokingVertexFeaturesEXT");

	public VkPhysicalDeviceProvokingVertexFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int provokingVertexLast() {return this.ptr.get(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast);}
	public void provokingVertexLast(int value) {this.ptr.set(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast, value);}
	public java.lang.foreign.MemorySegment provokingVertexLast_ptr() {return this.ptr.asSlice(OFFSET$provokingVertexLast, LAYOUT$provokingVertexLast);}

	public int transformFeedbackPreservesProvokingVertex() {return this.ptr.get(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex);}
	public void transformFeedbackPreservesProvokingVertex(int value) {this.ptr.set(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex, value);}
	public java.lang.foreign.MemorySegment transformFeedbackPreservesProvokingVertex_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackPreservesProvokingVertex, LAYOUT$transformFeedbackPreservesProvokingVertex);}
}
