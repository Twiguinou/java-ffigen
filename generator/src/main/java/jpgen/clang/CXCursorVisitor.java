package jpgen.clang;

public interface CXCursorVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gRecordLayout, jpgen.clang.CXCursor.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "_invoke", CXCursorVisitor.class);

    int invoke(jpgen.clang.CXCursor cursor, jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment client_data);

    default int _invoke(java.lang.foreign.MemorySegment cursor, java.lang.foreign.MemorySegment parent, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new jpgen.clang.CXCursor(cursor), new jpgen.clang.CXCursor(parent), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
