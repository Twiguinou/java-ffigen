package jpgen.clang;

public record CXIdxObjCPropertyDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$declInfo = java.lang.foreign.ValueLayout.ADDRESS.withName("declInfo");
    public static final long OFFSET$declInfo = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$getter = java.lang.foreign.ValueLayout.ADDRESS.withName("getter");
    public static final long OFFSET$getter = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$setter = java.lang.foreign.ValueLayout.ADDRESS.withName("setter");
    public static final long OFFSET$setter = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$declInfo,
            LAYOUT$getter,
            LAYOUT$setter
    ).withName("CXIdxObjCPropertyDeclInfo");

    public CXIdxObjCPropertyDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(LAYOUT$declInfo, OFFSET$declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$declInfo, OFFSET$declInfo, value);}
    public java.lang.foreign.MemorySegment declInfo_ptr() {return this.ptr.asSlice(OFFSET$declInfo, LAYOUT$declInfo);}

    public java.lang.foreign.MemorySegment getter() {return this.ptr.get(LAYOUT$getter, OFFSET$getter);}
    public void getter(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$getter, OFFSET$getter, value);}
    public java.lang.foreign.MemorySegment getter_ptr() {return this.ptr.asSlice(OFFSET$getter, LAYOUT$getter);}

    public java.lang.foreign.MemorySegment setter() {return this.ptr.get(LAYOUT$setter, OFFSET$setter);}
    public void setter(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$setter, OFFSET$setter, value);}
    public java.lang.foreign.MemorySegment setter_ptr() {return this.ptr.asSlice(OFFSET$setter, LAYOUT$setter);}
}
