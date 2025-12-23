package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxContainerInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        CXCursor.LAYOUT.withName("cursor")
    ).withName("CXIdxContainerInfo");
    public static final long OFFSET_cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));

    public CXIdxContainerInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxContainerInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxContainerInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxContainerInfo::new);
    }

    public static Buffer<CXIdxContainerInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxContainerInfo::new);
    }

    public static CXIdxContainerInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxContainerInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxContainerInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxContainerInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_cursor, CXCursor.LAYOUT));
    }
}
