/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entityInfo"),
            fr.kenlek.jpgen.clang.CXCursor.LAYOUT.withName("cursor"),
            fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.withName("loc"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("semanticContainer"),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("lexicalContainer"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isRedeclaration"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isDefinition"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isContainer"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declAsContainer"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attributes"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("flags")
    ).withByteAlignment(8);

    public CXIdxDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__entityInfo = 0;
    public java.lang.foreign.MemorySegment entityInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entityInfo);}
    public void entityInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entityInfo, value);}
    public java.lang.foreign.MemorySegment $entityInfo() {return this.ptr.asSlice(MEMBER_OFFSET__entityInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__cursor = 8;
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT);}

    public static final long MEMBER_OFFSET__loc = 40;
    public fr.kenlek.jpgen.clang.CXIdxLoc loc() {return new fr.kenlek.jpgen.clang.CXIdxLoc(this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT));}
    public void loc(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.kenlek.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $loc() {return this.ptr.asSlice(MEMBER_OFFSET__loc, fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT);}

    public static final long MEMBER_OFFSET__semanticContainer = 64;
    public java.lang.foreign.MemorySegment semanticContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__semanticContainer);}
    public void semanticContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__semanticContainer, value);}
    public java.lang.foreign.MemorySegment $semanticContainer() {return this.ptr.asSlice(MEMBER_OFFSET__semanticContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__lexicalContainer = 72;
    public java.lang.foreign.MemorySegment lexicalContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__lexicalContainer);}
    public void lexicalContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__lexicalContainer, value);}
    public java.lang.foreign.MemorySegment $lexicalContainer() {return this.ptr.asSlice(MEMBER_OFFSET__lexicalContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__isRedeclaration = 80;
    public int isRedeclaration() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isRedeclaration);}
    public void isRedeclaration(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isRedeclaration, value);}
    public java.lang.foreign.MemorySegment $isRedeclaration() {return this.ptr.asSlice(MEMBER_OFFSET__isRedeclaration, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isDefinition = 84;
    public int isDefinition() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isDefinition);}
    public void isDefinition(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isDefinition, value);}
    public java.lang.foreign.MemorySegment $isDefinition() {return this.ptr.asSlice(MEMBER_OFFSET__isDefinition, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isContainer = 88;
    public int isContainer() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isContainer);}
    public void isContainer(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isContainer, value);}
    public java.lang.foreign.MemorySegment $isContainer() {return this.ptr.asSlice(MEMBER_OFFSET__isContainer, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__declAsContainer = 96;
    public java.lang.foreign.MemorySegment declAsContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declAsContainer);}
    public void declAsContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declAsContainer, value);}
    public java.lang.foreign.MemorySegment $declAsContainer() {return this.ptr.asSlice(MEMBER_OFFSET__declAsContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__isImplicit = 104;
    public int isImplicit() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit, value);}
    public java.lang.foreign.MemorySegment $isImplicit() {return this.ptr.asSlice(MEMBER_OFFSET__isImplicit, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__attributes = 112;
    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes, value);}
    public java.lang.foreign.MemorySegment $attributes() {return this.ptr.asSlice(MEMBER_OFFSET__attributes, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numAttributes = 120;
    public int numAttributes() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes);}
    public void numAttributes(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes, value);}
    public java.lang.foreign.MemorySegment $numAttributes() {return this.ptr.asSlice(MEMBER_OFFSET__numAttributes, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__flags = 124;
    public int flags() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__flags);}
    public void flags(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(MEMBER_OFFSET__flags, java.lang.foreign.ValueLayout.JAVA_INT);}
}
