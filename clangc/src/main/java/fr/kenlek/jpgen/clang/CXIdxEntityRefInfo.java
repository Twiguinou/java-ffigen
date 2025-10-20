package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.*;

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
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET_cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET_loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET_referencedEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("referencedEntity"));
    public static final long OFFSET_parentEntity = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("parentEntity"));
    public static final long OFFSET_container = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("container"));
    public static final long OFFSET_role = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("role"));

    public CXIdxEntityRefInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
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

    public static CXIdxEntityRefInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxEntityRefInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityRefInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET_kind, JAVA_INT);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_cursor, CXCursor.LAYOUT));
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_loc, CXIdxLoc.LAYOUT));
    }

    public MemorySegment referencedEntity()
    {
        return this.pointer().get(ADDRESS, OFFSET_referencedEntity);
    }

    public void referencedEntity(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_referencedEntity, value);
    }

    public MemorySegment $referencedEntity()
    {
        return this.pointer().asSlice(OFFSET_referencedEntity, ADDRESS);
    }

    public MemorySegment parentEntity()
    {
        return this.pointer().get(ADDRESS, OFFSET_parentEntity);
    }

    public void parentEntity(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_parentEntity, value);
    }

    public MemorySegment $parentEntity()
    {
        return this.pointer().asSlice(OFFSET_parentEntity, ADDRESS);
    }

    public MemorySegment container()
    {
        return this.pointer().get(ADDRESS, OFFSET_container);
    }

    public void container(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_container, value);
    }

    public MemorySegment $container()
    {
        return this.pointer().asSlice(OFFSET_container, ADDRESS);
    }

    public int role()
    {
        return this.pointer().get(JAVA_INT, OFFSET_role);
    }

    public void role(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_role, value);
    }

    public MemorySegment $role()
    {
        return this.pointer().asSlice(OFFSET_role, JAVA_INT);
    }
}
