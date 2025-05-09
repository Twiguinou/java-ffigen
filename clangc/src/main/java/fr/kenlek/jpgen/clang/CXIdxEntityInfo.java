package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxEntityInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("templateKind"),
        JAVA_INT.withName("lang"),
        UNBOUNDED_POINTER.withName("name"),
        UNBOUNDED_POINTER.withName("USR"),
        CXCursor.LAYOUT.withName("cursor"),
        UNBOUNDED_POINTER.withName("attributes"),
        JAVA_INT.withName("numAttributes")
    ).withName("CXIdxEntityInfo");
    public static final long OFFSET__kind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
    public static final long OFFSET__templateKind = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("templateKind"));
    public static final long OFFSET__lang = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("lang"));
    public static final long OFFSET__name = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("name"));
    public static final long OFFSET__USR = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("USR"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__attributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attributes"));
    public static final long OFFSET__numAttributes = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numAttributes"));

    public CXIdxEntityInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxEntityInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxEntityInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxEntityInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxEntityInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__kind);
    }

    public void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__kind, value);
    }

    public MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET__kind, JAVA_INT);
    }

    public int templateKind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__templateKind);
    }

    public void templateKind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__templateKind, value);
    }

    public MemorySegment $templateKind()
    {
        return this.pointer().asSlice(OFFSET__templateKind, JAVA_INT);
    }

    public int lang()
    {
        return this.pointer().get(JAVA_INT, OFFSET__lang);
    }

    public void lang(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__lang, value);
    }

    public MemorySegment $lang()
    {
        return this.pointer().asSlice(OFFSET__lang, JAVA_INT);
    }

    public MemorySegment name()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__name);
    }

    public void name(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__name, value);
    }

    public MemorySegment $name()
    {
        return this.pointer().asSlice(OFFSET__name, UNBOUNDED_POINTER);
    }

    public MemorySegment USR()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__USR);
    }

    public void USR(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__USR, value);
    }

    public MemorySegment $USR()
    {
        return this.pointer().asSlice(OFFSET__USR, UNBOUNDED_POINTER);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public void cursor(CXCursor value)
    {
        MemorySegment.copy(value.pointer(), 0, this.pointer(), OFFSET__cursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $cursor()
    {
        return this.pointer().asSlice(OFFSET__cursor, CXCursor.LAYOUT);
    }

    public MemorySegment attributes()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__attributes);
    }

    public void attributes(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__attributes, value);
    }

    public MemorySegment $attributes()
    {
        return this.pointer().asSlice(OFFSET__attributes, UNBOUNDED_POINTER);
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
}
