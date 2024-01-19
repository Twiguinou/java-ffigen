package jpgen.clang;

public record CXUnsavedFile(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$Filename = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$Filename = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$Contents = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$Contents = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$Length = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$Filename,
            LAYOUT$Contents,
            LAYOUT$Length,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXUnsavedFile");

    public CXUnsavedFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment Filename() {return this.ptr.get(LAYOUT$Filename, OFFSET$Filename);}
    public void Filename(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$Filename, OFFSET$Filename, value);}
    public java.lang.foreign.MemorySegment Filename_ptr() {return this.ptr.asSlice(OFFSET$Filename, LAYOUT$Filename);}

    public java.lang.foreign.MemorySegment Contents() {return this.ptr.get(LAYOUT$Contents, OFFSET$Contents);}
    public void Contents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$Contents, OFFSET$Contents, value);}
    public java.lang.foreign.MemorySegment Contents_ptr() {return this.ptr.asSlice(OFFSET$Contents, LAYOUT$Contents);}

    public int Length() {return this.ptr.get(LAYOUT$Length, OFFSET$Length);}
    public void Length(int value) {this.ptr.set(LAYOUT$Length, OFFSET$Length, value);}
    public java.lang.foreign.MemorySegment Length_ptr() {return this.ptr.asSlice(OFFSET$Length, LAYOUT$Length);}
}
