package jpgen.clang;

public record CXVersion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Major = java.lang.foreign.ValueLayout.JAVA_INT.withName("Major");
    public static final long OFFSET__Major = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Minor = java.lang.foreign.ValueLayout.JAVA_INT.withName("Minor");
    public static final long OFFSET__Minor = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Subminor = java.lang.foreign.ValueLayout.JAVA_INT.withName("Subminor");
    public static final long OFFSET__Subminor = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__Major,
            LAYOUT__Minor,
            LAYOUT__Subminor
    ).withByteAlignment(4).withName("CXVersion");

    public CXVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXVersion getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXVersion(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXVersion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int Major() {return this.ptr.get(LAYOUT__Major, OFFSET__Major);}
    public void Major(int value) {this.ptr.set(LAYOUT__Major, OFFSET__Major, value);}
    public java.lang.foreign.MemorySegment $Major() {return this.ptr.asSlice(OFFSET__Major, LAYOUT__Major);}

    public int Minor() {return this.ptr.get(LAYOUT__Minor, OFFSET__Minor);}
    public void Minor(int value) {this.ptr.set(LAYOUT__Minor, OFFSET__Minor, value);}
    public java.lang.foreign.MemorySegment $Minor() {return this.ptr.asSlice(OFFSET__Minor, LAYOUT__Minor);}

    public int Subminor() {return this.ptr.get(LAYOUT__Subminor, OFFSET__Subminor);}
    public void Subminor(int value) {this.ptr.set(LAYOUT__Subminor, OFFSET__Subminor, value);}
    public java.lang.foreign.MemorySegment $Subminor() {return this.ptr.asSlice(OFFSET__Subminor, LAYOUT__Subminor);}
}
