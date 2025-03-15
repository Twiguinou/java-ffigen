package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxDeclInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("entityInfo"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc"),
        UNBOUNDED_POINTER.withName("semanticContainer"),
        UNBOUNDED_POINTER.withName("lexicalContainer"),
        JAVA_INT.withName("isRedeclaration"),
        JAVA_INT.withName("isDefinition"),
        JAVA_INT.withName("isContainer"),
        UNBOUNDED_POINTER.withName("declAsContainer"),
        JAVA_INT.withName("isImplicit"),
        UNBOUNDED_POINTER.withName("attributes"),
        JAVA_INT.withName("numAttributes"),
        JAVA_INT.withName("flags")
    ).withName("CXIdxDeclInfo");
    public static final long OFFSET__entityInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("entityInfo"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));
    public static final long OFFSET__semanticContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("semanticContainer"));
    public static final long OFFSET__lexicalContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("lexicalContainer"));
    public static final long OFFSET__isRedeclaration = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isRedeclaration"));
    public static final long OFFSET__isDefinition = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isDefinition"));
    public static final long OFFSET__isContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isContainer"));
    public static final long OFFSET__declAsContainer = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declAsContainer"));
    public static final long OFFSET__isImplicit = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("isImplicit"));
    public static final long OFFSET__attributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attributes"));
    public static final long OFFSET__numAttributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numAttributes"));
    public static final long OFFSET__flags = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("flags"));

    public CXIdxDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxDeclInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxDeclInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment entityInfo()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__entityInfo);
    }

    public void entityInfo(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__entityInfo, value);
    }

    public MemorySegment $entityInfo()
    {
        return this.ptr().asSlice(OFFSET__entityInfo, UNBOUNDED_POINTER);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public void cursor(CXCursor value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__cursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $cursor()
    {
        return this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public void loc(CXIdxLoc value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__loc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $loc()
    {
        return this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT);
    }

    public MemorySegment semanticContainer()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__semanticContainer);
    }

    public void semanticContainer(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__semanticContainer, value);
    }

    public MemorySegment $semanticContainer()
    {
        return this.ptr().asSlice(OFFSET__semanticContainer, UNBOUNDED_POINTER);
    }

    public MemorySegment lexicalContainer()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__lexicalContainer);
    }

    public void lexicalContainer(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__lexicalContainer, value);
    }

    public MemorySegment $lexicalContainer()
    {
        return this.ptr().asSlice(OFFSET__lexicalContainer, UNBOUNDED_POINTER);
    }

    public int isRedeclaration()
    {
        return this.ptr().get(JAVA_INT, OFFSET__isRedeclaration);
    }

    public void isRedeclaration(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__isRedeclaration, value);
    }

    public MemorySegment $isRedeclaration()
    {
        return this.ptr().asSlice(OFFSET__isRedeclaration, JAVA_INT);
    }

    public int isDefinition()
    {
        return this.ptr().get(JAVA_INT, OFFSET__isDefinition);
    }

    public void isDefinition(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__isDefinition, value);
    }

    public MemorySegment $isDefinition()
    {
        return this.ptr().asSlice(OFFSET__isDefinition, JAVA_INT);
    }

    public int isContainer()
    {
        return this.ptr().get(JAVA_INT, OFFSET__isContainer);
    }

    public void isContainer(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__isContainer, value);
    }

    public MemorySegment $isContainer()
    {
        return this.ptr().asSlice(OFFSET__isContainer, JAVA_INT);
    }

    public MemorySegment declAsContainer()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__declAsContainer);
    }

    public void declAsContainer(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__declAsContainer, value);
    }

    public MemorySegment $declAsContainer()
    {
        return this.ptr().asSlice(OFFSET__declAsContainer, UNBOUNDED_POINTER);
    }

    public int isImplicit()
    {
        return this.ptr().get(JAVA_INT, OFFSET__isImplicit);
    }

    public void isImplicit(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__isImplicit, value);
    }

    public MemorySegment $isImplicit()
    {
        return this.ptr().asSlice(OFFSET__isImplicit, JAVA_INT);
    }

    public MemorySegment attributes()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__attributes);
    }

    public void attributes(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__attributes, value);
    }

    public MemorySegment $attributes()
    {
        return this.ptr().asSlice(OFFSET__attributes, UNBOUNDED_POINTER);
    }

    public int numAttributes()
    {
        return this.ptr().get(JAVA_INT, OFFSET__numAttributes);
    }

    public void numAttributes(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__numAttributes, value);
    }

    public MemorySegment $numAttributes()
    {
        return this.ptr().asSlice(OFFSET__numAttributes, JAVA_INT);
    }

    public int flags()
    {
        return this.ptr().get(JAVA_INT, OFFSET__flags);
    }

    public void flags(int value)
    {
        this.ptr().set(JAVA_INT, OFFSET__flags, value);
    }

    public MemorySegment $flags()
    {
        return this.ptr().asSlice(OFFSET__flags, JAVA_INT);
    }
}
