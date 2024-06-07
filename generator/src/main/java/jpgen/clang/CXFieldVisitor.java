package jpgen.clang;

public interface CXFieldVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXFieldVisitor.class);

    int invoke (jpgen.clang.CXCursor arg0, java.lang.foreign.MemorySegment arg1);

    default int invoke(java.lang.foreign.MemorySegment arg0, java.lang.foreign.MemorySegment arg1)
    {
        return this.invoke(new jpgen.clang.CXCursor(arg0), arg1);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
