/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record IndexerCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public IndexerCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout));
    }

    public static IndexerCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, IndexerCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__abortQuery = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(0).byteOffset();
    public java.lang.foreign.MemorySegment abortQuery() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery);}
    public void abortQuery(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery, value);}
    public java.lang.foreign.MemorySegment $abortQuery() {return this.ptr.asSlice(MEMBER_OFFSET__abortQuery, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__diagnostic = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(1).byteOffset();
    public java.lang.foreign.MemorySegment diagnostic() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic);}
    public void diagnostic(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic, value);}
    public java.lang.foreign.MemorySegment $diagnostic() {return this.ptr.asSlice(MEMBER_OFFSET__diagnostic, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__enteredMainFile = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(2).byteOffset();
    public java.lang.foreign.MemorySegment enteredMainFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile);}
    public void enteredMainFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile, value);}
    public java.lang.foreign.MemorySegment $enteredMainFile() {return this.ptr.asSlice(MEMBER_OFFSET__enteredMainFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__ppIncludedFile = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(3).byteOffset();
    public java.lang.foreign.MemorySegment ppIncludedFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile);}
    public void ppIncludedFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile, value);}
    public java.lang.foreign.MemorySegment $ppIncludedFile() {return this.ptr.asSlice(MEMBER_OFFSET__ppIncludedFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__importedASTFile = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(4).byteOffset();
    public java.lang.foreign.MemorySegment importedASTFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile);}
    public void importedASTFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile, value);}
    public java.lang.foreign.MemorySegment $importedASTFile() {return this.ptr.asSlice(MEMBER_OFFSET__importedASTFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__startedTranslationUnit = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(5).byteOffset();
    public java.lang.foreign.MemorySegment startedTranslationUnit() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit);}
    public void startedTranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit, value);}
    public java.lang.foreign.MemorySegment $startedTranslationUnit() {return this.ptr.asSlice(MEMBER_OFFSET__startedTranslationUnit, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexDeclaration = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(6).byteOffset();
    public java.lang.foreign.MemorySegment indexDeclaration() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration);}
    public void indexDeclaration(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration, value);}
    public java.lang.foreign.MemorySegment $indexDeclaration() {return this.ptr.asSlice(MEMBER_OFFSET__indexDeclaration, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexEntityReference = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks.state(7).byteOffset();
    public java.lang.foreign.MemorySegment indexEntityReference() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference);}
    public void indexEntityReference(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference, value);}
    public java.lang.foreign.MemorySegment $indexEntityReference() {return this.ptr.asSlice(MEMBER_OFFSET__indexEntityReference, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
