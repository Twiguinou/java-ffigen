package vulkan;

public record VkCuFunctionCreateInfoNVX(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$module = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$module = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pName = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$module,
            LAYOUT$pName
    ).withName("VkCuFunctionCreateInfoNVX");

    public VkCuFunctionCreateInfoNVX(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT$module, OFFSET$module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$module, OFFSET$module, value);}
    public java.lang.foreign.MemorySegment module_ptr() {return this.ptr.asSlice(OFFSET$module, LAYOUT$module);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT$pName, OFFSET$pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pName, OFFSET$pName, value);}
    public java.lang.foreign.MemorySegment pName_ptr() {return this.ptr.asSlice(OFFSET$pName, LAYOUT$pName);}
}
