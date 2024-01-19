package vulkan;

public record VkStencilOpState(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$failOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$failOp = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$passOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$passOp = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthFailOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthFailOp = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compareOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$compareOp = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compareMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$compareMask = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$writeMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$writeMask = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reference = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$reference = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$failOp,
            LAYOUT$passOp,
            LAYOUT$depthFailOp,
            LAYOUT$compareOp,
            LAYOUT$compareMask,
            LAYOUT$writeMask,
            LAYOUT$reference
    ).withName("VkStencilOpState");

    public VkStencilOpState(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int failOp() {return this.ptr.get(LAYOUT$failOp, OFFSET$failOp);}
    public void failOp(int value) {this.ptr.set(LAYOUT$failOp, OFFSET$failOp, value);}
    public java.lang.foreign.MemorySegment failOp_ptr() {return this.ptr.asSlice(OFFSET$failOp, LAYOUT$failOp);}

    public int passOp() {return this.ptr.get(LAYOUT$passOp, OFFSET$passOp);}
    public void passOp(int value) {this.ptr.set(LAYOUT$passOp, OFFSET$passOp, value);}
    public java.lang.foreign.MemorySegment passOp_ptr() {return this.ptr.asSlice(OFFSET$passOp, LAYOUT$passOp);}

    public int depthFailOp() {return this.ptr.get(LAYOUT$depthFailOp, OFFSET$depthFailOp);}
    public void depthFailOp(int value) {this.ptr.set(LAYOUT$depthFailOp, OFFSET$depthFailOp, value);}
    public java.lang.foreign.MemorySegment depthFailOp_ptr() {return this.ptr.asSlice(OFFSET$depthFailOp, LAYOUT$depthFailOp);}

    public int compareOp() {return this.ptr.get(LAYOUT$compareOp, OFFSET$compareOp);}
    public void compareOp(int value) {this.ptr.set(LAYOUT$compareOp, OFFSET$compareOp, value);}
    public java.lang.foreign.MemorySegment compareOp_ptr() {return this.ptr.asSlice(OFFSET$compareOp, LAYOUT$compareOp);}

    public int compareMask() {return this.ptr.get(LAYOUT$compareMask, OFFSET$compareMask);}
    public void compareMask(int value) {this.ptr.set(LAYOUT$compareMask, OFFSET$compareMask, value);}
    public java.lang.foreign.MemorySegment compareMask_ptr() {return this.ptr.asSlice(OFFSET$compareMask, LAYOUT$compareMask);}

    public int writeMask() {return this.ptr.get(LAYOUT$writeMask, OFFSET$writeMask);}
    public void writeMask(int value) {this.ptr.set(LAYOUT$writeMask, OFFSET$writeMask, value);}
    public java.lang.foreign.MemorySegment writeMask_ptr() {return this.ptr.asSlice(OFFSET$writeMask, LAYOUT$writeMask);}

    public int reference() {return this.ptr.get(LAYOUT$reference, OFFSET$reference);}
    public void reference(int value) {this.ptr.set(LAYOUT$reference, OFFSET$reference, value);}
    public java.lang.foreign.MemorySegment reference_ptr() {return this.ptr.asSlice(OFFSET$reference, LAYOUT$reference);}
}
