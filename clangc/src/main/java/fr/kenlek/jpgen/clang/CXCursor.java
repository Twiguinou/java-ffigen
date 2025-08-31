package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER;

@Layout.Container("LAYOUT")
public record CXCursor(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("xdata"),
        ARRAY_3__POINTER.withName("data")
    ).withName("CXCursor");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__xdata = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("xdata"));
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXCursor
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static CXCursor getAtIndex(MemorySegment buffer, long index)
    {
        return new CXCursor(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXCursor value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursor other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET__kind, JAVA_INT);
    }

    public int xdata()
    {
        return this.pointer().get(JAVA_INT, OFFSET__xdata);
    }

    public void xdata(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__xdata, value);
    }

    public MemorySegment $xdata()
    {
        return this.pointer().asSlice(OFFSET__xdata, JAVA_INT);
    }

    public Buffer<MemorySegment> data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET__data, ARRAY_3__POINTER));
    }

    public void data(Consumer<Buffer<MemorySegment>> consumer)
    {
        consumer.accept(this.data());
    }
}
