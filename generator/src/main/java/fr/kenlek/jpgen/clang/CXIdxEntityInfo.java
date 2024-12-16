/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxEntityInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("kind"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("templateKind"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("lang"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("name"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("USR"),
            fr.kenlek.jpgen.clang.CXCursor.LAYOUT.withName("cursor"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attributes"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxEntityInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxEntityInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxEntityInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxEntityInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = 0;
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__templateKind = 4;
    public int templateKind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__templateKind);}
    public void templateKind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__templateKind, value);}
    public java.lang.foreign.MemorySegment $templateKind() {return this.ptr.asSlice(MEMBER_OFFSET__templateKind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__lang = 8;
    public int lang() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__lang);}
    public void lang(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__lang, value);}
    public java.lang.foreign.MemorySegment $lang() {return this.ptr.asSlice(MEMBER_OFFSET__lang, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__name = 16;
    public java.lang.foreign.MemorySegment name() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__name);}
    public void name(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this.ptr.asSlice(MEMBER_OFFSET__name, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__USR = 24;
    public java.lang.foreign.MemorySegment USR() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__USR);}
    public void USR(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__USR, value);}
    public java.lang.foreign.MemorySegment $USR() {return this.ptr.asSlice(MEMBER_OFFSET__USR, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__cursor = 32;
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT);}

    public static final long MEMBER_OFFSET__attributes = 64;
    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes, value);}
    public java.lang.foreign.MemorySegment $attributes() {return this.ptr.asSlice(MEMBER_OFFSET__attributes, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numAttributes = 72;
    public int numAttributes() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes);}
    public void numAttributes(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes, value);}
    public java.lang.foreign.MemorySegment $numAttributes() {return this.ptr.asSlice(MEMBER_OFFSET__numAttributes, java.lang.foreign.ValueLayout.JAVA_INT);}
}
