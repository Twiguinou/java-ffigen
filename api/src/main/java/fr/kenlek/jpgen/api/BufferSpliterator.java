package fr.kenlek.jpgen.api;

import java.util.Spliterator;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

final class BufferSpliterator<T> implements Spliterator<T>
{
    private final Buffer<T> m_buffer;
    private long m_upperBound;
    private long m_index;

    private BufferSpliterator(Buffer<T> buffer, long upperBound, long index)
    {
        this.m_buffer = buffer;
        this.m_upperBound = upperBound;
        this.m_index = index;
    }

    BufferSpliterator(Buffer<T> buffer)
    {
        this(buffer, buffer.size(), 0);
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action)
    {
        requireNonNull(action);
        if (this.m_index < this.m_upperBound)
        {
            action.accept(this.m_buffer.get(this.m_index++));
            return true;
        }

        return false;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action)
    {
        requireNonNull(action);
        while (this.m_index < this.m_upperBound)
        {
            action.accept(this.m_buffer.get(this.m_index++));
        }
    }

    @Override
    public BufferSpliterator<T> trySplit()
    {
        long splitIndex = (this.m_index + m_upperBound) / 2;
        if (this.m_index >= splitIndex)
        {
            return null;
        }

        BufferSpliterator<T> spliterator = new BufferSpliterator<>(this.m_buffer, this.m_upperBound, splitIndex);
        this.m_upperBound = splitIndex;
        return spliterator;
    }

    @Override
    public long estimateSize()
    {
        return this.m_upperBound - this.m_index;
    }

    @Override
    public long getExactSizeIfKnown()
    {
        return this.estimateSize();
    }

    @Override
    public int characteristics()
    {
        return ORDERED | SIZED | NONNULL | IMMUTABLE | SUBSIZED;
    }
}
