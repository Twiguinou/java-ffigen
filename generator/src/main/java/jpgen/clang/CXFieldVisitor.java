package jpgen.clang;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public interface CXFieldVisitor
{
    FunctionDescriptor gDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout, ValueLayout.ADDRESS);

    int invoke(CXCursor C, MemorySegment client_data);

    default int invoke(MemorySegment C, MemorySegment client_data)
    {
        return this.invoke(new CXCursor(C), client_data);
    }
}
