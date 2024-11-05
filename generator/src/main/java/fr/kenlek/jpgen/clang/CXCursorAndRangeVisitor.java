/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCursorAndRangeVisitor(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCursorAndRangeVisitor", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("context")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("visit"))
    ));

    public CXCursorAndRangeVisitor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXCursorAndRangeVisitor getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCursorAndRangeVisitor value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXCursorAndRangeVisitor other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__context = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment context() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__context);}
    public void context(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__context, value);}
    public java.lang.foreign.MemorySegment $context() {return this.ptr.asSlice(MEMBER_OFFSET__context, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__visit = LAYOUT_DATA.state(1).byteOffset();
    public java.lang.foreign.MemorySegment visit() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__visit);}
    public void visit(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__visit, value);}
    public java.lang.foreign.MemorySegment $visit() {return this.ptr.asSlice(MEMBER_OFFSET__visit, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
