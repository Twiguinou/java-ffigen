package jpgen.clang;

public record CXComment(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$ASTNode = java.lang.foreign.ValueLayout.ADDRESS.withName("ASTNode");
	public static final long OFFSET$ASTNode = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$TranslationUnit = java.lang.foreign.ValueLayout.ADDRESS.withName("TranslationUnit");
	public static final long OFFSET$TranslationUnit = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$ASTNode,
			LAYOUT$TranslationUnit
	).withName("CXComment");

	public CXComment(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment ASTNode() {return this.ptr.get(LAYOUT$ASTNode, OFFSET$ASTNode);}
	public void ASTNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ASTNode, OFFSET$ASTNode, value);}
	public java.lang.foreign.MemorySegment ASTNode_ptr() {return this.ptr.asSlice(OFFSET$ASTNode, LAYOUT$ASTNode);}

	public java.lang.foreign.MemorySegment TranslationUnit() {return this.ptr.get(LAYOUT$TranslationUnit, OFFSET$TranslationUnit);}
	public void TranslationUnit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$TranslationUnit, OFFSET$TranslationUnit, value);}
	public java.lang.foreign.MemorySegment TranslationUnit_ptr() {return this.ptr.asSlice(OFFSET$TranslationUnit, LAYOUT$TranslationUnit);}
}
