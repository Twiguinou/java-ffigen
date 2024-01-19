package vulkan;

public record VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$workgroupMemoryExplicitLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$workgroupMemoryExplicitLayout = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$workgroupMemoryExplicitLayout8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$workgroupMemoryExplicitLayout8BitAccess = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$workgroupMemoryExplicitLayout16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$workgroupMemoryExplicitLayout16BitAccess = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$workgroupMemoryExplicitLayout,
            LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout,
            LAYOUT$workgroupMemoryExplicitLayout8BitAccess,
            LAYOUT$workgroupMemoryExplicitLayout16BitAccess
    ).withName("VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR");

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int workgroupMemoryExplicitLayout() {return this.ptr.get(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout);}
    public void workgroupMemoryExplicitLayout(int value) {this.ptr.set(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout, value);}
    public java.lang.foreign.MemorySegment workgroupMemoryExplicitLayout_ptr() {return this.ptr.asSlice(OFFSET$workgroupMemoryExplicitLayout, LAYOUT$workgroupMemoryExplicitLayout);}

    public int workgroupMemoryExplicitLayoutScalarBlockLayout() {return this.ptr.get(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout);}
    public void workgroupMemoryExplicitLayoutScalarBlockLayout(int value) {this.ptr.set(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout, value);}
    public java.lang.foreign.MemorySegment workgroupMemoryExplicitLayoutScalarBlockLayout_ptr() {return this.ptr.asSlice(OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout, LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout);}

    public int workgroupMemoryExplicitLayout8BitAccess() {return this.ptr.get(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess);}
    public void workgroupMemoryExplicitLayout8BitAccess(int value) {this.ptr.set(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess, value);}
    public java.lang.foreign.MemorySegment workgroupMemoryExplicitLayout8BitAccess_ptr() {return this.ptr.asSlice(OFFSET$workgroupMemoryExplicitLayout8BitAccess, LAYOUT$workgroupMemoryExplicitLayout8BitAccess);}

    public int workgroupMemoryExplicitLayout16BitAccess() {return this.ptr.get(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess);}
    public void workgroupMemoryExplicitLayout16BitAccess(int value) {this.ptr.set(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess, value);}
    public java.lang.foreign.MemorySegment workgroupMemoryExplicitLayout16BitAccess_ptr() {return this.ptr.asSlice(OFFSET$workgroupMemoryExplicitLayout16BitAccess, LAYOUT$workgroupMemoryExplicitLayout16BitAccess);}
}
