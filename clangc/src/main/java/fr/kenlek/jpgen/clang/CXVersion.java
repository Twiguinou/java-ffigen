package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXVersion(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("Major"),
        JAVA_INT.withName("Minor"),
        JAVA_INT.withName("Subminor")
    ).withName("CXVersion");
    public static final long OFFSET_Major = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Major"));
    public static final long OFFSET_Minor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Minor"));
    public static final long OFFSET_Subminor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Subminor"));

    public CXVersion
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXVersion(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXVersion> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXVersion::new);
    }

    public static Buffer<CXVersion> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXVersion::new);
    }

    public static CXVersion getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXVersion(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXVersion value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXVersion other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int Major()
    {
        return this.pointer().get(JAVA_INT, OFFSET_Major);
    }

    public void Major(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_Major, value);
    }

    public MemorySegment $Major()
    {
        return this.pointer().asSlice(OFFSET_Major, JAVA_INT);
    }

    public int Minor()
    {
        return this.pointer().get(JAVA_INT, OFFSET_Minor);
    }

    public void Minor(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_Minor, value);
    }

    public MemorySegment $Minor()
    {
        return this.pointer().asSlice(OFFSET_Minor, JAVA_INT);
    }

    public int Subminor()
    {
        return this.pointer().get(JAVA_INT, OFFSET_Subminor);
    }

    public void Subminor(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_Subminor, value);
    }

    public MemorySegment $Subminor()
    {
        return this.pointer().asSlice(OFFSET_Subminor, JAVA_INT);
    }
}
