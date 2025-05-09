package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

public record CXVersion(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("Major"),
        JAVA_INT.withName("Minor"),
        JAVA_INT.withName("Subminor")
    ).withName("CXVersion");
    public static final long OFFSET__Major = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Major"));
    public static final long OFFSET__Minor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Minor"));
    public static final long OFFSET__Subminor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Subminor"));

    public CXVersion(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXVersion getAtIndex(MemorySegment buffer, long index)
    {
        return new CXVersion(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXVersion value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXVersion other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int Major()
    {
        return this.pointer().get(JAVA_INT, OFFSET__Major);
    }

    public void Major(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__Major, value);
    }

    public MemorySegment $Major()
    {
        return this.pointer().asSlice(OFFSET__Major, JAVA_INT);
    }

    public int Minor()
    {
        return this.pointer().get(JAVA_INT, OFFSET__Minor);
    }

    public void Minor(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__Minor, value);
    }

    public MemorySegment $Minor()
    {
        return this.pointer().asSlice(OFFSET__Minor, JAVA_INT);
    }

    public int Subminor()
    {
        return this.pointer().get(JAVA_INT, OFFSET__Subminor);
    }

    public void Subminor(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__Subminor, value);
    }

    public MemorySegment $Subminor()
    {
        return this.pointer().asSlice(OFFSET__Subminor, JAVA_INT);
    }
}
