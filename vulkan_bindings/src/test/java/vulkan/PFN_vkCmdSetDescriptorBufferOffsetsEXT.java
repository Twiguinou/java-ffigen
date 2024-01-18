package vulkan;

public interface PFN_vkCmdSetDescriptorBufferOffsetsEXT
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkCmdSetDescriptorBufferOffsetsEXT.class);

	void invoke(java.lang.foreign.MemorySegment commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int firstSet, int setCount, java.lang.foreign.MemorySegment pBufferIndices, java.lang.foreign.MemorySegment pOffsets);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
