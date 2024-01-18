package vulkan;

public interface PFN_vkCmdSetVertexInputEXT
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkCmdSetVertexInputEXT.class);

	void invoke(java.lang.foreign.MemorySegment commandBuffer, int vertexBindingDescriptionCount, java.lang.foreign.MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, java.lang.foreign.MemorySegment pVertexAttributeDescriptions);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
