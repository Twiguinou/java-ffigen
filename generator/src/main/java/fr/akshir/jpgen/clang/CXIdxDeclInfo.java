package fr.akshir.jpgen.clang;

public record CXIdxDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__entityInfo = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("entityInfo");
    public static final long OFFSET__entityInfo = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor = fr.akshir.jpgen.clang.CXCursor.gRecordLayout.withName("cursor");
    public static final long OFFSET__cursor = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__loc = fr.akshir.jpgen.clang.CXIdxLoc.gRecordLayout.withName("loc");
    public static final long OFFSET__loc = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__semanticContainer = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("semanticContainer");
    public static final long OFFSET__semanticContainer = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__lexicalContainer = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("lexicalContainer");
    public static final long OFFSET__lexicalContainer = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isRedeclaration = java.lang.foreign.ValueLayout.JAVA_INT.withName("isRedeclaration");
    public static final long OFFSET__isRedeclaration = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isDefinition = java.lang.foreign.ValueLayout.JAVA_INT.withName("isDefinition");
    public static final long OFFSET__isDefinition = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isContainer = java.lang.foreign.ValueLayout.JAVA_INT.withName("isContainer");
    public static final long OFFSET__isContainer = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__declAsContainer = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("declAsContainer");
    public static final long OFFSET__declAsContainer = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isImplicit = java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit");
    public static final long OFFSET__isImplicit = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__attributes = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("attributes");
    public static final long OFFSET__attributes = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numAttributes = java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes");
    public static final long OFFSET__numAttributes = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 124;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__entityInfo,
            LAYOUT__cursor,
            LAYOUT__loc,
            LAYOUT__semanticContainer,
            LAYOUT__lexicalContainer,
            LAYOUT__isRedeclaration,
            LAYOUT__isDefinition,
            LAYOUT__isContainer,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__declAsContainer,
            LAYOUT__isImplicit,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__attributes,
            LAYOUT__numAttributes,
            LAYOUT__flags
    ).withByteAlignment(8).withName("CXIdxDeclInfo");

    public CXIdxDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxDeclInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxDeclInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment entityInfo() {return this.ptr.get(LAYOUT__entityInfo, OFFSET__entityInfo);}
    public void entityInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__entityInfo, OFFSET__entityInfo, value);}
    public java.lang.foreign.MemorySegment $entityInfo() {return this.ptr.asSlice(OFFSET__entityInfo, LAYOUT__entityInfo);}

    public fr.akshir.jpgen.clang.CXCursor cursor() {return new fr.akshir.jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__cursor, LAYOUT__cursor));}
    public void cursor(java.util.function.Consumer<fr.akshir.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.akshir.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__cursor, LAYOUT__cursor.byteSize());}

    public fr.akshir.jpgen.clang.CXIdxLoc loc() {return new fr.akshir.jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__loc, LAYOUT__loc));}
    public void loc(java.util.function.Consumer<fr.akshir.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.akshir.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__loc, LAYOUT__loc.byteSize());}

    public java.lang.foreign.MemorySegment semanticContainer() {return this.ptr.get(LAYOUT__semanticContainer, OFFSET__semanticContainer);}
    public void semanticContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__semanticContainer, OFFSET__semanticContainer, value);}
    public java.lang.foreign.MemorySegment $semanticContainer() {return this.ptr.asSlice(OFFSET__semanticContainer, LAYOUT__semanticContainer);}

    public java.lang.foreign.MemorySegment lexicalContainer() {return this.ptr.get(LAYOUT__lexicalContainer, OFFSET__lexicalContainer);}
    public void lexicalContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__lexicalContainer, OFFSET__lexicalContainer, value);}
    public java.lang.foreign.MemorySegment $lexicalContainer() {return this.ptr.asSlice(OFFSET__lexicalContainer, LAYOUT__lexicalContainer);}

    public int isRedeclaration() {return this.ptr.get(LAYOUT__isRedeclaration, OFFSET__isRedeclaration);}
    public void isRedeclaration(int value) {this.ptr.set(LAYOUT__isRedeclaration, OFFSET__isRedeclaration, value);}
    public java.lang.foreign.MemorySegment $isRedeclaration() {return this.ptr.asSlice(OFFSET__isRedeclaration, LAYOUT__isRedeclaration);}

    public int isDefinition() {return this.ptr.get(LAYOUT__isDefinition, OFFSET__isDefinition);}
    public void isDefinition(int value) {this.ptr.set(LAYOUT__isDefinition, OFFSET__isDefinition, value);}
    public java.lang.foreign.MemorySegment $isDefinition() {return this.ptr.asSlice(OFFSET__isDefinition, LAYOUT__isDefinition);}

    public int isContainer() {return this.ptr.get(LAYOUT__isContainer, OFFSET__isContainer);}
    public void isContainer(int value) {this.ptr.set(LAYOUT__isContainer, OFFSET__isContainer, value);}
    public java.lang.foreign.MemorySegment $isContainer() {return this.ptr.asSlice(OFFSET__isContainer, LAYOUT__isContainer);}

    public java.lang.foreign.MemorySegment declAsContainer() {return this.ptr.get(LAYOUT__declAsContainer, OFFSET__declAsContainer);}
    public void declAsContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__declAsContainer, OFFSET__declAsContainer, value);}
    public java.lang.foreign.MemorySegment $declAsContainer() {return this.ptr.asSlice(OFFSET__declAsContainer, LAYOUT__declAsContainer);}

    public int isImplicit() {return this.ptr.get(LAYOUT__isImplicit, OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr.set(LAYOUT__isImplicit, OFFSET__isImplicit, value);}
    public java.lang.foreign.MemorySegment $isImplicit() {return this.ptr.asSlice(OFFSET__isImplicit, LAYOUT__isImplicit);}

    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(LAYOUT__attributes, OFFSET__attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__attributes, OFFSET__attributes, value);}
    public java.lang.foreign.MemorySegment $attributes() {return this.ptr.asSlice(OFFSET__attributes, LAYOUT__attributes);}

    public int numAttributes() {return this.ptr.get(LAYOUT__numAttributes, OFFSET__numAttributes);}
    public void numAttributes(int value) {this.ptr.set(LAYOUT__numAttributes, OFFSET__numAttributes, value);}
    public java.lang.foreign.MemorySegment $numAttributes() {return this.ptr.asSlice(OFFSET__numAttributes, LAYOUT__numAttributes);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
