package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXSourceRangeList(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("count"),
        UNBOUNDED_POINTER.withName("ranges")
    ).withName("CXSourceRangeList");
    public static final long OFFSET__count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("count"));
    public static final long OFFSET__ranges = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ranges"));

    public CXSourceRangeList(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment ranges()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__ranges);
    }

    public void ranges(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__ranges, value);
    }

    public MemorySegment $ranges()
    {
        return this.pointer().asSlice(OFFSET__ranges, UNBOUNDED_POINTER);
    }
}
