package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.ForeignUtils.makeStructLayout;

public record CXPlatformAvailability(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        CXString.LAYOUT.withName("Platform"),
        CXVersion.LAYOUT.withName("Introduced"),
        CXVersion.LAYOUT.withName("Deprecated"),
        CXVersion.LAYOUT.withName("Obsoleted"),
        JAVA_INT.withName("Unavailable"),
        CXString.LAYOUT.withName("Message")
    ).withName("CXPlatformAvailability");
    public static final long OFFSET__Platform = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Platform"));
    public static final long OFFSET__Introduced = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Introduced"));
    public static final long OFFSET__Deprecated = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Deprecated"));
    public static final long OFFSET__Obsoleted = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Obsoleted"));
    public static final long OFFSET__Unavailable = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Unavailable"));
    public static final long OFFSET__Message = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Message"));

    public CXPlatformAvailability(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXPlatformAvailability getAtIndex(MemorySegment buffer, long index)
    {
        return new CXPlatformAvailability(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXPlatformAvailability value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXPlatformAvailability other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public CXString Platform()
    {
        return new CXString(this.ptr().asSlice(OFFSET__Platform, CXString.LAYOUT));
    }

    public void Platform(Consumer<CXString> consumer)
    {
        consumer.accept(this.Platform());
    }

    public void Platform(CXString value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__Platform, CXString.LAYOUT.byteSize());
    }

    public MemorySegment $Platform()
    {
        return this.ptr().asSlice(OFFSET__Platform, CXString.LAYOUT);
    }

    public CXVersion Introduced()
    {
        return new CXVersion(this.ptr().asSlice(OFFSET__Introduced, CXVersion.LAYOUT));
    }

    public void Introduced(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Introduced());
    }

    public void Introduced(CXVersion value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__Introduced, CXVersion.LAYOUT.byteSize());
    }

    public MemorySegment $Introduced()
    {
        return this.ptr().asSlice(OFFSET__Introduced, CXVersion.LAYOUT);
    }

    public CXVersion Deprecated()
    {
        return new CXVersion(this.ptr().asSlice(OFFSET__Deprecated, CXVersion.LAYOUT));
    }

    public void Deprecated(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Deprecated());
    }

    public void Deprecated(CXVersion value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__Deprecated, CXVersion.LAYOUT.byteSize());
    }

    public MemorySegment $Deprecated()
    {
        return this.ptr().asSlice(OFFSET__Deprecated, CXVersion.LAYOUT);
    }

    public CXVersion Obsoleted()
    {
        return new CXVersion(this.ptr().asSlice(OFFSET__Obsoleted, CXVersion.LAYOUT));
    }

    public void Obsoleted(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Obsoleted());
    }

    public void Obsoleted(CXVersion value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__Obsoleted, CXVersion.LAYOUT.byteSize());
    }

    public MemorySegment $Obsoleted()
    {
        return this.ptr().asSlice(OFFSET__Obsoleted, CXVersion.LAYOUT);
    }

    public int Unavailable()
    {
        return this.ptr().get(JAVA_INT, OFFSET__Unavailable);
    }

    public void Unavailable(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__Unavailable, value);
    }

    public MemorySegment $Unavailable()
    {
        return this.ptr().asSlice(OFFSET__Unavailable, JAVA_INT);
    }

    public CXString Message()
    {
        return new CXString(this.ptr().asSlice(OFFSET__Message, CXString.LAYOUT));
    }

    public void Message(Consumer<CXString> consumer)
    {
        consumer.accept(this.Message());
    }

    public void Message(CXString value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__Message, CXString.LAYOUT.byteSize());
    }

    public MemorySegment $Message()
    {
        return this.ptr().asSlice(OFFSET__Message, CXString.LAYOUT);
    }
}
