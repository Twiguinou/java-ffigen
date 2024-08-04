package fr.akshir.jpgen.clang;

public interface CXInclusionVisitor
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER, fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = fr.akshir.jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", CXInclusionVisitor.class);

    void invoke(java.lang.foreign.MemorySegment included_file, java.lang.foreign.MemorySegment inclusion_stack, int include_len, java.lang.foreign.MemorySegment client_data);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return fr.akshir.jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
