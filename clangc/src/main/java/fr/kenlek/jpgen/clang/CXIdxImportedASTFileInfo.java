package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;

public record CXIdxImportedASTFileInfo(MemorySegment ptr)
{
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
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxImportedASTFileInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment file() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__file);}
    public void file(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__file, value);}
    public MemorySegment $file() {return this.ptr().asSlice(OFFSET__file, UNBOUNDED_POINTER);}

    public MemorySegment module() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__module);}
    public void module(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__module, value);}
    public MemorySegment $module() {return this.ptr().asSlice(OFFSET__module, UNBOUNDED_POINTER);}

    public CXIdxLoc loc() {return new CXIdxLoc(this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));}
    public void loc(Consumer<CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(CXIdxLoc value) {MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__loc, CXIdxLoc.LAYOUT.byteSize());}
    public MemorySegment $loc() {return this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT);}

    public int isImplicit() {return this.ptr().get(JAVA_INT, OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr().set(JAVA_INT, OFFSET__isImplicit, value);}
    public MemorySegment $isImplicit() {return this.ptr().asSlice(OFFSET__isImplicit, JAVA_INT);}
}
