package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXType(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        ARRAY_2__POINTER.withName("data")
    ).withName("CXType");
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXType
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXType(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXType> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXType::new);
    }

    public static Buffer<CXType> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXType::new);
    }

    public static CXType getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXType(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXType value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXType other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET_kind, JAVA_INT);
    }

    public Buffer<MemorySegment> data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET_data, ARRAY_2__POINTER));
    }
}
