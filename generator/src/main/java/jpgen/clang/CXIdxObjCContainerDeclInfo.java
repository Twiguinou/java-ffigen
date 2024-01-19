package jpgen.clang;

public record CXIdxObjCContainerDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$declInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$declInfo = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$declInfo,
            LAYOUT$kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxObjCContainerDeclInfo");

    public CXIdxObjCContainerDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT$declInfo, OFFSET$declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$declInfo, OFFSET$declInfo, value);}
    public java.lang.foreign.MemorySegment declInfo_ptr() {return this.ptr.asSlice(OFFSET$declInfo, LAYOUT$declInfo);}

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}
}
