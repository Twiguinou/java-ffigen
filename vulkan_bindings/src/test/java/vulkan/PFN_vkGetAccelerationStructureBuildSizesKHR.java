package vulkan;

public interface PFN_vkGetAccelerationStructureBuildSizesKHR
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkGetAccelerationStructureBuildSizesKHR.class);

	void invoke(java.lang.foreign.MemorySegment device, int buildType, java.lang.foreign.MemorySegment pBuildInfo, java.lang.foreign.MemorySegment pMaxPrimitiveCounts, java.lang.foreign.MemorySegment pSizeInfo);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
