package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXCursorAndRangeVisitor(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
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
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursorAndRangeVisitor other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment context()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__context);
    }

    public void context(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__context, value);
    }

    public MemorySegment $context()
    {
        return this.pointer().asSlice(OFFSET__context, UNBOUNDED_POINTER);
    }

    public MemorySegment visit()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__visit);
    }

    public void visit(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__visit, value);
    }

    public MemorySegment $visit()
    {
        return this.pointer().asSlice(OFFSET__visit, UNBOUNDED_POINTER);
    }
}
