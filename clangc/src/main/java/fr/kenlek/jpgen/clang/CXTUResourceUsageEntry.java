package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.types.CUnsignedLong;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXTUResourceUsageEntry(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        CUnsignedLong.LAYOUT.withName("amount")
    ).withName("CXTUResourceUsageEntry");
    public static final long OFFSET__kind = LAYOUT.byteOffset(PathElement.groupElement("kind"));
    public static final long OFFSET__amount = LAYOUT.byteOffset(PathElement.groupElement("amount"));

    public CXTUResourceUsageEntry
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    static CXTUResourceUsageEntry getAtIndex(MemorySegment buffer, long index)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long index, CXTUResourceUsageEntry value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXTUResourceUsageEntry other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET__kind, JAVA_INT);
    }

    public MemorySegment $amount()
    {
        return this.pointer().asSlice(OFFSET__amount, CUnsignedLong.LAYOUT);
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
