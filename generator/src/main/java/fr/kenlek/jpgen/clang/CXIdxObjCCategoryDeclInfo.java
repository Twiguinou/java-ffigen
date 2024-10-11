/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxObjCCategoryDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public CXIdxObjCCategoryDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout));
    }

    public static CXIdxObjCCategoryDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxObjCCategoryDeclInfo(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxObjCCategoryDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout.byteSize());
    }

    public void copyFrom(CXIdxObjCCategoryDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__containerInfo = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.state(0).byteOffset();
    public java.lang.foreign.MemorySegment containerInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__containerInfo);}
    public void containerInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__containerInfo, value);}
    public java.lang.foreign.MemorySegment $containerInfo() {return this.ptr.asSlice(MEMBER_OFFSET__containerInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__objcClass = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.state(1).byteOffset();
    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__objcClass, value);}
    public java.lang.foreign.MemorySegment $objcClass() {return this.ptr.asSlice(MEMBER_OFFSET__objcClass, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__classCursor = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.state(2).byteOffset();
    public fr.kenlek.jpgen.clang.CXCursor classCursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));}
    public void classCursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.byteSize());}
    public java.lang.foreign.MemorySegment $classCursor() {return this.ptr.asSlice(MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout);}

    public static final long MEMBER_OFFSET__classLoc = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.state(3).byteOffset();
    public fr.kenlek.jpgen.clang.CXIdxLoc classLoc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout));}
    public void classLoc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.byteSize());}
    public java.lang.foreign.MemorySegment $classLoc() {return this.ptr.asSlice(MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout);}

    public static final long MEMBER_OFFSET__protocols = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo.state(4).byteOffset();
    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(MEMBER_OFFSET__protocols, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
