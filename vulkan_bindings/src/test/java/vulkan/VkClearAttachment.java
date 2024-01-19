package vulkan;

public record VkClearAttachment(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$aspectMask = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorAttachment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorAttachment = 4L;
	public static final java.lang.foreign.GroupLayout LAYOUT$clearValue = vulkan.VkClearValue.gStructLayout;
	public static final long OFFSET$clearValue = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$aspectMask,
			LAYOUT$colorAttachment,
			LAYOUT$clearValue
	).withName("VkClearAttachment");

	public VkClearAttachment(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
	public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
	public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}

	public int colorAttachment() {return this.ptr.get(LAYOUT$colorAttachment, OFFSET$colorAttachment);}
	public void colorAttachment(int value) {this.ptr.set(LAYOUT$colorAttachment, OFFSET$colorAttachment, value);}
	public java.lang.foreign.MemorySegment colorAttachment_ptr() {return this.ptr.asSlice(OFFSET$colorAttachment, LAYOUT$colorAttachment);}

	public vulkan.VkClearValue clearValue() {return new vulkan.VkClearValue(this.ptr.asSlice(OFFSET$clearValue, LAYOUT$clearValue));}
}
