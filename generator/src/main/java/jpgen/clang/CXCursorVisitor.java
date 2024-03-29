package jpgen.clang;

public interface CXCursorVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXCursorVisitor.class);

    int invoke(jpgen.clang.CXCursor cursor, jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment client_data);

    default int invoke(java.lang.foreign.MemorySegment cursor, java.lang.foreign.MemorySegment parent, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new jpgen.clang.CXCursor(cursor), new jpgen.clang.CXCursor(parent), client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.clang.Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
