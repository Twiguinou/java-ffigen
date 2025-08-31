package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxEntityRefInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc"),
        ADDRESS.withName("referencedEntity"),
        ADDRESS.withName("parentEntity"),
        ADDRESS.withName("container"),
        JAVA_INT.withName("role")
    ).withName("CXIdxEntityRefInfo");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET__referencedEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("referencedEntity"));
    public static final long OFFSET__parentEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("parentEntity"));
    public static final long OFFSET__container = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("container"));
    public static final long OFFSET__role = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("role"));

    public CXIdxEntityRefInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxEntityRefInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxEntityRefInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxEntityRefInfo::new);
    }

    public static Buffer<CXIdxEntityRefInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxEntityRefInfo::new);
    }

    public static CXIdxEntityRefInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxEntityRefInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityRefInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET__kind, JAVA_INT);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public MemorySegment referencedEntity()
    {
        return this.pointer().get(ADDRESS, OFFSET__referencedEntity);
    }

    public void referencedEntity(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__referencedEntity, value);
    }

    public MemorySegment $referencedEntity()
    {
        return this.pointer().asSlice(OFFSET__referencedEntity, ADDRESS);
    }

    public MemorySegment parentEntity()
    {
        return this.pointer().get(ADDRESS, OFFSET__parentEntity);
    }

    public void parentEntity(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__parentEntity, value);
    }

    public MemorySegment $parentEntity()
    {
        return this.pointer().asSlice(OFFSET__parentEntity, ADDRESS);
    }

    public MemorySegment container()
    {
        return this.pointer().get(ADDRESS, OFFSET__container);
    }

    public void container(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__container, value);
    }

    public MemorySegment $container()
    {
        return this.pointer().asSlice(OFFSET__container, ADDRESS);
    }

    public int role()
    {
        return this.pointer().get(JAVA_INT, OFFSET__role);
    }

    public void role(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__role, value);
    }

    public MemorySegment $role()
    {
        return this.pointer().asSlice(OFFSET__role, JAVA_INT);
    }
}
