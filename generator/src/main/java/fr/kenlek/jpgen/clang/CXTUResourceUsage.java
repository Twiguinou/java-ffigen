/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXTUResourceUsage(java.lang.foreign.MemorySegment ptr)
{
    public CXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout));
    }

    public static CXTUResourceUsage getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXTUResourceUsage(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsage value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout.byteSize());
    }

    public void copyFrom(CXTUResourceUsage other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.state(0).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numEntries = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.state(1).byteOffset();
    public int numEntries() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries);}
    public void numEntries(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries, value);}
    public java.lang.foreign.MemorySegment $numEntries() {return this.ptr.asSlice(MEMBER_OFFSET__numEntries, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__entries = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.state(2).byteOffset();
    public java.lang.foreign.MemorySegment entries() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries);}
    public void entries(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries, value);}
    public java.lang.foreign.MemorySegment $entries() {return this.ptr.asSlice(MEMBER_OFFSET__entries, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
