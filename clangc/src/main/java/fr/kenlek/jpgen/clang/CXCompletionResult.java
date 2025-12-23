package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXCompletionResult(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("CursorKind"),
        ADDRESS.withName("CompletionString")
    ).withName("CXCompletionResult");
    public static final long OFFSET_CursorKind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("CursorKind"));
    public static final long OFFSET_CompletionString = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("CompletionString"));

    public CXCompletionResult
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXCompletionResult(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXCompletionResult> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXCompletionResult::new);
    }

    public static Buffer<CXCompletionResult> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXCompletionResult::new);
    }

    public static CXCompletionResult getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXCompletionResult(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXCompletionResult value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXCompletionResult other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int CursorKind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_CursorKind);
    }

    public void CursorKind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_CursorKind, value);
    }

    public MemorySegment $CursorKind()
    {
        return this.pointer().asSlice(OFFSET_CursorKind, JAVA_INT);
    }

    public MemorySegment CompletionString()
    {
        return this.pointer().get(ADDRESS, OFFSET_CompletionString);
    }

    public void CompletionString(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_CompletionString, value);
    }

    public MemorySegment $CompletionString()
    {
        return this.pointer().asSlice(OFFSET_CompletionString, ADDRESS);
    }
}
