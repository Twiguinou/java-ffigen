/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxEntityRefInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxEntityRefInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout.withName("loc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("referencedEntity")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("parentEntity")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("container")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("role"))
    ));

    public CXIdxEntityRefInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXIdxEntityRefInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxEntityRefInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXIdxEntityRefInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = LAYOUT_DATA.state(0).byteOffset();
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__cursor = LAYOUT_DATA.state(1).byteOffset();
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout);}

    public static final long MEMBER_OFFSET__loc = LAYOUT_DATA.state(2).byteOffset();
    public fr.kenlek.jpgen.clang.CXIdxLoc loc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout));}
    public void loc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout.byteSize());}
    public java.lang.foreign.MemorySegment $loc() {return this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout);}

    public static final long MEMBER_OFFSET__referencedEntity = LAYOUT_DATA.state(3).byteOffset();
    public java.lang.foreign.MemorySegment referencedEntity() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__referencedEntity);}
    public void referencedEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__referencedEntity, value);}
    public java.lang.foreign.MemorySegment $referencedEntity() {return this.ptr.asSlice(MEMBER_OFFSET__referencedEntity, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__parentEntity = LAYOUT_DATA.state(4).byteOffset();
    public java.lang.foreign.MemorySegment parentEntity() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__parentEntity);}
    public void parentEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__parentEntity, value);}
    public java.lang.foreign.MemorySegment $parentEntity() {return this.ptr.asSlice(MEMBER_OFFSET__parentEntity, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__container = LAYOUT_DATA.state(5).byteOffset();
    public java.lang.foreign.MemorySegment container() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__container);}
    public void container(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__container, value);}
    public java.lang.foreign.MemorySegment $container() {return this.ptr.asSlice(MEMBER_OFFSET__container, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__role = LAYOUT_DATA.state(6).byteOffset();
    public int role() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__role);}
    public void role(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__role, value);}
    public java.lang.foreign.MemorySegment $role() {return this.ptr.asSlice(MEMBER_OFFSET__role, java.lang.foreign.ValueLayout.JAVA_INT);}
}
