package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;

@Layout.Container("LAYOUT")
public record CXStringSet(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Strings"),
        JAVA_INT.withName("Count")
    ).withName("CXStringSet");
    public static final long OFFSET__Strings = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Strings"));
    public static final long OFFSET__Count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Count"));

    public CXStringSet
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXStringSet(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXStringSet> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXStringSet::new);
    }

    public static Buffer<CXStringSet> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXStringSet::new);
    }

    public static CXStringSet getAtIndex(MemorySegment buffer, long index)
    {
        return new CXStringSet(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXStringSet value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXStringSet other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<CXString> Strings()
    {
        return CXString.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.Count(), CXString.LAYOUT)), OFFSET__Strings
        ));
    }

    public void Strings(Consumer<Buffer<CXString>> consumer)
    {
        consumer.accept(this.Strings());
    }

    public void Strings(Buffer<CXString> value)
    {
        this.pointer().set(ADDRESS, OFFSET__Strings, value.pointer());
    }

    public MemorySegment $Strings()
    {
        return this.pointer().asSlice(OFFSET__Strings, ADDRESS);
    }

    public int Count()
    {
        return this.pointer().get(JAVA_INT, OFFSET__Count);
    }

    public void Count(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__Count, value);
    }

    public MemorySegment $Count()
    {
        return this.pointer().asSlice(OFFSET__Count, JAVA_INT);
    }
}
