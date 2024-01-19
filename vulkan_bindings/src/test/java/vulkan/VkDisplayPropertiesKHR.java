package vulkan;

public record VkDisplayPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$display = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$display = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$displayName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$displayName = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$physicalDimensions = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$physicalDimensions = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$physicalResolution = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$physicalResolution = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedTransforms = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$planeReorderPossible = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$planeReorderPossible = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$persistentContent = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$persistentContent = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$display,
            LAYOUT$displayName,
            LAYOUT$physicalDimensions,
            LAYOUT$physicalResolution,
            LAYOUT$supportedTransforms,
            LAYOUT$planeReorderPossible,
            LAYOUT$persistentContent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDisplayPropertiesKHR");

    public VkDisplayPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment display() {return this.ptr.get(LAYOUT$display, OFFSET$display);}
    public void display(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$display, OFFSET$display, value);}
    public java.lang.foreign.MemorySegment display_ptr() {return this.ptr.asSlice(OFFSET$display, LAYOUT$display);}

    public java.lang.foreign.MemorySegment displayName() {return this.ptr.get(LAYOUT$displayName, OFFSET$displayName);}
    public void displayName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$displayName, OFFSET$displayName, value);}
    public java.lang.foreign.MemorySegment displayName_ptr() {return this.ptr.asSlice(OFFSET$displayName, LAYOUT$displayName);}

    public vulkan.VkExtent2D physicalDimensions() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$physicalDimensions, LAYOUT$physicalDimensions));}

    public vulkan.VkExtent2D physicalResolution() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$physicalResolution, LAYOUT$physicalResolution));}

    public int supportedTransforms() {return this.ptr.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);}
    public void supportedTransforms(int value) {this.ptr.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);}
    public java.lang.foreign.MemorySegment supportedTransforms_ptr() {return this.ptr.asSlice(OFFSET$supportedTransforms, LAYOUT$supportedTransforms);}

    public int planeReorderPossible() {return this.ptr.get(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible);}
    public void planeReorderPossible(int value) {this.ptr.set(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible, value);}
    public java.lang.foreign.MemorySegment planeReorderPossible_ptr() {return this.ptr.asSlice(OFFSET$planeReorderPossible, LAYOUT$planeReorderPossible);}

    public int persistentContent() {return this.ptr.get(LAYOUT$persistentContent, OFFSET$persistentContent);}
    public void persistentContent(int value) {this.ptr.set(LAYOUT$persistentContent, OFFSET$persistentContent, value);}
    public java.lang.foreign.MemorySegment persistentContent_ptr() {return this.ptr.asSlice(OFFSET$persistentContent, LAYOUT$persistentContent);}
}
