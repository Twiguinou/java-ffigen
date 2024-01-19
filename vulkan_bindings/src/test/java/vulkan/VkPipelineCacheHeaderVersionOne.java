package vulkan;

public record VkPipelineCacheHeaderVersionOne(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$headerSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$headerSize = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$headerVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$headerVersion = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vendorID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vendorID = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceID = 12L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$pipelineCacheUUID = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$headerSize,
            LAYOUT$headerVersion,
            LAYOUT$vendorID,
            LAYOUT$deviceID,
            LAYOUT$pipelineCacheUUID
    ).withName("VkPipelineCacheHeaderVersionOne");

    public VkPipelineCacheHeaderVersionOne(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int headerSize() {return this.ptr.get(LAYOUT$headerSize, OFFSET$headerSize);}
    public void headerSize(int value) {this.ptr.set(LAYOUT$headerSize, OFFSET$headerSize, value);}
    public java.lang.foreign.MemorySegment headerSize_ptr() {return this.ptr.asSlice(OFFSET$headerSize, LAYOUT$headerSize);}

    public int headerVersion() {return this.ptr.get(LAYOUT$headerVersion, OFFSET$headerVersion);}
    public void headerVersion(int value) {this.ptr.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);}
    public java.lang.foreign.MemorySegment headerVersion_ptr() {return this.ptr.asSlice(OFFSET$headerVersion, LAYOUT$headerVersion);}

    public int vendorID() {return this.ptr.get(LAYOUT$vendorID, OFFSET$vendorID);}
    public void vendorID(int value) {this.ptr.set(LAYOUT$vendorID, OFFSET$vendorID, value);}
    public java.lang.foreign.MemorySegment vendorID_ptr() {return this.ptr.asSlice(OFFSET$vendorID, LAYOUT$vendorID);}

    public int deviceID() {return this.ptr.get(LAYOUT$deviceID, OFFSET$deviceID);}
    public void deviceID(int value) {this.ptr.set(LAYOUT$deviceID, OFFSET$deviceID, value);}
    public java.lang.foreign.MemorySegment deviceID_ptr() {return this.ptr.asSlice(OFFSET$deviceID, LAYOUT$deviceID);}

    public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET$pipelineCacheUUID, LAYOUT$pipelineCacheUUID);}
    public char pipelineCacheUUID(int i) {return (char)this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void pipelineCacheUUID(int i, char value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
