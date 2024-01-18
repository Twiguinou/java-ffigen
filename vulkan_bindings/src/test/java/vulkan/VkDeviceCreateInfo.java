package vulkan;

public record VkDeviceCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueCreateInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$queueCreateInfoCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pQueueCreateInfos = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pQueueCreateInfos = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enabledLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$enabledLayerCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppEnabledLayerNames = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ppEnabledLayerNames = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enabledExtensionCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$enabledExtensionCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppEnabledExtensionNames = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ppEnabledExtensionNames = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pEnabledFeatures = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pEnabledFeatures = 64L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$queueCreateInfoCount,
			LAYOUT$pQueueCreateInfos,
			LAYOUT$enabledLayerCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$ppEnabledLayerNames,
			LAYOUT$enabledExtensionCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$ppEnabledExtensionNames,
			LAYOUT$pEnabledFeatures
	).withName("VkDeviceCreateInfo");

	public VkDeviceCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int queueCreateInfoCount() {return this.ptr.get(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount);}
	public void queueCreateInfoCount(int value) {this.ptr.set(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount, value);}
	public java.lang.foreign.MemorySegment queueCreateInfoCount_ptr() {return this.ptr.asSlice(OFFSET$queueCreateInfoCount, LAYOUT$queueCreateInfoCount);}

	public java.lang.foreign.MemorySegment pQueueCreateInfos() {return this.ptr.get(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos);}
	public void pQueueCreateInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos, value);}
	public java.lang.foreign.MemorySegment pQueueCreateInfos_ptr() {return this.ptr.asSlice(OFFSET$pQueueCreateInfos, LAYOUT$pQueueCreateInfos);}

	public int enabledLayerCount() {return this.ptr.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);}
	public void enabledLayerCount(int value) {this.ptr.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);}
	public java.lang.foreign.MemorySegment enabledLayerCount_ptr() {return this.ptr.asSlice(OFFSET$enabledLayerCount, LAYOUT$enabledLayerCount);}

	public java.lang.foreign.MemorySegment ppEnabledLayerNames() {return this.ptr.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);}
	public void ppEnabledLayerNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);}
	public java.lang.foreign.MemorySegment ppEnabledLayerNames_ptr() {return this.ptr.asSlice(OFFSET$ppEnabledLayerNames, LAYOUT$ppEnabledLayerNames);}

	public int enabledExtensionCount() {return this.ptr.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);}
	public void enabledExtensionCount(int value) {this.ptr.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);}
	public java.lang.foreign.MemorySegment enabledExtensionCount_ptr() {return this.ptr.asSlice(OFFSET$enabledExtensionCount, LAYOUT$enabledExtensionCount);}

	public java.lang.foreign.MemorySegment ppEnabledExtensionNames() {return this.ptr.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);}
	public void ppEnabledExtensionNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);}
	public java.lang.foreign.MemorySegment ppEnabledExtensionNames_ptr() {return this.ptr.asSlice(OFFSET$ppEnabledExtensionNames, LAYOUT$ppEnabledExtensionNames);}

	public java.lang.foreign.MemorySegment pEnabledFeatures() {return this.ptr.get(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures);}
	public void pEnabledFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures, value);}
	public java.lang.foreign.MemorySegment pEnabledFeatures_ptr() {return this.ptr.asSlice(OFFSET$pEnabledFeatures, LAYOUT$pEnabledFeatures);}
}
