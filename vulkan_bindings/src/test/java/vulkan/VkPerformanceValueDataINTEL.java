package vulkan;

public record VkPerformanceValueDataINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$value32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$value32 = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$value64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$value64 = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$valueFloat = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$valueFloat = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$valueBool = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$valueBool = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$valueString = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$valueString = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$value32,
            LAYOUT$value64,
            LAYOUT$valueFloat,
            LAYOUT$valueBool,
            LAYOUT$valueString
    ).withName("VkPerformanceValueDataINTEL");

    public VkPerformanceValueDataINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int value32() {return this.ptr.get(LAYOUT$value32, OFFSET$value32);}
    public void value32(int value) {this.ptr.set(LAYOUT$value32, OFFSET$value32, value);}
    public java.lang.foreign.MemorySegment value32_ptr() {return this.ptr.asSlice(OFFSET$value32, LAYOUT$value32);}

    public long value64() {return this.ptr.get(LAYOUT$value64, OFFSET$value64);}
    public void value64(long value) {this.ptr.set(LAYOUT$value64, OFFSET$value64, value);}
    public java.lang.foreign.MemorySegment value64_ptr() {return this.ptr.asSlice(OFFSET$value64, LAYOUT$value64);}

    public float valueFloat() {return this.ptr.get(LAYOUT$valueFloat, OFFSET$valueFloat);}
    public void valueFloat(float value) {this.ptr.set(LAYOUT$valueFloat, OFFSET$valueFloat, value);}
    public java.lang.foreign.MemorySegment valueFloat_ptr() {return this.ptr.asSlice(OFFSET$valueFloat, LAYOUT$valueFloat);}

    public int valueBool() {return this.ptr.get(LAYOUT$valueBool, OFFSET$valueBool);}
    public void valueBool(int value) {this.ptr.set(LAYOUT$valueBool, OFFSET$valueBool, value);}
    public java.lang.foreign.MemorySegment valueBool_ptr() {return this.ptr.asSlice(OFFSET$valueBool, LAYOUT$valueBool);}

    public java.lang.foreign.MemorySegment valueString() {return this.ptr.get(LAYOUT$valueString, OFFSET$valueString);}
    public void valueString(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$valueString, OFFSET$valueString, value);}
    public java.lang.foreign.MemorySegment valueString_ptr() {return this.ptr.asSlice(OFFSET$valueString, LAYOUT$valueString);}
}
