/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXVersion(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXVersion", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Major")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Minor")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Subminor"))
    ));

    public CXVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXVersion getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXVersion(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXVersion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXVersion other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Major = LAYOUT_DATA.state(0).byteOffset();
    public int Major() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major);}
    public void Major(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major, value);}
    public java.lang.foreign.MemorySegment $Major() {return this.ptr.asSlice(MEMBER_OFFSET__Major, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Minor = LAYOUT_DATA.state(1).byteOffset();
    public int Minor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor);}
    public void Minor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor, value);}
    public java.lang.foreign.MemorySegment $Minor() {return this.ptr.asSlice(MEMBER_OFFSET__Minor, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Subminor = LAYOUT_DATA.state(2).byteOffset();
    public int Subminor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor);}
    public void Subminor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor, value);}
    public java.lang.foreign.MemorySegment $Subminor() {return this.ptr.asSlice(MEMBER_OFFSET__Subminor, java.lang.foreign.ValueLayout.JAVA_INT);}
}
