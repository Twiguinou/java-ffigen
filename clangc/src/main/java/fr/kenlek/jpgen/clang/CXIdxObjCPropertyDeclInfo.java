package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxObjCPropertyDeclInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("declInfo"),
        UNBOUNDED_POINTER.withName("getter"),
        UNBOUNDED_POINTER.withName("setter")
    ).withName("CXIdxObjCPropertyDeclInfo");
    public static final long OFFSET__declInfo = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("declInfo"));
    public static final long OFFSET__getter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("getter"));
    public static final long OFFSET__setter = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("setter"));

    public CXIdxObjCPropertyDeclInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCPropertyDeclInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCPropertyDeclInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCPropertyDeclInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCPropertyDeclInfo other)
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

    public MemorySegment getter()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__getter);
    }

    public void getter(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__getter, value);
    }

    public MemorySegment $getter()
    {
        return this.pointer().asSlice(OFFSET__getter, UNBOUNDED_POINTER);
    }

    public MemorySegment setter()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__setter);
    }

    public void setter(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__setter, value);
    }

    public MemorySegment $setter()
    {
        return this.pointer().asSlice(OFFSET__setter, UNBOUNDED_POINTER);
    }
}
