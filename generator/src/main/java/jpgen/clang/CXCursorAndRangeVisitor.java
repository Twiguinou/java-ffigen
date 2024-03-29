package jpgen.clang;

public record CXCursorAndRangeVisitor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$context = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$context = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$visit = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$visit = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$context,
            LAYOUT$visit
    ).withName("CXCursorAndRangeVisitor");

    public CXCursorAndRangeVisitor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXCursorAndRangeVisitor getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment context() {return this.ptr.get(LAYOUT$context, OFFSET$context);}
    public void context(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$context, OFFSET$context, value);}
    public java.lang.foreign.MemorySegment context_ptr() {return this.ptr.asSlice(OFFSET$context, LAYOUT$context);}

    public java.lang.foreign.MemorySegment visit() {return this.ptr.get(LAYOUT$visit, OFFSET$visit);}
    public void visit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$visit, OFFSET$visit, value);}
    public java.lang.foreign.MemorySegment visit_ptr() {return this.ptr.asSlice(OFFSET$visit, LAYOUT$visit);}
}
