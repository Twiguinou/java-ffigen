package fr.kenlek.jpgen.api;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

import static java.lang.foreign.ValueLayout.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public interface ElementWriter<T>
    {
        void write(T element, MemorySegment container);
    }

    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    public static final AddressLayout UNBOUNDED_POINTER = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));

    public static <T> MemorySegment allocateArray(SegmentAllocator allocator, MemoryLayout elementLayout,
                                                  List<? extends T> elements, ElementWriter<T> writer)
    {
        MemorySegment array = allocator.allocate(elementLayout, elements.size());
        ListIterator<? extends T> iterator = elements.listIterator();
        while (iterator.hasNext())
        {
            long offset = iterator.nextIndex() * elementLayout.byteSize();
            writer.write(iterator.next(), array.asSlice(offset, elementLayout));
        }

        return array;
    }

    public static MemorySegment allocateStringArray(SegmentAllocator allocator, List<String> strings)
    {
        return allocateArray(allocator, ADDRESS, strings, (s, container) -> container.set(ADDRESS, 0, allocator.allocateFrom(s)));
    }

    public static MemorySegment allocateByteArray(SegmentAllocator allocator, List<Byte> bytes)
    {
        return allocateArray(allocator, JAVA_BYTE, bytes, (b, container) -> container.set(JAVA_BYTE, 0, b));
    }

    public static MemorySegment allocateShortArray(SegmentAllocator allocator, List<Short> shorts)
    {
        return allocateArray(allocator, JAVA_SHORT, shorts, (s, container) -> container.set(JAVA_SHORT, 0, s));
    }

    public static MemorySegment allocateBooleanArray(SegmentAllocator allocator, List<Boolean> booleans)
    {
        return allocateArray(allocator, JAVA_BOOLEAN, booleans, (b, container) -> container.set(JAVA_BOOLEAN, 0, b));
    }

    public static MemorySegment allocateCharArray(SegmentAllocator allocator, CharSequence sequence)
    {
        MemorySegment array = allocator.allocate(JAVA_CHAR, sequence.length());
        for (int i = 0; i < sequence.length(); i++)
        {
            array.setAtIndex(JAVA_CHAR, i, sequence.charAt(i));
        }

        return array;
    }

    public static MemorySegment allocatorCharArray(SegmentAllocator allocator, List<Character> chars)
    {
        return allocateArray(allocator, JAVA_CHAR, chars, (c, container) -> container.set(JAVA_CHAR, 0, c));
    }

    public static MemorySegment allocateIntArray(SegmentAllocator allocator, List<Integer> ints)
    {
        return allocateArray(allocator, JAVA_INT, ints, (i, container) -> container.set(JAVA_INT, 0, i));
    }

    public static MemorySegment allocateLongArray(SegmentAllocator allocator, List<Long> longs)
    {
        return allocateArray(allocator, JAVA_LONG, longs, (l, container) -> container.set(JAVA_LONG, 0, l));
    }

    public static MemorySegment allocateFloatArray(SegmentAllocator allocator, List<Float> floats)
    {
        return allocateArray(allocator, JAVA_FLOAT, floats, (f, container) -> container.set(JAVA_FLOAT, 0, f));
    }

    public static MemorySegment allocateDoubleArray(SegmentAllocator allocator, List<Double> doubles)
    {
        return allocateArray(allocator, JAVA_DOUBLE, doubles, (d, container) -> container.set(JAVA_DOUBLE, 0, d));
    }

    public static MemorySegment allocateAddressArray(SegmentAllocator allocator, List<MemorySegment> addresses)
    {
        return allocateArray(allocator, ADDRESS, addresses, (a, container) -> container.set(ADDRESS, 0, a));
    }

    public static MethodHandle initUpcallHandle(FunctionDescriptor descriptor, String name, Class<?> clazz, MethodHandles.Lookup lookup)
    {
        try
        {
            return lookup.findVirtual(clazz, name, descriptor.toMethodType());
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static MethodHandle initUpcallHandle(FunctionDescriptor descriptor, String name, Class<?> clazz)
    {
        return initUpcallHandle(descriptor, name, clazz, MethodHandles.publicLookup());
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

    private static long alignOffset(long base, long alignment, Consumer<PaddingLayout> paddingConsumer)
    {
        long aligned = alignUpwards(base, alignment);
        long padding = aligned - base;
        if (padding > 0)
        {
            paddingConsumer.accept(MemoryLayout.paddingLayout(padding));
        }

        return aligned;
    }

    public static StructLayout makeStructLayout(MemoryLayout... layouts)
    {
        List<MemoryLayout> arrangedLayouts = new ArrayList<>();

        long size = 0;
        long structAlignment = 1;
        for (MemoryLayout layout : layouts)
        {
            long fieldAlignment = layout.byteAlignment();
            long alignedOffset = alignOffset(size, fieldAlignment, arrangedLayouts::add);

            arrangedLayouts.add(layout);
            structAlignment = Math.max(structAlignment, fieldAlignment);
            size = alignedOffset + layout.byteSize();
        }

        alignOffset(size, structAlignment, arrangedLayouts::add);
        return MemoryLayout.structLayout(arrangedLayouts.toArray(MemoryLayout[]::new));
    }
}
