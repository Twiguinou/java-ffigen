package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("entityInfo"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc"),
        ADDRESS.withName("semanticContainer"),
        ADDRESS.withName("lexicalContainer"),
        JAVA_INT.withName("isRedeclaration"),
        JAVA_INT.withName("isDefinition"),
        JAVA_INT.withName("isContainer"),
        ADDRESS.withName("declAsContainer"),
        JAVA_INT.withName("isImplicit"),
        ADDRESS.withName("attributes"),
        JAVA_INT.withName("numAttributes"),
        JAVA_INT.withName("flags")
    ).withName("CXIdxDeclInfo");
    public static final long OFFSET_entityInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("entityInfo"));
    public static final long OFFSET_cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET_loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET_semanticContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("semanticContainer"));
    public static final long OFFSET_lexicalContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("lexicalContainer"));
    public static final long OFFSET_isRedeclaration = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isRedeclaration"));
    public static final long OFFSET_isDefinition = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isDefinition"));
    public static final long OFFSET_isContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isContainer"));
    public static final long OFFSET_declAsContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declAsContainer"));
    public static final long OFFSET_isImplicit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImplicit"));
    public static final long OFFSET_attributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attributes"));
    public static final long OFFSET_numAttributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numAttributes"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("flags"));

    public CXIdxDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxDeclInfo::new);
    }

    public static Buffer<CXIdxDeclInfo> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXIdxDeclInfo::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXIdxDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment entityInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_entityInfo);
    }

    public void entityInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_entityInfo, value);
    }

    public MemorySegment $entityInfo()
    {
        return this.pointer().asSlice(OFFSET_entityInfo, ADDRESS);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_cursor, CXCursor.LAYOUT));
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET_loc, CXIdxLoc.LAYOUT));
    }

    public MemorySegment semanticContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET_semanticContainer);
    }

    public void semanticContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_semanticContainer, value);
    }

    public MemorySegment $semanticContainer()
    {
        return this.pointer().asSlice(OFFSET_semanticContainer, ADDRESS);
    }

    public MemorySegment lexicalContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET_lexicalContainer);
    }

    public void lexicalContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_lexicalContainer, value);
    }

    public MemorySegment $lexicalContainer()
    {
        return this.pointer().asSlice(OFFSET_lexicalContainer, ADDRESS);
    }

    public boolean isRedeclaration()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isRedeclaration) != 0;
    }

    public void isRedeclaration(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isRedeclaration, value ? 1 : 0);
    }

    public MemorySegment $isRedeclaration()
    {
        return this.pointer().asSlice(OFFSET_isRedeclaration, JAVA_INT);
    }

    public boolean isDefinition()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isDefinition) != 0;
    }

    public void isDefinition(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isDefinition, value ? 1 : 0);
    }

    public MemorySegment $isDefinition()
    {
        return this.pointer().asSlice(OFFSET_isDefinition, JAVA_INT);
    }

    public boolean isContainer()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isContainer) != 0;
    }

    public void isContainer(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isContainer, value ? 1 : 0);
    }

    public MemorySegment $isContainer()
    {
        return this.pointer().asSlice(OFFSET_isContainer, JAVA_INT);
    }

    public MemorySegment declAsContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET_declAsContainer);
    }

    public void declAsContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_declAsContainer, value);
    }

    public MemorySegment $declAsContainer()
    {
        return this.pointer().asSlice(OFFSET_declAsContainer, ADDRESS);
    }

    public boolean isImplicit()
    {
        return this.pointer().get(JAVA_INT, OFFSET_isImplicit) != 0;
    }

    public void isImplicit(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET_isImplicit, value ? 1 : 0);
    }

    public MemorySegment $isImplicit()
    {
        return this.pointer().asSlice(OFFSET_isImplicit, JAVA_INT);
    }

    public Buffer<MemorySegment> attributes()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numAttributes(), ADDRESS)), OFFSET_attributes
        ));
    }

    public void attributes(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET_attributes, value.pointer());
    }

    public MemorySegment $attributes()
    {
        return this.pointer().asSlice(OFFSET_attributes, ADDRESS);
    }

    public int numAttributes()
    {
        return this.pointer().get(JAVA_INT, OFFSET_numAttributes);
    }

    public void numAttributes(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_numAttributes, value);
    }

    public MemorySegment $numAttributes()
    {
        return this.pointer().asSlice(OFFSET_numAttributes, JAVA_INT);
    }

    public int flags()
    {
        return this.pointer().get(JAVA_INT, OFFSET_flags);
    }

    public void flags(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_flags, value);
    }

    public MemorySegment $flags()
    {
        return this.pointer().asSlice(OFFSET_flags, JAVA_INT);
    }
}
