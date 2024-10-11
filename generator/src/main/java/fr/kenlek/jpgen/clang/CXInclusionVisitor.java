/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public interface CXInclusionVisitor
{
    java.lang.foreign.FunctionDescriptor DESCRIPTOR = java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle UPCALL_STUB = fr.kenlek.jpgen.ForeignUtils.initUpcallStub(DESCRIPTOR, "invoke", CXInclusionVisitor.class);

    void invoke(java.lang.foreign.MemorySegment included_file, java.lang.foreign.MemorySegment inclusion_stack, int include_len, java.lang.foreign.MemorySegment client_data);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.upcallStub(UPCALL_STUB.bindTo(this), DESCRIPTOR, arena);
    }
}
