package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXCursorAndRangeVisitor(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("context"),
        ADDRESS.withName("visit")
    ).withName("CXCursorAndRangeVisitor");
    public static final long OFFSET__context = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("context"));
    public static final long OFFSET__visit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("visit"));

    public CXCursorAndRangeVisitor
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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
        return this.pointer().get(ADDRESS, OFFSET__context);
    }

    public void context(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__context, value);
    }

    public MemorySegment $context()
    {
        return this.pointer().asSlice(OFFSET__context, ADDRESS);
    }

    public MemorySegment visit()
    {
        return this.pointer().get(ADDRESS, OFFSET__visit);
    }

    public void visit(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__visit, value);
    }

    public MemorySegment $visit()
    {
        return this.pointer().asSlice(OFFSET__visit, ADDRESS);
    }
}
