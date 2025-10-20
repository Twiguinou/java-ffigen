package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXCursor(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("xdata"),
        ARRAY_3__POINTER.withName("data")
    ).withName("CXCursor");
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET_xdata = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("xdata"));
    public static final long OFFSET_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXCursor
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXCursor(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXCursor> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXCursor::new);
    }

    public static Buffer<CXCursor> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXCursor::new);
    }

    public static CXCursor getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXCursor(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXCursor value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursor other)
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

    public int xdata()
    {
        return this.pointer().get(JAVA_INT, OFFSET_xdata);
    }

    public void xdata(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_xdata, value);
    }

    public MemorySegment $xdata()
    {
        return this.pointer().asSlice(OFFSET_xdata, JAVA_INT);
    }

    public Buffer<MemorySegment> data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET_data, ARRAY_3__POINTER));
    }
}
