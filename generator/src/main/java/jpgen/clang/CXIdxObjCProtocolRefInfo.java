package jpgen.clang;

public record CXIdxObjCProtocolRefInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$protocol = java.lang.foreign.ValueLayout.ADDRESS.withName("protocol");
	public static final long OFFSET$protocol = 0L;
	public static final java.lang.foreign.StructLayout LAYOUT$cursor = CXCursor.gStructLayout.withName("cursor");
	public static final long OFFSET$cursor = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$loc = CXIdxLoc.gStructLayout.withName("loc");
	public static final long OFFSET$loc = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$protocol,
			LAYOUT$cursor,
			LAYOUT$loc
	).withName("CXIdxObjCProtocolRefInfo");

	public CXIdxObjCProtocolRefInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment protocol() {return this.ptr.get(LAYOUT$protocol, OFFSET$protocol);}
	public void protocol(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$protocol, OFFSET$protocol, value);}
	public java.lang.foreign.MemorySegment protocol_ptr() {return this.ptr.asSlice(OFFSET$protocol, LAYOUT$protocol);}

	public CXCursor cursor() {return new CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

	public CXIdxLoc loc() {return new CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
}
