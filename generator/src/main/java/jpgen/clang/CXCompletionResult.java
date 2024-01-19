package jpgen.clang;

public record CXCompletionResult(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$CursorKind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$CursorKind = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$CompletionString = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$CompletionString = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$CursorKind,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$CompletionString
	).withName("CXCompletionResult");

	public CXCompletionResult(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int CursorKind() {return this.ptr.get(LAYOUT$CursorKind, OFFSET$CursorKind);}
	public void CursorKind(int value) {this.ptr.set(LAYOUT$CursorKind, OFFSET$CursorKind, value);}
	public java.lang.foreign.MemorySegment CursorKind_ptr() {return this.ptr.asSlice(OFFSET$CursorKind, LAYOUT$CursorKind);}

	public java.lang.foreign.MemorySegment CompletionString() {return this.ptr.get(LAYOUT$CompletionString, OFFSET$CompletionString);}
	public void CompletionString(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$CompletionString, OFFSET$CompletionString, value);}
	public java.lang.foreign.MemorySegment CompletionString_ptr() {return this.ptr.asSlice(OFFSET$CompletionString, LAYOUT$CompletionString);}
}
