package fr.kenlek.jpgen;

import fr.kenlek.jpgen.abi.MSVCLayoutDataProvider;
import fr.kenlek.jpgen.abi.SysVLayoutDataProvider;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

import static java.lang.foreign.ValueLayout.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    public static final SymbolLookup GLOBAL_LOOKUP = name -> SymbolLookup.loaderLookup().find(name).or(() -> SYSTEM_LINKER.defaultLookup().find(name));
    public static final AddressLayout UNBOUNDED_POINTER = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));
    public static final LayoutData.Provider LAYOUT_PROVIDER = Host.selectLazily(
            new Host.Provider<>(Host.OS_WINDOWS, MSVCLayoutDataProvider::new),
            new Host.Provider<>(Host.POSIX, SysVLayoutDataProvider::new)
    );

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

    private static long getAlignmentMask(long alignment)
    {
        long m;
        if (alignment == 0 || (alignment & (m = alignment - 1)) != 0)
        {
            throw new IllegalArgumentException("Alignment is not a power of two!");
        }

        return m;
    }

    public static long alignDownwards(long address, long alignment)
    {
        return address & (~getAlignmentMask(alignment));
    }

    public static long alignUpwards(long address, long alignment)
    {
        long m = getAlignmentMask(alignment);
        return (address + m) & (~m);
    }
}
