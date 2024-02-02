package jpgen;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public final class ForeignUtils
{private ForeignUtils() {}

    private static final MethodHandle gHandle__malloc;
    private static final MethodHandle gHandle__calloc;
    private static final MethodHandle gHandle__free;
    private static final MethodHandle gHandle__realloc;

    public static MemorySegment allocateUtf8Array(SegmentAllocator allocator, String[] strings)
    {
        MemorySegment array = allocator.allocateArray(ValueLayout.ADDRESS, strings.length);
        for (int i = 0; i < strings.length; i++)
        {
            array.setAtIndex(ValueLayout.ADDRESS, i, allocator.allocateUtf8String(strings[i]));
        }

        return array;
    }

    public static MemorySegment malloc(long size)
    {
        try {return ((MemorySegment)gHandle__malloc.invokeExact(size)).reinterpret(size);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment calloc(long nmemb, long size)
    {
        try {return ((MemorySegment)gHandle__calloc.invokeExact(nmemb, size)).reinterpret(nmemb * size);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void free(MemorySegment ptr)
    {
        try {gHandle__free.invokeExact(ptr);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment realloc(MemorySegment ptr, long size)
    {
        try {return ((MemorySegment)gHandle__realloc.invokeExact(ptr, size)).reinterpret(size);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    static
    {
        Linker linker = Linker.nativeLinker();
        SymbolLookup lookup = name -> SymbolLookup.loaderLookup().find(name).or(() -> linker.defaultLookup().find(name));

        gHandle__malloc = linker.downcallHandle(lookup.find("malloc").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        gHandle__calloc = linker.downcallHandle(lookup.find("calloc").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        gHandle__free = linker.downcallHandle(lookup.find("free").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        gHandle__realloc = linker.downcallHandle(lookup.find("realloc").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    }
}
