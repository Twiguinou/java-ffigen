package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxObjCPropertyDeclInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("declInfo"),
        UNBOUNDED_POINTER.withName("getter"),
        UNBOUNDED_POINTER.withName("setter")
    ).withName("CXIdxObjCPropertyDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__getter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("getter"));
    public static final long OFFSET__setter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("setter"));

    public CXIdxObjCPropertyDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCPropertyDeclInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCPropertyDeclInfo other)
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

    public MemorySegment getter()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__getter);
    }

    public void getter(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__getter, value);
    }

    public MemorySegment $getter()
    {
        return this.ptr().asSlice(OFFSET__getter, UNBOUNDED_POINTER);
    }

    public MemorySegment setter()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__setter);
    }

    public void setter(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__setter, value);
    }

    public MemorySegment $setter()
    {
        return this.ptr().asSlice(OFFSET__setter, UNBOUNDED_POINTER);
    }
}
