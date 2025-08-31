package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

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
    public static final long OFFSET__hashLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("hashLoc"));
    public static final long OFFSET__filename = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("filename"));
    public static final long OFFSET__file = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("file"));
    public static final long OFFSET__isImport = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImport"));
    public static final long OFFSET__isAngled = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isAngled"));
    public static final long OFFSET__isModuleImport = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isModuleImport"));

    public CXIdxIncludedFileInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static CXIdxIncludedFileInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxIncludedFileInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxIncludedFileInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIncludedFileInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public CXIdxLoc hashLoc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__hashLoc, CXIdxLoc.LAYOUT));
    }

    public void hashLoc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.hashLoc());
    }

    public MemorySegment filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__filename);
    }

    public void filename(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__filename, value);
    }

    public MemorySegment $filename()
    {
        return this.pointer().asSlice(OFFSET__filename, ADDRESS);
    }

    public MemorySegment file()
    {
        return this.pointer().get(ADDRESS, OFFSET__file);
    }

    public void file(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__file, value);
    }

    public MemorySegment $file()
    {
        return this.pointer().asSlice(OFFSET__file, ADDRESS);
    }

    public boolean isImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isImport) != 0;
    }

    public void isImport(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isImport, value ? 1 : 0);
    }

    public MemorySegment $isImport()
    {
        return this.pointer().asSlice(OFFSET__isImport, JAVA_INT);
    }

    public boolean isAngled()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isAngled) != 0;
    }

    public void isAngled(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isAngled, value ? 1 : 0);
    }

    public MemorySegment $isAngled()
    {
        return this.pointer().asSlice(OFFSET__isAngled, JAVA_INT);
    }

    public boolean isModuleImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isModuleImport) != 0;
    }

    public void isModuleImport(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isModuleImport, value ? 1 : 0);
    }

    public MemorySegment $isModuleImport()
    {
        return this.pointer().asSlice(OFFSET__isModuleImport, JAVA_INT);
    }
}
