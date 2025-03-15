package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXStringSet(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("Strings"),
        JAVA_INT.withName("Count")
    ).withName("CXStringSet");
    public static final long OFFSET__Strings = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Strings"));
    public static final long OFFSET__Count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Count"));

    public CXStringSet(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXStringSet getAtIndex(MemorySegment buffer, long index)
    {
        return new CXStringSet(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXStringSet value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXStringSet other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment Strings()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__Strings);
    }

    public void Strings(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__Strings, value);
    }

    public MemorySegment $Strings()
    {
        return this.ptr().asSlice(OFFSET__Strings, UNBOUNDED_POINTER);
    }

    public int Count()
    {
        return this.ptr().get(JAVA_INT, OFFSET__Count);
    }

    public void Count(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__Count, value);
    }

    public MemorySegment $Count()
    {
        return this.ptr().asSlice(OFFSET__Count, JAVA_INT);
    }
}
