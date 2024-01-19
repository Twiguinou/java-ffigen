package vulkan;

public record VkPhysicalDevice8BitStorageFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageBuffer8BitAccess = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformAndStorageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uniformAndStorageBuffer8BitAccess = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storagePushConstant8 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storagePushConstant8 = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$storageBuffer8BitAccess,
            LAYOUT$uniformAndStorageBuffer8BitAccess,
            LAYOUT$storagePushConstant8,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDevice8BitStorageFeatures");

    public VkPhysicalDevice8BitStorageFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int storageBuffer8BitAccess() {return this.ptr.get(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess);}
    public void storageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment storageBuffer8BitAccess_ptr() {return this.ptr.asSlice(OFFSET$storageBuffer8BitAccess, LAYOUT$storageBuffer8BitAccess);}

    public int uniformAndStorageBuffer8BitAccess() {return this.ptr.get(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess);}
    public void uniformAndStorageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment uniformAndStorageBuffer8BitAccess_ptr() {return this.ptr.asSlice(OFFSET$uniformAndStorageBuffer8BitAccess, LAYOUT$uniformAndStorageBuffer8BitAccess);}

    public int storagePushConstant8() {return this.ptr.get(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8);}
    public void storagePushConstant8(int value) {this.ptr.set(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8, value);}
    public java.lang.foreign.MemorySegment storagePushConstant8_ptr() {return this.ptr.asSlice(OFFSET$storagePushConstant8, LAYOUT$storagePushConstant8);}
}
