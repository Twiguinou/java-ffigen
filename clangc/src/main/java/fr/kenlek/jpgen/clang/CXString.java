package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXString(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("private_flags")
    ).withName("CXString");
    public static final long OFFSET_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    public static final long OFFSET_private_flags = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("private_flags"));

    public CXString
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
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

    public static CXString getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXString(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXString value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXString other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment data()
    {
        return this.pointer().get(ADDRESS, OFFSET_data);
    }

    public void data(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_data, value);
    }

    public MemorySegment $data()
    {
        return this.pointer().asSlice(OFFSET_data, ADDRESS);
    }

    public int private_flags()
    {
        return this.pointer().get(JAVA_INT, OFFSET_private_flags);
    }

    public void private_flags(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_private_flags, value);
    }

    public MemorySegment $private_flags()
    {
        return this.pointer().asSlice(OFFSET_private_flags, JAVA_INT);
    }
}
