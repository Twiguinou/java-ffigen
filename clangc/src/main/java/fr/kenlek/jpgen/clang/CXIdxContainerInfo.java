package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.ForeignUtils.makeStructLayout;

public record CXIdxContainerInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        CXCursor.LAYOUT.withName("cursor")
    ).withName("CXIdxContainerInfo");
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));

    public CXIdxContainerInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxContainerInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxContainerInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxContainerInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxContainerInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public void cursor(CXCursor value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__cursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $cursor()
    {
        return this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT);
    }
}
