package jpgen.clang;

public record CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$attrInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$attrInfo = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$objcClass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$objcClass = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$classCursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$classCursor = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$classLoc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$classLoc = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$attrInfo,
            LAYOUT$objcClass,
            LAYOUT$classCursor,
            LAYOUT$classLoc
    ).withName("CXIdxIBOutletCollectionAttrInfo");

    public CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment attrInfo() {return this.ptr.get(LAYOUT$attrInfo, OFFSET$attrInfo);}
    public void attrInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$attrInfo, OFFSET$attrInfo, value);}
    public java.lang.foreign.MemorySegment attrInfo_ptr() {return this.ptr.asSlice(OFFSET$attrInfo, LAYOUT$attrInfo);}

    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT$objcClass, OFFSET$objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$objcClass, OFFSET$objcClass, value);}
    public java.lang.foreign.MemorySegment objcClass_ptr() {return this.ptr.asSlice(OFFSET$objcClass, LAYOUT$objcClass);}

    public jpgen.clang.CXCursor classCursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$classCursor, LAYOUT$classCursor));}
    public void classCursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$classCursor, LAYOUT$classCursor.byteSize());}

    public jpgen.clang.CXIdxLoc classLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$classLoc, LAYOUT$classLoc));}
    public void classLoc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$classLoc, LAYOUT$classLoc.byteSize());}
}
