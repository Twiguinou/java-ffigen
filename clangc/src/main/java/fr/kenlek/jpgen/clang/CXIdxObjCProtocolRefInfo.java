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
public record CXIdxObjCProtocolRefInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("protocol"),
        CXCursor.LAYOUT.withName("cursor"),
        CXIdxLoc.LAYOUT.withName("loc")
    ).withName("CXIdxObjCProtocolRefInfo");
    public static final long OFFSET__protocol = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocol"));
    public static final long OFFSET__cursor = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("cursor"));
    public static final long OFFSET__loc = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("loc"));

    public CXIdxObjCProtocolRefInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    public CXIdxObjCProtocolRefInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCProtocolRefInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCProtocolRefInfo::new);
    }

    public static Buffer<CXIdxObjCProtocolRefInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCProtocolRefInfo::new);
    }

    public static CXIdxObjCProtocolRefInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCProtocolRefInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCProtocolRefInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public MemorySegment protocol()
    {
        return this.pointer().get(ADDRESS, OFFSET__protocol);
    }

    public void protocol(MemorySegment value)
    {
        this.pointer().set(ADDRESS, OFFSET__protocol, value);
    }

    public MemorySegment $protocol()
    {
        return this.pointer().asSlice(OFFSET__protocol, ADDRESS);
    }

    public CXCursor cursor()
    {
        return new CXCursor(this.pointer().asSlice(OFFSET__cursor, CXCursor.LAYOUT));
    }

    public void cursor(Consumer<CXCursor> consumer)
    {
        consumer.accept(this.cursor());
    }

    public CXIdxLoc loc()
    {
        return new CXIdxLoc(this.pointer().asSlice(OFFSET__loc, CXIdxLoc.LAYOUT));
    }

    public void loc(Consumer<CXIdxLoc> consumer)
    {
        consumer.accept(this.loc());
    }
}
