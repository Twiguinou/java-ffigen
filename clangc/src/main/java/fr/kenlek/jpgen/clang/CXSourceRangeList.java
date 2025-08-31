package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;

@Layout.Container("LAYOUT")
public record CXSourceRangeList(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("count"),
        ADDRESS.withName("ranges")
    ).withName("CXSourceRangeList");
    public static final long OFFSET__count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("count"));
    public static final long OFFSET__ranges = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ranges"));

    public CXSourceRangeList
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static CXSourceRangeList getAtIndex(MemorySegment buffer, long index)
    {
        return new CXSourceRangeList(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXSourceRangeList value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceRangeList other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int count()
    {
        return this.pointer().get(JAVA_INT, OFFSET__count);
    }

    public void count(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__count, value);
    }

    public MemorySegment $count()
    {
        return this.pointer().asSlice(OFFSET__count, JAVA_INT);
    }

    public Buffer<CXSourceRange> ranges()
    {
        return CXSourceRange.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.count(), CXSourceRange.LAYOUT)), OFFSET__ranges
        ));
    }

    public void ranges(Consumer<Buffer<CXSourceRange>> consumer)
    {
        consumer.accept(this.ranges());
    }

    public void ranges(Buffer<CXSourceRange> value)
    {
        this.pointer().set(ADDRESS, OFFSET__ranges, value.pointer());
    }

    public MemorySegment $ranges()
    {
        return this.pointer().asSlice(OFFSET__ranges, ADDRESS);
    }
}
