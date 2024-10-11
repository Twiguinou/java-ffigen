/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxObjCContainerDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public CXIdxObjCContainerDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout));
    }

    public static CXIdxObjCContainerDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxObjCContainerDeclInfo(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxObjCContainerDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout.byteSize());
    }

    public void copyFrom(CXIdxObjCContainerDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__declInfo = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.state(0).byteOffset();
    public java.lang.foreign.MemorySegment declInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declInfo);}
    public void declInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declInfo, value);}
    public java.lang.foreign.MemorySegment $declInfo() {return this.ptr.asSlice(MEMBER_OFFSET__declInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__kind = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo.state(1).byteOffset();
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}
}
