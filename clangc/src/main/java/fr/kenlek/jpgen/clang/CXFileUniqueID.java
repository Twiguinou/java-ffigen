package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64;

@Layout.Container("LAYOUT")
public record CXFileUniqueID(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_3__INT_64.withName("data")
    ).withName("CXFileUniqueID");
    public static final long OFFSET_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXFileUniqueID
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXFileUniqueID(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXFileUniqueID> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXFileUniqueID::new);
    }

    public static Buffer<CXFileUniqueID> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXFileUniqueID::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXFileUniqueID other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<Long> data()
    {
        return Buffer.longs(this.pointer().asSlice(OFFSET_data, ARRAY_3__INT_64));
    }
}
