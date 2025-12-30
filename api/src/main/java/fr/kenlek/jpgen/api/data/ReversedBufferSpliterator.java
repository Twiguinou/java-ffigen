package fr.kenlek.jpgen.api.data;

import java.util.function.Consumer;

final class ReversedBufferSpliterator<T> extends BufferSpliterator<T>
{
    private ReversedBufferSpliterator(Buffer<T> buffer, long limit, long next)
    {
        super(buffer, limit, next);
    }

    ReversedBufferSpliterator(Buffer<T> buffer)
    {
        this(buffer, 0, buffer.length() - 1);
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action)
    {
        if (this.m_next >= this.m_limit)
        {
            action.accept(this.m_buffer.get(this.m_next--));
            return true;
        }

        return false;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action)
    {
        while (this.m_next >= this.m_limit)
        {
            action.accept(this.m_buffer.get(this.m_next--));
        }
    }

    @Override
    public ReversedBufferSpliterator<T> trySplit()
    {
        long remaining = this.estimateSize();
        if (remaining <= 1)
        {
            return null;
        }

        long splitIndex = this.m_limit + remaining / 2;
        ReversedBufferSpliterator<T> spliterator = new ReversedBufferSpliterator<>(this.m_buffer, splitIndex, this.m_next);
        this.m_next = splitIndex - 1;
        return spliterator;
    }

    @Override
    public long estimateSize()
    {
        return this.m_next - this.m_limit + 1;
    }
}
