/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxObjCPropertyDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declInfo"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("getter"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("setter")
    ).withByteAlignment(8);

    public CXIdxObjCPropertyDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxObjCPropertyDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCPropertyDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__declInfo = 0;
    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declInfo, value);}
    public java.lang.foreign.MemorySegment $declInfo() {return this.ptr.asSlice(MEMBER_OFFSET__declInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__getter = 8;
    public java.lang.foreign.MemorySegment getter() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__getter);}
    public void getter(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__getter, value);}
    public java.lang.foreign.MemorySegment $getter() {return this.ptr.asSlice(MEMBER_OFFSET__getter, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__setter = 16;
    public java.lang.foreign.MemorySegment setter() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__setter);}
    public void setter(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__setter, value);}
    public java.lang.foreign.MemorySegment $setter() {return this.ptr.asSlice(MEMBER_OFFSET__setter, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
