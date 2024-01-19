package vulkan;

public record VkLayerProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$layerName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$layerName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$specVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$specVersion = 256L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$implementationVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$implementationVersion = 260L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$description = 264L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$layerName,
            LAYOUT$specVersion,
            LAYOUT$implementationVersion,
            LAYOUT$description
    ).withName("VkLayerProperties");

    public VkLayerProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment layerName() {return this.ptr.asSlice(OFFSET$layerName, LAYOUT$layerName);}
    public char layerName(int i) {return (char)this.layerName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void layerName(int i, char value) {this.layerName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int specVersion() {return this.ptr.get(LAYOUT$specVersion, OFFSET$specVersion);}
    public void specVersion(int value) {this.ptr.set(LAYOUT$specVersion, OFFSET$specVersion, value);}
    public java.lang.foreign.MemorySegment specVersion_ptr() {return this.ptr.asSlice(OFFSET$specVersion, LAYOUT$specVersion);}

    public int implementationVersion() {return this.ptr.get(LAYOUT$implementationVersion, OFFSET$implementationVersion);}
    public void implementationVersion(int value) {this.ptr.set(LAYOUT$implementationVersion, OFFSET$implementationVersion, value);}
    public java.lang.foreign.MemorySegment implementationVersion_ptr() {return this.ptr.asSlice(OFFSET$implementationVersion, LAYOUT$implementationVersion);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
    public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
