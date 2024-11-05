/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang.posix;

public record CXUnsavedFile(java.lang.foreign.MemorySegment ptr) implements fr.kenlek.jpgen.clang.CXUnsavedFile
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXUnsavedFile", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Filename")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Contents")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_LONG.withName("Length"))
    ));

    public CXUnsavedFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static final long MEMBER_OFFSET__Filename = LAYOUT_DATA.state(0).byteOffset();
    @java.lang.Override public java.lang.foreign.MemorySegment Filename() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename);}
    @java.lang.Override public void Filename(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Filename, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $Filename() {return this.ptr.asSlice(MEMBER_OFFSET__Filename, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Contents = LAYOUT_DATA.state(1).byteOffset();
    @java.lang.Override public java.lang.foreign.MemorySegment Contents() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents);}
    @java.lang.Override public void Contents(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Contents, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $Contents() {return this.ptr.asSlice(MEMBER_OFFSET__Contents, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Length = LAYOUT_DATA.state(2).byteOffset();
    public long Length() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__Length);}
    public void Length(long value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__Length, value);}
    public java.lang.foreign.MemorySegment $Length() {return this.ptr.asSlice(MEMBER_OFFSET__Length, java.lang.foreign.ValueLayout.JAVA_LONG);}
}
