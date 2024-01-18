package vulkan;

public record VkApplicationInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pApplicationName = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pApplicationName = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$applicationVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$applicationVersion = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pEngineName = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pEngineName = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$engineVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$engineVersion = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$apiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$apiVersion = 44L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$pApplicationName,
			LAYOUT$applicationVersion,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pEngineName,
			LAYOUT$engineVersion,
			LAYOUT$apiVersion
	).withName("VkApplicationInfo");

	public VkApplicationInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment pApplicationName() {return this.ptr.get(LAYOUT$pApplicationName, OFFSET$pApplicationName);}
	public void pApplicationName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pApplicationName, OFFSET$pApplicationName, value);}
	public java.lang.foreign.MemorySegment pApplicationName_ptr() {return this.ptr.asSlice(OFFSET$pApplicationName, LAYOUT$pApplicationName);}

	public int applicationVersion() {return this.ptr.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);}
	public void applicationVersion(int value) {this.ptr.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);}
	public java.lang.foreign.MemorySegment applicationVersion_ptr() {return this.ptr.asSlice(OFFSET$applicationVersion, LAYOUT$applicationVersion);}

	public java.lang.foreign.MemorySegment pEngineName() {return this.ptr.get(LAYOUT$pEngineName, OFFSET$pEngineName);}
	public void pEngineName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pEngineName, OFFSET$pEngineName, value);}
	public java.lang.foreign.MemorySegment pEngineName_ptr() {return this.ptr.asSlice(OFFSET$pEngineName, LAYOUT$pEngineName);}

	public int engineVersion() {return this.ptr.get(LAYOUT$engineVersion, OFFSET$engineVersion);}
	public void engineVersion(int value) {this.ptr.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);}
	public java.lang.foreign.MemorySegment engineVersion_ptr() {return this.ptr.asSlice(OFFSET$engineVersion, LAYOUT$engineVersion);}

	public int apiVersion() {return this.ptr.get(LAYOUT$apiVersion, OFFSET$apiVersion);}
	public void apiVersion(int value) {this.ptr.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);}
	public java.lang.foreign.MemorySegment apiVersion_ptr() {return this.ptr.asSlice(OFFSET$apiVersion, LAYOUT$apiVersion);}
}
