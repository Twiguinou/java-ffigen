package vulkan;

public record VkPhysicalDeviceProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$apiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$apiVersion = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$driverVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$driverVersion = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vendorID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vendorID = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceID = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceType = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$deviceName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$deviceName = 20L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$pipelineCacheUUID = 276L;
    public static final java.lang.foreign.GroupLayout LAYOUT$limits = vulkan.VkPhysicalDeviceLimits.gStructLayout;
    public static final long OFFSET$limits = 296L;
    public static final java.lang.foreign.GroupLayout LAYOUT$sparseProperties = vulkan.VkPhysicalDeviceSparseProperties.gStructLayout;
    public static final long OFFSET$sparseProperties = 800L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$apiVersion,
            LAYOUT$driverVersion,
            LAYOUT$vendorID,
            LAYOUT$deviceID,
            LAYOUT$deviceType,
            LAYOUT$deviceName,
            LAYOUT$pipelineCacheUUID,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$limits,
            LAYOUT$sparseProperties,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceProperties");

    public VkPhysicalDeviceProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int apiVersion() {return this.ptr.get(LAYOUT$apiVersion, OFFSET$apiVersion);}
    public void apiVersion(int value) {this.ptr.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);}
    public java.lang.foreign.MemorySegment apiVersion_ptr() {return this.ptr.asSlice(OFFSET$apiVersion, LAYOUT$apiVersion);}

    public int driverVersion() {return this.ptr.get(LAYOUT$driverVersion, OFFSET$driverVersion);}
    public void driverVersion(int value) {this.ptr.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);}
    public java.lang.foreign.MemorySegment driverVersion_ptr() {return this.ptr.asSlice(OFFSET$driverVersion, LAYOUT$driverVersion);}

    public int vendorID() {return this.ptr.get(LAYOUT$vendorID, OFFSET$vendorID);}
    public void vendorID(int value) {this.ptr.set(LAYOUT$vendorID, OFFSET$vendorID, value);}
    public java.lang.foreign.MemorySegment vendorID_ptr() {return this.ptr.asSlice(OFFSET$vendorID, LAYOUT$vendorID);}

    public int deviceID() {return this.ptr.get(LAYOUT$deviceID, OFFSET$deviceID);}
    public void deviceID(int value) {this.ptr.set(LAYOUT$deviceID, OFFSET$deviceID, value);}
    public java.lang.foreign.MemorySegment deviceID_ptr() {return this.ptr.asSlice(OFFSET$deviceID, LAYOUT$deviceID);}

    public int deviceType() {return this.ptr.get(LAYOUT$deviceType, OFFSET$deviceType);}
    public void deviceType(int value) {this.ptr.set(LAYOUT$deviceType, OFFSET$deviceType, value);}
    public java.lang.foreign.MemorySegment deviceType_ptr() {return this.ptr.asSlice(OFFSET$deviceType, LAYOUT$deviceType);}

    public java.lang.foreign.MemorySegment deviceName() {return this.ptr.asSlice(OFFSET$deviceName, LAYOUT$deviceName);}
    public char deviceName(int i) {return (char)this.deviceName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void deviceName(int i, char value) {this.deviceName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET$pipelineCacheUUID, LAYOUT$pipelineCacheUUID);}
    public char pipelineCacheUUID(int i) {return (char)this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void pipelineCacheUUID(int i, char value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public vulkan.VkPhysicalDeviceLimits limits() {return new vulkan.VkPhysicalDeviceLimits(this.ptr.asSlice(OFFSET$limits, LAYOUT$limits));}

    public vulkan.VkPhysicalDeviceSparseProperties sparseProperties() {return new vulkan.VkPhysicalDeviceSparseProperties(this.ptr.asSlice(OFFSET$sparseProperties, LAYOUT$sparseProperties));}
}
