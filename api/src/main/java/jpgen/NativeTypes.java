package jpgen;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class NativeTypes
{private NativeTypes() {}

    public static final SequenceLayout UNCHECKED_CHAR_PTR = MemoryLayout.sequenceLayout(ValueLayout.JAVA_CHAR);

    public static MethodHandle initUpcallStub(FunctionDescriptor descriptor, String name, Class<?> clazz)
    {
        try
        {
            return MethodHandles.lookup().findVirtual(clazz, name, descriptor.toMethodType());
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
