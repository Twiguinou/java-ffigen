package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxEntityRefInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc"),
        UNBOUNDED_POINTER.withName("referencedEntity"),
        UNBOUNDED_POINTER.withName("parentEntity"),
        UNBOUNDED_POINTER.withName("container"),
        JAVA_INT.withName("role")
    ).withName("CXIdxEntityRefInfo");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET__referencedEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("referencedEntity"));
    public static final long OFFSET__parentEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("parentEntity"));
    public static final long OFFSET__container = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("container"));
    public static final long OFFSET__role = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("role"));

    public CXIdxEntityRefInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxEntityRefInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxEntityRefInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityRefInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.ptr().get(JAVA_INT, OFFSET__kind);
    }

    public void kind(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__kind, value);
    }

    public MemorySegment $kind()
    {
        return this.ptr().asSlice(OFFSET__kind, JAVA_INT);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public void cursor(CXCursor value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__cursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $cursor()
    {
        return this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public void loc(CXIdxLoc value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__loc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $loc()
    {
        return this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT);
    }

    public MemorySegment referencedEntity()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__referencedEntity);
    }

    public void referencedEntity(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__referencedEntity, value);
    }

    public MemorySegment $referencedEntity()
    {
        return this.ptr().asSlice(OFFSET__referencedEntity, UNBOUNDED_POINTER);
    }

    public MemorySegment parentEntity()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__parentEntity);
    }

    public void parentEntity(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__parentEntity, value);
    }

    public MemorySegment $parentEntity()
    {
        return this.ptr().asSlice(OFFSET__parentEntity, UNBOUNDED_POINTER);
    }

    public MemorySegment container()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__container);
    }

    public void container(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__container, value);
    }

    public MemorySegment $container()
    {
        return this.ptr().asSlice(OFFSET__container, UNBOUNDED_POINTER);
    }

    public int role()
    {
        return this.ptr().get(JAVA_INT, OFFSET__role);
    }

    public void role(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__role, value);
    }

    public MemorySegment $role()
    {
        return this.ptr().asSlice(OFFSET__role, JAVA_INT);
    }
}
