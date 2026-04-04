package fr.kenlek.jpgen.api.data;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static java.lang.foreign.ValueLayout.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.*;

/// This class serves as a bridge between [List]s and [MemorySegment]s.
public interface Buffer<T> extends Addressable, List<T>, RandomAccess
{
    interface Inline<T> extends Buffer<T> {}

    /// Create an empty buffer with the given element layout.
    static <T> Buffer<T> empty(MemoryLayout elementLayout)
    {
        return new EmptyBuffer<>(elementLayout);
    }

    static Buffer<Boolean> booleans(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_BOOLEAN)
        {
            @Override
            public Boolean get(long index)
            {
                return this.pointer().getAtIndex(JAVA_BOOLEAN, index);
            }

            @Override
            public void set(long index, Boolean value)
            {
                this.pointer().setAtIndex(JAVA_BOOLEAN, index, value);
            }
        };
    }

    static Buffer<Boolean> booleans(SegmentAllocator allocator, long size)
    {
        return size == 0 ? booleans() : booleans(allocator.allocate(JAVA_BOOLEAN, size));
    }

    static Buffer<Boolean> booleans(SegmentAllocator allocator, List<Boolean> booleans)
    {
        return CollectionUtils.copy(booleans(allocator, booleans.size()), booleans);
    }

    static Buffer<Boolean> ofBooleans(SegmentAllocator allocator, boolean... booleans)
    {
        Buffer<Boolean> buffer = booleans(allocator, booleans.length);
        for (int i = 0; i < booleans.length; i++)
        {
            buffer.pointer().setAtIndex(JAVA_BOOLEAN, i, booleans[i]);
        }

        return buffer;
    }

    static Buffer<Boolean> booleans()
    {
        return EmptyBuffer.BOOLEAN;
    }

    static Buffer<Boolean> bool32(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_INT)
        {
            @Override
            public Boolean get(long index)
            {
                return this.pointer().getAtIndex(JAVA_INT, index) != 0;
            }

            @Override
            public void set(long index, Boolean value)
            {
                this.pointer().setAtIndex(JAVA_INT, index, value ? 1 : 0);
            }
        };
    }

    static Buffer<Boolean> bool32(SegmentAllocator allocator, long size)
    {
        return size == 0 ? bool32() : bool32(allocator.allocate(JAVA_INT, size));
    }

    static Buffer<Boolean> bool32(SegmentAllocator allocator, List<Boolean> booleans)
    {
        return CollectionUtils.copy(bool32(allocator, booleans.size()), booleans);
    }

    static Buffer<Boolean> ofBool32(SegmentAllocator allocator, boolean... booleans)
    {
        Buffer<Boolean> buffer = bool32(allocator, booleans.length);
        for (int i = 0; i < booleans.length; i++)
        {
            buffer.pointer().setAtIndex(JAVA_INT, i, booleans[i] ? 1 : 0);
        }

        return buffer;
    }

    static Buffer<Boolean> bool32()
    {
        return EmptyBuffer.BOOL32;
    }

    static Buffer<Byte> bytes(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_BYTE)
        {
            @Override
            public Byte get(long index)
            {
                return this.pointer().getAtIndex(JAVA_BYTE, index);
            }

            @Override
            public void set(long index, Byte value)
            {
                this.pointer().setAtIndex(JAVA_BYTE, index, value);
            }
        };
    }

    static Buffer<Byte> bytes(SegmentAllocator allocator, long size)
    {
        return size == 0 ? bytes() : bytes(allocator.allocate(JAVA_BYTE, size));
    }

    static Buffer<Byte> bytes(SegmentAllocator allocator, List<Byte> bytes)
    {
        return CollectionUtils.copy(bytes(allocator, bytes.size()), bytes);
    }

    static Buffer<Byte> ofBytes(SegmentAllocator allocator, byte... bytes)
    {
        return CollectionUtils.copy(bytes(allocator, bytes.length), MemorySegment.ofArray(bytes));
    }

    static Buffer<Byte> bytes()
    {
        return EmptyBuffer.BYTE;
    }

    static Buffer<Short> shorts(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_SHORT)
        {
            @Override
            public Short get(long index)
            {
                return this.pointer().getAtIndex(JAVA_SHORT, index);
            }

            @Override
            public void set(long index, Short value)
            {
                this.pointer().setAtIndex(JAVA_SHORT, index, value);
            }
        };
    }

    static Buffer<Short> shorts(SegmentAllocator allocator, long size)
    {
        return size == 0 ? shorts() : shorts(allocator.allocate(JAVA_SHORT, size));
    }

    static Buffer<Short> shorts(SegmentAllocator allocator, List<Short> shorts)
    {
        return CollectionUtils.copy(shorts(allocator, shorts.size()), shorts);
    }

    static Buffer<Short> ofShort(SegmentAllocator allocator, short... shorts)
    {
        return CollectionUtils.copy(shorts(allocator, shorts.length), MemorySegment.ofArray(shorts));
    }

    static Buffer<Short> shorts()
    {
        return EmptyBuffer.SHORT;
    }

    static Buffer<Character> chars(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_CHAR)
        {
            @Override
            public Character get(long index)
            {
                return this.pointer().getAtIndex(JAVA_CHAR, index);
            }

            @Override
            public void set(long index, Character value)
            {
                this.pointer().setAtIndex(JAVA_CHAR, index, value);
            }
        };
    }

    static Buffer<Character> chars(SegmentAllocator allocator, long size)
    {
        return size == 0 ? chars() : chars(allocator.allocate(JAVA_CHAR, size));
    }

    static Buffer<Character> chars(SegmentAllocator allocator, List<Character> chars)
    {
        return CollectionUtils.copy(chars(allocator, chars.size()), chars);
    }

    static Buffer<Character> ofChars(SegmentAllocator allocator, char... chars)
    {
        return CollectionUtils.copy(chars(allocator, chars.length), MemorySegment.ofArray(chars));
    }

    static Buffer<Character> chars()
    {
        return EmptyBuffer.CHARACTER;
    }

    static Buffer<Integer> ints(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_INT)
        {
            @Override
            public Integer get(long index)
            {
                return this.pointer().getAtIndex(JAVA_INT, index);
            }

            @Override
            public void set(long index, Integer value)
            {
                this.pointer().setAtIndex(JAVA_INT, index, value);
            }
        };
    }

    static Buffer<Integer> ints(SegmentAllocator allocator, long size)
    {
        return size == 0 ? ints() : ints(allocator.allocate(JAVA_INT, size));
    }

    static Buffer<Integer> ints(SegmentAllocator allocator, List<Integer> ints)
    {
        return CollectionUtils.copy(ints(allocator, ints.size()), ints);
    }

    static Buffer<Integer> ofInts(SegmentAllocator allocator, int... ints)
    {
        return CollectionUtils.copy(ints(allocator, ints.length), MemorySegment.ofArray(ints));
    }

    static Buffer<Integer> ints()
    {
        return EmptyBuffer.INTEGER;
    }

    static Buffer<Long> longs(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_LONG)
        {
            @Override
            public Long get(long index)
            {
                return this.pointer().getAtIndex(JAVA_LONG, index);
            }

            @Override
            public void set(long index, Long value)
            {
                this.pointer().setAtIndex(JAVA_LONG, index, value);
            }
        };
    }

    static Buffer<Long> longs(SegmentAllocator allocator, long size)
    {
        return size == 0 ? longs() : longs(allocator.allocate(JAVA_LONG, size));
    }

    static Buffer<Long> longs(SegmentAllocator allocator, List<Long> longs)
    {
        return CollectionUtils.copy(longs(allocator, longs.size()), longs);
    }

    static Buffer<Long> ofLongs(SegmentAllocator allocator, long... longs)
    {
        return CollectionUtils.copy(longs(allocator, longs.length), MemorySegment.ofArray(longs));
    }

    static Buffer<Long> longs()
    {
        return EmptyBuffer.LONG;
    }

    static Buffer<Float> floats(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_FLOAT)
        {
            @Override
            public Float get(long index)
            {
                return this.pointer().getAtIndex(JAVA_FLOAT, index);
            }

            @Override
            public void set(long index, Float value)
            {
                this.pointer().setAtIndex(JAVA_FLOAT, index, value);
            }
        };
    }

    static Buffer<Float> floats(SegmentAllocator allocator, long size)
    {
        return size == 0 ? floats() : floats(allocator.allocate(JAVA_FLOAT, size));
    }

    static Buffer<Float> floats(SegmentAllocator allocator, List<Float> floats)
    {
        return CollectionUtils.copy(floats(allocator, floats.size()), floats);
    }

    static Buffer<Float> ofFloats(SegmentAllocator allocator, float... floats)
    {
        return CollectionUtils.copy(floats(allocator, floats.length), MemorySegment.ofArray(floats));
    }

    static Buffer<Float> floats()
    {
        return EmptyBuffer.FLOAT;
    }

    static Buffer<Double> doubles(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, JAVA_DOUBLE)
        {
            @Override
            public Double get(long index)
            {
                return this.pointer().getAtIndex(JAVA_DOUBLE, index);
            }

            @Override
            public void set(long index, Double value)
            {
                this.pointer().setAtIndex(JAVA_DOUBLE, index, value);
            }
        };
    }

    static Buffer<Double> doubles(SegmentAllocator allocator, long size)
    {
        return size == 0 ? doubles() : doubles(allocator.allocate(JAVA_DOUBLE, size));
    }

    static Buffer<Double> doubles(SegmentAllocator allocator, List<Double> doubles)
    {
        return CollectionUtils.copy(doubles(allocator, doubles.size()), doubles);
    }

    static Buffer<Double> doubles()
    {
        return EmptyBuffer.DOUBLE;
    }

    private static Buffer<MemorySegment> _addresses(MemorySegment pointer, AddressLayout layout)
    {
        return new InlineBufferImpl<>(pointer, layout)
        {
            @Override
            public MemorySegment get(long index)
            {
                return this.pointer().getAtIndex(this.elementLayout(), index);
            }

            @Override
            public void set(long index, MemorySegment value)
            {
                this.pointer().setAtIndex(this.elementLayout(), index, value);
            }
        };
    }

    static Buffer<MemorySegment> addresses(MemorySegment pointer, MemoryLayout targetLayout)
    {
        return _addresses(pointer, ADDRESS.withTargetLayout(targetLayout));
    }

    static Buffer<MemorySegment> addresses(MemorySegment pointer)
    {
        return _addresses(pointer, ADDRESS);
    }

    static Buffer<MemorySegment> addresses(SegmentAllocator allocator, long size, MemoryLayout targetLayout)
    {
        return size == 0 ? addresses(targetLayout) : addresses(allocator.allocate(ADDRESS, size), targetLayout);
    }

    static Buffer<MemorySegment> addresses(SegmentAllocator allocator, long size)
    {
        return size == 0 ? addresses() : addresses(allocator.allocate(ADDRESS, size));
    }

    static Buffer<MemorySegment> addresses(SegmentAllocator allocator, MemoryLayout targetLayout, List<MemorySegment> addresses)
    {
        return CollectionUtils.copy(addresses(allocator, addresses.size(), targetLayout), addresses);
    }

    static Buffer<MemorySegment> addresses(SegmentAllocator allocator, List<MemorySegment> addresses)
    {
        return CollectionUtils.copy(addresses(allocator, addresses.size()), addresses);
    }

    static Buffer<MemorySegment> ofAddresses(SegmentAllocator allocator, MemoryLayout targetLayout, MemorySegment... addresses)
    {
        Buffer<MemorySegment> buffer = addresses(allocator, addresses.length, targetLayout);
        for (int i = 0; i < addresses.length; i++)
        {
            buffer.pointer().setAtIndex(ADDRESS, i, addresses[i]);
        }

        return buffer;
    }

    static Buffer<MemorySegment> ofAddresses(SegmentAllocator allocator, MemorySegment... addresses)
    {
        Buffer<MemorySegment> buffer = addresses(allocator, addresses.length);
        for (int i = 0; i < addresses.length; i++)
        {
            buffer.pointer().setAtIndex(ADDRESS, i, addresses[i]);
        }

        return buffer;
    }

    static Buffer<MemorySegment> addresses(MemoryLayout targetLayout)
    {
        return empty(ADDRESS.withTargetLayout(targetLayout));
    }

    static Buffer<MemorySegment> addresses()
    {
        return EmptyBuffer.ADDRESS;
    }

    static <T extends Addressable> Buffer<T> wrap(T element)
    {
        Addressable.checkLayoutConstraints(element.pointer(), element.layout());
        return new InlineBufferImpl<>(element.pointer(), element.layout())
        {
            @Override
            public T get(long index)
            {
                checkIndex(index, 1);
                return element;
            }

            @Override
            public void set(long index, T value)
            {
                checkIndex(index, 1);
                MemorySegment.copy(value.pointer(), 0, element.pointer(), 0, element.layout().byteSize());
            }
        };
    }

    static <T extends Addressable> Buffer<T> slices(MemorySegment pointer, MemoryLayout elementLayout, Function<MemorySegment, ? extends T> factory)
    {
        return new InlineBufferImpl<>(pointer, elementLayout)
        {
            @Override
            public T get(long index)
            {
                return factory.apply(this.slice(index));
            }

            @Override
            public void set(long index, T value)
            {
                checkIndex(index, this.length());
                MemorySegment.copy(value.pointer(), 0, this.pointer(), this.elementLayout().scale(0, index), this.elementLayout().byteSize());
            }
        };
    }

    static <T extends Addressable> Buffer<T> slices(SegmentAllocator allocator, MemoryLayout elementLayout, long size, Function<MemorySegment, ? extends T> factory)
    {
        return size == 0 ? empty(elementLayout) : slices(allocator.allocate(elementLayout, size), elementLayout, factory);
    }

    static <T> Buffer<T> interpret(
        MemorySegment pointer, MemoryLayout elementLayout,
        Function<MemorySegment, ? extends T> reader, BiConsumer<MemorySegment, ? super T> writer
    )
    {
        return new BufferImpl<>(pointer, elementLayout)
        {
            @Override
            public T get(long index)
            {
                return reader.apply(this.slice(index));
            }

            @Override
            public void set(long index, T value)
            {
                writer.accept(this.slice(index), value);
            }
        };
    }

    static <T> Buffer<T> interpret(
        SegmentAllocator allocator, long size, MemoryLayout elementLayout,
        Function<MemorySegment, ? extends T> reader, BiConsumer<MemorySegment, ? super T> writer
    )
    {
        return size == 0 ? empty(elementLayout) : interpret(allocator.allocate(elementLayout, size), elementLayout, reader, writer);
    }

    static <T> Buffer<T> interpret(
        SegmentAllocator allocator, MemoryLayout elementLayout, List<? extends T> elements,
        Function<MemorySegment, ? extends T> reader, BiConsumer<MemorySegment, ? super T> writer
    )
    {
        return CollectionUtils.copy(interpret(allocator, elements.size(), elementLayout, reader, writer), elements);
    }

    static Buffer<String> strings(MemorySegment pointer, Charset charset)
    {
        return interpret(pointer, UNBOUNDED_POINTER, slice -> slice.getString(0, charset), (_, _) ->
        {
            throw new UnsupportedOperationException();
        });
    }

    static Buffer<String> strings(MemorySegment pointer)
    {
        return strings(pointer, UTF_8);
    }

    static Buffer<String> strings(SegmentAllocator allocator, Charset charset, List<String> strings)
    {
        if (strings.isEmpty())
        {
            return EmptyBuffer.STRING;
        }

        MemorySegment data = allocator.allocate(ADDRESS, strings.size());
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext();)
        {
            data.setAtIndex(ADDRESS, iterator.nextIndex(), allocator.allocateFrom(iterator.next(), charset));
        }

        return strings(data, charset);
    }

    static Buffer<String> strings(SegmentAllocator allocator, List<String> strings)
    {
        return strings(allocator, UTF_8, strings);
    }

    @Override
    SequenceLayout layout();

    MemoryLayout elementLayout();

    default long length()
    {
        return this.layout().elementCount();
    }

    T get(long index);

    void set(long index, T value);

    default MemorySegment slice(long index)
    {
        return this.pointer().asSlice(this.elementLayout().scale(0, index), this.elementLayout());
    }

    @Override
    default T get(int index)
    {
        return this.get((long) index);
    }

    @Override
    default T set(int index, T element)
    {
        T previous = this.get(index);
        this.set((long) index, element);
        return previous;
    }

    @Override
    default int size()
    {
        if (this.length() > Integer.MAX_VALUE)
        {
            throw new IllegalStateException("This buffer length " + this.length() + " does not fit inside an integer.");
        }

        return (int) this.length();
    }

    @Override
    default boolean isEmpty()
    {
        return this.length() == 0;
    }

    @Override
    default boolean contains(Object o)
    {
        //noinspection ListIndexOfReplaceableByContains
        return this.indexOf(o) >= 0;
    }

    @Override
    default Iterator<T> iterator()
    {
        return new Iterator<>()
        {
            long next = 0;

            @Override
            public boolean hasNext()
            {
                return this.next < Buffer.this.length();
            }

            @Override
            public T next()
            {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }

                return Buffer.this.get(this.next++);
            }
        };
    }

    @Override
    default Object[] toArray()
    {
        Object[] array = new Object[this.size()];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = this.get(i);
        }

        return array;
    }

    @SuppressWarnings("unchecked") @Override
    default <H> H[] toArray(H[] a)
    {
        H[] result = a.length >= this.size() ? a : (H[]) Array.newInstance(a.getClass().componentType(), this.size());
        for (int i = 0; i < this.size(); i++)
        {
            result[i] = (H) this.get(i);
        }

        if (result.length > this.size())
        {
            result[this.size()] = null;
        }

        return result;
    }

    @Override
    default boolean add(T t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean remove(Object o)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean containsAll(Collection<?> c)
    {
        for (Object object : c)
        {
            if (!this.contains(object))
            {
                return false;
            }
        }

        return true;
    }

    @Override
    default boolean addAll(Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean addAll(int index, Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default void clear()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default void add(int index, T element)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default T remove(int index)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default int indexOf(Object o)
    {
        for (long i = 0; i < this.size(); i++)
        {
            if (Objects.equals(this.get(i), o))
            {
                return (int) i;
            }
        }

        return -1;
    }

    @Override
    default int lastIndexOf(Object o)
    {
        for (long i = this.size() - 1; i >= 0; i--)
        {
            if (Objects.equals(this.get(i), o))
            {
                return (int) i;
            }
        }

        return -1;
    }

    @Override
    default ListIterator<T> listIterator()
    {
        return this.listIterator(0);
    }

    @Override
    default ListIterator<T> listIterator(int index)
    {
        return this.listIterator((long) index);
    }

    /// Long version of [#listIterator(int)].
    default ListIterator<T> listIterator(long index)
    {
        return new ListIterator<>()
        {
            long cursor = checkIndex(index, Buffer.this.length());
            long previous = -1;

            @Override
            public boolean hasNext()
            {
                return this.cursor < Buffer.this.length();
            }

            @Override
            public T next()
            {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }

                this.previous = this.cursor;
                return Buffer.this.get(this.cursor++);
            }

            @Override
            public boolean hasPrevious()
            {
                return this.cursor > 0;
            }

            @Override
            public T previous()
            {
                if (!this.hasPrevious())
                {
                    throw new NoSuchElementException();
                }

                this.previous = --this.cursor;
                return Buffer.this.get(this.cursor);
            }

            @Override
            public int nextIndex()
            {
                if (this.cursor > Integer.MAX_VALUE)
                {
                    throw new IllegalStateException("Position " + this.cursor + " cannot be cast to an integer.");
                }

                return (int) this.cursor;
            }

            @Override
            public int previousIndex()
            {
                long p = this.cursor - 1;
                if (p > Integer.MAX_VALUE)
                {
                    throw new IllegalStateException("Position " + p + " cannot be cast to an integer.");
                }

                return (int) p;
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(T t)
            {
                if (this.previous < 0)
                {
                    throw new IllegalStateException();
                }

                Buffer.this.set(this.previous, t);
            }

            @Override
            public void add(T t)
            {
                throw new UnsupportedOperationException();
            }
        };
    }

    /// Long version of [#subList(int, int)].
    default Buffer<T> sub(long fromIndex, long toIndex)
    {
        checkFromToIndex(fromIndex, toIndex, this.length());
        SequenceLayout sliceLayout = this.layout().withElementCount(toIndex - fromIndex);
        MemorySegment slice = this.pointer().asSlice(this.elementLayout().scale(0, fromIndex), sliceLayout);
        return new Buffer<>()
        {
            @Override
            public MemorySegment pointer()
            {
                return slice;
            }

            @Override
            public MemoryLayout elementLayout()
            {
                return Buffer.this.elementLayout();
            }

            @Override
            public SequenceLayout layout()
            {
                return sliceLayout;
            }

            @Override
            public T get(long index)
            {
                return Buffer.this.get(fromIndex + checkIndex(index, this.length()));
            }

            @Override
            public void set(long index, T value)
            {
                Buffer.this.set(fromIndex + checkIndex(index, this.length()), value);
            }
        };
    }

    @Override
    default Buffer<T> subList(int fromIndex, int toIndex)
    {
        return this.sub(fromIndex, toIndex);
    }

    @Override
    default Spliterator<T> spliterator()
    {
        return new BufferSpliterator<>(this);
    }

    @Override
    default T getFirst()
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }

        return this.get(0L);
    }

    @Override
    default T getLast()
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }

        return this.get(this.length() - 1);
    }

    @Override
    default T removeFirst()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default T removeLast()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default List<T> reversed()
    {
        return new ReversedBufferView<>(this);
    }

    @SuppressWarnings("unchecked") @Override
    default <H> H[] toArray(IntFunction<H[]> generator)
    {
        H[] array = generator.apply(this.size());
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (H) this.get(i);
        }

        return array;
    }

    @Override
    default boolean removeIf(Predicate<? super T> filter)
    {
        throw new UnsupportedOperationException();
    }
}
