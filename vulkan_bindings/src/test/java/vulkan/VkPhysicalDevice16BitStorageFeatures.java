package vulkan;

public record VkPhysicalDevice16BitStorageFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageBuffer16BitAccess = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storagePushConstant16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storagePushConstant16 = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageInputOutput16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageInputOutput16 = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$storageBuffer16BitAccess,
            LAYOUT$uniformAndStorageBuffer16BitAccess,
            LAYOUT$storagePushConstant16,
            LAYOUT$storageInputOutput16
    ).withName("VkPhysicalDevice16BitStorageFeatures");

    public VkPhysicalDevice16BitStorageFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int storageBuffer16BitAccess() {return this.ptr.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);}
    public void storageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment storageBuffer16BitAccess_ptr() {return this.ptr.asSlice(OFFSET$storageBuffer16BitAccess, LAYOUT$storageBuffer16BitAccess);}

    public int uniformAndStorageBuffer16BitAccess() {return this.ptr.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);}
    public void uniformAndStorageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment uniformAndStorageBuffer16BitAccess_ptr() {return this.ptr.asSlice(OFFSET$uniformAndStorageBuffer16BitAccess, LAYOUT$uniformAndStorageBuffer16BitAccess);}

    public int storagePushConstant16() {return this.ptr.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);}
    public void storagePushConstant16(int value) {this.ptr.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);}
    public java.lang.foreign.MemorySegment storagePushConstant16_ptr() {return this.ptr.asSlice(OFFSET$storagePushConstant16, LAYOUT$storagePushConstant16);}

    public int storageInputOutput16() {return this.ptr.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);}
    public void storageInputOutput16(int value) {this.ptr.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);}
    public java.lang.foreign.MemorySegment storageInputOutput16_ptr() {return this.ptr.asSlice(OFFSET$storageInputOutput16, LAYOUT$storageInputOutput16);}
}
