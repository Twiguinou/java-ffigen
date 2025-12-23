package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXSourceRangeList(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("count"),
        ADDRESS.withName("ranges")
    ).withName("CXSourceRangeList");
    public static final long OFFSET_count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("count"));
    public static final long OFFSET_ranges = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ranges"));

    public CXSourceRangeList
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXSourceRangeList(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXSourceRangeList> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXSourceRangeList::new);
    }

    public static Buffer<CXSourceRangeList> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXSourceRangeList::new);
    }

    public static CXSourceRangeList getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXSourceRangeList(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXSourceRangeList value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceRangeList other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int count()
    {
        return this.pointer().get(JAVA_INT, OFFSET_count);
    }

    public void count(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_count, value);
    }

    public MemorySegment $count()
    {
        return this.pointer().asSlice(OFFSET_count, JAVA_INT);
    }

    public Buffer<CXSourceRange> ranges()
    {
        return CXSourceRange.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.count(), CXSourceRange.LAYOUT)), OFFSET_ranges
        ));
    }

    public void ranges(Buffer<CXSourceRange> value)
    {
        this.pointer().set(ADDRESS, OFFSET_ranges, value.pointer());
    }

    public MemorySegment $ranges()
    {
        return this.pointer().asSlice(OFFSET_ranges, ADDRESS);
    }
}
