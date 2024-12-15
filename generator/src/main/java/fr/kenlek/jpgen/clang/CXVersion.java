/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXVersion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("Major"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("Minor"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("Subminor")
    ).withByteAlignment(4);

    public CXVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXVersion getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXVersion(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXVersion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXVersion other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__Major = ((0 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int Major() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major);}
    public void Major(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major, value);}
    public java.lang.foreign.MemorySegment $Major() {return this.ptr.asSlice(MEMBER_OFFSET__Major, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Minor = ((4 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int Minor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor);}
    public void Minor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor, value);}
    public java.lang.foreign.MemorySegment $Minor() {return this.ptr.asSlice(MEMBER_OFFSET__Minor, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Subminor = ((8 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int Subminor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor);}
    public void Subminor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor, value);}
    public java.lang.foreign.MemorySegment $Subminor() {return this.ptr.asSlice(MEMBER_OFFSET__Subminor, java.lang.foreign.ValueLayout.JAVA_INT);}
}
