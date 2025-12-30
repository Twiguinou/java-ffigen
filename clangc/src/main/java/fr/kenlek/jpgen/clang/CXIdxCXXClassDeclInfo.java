package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxCXXClassDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        ADDRESS.withName("bases"),
        JAVA_INT.withName("numBases")
    ).withName("CXIdxCXXClassDeclInfo");
    public static final long OFFSET_declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET_bases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("bases"));
    public static final long OFFSET_numBases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numBases"));

    public CXIdxCXXClassDeclInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxCXXClassDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxCXXClassDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxCXXClassDeclInfo::new);
    }

    public static Buffer<CXIdxCXXClassDeclInfo> buffer(SegmentAllocator allocator, long size)
    {
        return Buffer.slices(allocator, LAYOUT, size, CXIdxCXXClassDeclInfo::new);
    }

    @Override
    public StructLayout layout()
    {
        return LAYOUT;
    }

    public void copyFrom(CXIdxCXXClassDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment declInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET_declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET_declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.pointer().asSlice(OFFSET_declInfo, ADDRESS);
    }

    public Buffer<MemorySegment> bases()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numBases(), ADDRESS)), OFFSET_bases
        ));
    }

    public void bases(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET_bases, value.pointer());
    }

    public MemorySegment $bases()
    {
        return this.pointer().asSlice(OFFSET_bases, ADDRESS);
    }

    public int numBases()
    {
        return this.pointer().get(JAVA_INT, OFFSET_numBases);
    }

    public void numBases(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_numBases, value);
    }

    public MemorySegment $numBases()
    {
        return this.pointer().asSlice(OFFSET_numBases, JAVA_INT);
    }
}
