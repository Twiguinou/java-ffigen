/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCompletionResult(java.lang.foreign.MemorySegment ptr)
{
    public CXCompletionResult(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout));
    }

    public static CXCompletionResult getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCompletionResult(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCompletionResult value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout.byteSize());
    }

    public void copyFrom(CXCompletionResult other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__CursorKind = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.state(0).byteOffset();
    public int CursorKind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__CursorKind);}
    public void CursorKind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__CursorKind, value);}
    public java.lang.foreign.MemorySegment $CursorKind() {return this.ptr.asSlice(MEMBER_OFFSET__CursorKind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__CompletionString = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult.state(1).byteOffset();
    public java.lang.foreign.MemorySegment CompletionString() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__CompletionString);}
    public void CompletionString(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__CompletionString, value);}
    public java.lang.foreign.MemorySegment $CompletionString() {return this.ptr.asSlice(MEMBER_OFFSET__CompletionString, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
