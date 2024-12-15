/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxImportedASTFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("file"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("module"),
            fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.withName("loc"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxImportedASTFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxImportedASTFileInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxImportedASTFileInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxImportedASTFileInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxImportedASTFileInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__file = ((0 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment file() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__file, value);}
    public java.lang.foreign.MemorySegment $file() {return this.ptr.asSlice(MEMBER_OFFSET__file, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__module = ((8 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment module() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__module, value);}
    public java.lang.foreign.MemorySegment $module() {return this.ptr.asSlice(MEMBER_OFFSET__module, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__loc = ((16 / fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize()) * fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());
    public fr.kenlek.jpgen.clang.CXIdxLoc loc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT));}
    public void loc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $loc() {return this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT);}

    public static final long MEMBER_OFFSET__isImplicit = ((40 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int isImplicit() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit, value);}
    public java.lang.foreign.MemorySegment $isImplicit() {return this.ptr.asSlice(MEMBER_OFFSET__isImplicit, java.lang.foreign.ValueLayout.JAVA_INT);}
}
