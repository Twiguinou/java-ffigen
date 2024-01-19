package vulkan;

public record VkPhysicalDeviceDrmPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hasPrimary = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hasPrimary = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hasRender = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hasRender = 20L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$primaryMajor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$primaryMajor = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$primaryMinor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$primaryMinor = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$renderMajor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$renderMajor = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$renderMinor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$renderMinor = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$hasPrimary,
            LAYOUT$hasRender,
            LAYOUT$primaryMajor,
            LAYOUT$primaryMinor,
            LAYOUT$renderMajor,
            LAYOUT$renderMinor
    ).withName("VkPhysicalDeviceDrmPropertiesEXT");

    public VkPhysicalDeviceDrmPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int hasPrimary() {return this.ptr.get(LAYOUT$hasPrimary, OFFSET$hasPrimary);}
    public void hasPrimary(int value) {this.ptr.set(LAYOUT$hasPrimary, OFFSET$hasPrimary, value);}
    public java.lang.foreign.MemorySegment hasPrimary_ptr() {return this.ptr.asSlice(OFFSET$hasPrimary, LAYOUT$hasPrimary);}

    public int hasRender() {return this.ptr.get(LAYOUT$hasRender, OFFSET$hasRender);}
    public void hasRender(int value) {this.ptr.set(LAYOUT$hasRender, OFFSET$hasRender, value);}
    public java.lang.foreign.MemorySegment hasRender_ptr() {return this.ptr.asSlice(OFFSET$hasRender, LAYOUT$hasRender);}

    public long primaryMajor() {return this.ptr.get(LAYOUT$primaryMajor, OFFSET$primaryMajor);}
    public void primaryMajor(long value) {this.ptr.set(LAYOUT$primaryMajor, OFFSET$primaryMajor, value);}
    public java.lang.foreign.MemorySegment primaryMajor_ptr() {return this.ptr.asSlice(OFFSET$primaryMajor, LAYOUT$primaryMajor);}

    public long primaryMinor() {return this.ptr.get(LAYOUT$primaryMinor, OFFSET$primaryMinor);}
    public void primaryMinor(long value) {this.ptr.set(LAYOUT$primaryMinor, OFFSET$primaryMinor, value);}
    public java.lang.foreign.MemorySegment primaryMinor_ptr() {return this.ptr.asSlice(OFFSET$primaryMinor, LAYOUT$primaryMinor);}

    public long renderMajor() {return this.ptr.get(LAYOUT$renderMajor, OFFSET$renderMajor);}
    public void renderMajor(long value) {this.ptr.set(LAYOUT$renderMajor, OFFSET$renderMajor, value);}
    public java.lang.foreign.MemorySegment renderMajor_ptr() {return this.ptr.asSlice(OFFSET$renderMajor, LAYOUT$renderMajor);}

    public long renderMinor() {return this.ptr.get(LAYOUT$renderMinor, OFFSET$renderMinor);}
    public void renderMinor(long value) {this.ptr.set(LAYOUT$renderMinor, OFFSET$renderMinor, value);}
    public java.lang.foreign.MemorySegment renderMinor_ptr() {return this.ptr.asSlice(OFFSET$renderMinor, LAYOUT$renderMinor);}
}
