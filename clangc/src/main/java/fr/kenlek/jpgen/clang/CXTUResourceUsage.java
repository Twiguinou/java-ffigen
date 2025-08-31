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
public record CXTUResourceUsage(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("numEntries"),
        ADDRESS.withName("entries")
    ).withName("CXTUResourceUsage");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET__numEntries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numEntries"));
    public static final long OFFSET__entries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("entries"));

    public CXTUResourceUsage
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXTUResourceUsage(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXTUResourceUsage> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXTUResourceUsage::new);
    }

    public static Buffer<CXTUResourceUsage> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXTUResourceUsage::new);
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
        return this.pointer().get(ADDRESS, OFFSET__data);
    }

    public void data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__data, value);
    }

    public MemorySegment $data()
    {
        return this.pointer().asSlice(OFFSET__data, ADDRESS);
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

    public Buffer<CXTUResourceUsageEntry> entries()
    {
        return CXTUResourceUsageEntry.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numEntries(), CXTUResourceUsageEntry.LAYOUT)), OFFSET__entries
        ));
    }

    public void entries(Consumer<Buffer<CXTUResourceUsageEntry>> consumer)
    {
        consumer.accept(this.entries());
    }

    public void entries(Buffer<CXTUResourceUsageEntry> value)
    {
        this.pointer().set(ADDRESS, OFFSET__entries, value.pointer());
    }

    public MemorySegment $entries()
    {
        return this.pointer().asSlice(OFFSET__entries, ADDRESS);
    }
}
