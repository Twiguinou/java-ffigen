package fr.kenlek.jpgen.api.data;

import module java.base;

import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemorySegment.NULL;

final class EmptyBuffer<T> implements Buffer<T>
{
    private final MemoryLayout m_elementLayout;
    private final SequenceLayout m_layout;

    EmptyBuffer(MemoryLayout elementLayout)
    {
        this.m_elementLayout = elementLayout;
        this.m_layout = sequenceLayout(0, elementLayout);
    }

    @Override
    public MemorySegment pointer()
    {
        return NULL;
    }

    @Override
    public SequenceLayout layout()
    {
        return this.m_layout;
    }

    @Override
    public MemoryLayout elementLayout()
    {
        return this.m_elementLayout;
    }

    @Override
    public T get(long index)
    {
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length 0.");
    }

    @Override
    public void set(long index, T value)
    {
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length 0.");
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof List<?> list && list.isEmpty();
    }

    @Override
    public int hashCode()
    {
        return 1;
    }

    @Override
    public String toString()
    {
        return "[]";
    }
}
