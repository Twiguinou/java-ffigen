/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxEntityRefInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("kind"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.clang.CXCursor.LAYOUT.withName("cursor"),
            fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.withName("loc"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("referencedEntity"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("parentEntity"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("container"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("role"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxEntityRefInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxEntityRefInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxEntityRefInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityRefInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = ((0 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__cursor = ((8 / fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize()) * fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT);}

    public static final long MEMBER_OFFSET__loc = ((40 / fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize()) * fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());
    public fr.kenlek.jpgen.clang.CXIdxLoc loc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT));}
    public void loc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $loc() {return this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT);}

    public static final long MEMBER_OFFSET__referencedEntity = ((64 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment referencedEntity() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__referencedEntity);}
    public void referencedEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__referencedEntity, value);}
    public java.lang.foreign.MemorySegment $referencedEntity() {return this.ptr.asSlice(MEMBER_OFFSET__referencedEntity, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__parentEntity = ((72 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment parentEntity() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__parentEntity);}
    public void parentEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__parentEntity, value);}
    public java.lang.foreign.MemorySegment $parentEntity() {return this.ptr.asSlice(MEMBER_OFFSET__parentEntity, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__container = ((80 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment container() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__container);}
    public void container(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__container, value);}
    public java.lang.foreign.MemorySegment $container() {return this.ptr.asSlice(MEMBER_OFFSET__container, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__role = ((88 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int role() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__role);}
    public void role(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__role, value);}
    public java.lang.foreign.MemorySegment $role() {return this.ptr.asSlice(MEMBER_OFFSET__role, java.lang.foreign.ValueLayout.JAVA_INT);}
}
