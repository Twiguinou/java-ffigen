package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxObjCPropertyDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        ADDRESS.withName("getter"),
        ADDRESS.withName("setter")
    ).withName("CXIdxObjCPropertyDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__getter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("getter"));
    public static final long OFFSET__setter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("setter"));

    public CXIdxObjCPropertyDeclInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxObjCPropertyDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCPropertyDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCPropertyDeclInfo::new);
    }

    public static Buffer<CXIdxObjCPropertyDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCPropertyDeclInfo::new);
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCPropertyDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCPropertyDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment declInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET__declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.pointer().asSlice(OFFSET__declInfo, ADDRESS);
    }

    public MemorySegment getter()
    {
        return this.pointer().get(ADDRESS, OFFSET__getter);
    }

    public void getter(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__getter, value);
    }

    public MemorySegment $getter()
    {
        return this.pointer().asSlice(OFFSET__getter, ADDRESS);
    }

    public MemorySegment setter()
    {
        return this.pointer().get(ADDRESS, OFFSET__setter);
    }

    public void setter(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__setter, value);
    }

    public MemorySegment $setter()
    {
        return this.pointer().asSlice(OFFSET__setter, ADDRESS);
    }
}
