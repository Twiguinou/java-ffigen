package jpgen.clang;

public record IndexerCallbacks(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$abortQuery = java.lang.foreign.ValueLayout.ADDRESS.withName("abortQuery");
	public static final long OFFSET$abortQuery = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$diagnostic = java.lang.foreign.ValueLayout.ADDRESS.withName("diagnostic");
	public static final long OFFSET$diagnostic = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$enteredMainFile = java.lang.foreign.ValueLayout.ADDRESS.withName("enteredMainFile");
	public static final long OFFSET$enteredMainFile = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppIncludedFile = java.lang.foreign.ValueLayout.ADDRESS.withName("ppIncludedFile");
	public static final long OFFSET$ppIncludedFile = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$importedASTFile = java.lang.foreign.ValueLayout.ADDRESS.withName("importedASTFile");
	public static final long OFFSET$importedASTFile = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$startedTranslationUnit = java.lang.foreign.ValueLayout.ADDRESS.withName("startedTranslationUnit");
	public static final long OFFSET$startedTranslationUnit = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$indexDeclaration = java.lang.foreign.ValueLayout.ADDRESS.withName("indexDeclaration");
	public static final long OFFSET$indexDeclaration = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$indexEntityReference = java.lang.foreign.ValueLayout.ADDRESS.withName("indexEntityReference");
	public static final long OFFSET$indexEntityReference = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$abortQuery,
			LAYOUT$diagnostic,
			LAYOUT$enteredMainFile,
			LAYOUT$ppIncludedFile,
			LAYOUT$importedASTFile,
			LAYOUT$startedTranslationUnit,
			LAYOUT$indexDeclaration,
			LAYOUT$indexEntityReference
	).withName("IndexerCallbacks");

	public IndexerCallbacks(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment abortQuery() {return this.ptr.get(LAYOUT$abortQuery, OFFSET$abortQuery);}
	public void abortQuery(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$abortQuery, OFFSET$abortQuery, value);}
	public java.lang.foreign.MemorySegment abortQuery_ptr() {return this.ptr.asSlice(OFFSET$abortQuery, LAYOUT$abortQuery);}

	public java.lang.foreign.MemorySegment diagnostic() {return this.ptr.get(LAYOUT$diagnostic, OFFSET$diagnostic);}
	public void diagnostic(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$diagnostic, OFFSET$diagnostic, value);}
	public java.lang.foreign.MemorySegment diagnostic_ptr() {return this.ptr.asSlice(OFFSET$diagnostic, LAYOUT$diagnostic);}

	public java.lang.foreign.MemorySegment enteredMainFile() {return this.ptr.get(LAYOUT$enteredMainFile, OFFSET$enteredMainFile);}
	public void enteredMainFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$enteredMainFile, OFFSET$enteredMainFile, value);}
	public java.lang.foreign.MemorySegment enteredMainFile_ptr() {return this.ptr.asSlice(OFFSET$enteredMainFile, LAYOUT$enteredMainFile);}

	public java.lang.foreign.MemorySegment ppIncludedFile() {return this.ptr.get(LAYOUT$ppIncludedFile, OFFSET$ppIncludedFile);}
	public void ppIncludedFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppIncludedFile, OFFSET$ppIncludedFile, value);}
	public java.lang.foreign.MemorySegment ppIncludedFile_ptr() {return this.ptr.asSlice(OFFSET$ppIncludedFile, LAYOUT$ppIncludedFile);}

	public java.lang.foreign.MemorySegment importedASTFile() {return this.ptr.get(LAYOUT$importedASTFile, OFFSET$importedASTFile);}
	public void importedASTFile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$importedASTFile, OFFSET$importedASTFile, value);}
	public java.lang.foreign.MemorySegment importedASTFile_ptr() {return this.ptr.asSlice(OFFSET$importedASTFile, LAYOUT$importedASTFile);}

	public java.lang.foreign.MemorySegment startedTranslationUnit() {return this.ptr.get(LAYOUT$startedTranslationUnit, OFFSET$startedTranslationUnit);}
	public void startedTranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$startedTranslationUnit, OFFSET$startedTranslationUnit, value);}
	public java.lang.foreign.MemorySegment startedTranslationUnit_ptr() {return this.ptr.asSlice(OFFSET$startedTranslationUnit, LAYOUT$startedTranslationUnit);}

	public java.lang.foreign.MemorySegment indexDeclaration() {return this.ptr.get(LAYOUT$indexDeclaration, OFFSET$indexDeclaration);}
	public void indexDeclaration(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$indexDeclaration, OFFSET$indexDeclaration, value);}
	public java.lang.foreign.MemorySegment indexDeclaration_ptr() {return this.ptr.asSlice(OFFSET$indexDeclaration, LAYOUT$indexDeclaration);}

	public java.lang.foreign.MemorySegment indexEntityReference() {return this.ptr.get(LAYOUT$indexEntityReference, OFFSET$indexEntityReference);}
	public void indexEntityReference(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$indexEntityReference, OFFSET$indexEntityReference, value);}
	public java.lang.foreign.MemorySegment indexEntityReference_ptr() {return this.ptr.asSlice(OFFSET$indexEntityReference, LAYOUT$indexEntityReference);}
}
