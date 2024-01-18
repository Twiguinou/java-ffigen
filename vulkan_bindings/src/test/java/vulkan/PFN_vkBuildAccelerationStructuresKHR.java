package vulkan;

public interface PFN_vkBuildAccelerationStructuresKHR
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkBuildAccelerationStructuresKHR.class);

	int invoke(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment deferredOperation, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment ppBuildRangeInfos);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
