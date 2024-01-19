package vulkan;

public record VkDebugUtilsMessengerCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$messageSeverity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$messageSeverity = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$messageType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$messageType = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnUserCallback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnUserCallback = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$messageSeverity,
            LAYOUT$messageType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pfnUserCallback,
            LAYOUT$pUserData
    ).withName("VkDebugUtilsMessengerCreateInfoEXT");

    public VkDebugUtilsMessengerCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
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

    public int messageSeverity() {return this.ptr.get(LAYOUT$messageSeverity, OFFSET$messageSeverity);}
    public void messageSeverity(int value) {this.ptr.set(LAYOUT$messageSeverity, OFFSET$messageSeverity, value);}
    public java.lang.foreign.MemorySegment messageSeverity_ptr() {return this.ptr.asSlice(OFFSET$messageSeverity, LAYOUT$messageSeverity);}

    public int messageType() {return this.ptr.get(LAYOUT$messageType, OFFSET$messageType);}
    public void messageType(int value) {this.ptr.set(LAYOUT$messageType, OFFSET$messageType, value);}
    public java.lang.foreign.MemorySegment messageType_ptr() {return this.ptr.asSlice(OFFSET$messageType, LAYOUT$messageType);}

    public java.lang.foreign.MemorySegment pfnUserCallback() {return this.ptr.get(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback);}
    public void pfnUserCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback, value);}
    public java.lang.foreign.MemorySegment pfnUserCallback_ptr() {return this.ptr.asSlice(OFFSET$pfnUserCallback, LAYOUT$pfnUserCallback);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}
}
