package fr.kenlek.jpgen.api.data;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

abstract class InlineBufferImpl<T, L extends MemoryLayout> extends BufferImpl<T, L> implements Buffer.Inline<T>
{
    InlineBufferImpl(MemorySegment pointer, L elementLayout)
    {
        super(pointer, elementLayout);
    }
}
