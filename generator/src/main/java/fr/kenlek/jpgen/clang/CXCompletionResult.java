/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCompletionResult(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("CursorKind"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("CompletionString")
    ).withByteAlignment(8);

    public CXCompletionResult(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCompletionResult getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCompletionResult(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCompletionResult value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCompletionResult other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__CursorKind = ((0 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int CursorKind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__CursorKind);}
    public void CursorKind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__CursorKind, value);}
    public java.lang.foreign.MemorySegment $CursorKind() {return this.ptr.asSlice(MEMBER_OFFSET__CursorKind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__CompletionString = ((8 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment CompletionString() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__CompletionString);}
    public void CompletionString(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__CompletionString, value);}
    public java.lang.foreign.MemorySegment $CompletionString() {return this.ptr.asSlice(MEMBER_OFFSET__CompletionString, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
