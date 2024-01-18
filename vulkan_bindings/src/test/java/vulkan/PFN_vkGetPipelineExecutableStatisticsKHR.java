package vulkan;

public interface PFN_vkGetPipelineExecutableStatisticsKHR
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetPipelineExecutableStatisticsKHR.class);

	int invoke(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pExecutableInfo, java.lang.foreign.MemorySegment pStatisticCount, java.lang.foreign.MemorySegment pStatistics);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
