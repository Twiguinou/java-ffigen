/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record IndexerCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("abortQuery"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("diagnostic"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("enteredMainFile"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ppIncludedFile"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("importedASTFile"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("startedTranslationUnit"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexDeclaration"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexEntityReference")
    ).withByteAlignment(8);

    public IndexerCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static IndexerCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, IndexerCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__abortQuery = 0;
    public java.lang.foreign.MemorySegment abortQuery() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery);}
    public void abortQuery(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery, value);}
    public java.lang.foreign.MemorySegment $abortQuery() {return this.ptr.asSlice(MEMBER_OFFSET__abortQuery, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__diagnostic = 8;
    public java.lang.foreign.MemorySegment diagnostic() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic);}
    public void diagnostic(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic, value);}
    public java.lang.foreign.MemorySegment $diagnostic() {return this.ptr.asSlice(MEMBER_OFFSET__diagnostic, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__enteredMainFile = 16;
    public java.lang.foreign.MemorySegment enteredMainFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile);}
    public void enteredMainFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile, value);}
    public java.lang.foreign.MemorySegment $enteredMainFile() {return this.ptr.asSlice(MEMBER_OFFSET__enteredMainFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__ppIncludedFile = 24;
    public java.lang.foreign.MemorySegment ppIncludedFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile);}
    public void ppIncludedFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile, value);}
    public java.lang.foreign.MemorySegment $ppIncludedFile() {return this.ptr.asSlice(MEMBER_OFFSET__ppIncludedFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__importedASTFile = 32;
    public java.lang.foreign.MemorySegment importedASTFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile);}
    public void importedASTFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile, value);}
    public java.lang.foreign.MemorySegment $importedASTFile() {return this.ptr.asSlice(MEMBER_OFFSET__importedASTFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__startedTranslationUnit = 40;
    public java.lang.foreign.MemorySegment startedTranslationUnit() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit);}
    public void startedTranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit, value);}
    public java.lang.foreign.MemorySegment $startedTranslationUnit() {return this.ptr.asSlice(MEMBER_OFFSET__startedTranslationUnit, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexDeclaration = 48;
    public java.lang.foreign.MemorySegment indexDeclaration() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration);}
    public void indexDeclaration(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration, value);}
    public java.lang.foreign.MemorySegment $indexDeclaration() {return this.ptr.asSlice(MEMBER_OFFSET__indexDeclaration, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexEntityReference = 56;
    public java.lang.foreign.MemorySegment indexEntityReference() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference);}
    public void indexEntityReference(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference, value);}
    public java.lang.foreign.MemorySegment $indexEntityReference() {return this.ptr.asSlice(MEMBER_OFFSET__indexEntityReference, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
