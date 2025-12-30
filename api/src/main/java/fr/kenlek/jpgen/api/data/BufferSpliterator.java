package fr.kenlek.jpgen.api.data;

import module java.base;

sealed class BufferSpliterator<T> implements Spliterator<T> permits ReversedBufferSpliterator
{
    protected final Buffer<T> m_buffer;
    protected final long m_limit;
    protected long m_next;

    protected BufferSpliterator(Buffer<T> buffer, long limit, long next)
    {
        this.m_buffer = buffer;
        this.m_limit = limit;
        this.m_next = next;
    }

    BufferSpliterator(Buffer<T> buffer)
    {
        this(buffer, buffer.length(), 0);
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action)
    {
        if (this.m_next < this.m_limit)
        {
            action.accept(this.m_buffer.get(this.m_next++));
            return true;
        }

        return false;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action)
    {
        while (this.m_next < this.m_limit)
        {
            action.accept(this.m_buffer.get(this.m_next++));
        }
    }

    @Override
    public BufferSpliterator<T> trySplit()
    {
        long remaining = this.estimateSize();
        if (remaining <= 1)
        {
            return null;
        }

        long splitIndex = this.m_next + remaining / 2;
        BufferSpliterator<T> spliterator = new BufferSpliterator<>(this.m_buffer, splitIndex, this.m_next);
        this.m_next = splitIndex;
        return spliterator;
    }

    @Override
    public long estimateSize()
    {
        return this.m_limit - this.m_next;
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
