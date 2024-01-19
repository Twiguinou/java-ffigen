package vulkan;

public record VkRayTracingShaderGroupCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$generalShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$generalShader = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$closestHitShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$closestHitShader = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$anyHitShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$anyHitShader = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$intersectionShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$intersectionShader = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$type,
            LAYOUT$generalShader,
            LAYOUT$closestHitShader,
            LAYOUT$anyHitShader,
            LAYOUT$intersectionShader,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkRayTracingShaderGroupCreateInfoNV");

    public VkRayTracingShaderGroupCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
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

    public int generalShader() {return this.ptr.get(LAYOUT$generalShader, OFFSET$generalShader);}
    public void generalShader(int value) {this.ptr.set(LAYOUT$generalShader, OFFSET$generalShader, value);}
    public java.lang.foreign.MemorySegment generalShader_ptr() {return this.ptr.asSlice(OFFSET$generalShader, LAYOUT$generalShader);}

    public int closestHitShader() {return this.ptr.get(LAYOUT$closestHitShader, OFFSET$closestHitShader);}
    public void closestHitShader(int value) {this.ptr.set(LAYOUT$closestHitShader, OFFSET$closestHitShader, value);}
    public java.lang.foreign.MemorySegment closestHitShader_ptr() {return this.ptr.asSlice(OFFSET$closestHitShader, LAYOUT$closestHitShader);}

    public int anyHitShader() {return this.ptr.get(LAYOUT$anyHitShader, OFFSET$anyHitShader);}
    public void anyHitShader(int value) {this.ptr.set(LAYOUT$anyHitShader, OFFSET$anyHitShader, value);}
    public java.lang.foreign.MemorySegment anyHitShader_ptr() {return this.ptr.asSlice(OFFSET$anyHitShader, LAYOUT$anyHitShader);}

    public int intersectionShader() {return this.ptr.get(LAYOUT$intersectionShader, OFFSET$intersectionShader);}
    public void intersectionShader(int value) {this.ptr.set(LAYOUT$intersectionShader, OFFSET$intersectionShader, value);}
    public java.lang.foreign.MemorySegment intersectionShader_ptr() {return this.ptr.asSlice(OFFSET$intersectionShader, LAYOUT$intersectionShader);}
}
