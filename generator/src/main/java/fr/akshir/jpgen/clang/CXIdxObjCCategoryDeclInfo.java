package fr.akshir.jpgen.clang;

public record CXIdxObjCCategoryDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__containerInfo = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("containerInfo");
    public static final long OFFSET__containerInfo = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__objcClass = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("objcClass");
    public static final long OFFSET__objcClass = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__classCursor = fr.akshir.jpgen.clang.CXCursor.gRecordLayout.withName("classCursor");
    public static final long OFFSET__classCursor = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__classLoc = fr.akshir.jpgen.clang.CXIdxLoc.gRecordLayout.withName("classLoc");
    public static final long OFFSET__classLoc = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__protocols = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("protocols");
    public static final long OFFSET__protocols = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__containerInfo,
            LAYOUT__objcClass,
            LAYOUT__classCursor,
            LAYOUT__classLoc,
            LAYOUT__protocols
    ).withByteAlignment(8).withName("CXIdxObjCCategoryDeclInfo");

    public CXIdxObjCCategoryDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxObjCCategoryDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxObjCCategoryDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxObjCCategoryDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(LAYOUT__containerInfo, OFFSET__containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__containerInfo, OFFSET__containerInfo, value);}
    public java.lang.foreign.MemorySegment $containerInfo() {return this.ptr.asSlice(OFFSET__containerInfo, LAYOUT__containerInfo);}

    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(LAYOUT__objcClass, OFFSET__objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__objcClass, OFFSET__objcClass, value);}
    public java.lang.foreign.MemorySegment $objcClass() {return this.ptr.asSlice(OFFSET__objcClass, LAYOUT__objcClass);}

    public fr.akshir.jpgen.clang.CXCursor classCursor() {return new fr.akshir.jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__classCursor, LAYOUT__classCursor));}
    public void classCursor(java.util.function.Consumer<fr.akshir.jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(fr.akshir.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__classCursor, LAYOUT__classCursor.byteSize());}

    public fr.akshir.jpgen.clang.CXIdxLoc classLoc() {return new fr.akshir.jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__classLoc, LAYOUT__classLoc));}
    public void classLoc(java.util.function.Consumer<fr.akshir.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(fr.akshir.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__classLoc, LAYOUT__classLoc.byteSize());}

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT__protocols, OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__protocols, OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(OFFSET__protocols, LAYOUT__protocols);}
}
