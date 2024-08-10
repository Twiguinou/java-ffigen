package fr.kenlek.jpgen.clang;

public record CXCursorAndRangeVisitor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__context = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("context");
    public static final long OFFSET__context = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__visit = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("visit");
    public static final long OFFSET__visit = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__context,
            LAYOUT__visit
    ).withByteAlignment(8).withName("CXCursorAndRangeVisitor");

    public CXCursorAndRangeVisitor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXCursorAndRangeVisitor getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXCursorAndRangeVisitor value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment context() {return this.ptr.get(LAYOUT__context, OFFSET__context);}
    public void context(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__context, OFFSET__context, value);}
    public java.lang.foreign.MemorySegment $context() {return this.ptr.asSlice(OFFSET__context, LAYOUT__context);}

    public java.lang.foreign.MemorySegment visit() {return this.ptr.get(LAYOUT__visit, OFFSET__visit);}
    public void visit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__visit, OFFSET__visit, value);}
    public java.lang.foreign.MemorySegment $visit() {return this.ptr.asSlice(OFFSET__visit, LAYOUT__visit);}
}
