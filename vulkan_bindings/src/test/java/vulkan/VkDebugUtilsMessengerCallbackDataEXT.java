package vulkan;

public record VkDebugUtilsMessengerCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMessageIdName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMessageIdName = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$messageIdNumber = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$messageIdNumber = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMessage = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMessage = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueLabelCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueLabelCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pQueueLabels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pQueueLabels = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cmdBufLabelCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cmdBufLabelCount = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCmdBufLabels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCmdBufLabels = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$objectCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$objectCount = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pObjects = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pObjects = 88L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pMessageIdName,
            LAYOUT$messageIdNumber,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pMessage,
            LAYOUT$queueLabelCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pQueueLabels,
            LAYOUT$cmdBufLabelCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pCmdBufLabels,
            LAYOUT$objectCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pObjects
    ).withName("VkDebugUtilsMessengerCallbackDataEXT");

    public VkDebugUtilsMessengerCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pMessageIdName() {return this.ptr.get(LAYOUT$pMessageIdName, OFFSET$pMessageIdName);}
    public void pMessageIdName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMessageIdName, OFFSET$pMessageIdName, value);}
    public java.lang.foreign.MemorySegment pMessageIdName_ptr() {return this.ptr.asSlice(OFFSET$pMessageIdName, LAYOUT$pMessageIdName);}

    public int messageIdNumber() {return this.ptr.get(LAYOUT$messageIdNumber, OFFSET$messageIdNumber);}
    public void messageIdNumber(int value) {this.ptr.set(LAYOUT$messageIdNumber, OFFSET$messageIdNumber, value);}
    public java.lang.foreign.MemorySegment messageIdNumber_ptr() {return this.ptr.asSlice(OFFSET$messageIdNumber, LAYOUT$messageIdNumber);}

    public java.lang.foreign.MemorySegment pMessage() {return this.ptr.get(LAYOUT$pMessage, OFFSET$pMessage);}
    public void pMessage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMessage, OFFSET$pMessage, value);}
    public java.lang.foreign.MemorySegment pMessage_ptr() {return this.ptr.asSlice(OFFSET$pMessage, LAYOUT$pMessage);}

    public int queueLabelCount() {return this.ptr.get(LAYOUT$queueLabelCount, OFFSET$queueLabelCount);}
    public void queueLabelCount(int value) {this.ptr.set(LAYOUT$queueLabelCount, OFFSET$queueLabelCount, value);}
    public java.lang.foreign.MemorySegment queueLabelCount_ptr() {return this.ptr.asSlice(OFFSET$queueLabelCount, LAYOUT$queueLabelCount);}

    public java.lang.foreign.MemorySegment pQueueLabels() {return this.ptr.get(LAYOUT$pQueueLabels, OFFSET$pQueueLabels);}
    public void pQueueLabels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueLabels, OFFSET$pQueueLabels, value);}
    public java.lang.foreign.MemorySegment pQueueLabels_ptr() {return this.ptr.asSlice(OFFSET$pQueueLabels, LAYOUT$pQueueLabels);}

    public int cmdBufLabelCount() {return this.ptr.get(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount);}
    public void cmdBufLabelCount(int value) {this.ptr.set(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount, value);}
    public java.lang.foreign.MemorySegment cmdBufLabelCount_ptr() {return this.ptr.asSlice(OFFSET$cmdBufLabelCount, LAYOUT$cmdBufLabelCount);}

    public java.lang.foreign.MemorySegment pCmdBufLabels() {return this.ptr.get(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels);}
    public void pCmdBufLabels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels, value);}
    public java.lang.foreign.MemorySegment pCmdBufLabels_ptr() {return this.ptr.asSlice(OFFSET$pCmdBufLabels, LAYOUT$pCmdBufLabels);}

    public int objectCount() {return this.ptr.get(LAYOUT$objectCount, OFFSET$objectCount);}
    public void objectCount(int value) {this.ptr.set(LAYOUT$objectCount, OFFSET$objectCount, value);}
    public java.lang.foreign.MemorySegment objectCount_ptr() {return this.ptr.asSlice(OFFSET$objectCount, LAYOUT$objectCount);}

    public java.lang.foreign.MemorySegment pObjects() {return this.ptr.get(LAYOUT$pObjects, OFFSET$pObjects);}
    public void pObjects(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pObjects, OFFSET$pObjects, value);}
    public java.lang.foreign.MemorySegment pObjects_ptr() {return this.ptr.asSlice(OFFSET$pObjects, LAYOUT$pObjects);}
}
