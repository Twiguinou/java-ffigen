/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr)
{
    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout));
    }

    public static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsageEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout.byteSize());
    }

    public void copyFrom(CXTUResourceUsageEntry other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.state(0).byteOffset();
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__amount = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.state(1).byteOffset();
    public long amount() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__amount);}
    public void amount(long value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__amount, value);}
    public java.lang.foreign.MemorySegment $amount() {return this.ptr.asSlice(MEMBER_OFFSET__amount, java.lang.foreign.ValueLayout.JAVA_LONG);}
}
