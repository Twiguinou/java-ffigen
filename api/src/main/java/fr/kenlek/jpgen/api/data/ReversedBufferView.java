package fr.kenlek.jpgen.api.data;

import module java.base;

import static java.util.Objects.*;

final class ReversedBufferView<T> implements List<T>, RandomAccess
{
    private final Buffer<T> m_buffer;

    ReversedBufferView(Buffer<T> buffer)
    {
        this.m_buffer = buffer;
    }

    private static <T> T[] reverse(T[] array)
    {
        int limit = array.length / 2;
        for (int i = 0; i < limit; i++)
        {
            int j = array.length - 1 - i;
            T t = array[i];
            array[i] = array[j];
            array[j] = t;
        }

        return array;
    }

    @Override
    public int size()
    {
        return this.m_buffer.size();
    }

    @Override
    public boolean isEmpty()
    {
        return this.m_buffer.isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        return this.m_buffer.contains(o);
    }

    @Override
    public Iterator<T> iterator()
    {
        return new Iterator<>()
        {
            long next = ReversedBufferView.this.m_buffer.length() - 1;

            @Override
            public boolean hasNext()
            {
                return this.next >= 0;
            }

            @Override
            public T next()
            {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }

                return ReversedBufferView.this.m_buffer.get(this.next--);
            }
        };
    }

    @Override
    public Object[] toArray()
    {
        return reverse(this.m_buffer.toArray());
    }

    @Override
    public <H> H[] toArray(H[] a)
    {
        return reverse(this.m_buffer.toArray(a));
    }

    @Override
    public boolean add(T t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o)
    {
        throw new UnsupportedOperationException();
    }

    @Override @SuppressWarnings("SlowListContainsAll")
    public boolean containsAll(Collection<?> c)
    {
        return this.m_buffer.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    private long mapIndex(long index)
    {
        return this.m_buffer.length() - checkIndex(index, this.m_buffer.length()) - 1;
    }

    @Override
    public T get(int index)
    {
        return this.m_buffer.get(this.mapIndex(index));
    }

    @Override
    public T set(int index, T element)
    {
        long bufferIndex = this.mapIndex(index);
        T previous = this.m_buffer.get(bufferIndex);
        this.m_buffer.set(bufferIndex, element);
        return previous;
    }

    @Override
    public void add(int index, T element)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o)
    {
        int index = this.m_buffer.lastIndexOf(o);
        return index == -1 ? index : (int) this.mapIndex(index);
    }

    @Override
    public int lastIndexOf(Object o)
    {
        int index = this.m_buffer.indexOf(o);
        return index == -1 ? index : (int) this.mapIndex(index);
    }

    @Override
    public ListIterator<T> listIterator()
    {
        return this.listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index)
    {
        return new ListIterator<>()
        {
            final ListIterator<T> iterator = ReversedBufferView.this.m_buffer.listIterator(ReversedBufferView.this.mapIndex(index));

            @Override
            public boolean hasNext()
            {
                return this.iterator.hasPrevious();
            }

            @Override
            public T next()
            {
                return this.iterator.previous();
            }

            @Override
            public boolean hasPrevious()
            {
                return this.iterator.hasNext();
            }

            @Override
            public T previous()
            {
                return this.iterator.next();
            }

            @Override
            public int nextIndex()
            {
                long index = ReversedBufferView.this.mapIndex(this.iterator.nextIndex()) + 1;
                if (index > Integer.MAX_VALUE)
                {
                    throw new IllegalStateException("Index " + index + " cannot be cast to an integer.");
                }

                return (int) index;
            }

            @Override
            public int previousIndex()
            {
                long index = ReversedBufferView.this.mapIndex(this.iterator.nextIndex());
                if (index > Integer.MAX_VALUE)
                {
                    throw new IllegalStateException("Index " + index + " cannot be cast to an integer.");
                }

                return (int) index;
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(T t)
            {
                this.iterator.set(t);
            }

            @Override
            public void add(T t)
            {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex)
    {
        checkFromToIndex(fromIndex, toIndex, this.m_buffer.length());
        return this.m_buffer.sub(this.m_buffer.length() - toIndex, this.m_buffer.length() - toIndex).reversed();
    }

    @Override
    public <H> H[] toArray(IntFunction<H[]> generator)
    {
        return reverse(this.m_buffer.toArray(generator));
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<T> spliterator()
    {
        return new ReversedBufferSpliterator<>(this.m_buffer);
    }

    @Override
    public void addFirst(T t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(T t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public T getFirst()
    {
        return this.m_buffer.getLast();
    }

    @Override
    public T getLast()
    {
        return this.m_buffer.getFirst();
    }

    @Override
    public T removeFirst()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeLast()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> reversed()
    {
        return this.m_buffer;
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof List<?> list && CollectionUtils.areEqual(this, list);
    }

    @Override
    public int hashCode()
    {
        return CollectionUtils.hashCode(this);
    }

    @Override
    public String toString()
    {
        return CollectionUtils.toString(this);
    }
}
