/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxIncludedFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.withName("hashLoc"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("filename"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("file"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isImport"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isAngled"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isModuleImport"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxIncludedFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxIncludedFileInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxIncludedFileInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxIncludedFileInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIncludedFileInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__hashLoc = 0;
    public fr.kenlek.jpgen.clang.CXIdxLoc hashLoc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__hashLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT));}
    public void hashLoc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.hashLoc());}
    public void hashLoc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__hashLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $hashLoc() {return this.ptr.asSlice(MEMBER_OFFSET__hashLoc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT);}

    public static final long MEMBER_OFFSET__filename = 24;
    public java.lang.foreign.MemorySegment filename() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__filename);}
    public void filename(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__filename, value);}
    public java.lang.foreign.MemorySegment $filename() {return this.ptr.asSlice(MEMBER_OFFSET__filename, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__file = 32;
    public java.lang.foreign.MemorySegment file() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__file, value);}
    public java.lang.foreign.MemorySegment $file() {return this.ptr.asSlice(MEMBER_OFFSET__file, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__isImport = 40;
    public int isImport() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImport);}
    public void isImport(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImport, value);}
    public java.lang.foreign.MemorySegment $isImport() {return this.ptr.asSlice(MEMBER_OFFSET__isImport, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isAngled = 44;
    public int isAngled() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isAngled);}
    public void isAngled(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isAngled, value);}
    public java.lang.foreign.MemorySegment $isAngled() {return this.ptr.asSlice(MEMBER_OFFSET__isAngled, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isModuleImport = 48;
    public int isModuleImport() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isModuleImport);}
    public void isModuleImport(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isModuleImport, value);}
    public java.lang.foreign.MemorySegment $isModuleImport() {return this.ptr.asSlice(MEMBER_OFFSET__isModuleImport, java.lang.foreign.ValueLayout.JAVA_INT);}
}
