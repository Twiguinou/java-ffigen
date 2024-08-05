package fr.kenlek.jpgen.clang;

public record CXIdxEntityInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__templateKind = java.lang.foreign.ValueLayout.JAVA_INT.withName("templateKind");
    public static final long OFFSET__templateKind = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lang = java.lang.foreign.ValueLayout.JAVA_INT.withName("lang");
    public static final long OFFSET__lang = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__name = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("name");
    public static final long OFFSET__name = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__USR = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("USR");
    public static final long OFFSET__USR = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor = fr.kenlek.jpgen.clang.CXCursor.gRecordLayout.withName("cursor");
    public static final long OFFSET__cursor = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__attributes = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("attributes");
    public static final long OFFSET__attributes = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numAttributes = java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes");
    public static final long OFFSET__numAttributes = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            LAYOUT__templateKind,
            LAYOUT__lang,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__name,
            LAYOUT__USR,
            LAYOUT__cursor,
            LAYOUT__attributes,
            LAYOUT__numAttributes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxEntityInfo");

    public CXIdxEntityInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxEntityInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxEntityInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxEntityInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public int templateKind() {return this.ptr.get(LAYOUT__templateKind, OFFSET__templateKind);}
    public void templateKind(int value) {this.ptr.set(LAYOUT__templateKind, OFFSET__templateKind, value);}
    public java.lang.foreign.MemorySegment $templateKind() {return this.ptr.asSlice(OFFSET__templateKind, LAYOUT__templateKind);}

    public int lang() {return this.ptr.get(LAYOUT__lang, OFFSET__lang);}
    public void lang(int value) {this.ptr.set(LAYOUT__lang, OFFSET__lang, value);}
    public java.lang.foreign.MemorySegment $lang() {return this.ptr.asSlice(OFFSET__lang, LAYOUT__lang);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.get(LAYOUT__name, OFFSET__name);}
    public void name(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__name, OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this.ptr.asSlice(OFFSET__name, LAYOUT__name);}

    public java.lang.foreign.MemorySegment USR() {return this.ptr.get(LAYOUT__USR, OFFSET__USR);}
    public void USR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__USR, OFFSET__USR, value);}
    public java.lang.foreign.MemorySegment $USR() {return this.ptr.asSlice(OFFSET__USR, LAYOUT__USR);}

    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__cursor, LAYOUT__cursor));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__cursor, LAYOUT__cursor.byteSize());}

    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(LAYOUT__attributes, OFFSET__attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__attributes, OFFSET__attributes, value);}
    public java.lang.foreign.MemorySegment $attributes() {return this.ptr.asSlice(OFFSET__attributes, LAYOUT__attributes);}

    public int numAttributes() {return this.ptr.get(LAYOUT__numAttributes, OFFSET__numAttributes);}
    public void numAttributes(int value) {this.ptr.set(LAYOUT__numAttributes, OFFSET__numAttributes, value);}
    public java.lang.foreign.MemorySegment $numAttributes() {return this.ptr.asSlice(OFFSET__numAttributes, LAYOUT__numAttributes);}
}
