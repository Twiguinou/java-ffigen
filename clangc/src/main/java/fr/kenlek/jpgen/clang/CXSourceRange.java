package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXSourceRange(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("begin_int_data"),
        JAVA_INT.withName("end_int_data")
    ).withName("CXSourceRange");
    public static final long OFFSET_ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET_begin_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("begin_int_data"));
    public static final long OFFSET_end_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("end_int_data"));

    public CXSourceRange
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXSourceRange(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXSourceRange> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXSourceRange::new);
    }

    public static Buffer<CXSourceRange> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXSourceRange::new);
    }

    public static CXSourceRange getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXSourceRange(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXSourceRange value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceRange other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<MemorySegment> ptr_data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET_ptr_data, ARRAY_2__POINTER));
    }

    public int begin_int_data()
    {
        return this.pointer().get(JAVA_INT, OFFSET_begin_int_data);
    }

    public void begin_int_data(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_begin_int_data, value);
    }

    public MemorySegment $begin_int_data()
    {
        return this.pointer().asSlice(OFFSET_begin_int_data, JAVA_INT);
    }

    public int end_int_data()
    {
        return this.pointer().get(JAVA_INT, OFFSET_end_int_data);
    }

    public void end_int_data(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_end_int_data, value);
    }

    public MemorySegment $end_int_data()
    {
        return this.pointer().asSlice(OFFSET_end_int_data, JAVA_INT);
    }
}
