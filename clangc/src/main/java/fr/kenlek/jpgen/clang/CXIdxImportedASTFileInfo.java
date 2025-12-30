package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxImportedASTFileInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("file"),
        ADDRESS.withName("module"),
        CXIdxLoc.LAYOUT.withName("loc"),
        JAVA_INT.withName("isImplicit")
    ).withName("CXIdxImportedASTFileInfo");
    public static final long OFFSET_file = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("file"));
    public static final long OFFSET_module = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("module"));
    public static final long OFFSET_loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET_isImplicit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImplicit"));

    public CXIdxImportedASTFileInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxImportedASTFileInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxImportedASTFileInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxImportedASTFileInfo::new);
    }

    public static Buffer<CXIdxImportedASTFileInfo> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXIdxImportedASTFileInfo::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXIdxImportedASTFileInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment file()
    {
        return this.pointer().get(ADDRESS, OFFSET_file);
    }

    public void file(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_file, value);
    }

    public MemorySegment $file()
    {
        return this.pointer().asSlice(OFFSET_file, ADDRESS);
    }

    public MemorySegment module()
    {
        return this.pointer().get(ADDRESS, OFFSET_module);
    }

    public void module(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_module, value);
    }

    public MemorySegment $module()
    {
        return this.pointer().asSlice(OFFSET_module, ADDRESS);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_loc, CXIdxLoc.LAYOUT));
    }

    public boolean isImplicit()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isImplicit) != 0;
    }

    public void isImplicit(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isImplicit, value ? 1 : 0);
    }

    public MemorySegment $isImplicit()
    {
        return this.pointer().asSlice(OFFSET_isImplicit, JAVA_INT);
    }
}
