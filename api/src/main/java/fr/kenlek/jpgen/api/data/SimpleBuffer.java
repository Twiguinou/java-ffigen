package fr.kenlek.jpgen.api.data;

import module java.base;

import static java.lang.foreign.MemoryLayout.sequenceLayout;

abstract class SimpleBuffer<T> implements Buffer<T>
{
    @FunctionalInterface
    interface LoadFunc<T, L extends MemoryLayout>
    {
        T load(L layout, long index);
    }

    @FunctionalInterface
    interface StoreFunc<T, L extends MemoryLayout>
    {
        void store(L layout, long index, T value);
    }

    private final MemorySegment m_pointer;
    private final MemoryLayout m_elementLayout;
    private final SequenceLayout m_layout;

    SimpleBuffer(MemorySegment pointer, MemoryLayout elementLayout)
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

    static <T, L extends MemoryLayout> SimpleBuffer<T> of(
        MemorySegment pointer, L elementLayout,
        LoadFunc<? extends T, ? super L> loadFunc, StoreFunc<? super T, ? super L> storeFunc
    )
    {
        return new SimpleBuffer<>(pointer, elementLayout)
        {
            @Override
            public T get(long index)
            {
                return loadFunc.load(elementLayout, index);
            }

            @Override
            public void set(long index, T value)
            {
                storeFunc.store(elementLayout, index, value);
            }
        };
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
    public MemoryLayout elementLayout()
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
