package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static fr.kenlek.jpgen.ForeignUtils.*;

import static java.lang.foreign.ValueLayout.JAVA_INT;

public interface CXCursorVisitor
{
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, CXCursor.LAYOUT, UNBOUNDED_POINTER);
    MethodHandle UPCALL_STUB = initUpcallStub(DESCRIPTOR, "_invoke", CXCursorVisitor.class);

    int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data);

    default int _invoke(MemorySegment cursor, MemorySegment parent, MemorySegment client_data)
    {
        return this.invoke(new CXCursor(cursor), new CXCursor(parent), client_data);
    }

    default MemorySegment makeHandle(Arena arena)
    {
        return SYSTEM_LINKER.upcallStub(UPCALL_STUB.bindTo(this), DESCRIPTOR, arena);
    }
}
