package jpgen;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntFunction;

public interface SizedIterable<T> extends Iterable<T>
{
    int size();

    default T[] toArray(IntFunction<T[]> arraySupplier)
    {
        int size = this.size();
        T[] elements = arraySupplier.apply(size);
        if (elements.length != size)
        {
            throw new RuntimeException("Supplied array has insufficient length.");
        }

        Iterator<T> it = this.iterator();
        for (int i = 0; it.hasNext(); i++)
        {
            elements[i] = it.next();
        }

        return elements;
    }

    final class ArrayIterator<T> implements Iterator<T>
    {
        private final T[] m_array;
        private int m_index = 0;

        public ArrayIterator(T[] array)
        {
            this.m_array = array;
        }

        @Override
        public boolean hasNext()
        {
            return this.m_index < this.m_array.length;
        }

        @Override
        public T next()
        {
            if (this.m_index >= this.m_array.length)
            {
                throw new NoSuchElementException();
            }

            return this.m_array[this.m_index++];
        }
    }

    static <T> SizedIterable<T> ofArray(T[] array)
    {
        return new SizedIterable<>()
        {
            @Override
            public Iterator<T> iterator()
            {
                return new ArrayIterator<>(array);
            }

            @Override
            public int size()
            {
                return array.length;
            }
        };
    }
}
