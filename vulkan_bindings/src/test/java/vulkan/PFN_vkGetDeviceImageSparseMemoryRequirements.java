package vulkan;

public interface PFN_vkGetDeviceImageSparseMemoryRequirements
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetDeviceImageSparseMemoryRequirements.class);

	void invoke(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
