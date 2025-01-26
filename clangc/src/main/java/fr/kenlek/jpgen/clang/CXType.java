package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;

public record CXType(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
            JAVA_INT.withName("kind"),
            ARRAY_2__POINTER.withName("data")
    ).withName("CXType");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXType(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXType getAtIndex(MemorySegment buffer, long index)
    {
        return new CXType(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXType value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXType other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public int kind() {return this.ptr().get(JAVA_INT, OFFSET__kind);}
    public void kind(int value) {this.ptr().set(JAVA_INT, OFFSET__kind, value);}
    public MemorySegment $kind() {return this.ptr().asSlice(OFFSET__kind, JAVA_INT);}

    public MemorySegment data() {return this.ptr().asSlice(OFFSET__data, ARRAY_2__POINTER);}
    public MemorySegment data(long index) {return this.data().getAtIndex(UNBOUNDED_POINTER, index);}
    public void data(long index, MemorySegment value) {this.data().setAtIndex(UNBOUNDED_POINTER, index, value);}
}
