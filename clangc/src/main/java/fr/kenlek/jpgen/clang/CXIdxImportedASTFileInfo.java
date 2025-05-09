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

public record CXIdxImportedASTFileInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("file"),
        UNBOUNDED_POINTER.withName("module"),
        CXIdxLoc.LAYOUT.withName("loc"),
        JAVA_INT.withName("isImplicit")
    ).withName("CXIdxImportedASTFileInfo");
    public static final long OFFSET__file = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("file"));
    public static final long OFFSET__module = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("module"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET__isImplicit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImplicit"));

    public CXIdxImportedASTFileInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment module()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__module);
    }

    public void module(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__module, value);
    }

    public MemorySegment $module()
    {
        return this.pointer().asSlice(OFFSET__module, UNBOUNDED_POINTER);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public void loc(CXIdxLoc value)
    {
        MemorySegment.copy(value.pointer(), 0, this.pointer(), OFFSET__loc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $loc()
    {
        return this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT);
    }

    public int isImplicit()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isImplicit);
    }

    public void isImplicit(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isImplicit, value);
    }

    public MemorySegment $isImplicit()
    {
        return this.pointer().asSlice(OFFSET__isImplicit, JAVA_INT);
    }
}
