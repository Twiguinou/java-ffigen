package vulkan;

public interface PFN_vkRegisterDisplayEventEXT
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkRegisterDisplayEventEXT.class);

	int invoke(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pDisplayEventInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFence);

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return vulkan.VulkanCore.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
