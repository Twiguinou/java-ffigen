package vulkan;

public record VkColorBlendAdvancedEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$advancedBlendOp = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcPremultiplied = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstPremultiplied = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blendOverlap = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$blendOverlap = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clampResults = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$clampResults = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$advancedBlendOp,
			LAYOUT$srcPremultiplied,
			LAYOUT$dstPremultiplied,
			LAYOUT$blendOverlap,
			LAYOUT$clampResults
	).withName("VkColorBlendAdvancedEXT");

	public VkColorBlendAdvancedEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int advancedBlendOp() {return this.ptr.get(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp);}
	public void advancedBlendOp(int value) {this.ptr.set(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp, value);}
	public java.lang.foreign.MemorySegment advancedBlendOp_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendOp, LAYOUT$advancedBlendOp);}

	public int srcPremultiplied() {return this.ptr.get(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied);}
	public void srcPremultiplied(int value) {this.ptr.set(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied, value);}
	public java.lang.foreign.MemorySegment srcPremultiplied_ptr() {return this.ptr.asSlice(OFFSET$srcPremultiplied, LAYOUT$srcPremultiplied);}

	public int dstPremultiplied() {return this.ptr.get(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied);}
	public void dstPremultiplied(int value) {this.ptr.set(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied, value);}
	public java.lang.foreign.MemorySegment dstPremultiplied_ptr() {return this.ptr.asSlice(OFFSET$dstPremultiplied, LAYOUT$dstPremultiplied);}

	public int blendOverlap() {return this.ptr.get(LAYOUT$blendOverlap, OFFSET$blendOverlap);}
	public void blendOverlap(int value) {this.ptr.set(LAYOUT$blendOverlap, OFFSET$blendOverlap, value);}
	public java.lang.foreign.MemorySegment blendOverlap_ptr() {return this.ptr.asSlice(OFFSET$blendOverlap, LAYOUT$blendOverlap);}

	public int clampResults() {return this.ptr.get(LAYOUT$clampResults, OFFSET$clampResults);}
	public void clampResults(int value) {this.ptr.set(LAYOUT$clampResults, OFFSET$clampResults, value);}
	public java.lang.foreign.MemorySegment clampResults_ptr() {return this.ptr.asSlice(OFFSET$clampResults, LAYOUT$clampResults);}
}
