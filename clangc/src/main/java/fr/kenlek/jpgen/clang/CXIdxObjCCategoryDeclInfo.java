package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXIdxObjCCategoryDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("containerInfo"),
        ADDRESS.withName("objcClass"),
        CXCursor.LAYOUT.withName("classCursor"),
        CXIdxLoc.LAYOUT.withName("classLoc"),
        ADDRESS.withName("protocols")
    ).withName("CXIdxObjCCategoryDeclInfo");
    public static final long OFFSET_containerInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("containerInfo"));
    public static final long OFFSET_objcClass = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("objcClass"));
    public static final long OFFSET_classCursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classCursor"));
    public static final long OFFSET_classLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classLoc"));
    public static final long OFFSET_protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));

    public CXIdxObjCCategoryDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCCategoryDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCCategoryDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCCategoryDeclInfo::new);
    }

    public static Buffer<CXIdxObjCCategoryDeclInfo> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXIdxObjCCategoryDeclInfo::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXIdxObjCCategoryDeclInfo other)
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
