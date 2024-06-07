package jpgen.clang;

public record IndexerCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__abortQuery = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__abortQuery = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__diagnostic = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__diagnostic = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__enteredMainFile = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__enteredMainFile = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppIncludedFile = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ppIncludedFile = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__importedASTFile = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__importedASTFile = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__startedTranslationUnit = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__startedTranslationUnit = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__indexDeclaration = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__indexDeclaration = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__indexEntityReference = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__indexEntityReference = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__abortQuery,
            LAYOUT__diagnostic,
            LAYOUT__enteredMainFile,
            LAYOUT__ppIncludedFile,
            LAYOUT__importedASTFile,
            LAYOUT__startedTranslationUnit,
            LAYOUT__indexDeclaration,
            LAYOUT__indexEntityReference
    ).withByteAlignment(8).withName("IndexerCallbacks");

    public IndexerCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static IndexerCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new IndexerCallbacks(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, IndexerCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment abortQuery() {return this.ptr.get(LAYOUT__abortQuery, OFFSET__abortQuery);}
    public void abortQuery(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__abortQuery, OFFSET__abortQuery, value);}
    public java.lang.foreign.MemorySegment $abortQuery() {return this.ptr.asSlice(OFFSET__abortQuery, LAYOUT__abortQuery);}

    public java.lang.foreign.MemorySegment diagnostic() {return this.ptr.get(LAYOUT__diagnostic, OFFSET__diagnostic);}
    public void diagnostic(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__diagnostic, OFFSET__diagnostic, value);}
    public java.lang.foreign.MemorySegment $diagnostic() {return this.ptr.asSlice(OFFSET__diagnostic, LAYOUT__diagnostic);}

    public java.lang.foreign.MemorySegment enteredMainFile() {return this.ptr.get(LAYOUT__enteredMainFile, OFFSET__enteredMainFile);}
    public void enteredMainFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__enteredMainFile, OFFSET__enteredMainFile, value);}
    public java.lang.foreign.MemorySegment $enteredMainFile() {return this.ptr.asSlice(OFFSET__enteredMainFile, LAYOUT__enteredMainFile);}

    public java.lang.foreign.MemorySegment ppIncludedFile() {return this.ptr.get(LAYOUT__ppIncludedFile, OFFSET__ppIncludedFile);}
    public void ppIncludedFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppIncludedFile, OFFSET__ppIncludedFile, value);}
    public java.lang.foreign.MemorySegment $ppIncludedFile() {return this.ptr.asSlice(OFFSET__ppIncludedFile, LAYOUT__ppIncludedFile);}

    public java.lang.foreign.MemorySegment importedASTFile() {return this.ptr.get(LAYOUT__importedASTFile, OFFSET__importedASTFile);}
    public void importedASTFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__importedASTFile, OFFSET__importedASTFile, value);}
    public java.lang.foreign.MemorySegment $importedASTFile() {return this.ptr.asSlice(OFFSET__importedASTFile, LAYOUT__importedASTFile);}

    public java.lang.foreign.MemorySegment startedTranslationUnit() {return this.ptr.get(LAYOUT__startedTranslationUnit, OFFSET__startedTranslationUnit);}
    public void startedTranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__startedTranslationUnit, OFFSET__startedTranslationUnit, value);}
    public java.lang.foreign.MemorySegment $startedTranslationUnit() {return this.ptr.asSlice(OFFSET__startedTranslationUnit, LAYOUT__startedTranslationUnit);}

    public java.lang.foreign.MemorySegment indexDeclaration() {return this.ptr.get(LAYOUT__indexDeclaration, OFFSET__indexDeclaration);}
    public void indexDeclaration(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__indexDeclaration, OFFSET__indexDeclaration, value);}
    public java.lang.foreign.MemorySegment $indexDeclaration() {return this.ptr.asSlice(OFFSET__indexDeclaration, LAYOUT__indexDeclaration);}

    public java.lang.foreign.MemorySegment indexEntityReference() {return this.ptr.get(LAYOUT__indexEntityReference, OFFSET__indexEntityReference);}
    public void indexEntityReference(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__indexEntityReference, OFFSET__indexEntityReference, value);}
    public java.lang.foreign.MemorySegment $indexEntityReference() {return this.ptr.asSlice(OFFSET__indexEntityReference, LAYOUT__indexEntityReference);}
}
