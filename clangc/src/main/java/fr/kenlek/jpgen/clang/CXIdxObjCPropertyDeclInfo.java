package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXIdxObjCPropertyDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        ADDRESS.withName("getter"),
        ADDRESS.withName("setter")
    ).withName("CXIdxObjCPropertyDeclInfo");
    public static final long OFFSET_declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET_getter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("getter"));
    public static final long OFFSET_setter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("setter"));

    public CXIdxObjCPropertyDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCPropertyDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCPropertyDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCPropertyDeclInfo::new);
    }

    public static Buffer<CXIdxObjCPropertyDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCPropertyDeclInfo::new);
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxObjCPropertyDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCPropertyDeclInfo other)
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

    public MemorySegment getter()
    {
        return this.pointer().get(ADDRESS, OFFSET_getter);
    }

    public void getter(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_getter, value);
    }

    public MemorySegment $getter()
    {
        return this.pointer().asSlice(OFFSET_getter, ADDRESS);
    }

    public MemorySegment setter()
    {
        return this.pointer().get(ADDRESS, OFFSET_setter);
    }

    public void setter(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_setter, value);
    }

    public MemorySegment $setter()
    {
        return this.pointer().asSlice(OFFSET_setter, ADDRESS);
    }
}
