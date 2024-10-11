/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXVersion(java.lang.foreign.MemorySegment ptr)
{
    public CXVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout));
    }

    public static CXVersion getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXVersion(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXVersion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize());
    }

    public void copyFrom(CXVersion other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Major = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.state(0).byteOffset();
    public int Major() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major);}
    public void Major(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Major, value);}
    public java.lang.foreign.MemorySegment $Major() {return this.ptr.asSlice(MEMBER_OFFSET__Major, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Minor = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.state(1).byteOffset();
    public int Minor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor);}
    public void Minor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Minor, value);}
    public java.lang.foreign.MemorySegment $Minor() {return this.ptr.asSlice(MEMBER_OFFSET__Minor, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Subminor = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.state(2).byteOffset();
    public int Subminor() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor);}
    public void Subminor(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Subminor, value);}
    public java.lang.foreign.MemorySegment $Subminor() {return this.ptr.asSlice(MEMBER_OFFSET__Subminor, java.lang.foreign.ValueLayout.JAVA_INT);}
}
