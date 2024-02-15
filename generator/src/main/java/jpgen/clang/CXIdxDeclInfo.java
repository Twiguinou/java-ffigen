package jpgen.clang;

public record CXIdxDeclInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$entityInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$entityInfo = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$loc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$loc = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$semanticContainer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$semanticContainer = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$lexicalContainer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$lexicalContainer = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isRedeclaration = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isRedeclaration = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isDefinition = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isDefinition = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isContainer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isContainer = 88L;
    public static final java.lang.foreign.AddressLayout LAYOUT$declAsContainer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$declAsContainer = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isImplicit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isImplicit = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$attributes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$attributes = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numAttributes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$numAttributes = 120L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 124L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$entityInfo,
            LAYOUT$cursor,
            LAYOUT$loc,
            LAYOUT$semanticContainer,
            LAYOUT$lexicalContainer,
            LAYOUT$isRedeclaration,
            LAYOUT$isDefinition,
            LAYOUT$isContainer,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$declAsContainer,
            LAYOUT$isImplicit,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$attributes,
            LAYOUT$numAttributes,
            LAYOUT$flags
    ).withName("CXIdxDeclInfo");

    public CXIdxDeclInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxDeclInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxDeclInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment entityInfo() {return this.ptr.get(LAYOUT$entityInfo, OFFSET$entityInfo);}
    public void entityInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$entityInfo, OFFSET$entityInfo, value);}
    public java.lang.foreign.MemorySegment entityInfo_ptr() {return this.ptr.asSlice(OFFSET$entityInfo, LAYOUT$entityInfo);}

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$cursor, LAYOUT$cursor.byteSize());}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
    public void loc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$loc, LAYOUT$loc.byteSize());}

    public java.lang.foreign.MemorySegment semanticContainer() {return this.ptr.get(LAYOUT$semanticContainer, OFFSET$semanticContainer);}
    public void semanticContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$semanticContainer, OFFSET$semanticContainer, value);}
    public java.lang.foreign.MemorySegment semanticContainer_ptr() {return this.ptr.asSlice(OFFSET$semanticContainer, LAYOUT$semanticContainer);}

    public java.lang.foreign.MemorySegment lexicalContainer() {return this.ptr.get(LAYOUT$lexicalContainer, OFFSET$lexicalContainer);}
    public void lexicalContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$lexicalContainer, OFFSET$lexicalContainer, value);}
    public java.lang.foreign.MemorySegment lexicalContainer_ptr() {return this.ptr.asSlice(OFFSET$lexicalContainer, LAYOUT$lexicalContainer);}

    public int isRedeclaration() {return this.ptr.get(LAYOUT$isRedeclaration, OFFSET$isRedeclaration);}
    public void isRedeclaration(int value) {this.ptr.set(LAYOUT$isRedeclaration, OFFSET$isRedeclaration, value);}
    public java.lang.foreign.MemorySegment isRedeclaration_ptr() {return this.ptr.asSlice(OFFSET$isRedeclaration, LAYOUT$isRedeclaration);}

    public int isDefinition() {return this.ptr.get(LAYOUT$isDefinition, OFFSET$isDefinition);}
    public void isDefinition(int value) {this.ptr.set(LAYOUT$isDefinition, OFFSET$isDefinition, value);}
    public java.lang.foreign.MemorySegment isDefinition_ptr() {return this.ptr.asSlice(OFFSET$isDefinition, LAYOUT$isDefinition);}

    public int isContainer() {return this.ptr.get(LAYOUT$isContainer, OFFSET$isContainer);}
    public void isContainer(int value) {this.ptr.set(LAYOUT$isContainer, OFFSET$isContainer, value);}
    public java.lang.foreign.MemorySegment isContainer_ptr() {return this.ptr.asSlice(OFFSET$isContainer, LAYOUT$isContainer);}

    public java.lang.foreign.MemorySegment declAsContainer() {return this.ptr.get(LAYOUT$declAsContainer, OFFSET$declAsContainer);}
    public void declAsContainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$declAsContainer, OFFSET$declAsContainer, value);}
    public java.lang.foreign.MemorySegment declAsContainer_ptr() {return this.ptr.asSlice(OFFSET$declAsContainer, LAYOUT$declAsContainer);}

    public int isImplicit() {return this.ptr.get(LAYOUT$isImplicit, OFFSET$isImplicit);}
    public void isImplicit(int value) {this.ptr.set(LAYOUT$isImplicit, OFFSET$isImplicit, value);}
    public java.lang.foreign.MemorySegment isImplicit_ptr() {return this.ptr.asSlice(OFFSET$isImplicit, LAYOUT$isImplicit);}

    public java.lang.foreign.MemorySegment attributes() {return this.ptr.get(LAYOUT$attributes, OFFSET$attributes);}
    public void attributes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$attributes, OFFSET$attributes, value);}
    public java.lang.foreign.MemorySegment attributes_ptr() {return this.ptr.asSlice(OFFSET$attributes, LAYOUT$attributes);}

    public int numAttributes() {return this.ptr.get(LAYOUT$numAttributes, OFFSET$numAttributes);}
    public void numAttributes(int value) {this.ptr.set(LAYOUT$numAttributes, OFFSET$numAttributes, value);}
    public java.lang.foreign.MemorySegment numAttributes_ptr() {return this.ptr.asSlice(OFFSET$numAttributes, LAYOUT$numAttributes);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}
