/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXUnsavedFile(java.lang.foreign.MemorySegment ptr)
{
    public CXUnsavedFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout));
    }

    public static CXUnsavedFile getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXUnsavedFile(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXUnsavedFile value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout.byteSize());
    }

    public void copyFrom(CXUnsavedFile other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Filename = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.state(0).byteOffset();
    public java.lang.foreign.MemorySegment Filename() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename);}
    public void Filename(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename, value);}
    public java.lang.foreign.MemorySegment $Filename() {return this.ptr.asSlice(MEMBER_OFFSET__Filename, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Contents = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.state(1).byteOffset();
    public java.lang.foreign.MemorySegment Contents() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents);}
    public void Contents(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents, value);}
    public java.lang.foreign.MemorySegment $Contents() {return this.ptr.asSlice(MEMBER_OFFSET__Contents, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Length = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.state(2).byteOffset();
    public long Length() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__Length);}
    public void Length(long value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__Length, value);}
    public java.lang.foreign.MemorySegment $Length() {return this.ptr.asSlice(MEMBER_OFFSET__Length, java.lang.foreign.ValueLayout.JAVA_LONG);}
}
