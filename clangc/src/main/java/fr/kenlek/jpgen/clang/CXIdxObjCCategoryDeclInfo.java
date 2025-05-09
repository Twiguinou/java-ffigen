package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxObjCCategoryDeclInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("containerInfo"),
        UNBOUNDED_POINTER.withName("objcClass"),
        CXCursor.LAYOUT.withName("classCursor"),
        CXIdxLoc.LAYOUT.withName("classLoc"),
        UNBOUNDED_POINTER.withName("protocols")
    ).withName("CXIdxObjCCategoryDeclInfo");
    public static final long OFFSET__containerInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("containerInfo"));
    public static final long OFFSET__objcClass = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("objcClass"));
    public static final long OFFSET__classCursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classCursor"));
    public static final long OFFSET__classLoc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("classLoc"));
    public static final long OFFSET__protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));

    public CXIdxObjCCategoryDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCCategoryDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCCategoryDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCCategoryDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCCategoryDeclInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment containerInfo()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__containerInfo);
    }

    public void containerInfo(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__containerInfo, value);
    }

    public MemorySegment $containerInfo()
    {
        return this.pointer().asSlice(OFFSET__containerInfo, UNBOUNDED_POINTER);
    }

    public MemorySegment objcClass()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__objcClass);
    }

    public void objcClass(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__objcClass, value);
    }

    public MemorySegment $objcClass()
    {
        return this.pointer().asSlice(OFFSET__objcClass, UNBOUNDED_POINTER);
    }

    public CXCursor classCursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__classCursor, CXCursor.LAYOUT));
    }

    public void classCursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.classCursor());
    }

    public void classCursor(CXCursor value)
    {
        MemorySegment.copy(value.pointer(), 0, this.pointer(), OFFSET__classCursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $classCursor()
    {
        return this.pointer().asSlice(OFFSET__classCursor, CXCursor.LAYOUT);
    }

    public CXIdxLoc classLoc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__classLoc, CXIdxLoc.LAYOUT));
    }

    public void classLoc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.classLoc());
    }

    public void classLoc(CXIdxLoc value)
    {
        MemorySegment.copy(value.pointer(), 0, this.pointer(), OFFSET__classLoc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $classLoc()
    {
        return this.pointer().asSlice(OFFSET__classLoc, CXIdxLoc.LAYOUT);
    }

    public MemorySegment protocols()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__protocols);
    }

    public void protocols(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__protocols, value);
    }

    public MemorySegment $protocols()
    {
        return this.pointer().asSlice(OFFSET__protocols, UNBOUNDED_POINTER);
    }
}
