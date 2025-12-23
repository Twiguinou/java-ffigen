package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static java.lang.foreign.ValueLayout.ADDRESS;

@Layout.Container("LAYOUT")
public record CXUnsavedFile(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("Filename"),
        ADDRESS.withName("Contents"),
        CUnsignedLong.LAYOUT.withName("Length")
    ).withName("CXUnsavedFile");
    public static final long OFFSET_Filename = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Filename"));
    public static final long OFFSET_Contents = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Contents"));
    public static final long OFFSET_Length = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Length"));

    public CXUnsavedFile
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
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

    static CXUnsavedFile getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXUnsavedFile(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long offset, long index, CXUnsavedFile value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXUnsavedFile other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment Filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET_Filename);
    }

    public void Filename(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_Filename, value);
    }

    public MemorySegment $Filename()
    {
        return this.pointer().asSlice(OFFSET_Filename, ADDRESS);
    }

    public MemorySegment Contents()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET_Contents);
    }

    public void Contents(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_Contents, value);
    }

    public MemorySegment $Contents()
    {
        return this.pointer().asSlice(OFFSET_Contents, ADDRESS);
    }

    public MemorySegment $Length()
    {
        return this.pointer().asSlice(OFFSET_Length, CUnsignedLong.LAYOUT);
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
