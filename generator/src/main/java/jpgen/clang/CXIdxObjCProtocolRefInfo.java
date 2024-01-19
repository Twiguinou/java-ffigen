package jpgen.clang;

public record CXIdxObjCProtocolRefInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$protocol = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$protocol = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$loc = jpgen.clang.CXIdxLoc.gStructLayout;
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

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
}
