/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record IndexerCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("IndexerCallbacks", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("abortQuery")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("diagnostic")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("enteredMainFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ppIncludedFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("importedASTFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("startedTranslationUnit")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexDeclaration")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexEntityReference"))
    ));

    public IndexerCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static IndexerCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, IndexerCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(IndexerCallbacks other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__abortQuery = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment abortQuery() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery);}
    public void abortQuery(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__abortQuery, value);}
    public java.lang.foreign.MemorySegment $abortQuery() {return this.ptr.asSlice(MEMBER_OFFSET__abortQuery, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__diagnostic = LAYOUT_DATA.state(1).byteOffset();
    public java.lang.foreign.MemorySegment diagnostic() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic);}
    public void diagnostic(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__diagnostic, value);}
    public java.lang.foreign.MemorySegment $diagnostic() {return this.ptr.asSlice(MEMBER_OFFSET__diagnostic, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__enteredMainFile = LAYOUT_DATA.state(2).byteOffset();
    public java.lang.foreign.MemorySegment enteredMainFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile);}
    public void enteredMainFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__enteredMainFile, value);}
    public java.lang.foreign.MemorySegment $enteredMainFile() {return this.ptr.asSlice(MEMBER_OFFSET__enteredMainFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__ppIncludedFile = LAYOUT_DATA.state(3).byteOffset();
    public java.lang.foreign.MemorySegment ppIncludedFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile);}
    public void ppIncludedFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ppIncludedFile, value);}
    public java.lang.foreign.MemorySegment $ppIncludedFile() {return this.ptr.asSlice(MEMBER_OFFSET__ppIncludedFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__importedASTFile = LAYOUT_DATA.state(4).byteOffset();
    public java.lang.foreign.MemorySegment importedASTFile() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile);}
    public void importedASTFile(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__importedASTFile, value);}
    public java.lang.foreign.MemorySegment $importedASTFile() {return this.ptr.asSlice(MEMBER_OFFSET__importedASTFile, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__startedTranslationUnit = LAYOUT_DATA.state(5).byteOffset();
    public java.lang.foreign.MemorySegment startedTranslationUnit() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit);}
    public void startedTranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__startedTranslationUnit, value);}
    public java.lang.foreign.MemorySegment $startedTranslationUnit() {return this.ptr.asSlice(MEMBER_OFFSET__startedTranslationUnit, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexDeclaration = LAYOUT_DATA.state(6).byteOffset();
    public java.lang.foreign.MemorySegment indexDeclaration() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration);}
    public void indexDeclaration(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexDeclaration, value);}
    public java.lang.foreign.MemorySegment $indexDeclaration() {return this.ptr.asSlice(MEMBER_OFFSET__indexDeclaration, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__indexEntityReference = LAYOUT_DATA.state(7).byteOffset();
    public java.lang.foreign.MemorySegment indexEntityReference() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference);}
    public void indexEntityReference(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__indexEntityReference, value);}
    public java.lang.foreign.MemorySegment $indexEntityReference() {return this.ptr.asSlice(MEMBER_OFFSET__indexEntityReference, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
