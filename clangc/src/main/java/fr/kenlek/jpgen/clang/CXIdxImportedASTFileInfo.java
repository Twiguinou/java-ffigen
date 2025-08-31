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

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxImportedASTFileInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("file"),
        ADDRESS.withName("module"),
        CXIdxLoc.LAYOUT.withName("loc"),
        JAVA_INT.withName("isImplicit")
    ).withName("CXIdxImportedASTFileInfo");
    public static final long OFFSET__file = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("file"));
    public static final long OFFSET__module = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("module"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET__isImplicit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImplicit"));

    public CXIdxImportedASTFileInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxImportedASTFileInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxImportedASTFileInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxImportedASTFileInfo::new);
    }

    public static Buffer<CXIdxImportedASTFileInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxImportedASTFileInfo::new);
    }

    public static CXIdxImportedASTFileInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxImportedASTFileInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxImportedASTFileInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxImportedASTFileInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
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

    public MemorySegment module()
    {
        return this.pointer().get(ADDRESS, OFFSET__module);
    }

    public void module(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__module, value);
    }

    public MemorySegment $module()
    {
        return this.pointer().asSlice(OFFSET__module, ADDRESS);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public boolean isImplicit()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isImplicit) != 0;
    }

    public void isImplicit(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isImplicit, value ? 1 : 0);
    }

    public MemorySegment $isImplicit()
    {
        return this.pointer().asSlice(OFFSET__isImplicit, JAVA_INT);
    }
}
