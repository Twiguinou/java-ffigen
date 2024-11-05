/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang.posix;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr) implements fr.kenlek.jpgen.clang.CXTUResourceUsageEntry
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXTUResourceUsageEntry", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_LONG.withName("amount"))
    ));

    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static final long MEMBER_OFFSET__kind = LAYOUT_DATA.state(0).byteOffset();
    @java.lang.Override public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    @java.lang.Override public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    @java.lang.Override public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__amount = LAYOUT_DATA.state(1).byteOffset();
    public long amount() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__amount);}
    public void amount(long value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_LONG, MEMBER_OFFSET__amount, value);}
    public java.lang.foreign.MemorySegment $amount() {return this.ptr.asSlice(MEMBER_OFFSET__amount, java.lang.foreign.ValueLayout.JAVA_LONG);}
}
