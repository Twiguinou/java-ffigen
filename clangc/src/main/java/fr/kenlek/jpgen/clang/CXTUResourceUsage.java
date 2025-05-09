package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXTUResourceUsage(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("data"),
        JAVA_INT.withName("numEntries"),
        UNBOUNDED_POINTER.withName("entries")
    ).withName("CXTUResourceUsage");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET__numEntries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numEntries"));
    public static final long OFFSET__entries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("entries"));

    public CXTUResourceUsage(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXTUResourceUsage getAtIndex(MemorySegment buffer, long index)
    {
        return new CXTUResourceUsage(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXTUResourceUsage value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXTUResourceUsage other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__data);
    }

    public void data(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__data, value);
    }

    public MemorySegment $data()
    {
        return this.pointer().asSlice(OFFSET__data, UNBOUNDED_POINTER);
    }

    public int numEntries()
    {
        return this.pointer().get(JAVA_INT, OFFSET__numEntries);
    }

    public void numEntries(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__numEntries, value);
    }

    public MemorySegment $numEntries()
    {
        return this.pointer().asSlice(OFFSET__numEntries, JAVA_INT);
    }

    public MemorySegment entries()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__entries);
    }

    public void entries(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__entries, value);
    }

    public MemorySegment $entries()
    {
        return this.pointer().asSlice(OFFSET__entries, UNBOUNDED_POINTER);
    }
}
