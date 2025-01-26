package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;

public record CXCompletionResult(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
            JAVA_INT.withName("CursorKind"),
            UNBOUNDED_POINTER.withName("CompletionString")
    ).withName("CXCompletionResult");
    public static final long OFFSET__CursorKind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("CursorKind"));
    public static final long OFFSET__CompletionString = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("CompletionString"));

    public CXCompletionResult(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCompletionResult getAtIndex(MemorySegment buffer, long index)
    {
        return new CXCompletionResult(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXCompletionResult value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCompletionResult other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public int CursorKind() {return this.ptr().get(JAVA_INT, OFFSET__CursorKind);}
    public void CursorKind(int value) {this.ptr().set(JAVA_INT, OFFSET__CursorKind, value);}
    public MemorySegment $CursorKind() {return this.ptr().asSlice(OFFSET__CursorKind, JAVA_INT);}

    public MemorySegment CompletionString() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__CompletionString);}
    public void CompletionString(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__CompletionString, value);}
    public MemorySegment $CompletionString() {return this.ptr().asSlice(OFFSET__CompletionString, UNBOUNDED_POINTER);}
}
