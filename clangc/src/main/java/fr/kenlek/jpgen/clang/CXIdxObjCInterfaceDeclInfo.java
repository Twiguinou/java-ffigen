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
public record CXIdxObjCInterfaceDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("containerInfo"),
        ADDRESS.withName("superInfo"),
        ADDRESS.withName("protocols")
    ).withName("CXIdxObjCInterfaceDeclInfo");
    public static final long OFFSET__containerInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("containerInfo"));
    public static final long OFFSET__superInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("superInfo"));
    public static final long OFFSET__protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));

    public CXIdxObjCInterfaceDeclInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCInterfaceDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCInterfaceDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment containerInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET__containerInfo);
    }

    public void containerInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__containerInfo, value);
    }

    public MemorySegment $containerInfo()
    {
        return this.pointer().asSlice(OFFSET__containerInfo, ADDRESS);
    }

    public MemorySegment superInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET__superInfo);
    }

    public void superInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__superInfo, value);
    }

    public MemorySegment $superInfo()
    {
        return this.pointer().asSlice(OFFSET__superInfo, ADDRESS);
    }

    public MemorySegment protocols()
    {
        return this.pointer().get(ADDRESS, OFFSET__protocols);
    }

    public void protocols(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__protocols, value);
    }

    public MemorySegment $protocols()
    {
        return this.pointer().asSlice(OFFSET__protocols, ADDRESS);
    }
}
