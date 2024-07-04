package jpgen.clang;

public record CXIdxObjCPropertyDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__declInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("declInfo");
    public static final long OFFSET__declInfo = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__getter = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("getter");
    public static final long OFFSET__getter = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__setter = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("setter");
    public static final long OFFSET__setter = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__declInfo,
            LAYOUT__getter,
            LAYOUT__setter
    ).withByteAlignment(8).withName("CXIdxObjCPropertyDeclInfo");

    public CXIdxObjCPropertyDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxObjCPropertyDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT__declInfo, OFFSET__declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__declInfo, OFFSET__declInfo, value);}
    public java.lang.foreign.MemorySegment $declInfo() {return this.ptr.asSlice(OFFSET__declInfo, LAYOUT__declInfo);}

    public java.lang.foreign.MemorySegment getter() {return this.ptr.get(LAYOUT__getter, OFFSET__getter);}
    public void getter(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__getter, OFFSET__getter, value);}
    public java.lang.foreign.MemorySegment $getter() {return this.ptr.asSlice(OFFSET__getter, LAYOUT__getter);}

    public java.lang.foreign.MemorySegment setter() {return this.ptr.get(LAYOUT__setter, OFFSET__setter);}
    public void setter(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__setter, OFFSET__setter, value);}
    public java.lang.foreign.MemorySegment $setter() {return this.ptr.asSlice(OFFSET__setter, LAYOUT__setter);}
}
