package jpgen.clang;

public record CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__attrInfo = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__attrInfo = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__objcClass = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__objcClass = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__classCursor = jpgen.clang.CXCursor.gRecordLayout;
    public static final long OFFSET__classCursor = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__classLoc = jpgen.clang.CXIdxLoc.gRecordLayout;
    public static final long OFFSET__classLoc = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__attrInfo,
            LAYOUT__objcClass,
            LAYOUT__classCursor,
            LAYOUT__classLoc
    ).withByteAlignment(8).withName("CXIdxIBOutletCollectionAttrInfo");

    public CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxIBOutletCollectionAttrInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxIBOutletCollectionAttrInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxIBOutletCollectionAttrInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment attrInfo() {return this.ptr.get(LAYOUT__attrInfo, OFFSET__attrInfo);}
    public void attrInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__attrInfo, OFFSET__attrInfo, value);}
    public java.lang.foreign.MemorySegment $attrInfo() {return this.ptr.asSlice(OFFSET__attrInfo, LAYOUT__attrInfo);}

    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT__objcClass, OFFSET__objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__objcClass, OFFSET__objcClass, value);}
    public java.lang.foreign.MemorySegment $objcClass() {return this.ptr.asSlice(OFFSET__objcClass, LAYOUT__objcClass);}

    public jpgen.clang.CXCursor classCursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__classCursor, LAYOUT__classCursor));}
    public void classCursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__classCursor, LAYOUT__classCursor.byteSize());}

    public jpgen.clang.CXIdxLoc classLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__classLoc, LAYOUT__classLoc));}
    public void classLoc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__classLoc, LAYOUT__classLoc.byteSize());}
}
