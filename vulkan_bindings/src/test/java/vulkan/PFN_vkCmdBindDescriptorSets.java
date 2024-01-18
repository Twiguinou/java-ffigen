package vulkan;

public interface PFN_vkCmdBindDescriptorSets
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkCmdBindDescriptorSets.class);

	void invoke(java.lang.foreign.MemorySegment commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int firstSet, int descriptorSetCount, java.lang.foreign.MemorySegment pDescriptorSets, int dynamicOffsetCount, java.lang.foreign.MemorySegment pDynamicOffsets);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
