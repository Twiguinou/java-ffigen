package fr.kenlek.jpgen.api.data;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

abstract class PrimitiveBuffer<T> implements Buffer<T>
{
    private final MemorySegment m_data;
    private final long m_size;

    PrimitiveBuffer(MemorySegment data, MemoryLayout layout)
    {
        checkSegmentConstraints(data, layout);
        this.m_data = data;
        this.m_size = Long.divideUnsigned(data.byteSize(), layout.byteSize());
    }

    private static void checkSegmentConstraints(MemorySegment data, MemoryLayout elementLayout)
    {
        if (data.maxByteAlignment() < elementLayout.byteAlignment())
        {
            throw new IllegalArgumentException("Invalid alignment constraint for data segment.");
        }

        if (Long.remainderUnsigned(data.byteSize(), elementLayout.byteSize()) != 0)
        {
            throw new IllegalArgumentException("Data segment size must be a multiple of the element layout size.");
        }
    }

    @Override
    public MemorySegment pointer()
    {
        return this.m_data;
    }

    @Override
    public long size()
    {
        return this.m_size;
    }
}
