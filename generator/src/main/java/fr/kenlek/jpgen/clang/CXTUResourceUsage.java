/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXTUResourceUsage(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXTUResourceUsage", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numEntries")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entries"))
    ));

    public CXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXTUResourceUsage getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXTUResourceUsage(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsage value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXTUResourceUsage other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__data = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numEntries = LAYOUT_DATA.state(1).byteOffset();
    public int numEntries() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries);}
    public void numEntries(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries, value);}
    public java.lang.foreign.MemorySegment $numEntries() {return this.ptr.asSlice(MEMBER_OFFSET__numEntries, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__entries = LAYOUT_DATA.state(2).byteOffset();
    public java.lang.foreign.MemorySegment entries() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries);}
    public void entries(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries, value);}
    public java.lang.foreign.MemorySegment $entries() {return this.ptr.asSlice(MEMBER_OFFSET__entries, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
