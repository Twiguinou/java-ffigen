package jpgen.clang;

public record CXIdxCXXClassDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__declInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("declInfo");
    public static final long OFFSET__declInfo = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__bases = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("bases");
    public static final long OFFSET__bases = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numBases = java.lang.foreign.ValueLayout.JAVA_INT.withName("numBases");
    public static final long OFFSET__numBases = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__declInfo,
            LAYOUT__bases,
            LAYOUT__numBases,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxCXXClassDeclInfo");

    public CXIdxCXXClassDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxCXXClassDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxCXXClassDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxCXXClassDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT__declInfo, OFFSET__declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__declInfo, OFFSET__declInfo, value);}
    public java.lang.foreign.MemorySegment $declInfo() {return this.ptr.asSlice(OFFSET__declInfo, LAYOUT__declInfo);}

    public java.lang.foreign.MemorySegment bases() {return this.ptr.get(LAYOUT__bases, OFFSET__bases);}
    public void bases(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__bases, OFFSET__bases, value);}
    public java.lang.foreign.MemorySegment $bases() {return this.ptr.asSlice(OFFSET__bases, LAYOUT__bases);}

    public int numBases() {return this.ptr.get(LAYOUT__numBases, OFFSET__numBases);}
    public void numBases(int value) {this.ptr.set(LAYOUT__numBases, OFFSET__numBases, value);}
    public java.lang.foreign.MemorySegment $numBases() {return this.ptr.asSlice(OFFSET__numBases, LAYOUT__numBases);}
}
