package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXCodeCompleteResults(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("Results"),
        JAVA_INT.withName("NumResults")
    ).withName("CXCodeCompleteResults");
    public static final long OFFSET__Results = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Results"));
    public static final long OFFSET__NumResults = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("NumResults"));

    public CXCodeCompleteResults(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment Results()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Results);
    }

    public void Results(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Results, value);
    }

    public MemorySegment $Results()
    {
        return this.pointer().asSlice(OFFSET__Results, UNBOUNDED_POINTER);
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
