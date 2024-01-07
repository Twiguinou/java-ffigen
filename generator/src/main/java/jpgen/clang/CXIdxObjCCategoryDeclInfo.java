package jpgen.clang;

public record CXIdxObjCCategoryDeclInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$containerInfo = java.lang.foreign.ValueLayout.ADDRESS.withName("containerInfo");
	public static final long OFFSET$containerInfo = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$objcClass = java.lang.foreign.ValueLayout.ADDRESS.withName("objcClass");
	public static final long OFFSET$objcClass = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$classCursor = CXCursor.gStructLayout.withName("classCursor");
	public static final long OFFSET$classCursor = 16L;
	public static final java.lang.foreign.StructLayout LAYOUT$classLoc = CXIdxLoc.gStructLayout.withName("classLoc");
	public static final long OFFSET$classLoc = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$protocols = java.lang.foreign.ValueLayout.ADDRESS.withName("protocols");
	public static final long OFFSET$protocols = 72L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$containerInfo,
			LAYOUT$objcClass,
			LAYOUT$classCursor,
			LAYOUT$classLoc,
			LAYOUT$protocols
	).withName("CXIdxObjCCategoryDeclInfo");

	public CXIdxObjCCategoryDeclInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(LAYOUT$containerInfo, OFFSET$containerInfo);}
	public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$containerInfo, OFFSET$containerInfo, value);}
	public java.lang.foreign.MemorySegment containerInfo_ptr() {return this.ptr.asSlice(OFFSET$containerInfo, LAYOUT$containerInfo);}

	public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT$objcClass, OFFSET$objcClass);}
	public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$objcClass, OFFSET$objcClass, value);}
	public java.lang.foreign.MemorySegment objcClass_ptr() {return this.ptr.asSlice(OFFSET$objcClass, LAYOUT$objcClass);}

	public CXCursor classCursor() {return new CXCursor(this.ptr.asSlice(OFFSET$classCursor, LAYOUT$classCursor));}

	public CXIdxLoc classLoc() {return new CXIdxLoc(this.ptr.asSlice(OFFSET$classLoc, LAYOUT$classLoc));}

	public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT$protocols, OFFSET$protocols);}
	public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$protocols, OFFSET$protocols, value);}
	public java.lang.foreign.MemorySegment protocols_ptr() {return this.ptr.asSlice(OFFSET$protocols, LAYOUT$protocols);}
}
