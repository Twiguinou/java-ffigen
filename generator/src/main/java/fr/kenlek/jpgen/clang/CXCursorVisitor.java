/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public interface CXCursorVisitor
{
    java.lang.foreign.FunctionDescriptor DESCRIPTOR = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle UPCALL_STUB = fr.kenlek.jpgen.ForeignUtils.initUpcallStub(DESCRIPTOR, "_invoke", CXCursorVisitor.class);

    int invoke(fr.kenlek.jpgen.clang.CXCursor cursor, fr.kenlek.jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment client_data);

    default int _invoke(java.lang.foreign.MemorySegment cursor, java.lang.foreign.MemorySegment parent, java.lang.foreign.MemorySegment client_data)
    {
        return this.invoke(new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)cursor), new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)parent), (java.lang.foreign.MemorySegment)client_data);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.upcallStub(UPCALL_STUB.bindTo(this), DESCRIPTOR, arena);
    }
}
