package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxIncludedFileInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        CXIdxLoc.LAYOUT.withName("hashLoc"),
        ADDRESS.withName("filename"),
        ADDRESS.withName("file"),
        JAVA_INT.withName("isImport"),
        JAVA_INT.withName("isAngled"),
        JAVA_INT.withName("isModuleImport")
    ).withName("CXIdxIncludedFileInfo");
    public static final long OFFSET_hashLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("hashLoc"));
    public static final long OFFSET_filename = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("filename"));
    public static final long OFFSET_file = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("file"));
    public static final long OFFSET_isImport = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImport"));
    public static final long OFFSET_isAngled = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isAngled"));
    public static final long OFFSET_isModuleImport = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isModuleImport"));

    public CXIdxIncludedFileInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxIncludedFileInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxIncludedFileInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxIncludedFileInfo::new);
    }

    public static Buffer<CXIdxIncludedFileInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxIncludedFileInfo::new);
    }

    public static CXIdxIncludedFileInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxIncludedFileInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxIncludedFileInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIncludedFileInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public CXIdxLoc hashLoc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_hashLoc, CXIdxLoc.LAYOUT));
    }

    public MemorySegment filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET_filename);
    }

    public void filename(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_filename, value);
    }

    public MemorySegment $filename()
    {
        return this.pointer().asSlice(OFFSET_filename, ADDRESS);
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

    public boolean isImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isImport) != 0;
    }

    public void isImport(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isImport, value ? 1 : 0);
    }

    public MemorySegment $isImport()
    {
        return this.pointer().asSlice(OFFSET_isImport, JAVA_INT);
    }

    public boolean isAngled()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isAngled) != 0;
    }

    public void isAngled(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isAngled, value ? 1 : 0);
    }

    public MemorySegment $isAngled()
    {
        return this.pointer().asSlice(OFFSET_isAngled, JAVA_INT);
    }

    public boolean isModuleImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isModuleImport) != 0;
    }

    public void isModuleImport(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isModuleImport, value ? 1 : 0);
    }

    public MemorySegment $isModuleImport()
    {
        return this.pointer().asSlice(OFFSET_isModuleImport, JAVA_INT);
    }
}
