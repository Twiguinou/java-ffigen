package jpgen;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class NativeTypes
{private NativeTypes() {}

    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    public static final AddressLayout UNBOUNDED_POINTER = ValueLayout.ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, ValueLayout.JAVA_BYTE));

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
