package vulkan;

public interface PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT.class);

	int invoke(java.lang.foreign.MemorySegment physicalDevice, java.lang.foreign.MemorySegment pTimeDomainCount, java.lang.foreign.MemorySegment pTimeDomains);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
