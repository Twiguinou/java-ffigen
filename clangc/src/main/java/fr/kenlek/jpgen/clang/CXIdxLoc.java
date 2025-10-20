package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXIdxLoc(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("int_data")
    ).withName("CXIdxLoc");
    public static final long OFFSET_ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));

    public CXIdxLoc
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxLoc(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxLoc> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxLoc::new);
    }

    public static Buffer<CXIdxLoc> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxLoc::new);
    }

    public static CXIdxLoc getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxLoc(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxLoc value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxLoc other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<MemorySegment> ptr_data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET_ptr_data, ARRAY_2__POINTER));
    }

    public int int_data()
    {
        return this.pointer().get(JAVA_INT, OFFSET_int_data);
    }

    public void int_data(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_int_data, value);
    }

    public MemorySegment $int_data()
    {
        return this.pointer().asSlice(OFFSET_int_data, JAVA_INT);
    }
}
