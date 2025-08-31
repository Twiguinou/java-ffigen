package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

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
    public static final long OFFSET__abortQuery = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("abortQuery"));
    public static final long OFFSET__diagnostic = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("diagnostic"));
    public static final long OFFSET__enteredMainFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("enteredMainFile"));
    public static final long OFFSET__ppIncludedFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ppIncludedFile"));
    public static final long OFFSET__importedASTFile = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("importedASTFile"));
    public static final long OFFSET__startedTranslationUnit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("startedTranslationUnit"));
    public static final long OFFSET__indexDeclaration = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexDeclaration"));
    public static final long OFFSET__indexEntityReference = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("indexEntityReference"));

    public IndexerCallbacks
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static IndexerCallbacks getAtIndex(MemorySegment buffer, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, IndexerCallbacks value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment abortQuery()
    {
        return this.pointer().get(ADDRESS, OFFSET__abortQuery);
    }

    public void abortQuery(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__abortQuery, value);
    }

    public MemorySegment $abortQuery()
    {
        return this.pointer().asSlice(OFFSET__abortQuery, ADDRESS);
    }

    public MemorySegment diagnostic()
    {
        return this.pointer().get(ADDRESS, OFFSET__diagnostic);
    }

    public void diagnostic(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__diagnostic, value);
    }

    public MemorySegment $diagnostic()
    {
        return this.pointer().asSlice(OFFSET__diagnostic, ADDRESS);
    }

    public MemorySegment enteredMainFile()
    {
        return this.pointer().get(ADDRESS, OFFSET__enteredMainFile);
    }

    public void enteredMainFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__enteredMainFile, value);
    }

    public MemorySegment $enteredMainFile()
    {
        return this.pointer().asSlice(OFFSET__enteredMainFile, ADDRESS);
    }

    public MemorySegment ppIncludedFile()
    {
        return this.pointer().get(ADDRESS, OFFSET__ppIncludedFile);
    }

    public void ppIncludedFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__ppIncludedFile, value);
    }

    public MemorySegment $ppIncludedFile()
    {
        return this.pointer().asSlice(OFFSET__ppIncludedFile, ADDRESS);
    }

    public MemorySegment importedASTFile()
    {
        return this.pointer().get(ADDRESS, OFFSET__importedASTFile);
    }

    public void importedASTFile(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__importedASTFile, value);
    }

    public MemorySegment $importedASTFile()
    {
        return this.pointer().asSlice(OFFSET__importedASTFile, ADDRESS);
    }

    public MemorySegment startedTranslationUnit()
    {
        return this.pointer().get(ADDRESS, OFFSET__startedTranslationUnit);
    }

    public void startedTranslationUnit(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__startedTranslationUnit, value);
    }

    public MemorySegment $startedTranslationUnit()
    {
        return this.pointer().asSlice(OFFSET__startedTranslationUnit, ADDRESS);
    }

    public MemorySegment indexDeclaration()
    {
        return this.pointer().get(ADDRESS, OFFSET__indexDeclaration);
    }

    public void indexDeclaration(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__indexDeclaration, value);
    }

    public MemorySegment $indexDeclaration()
    {
        return this.pointer().asSlice(OFFSET__indexDeclaration, ADDRESS);
    }

    public MemorySegment indexEntityReference()
    {
        return this.pointer().get(ADDRESS, OFFSET__indexEntityReference);
    }

    public void indexEntityReference(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__indexEntityReference, value);
    }

    public MemorySegment $indexEntityReference()
    {
        return this.pointer().asSlice(OFFSET__indexEntityReference, ADDRESS);
    }
}
