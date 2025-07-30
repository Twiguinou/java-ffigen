package fr.kenlek.jpgen.api;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

import static java.lang.foreign.MemorySegment.NULL;

import static java.lang.foreign.ValueLayout.*;

/// Various utility fields and methods to work with the FFM API.
public final class ForeignUtils
{private ForeignUtils() {}

    /// An element writer used to write data into contiguous arrays.
    /// @see #allocateArray(SegmentAllocator, MemoryLayout, List, ElementWriter)
    @FunctionalInterface
    public interface ElementWriter<T>
    {
        /// Writes the element into the given container slice.
        /// @param element The element used as reference to write data.
        /// @param container The receiving memory segment.
        void write(T element, MemorySegment container);
    }

    /// The system default foreign function linker.
    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    /// An address layout whose target layout is as big as possible.
    public static final AddressLayout UNBOUNDED_POINTER = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));

    /// Allocates an array using an element layout, a list of elements and a writer function.
    ///
    /// This function returns [NULL][MemorySegment#NULL] if the element list is empty.
    /// @param allocator A memory allocator for the array.
    /// @param elementLayout The memory layout of each element in the array.
    /// @param elements A list of elements to read from.
    /// @param writer The function which writes list elements to container slices.
    /// @param <T> The common subtype of each element.
    /// @return A sequence segment for each element in the given list, or [NULL][MemorySegment#NULL] is no elements
    /// are provided.
    public static <T> MemorySegment allocateArray(SegmentAllocator allocator, MemoryLayout elementLayout,
                                                  List<? extends T> elements, ElementWriter<T> writer)
    {
        if (elements.isEmpty())
        {
            return NULL;
        }

        MemorySegment array = allocator.allocate(elementLayout, elements.size());
        ListIterator<? extends T> iterator = elements.listIterator();
        while (iterator.hasNext())
        {
            long offset = iterator.nextIndex() * elementLayout.byteSize();
            writer.write(iterator.next(), array.asSlice(offset, elementLayout));
        }

        return array;
    }

    /// Allocates an array of strings from a list.
    public static MemorySegment allocateStringArray(SegmentAllocator allocator, List<String> strings)
    {
        return allocateArray(allocator, ADDRESS, strings, (s, container) -> container.set(ADDRESS, 0, allocator.allocateFrom(s)));
    }

    /// Allocates an array of bytes from a list.
    public static MemorySegment allocateByteArray(SegmentAllocator allocator, List<Byte> bytes)
    {
        return allocateArray(allocator, JAVA_BYTE, bytes, (b, container) -> container.set(JAVA_BYTE, 0, b));
    }

    /// Allocates an array of shorts from a list.
    public static MemorySegment allocateShortArray(SegmentAllocator allocator, List<Short> shorts)
    {
        return allocateArray(allocator, JAVA_SHORT, shorts, (s, container) -> container.set(JAVA_SHORT, 0, s));
    }

    /// Allocates an array of booleans from a list.
    public static MemorySegment allocateBooleanArray(SegmentAllocator allocator, List<Boolean> booleans)
    {
        return allocateArray(allocator, JAVA_BOOLEAN, booleans, (b, container) -> container.set(JAVA_BOOLEAN, 0, b));
    }

    /// Allocates an array of characters from a character sequence
    public static MemorySegment allocateCharArray(SegmentAllocator allocator, CharSequence sequence)
    {
        MemorySegment array = allocator.allocate(JAVA_CHAR, sequence.length());
        for (int i = 0; i < sequence.length(); i++)
        {
            array.setAtIndex(JAVA_CHAR, i, sequence.charAt(i));
        }

        return array;
    }

    /// Allocates an array of characters from a list.
    public static MemorySegment allocatorCharArray(SegmentAllocator allocator, List<Character> chars)
    {
        return allocateArray(allocator, JAVA_CHAR, chars, (c, container) -> container.set(JAVA_CHAR, 0, c));
    }

    /// Allocates an array of integers from a list.
    public static MemorySegment allocateIntArray(SegmentAllocator allocator, List<Integer> ints)
    {
        return allocateArray(allocator, JAVA_INT, ints, (i, container) -> container.set(JAVA_INT, 0, i));
    }

    /// Allocates an array of longs from a list.
    public static MemorySegment allocateLongArray(SegmentAllocator allocator, List<Long> longs)
    {
        return allocateArray(allocator, JAVA_LONG, longs, (l, container) -> container.set(JAVA_LONG, 0, l));
    }

    /// Allocates an array of floats from a list.
    public static MemorySegment allocateFloatArray(SegmentAllocator allocator, List<Float> floats)
    {
        return allocateArray(allocator, JAVA_FLOAT, floats, (f, container) -> container.set(JAVA_FLOAT, 0, f));
    }

    /// Allocates an array of doubles from a list.
    public static MemorySegment allocateDoubleArray(SegmentAllocator allocator, List<Double> doubles)
    {
        return allocateArray(allocator, JAVA_DOUBLE, doubles, (d, container) -> container.set(JAVA_DOUBLE, 0, d));
    }

    /// Allocates an array of addresses from a list.
    public static MemorySegment allocateAddressArray(SegmentAllocator allocator, List<MemorySegment> addresses)
    {
        return allocateArray(allocator, ADDRESS, addresses, (a, container) -> container.set(ADDRESS, 0, a));
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

    /// Aligns an address to the nearest lower multiple of some alignment.
    public static long alignDownwards(long address, long alignment)
    {
        return address & (~getAlignmentMask(alignment));
    }

    /// Aligns an address to the nearest upper multiple of some alignment.
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

    /// Creates a [StructLayout] from a sequence of memory layouts by inserting the necessary padding
    /// to ensure proper alignment of each inner layout.
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
