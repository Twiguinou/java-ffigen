package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

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
    public static final long OFFSET__Platform = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Platform"));
    public static final long OFFSET__Introduced = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Introduced"));
    public static final long OFFSET__Deprecated = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Deprecated"));
    public static final long OFFSET__Obsoleted = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Obsoleted"));
    public static final long OFFSET__Unavailable = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Unavailable"));
    public static final long OFFSET__Message = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("Message"));

    public CXPlatformAvailability
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXPlatformAvailability(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXPlatformAvailability> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXPlatformAvailability::new);
    }

    public static Buffer<CXPlatformAvailability> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXPlatformAvailability::new);
    }

    public static CXPlatformAvailability getAtIndex(MemorySegment buffer, long index)
    {
        return new CXPlatformAvailability(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXPlatformAvailability value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXPlatformAvailability other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public CXString Platform()
    {
        return new CXString(this.pointer().asSlice(OFFSET__Platform, CXString.LAYOUT));
    }

    public void Platform(Consumer<CXString> consumer)
    {
        consumer.accept(this.Platform());
    }

    public CXVersion Introduced()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET__Introduced, CXVersion.LAYOUT));
    }

    public void Introduced(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Introduced());
    }

    public CXVersion Deprecated()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET__Deprecated, CXVersion.LAYOUT));
    }

    public void Deprecated(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Deprecated());
    }

    public CXVersion Obsoleted()
    {
        return new CXVersion(this.pointer().asSlice(OFFSET__Obsoleted, CXVersion.LAYOUT));
    }

    public void Obsoleted(Consumer<CXVersion> consumer)
    {
        consumer.accept(this.Obsoleted());
    }

    public boolean Unavailable()
    {
        return this.pointer().get(JAVA_INT, OFFSET__Unavailable) != 0;
    }

    public void Unavailable(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__Unavailable, value ? 1 : 0);
    }

    public MemorySegment $Unavailable()
    {
        return this.pointer().asSlice(OFFSET__Unavailable, JAVA_INT);
    }

    public CXString Message()
    {
        return new CXString(this.pointer().asSlice(OFFSET__Message, CXString.LAYOUT));
    }

    public void Message(Consumer<CXString> consumer)
    {
        consumer.accept(this.Message());
    }
}
