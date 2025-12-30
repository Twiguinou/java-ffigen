package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXCodeCompleteResults(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Results"),
        JAVA_INT.withName("NumResults")
    ).withName("CXCodeCompleteResults");
    public static final long OFFSET_Results = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Results"));
    public static final long OFFSET_NumResults = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("NumResults"));

    public CXCodeCompleteResults
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXCodeCompleteResults(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXCodeCompleteResults> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXCodeCompleteResults::new);
    }

    public static Buffer<CXCodeCompleteResults> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXCodeCompleteResults::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXCodeCompleteResults other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<CXCompletionResult> Results()
    {
        return CXCompletionResult.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.NumResults(), CXCompletionResult.LAYOUT)), OFFSET_Results
        ));
    }

    public void Results(Buffer<CXCompletionResult> value)
    {
        this.pointer().set(ADDRESS, OFFSET_Results, value.pointer());
    }

    public MemorySegment $Results()
    {
        return this.pointer().asSlice(OFFSET_Results, ADDRESS);
    }

    public int NumResults()
    {
        return this.pointer().get(JAVA_INT, OFFSET_NumResults);
    }

    public void NumResults(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_NumResults, value);
    }

    public MemorySegment $NumResults()
    {
        return this.pointer().asSlice(OFFSET_NumResults, JAVA_INT);
    }
}
