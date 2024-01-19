package jpgen.clang;

public record CXIdxCXXClassDeclInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$declInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$declInfo = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$bases = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$bases = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numBases = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numBases = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$declInfo,
			LAYOUT$bases,
			LAYOUT$numBases,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("CXIdxCXXClassDeclInfo");

	public CXIdxCXXClassDeclInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT$declInfo, OFFSET$declInfo);}
	public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$declInfo, OFFSET$declInfo, value);}
	public java.lang.foreign.MemorySegment declInfo_ptr() {return this.ptr.asSlice(OFFSET$declInfo, LAYOUT$declInfo);}

	public java.lang.foreign.MemorySegment bases() {return this.ptr.get(LAYOUT$bases, OFFSET$bases);}
	public void bases(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$bases, OFFSET$bases, value);}
	public java.lang.foreign.MemorySegment bases_ptr() {return this.ptr.asSlice(OFFSET$bases, LAYOUT$bases);}

	public int numBases() {return this.ptr.get(LAYOUT$numBases, OFFSET$numBases);}
	public void numBases(int value) {this.ptr.set(LAYOUT$numBases, OFFSET$numBases, value);}
	public java.lang.foreign.MemorySegment numBases_ptr() {return this.ptr.asSlice(OFFSET$numBases, LAYOUT$numBases);}
}
