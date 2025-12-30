package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record CXPlatformAvailability(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        CXString.LAYOUT.withName("Platform"),
        CXVersion.LAYOUT.withName("Introduced"),
        CXVersion.LAYOUT.withName("Deprecated"),
        CXVersion.LAYOUT.withName("Obsoleted"),
        JAVA_INT.withName("Unavailable"),
        CXString.LAYOUT.withName("Message")
    ).withName("CXPlatformAvailability");
    public static final long OFFSET_Platform = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Platform"));
    public static final long OFFSET_Introduced = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Introduced"));
    public static final long OFFSET_Deprecated = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Deprecated"));
    public static final long OFFSET_Obsoleted = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Obsoleted"));
    public static final long OFFSET_Unavailable = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Unavailable"));
    public static final long OFFSET_Message = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Message"));

    public CXPlatformAvailability
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXPlatformAvailability(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXPlatformAvailability> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXPlatformAvailability::new);
    }

    public static Buffer<CXPlatformAvailability> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXPlatformAvailability::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXPlatformAvailability other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public CXString Platform()
    {
        return new CXString(this.pointer().asSlice(OFFSET_Platform, CXString.LAYOUT));
    }

    public CXVersion Introduced()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET_Introduced, CXVersion.LAYOUT));
    }

    public CXVersion Deprecated()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET_Deprecated, CXVersion.LAYOUT));
    }

    public CXVersion Obsoleted()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET_Obsoleted, CXVersion.LAYOUT));
    }

    public boolean Unavailable()
    {
        return this.pointer().get(JAVA_INT, OFFSET_Unavailable) != 0;
    }

    public void Unavailable(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_Unavailable, value ? 1 : 0);
    }

    public MemorySegment $Unavailable()
    {
        return this.pointer().asSlice(OFFSET_Unavailable, JAVA_INT);
    }

    public CXString Message()
    {
        return new CXString(this.pointer().asSlice(OFFSET_Message, CXString.LAYOUT));
    }
}
