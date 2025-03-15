package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;

public record CXSourceRange(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("begin_int_data"),
        JAVA_INT.withName("end_int_data")
    ).withName("CXSourceRange");
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET__begin_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("begin_int_data"));
    public static final long OFFSET__end_int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("end_int_data"));

    public CXSourceRange(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXSourceRange getAtIndex(MemorySegment buffer, long index)
    {
        return new CXSourceRange(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXSourceRange value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceRange other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment ptr_data()
    {
        return this.ptr().asSlice(OFFSET__ptr_data, ARRAY_2__POINTER);
    }

    public MemorySegment ptr_data(long index)
    {
        return this.ptr_data().getAtIndex(UNBOUNDED_POINTER, index);
    }

    public void ptr_data(long index, MemorySegment value)
    {
        this.ptr_data().setAtIndex(UNBOUNDED_POINTER, index, value);
    }

    public int begin_int_data()
    {
        return this.ptr().get(JAVA_INT, OFFSET__begin_int_data);
    }

    public void begin_int_data(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__begin_int_data, value);
    }

    public MemorySegment $begin_int_data()
    {
        return this.ptr().asSlice(OFFSET__begin_int_data, JAVA_INT);
    }

    public int end_int_data()
    {
        return this.ptr().get(JAVA_INT, OFFSET__end_int_data);
    }

    public void end_int_data(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__end_int_data, value);
    }

    public MemorySegment $end_int_data()
    {
        return this.ptr().asSlice(OFFSET__end_int_data, JAVA_INT);
    }
}
