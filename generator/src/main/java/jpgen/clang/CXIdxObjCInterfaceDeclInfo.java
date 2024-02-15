package jpgen.clang;

public record CXIdxObjCInterfaceDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$containerInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$containerInfo = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$superInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$superInfo = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$protocols = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$protocols = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$containerInfo,
            LAYOUT$superInfo,
            LAYOUT$protocols
    ).withName("CXIdxObjCInterfaceDeclInfo");

    public CXIdxObjCInterfaceDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxObjCInterfaceDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxObjCInterfaceDeclInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(LAYOUT$containerInfo, OFFSET$containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$containerInfo, OFFSET$containerInfo, value);}
    public java.lang.foreign.MemorySegment containerInfo_ptr() {return this.ptr.asSlice(OFFSET$containerInfo, LAYOUT$containerInfo);}

    public java.lang.foreign.MemorySegment superInfo() {return this.ptr.get(LAYOUT$superInfo, OFFSET$superInfo);}
    public void superInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$superInfo, OFFSET$superInfo, value);}
    public java.lang.foreign.MemorySegment superInfo_ptr() {return this.ptr.asSlice(OFFSET$superInfo, LAYOUT$superInfo);}

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT$protocols, OFFSET$protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$protocols, OFFSET$protocols, value);}
    public java.lang.foreign.MemorySegment protocols_ptr() {return this.ptr.asSlice(OFFSET$protocols, LAYOUT$protocols);}
}
