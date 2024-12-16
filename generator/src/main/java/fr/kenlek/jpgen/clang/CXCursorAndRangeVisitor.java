/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCursorAndRangeVisitor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("context"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("visit")
    ).withByteAlignment(8);

    public CXCursorAndRangeVisitor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCursorAndRangeVisitor getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCursorAndRangeVisitor value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursorAndRangeVisitor other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__context = 0;
    public java.lang.foreign.MemorySegment context() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__context);}
    public void context(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__context, value);}
    public java.lang.foreign.MemorySegment $context() {return this.ptr.asSlice(MEMBER_OFFSET__context, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__visit = 8;
    public java.lang.foreign.MemorySegment visit() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__visit);}
    public void visit(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__visit, value);}
    public java.lang.foreign.MemorySegment $visit() {return this.ptr.asSlice(MEMBER_OFFSET__visit, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
