/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxIBOutletCollectionAttrInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attrInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("objcClass")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout.withName("classCursor")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout.withName("classLoc"))
    ));

    public CXIdxIBOutletCollectionAttrInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXIdxIBOutletCollectionAttrInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxIBOutletCollectionAttrInfo(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxIBOutletCollectionAttrInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXIdxIBOutletCollectionAttrInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__attrInfo = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment attrInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attrInfo);}
    public void attrInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attrInfo, value);}
    public java.lang.foreign.MemorySegment $attrInfo() {return this.ptr.asSlice(MEMBER_OFFSET__attrInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__objcClass = LAYOUT_DATA.state(1).byteOffset();
    public java.lang.foreign.MemorySegment objcClass() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__objcClass);}
    public void objcClass(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__objcClass, value);}
    public java.lang.foreign.MemorySegment $objcClass() {return this.ptr.asSlice(MEMBER_OFFSET__objcClass, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__classCursor = LAYOUT_DATA.state(2).byteOffset();
    public fr.kenlek.jpgen.clang.CXCursor classCursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout));}
    public void classCursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.classCursor());}
    public void classCursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout.byteSize());}
    public java.lang.foreign.MemorySegment $classCursor() {return this.ptr.asSlice(MEMBER_OFFSET__classCursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout);}

    public static final long MEMBER_OFFSET__classLoc = LAYOUT_DATA.state(3).byteOffset();
    public fr.kenlek.jpgen.clang.CXIdxLoc classLoc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout));}
    public void classLoc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.classLoc());}
    public void classLoc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout.byteSize());}
    public java.lang.foreign.MemorySegment $classLoc() {return this.ptr.asSlice(MEMBER_OFFSET__classLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout);}
}
