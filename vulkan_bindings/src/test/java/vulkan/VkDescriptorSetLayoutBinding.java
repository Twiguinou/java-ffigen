package vulkan;

public record VkDescriptorSetLayoutBinding(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$binding = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorType = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorCount = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 12L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pImmutableSamplers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pImmutableSamplers = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$binding,
            LAYOUT$descriptorType,
            LAYOUT$descriptorCount,
            LAYOUT$stageFlags,
            LAYOUT$pImmutableSamplers
    ).withName("VkDescriptorSetLayoutBinding");

    public VkDescriptorSetLayoutBinding(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
    public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
    public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}

    public int descriptorType() {return this.ptr.get(LAYOUT$descriptorType, OFFSET$descriptorType);}
    public void descriptorType(int value) {this.ptr.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);}
    public java.lang.foreign.MemorySegment descriptorType_ptr() {return this.ptr.asSlice(OFFSET$descriptorType, LAYOUT$descriptorType);}

    public int descriptorCount() {return this.ptr.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);}
    public void descriptorCount(int value) {this.ptr.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);}
    public java.lang.foreign.MemorySegment descriptorCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorCount, LAYOUT$descriptorCount);}

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public java.lang.foreign.MemorySegment pImmutableSamplers() {return this.ptr.get(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers);}
    public void pImmutableSamplers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImmutableSamplers, OFFSET$pImmutableSamplers, value);}
    public java.lang.foreign.MemorySegment pImmutableSamplers_ptr() {return this.ptr.asSlice(OFFSET$pImmutableSamplers, LAYOUT$pImmutableSamplers);}
}
