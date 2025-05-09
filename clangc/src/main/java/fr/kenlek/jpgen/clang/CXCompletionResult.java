package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXCompletionResult(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
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
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCompletionResult other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int CursorKind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__CursorKind);
    }

    public void CursorKind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__CursorKind, value);
    }

    public MemorySegment $CursorKind()
    {
        return this.pointer().asSlice(OFFSET__CursorKind, JAVA_INT);
    }

    public MemorySegment CompletionString()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__CompletionString);
    }

    public void CompletionString(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__CompletionString, value);
    }

    public MemorySegment $CompletionString()
    {
        return this.pointer().asSlice(OFFSET__CompletionString, UNBOUNDED_POINTER);
    }
}
