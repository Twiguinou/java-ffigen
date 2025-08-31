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
import static fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER;

@Layout.Container("LAYOUT")
public record CXIdxLoc(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("int_data")
    ).withName("CXIdxLoc");
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET__int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));

    public CXIdxLoc
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxLoc(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxLoc> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxLoc::new);
    }

    public static Buffer<CXIdxLoc> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxLoc::new);
    }

    public static CXIdxLoc getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxLoc(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxLoc value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxLoc other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<MemorySegment> ptr_data()
    {
        return Buffer.addresses(this.pointer().asSlice(OFFSET__ptr_data, ARRAY_2__POINTER));
    }

    public void ptr_data(Consumer<Buffer<MemorySegment>> consumer)
    {
        consumer.accept(this.ptr_data());
    }

    public int int_data()
    {
        return this.pointer().get(JAVA_INT, OFFSET__int_data);
    }

    public void int_data(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__int_data, value);
    }

    public MemorySegment $int_data()
    {
        return this.pointer().asSlice(OFFSET__int_data, JAVA_INT);
    }
}
