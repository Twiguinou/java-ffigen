/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang.win32;

public record CXUnsavedFile(java.lang.foreign.MemorySegment ptr) implements fr.kenlek.jpgen.clang.CXUnsavedFile
{
    public CXUnsavedFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXUnsavedFile.layout));
    }

    public static final long MEMBER_OFFSET__Filename = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXUnsavedFile.state(0).byteOffset();
    @java.lang.Override public java.lang.foreign.MemorySegment Filename() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename);}
    @java.lang.Override public void Filename(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $Filename() {return this.ptr.asSlice(MEMBER_OFFSET__Filename, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Contents = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXUnsavedFile.state(1).byteOffset();
    @java.lang.Override public java.lang.foreign.MemorySegment Contents() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents);}
    @java.lang.Override public void Contents(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $Contents() {return this.ptr.asSlice(MEMBER_OFFSET__Contents, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Length = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXUnsavedFile.state(2).byteOffset();
    public int Length() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Length);}
    public void Length(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Length, value);}
    public java.lang.foreign.MemorySegment $Length() {return this.ptr.asSlice(MEMBER_OFFSET__Length, java.lang.foreign.ValueLayout.JAVA_INT);}
}