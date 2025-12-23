package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXIdxObjCInterfaceDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("containerInfo"),
        ADDRESS.withName("superInfo"),
        ADDRESS.withName("protocols")
    ).withName("CXIdxObjCInterfaceDeclInfo");
    public static final long OFFSET_containerInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("containerInfo"));
    public static final long OFFSET_superInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("superInfo"));
    public static final long OFFSET_protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));

    public CXIdxObjCInterfaceDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCInterfaceDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCInterfaceDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCInterfaceDeclInfo::new);
    }

    public static Buffer<CXIdxObjCInterfaceDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCInterfaceDeclInfo::new);
    }

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxObjCInterfaceDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCInterfaceDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment containerInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_containerInfo);
    }

    public void containerInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_containerInfo, value);
    }

    public MemorySegment $containerInfo()
    {
        return this.pointer().asSlice(OFFSET_containerInfo, ADDRESS);
    }

    public MemorySegment superInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_superInfo);
    }

    public void superInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_superInfo, value);
    }

    public MemorySegment $superInfo()
    {
        return this.pointer().asSlice(OFFSET_superInfo, ADDRESS);
    }

    public MemorySegment protocols()
    {
        return this.pointer().get(ADDRESS, OFFSET_protocols);
    }

    public void protocols(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_protocols, value);
    }

    public MemorySegment $protocols()
    {
        return this.pointer().asSlice(OFFSET_protocols, ADDRESS);
    }
}
