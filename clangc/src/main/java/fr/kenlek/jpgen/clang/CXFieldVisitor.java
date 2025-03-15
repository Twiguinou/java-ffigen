package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public interface CXFieldVisitor
{
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER);
    MethodHandle UPCALL_STUB = initUpcallStub(DESCRIPTOR, "_invoke", CXFieldVisitor.class);

    int invoke(CXCursor C, MemorySegment client_data);

    default int _invoke(MemorySegment C, MemorySegment client_data)
    {
        return this.invoke(new CXCursor(C), client_data);
    }

    default MemorySegment makeHandle(Arena arena)
    {
        return SYSTEM_LINKER.upcallStub(UPCALL_STUB.bindTo(this), DESCRIPTOR, arena);
    }
}
