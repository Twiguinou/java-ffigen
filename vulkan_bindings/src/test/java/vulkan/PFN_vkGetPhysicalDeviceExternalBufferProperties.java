package vulkan;

public interface PFN_vkGetPhysicalDeviceExternalBufferProperties
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetPhysicalDeviceExternalBufferProperties.class);

	void invoke(java.lang.foreign.MemorySegment physicalDevice, java.lang.foreign.MemorySegment pExternalBufferInfo, java.lang.foreign.MemorySegment pExternalBufferProperties);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
