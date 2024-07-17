package jpgen;

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.NoSuchElementException;

public interface SizedIterable<T> extends Iterable<T>
{
    int size();

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
            public @Nonnull Iterator<T> iterator()
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
