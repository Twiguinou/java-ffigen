package jpgen.clang;

public interface UnnamedType_7
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXSourceRange.gStructLayout);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", UnnamedType_7.class);

    int invoke(java.lang.foreign.MemorySegment arg1, jpgen.clang.CXCursor arg2, jpgen.clang.CXSourceRange arg3);

    default int invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
    {
        return this.invoke(arg1, new jpgen.clang.CXCursor(arg2), new jpgen.clang.CXSourceRange(arg3));
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.clang.Index_h.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
