package jpgen.clang;

public record CXIdxEntityInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$templateKind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$templateKind = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lang = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$lang = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$name = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$name = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$USR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$USR = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$attributes = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$attributes = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numAttributes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$numAttributes = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$kind,
            LAYOUT$templateKind,
            LAYOUT$lang,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$name,
            LAYOUT$USR,
            LAYOUT$cursor,
            LAYOUT$attributes,
            LAYOUT$numAttributes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxEntityInfo");

    public CXIdxEntityInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxEntityInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxEntityInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public int templateKind() {return this.ptr.get(LAYOUT$templateKind, OFFSET$templateKind);}
    public void templateKind(int value) {this.ptr.set(LAYOUT$templateKind, OFFSET$templateKind, value);}
    public java.lang.foreign.MemorySegment templateKind_ptr() {return this.ptr.asSlice(OFFSET$templateKind, LAYOUT$templateKind);}

    public int lang() {return this.ptr.get(LAYOUT$lang, OFFSET$lang);}
    public void lang(int value) {this.ptr.set(LAYOUT$lang, OFFSET$lang, value);}
    public java.lang.foreign.MemorySegment lang_ptr() {return this.ptr.asSlice(OFFSET$lang, LAYOUT$lang);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.get(LAYOUT$name, OFFSET$name);}
    public void name(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$name, OFFSET$name, value);}
    public java.lang.foreign.MemorySegment name_ptr() {return this.ptr.asSlice(OFFSET$name, LAYOUT$name);}

    public java.lang.foreign.MemorySegment USR() {return this.ptr.get(LAYOUT$USR, OFFSET$USR);}
    public void USR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$USR, OFFSET$USR, value);}
    public java.lang.foreign.MemorySegment USR_ptr() {return this.ptr.asSlice(OFFSET$USR, LAYOUT$USR);}

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$cursor, LAYOUT$cursor.byteSize());}

    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(LAYOUT$attributes, OFFSET$attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$attributes, OFFSET$attributes, value);}
    public java.lang.foreign.MemorySegment attributes_ptr() {return this.ptr.asSlice(OFFSET$attributes, LAYOUT$attributes);}

    public int numAttributes() {return this.ptr.get(LAYOUT$numAttributes, OFFSET$numAttributes);}
    public void numAttributes(int value) {this.ptr.set(LAYOUT$numAttributes, OFFSET$numAttributes, value);}
    public java.lang.foreign.MemorySegment numAttributes_ptr() {return this.ptr.asSlice(OFFSET$numAttributes, LAYOUT$numAttributes);}
}
