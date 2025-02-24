package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.ForeignUtils.*;

public record CXIdxObjCContainerDeclInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("declInfo"),
        JAVA_INT.withName("kind")
    ).withName("CXIdxObjCContainerDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));

    public CXIdxObjCContainerDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCContainerDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCContainerDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCContainerDeclInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCContainerDeclInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment declInfo()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.ptr().asSlice(OFFSET__declInfo, UNBOUNDED_POINTER);
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
}
