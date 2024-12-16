/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxBaseClassInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("base"),
            fr.kenlek.jpgen.clang.CXCursor.LAYOUT.withName("cursor"),
            fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.withName("loc")
    ).withByteAlignment(8);

    public CXIdxBaseClassInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxBaseClassInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxBaseClassInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxBaseClassInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxBaseClassInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__base = 0;
    public java.lang.foreign.MemorySegment base() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__base);}
    public void base(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__base, value);}
    public java.lang.foreign.MemorySegment $base() {return this.ptr.asSlice(MEMBER_OFFSET__base, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__cursor = 8;
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT);}

    public static final long MEMBER_OFFSET__loc = 40;
    public fr.kenlek.jpgen.clang.CXIdxLoc loc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT));}
    public void loc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $loc() {return this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT);}
}
