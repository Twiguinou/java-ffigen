package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER;

public record CXCursor(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("xdata"),
        ARRAY_3__POINTER.withName("data")
    ).withName("CXCursor");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__xdata = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("xdata"));
    public static final long OFFSET__data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("data"));

    public CXCursor(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment data()
    {
        return this.pointer.asSlice(OFFSET__data, ARRAY_3__POINTER);
    }

    public MemorySegment data(long index)
    {
        return this.data().getAtIndex(UNBOUNDED_POINTER, index);
    }

    public void data(long index, MemorySegment value)
    {
        this.data().setAtIndex(UNBOUNDED_POINTER, index, value);
    }
}
