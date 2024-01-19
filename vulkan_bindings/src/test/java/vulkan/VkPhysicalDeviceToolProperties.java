package vulkan;

public record VkPhysicalDeviceToolProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$name = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$version = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$version = 272L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$purposes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$purposes = 528L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$description = 532L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$layer = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$layer = 788L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$name,
            LAYOUT$version,
            LAYOUT$purposes,
            LAYOUT$description,
            LAYOUT$layer,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceToolProperties");

    public VkPhysicalDeviceToolProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET$name, LAYOUT$name);}
    public char name(int i) {return (char)this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void name(int i, char value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment version() {return this.ptr.asSlice(OFFSET$version, LAYOUT$version);}
    public char version(int i) {return (char)this.version().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void version(int i, char value) {this.version().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int purposes() {return this.ptr.get(LAYOUT$purposes, OFFSET$purposes);}
    public void purposes(int value) {this.ptr.set(LAYOUT$purposes, OFFSET$purposes, value);}
    public java.lang.foreign.MemorySegment purposes_ptr() {return this.ptr.asSlice(OFFSET$purposes, LAYOUT$purposes);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
    public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment layer() {return this.ptr.asSlice(OFFSET$layer, LAYOUT$layer);}
    public char layer(int i) {return (char)this.layer().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void layer(int i, char value) {this.layer().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
