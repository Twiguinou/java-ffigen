package fr.kenlek.jpgen.clang;

public interface CXCursorVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.CXCursor.gRecordLayout, fr.kenlek.jpgen.clang.CXCursor.gRecordLayout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = fr.kenlek.jpgen.ForeignUtils.initUpcallStub(gDescriptor, "_invoke", CXCursorVisitor.class);

    int invoke(fr.kenlek.jpgen.clang.CXCursor cursor, fr.kenlek.jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment client_data);

    default int _invoke(java.lang.foreign.MemorySegment cursor, java.lang.foreign.MemorySegment parent, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new fr.kenlek.jpgen.clang.CXCursor(cursor), new fr.kenlek.jpgen.clang.CXCursor(parent), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
