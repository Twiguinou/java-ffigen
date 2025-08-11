package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.types.CUnsignedLong;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.PathElement;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXUnsavedFile(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("Filename"),
        UNBOUNDED_POINTER.withName("Contents"),
        CUnsignedLong.LAYOUT.withName("Length")
    ).withName("CXUnsavedFile");
    public static final long OFFSET__Filename = LAYOUT.byteOffset(PathElement.groupElement("Filename"));
    public static final long OFFSET__Contents = LAYOUT.byteOffset(PathElement.groupElement("Contents"));
    public static final long OFFSET__Length = LAYOUT.byteOffset(PathElement.groupElement("Length"));

    public CXUnsavedFile(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    static CXUnsavedFile getAtIndex(MemorySegment buffer, long index)
    {
        return new CXUnsavedFile(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long index, CXUnsavedFile value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXUnsavedFile other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment Filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Filename);
    }

    public void Filename(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Filename, value);
    }

    public MemorySegment $Filename()
    {
        return this.pointer().asSlice(OFFSET__Filename, UNBOUNDED_POINTER);
    }

    public MemorySegment Contents()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Contents);
    }

    public void Contents(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Contents, value);
    }

    public MemorySegment $Contents()
    {
        return this.pointer().asSlice(OFFSET__Contents, UNBOUNDED_POINTER);
    }

    public MemorySegment $Length()
    {
        return this.pointer().asSlice(OFFSET__Length, CUnsignedLong.LAYOUT);
    }

    public CUnsignedLong Length()
    {
        return CUnsignedLong.wrap(this.$Length());
    }

    public void Length(CUnsignedLong value)
    {
        value.unwrap(this.$Length());
    }
}
