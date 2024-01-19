package vulkan;

public record VkPhysicalDeviceShaderIntegerDotProductProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct8BitUnsignedAccelerated = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct8BitSignedAccelerated = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct8BitMixedSignednessAccelerated = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct4x8BitPackedSignedAccelerated = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct16BitUnsignedAccelerated = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct16BitSignedAccelerated = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct16BitMixedSignednessAccelerated = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct32BitUnsignedAccelerated = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct32BitSignedAccelerated = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct32BitMixedSignednessAccelerated = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct64BitUnsignedAccelerated = 64L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct64BitSignedAccelerated = 68L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProduct64BitMixedSignednessAccelerated = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = 76L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated = 80L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = 84L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = 88L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = 92L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = 96L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = 100L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated = 104L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = 108L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = 112L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated = 116L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = 120L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = 124L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated = 128L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = 132L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$integerDotProduct8BitUnsignedAccelerated,
			LAYOUT$integerDotProduct8BitSignedAccelerated,
			LAYOUT$integerDotProduct8BitMixedSignednessAccelerated,
			LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated,
			LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated,
			LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated,
			LAYOUT$integerDotProduct16BitUnsignedAccelerated,
			LAYOUT$integerDotProduct16BitSignedAccelerated,
			LAYOUT$integerDotProduct16BitMixedSignednessAccelerated,
			LAYOUT$integerDotProduct32BitUnsignedAccelerated,
			LAYOUT$integerDotProduct32BitSignedAccelerated,
			LAYOUT$integerDotProduct32BitMixedSignednessAccelerated,
			LAYOUT$integerDotProduct64BitUnsignedAccelerated,
			LAYOUT$integerDotProduct64BitSignedAccelerated,
			LAYOUT$integerDotProduct64BitMixedSignednessAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated,
			LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
	).withName("VkPhysicalDeviceShaderIntegerDotProductProperties");

	public VkPhysicalDeviceShaderIntegerDotProductProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int integerDotProduct8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated);}
	public void integerDotProduct8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct8BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitUnsignedAccelerated, LAYOUT$integerDotProduct8BitUnsignedAccelerated);}

	public int integerDotProduct8BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated);}
	public void integerDotProduct8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct8BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitSignedAccelerated, LAYOUT$integerDotProduct8BitSignedAccelerated);}

	public int integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated);}
	public void integerDotProduct8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct8BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitMixedSignednessAccelerated, LAYOUT$integerDotProduct8BitMixedSignednessAccelerated);}

	public int integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated);}
	public void integerDotProduct4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated);}

	public int integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated);}
	public void integerDotProduct4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated);}

	public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated);}
	public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated);}

	public int integerDotProduct16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated);}
	public void integerDotProduct16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct16BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitUnsignedAccelerated, LAYOUT$integerDotProduct16BitUnsignedAccelerated);}

	public int integerDotProduct16BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated);}
	public void integerDotProduct16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct16BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitSignedAccelerated, LAYOUT$integerDotProduct16BitSignedAccelerated);}

	public int integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated);}
	public void integerDotProduct16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct16BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitMixedSignednessAccelerated, LAYOUT$integerDotProduct16BitMixedSignednessAccelerated);}

	public int integerDotProduct32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated);}
	public void integerDotProduct32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct32BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitUnsignedAccelerated, LAYOUT$integerDotProduct32BitUnsignedAccelerated);}

	public int integerDotProduct32BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated);}
	public void integerDotProduct32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct32BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitSignedAccelerated, LAYOUT$integerDotProduct32BitSignedAccelerated);}

	public int integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated);}
	public void integerDotProduct32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct32BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitMixedSignednessAccelerated, LAYOUT$integerDotProduct32BitMixedSignednessAccelerated);}

	public int integerDotProduct64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated);}
	public void integerDotProduct64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct64BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitUnsignedAccelerated, LAYOUT$integerDotProduct64BitUnsignedAccelerated);}

	public int integerDotProduct64BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated);}
	public void integerDotProduct64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct64BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitSignedAccelerated, LAYOUT$integerDotProduct64BitSignedAccelerated);}

	public int integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated);}
	public void integerDotProduct64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProduct64BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitMixedSignednessAccelerated, LAYOUT$integerDotProduct64BitMixedSignednessAccelerated);}

	public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}
	public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}

	public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated);}
	public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated);}

	public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}
	public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}

	public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}
	public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}

	public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}
	public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}

	public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}
	public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}

	public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}
	public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}

	public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated);}
	public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated);}

	public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}
	public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}

	public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}
	public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}

	public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated);}
	public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated);}

	public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}
	public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}

	public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}
	public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}

	public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated);}
	public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated);}

	public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
	public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);}
	public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
}
