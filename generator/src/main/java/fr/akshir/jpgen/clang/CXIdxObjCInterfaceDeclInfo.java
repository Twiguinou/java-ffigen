package fr.akshir.jpgen.clang;

public record CXIdxObjCInterfaceDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__containerInfo = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("containerInfo");
    public static final long OFFSET__containerInfo = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__superInfo = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("superInfo");
    public static final long OFFSET__superInfo = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__protocols = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("protocols");
    public static final long OFFSET__protocols = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__containerInfo,
            LAYOUT__superInfo,
            LAYOUT__protocols
    ).withByteAlignment(8).withName("CXIdxObjCInterfaceDeclInfo");

    public CXIdxObjCInterfaceDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxObjCInterfaceDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(LAYOUT__containerInfo, OFFSET__containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__containerInfo, OFFSET__containerInfo, value);}
    public java.lang.foreign.MemorySegment $containerInfo() {return this.ptr.asSlice(OFFSET__containerInfo, LAYOUT__containerInfo);}

    public java.lang.foreign.MemorySegment superInfo() {return this.ptr.get(LAYOUT__superInfo, OFFSET__superInfo);}
    public void superInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__superInfo, OFFSET__superInfo, value);}
    public java.lang.foreign.MemorySegment $superInfo() {return this.ptr.asSlice(OFFSET__superInfo, LAYOUT__superInfo);}

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT__protocols, OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__protocols, OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(OFFSET__protocols, LAYOUT__protocols);}
}
