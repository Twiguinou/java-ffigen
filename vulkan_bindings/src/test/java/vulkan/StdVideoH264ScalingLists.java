package vulkan;

public record StdVideoH264ScalingLists(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$scaling_list_present_mask = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$scaling_list_present_mask = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$use_default_scaling_matrix_mask = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$use_default_scaling_matrix_mask = 2L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList4x4 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$ScalingList4x4 = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList8x8 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$ScalingList8x8 = 100L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$scaling_list_present_mask,
            LAYOUT$use_default_scaling_matrix_mask,
            LAYOUT$ScalingList4x4,
            LAYOUT$ScalingList8x8
    ).withName("StdVideoH264ScalingLists");

    public StdVideoH264ScalingLists(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public short scaling_list_present_mask() {return this.ptr.get(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask);}
    public void scaling_list_present_mask(short value) {this.ptr.set(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask, value);}
    public java.lang.foreign.MemorySegment scaling_list_present_mask_ptr() {return this.ptr.asSlice(OFFSET$scaling_list_present_mask, LAYOUT$scaling_list_present_mask);}

    public short use_default_scaling_matrix_mask() {return this.ptr.get(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask);}
    public void use_default_scaling_matrix_mask(short value) {this.ptr.set(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask, value);}
    public java.lang.foreign.MemorySegment use_default_scaling_matrix_mask_ptr() {return this.ptr.asSlice(OFFSET$use_default_scaling_matrix_mask, LAYOUT$use_default_scaling_matrix_mask);}

    public java.lang.foreign.MemorySegment ScalingList4x4() {return this.ptr.asSlice(OFFSET$ScalingList4x4, LAYOUT$ScalingList4x4);}

    public java.lang.foreign.MemorySegment ScalingList8x8() {return this.ptr.asSlice(OFFSET$ScalingList8x8, LAYOUT$ScalingList8x8);}
}
