package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

public record CXIdxObjCInterfaceDeclInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
            UNBOUNDED_POINTER.withName("containerInfo"),
            UNBOUNDED_POINTER.withName("superInfo"),
            UNBOUNDED_POINTER.withName("protocols")
    ).withName("CXIdxObjCInterfaceDeclInfo");
    public static final long OFFSET__containerInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("containerInfo"));
    public static final long OFFSET__superInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("superInfo"));
    public static final long OFFSET__protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));

    public CXIdxObjCInterfaceDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCInterfaceDeclInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCInterfaceDeclInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment containerInfo() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__containerInfo);}
    public void containerInfo(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__containerInfo, value);}
    public MemorySegment $containerInfo() {return this.ptr().asSlice(OFFSET__containerInfo, UNBOUNDED_POINTER);}

    public MemorySegment superInfo() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__superInfo);}
    public void superInfo(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__superInfo, value);}
    public MemorySegment $superInfo() {return this.ptr().asSlice(OFFSET__superInfo, UNBOUNDED_POINTER);}

    public MemorySegment protocols() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__protocols);}
    public void protocols(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__protocols, value);}
    public MemorySegment $protocols() {return this.ptr().asSlice(OFFSET__protocols, UNBOUNDED_POINTER);}
}
