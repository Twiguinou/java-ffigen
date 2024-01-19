package jpgen.clang;

public record CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$attrInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$attrInfo = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$objcClass = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$objcClass = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$classCursor = jpgen.clang.CXCursor.gStructLayout;
	public static final long OFFSET$classCursor = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$classLoc = jpgen.clang.CXIdxLoc.gStructLayout;
	public static final long OFFSET$classLoc = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$attrInfo,
			LAYOUT$objcClass,
			LAYOUT$classCursor,
			LAYOUT$classLoc
	).withName("CXIdxIBOutletCollectionAttrInfo");

	public CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment attrInfo() {return this.ptr.get(LAYOUT$attrInfo, OFFSET$attrInfo);}
	public void attrInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$attrInfo, OFFSET$attrInfo, value);}
	public java.lang.foreign.MemorySegment attrInfo_ptr() {return this.ptr.asSlice(OFFSET$attrInfo, LAYOUT$attrInfo);}

	public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT$objcClass, OFFSET$objcClass);}
	public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$objcClass, OFFSET$objcClass, value);}
	public java.lang.foreign.MemorySegment objcClass_ptr() {return this.ptr.asSlice(OFFSET$objcClass, LAYOUT$objcClass);}

	public jpgen.clang.CXCursor classCursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$classCursor, LAYOUT$classCursor));}

	public jpgen.clang.CXIdxLoc classLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$classLoc, LAYOUT$classLoc));}
}
