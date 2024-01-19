package vulkan;

public record VkPerformanceOverrideInfoINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$enable = 20L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$parameter = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$parameter = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$type,
            LAYOUT$enable,
            LAYOUT$parameter
    ).withName("VkPerformanceOverrideInfoINTEL");

    public VkPerformanceOverrideInfoINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int enable() {return this.ptr.get(LAYOUT$enable, OFFSET$enable);}
    public void enable(int value) {this.ptr.set(LAYOUT$enable, OFFSET$enable, value);}
    public java.lang.foreign.MemorySegment enable_ptr() {return this.ptr.asSlice(OFFSET$enable, LAYOUT$enable);}

    public long parameter() {return this.ptr.get(LAYOUT$parameter, OFFSET$parameter);}
    public void parameter(long value) {this.ptr.set(LAYOUT$parameter, OFFSET$parameter, value);}
    public java.lang.foreign.MemorySegment parameter_ptr() {return this.ptr.asSlice(OFFSET$parameter, LAYOUT$parameter);}
}
