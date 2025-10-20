package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXToken(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_4__INT_32.withName("int_data"),
        ADDRESS.withName("ptr_data")
    ).withName("CXToken");
    public static final long OFFSET_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));
    public static final long OFFSET_ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));

    public CXToken
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
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

    public static CXToken getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXToken(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXToken value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXToken other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<Integer> int_data()
    {
        return Buffer.ints(this.pointer().asSlice(OFFSET_int_data, ARRAY_4__INT_32));
    }

    public MemorySegment ptr_data()
    {
        return this.pointer().get(ADDRESS, OFFSET_ptr_data);
    }

    public void ptr_data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_ptr_data, value);
    }

    public MemorySegment $ptr_data()
    {
        return this.pointer().asSlice(OFFSET_ptr_data, ADDRESS);
    }
}
