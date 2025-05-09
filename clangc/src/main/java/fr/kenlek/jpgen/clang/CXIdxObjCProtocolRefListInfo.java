package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public record CXIdxObjCProtocolRefListInfo(MemorySegment pointer) implements Addressable
{
    @Layout.Value("LAYOUT")
    public static final StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("protocols"),
        JAVA_INT.withName("numProtocols")
    ).withName("CXIdxObjCProtocolRefListInfo");
    public static final long OFFSET__protocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("protocols"));
    public static final long OFFSET__numProtocols = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("numProtocols"));

    public CXIdxObjCProtocolRefListInfo(SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
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
