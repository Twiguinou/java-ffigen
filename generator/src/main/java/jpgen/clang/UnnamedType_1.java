package jpgen.clang;

public interface UnnamedType_1
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", UnnamedType_1.class);

    void invoke(java.lang.foreign.MemorySegment arg1);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.clang.Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
