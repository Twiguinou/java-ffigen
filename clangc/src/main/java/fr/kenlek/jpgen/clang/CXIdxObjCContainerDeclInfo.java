package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxObjCContainerDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        JAVA_INT.withName("kind")
    ).withName("CXIdxObjCContainerDeclInfo");
    public static final long OFFSET_declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));

    public CXIdxObjCContainerDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCContainerDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCContainerDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCContainerDeclInfo::new);
    }

    public static Buffer<CXIdxObjCContainerDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCContainerDeclInfo::new);
    }

    public static CXIdxObjCContainerDeclInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxObjCContainerDeclInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxObjCContainerDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCContainerDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment declInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.pointer().asSlice(OFFSET_declInfo, ADDRESS);
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET_kind, JAVA_INT);
    }
}
