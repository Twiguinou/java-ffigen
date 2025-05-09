package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;

public record CXSourceLocation(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("int_data")
    ).withName("CXSourceLocation");
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET__int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));

    public CXSourceLocation(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXSourceLocation getAtIndex(MemorySegment buffer, long index)
    {
        return new CXSourceLocation(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXSourceLocation value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceLocation other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment ptr_data()
    {
        return this.pointer().asSlice(OFFSET__ptr_data, ARRAY_2__POINTER);
    }

    public MemorySegment ptr_data(long index)
    {
        return this.ptr_data().getAtIndex(UNBOUNDED_POINTER, index);
    }

    public void ptr_data(long index, MemorySegment value)
    {
        this.ptr_data().setAtIndex(UNBOUNDED_POINTER, index, value);
    }

    public int int_data()
    {
        return this.pointer().get(JAVA_INT, OFFSET__int_data);
    }

    public void int_data(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__int_data, value);
    }

    public MemorySegment $int_data()
    {
        return this.pointer().asSlice(OFFSET__int_data, JAVA_INT);
    }
}
