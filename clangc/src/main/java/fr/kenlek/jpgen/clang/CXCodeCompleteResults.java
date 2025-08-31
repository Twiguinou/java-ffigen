package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;

@Layout.Container("LAYOUT")
public record CXCodeCompleteResults(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Results"),
        JAVA_INT.withName("NumResults")
    ).withName("CXCodeCompleteResults");
    public static final long OFFSET__Results = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Results"));
    public static final long OFFSET__NumResults = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("NumResults"));

    public CXCodeCompleteResults
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXCodeCompleteResults(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXCodeCompleteResults> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXCodeCompleteResults::new);
    }

    public static Buffer<CXCodeCompleteResults> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXCodeCompleteResults::new);
    }

    public static CXCodeCompleteResults getAtIndex(MemorySegment buffer, long index)
    {
        return new CXCodeCompleteResults(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXCodeCompleteResults value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCodeCompleteResults other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<CXCompletionResult> Results()
    {
        return CXCompletionResult.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.NumResults(), CXCompletionResult.LAYOUT)), OFFSET__Results
        ));
    }

    public void Results(Consumer<Buffer<CXCompletionResult>> consumer)
    {
        consumer.accept(this.Results());
    }

    public void Results(Buffer<CXCompletionResult> value)
    {
        this.pointer().set(ADDRESS, OFFSET__Results, value.pointer());
    }

    public MemorySegment $Results()
    {
        return this.pointer().asSlice(OFFSET__Results, ADDRESS);
    }

    public int NumResults()
    {
        return this.pointer().get(JAVA_INT, OFFSET__NumResults);
    }

    public void NumResults(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__NumResults, value);
    }

    public MemorySegment $NumResults()
    {
        return this.pointer().asSlice(OFFSET__NumResults, JAVA_INT);
    }
}
