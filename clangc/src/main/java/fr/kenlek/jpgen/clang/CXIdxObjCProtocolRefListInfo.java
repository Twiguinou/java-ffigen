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
public record CXIdxObjCProtocolRefListInfo(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        ADDRESS.withName("protocols"),
        JAVA_INT.withName("numProtocols")
    ).withName("CXIdxObjCProtocolRefListInfo");
    public static final long OFFSET__protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));
    public static final long OFFSET__numProtocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numProtocols"));

    public CXIdxObjCProtocolRefListInfo
    {
        if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
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

    public static CXIdxObjCProtocolRefListInfo getAtIndex(MemorySegment buffer, long index)
    {
        return new CXIdxObjCProtocolRefListInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(MemorySegment buffer, long index, CXIdxObjCProtocolRefListInfo value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefListInfo other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    public Buffer<MemorySegment> protocols()
    {
        return Buffer.addresses(this.pointer().get(
            ADDRESS.withTargetLayout(sequenceLayout(this.numProtocols(), ADDRESS)), OFFSET__protocols
        ));
    }

    public void protocols(Consumer<Buffer<MemorySegment>> consumer)
    {
        consumer.accept(this.protocols());
    }

    public void protocols(Buffer<MemorySegment> value)
    {
        this.pointer().set(ADDRESS, OFFSET__protocols, value.pointer());
    }

    public MemorySegment $protocols()
    {
        return this.pointer().asSlice(OFFSET__protocols, ADDRESS);
    }

    public int numProtocols()
    {
        return this.pointer().get(JAVA_INT, OFFSET__numProtocols);
    }

    public void numProtocols(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__numProtocols, value);
    }

    public MemorySegment $numProtocols()
    {
        return this.pointer().asSlice(OFFSET__numProtocols, JAVA_INT);
    }
}
