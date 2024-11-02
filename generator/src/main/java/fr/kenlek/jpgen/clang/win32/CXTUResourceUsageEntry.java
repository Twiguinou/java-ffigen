/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang.win32;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr) implements fr.kenlek.jpgen.clang.CXTUResourceUsageEntry
{
    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXTUResourceUsageEntry.layout));
    }

    public static final long MEMBER_OFFSET__kind = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXTUResourceUsageEntry.state(0).byteOffset();
    @java.lang.Override public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    @java.lang.Override public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__amount = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$win32$CXTUResourceUsageEntry.state(1).byteOffset();
    public int amount() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__amount);}
    public void amount(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__amount, value);}
    public java.lang.foreign.MemorySegment $amount() {return this.ptr.asSlice(MEMBER_OFFSET__amount, java.lang.foreign.ValueLayout.JAVA_INT);}
}
