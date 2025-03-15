package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxIBOutletCollectionAttrInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("attrInfo"),
        UNBOUNDED_POINTER.withName("objcClass"),
        CXCursor.LAYOUT.withName("classCursor"),
        CXIdxLoc.LAYOUT.withName("classLoc")
    ).withName("CXIdxIBOutletCollectionAttrInfo");
    public static final long OFFSET__attrInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("attrInfo"));
    public static final long OFFSET__objcClass = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("objcClass"));
    public static final long OFFSET__classCursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classCursor"));
    public static final long OFFSET__classLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classLoc"));

    public CXIdxIBOutletCollectionAttrInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxIBOutletCollectionAttrInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxIBOutletCollectionAttrInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxIBOutletCollectionAttrInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxIBOutletCollectionAttrInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment attrInfo()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__attrInfo);
    }

    public void attrInfo(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__attrInfo, value);
    }

    public MemorySegment $attrInfo()
    {
        return this.ptr().asSlice(OFFSET__attrInfo, UNBOUNDED_POINTER);
    }

    public MemorySegment objcClass()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__objcClass);
    }

    public void objcClass(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__objcClass, value);
    }

    public MemorySegment $objcClass()
    {
        return this.ptr().asSlice(OFFSET__objcClass, UNBOUNDED_POINTER);
    }

    public CXCursor classCursor()
    {
        return new CXCursor(this.ptr().asSlice(OFFSET__classCursor, CXCursor.LAYOUT));
    }

    public void classCursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.classCursor());
    }

    public void classCursor(CXCursor value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__classCursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $classCursor()
    {
        return this.ptr().asSlice(OFFSET__classCursor, CXCursor.LAYOUT);
    }

    public CXIdxLoc classLoc()
    {
        return new CXIdxLoc(this.ptr().asSlice(OFFSET__classLoc, CXIdxLoc.LAYOUT));
    }

    public void classLoc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.classLoc());
    }

    public void classLoc(CXIdxLoc value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__classLoc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $classLoc()
    {
        return this.ptr().asSlice(OFFSET__classLoc, CXIdxLoc.LAYOUT);
    }
}
