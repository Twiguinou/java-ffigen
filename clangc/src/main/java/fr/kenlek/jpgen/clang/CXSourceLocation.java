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
public record CXSourceLocation(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ARRAY_2__POINTER.withName("ptr_data"),
        JAVA_INT.withName("int_data")
    ).withName("CXSourceLocation");
    public static final long OFFSET__ptr_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    public static final long OFFSET__int_data = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));

    public CXSourceLocation
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXSourceLocation(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXSourceLocation> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXSourceLocation::new);
    }

    public static Buffer<CXSourceLocation> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXSourceLocation::new);
    }

    public static CXSourceLocation getAtIndex(MemorySegment buffer, long index)
    {
        return new CXSourceLocation(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXSourceLocation value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceLocation other)
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
