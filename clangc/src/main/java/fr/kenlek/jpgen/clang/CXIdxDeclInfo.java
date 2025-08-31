package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;

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

    public CXIdxDeclInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxDeclInfo::new);
    }

    public static Buffer<CXIdxDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxDeclInfo::new);
    }

    public static CXIdxDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment entityInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET__entityInfo);
    }

    public void entityInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__entityInfo, value);
    }

    public MemorySegment $entityInfo()
    {
        return this.pointer().asSlice(OFFSET__entityInfo, ADDRESS);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public MemorySegment semanticContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET__semanticContainer);
    }

    public void semanticContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__semanticContainer, value);
    }

    public MemorySegment $semanticContainer()
    {
        return this.pointer().asSlice(OFFSET__semanticContainer, ADDRESS);
    }

    public MemorySegment lexicalContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET__lexicalContainer);
    }

    public void lexicalContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__lexicalContainer, value);
    }

    public MemorySegment $lexicalContainer()
    {
        return this.pointer().asSlice(OFFSET__lexicalContainer, ADDRESS);
    }

    public boolean isRedeclaration()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isRedeclaration) != 0;
    }

    public void isRedeclaration(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isRedeclaration, value ? 1 : 0);
    }

    public MemorySegment $isRedeclaration()
    {
        return this.pointer().asSlice(OFFSET__isRedeclaration, JAVA_INT);
    }

    public boolean isDefinition()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isDefinition) != 0;
    }

    public void isDefinition(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isDefinition, value ? 1 : 0);
    }

    public MemorySegment $isDefinition()
    {
        return this.pointer().asSlice(OFFSET__isDefinition, JAVA_INT);
    }

    public boolean isContainer()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isContainer) != 0;
    }

    public void isContainer(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isContainer, value ? 1 : 0);
    }

    public MemorySegment $isContainer()
    {
        return this.pointer().asSlice(OFFSET__isContainer, JAVA_INT);
    }

    public MemorySegment declAsContainer()
    {
        return this.pointer().get(ADDRESS, OFFSET__declAsContainer);
    }

    public void declAsContainer(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__declAsContainer, value);
    }

    public MemorySegment $declAsContainer()
    {
        return this.pointer().asSlice(OFFSET__declAsContainer, ADDRESS);
    }

    public boolean isImplicit()
    {
        return this.pointer().get(JAVA_INT, OFFSET__isImplicit) != 0;
    }

    public void isImplicit(boolean value)
    {
        this.pointer().set(JAVA_INT, OFFSET__isImplicit, value ? 1 : 0);
    }

    public MemorySegment $isImplicit()
    {
        return this.pointer().asSlice(OFFSET__isImplicit, JAVA_INT);
    }

    public Buffer<MemorySegment> attributes()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numAttributes(), ADDRESS)), OFFSET__attributes
        ));
    }

    public void attributes(Consumer<Buffer<MemorySegment>> consumer)
    {
        consumer.accept(this.attributes());
    }

    public void attributes(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET__attributes, value.pointer());
    }

    public MemorySegment $attributes()
    {
        return this.pointer().asSlice(OFFSET__attributes, ADDRESS);
    }

    public int numAttributes()
    {
        return this.pointer().get(JAVA_INT, OFFSET__numAttributes);
    }

    public void numAttributes(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__numAttributes, value);
    }

    public MemorySegment $numAttributes()
    {
        return this.pointer().asSlice(OFFSET__numAttributes, JAVA_INT);
    }

    public int flags()
    {
        return this.pointer().get(JAVA_INT, OFFSET__flags);
    }

    public void flags(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__flags, value);
    }

    public MemorySegment $flags()
    {
        return this.pointer().asSlice(OFFSET__flags, JAVA_INT);
    }
}
