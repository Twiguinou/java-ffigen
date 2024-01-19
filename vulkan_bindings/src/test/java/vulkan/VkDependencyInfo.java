package vulkan;

public record VkDependencyInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dependencyFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dependencyFlags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryBarrierCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMemoryBarriers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMemoryBarriers = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferMemoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferMemoryBarrierCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pBufferMemoryBarriers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pBufferMemoryBarriers = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageMemoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageMemoryBarrierCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pImageMemoryBarriers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pImageMemoryBarriers = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$dependencyFlags,
            LAYOUT$memoryBarrierCount,
            LAYOUT$pMemoryBarriers,
            LAYOUT$bufferMemoryBarrierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pBufferMemoryBarriers,
            LAYOUT$imageMemoryBarrierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pImageMemoryBarriers
    ).withName("VkDependencyInfo");

    public VkDependencyInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int dependencyFlags() {return this.ptr.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);}
    public void dependencyFlags(int value) {this.ptr.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);}
    public java.lang.foreign.MemorySegment dependencyFlags_ptr() {return this.ptr.asSlice(OFFSET$dependencyFlags, LAYOUT$dependencyFlags);}

    public int memoryBarrierCount() {return this.ptr.get(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount);}
    public void memoryBarrierCount(int value) {this.ptr.set(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment memoryBarrierCount_ptr() {return this.ptr.asSlice(OFFSET$memoryBarrierCount, LAYOUT$memoryBarrierCount);}

    public java.lang.foreign.MemorySegment pMemoryBarriers() {return this.ptr.get(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers);}
    public void pMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment pMemoryBarriers_ptr() {return this.ptr.asSlice(OFFSET$pMemoryBarriers, LAYOUT$pMemoryBarriers);}

    public int bufferMemoryBarrierCount() {return this.ptr.get(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount);}
    public void bufferMemoryBarrierCount(int value) {this.ptr.set(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment bufferMemoryBarrierCount_ptr() {return this.ptr.asSlice(OFFSET$bufferMemoryBarrierCount, LAYOUT$bufferMemoryBarrierCount);}

    public java.lang.foreign.MemorySegment pBufferMemoryBarriers() {return this.ptr.get(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers);}
    public void pBufferMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment pBufferMemoryBarriers_ptr() {return this.ptr.asSlice(OFFSET$pBufferMemoryBarriers, LAYOUT$pBufferMemoryBarriers);}

    public int imageMemoryBarrierCount() {return this.ptr.get(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount);}
    public void imageMemoryBarrierCount(int value) {this.ptr.set(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment imageMemoryBarrierCount_ptr() {return this.ptr.asSlice(OFFSET$imageMemoryBarrierCount, LAYOUT$imageMemoryBarrierCount);}

    public java.lang.foreign.MemorySegment pImageMemoryBarriers() {return this.ptr.get(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers);}
    public void pImageMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment pImageMemoryBarriers_ptr() {return this.ptr.asSlice(OFFSET$pImageMemoryBarriers, LAYOUT$pImageMemoryBarriers);}
}
