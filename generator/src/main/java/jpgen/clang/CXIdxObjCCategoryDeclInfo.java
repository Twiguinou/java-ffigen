package jpgen.clang;

public record CXIdxObjCCategoryDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$containerInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$containerInfo = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$objcClass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$objcClass = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$classCursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$classCursor = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$classLoc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$classLoc = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$protocols = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$protocols = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$containerInfo,
            LAYOUT$objcClass,
            LAYOUT$classCursor,
            LAYOUT$classLoc,
            LAYOUT$protocols
    ).withName("CXIdxObjCCategoryDeclInfo");

    public CXIdxObjCCategoryDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(LAYOUT$containerInfo, OFFSET$containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$containerInfo, OFFSET$containerInfo, value);}
    public java.lang.foreign.MemorySegment containerInfo_ptr() {return this.ptr.asSlice(OFFSET$containerInfo, LAYOUT$containerInfo);}

    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT$objcClass, OFFSET$objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$objcClass, OFFSET$objcClass, value);}
    public java.lang.foreign.MemorySegment objcClass_ptr() {return this.ptr.asSlice(OFFSET$objcClass, LAYOUT$objcClass);}

    public jpgen.clang.CXCursor classCursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$classCursor, LAYOUT$classCursor));}
    public void classCursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$classCursor, LAYOUT$classCursor.byteSize());}

    public jpgen.clang.CXIdxLoc classLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$classLoc, LAYOUT$classLoc));}
    public void classLoc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$classLoc, LAYOUT$classLoc.byteSize());}

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT$protocols, OFFSET$protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$protocols, OFFSET$protocols, value);}
    public java.lang.foreign.MemorySegment protocols_ptr() {return this.ptr.asSlice(OFFSET$protocols, LAYOUT$protocols);}
}
