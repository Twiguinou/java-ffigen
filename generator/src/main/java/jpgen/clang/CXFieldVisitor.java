package jpgen.clang;

public interface CXFieldVisitor
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXFieldVisitor.class);

	int invoke(CXCursor arg1, java.lang.foreign.MemorySegment arg2);

	default int invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
	{
		return this.invoke(new CXCursor(arg1), arg2);
	}

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
