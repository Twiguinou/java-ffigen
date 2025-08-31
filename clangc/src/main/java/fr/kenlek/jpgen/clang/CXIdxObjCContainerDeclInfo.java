package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxObjCContainerDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        JAVA_INT.withName("kind")
    ).withName("CXIdxObjCContainerDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));

    public CXIdxObjCContainerDeclInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxObjCContainerDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCContainerDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCContainerDeclInfo::new);
    }

    public static Buffer<CXIdxObjCContainerDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCContainerDeclInfo::new);
    }

    public static CXIdxObjCContainerDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCContainerDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCContainerDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCContainerDeclInfo other)
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
}
