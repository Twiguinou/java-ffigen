package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxCXXClassDeclInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("declInfo"),
        UNBOUNDED_POINTER.withName("bases"),
        JAVA_INT.withName("numBases")
    ).withName("CXIdxCXXClassDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__bases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("bases"));
    public static final long OFFSET__numBases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numBases"));

    public CXIdxCXXClassDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxCXXClassDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxCXXClassDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxCXXClassDeclInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxCXXClassDeclInfo other)
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

    public MemorySegment bases()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__bases);
    }

    public void bases(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__bases, value);
    }

    public MemorySegment $bases()
    {
        return this.ptr().asSlice(OFFSET__bases, UNBOUNDED_POINTER);
    }

    public int numBases()
    {
        return this.ptr().get(JAVA_INT, OFFSET__numBases);
    }

    public void numBases(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__numBases, value);
    }

    public MemorySegment $numBases()
    {
        return this.ptr().asSlice(OFFSET__numBases, JAVA_INT);
    }
}
