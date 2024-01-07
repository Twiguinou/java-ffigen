package jpgen.clang;

public record CXIdxBaseClassInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$base = java.lang.foreign.ValueLayout.ADDRESS.withName("base");
	public static final long OFFSET$base = 0L;
	public static final java.lang.foreign.StructLayout LAYOUT$cursor = CXCursor.gStructLayout.withName("cursor");
	public static final long OFFSET$cursor = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$loc = CXIdxLoc.gStructLayout.withName("loc");
	public static final long OFFSET$loc = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$base,
			LAYOUT$cursor,
			LAYOUT$loc
	).withName("CXIdxBaseClassInfo");

	public CXIdxBaseClassInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment base() {return this.ptr.get(LAYOUT$base, OFFSET$base);}
	public void base(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$base, OFFSET$base, value);}
	public java.lang.foreign.MemorySegment base_ptr() {return this.ptr.asSlice(OFFSET$base, LAYOUT$base);}

	public CXCursor cursor() {return new CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

	public CXIdxLoc loc() {return new CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
}
