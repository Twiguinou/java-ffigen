package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXCursorAndRangeVisitor(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("context"),
        ADDRESS.withName("visit")
    ).withName("CXCursorAndRangeVisitor");
    public static final long OFFSET_context = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("context"));
    public static final long OFFSET_visit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("visit"));

    public CXCursorAndRangeVisitor
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXCursorAndRangeVisitor(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXCursorAndRangeVisitor> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXCursorAndRangeVisitor::new);
    }

    public static Buffer<CXCursorAndRangeVisitor> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXCursorAndRangeVisitor::new);
    }

    public static CXCursorAndRangeVisitor getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXCursorAndRangeVisitor(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXCursorAndRangeVisitor value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursorAndRangeVisitor other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment context()
    {
        return this.pointer().get(ADDRESS, OFFSET_context);
    }

    public void context(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_context, value);
    }

    public MemorySegment $context()
    {
        return this.pointer().asSlice(OFFSET_context, ADDRESS);
    }

    public MemorySegment visit()
    {
        return this.pointer().get(ADDRESS, OFFSET_visit);
    }

    public void visit(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_visit, value);
    }

    public MemorySegment $visit()
    {
        return this.pointer().asSlice(OFFSET_visit, ADDRESS);
    }
}
