package vulkan;

public record VkComponentMapping(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$r = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$g = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$g = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$b = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$a = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$a = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$r,
            LAYOUT$g,
            LAYOUT$b,
            LAYOUT$a
    ).withName("VkComponentMapping");

    public VkComponentMapping(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int r() {return this.ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(int value) {this.ptr.set(LAYOUT$r, OFFSET$r, value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this.ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public int g() {return this.ptr.get(LAYOUT$g, OFFSET$g);}
    public void g(int value) {this.ptr.set(LAYOUT$g, OFFSET$g, value);}
    public java.lang.foreign.MemorySegment g_ptr() {return this.ptr.asSlice(OFFSET$g, LAYOUT$g);}

    public int b() {return this.ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(int value) {this.ptr.set(LAYOUT$b, OFFSET$b, value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this.ptr.asSlice(OFFSET$b, LAYOUT$b);}

    public int a() {return this.ptr.get(LAYOUT$a, OFFSET$a);}
    public void a(int value) {this.ptr.set(LAYOUT$a, OFFSET$a, value);}
    public java.lang.foreign.MemorySegment a_ptr() {return this.ptr.asSlice(OFFSET$a, LAYOUT$a);}
}
