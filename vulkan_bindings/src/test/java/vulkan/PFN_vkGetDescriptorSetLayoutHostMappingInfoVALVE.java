package vulkan;

public interface PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetDescriptorSetLayoutHostMappingInfoVALVE.class);

	void invoke(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pBindingReference, java.lang.foreign.MemorySegment pHostMapping);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
