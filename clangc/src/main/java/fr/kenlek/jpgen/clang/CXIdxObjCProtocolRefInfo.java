package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXIdxObjCProtocolRefInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("protocol"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc")
    ).withName("CXIdxObjCProtocolRefInfo");
    public static final long OFFSET_protocol = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocol"));
    public static final long OFFSET_cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET_loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));

    public CXIdxObjCProtocolRefInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCProtocolRefInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCProtocolRefInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCProtocolRefInfo::new);
    }

    public static Buffer<CXIdxObjCProtocolRefInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCProtocolRefInfo::new);
    }

    public static CXIdxObjCProtocolRefInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxObjCProtocolRefInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxObjCProtocolRefInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment protocol()
    {
        return this.pointer().get(ADDRESS, OFFSET_protocol);
    }

    public void protocol(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_protocol, value);
    }

    public MemorySegment $protocol()
    {
        return this.pointer().asSlice(OFFSET_protocol, ADDRESS);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_cursor, CXCursor.LAYOUT));
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_loc, CXIdxLoc.LAYOUT));
    }
}
