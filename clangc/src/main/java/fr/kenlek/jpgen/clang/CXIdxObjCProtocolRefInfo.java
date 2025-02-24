package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;

import static fr.kenlek.jpgen.ForeignUtils.*;

public record CXIdxObjCProtocolRefInfo(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("protocol"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc")
    ).withName("CXIdxObjCProtocolRefInfo");
    public static final long OFFSET__protocol = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocol"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));

    public CXIdxObjCProtocolRefInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxObjCProtocolRefInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCProtocolRefInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCProtocolRefInfo value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment protocol()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__protocol);
    }

    public void protocol(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__protocol, value);
    }

    public MemorySegment $protocol()
    {
        return this.ptr().asSlice(OFFSET__protocol, UNBOUNDED_POINTER);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public void cursor(CXCursor value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__cursor, CXCursor.LAYOUT.byteSize());
    }

    public MemorySegment $cursor()
    {
        return this.ptr().asSlice(OFFSET__cursor, CXCursor.LAYOUT);
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }

    public void loc(CXIdxLoc value)
    {
        MemorySegment.copy(value.ptr(), 0, this.ptr(), OFFSET__loc, CXIdxLoc.LAYOUT.byteSize());
    }

    public MemorySegment $loc()
    {
        return this.ptr().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT);
    }
}
