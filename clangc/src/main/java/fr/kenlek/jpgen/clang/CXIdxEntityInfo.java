package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.*;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxEntityInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("templateKind"),
        JAVA_INT.withName("lang"),
        ADDRESS.withName("name"),
        ADDRESS.withName("USR"),
        CXCursor.LAYOUT.withName("cursor"),
        ADDRESS.withName("attributes"),
        JAVA_INT.withName("numAttributes")
    ).withName("CXIdxEntityInfo");
    public static final long OFFSET_kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET_templateKind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("templateKind"));
    public static final long OFFSET_lang = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("lang"));
    public static final long OFFSET_name = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("name"));
    public static final long OFFSET_USR = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("USR"));
    public static final long OFFSET_cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET_attributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attributes"));
    public static final long OFFSET_numAttributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numAttributes"));

    public CXIdxEntityInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxEntityInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxEntityInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxEntityInfo::new);
    }

    public static Buffer<CXIdxEntityInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxEntityInfo::new);
    }

    public static CXIdxEntityInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxEntityInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxEntityInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET_kind, JAVA_INT);
    }

    public int templateKind()
    {
        return this.pointer().get(JAVA_INT, OFFSET_templateKind);
    }

    public void templateKind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_templateKind, value);
    }

    public MemorySegment $templateKind()
    {
        return this.pointer().asSlice(OFFSET_templateKind, JAVA_INT);
    }

    public int lang()
    {
        return this.pointer().get(JAVA_INT, OFFSET_lang);
    }

    public void lang(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_lang, value);
    }

    public MemorySegment $lang()
    {
        return this.pointer().asSlice(OFFSET_lang, JAVA_INT);
    }

    public MemorySegment name()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET_name);
    }

    public void name(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_name, value);
    }

    public MemorySegment $name()
    {
        return this.pointer().asSlice(OFFSET_name, ADDRESS);
    }

    public MemorySegment USR()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET_USR);
    }

    public void USR(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_USR, value);
    }

    public MemorySegment $USR()
    {
        return this.pointer().asSlice(OFFSET_USR, ADDRESS);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET_cursor, CXCursor.LAYOUT));
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
}
