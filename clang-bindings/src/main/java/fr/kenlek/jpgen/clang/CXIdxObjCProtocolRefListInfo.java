package fr.kenlek.jpgen.clang;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;

public record CXIdxObjCProtocolRefListInfo(MemorySegment ptr)
{
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
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxObjCProtocolRefListInfo other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    public MemorySegment protocols() {return this.ptr().get(UNBOUNDED_POINTER, OFFSET__protocols);}
    public void protocols(MemorySegment value) {this.ptr().set(UNBOUNDED_POINTER, OFFSET__protocols, value);}
    public MemorySegment $protocols() {return this.ptr().asSlice(OFFSET__protocols, UNBOUNDED_POINTER);}

    public int numProtocols() {return this.ptr().get(JAVA_INT, OFFSET__numProtocols);}
    public void numProtocols(int value) {this.ptr().set(JAVA_INT, OFFSET__numProtocols, value);}
    public MemorySegment $numProtocols() {return this.ptr().asSlice(OFFSET__numProtocols, JAVA_INT);}
}
