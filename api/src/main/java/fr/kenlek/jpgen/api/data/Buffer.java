package fr.kenlek.jpgen.api.data;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.*;

/// An interface for a memory buffer backed by a [MemorySegment][java.lang.foreign.MemorySegment].
public interface Buffer<T> extends Addressable, Iterable<T>
{
    @FunctionalInterface
    interface ElementWriter<S, T>
    {
        void write(SegmentAllocator allocator, S source, T target);
    }

    @SuppressWarnings("unchecked")
    static <T> Buffer<T> of()
    {
        final class Container
        {
            static final Buffer<?> VALUE = new Buffer<>()
            {
                @Override
                public MemorySegment pointer()
                {
                    return NULL;
                }

                @Override
                public long size()
                {
                    return 0;
                }

                @Override
                public Object get(long index)
                {
                    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size 0.");
                }

                @Override
                public void set(long index, Object value)
                {
                    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size 0.");
                }
            };
        }

        return (Buffer<T>) Container.VALUE;
    }

    static Buffer<MemorySegment> of(MemorySegment value)
    {
        return new Buffer<>()
        {
            @Override
            public MemorySegment pointer()
            {
                return value;
            }

            @Override
            public long size()
            {
                return 1;
            }

            @Override
            public MemorySegment get(long index)
            {
                checkIndex(index, 1);
                return this.pointer();
            }

            @Override
            public void set(long index, MemorySegment value)
            {
                checkIndex(index, 1);
                MemorySegment.copy(value, 0, this.pointer(), 0, this.pointer().byteSize());
            }
        };
    }

    static <T extends Addressable> Buffer<T> of(T value)
    {
        return new Buffer<>()
        {
            @Override
            public MemorySegment pointer()
            {
                return value.pointer();
            }

            @Override
            public long size()
            {
                return 1;
            }

            @Override
            public T get(long index)
            {
                checkIndex(index, 1);
                return value;
            }

            @Override
            public void set(long index, T value)
            {
                checkIndex(index, 1);
                MemorySegment.copy(value.pointer(), 0, this.pointer(), 0, this.pointer().byteSize());
            }
        };
    }

    private static void checkLayoutConstraints(MemoryLayout elementLayout)
    {
        if (elementLayout.byteSize() == 0)
        {
            throw new IllegalArgumentException("Element memory layout size must not be 0.");
        }

        if (Long.remainderUnsigned(elementLayout.byteSize(), elementLayout.byteAlignment()) != 0)
        {
            throw new IllegalArgumentException("Element memory layout size must be a multiple of its alignment.");
        }
    }

    static Buffer<MemorySegment> slices(MemorySegment data, MemoryLayout elementLayout)
    {
        checkLayoutConstraints(elementLayout);
        return new PrimitiveBuffer<>(data, elementLayout)
        {
            @Override
            public MemorySegment get(long index)
            {
                return this.pointer().asSlice(elementLayout.scale(0, index), elementLayout);
            }

            @Override
            public void set(long index, MemorySegment value)
            {
                MemorySegment.copy(value, 0, this.pointer(), elementLayout.scale(0, index), elementLayout.byteSize());
            }
        };
    }

    static Buffer<MemorySegment> allocateSlices(SegmentAllocator allocator, MemoryLayout elementLayout, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return slices(allocator.allocate(elementLayout, size), elementLayout);
    }

    static <T extends Addressable> Buffer<T> slices(MemorySegment data, MemoryLayout elementLayout, Function<MemorySegment, T> factory)
    {
        checkLayoutConstraints(elementLayout);
        return new PrimitiveBuffer<>(data, elementLayout)
        {
            @Override
            public T get(long index)
            {
                return factory.apply(this.pointer().asSlice(elementLayout.scale(0, index), elementLayout));
            }

            @Override
            public void set(long index, T value)
            {
                MemorySegment.copy(value.pointer(), 0, this.pointer(), elementLayout.scale(0, index), elementLayout.byteSize());
            }
        };
    }

    static <T extends Addressable> Buffer<T> allocateSlices(SegmentAllocator allocator, MemoryLayout elementLayout, long size, Function<MemorySegment, T> factory)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return slices(allocator.allocate(elementLayout, size), elementLayout, factory);
    }

    static <S, T> Buffer<T> allocate(SegmentAllocator allocator, List<S> elements,
                                     BiFunction<SegmentAllocator, Long, ? extends Buffer<T>> initializer,
                                     ElementWriter<S, ? super T> writer)
    {
        Buffer<T> buffer = initializer.apply(allocator, (long) elements.size());
        for (ListIterator<S> iterator = elements.listIterator(); iterator.hasNext();)
        {
            T target = buffer.get(iterator.nextIndex());
            writer.write(allocator, iterator.next(), target);
        }

        return buffer;
    }

    static <S, T> Buffer<T> allocate(SegmentAllocator allocator, List<S> elements,
                                     BiFunction<SegmentAllocator, Long, ? extends Buffer<T>> initializer,
                                     BiConsumer<S, ? super T> writer)
    {
        return allocate(allocator, elements, initializer, (_, source, target) -> writer.accept(source, target));
    }

    static Buffer<String> allocateStrings(SegmentAllocator allocator, Charset charset, List<String> strings)
    {
        long size = strings.size();
        if (size == 0)
        {
            return Buffer.of();
        }

        MemorySegment data = allocator.allocate(ADDRESS, size);
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext();)
        {
            data.setAtIndex(ADDRESS, iterator.nextIndex(), allocator.allocateFrom(iterator.next(), charset));
        }

        return new Buffer<>()
        {
            @Override
            public MemorySegment pointer()
            {
                return data;
            }

            @Override
            public long size()
            {
                return size;
            }

            @Override
            public String get(long index)
            {
                return data.getAtIndex(UNBOUNDED_POINTER, index).getString(0, charset);
            }

            @Override
            public void set(long index, String value)
            {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Buffer<String> allocateStrings(SegmentAllocator allocator, List<String> strings)
    {
        return allocateStrings(allocator, UTF_8, strings);
    }

    static Buffer<Byte> bytes(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_BYTE)
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

    static Buffer<Byte> allocateBytes(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return bytes(allocator.allocate(JAVA_BYTE, size));
    }

    static Buffer<Byte> allocateBytes(SegmentAllocator allocator, List<Byte> bytes)
    {
        Buffer<Byte> buffer = allocateBytes(allocator, bytes.size());
        for (ListIterator<Byte> iterator = bytes.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Boolean> booleans(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_BOOLEAN)
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

    static Buffer<Boolean> allocateBooleans(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return booleans(allocator.allocate(JAVA_BOOLEAN, size));
    }

    static Buffer<Boolean> allocateBooleans(SegmentAllocator allocator, List<Boolean> booleans)
    {
        Buffer<Boolean> buffer = allocateBooleans(allocator, booleans.size());
        for (ListIterator<Boolean> iterator = booleans.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Boolean> booleans32(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_INT)
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

    static Buffer<Boolean> allocateBooleans32(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return booleans32(allocator.allocate(JAVA_INT, size));
    }

    static Buffer<Boolean> allocateBooleans32(SegmentAllocator allocator, List<Boolean> booleans)
    {
        Buffer<Boolean> buffer = allocateBooleans32(allocator, booleans.size());
        for (ListIterator<Boolean> iterator = booleans.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Character> chars(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_CHAR)
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

    static Buffer<Character> allocateChars(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return chars(allocator.allocate(JAVA_CHAR, size));
    }

    static Buffer<Character> allocateChars(SegmentAllocator allocator, List<Character> chars)
    {
        Buffer<Character> buffer = allocateChars(allocator, chars.size());
        for (ListIterator<Character> iterator = chars.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Short> shorts(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_SHORT)
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

    static Buffer<Short> allocateShorts(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return shorts(allocator.allocate(JAVA_SHORT, size));
    }

    static Buffer<Short> allocateShorts(SegmentAllocator allocator, List<Short> shorts)
    {
        Buffer<Short> buffer = allocateShorts(allocator, shorts.size());
        for (ListIterator<Short> iterator = shorts.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Integer> ints(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_INT)
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

    static Buffer<Integer> allocateInts(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return ints(allocator.allocate(JAVA_INT, size));
    }

    static Buffer<Integer> allocateInts(SegmentAllocator allocator, List<Integer> ints)
    {
        Buffer<Integer> buffer = allocateInts(allocator, ints.size());
        for (ListIterator<Integer> iterator = ints.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Long> longs(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_LONG)
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

    static Buffer<Long> allocateLongs(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return longs(allocator.allocate(JAVA_LONG, size));
    }

    static Buffer<Long> allocateLongs(SegmentAllocator allocator, List<Long> longs)
    {
        Buffer<Long> buffer = allocateLongs(allocator, longs.size());
        for (ListIterator<Long> iterator = longs.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Float> floats(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_FLOAT)
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

    static Buffer<Float> allocateFloats(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return floats(allocator.allocate(JAVA_FLOAT, size));
    }

    static Buffer<Float> allocateFloats(SegmentAllocator allocator, List<Float> floats)
    {
        Buffer<Float> buffer = allocateFloats(allocator, floats.size());
        for (ListIterator<Float> iterator = floats.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<Double> doubles(MemorySegment data)
    {
        return new PrimitiveBuffer<>(data, JAVA_DOUBLE)
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

    static Buffer<Double> allocateDoubles(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return doubles(allocator.allocate(JAVA_DOUBLE, size));
    }

    static Buffer<Double> allocateDoubles(SegmentAllocator allocator, List<Double> doubles)
    {
        Buffer<Double> buffer = allocateDoubles(allocator, doubles.size());
        for (ListIterator<Double> iterator = doubles.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    private static Buffer<MemorySegment> addresses(MemorySegment data, AddressLayout layout)
    {
        return new PrimitiveBuffer<>(data, layout)
        {
            @Override
            public MemorySegment get(long index)
            {
                return this.pointer().getAtIndex(layout, index);
            }

            @Override
            public void set(long index, MemorySegment value)
            {
                this.pointer().setAtIndex(layout, index, value);
            }
        };
    }

    static Buffer<MemorySegment> addresses(MemorySegment data, MemoryLayout targetLayout)
    {
        return addresses(data, ADDRESS.withTargetLayout(targetLayout));
    }

    static Buffer<MemorySegment> addresses(MemorySegment data)
    {
        return addresses(data, ADDRESS);
    }

    static Buffer<MemorySegment> allocateAddresses(SegmentAllocator allocator, MemoryLayout targetLayout, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return addresses(allocator.allocate(ADDRESS, size), targetLayout);
    }

    static Buffer<MemorySegment> allocateAddresses(SegmentAllocator allocator, long size)
    {
        if (size == 0)
        {
            return Buffer.of();
        }

        return addresses(allocator.allocate(ADDRESS, size));
    }

    static Buffer<MemorySegment> allocateAddresses(SegmentAllocator allocator, MemoryLayout targetLayout, List<MemorySegment> addresses)
    {
        Buffer<MemorySegment> buffer = allocateAddresses(allocator, targetLayout, addresses.size());
        for (ListIterator<MemorySegment> iterator = addresses.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static Buffer<MemorySegment> allocateAddresses(SegmentAllocator allocator, List<MemorySegment> addresses)
    {
        Buffer<MemorySegment> buffer = allocateAddresses(allocator, addresses.size());
        for (ListIterator<MemorySegment> iterator = addresses.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    long size();

    T get(long index);

    void set(long index, T value);

    @Override
    default Iterator<T> iterator()
    {
        return new Iterator<>()
        {
            long index = 0;

            @Override
            public boolean hasNext()
            {
                return this.index < Buffer.this.size();
            }

            @Override
            public T next()
            {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }

                return Buffer.this.get(this.index++);
            }
        };
    }

    @Override
    default void forEach(Consumer<? super T> action)
    {
        requireNonNull(action);
        for (long i = 0; i < this.size(); i++)
        {
            action.accept(this.get(i));
        }
    }

    @Override
    default Spliterator<T> spliterator()
    {
        return new BufferSpliterator<>(this);
    }
}
