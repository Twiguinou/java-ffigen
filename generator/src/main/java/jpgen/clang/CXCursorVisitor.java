package jpgen.clang;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public interface CXCursorVisitor
{
    FunctionDescriptor gDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout, CXCursor.gStructLayout, ValueLayout.ADDRESS);

    int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data);

    default int invoke(MemorySegment cursor, MemorySegment parent, MemorySegment client_data)
    {
        return this.invoke(new CXCursor(cursor), new CXCursor(parent), client_data);
    }
}
