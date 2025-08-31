package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXString(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("private_flags")
    ).withName("CXString");
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET__private_flags = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("private_flags"));

    public CXString
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXString(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXString> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXString::new);
    }

    public static Buffer<CXString> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXString::new);
    }

    public static CXString getAtIndex(MemorySegment buffer, long index)
    {
        return new CXString(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXString value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXString other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data()
    {
        return this.pointer().get(ADDRESS, OFFSET__data);
    }

    public void data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__data, value);
    }

    public MemorySegment $data()
    {
        return this.pointer().asSlice(OFFSET__data, ADDRESS);
    }

    public int private_flags()
    {
        return this.pointer().get(JAVA_INT, OFFSET__private_flags);
    }

    public void private_flags(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__private_flags, value);
    }

    public MemorySegment $private_flags()
    {
        return this.pointer().asSlice(OFFSET__private_flags, JAVA_INT);
    }
}
