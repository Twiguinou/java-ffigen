package vulkan;

public record VkShaderModuleIdentifierEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$identifierSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$identifierSize = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$identifier = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$identifier = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$identifierSize,
            LAYOUT$identifier,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkShaderModuleIdentifierEXT");

    public VkShaderModuleIdentifierEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int identifierSize() {return this.ptr.get(LAYOUT$identifierSize, OFFSET$identifierSize);}
    public void identifierSize(int value) {this.ptr.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);}
    public java.lang.foreign.MemorySegment identifierSize_ptr() {return this.ptr.asSlice(OFFSET$identifierSize, LAYOUT$identifierSize);}

    public java.lang.foreign.MemorySegment identifier() {return this.ptr.asSlice(OFFSET$identifier, LAYOUT$identifier);}
    public char identifier(int i) {return (char)this.identifier().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void identifier(int i, char value) {this.identifier().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
