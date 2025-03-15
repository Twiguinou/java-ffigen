package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXString(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("data"),
        JAVA_INT.withName("private_flags")
    ).withName("CXString");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET__private_flags = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("private_flags"));

    public CXString(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXString getAtIndex(MemorySegment buffer, long index)
    {
        return new CXString(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXString value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXString other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__data);
    }

    public void data(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__data, value);
    }

    public MemorySegment $data()
    {
        return this.ptr().asSlice(OFFSET__data, UNBOUNDED_POINTER);
    }

    public int private_flags()
    {
        return this.ptr().get(JAVA_INT, OFFSET__private_flags);
    }

    public void private_flags(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__private_flags, value);
    }

    public MemorySegment $private_flags()
    {
        return this.ptr().asSlice(OFFSET__private_flags, JAVA_INT);
    }
}
