package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxIncludedFileInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        CXIdxLoc.LAYOUT.withName("hashLoc"),
        UNBOUNDED_POINTER.withName("filename"),
        UNBOUNDED_POINTER.withName("file"),
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

    public CXIdxIncludedFileInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public void hashLoc(CXIdxLoc value)
    {
        MemorySegment.copy(value.pointer(), 0, this.pointer(), OFFSET__hashLoc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $hashLoc()
    {
        return this.pointer().asSlice(OFFSET__hashLoc, CXIdxLoc.LAYOUT);
    }

    public MemorySegment filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__filename);
    }

    public void filename(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__filename, value);
    }

    public MemorySegment $filename()
    {
        return this.pointer().asSlice(OFFSET__filename, UNBOUNDED_POINTER);
    }

    public MemorySegment file()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__file);
    }

    public void file(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__file, value);
    }

    public MemorySegment $file()
    {
        return this.pointer().asSlice(OFFSET__file, UNBOUNDED_POINTER);
    }

    public int isImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isImport);
    }

    public void isImport(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isImport, value);
    }

    public MemorySegment $isImport()
    {
        return this.pointer().asSlice(OFFSET__isImport, JAVA_INT);
    }

    public int isAngled()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isAngled);
    }

    public void isAngled(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isAngled, value);
    }

    public MemorySegment $isAngled()
    {
        return this.pointer().asSlice(OFFSET__isAngled, JAVA_INT);
    }

    public int isModuleImport()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isModuleImport);
    }

    public void isModuleImport(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isModuleImport, value);
    }

    public MemorySegment $isModuleImport()
    {
        return this.pointer().asSlice(OFFSET__isModuleImport, JAVA_INT);
    }
}
