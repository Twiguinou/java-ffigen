package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64;

@Layout.Container("LAYOUT")
public record CXFileUniqueID(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_3__INT_64.withName("data")
    ).withName("CXFileUniqueID");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXFileUniqueID
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXFileUniqueID(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXFileUniqueID> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXFileUniqueID::new);
    }

    public static Buffer<CXFileUniqueID> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXFileUniqueID::new);
    }

    public static CXFileUniqueID getAtIndex(MemorySegment buffer, long index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXFileUniqueID value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXFileUniqueID other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<Long> data()
    {
        return Buffer.longs(this.pointer().asSlice(OFFSET__data, ARRAY_3__INT_64));
    }

    public void data(Consumer<Buffer<Long>> consumer)
    {
        consumer.accept(this.data());
    }
}
