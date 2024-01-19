package vulkan;

public record VkPastPresentationTimingGOOGLE(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$presentID = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$desiredPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$desiredPresentTime = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$actualPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$actualPresentTime = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$earliestPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$earliestPresentTime = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$presentMargin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$presentMargin = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$presentID,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$desiredPresentTime,
            LAYOUT$actualPresentTime,
            LAYOUT$earliestPresentTime,
            LAYOUT$presentMargin
    ).withName("VkPastPresentationTimingGOOGLE");

    public VkPastPresentationTimingGOOGLE(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int presentID() {return this.ptr.get(LAYOUT$presentID, OFFSET$presentID);}
    public void presentID(int value) {this.ptr.set(LAYOUT$presentID, OFFSET$presentID, value);}
    public java.lang.foreign.MemorySegment presentID_ptr() {return this.ptr.asSlice(OFFSET$presentID, LAYOUT$presentID);}

    public long desiredPresentTime() {return this.ptr.get(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime);}
    public void desiredPresentTime(long value) {this.ptr.set(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime, value);}
    public java.lang.foreign.MemorySegment desiredPresentTime_ptr() {return this.ptr.asSlice(OFFSET$desiredPresentTime, LAYOUT$desiredPresentTime);}

    public long actualPresentTime() {return this.ptr.get(LAYOUT$actualPresentTime, OFFSET$actualPresentTime);}
    public void actualPresentTime(long value) {this.ptr.set(LAYOUT$actualPresentTime, OFFSET$actualPresentTime, value);}
    public java.lang.foreign.MemorySegment actualPresentTime_ptr() {return this.ptr.asSlice(OFFSET$actualPresentTime, LAYOUT$actualPresentTime);}

    public long earliestPresentTime() {return this.ptr.get(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime);}
    public void earliestPresentTime(long value) {this.ptr.set(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime, value);}
    public java.lang.foreign.MemorySegment earliestPresentTime_ptr() {return this.ptr.asSlice(OFFSET$earliestPresentTime, LAYOUT$earliestPresentTime);}

    public long presentMargin() {return this.ptr.get(LAYOUT$presentMargin, OFFSET$presentMargin);}
    public void presentMargin(long value) {this.ptr.set(LAYOUT$presentMargin, OFFSET$presentMargin, value);}
    public java.lang.foreign.MemorySegment presentMargin_ptr() {return this.ptr.asSlice(OFFSET$presentMargin, LAYOUT$presentMargin);}
}
