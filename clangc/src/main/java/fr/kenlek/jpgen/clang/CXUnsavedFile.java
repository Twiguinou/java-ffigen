package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.types.CUnsignedLong;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

@Layout.Container("LAYOUT")
public record CXUnsavedFile(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Filename"),
        ADDRESS.withName("Contents"),
        CUnsignedLong.LAYOUT.withName("Length")
    ).withName("CXUnsavedFile");
    public static final long OFFSET__Filename = LAYOUT.byteOffset(PathElement.groupElement("Filename"));
    public static final long OFFSET__Contents = LAYOUT.byteOffset(PathElement.groupElement("Contents"));
    public static final long OFFSET__Length = LAYOUT.byteOffset(PathElement.groupElement("Length"));

    public CXUnsavedFile
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXUnsavedFile(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXUnsavedFile> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXUnsavedFile::new);
    }

    public static Buffer<CXUnsavedFile> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXUnsavedFile::new);
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
        this.pointer().set(ADDRESS, OFFSET__Filename, value);
    }

    public MemorySegment $Filename()
    {
        return this.pointer().asSlice(OFFSET__Filename, ADDRESS);
    }

    public MemorySegment Contents()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Contents);
    }

    public void Contents(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__Contents, value);
    }

    public MemorySegment $Contents()
    {
        return this.pointer().asSlice(OFFSET__Contents, ADDRESS);
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
