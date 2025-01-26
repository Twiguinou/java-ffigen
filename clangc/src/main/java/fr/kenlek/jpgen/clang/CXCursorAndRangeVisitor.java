package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

public record CXCursorAndRangeVisitor(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
            UNBOUNDED_POINTER.withName("context"),
            UNBOUNDED_POINTER.withName("visit")
    ).withName("CXCursorAndRangeVisitor");
    public static final long OFFSET__context = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("context"));
    public static final long OFFSET__visit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("visit"));

    public CXCursorAndRangeVisitor(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCursorAndRangeVisitor getAtIndex(MemorySegment buffer, long index)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXCursorAndRangeVisitor value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursorAndRangeVisitor other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment context() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__context);}
    public void context(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__context, value);}
    public MemorySegment $context() {return this.ptr().asSlice(OFFSET__context, UNBOUNDED_POINTER);}

    public MemorySegment visit() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__visit);}
    public void visit(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__visit, value);}
    public MemorySegment $visit() {return this.ptr().asSlice(OFFSET__visit, UNBOUNDED_POINTER);}
}
