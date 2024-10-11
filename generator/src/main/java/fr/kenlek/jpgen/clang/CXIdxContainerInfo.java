/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxContainerInfo(java.lang.foreign.MemorySegment ptr)
{
    public CXIdxContainerInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout));
    }

    public static CXIdxContainerInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxContainerInfo(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxContainerInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout.byteSize());
    }

    public void copyFrom(CXIdxContainerInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__cursor = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo.state(0).byteOffset();
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout);}
}
