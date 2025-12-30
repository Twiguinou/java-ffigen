package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXTUResourceUsage(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("numEntries"),
        ADDRESS.withName("entries")
    ).withName("CXTUResourceUsage");
    public static final long OFFSET_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET_numEntries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numEntries"));
    public static final long OFFSET_entries = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("entries"));

    public CXTUResourceUsage
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXTUResourceUsage(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXTUResourceUsage> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXTUResourceUsage::new);
    }

    public static Buffer<CXTUResourceUsage> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXTUResourceUsage::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXTUResourceUsage other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data()
    {
        return this.pointer().get(ADDRESS, OFFSET_data);
    }

    public void data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_data, value);
    }

    public MemorySegment $data()
    {
        return this.pointer().asSlice(OFFSET_data, ADDRESS);
    }

    public int numEntries()
    {
        return this.pointer().get(JAVA_INT, OFFSET_numEntries);
    }

    public void numEntries(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_numEntries, value);
    }

    public MemorySegment $numEntries()
    {
        return this.pointer().asSlice(OFFSET_numEntries, JAVA_INT);
    }

    public Buffer<CXTUResourceUsageEntry> entries()
    {
        return CXTUResourceUsageEntry.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numEntries(), CXTUResourceUsageEntry.LAYOUT)), OFFSET_entries
        ));
    }

    public void entries(Buffer<CXTUResourceUsageEntry> value)
    {
        this.pointer().set(ADDRESS, OFFSET_entries, value.pointer());
    }

    public MemorySegment $entries()
    {
        return this.pointer().asSlice(OFFSET_entries, ADDRESS);
    }
}
