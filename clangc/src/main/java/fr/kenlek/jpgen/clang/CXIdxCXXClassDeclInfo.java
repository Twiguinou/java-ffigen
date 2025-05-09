package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxCXXClassDeclInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("declInfo"),
        UNBOUNDED_POINTER.withName("bases"),
        JAVA_INT.withName("numBases")
    ).withName("CXIdxCXXClassDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__bases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("bases"));
    public static final long OFFSET__numBases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numBases"));

    public CXIdxCXXClassDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxCXXClassDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxCXXClassDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxCXXClassDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxCXXClassDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment declInfo()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.pointer().asSlice(OFFSET__declInfo, UNBOUNDED_POINTER);
    }

    public MemorySegment bases()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__bases);
    }

    public void bases(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__bases, value);
    }

    public MemorySegment $bases()
    {
        return this.pointer().asSlice(OFFSET__bases, UNBOUNDED_POINTER);
    }

    public int numBases()
    {
        return this.pointer().get(JAVA_INT, OFFSET__numBases);
    }

    public void numBases(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__numBases, value);
    }

    public MemorySegment $numBases()
    {
        return this.pointer().asSlice(OFFSET__numBases, JAVA_INT);
    }
}
