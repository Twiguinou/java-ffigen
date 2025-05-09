package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXStringSet(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("Strings"),
        JAVA_INT.withName("Count")
    ).withName("CXStringSet");
    public static final long OFFSET__Strings = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Strings"));
    public static final long OFFSET__Count = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Count"));

    public CXStringSet(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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

    public MemorySegment Strings()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Strings);
    }

    public void Strings(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Strings, value);
    }

    public MemorySegment $Strings()
    {
        return this.pointer().asSlice(OFFSET__Strings, UNBOUNDED_POINTER);
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
