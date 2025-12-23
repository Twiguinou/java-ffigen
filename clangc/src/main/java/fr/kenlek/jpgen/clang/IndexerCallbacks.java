package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record IndexerCallbacks(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("abortQuery"),
        ADDRESS.withName("diagnostic"),
        ADDRESS.withName("enteredMainFile"),
        ADDRESS.withName("ppIncludedFile"),
        ADDRESS.withName("importedASTFile"),
        ADDRESS.withName("startedTranslationUnit"),
        ADDRESS.withName("indexDeclaration"),
        ADDRESS.withName("indexEntityReference")
    ).withName("IndexerCallbacks");
    public static final long OFFSET_abortQuery = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("abortQuery"));
    public static final long OFFSET_diagnostic = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("diagnostic"));
    public static final long OFFSET_enteredMainFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("enteredMainFile"));
    public static final long OFFSET_ppIncludedFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ppIncludedFile"));
    public static final long OFFSET_importedASTFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("importedASTFile"));
    public static final long OFFSET_startedTranslationUnit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("startedTranslationUnit"));
    public static final long OFFSET_indexDeclaration = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexDeclaration"));
    public static final long OFFSET_indexEntityReference = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexEntityReference"));

    public IndexerCallbacks
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public IndexerCallbacks(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<IndexerCallbacks> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, IndexerCallbacks::new);
    }

    public static Buffer<IndexerCallbacks> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, IndexerCallbacks::new);
    }

    public static IndexerCallbacks getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, IndexerCallbacks value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment abortQuery()
    {
        return this.pointer().get(ADDRESS, OFFSET_abortQuery);
    }

    public void abortQuery(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_abortQuery, value);
    }

    public MemorySegment $abortQuery()
    {
        return this.pointer().asSlice(OFFSET_abortQuery, ADDRESS);
    }

    public MemorySegment diagnostic()
    {
        return this.pointer().get(ADDRESS, OFFSET_diagnostic);
    }

    public void diagnostic(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_diagnostic, value);
    }

    public MemorySegment $diagnostic()
    {
        return this.pointer().asSlice(OFFSET_diagnostic, ADDRESS);
    }

    public MemorySegment enteredMainFile()
    {
        return this.pointer().get(ADDRESS, OFFSET_enteredMainFile);
    }

    public void enteredMainFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_enteredMainFile, value);
    }

    public MemorySegment $enteredMainFile()
    {
        return this.pointer().asSlice(OFFSET_enteredMainFile, ADDRESS);
    }

    public MemorySegment ppIncludedFile()
    {
        return this.pointer().get(ADDRESS, OFFSET_ppIncludedFile);
    }

    public void ppIncludedFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_ppIncludedFile, value);
    }

    public MemorySegment $ppIncludedFile()
    {
        return this.pointer().asSlice(OFFSET_ppIncludedFile, ADDRESS);
    }

    public MemorySegment importedASTFile()
    {
        return this.pointer().get(ADDRESS, OFFSET_importedASTFile);
    }

    public void importedASTFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_importedASTFile, value);
    }

    public MemorySegment $importedASTFile()
    {
        return this.pointer().asSlice(OFFSET_importedASTFile, ADDRESS);
    }

    public MemorySegment startedTranslationUnit()
    {
        return this.pointer().get(ADDRESS, OFFSET_startedTranslationUnit);
    }

    public void startedTranslationUnit(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_startedTranslationUnit, value);
    }

    public MemorySegment $startedTranslationUnit()
    {
        return this.pointer().asSlice(OFFSET_startedTranslationUnit, ADDRESS);
    }

    public MemorySegment indexDeclaration()
    {
        return this.pointer().get(ADDRESS, OFFSET_indexDeclaration);
    }

    public void indexDeclaration(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_indexDeclaration, value);
    }

    public MemorySegment $indexDeclaration()
    {
        return this.pointer().asSlice(OFFSET_indexDeclaration, ADDRESS);
    }

    public MemorySegment indexEntityReference()
    {
        return this.pointer().get(ADDRESS, OFFSET_indexEntityReference);
    }

    public void indexEntityReference(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_indexEntityReference, value);
    }

    public MemorySegment $indexEntityReference()
    {
        return this.pointer().asSlice(OFFSET_indexEntityReference, ADDRESS);
    }
}
