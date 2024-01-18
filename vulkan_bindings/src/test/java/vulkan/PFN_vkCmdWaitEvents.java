package vulkan;

public interface PFN_vkCmdWaitEvents
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkCmdWaitEvents.class);

	void invoke(java.lang.foreign.MemorySegment commandBuffer, int eventCount, java.lang.foreign.MemorySegment pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, java.lang.foreign.MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, java.lang.foreign.MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, java.lang.foreign.MemorySegment pImageMemoryBarriers);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
