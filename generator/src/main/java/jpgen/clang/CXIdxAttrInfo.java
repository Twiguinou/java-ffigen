package jpgen.clang;

public record CXIdxAttrInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
	public static final long OFFSET$kind = 0L;
	public static final java.lang.foreign.StructLayout LAYOUT$cursor = CXCursor.gStructLayout.withName("cursor");
	public static final long OFFSET$cursor = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$loc = CXIdxLoc.gStructLayout.withName("loc");
	public static final long OFFSET$loc = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$kind,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$cursor,
			LAYOUT$loc
	).withName("CXIdxAttrInfo");

	public CXIdxAttrInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
	public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
	public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

	public CXCursor cursor() {return new CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

	public CXIdxLoc loc() {return new CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
}
