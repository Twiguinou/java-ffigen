package fr.kenlek.jpgen;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

import static java.lang.foreign.ValueLayout.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    public static final AddressLayout UNBOUNDED_POINTER = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));

    public static MemorySegment allocateStringArray(SegmentAllocator allocator, List<String> strings)
    {
        MemorySegment array = allocator.allocate(ADDRESS, strings.size());
        int index = 0;
        for (String string : strings)
        {
            array.setAtIndex(ADDRESS, index, allocator.allocateFrom(string));
            ++index;
        }

        return array;
    }

    public static MemorySegment allocateStringArray(SegmentAllocator allocator, String[] strings)
    {
        MemorySegment array = allocator.allocate(ADDRESS, strings.length);
        for (int i = 0; i < strings.length; i++)
        {
            array.setAtIndex(ADDRESS, i, allocator.allocateFrom(strings[i]));
        }

        return array;
    }

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
