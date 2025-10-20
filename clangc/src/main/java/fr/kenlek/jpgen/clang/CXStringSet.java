package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXStringSet(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Strings"),
        JAVA_INT.withName("Count")
    ).withName("CXStringSet");
    public static final long OFFSET_Strings = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Strings"));
    public static final long OFFSET_Count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Count"));

    public CXStringSet
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
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

    public static CXStringSet getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXStringSet(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXStringSet value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXStringSet other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<CXString> Strings()
    {
        return CXString.buffer(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.Count(), CXString.LAYOUT)), OFFSET_Strings
        ));
    }

    public void Strings(Buffer<CXString> value)
    {
        this.pointer().set(ADDRESS, OFFSET_Strings, value.pointer());
    }

    public MemorySegment $Strings()
    {
        return this.pointer().asSlice(OFFSET_Strings, ADDRESS);
    }

    public int Count()
    {
        return this.pointer().get(JAVA_INT, OFFSET_Count);
    }

    public void Count(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_Count, value);
    }

    public MemorySegment $Count()
    {
        return this.pointer().asSlice(OFFSET_Count, JAVA_INT);
    }
}
