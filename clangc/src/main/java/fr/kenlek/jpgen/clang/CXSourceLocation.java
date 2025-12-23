package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXSourceLocation(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("int_data")
    ).withName("CXSourceLocation");
    public static final long OFFSET_ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));

    public CXSourceLocation
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXSourceLocation(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXSourceLocation> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXSourceLocation::new);
    }

    public static Buffer<CXSourceLocation> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXSourceLocation::new);
    }

    public static CXSourceLocation getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXSourceLocation(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXSourceLocation value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceLocation other)
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
