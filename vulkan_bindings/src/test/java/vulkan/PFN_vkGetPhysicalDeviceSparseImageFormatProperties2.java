package vulkan;

public interface PFN_vkGetPhysicalDeviceSparseImageFormatProperties2
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetPhysicalDeviceSparseImageFormatProperties2.class);

	void invoke(java.lang.foreign.MemorySegment physicalDevice, java.lang.foreign.MemorySegment pFormatInfo, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
