/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entityInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXCursor.LAYOUT_DATA.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.CXIdxLoc.LAYOUT_DATA.layout.withName("loc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("semanticContainer")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("lexicalContainer")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isRedeclaration")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isDefinition")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isContainer")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declAsContainer")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attributes")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("flags"))
    ));

    public CXIdxDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXIdxDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxDeclInfo(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXIdxDeclInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__entityInfo = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment entityInfo() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entityInfo);}
    public void entityInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entityInfo, value);}
    public java.lang.foreign.MemorySegment $entityInfo() {return this.ptr.asSlice(MEMBER_OFFSET__entityInfo, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

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

    public static final long MEMBER_OFFSET__semanticContainer = LAYOUT_DATA.state(3).byteOffset();
    public java.lang.foreign.MemorySegment semanticContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__semanticContainer);}
    public void semanticContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__semanticContainer, value);}
    public java.lang.foreign.MemorySegment $semanticContainer() {return this.ptr.asSlice(MEMBER_OFFSET__semanticContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__lexicalContainer = LAYOUT_DATA.state(4).byteOffset();
    public java.lang.foreign.MemorySegment lexicalContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__lexicalContainer);}
    public void lexicalContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__lexicalContainer, value);}
    public java.lang.foreign.MemorySegment $lexicalContainer() {return this.ptr.asSlice(MEMBER_OFFSET__lexicalContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__isRedeclaration = LAYOUT_DATA.state(5).byteOffset();
    public int isRedeclaration() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isRedeclaration);}
    public void isRedeclaration(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isRedeclaration, value);}
    public java.lang.foreign.MemorySegment $isRedeclaration() {return this.ptr.asSlice(MEMBER_OFFSET__isRedeclaration, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isDefinition = LAYOUT_DATA.state(6).byteOffset();
    public int isDefinition() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isDefinition);}
    public void isDefinition(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isDefinition, value);}
    public java.lang.foreign.MemorySegment $isDefinition() {return this.ptr.asSlice(MEMBER_OFFSET__isDefinition, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__isContainer = LAYOUT_DATA.state(7).byteOffset();
    public int isContainer() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isContainer);}
    public void isContainer(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isContainer, value);}
    public java.lang.foreign.MemorySegment $isContainer() {return this.ptr.asSlice(MEMBER_OFFSET__isContainer, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__declAsContainer = LAYOUT_DATA.state(8).byteOffset();
    public java.lang.foreign.MemorySegment declAsContainer() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declAsContainer);}
    public void declAsContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__declAsContainer, value);}
    public java.lang.foreign.MemorySegment $declAsContainer() {return this.ptr.asSlice(MEMBER_OFFSET__declAsContainer, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__isImplicit = LAYOUT_DATA.state(9).byteOffset();
    public int isImplicit() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__isImplicit, value);}
    public java.lang.foreign.MemorySegment $isImplicit() {return this.ptr.asSlice(MEMBER_OFFSET__isImplicit, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__attributes = LAYOUT_DATA.state(10).byteOffset();
    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__attributes, value);}
    public java.lang.foreign.MemorySegment $attributes() {return this.ptr.asSlice(MEMBER_OFFSET__attributes, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numAttributes = LAYOUT_DATA.state(11).byteOffset();
    public int numAttributes() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes);}
    public void numAttributes(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numAttributes, value);}
    public java.lang.foreign.MemorySegment $numAttributes() {return this.ptr.asSlice(MEMBER_OFFSET__numAttributes, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__flags = LAYOUT_DATA.state(12).byteOffset();
    public int flags() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__flags);}
    public void flags(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(MEMBER_OFFSET__flags, java.lang.foreign.ValueLayout.JAVA_INT);}
}
