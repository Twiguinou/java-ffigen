package fr.kenlek.jpgen.api.data;

import module java.base;

import static java.lang.foreign.MemoryLayout.sequenceLayout;

abstract class BufferImpl<T, L extends MemoryLayout> implements Buffer<T>
{
    private final MemorySegment m_pointer;
    private final L m_elementLayout;
    private final SequenceLayout m_layout;

    BufferImpl(MemorySegment pointer, L elementLayout)
    {
        if (pointer.maxByteAlignment() < elementLayout.byteAlignment())
        {
            throw new IllegalArgumentException("Invalid alignment constraint for data segment.");
        }

        if (pointer.byteSize() % elementLayout.byteSize() != 0)
        {
            throw new IllegalArgumentException("Data segment size must be a multiple of the element layout size.");
        }

        this.m_pointer = pointer;
        this.m_elementLayout = elementLayout;
        this.m_layout = sequenceLayout(this.pointer().byteSize() / this.m_elementLayout.byteSize(), elementLayout);
    }

    @Override
    public MemorySegment pointer()
    {
        return this.m_pointer;
    }

    @Override
    public SequenceLayout layout()
    {
        return this.m_layout;
    }

    @Override
    public L elementLayout()
    {
        return this.m_elementLayout;
    }

    @Override
    public boolean equals(Object obj)
    {
        // We could test for buffer equality with MemorySegment::mismatch on primitive buffers
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
