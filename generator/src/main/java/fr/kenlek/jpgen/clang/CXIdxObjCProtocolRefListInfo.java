/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxObjCProtocolRefListInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("numProtocols"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxObjCProtocolRefListInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCProtocolRefListInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxObjCProtocolRefListInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxObjCProtocolRefListInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefListInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__protocols = 0;
    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(MEMBER_OFFSET__protocols, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numProtocols = 8;
    public int numProtocols() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numProtocols);}
    public void numProtocols(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numProtocols, value);}
    public java.lang.foreign.MemorySegment $numProtocols() {return this.ptr.asSlice(MEMBER_OFFSET__numProtocols, java.lang.foreign.ValueLayout.JAVA_INT);}
}
