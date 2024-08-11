package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.NativeTypes;

public record CXUnsavedFile(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__Filename;
    public static final long OFFSET__Filename;
    public static final java.lang.foreign.AddressLayout LAYOUT__Contents;
    public static final long OFFSET__Contents;
    public static final java.lang.foreign.ValueLayout LAYOUT__Length;
    public static final long OFFSET__Length;

    public static final java.lang.foreign.StructLayout gRecordLayout;

    public CXUnsavedFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXUnsavedFile getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXUnsavedFile(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXUnsavedFile value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment Filename() {return this.ptr.get(LAYOUT__Filename, OFFSET__Filename);}
    public void Filename(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__Filename, OFFSET__Filename, value);}
    public java.lang.foreign.MemorySegment $Filename() {return this.ptr.asSlice(OFFSET__Filename, LAYOUT__Filename);}

    public java.lang.foreign.MemorySegment Contents() {return this.ptr.get(LAYOUT__Contents, OFFSET__Contents);}
    public void Contents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__Contents, OFFSET__Contents, value);}
    public java.lang.foreign.MemorySegment $Contents() {return this.ptr.asSlice(OFFSET__Contents, LAYOUT__Contents);}

    public int Length() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, OFFSET__Length);}
    public void Length(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, OFFSET__Length, value);}
    public java.lang.foreign.MemorySegment $Length() {return this.ptr.asSlice(OFFSET__Length, LAYOUT__Length);}

    static
    {
        LAYOUT__Filename = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Filename");
        OFFSET__Filename = 0;
        LAYOUT__Contents = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Contents");
        OFFSET__Contents = 8;

        OFFSET__Length = 16;

        if (NativeTypes.isP64())
        {
            LAYOUT__Length = java.lang.foreign.ValueLayout.JAVA_INT.withName("Length");

            gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
                    LAYOUT__Filename,
                    LAYOUT__Contents,
                    LAYOUT__Length,
                    java.lang.foreign.MemoryLayout.paddingLayout(4)
            ).withByteAlignment(8).withName("CXUnsavedFile");
        }
        else
        {
            LAYOUT__Length = java.lang.foreign.ValueLayout.JAVA_LONG.withName("Length");

            gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
                    LAYOUT__Filename,
                    LAYOUT__Contents,
                    LAYOUT__Length
            ).withByteAlignment(8).withName("CXUnsavedFile");
        }
    }
}
