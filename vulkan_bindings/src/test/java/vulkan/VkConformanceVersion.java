package vulkan;

public record VkConformanceVersion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$major = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$major = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$minor = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$minor = 1L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$subminor = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$subminor = 2L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$patch = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$patch = 3L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$major,
            LAYOUT$minor,
            LAYOUT$subminor,
            LAYOUT$patch
    ).withName("VkConformanceVersion");

    public VkConformanceVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public char major() {return (char)this.ptr.get(LAYOUT$major, OFFSET$major);}
    public void major(char value) {this.ptr.set(LAYOUT$major, OFFSET$major, (byte)value);}
    public java.lang.foreign.MemorySegment major_ptr() {return this.ptr.asSlice(OFFSET$major, LAYOUT$major);}

    public char minor() {return (char)this.ptr.get(LAYOUT$minor, OFFSET$minor);}
    public void minor(char value) {this.ptr.set(LAYOUT$minor, OFFSET$minor, (byte)value);}
    public java.lang.foreign.MemorySegment minor_ptr() {return this.ptr.asSlice(OFFSET$minor, LAYOUT$minor);}

    public char subminor() {return (char)this.ptr.get(LAYOUT$subminor, OFFSET$subminor);}
    public void subminor(char value) {this.ptr.set(LAYOUT$subminor, OFFSET$subminor, (byte)value);}
    public java.lang.foreign.MemorySegment subminor_ptr() {return this.ptr.asSlice(OFFSET$subminor, LAYOUT$subminor);}

    public char patch() {return (char)this.ptr.get(LAYOUT$patch, OFFSET$patch);}
    public void patch(char value) {this.ptr.set(LAYOUT$patch, OFFSET$patch, (byte)value);}
    public java.lang.foreign.MemorySegment patch_ptr() {return this.ptr.asSlice(OFFSET$patch, LAYOUT$patch);}
}
