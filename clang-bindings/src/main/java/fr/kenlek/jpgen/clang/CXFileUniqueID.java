package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64;

public record CXFileUniqueID(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
            ARRAY_3__INT_64.withName("data")
    ).withName("CXFileUniqueID");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXFileUniqueID(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXFileUniqueID getAtIndex(MemorySegment buffer, long index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXFileUniqueID value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXFileUniqueID other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data() {return this.ptr().asSlice(OFFSET__data, ARRAY_3__INT_64);}
    public long data(long index) {return this.data().getAtIndex(JAVA_LONG, index);}
    public void data(long index, long value) {this.data().setAtIndex(JAVA_LONG, index, value);}
}
