package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

public record IndexerCallbacks(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("abortQuery"),
        UNBOUNDED_POINTER.withName("diagnostic"),
        UNBOUNDED_POINTER.withName("enteredMainFile"),
        UNBOUNDED_POINTER.withName("ppIncludedFile"),
        UNBOUNDED_POINTER.withName("importedASTFile"),
        UNBOUNDED_POINTER.withName("startedTranslationUnit"),
        UNBOUNDED_POINTER.withName("indexDeclaration"),
        UNBOUNDED_POINTER.withName("indexEntityReference")
    ).withName("IndexerCallbacks");
    public static final long OFFSET__abortQuery = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("abortQuery"));
    public static final long OFFSET__diagnostic = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("diagnostic"));
    public static final long OFFSET__enteredMainFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("enteredMainFile"));
    public static final long OFFSET__ppIncludedFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ppIncludedFile"));
    public static final long OFFSET__importedASTFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("importedASTFile"));
    public static final long OFFSET__startedTranslationUnit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("startedTranslationUnit"));
    public static final long OFFSET__indexDeclaration = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexDeclaration"));
    public static final long OFFSET__indexEntityReference = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexEntityReference"));

    public IndexerCallbacks(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static IndexerCallbacks getAtIndex(MemorySegment buffer, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, IndexerCallbacks value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment abortQuery()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__abortQuery);
    }

    public void abortQuery(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__abortQuery, value);
    }

    public MemorySegment $abortQuery()
    {
        return this.ptr().asSlice(OFFSET__abortQuery, UNBOUNDED_POINTER);
    }

    public MemorySegment diagnostic()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__diagnostic);
    }

    public void diagnostic(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__diagnostic, value);
    }

    public MemorySegment $diagnostic()
    {
        return this.ptr().asSlice(OFFSET__diagnostic, UNBOUNDED_POINTER);
    }

    public MemorySegment enteredMainFile()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__enteredMainFile);
    }

    public void enteredMainFile(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__enteredMainFile, value);
    }

    public MemorySegment $enteredMainFile()
    {
        return this.ptr().asSlice(OFFSET__enteredMainFile, UNBOUNDED_POINTER);
    }

    public MemorySegment ppIncludedFile()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__ppIncludedFile);
    }

    public void ppIncludedFile(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__ppIncludedFile, value);
    }

    public MemorySegment $ppIncludedFile()
    {
        return this.ptr().asSlice(OFFSET__ppIncludedFile, UNBOUNDED_POINTER);
    }

    public MemorySegment importedASTFile()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__importedASTFile);
    }

    public void importedASTFile(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__importedASTFile, value);
    }

    public MemorySegment $importedASTFile()
    {
        return this.ptr().asSlice(OFFSET__importedASTFile, UNBOUNDED_POINTER);
    }

    public MemorySegment startedTranslationUnit()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__startedTranslationUnit);
    }

    public void startedTranslationUnit(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__startedTranslationUnit, value);
    }

    public MemorySegment $startedTranslationUnit()
    {
        return this.ptr().asSlice(OFFSET__startedTranslationUnit, UNBOUNDED_POINTER);
    }

    public MemorySegment indexDeclaration()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__indexDeclaration);
    }

    public void indexDeclaration(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__indexDeclaration, value);
    }

    public MemorySegment $indexDeclaration()
    {
        return this.ptr().asSlice(OFFSET__indexDeclaration, UNBOUNDED_POINTER);
    }

    public MemorySegment indexEntityReference()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__indexEntityReference);
    }

    public void indexEntityReference(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__indexEntityReference, value);
    }

    public MemorySegment $indexEntityReference()
    {
        return this.ptr().asSlice(OFFSET__indexEntityReference, UNBOUNDED_POINTER);
    }
}
