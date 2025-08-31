package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32;

@Layout.Container("LAYOUT")
public record CXToken(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_4__INT_32.withName("int_data"),
        ADDRESS.withName("ptr_data")
    ).withName("CXToken");
    public static final long OFFSET__int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));

    public CXToken
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXToken(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXToken> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXToken::new);
    }

    public static Buffer<CXToken> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXToken::new);
    }

    public static CXToken getAtIndex(MemorySegment buffer, long index)
    {
        return new CXToken(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXToken value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXToken other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<Integer> int_data()
    {
        return Buffer.ints(this.pointer().asSlice(OFFSET__int_data, ARRAY_4__INT_32));
    }

    public void int_data(Consumer<Buffer<Integer>> consumer)
    {
        consumer.accept(this.int_data());
    }

    public MemorySegment ptr_data()
    {
        return this.pointer().get(ADDRESS, OFFSET__ptr_data);
    }

    public void ptr_data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__ptr_data, value);
    }

    public MemorySegment $ptr_data()
    {
        return this.pointer().asSlice(OFFSET__ptr_data, ADDRESS);
    }
}
