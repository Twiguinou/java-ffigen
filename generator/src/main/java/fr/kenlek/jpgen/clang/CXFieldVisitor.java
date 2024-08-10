package fr.kenlek.jpgen.clang;

public interface CXFieldVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.CXCursor.gRecordLayout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = fr.kenlek.jpgen.ForeignUtils.initUpcallStub(gDescriptor, "_invoke", CXFieldVisitor.class);

    int invoke(fr.kenlek.jpgen.clang.CXCursor C, java.lang.foreign.MemorySegment client_data);

    default int _invoke(java.lang.foreign.MemorySegment C, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new fr.kenlek.jpgen.clang.CXCursor(C), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
