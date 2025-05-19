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
        MemorySegment array = allocator.allocate(JAVA_BYTE, bytes.size());
        ListIterator<Byte> iterator = bytes.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_BYTE, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateShortArray(SegmentAllocator allocator, List<Short> shorts)
    {
        MemorySegment array = allocator.allocate(JAVA_SHORT, shorts.size());
        ListIterator<Short> iterator = shorts.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_SHORT, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateBooleanArray(SegmentAllocator allocator, List<Boolean> booleans)
    {
        MemorySegment array = allocator.allocate(JAVA_BOOLEAN, booleans.size());
        ListIterator<Boolean> iterator = booleans.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_BOOLEAN, iterator.nextIndex(), iterator.next());
        }

        return array;
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

    public static MemorySegment allocateIntArray(SegmentAllocator allocator, List<Integer> ints)
    {
        MemorySegment array = allocator.allocate(JAVA_INT, ints.size());
        ListIterator<Integer> iterator = ints.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_INT, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateLongArray(SegmentAllocator allocator, List<Long> longs)
    {
        MemorySegment array = allocator.allocate(JAVA_LONG, longs.size());
        ListIterator<Long> iterator = longs.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_LONG, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateFloatArray(SegmentAllocator allocator, List<Float> floats)
    {
        MemorySegment array = allocator.allocate(JAVA_FLOAT, floats.size());
        ListIterator<Float> iterator = floats.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_FLOAT, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateDoubleArray(SegmentAllocator allocator, List<Double> doubles)
    {
        MemorySegment array = allocator.allocate(JAVA_DOUBLE, doubles.size());
        ListIterator<Double> iterator = doubles.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(JAVA_DOUBLE, iterator.nextIndex(), iterator.next());
        }

        return array;
    }

    public static MemorySegment allocateAddressArray(SegmentAllocator allocator, List<MemorySegment> addresses)
    {
        MemorySegment array = allocator.allocate(ADDRESS, addresses.size());
        ListIterator<MemorySegment> iterator = addresses.listIterator();
        while (iterator.hasNext())
        {
            array.setAtIndex(ADDRESS, iterator.nextIndex(), iterator.next());
        }

        return array;
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
