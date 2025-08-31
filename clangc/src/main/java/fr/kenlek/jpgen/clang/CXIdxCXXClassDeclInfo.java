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
public record CXIdxCXXClassDeclInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("declInfo"),
        ADDRESS.withName("bases"),
        JAVA_INT.withName("numBases")
    ).withName("CXIdxCXXClassDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__bases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("bases"));
    public static final long OFFSET__numBases = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numBases"));

    public CXIdxCXXClassDeclInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxCXXClassDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxCXXClassDeclInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxCXXClassDeclInfo::new);
    }

    public static Buffer<CXIdxCXXClassDeclInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxCXXClassDeclInfo::new);
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
        return this.pointer().get(ADDRESS, OFFSET__declInfo);
    }

    public void declInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__declInfo, value);
    }

    public MemorySegment $declInfo()
    {
        return this.pointer().asSlice(OFFSET__declInfo, ADDRESS);
    }

    public Buffer<MemorySegment> bases()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numBases(), ADDRESS)), OFFSET__bases
        ));
    }

    public void bases(Consumer<Buffer<MemorySegment>> consumer)
    {
        consumer.accept(this.bases());
    }

    public void bases(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET__bases, value.pointer());
    }

    public MemorySegment $bases()
    {
        return this.pointer().asSlice(OFFSET__bases, ADDRESS);
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
