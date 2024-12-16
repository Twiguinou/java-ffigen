/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxObjCInterfaceDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("containerInfo"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("superInfo"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols")
    ).withByteAlignment(8);

    public CXIdxObjCInterfaceDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxObjCInterfaceDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCInterfaceDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__containerInfo = 0;
    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__containerInfo, value);}
    public java.lang.foreign.MemorySegment $containerInfo() {return this.ptr.asSlice(MEMBER_OFFSET__containerInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__superInfo = 8;
    public java.lang.foreign.MemorySegment superInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__superInfo);}
    public void superInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__superInfo, value);}
    public java.lang.foreign.MemorySegment $superInfo() {return this.ptr.asSlice(MEMBER_OFFSET__superInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__protocols = 16;
    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(MEMBER_OFFSET__protocols, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
