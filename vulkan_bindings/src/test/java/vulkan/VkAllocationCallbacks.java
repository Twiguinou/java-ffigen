package vulkan;

public record VkAllocationCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnAllocation = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnAllocation = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnReallocation = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnReallocation = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnFree = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnFree = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnInternalAllocation = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnInternalAllocation = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnInternalFree = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnInternalFree = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pUserData,
            LAYOUT$pfnAllocation,
            LAYOUT$pfnReallocation,
            LAYOUT$pfnFree,
            LAYOUT$pfnInternalAllocation,
            LAYOUT$pfnInternalFree
    ).withName("VkAllocationCallbacks");

    public VkAllocationCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}

    public java.lang.foreign.MemorySegment pfnAllocation() {return this.ptr.get(LAYOUT$pfnAllocation, OFFSET$pfnAllocation);}
    public void pfnAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnAllocation, OFFSET$pfnAllocation, value);}
    public java.lang.foreign.MemorySegment pfnAllocation_ptr() {return this.ptr.asSlice(OFFSET$pfnAllocation, LAYOUT$pfnAllocation);}

    public java.lang.foreign.MemorySegment pfnReallocation() {return this.ptr.get(LAYOUT$pfnReallocation, OFFSET$pfnReallocation);}
    public void pfnReallocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnReallocation, OFFSET$pfnReallocation, value);}
    public java.lang.foreign.MemorySegment pfnReallocation_ptr() {return this.ptr.asSlice(OFFSET$pfnReallocation, LAYOUT$pfnReallocation);}

    public java.lang.foreign.MemorySegment pfnFree() {return this.ptr.get(LAYOUT$pfnFree, OFFSET$pfnFree);}
    public void pfnFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);}
    public java.lang.foreign.MemorySegment pfnFree_ptr() {return this.ptr.asSlice(OFFSET$pfnFree, LAYOUT$pfnFree);}

    public java.lang.foreign.MemorySegment pfnInternalAllocation() {return this.ptr.get(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation);}
    public void pfnInternalAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation, value);}
    public java.lang.foreign.MemorySegment pfnInternalAllocation_ptr() {return this.ptr.asSlice(OFFSET$pfnInternalAllocation, LAYOUT$pfnInternalAllocation);}

    public java.lang.foreign.MemorySegment pfnInternalFree() {return this.ptr.get(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree);}
    public void pfnInternalFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree, value);}
    public java.lang.foreign.MemorySegment pfnInternalFree_ptr() {return this.ptr.asSlice(OFFSET$pfnInternalFree, LAYOUT$pfnInternalFree);}
}
