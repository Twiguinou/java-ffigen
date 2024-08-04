package fr.akshir.jpgen.clang;

public interface CXFieldVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.akshir.jpgen.clang.CXCursor.gRecordLayout, fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = fr.akshir.jpgen.NativeTypes.initUpcallStub(gDescriptor, "_invoke", CXFieldVisitor.class);

    int invoke(fr.akshir.jpgen.clang.CXCursor C, java.lang.foreign.MemorySegment client_data);

    default int _invoke(java.lang.foreign.MemorySegment C, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new fr.akshir.jpgen.clang.CXCursor(C), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.akshir.jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
