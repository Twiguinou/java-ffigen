package jpgen.clang;

public interface UnnamedType_0
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout, CXSourceRange.gStructLayout);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", UnnamedType_0.class);

	int invoke(java.lang.foreign.MemorySegment arg1, CXCursor arg2, CXSourceRange arg3);

	default int invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
	{
		return this.invoke(arg1, new CXCursor(arg2), new CXSourceRange(arg3));
	}

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
