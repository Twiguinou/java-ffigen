package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

@Layout.Container("LAYOUT")
public record CXIdxIBOutletCollectionAttrInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("attrInfo"),
        ADDRESS.withName("objcClass"),
        CXCursor.LAYOUT.withName("classCursor"),
        CXIdxLoc.LAYOUT.withName("classLoc")
    ).withName("CXIdxIBOutletCollectionAttrInfo");
    public static final long OFFSET__attrInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attrInfo"));
    public static final long OFFSET__objcClass = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("objcClass"));
    public static final long OFFSET__classCursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classCursor"));
    public static final long OFFSET__classLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classLoc"));

    public CXIdxIBOutletCollectionAttrInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxIBOutletCollectionAttrInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxIBOutletCollectionAttrInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxIBOutletCollectionAttrInfo::new);
    }

    public static Buffer<CXIdxIBOutletCollectionAttrInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxIBOutletCollectionAttrInfo::new);
    }

    public static CXIdxIBOutletCollectionAttrInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxIBOutletCollectionAttrInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxIBOutletCollectionAttrInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIBOutletCollectionAttrInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment attrInfo()
    {
        return this.pointer().get(ADDRESS, OFFSET__attrInfo);
    }

    public void attrInfo(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__attrInfo, value);
    }

    public MemorySegment $attrInfo()
    {
        return this.pointer().asSlice(OFFSET__attrInfo, ADDRESS);
    }

    public MemorySegment objcClass()
    {
        return this.pointer().get(ADDRESS, OFFSET__objcClass);
    }

    public void objcClass(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__objcClass, value);
    }

    public MemorySegment $objcClass()
    {
        return this.pointer().asSlice(OFFSET__objcClass, ADDRESS);
    }

    public CXCursor classCursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__classCursor, CXCursor.LAYOUT));
    }

    public void classCursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.classCursor());
    }

    public CXIdxLoc classLoc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__classLoc, CXIdxLoc.LAYOUT));
    }

    public void classLoc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.classLoc());
    }
}
