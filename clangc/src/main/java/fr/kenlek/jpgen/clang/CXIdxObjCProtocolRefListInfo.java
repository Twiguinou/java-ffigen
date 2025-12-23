package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.ValueLayout.*;

@Layout.Container("LAYOUT")
public record CXIdxObjCProtocolRefListInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("protocols"),
        JAVA_INT.withName("numProtocols")
    ).withName("CXIdxObjCProtocolRefListInfo");
    public static final long OFFSET_protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));
    public static final long OFFSET_numProtocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numProtocols"));

    public CXIdxObjCProtocolRefListInfo
    {
        Addressable.checkLayoutConstraints(pointer, LAYOUT);
    }

    public CXIdxObjCProtocolRefListInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static Buffer<CXIdxObjCProtocolRefListInfo> buffer(MemorySegment data)
    {
        return Buffer.slices(data, LAYOUT, CXIdxObjCProtocolRefListInfo::new);
    }

    public static Buffer<CXIdxObjCProtocolRefListInfo> allocate(SegmentAllocator allocator, long size)
    {
        return Buffer.allocateSlices(allocator, LAYOUT, size, CXIdxObjCProtocolRefListInfo::new);
    }

    public static CXIdxObjCProtocolRefListInfo getAtIndex(MemorySegment buffer, long offset, long index)
    {
        return new CXIdxObjCProtocolRefListInfo(buffer.asSlice(LAYOUT.scale(offset, index), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long offset, long index, CXIdxObjCProtocolRefListInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, LAYOUT.scale(offset, index), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefListInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<MemorySegment> protocols()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numProtocols(), ADDRESS)), OFFSET_protocols
        ));
    }

    public void protocols(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET_protocols, value.pointer());
    }

    public MemorySegment $protocols()
    {
        return this.pointer().asSlice(OFFSET_protocols, ADDRESS);
    }

    public int numProtocols()
    {
        return this.pointer().get(JAVA_INT, OFFSET_numProtocols);
    }

    public void numProtocols(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET_numProtocols, value);
    }

    public MemorySegment $numProtocols()
    {
        return this.pointer().asSlice(OFFSET_numProtocols, JAVA_INT);
    }
}
