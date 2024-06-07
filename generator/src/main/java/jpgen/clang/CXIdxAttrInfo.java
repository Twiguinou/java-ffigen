package jpgen.clang;

public record CXIdxAttrInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor = jpgen.clang.CXCursor.gRecordLayout;
    public static final long OFFSET__cursor = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__loc = jpgen.clang.CXIdxLoc.gRecordLayout;
    public static final long OFFSET__loc = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cursor,
            LAYOUT__loc
    ).withByteAlignment(8).withName("CXIdxAttrInfo");

    public CXIdxAttrInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxAttrInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxAttrInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxAttrInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__cursor, LAYOUT__cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__cursor, LAYOUT__cursor.byteSize());}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__loc, LAYOUT__loc));}
    public void loc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__loc, LAYOUT__loc.byteSize());}
}
