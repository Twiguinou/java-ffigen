package jpgen.clang;

public interface CXCursorVisitor
{
	java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS);
	java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXCursorVisitor.class);

	int invoke(CXCursor arg1, CXCursor arg2, java.lang.foreign.MemorySegment arg3);

	default int invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
	{
		return this.invoke(new CXCursor(arg1), new CXCursor(arg2), arg3);
	}

	default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
	{
		return Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
	}
}
