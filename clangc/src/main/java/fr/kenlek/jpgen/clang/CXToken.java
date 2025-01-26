package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32;

public record CXToken(MemorySegment ptr)
{
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
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXToken other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment int_data() {return this.ptr().asSlice(OFFSET__int_data, ARRAY_4__INT_32);}
    public int int_data(long index) {return this.int_data().getAtIndex(JAVA_INT, index);}
    public void int_data(long index, int value) {this.int_data().setAtIndex(JAVA_INT, index, value);}

    public MemorySegment ptr_data() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__ptr_data);}
    public void ptr_data(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__ptr_data, value);}
    public MemorySegment $ptr_data() {return this.ptr().asSlice(OFFSET__ptr_data, UNBOUNDED_POINTER);}
}
