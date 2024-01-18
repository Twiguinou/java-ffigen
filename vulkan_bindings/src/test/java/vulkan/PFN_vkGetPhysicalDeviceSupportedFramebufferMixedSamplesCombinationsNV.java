package vulkan;

public interface PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.class);

	int invoke(java.lang.foreign.MemorySegment physicalDevice, java.lang.foreign.MemorySegment pCombinationCount, java.lang.foreign.MemorySegment pCombinations);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
