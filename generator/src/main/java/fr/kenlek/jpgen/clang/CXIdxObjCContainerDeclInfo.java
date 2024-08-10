package fr.kenlek.jpgen.clang;

public record CXIdxObjCContainerDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__declInfo = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declInfo");
    public static final long OFFSET__declInfo = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__declInfo,
            LAYOUT__kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxObjCContainerDeclInfo");

    public CXIdxObjCContainerDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxObjCContainerDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxObjCContainerDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxObjCContainerDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT__declInfo, OFFSET__declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__declInfo, OFFSET__declInfo, value);}
    public java.lang.foreign.MemorySegment $declInfo() {return this.ptr.asSlice(OFFSET__declInfo, LAYOUT__declInfo);}

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}
}
