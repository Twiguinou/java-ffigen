package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32;

public record CXToken(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_4__INT_32.withName("int_data"),
        UNBOUNDED_POINTER.withName("ptr_data")
    ).withName("CXToken");
    public static final long OFFSET__int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));

    public CXToken(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment int_data()
    {
        return this.pointer().asSlice(OFFSET__int_data, ARRAY_4__INT_32);
    }

    public int int_data(long index)
    {
        return this.int_data().getAtIndex(JAVA_INT, index);
    }

    public void int_data(long index, int value)
    {
        this.int_data().setAtIndex(JAVA_INT, index, value);
    }

    public MemorySegment ptr_data()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__ptr_data);
    }

    public void ptr_data(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__ptr_data, value);
    }

    public MemorySegment $ptr_data()
    {
        return this.pointer().asSlice(OFFSET__ptr_data, UNBOUNDED_POINTER);
    }
}
