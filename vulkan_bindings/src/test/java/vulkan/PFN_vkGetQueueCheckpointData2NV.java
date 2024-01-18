package vulkan;

public interface PFN_vkGetQueueCheckpointData2NV
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetQueueCheckpointData2NV.class);

	void invoke(java.lang.foreign.MemorySegment queue, java.lang.foreign.MemorySegment pCheckpointDataCount, java.lang.foreign.MemorySegment pCheckpointData);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
