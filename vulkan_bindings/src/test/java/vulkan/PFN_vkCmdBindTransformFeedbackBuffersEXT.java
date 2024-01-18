package vulkan;

public interface PFN_vkCmdBindTransformFeedbackBuffersEXT
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkCmdBindTransformFeedbackBuffersEXT.class);

	void invoke(java.lang.foreign.MemorySegment commandBuffer, int firstBinding, int bindingCount, java.lang.foreign.MemorySegment pBuffers, java.lang.foreign.MemorySegment pOffsets, java.lang.foreign.MemorySegment pSizes);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
