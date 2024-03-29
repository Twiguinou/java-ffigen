package jpgen.clang;

public interface CXFieldVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXFieldVisitor.class);

    int invoke(jpgen.clang.CXCursor C, java.lang.foreign.MemorySegment client_data);

    default int invoke(java.lang.foreign.MemorySegment C, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new jpgen.clang.CXCursor(C), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.clang.Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
