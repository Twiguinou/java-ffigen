package fr.kenlek.jpgen.clang;

public record CXCompletionResult(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__CursorKind = java.lang.foreign.ValueLayout.JAVA_INT.withName("CursorKind");
    public static final long OFFSET__CursorKind = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__CompletionString = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("CompletionString");
    public static final long OFFSET__CompletionString = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__CursorKind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__CompletionString
    ).withByteAlignment(8).withName("CXCompletionResult");

    public CXCompletionResult(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXCompletionResult getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXCompletionResult(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXCompletionResult value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int CursorKind() {return this.ptr.get(LAYOUT__CursorKind, OFFSET__CursorKind);}
    public void CursorKind(int value) {this.ptr.set(LAYOUT__CursorKind, OFFSET__CursorKind, value);}
    public java.lang.foreign.MemorySegment $CursorKind() {return this.ptr.asSlice(OFFSET__CursorKind, LAYOUT__CursorKind);}

    public java.lang.foreign.MemorySegment CompletionString() {return this.ptr.get(LAYOUT__CompletionString, OFFSET__CompletionString);}
    public void CompletionString(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__CompletionString, OFFSET__CompletionString, value);}
    public java.lang.foreign.MemorySegment $CompletionString() {return this.ptr.asSlice(OFFSET__CompletionString, LAYOUT__CompletionString);}
}
