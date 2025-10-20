package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXIdxIBOutletCollectionAttrInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("attrInfo"),
        ADDRESS.withName("objcClass"),
        CXCursor.LAYOUT.withName("classCursor"),
        CXIdxLoc.LAYOUT.withName("classLoc")
    ).withName("CXIdxIBOutletCollectionAttrInfo");
    public static final long OFFSET_attrInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attrInfo"));
    public static final long OFFSET_objcClass = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("objcClass"));
    public static final long OFFSET_classCursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classCursor"));
    public static final long OFFSET_classLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classLoc"));

    public CXIdxIBOutletCollectionAttrInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxIBOutletCollectionAttrInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxIBOutletCollectionAttrInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxIBOutletCollectionAttrInfo::new);
    }

    public static Buffer<CXIdxIBOutletCollectionAttrInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxIBOutletCollectionAttrInfo::new);
    }

    public static CXIdxIBOutletCollectionAttrInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxIBOutletCollectionAttrInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxIBOutletCollectionAttrInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIBOutletCollectionAttrInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment attrInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_attrInfo);
    }

    public void attrInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_attrInfo, value);
    }

    public MemorySegment $attrInfo()
    {
        return this.pointer().asSlice(OFFSET_attrInfo, ADDRESS);
    }

    public MemorySegment objcClass()
    {
        return this.pointer().get(ADDRESS, OFFSET_objcClass);
    }

    public void objcClass(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_objcClass, value);
    }

    public MemorySegment $objcClass()
    {
        return this.pointer().asSlice(OFFSET_objcClass, ADDRESS);
    }

    public CXCursor classCursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_classCursor, CXCursor.LAYOUT));
    }

    public CXIdxLoc classLoc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_classLoc, CXIdxLoc.LAYOUT));
    }
}
