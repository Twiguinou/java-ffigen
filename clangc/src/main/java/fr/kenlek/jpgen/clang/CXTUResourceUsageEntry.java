package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXTUResourceUsageEntry(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        CUnsignedLong.LAYOUT.withName("amount")
    ).withName("CXTUResourceUsageEntry");
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET_amount = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("amount"));

    public CXTUResourceUsageEntry
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXTUResourceUsageEntry(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXTUResourceUsageEntry> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXTUResourceUsageEntry::new);
    }

    public static Buffer<CXTUResourceUsageEntry> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXTUResourceUsageEntry::new);
    }

    static CXTUResourceUsageEntry getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long offset, long index, CXTUResourceUsageEntry value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXTUResourceUsageEntry other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET_kind, JAVA_INT);
    }

    public MemorySegment $amount()
    {
        return this.pointer().asSlice(OFFSET_amount, CUnsignedLong.LAYOUT);
    }

    public CUnsignedLong amount()
    {
        return CUnsignedLong.wrap(this.$amount());
    }

    public void amount(CUnsignedLong value)
    {
        value.unwrap(this.$amount());
    }
}
