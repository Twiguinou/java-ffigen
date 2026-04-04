package fr.kenlek.jpgen.api.data;

import module java.base;

import fr.kenlek.jpgen.api.ForeignUtils;

import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;

final class EmptyBuffer<T> implements Buffer.Inline<T>
{
    static final EmptyBuffer<Boolean> BOOLEAN = new EmptyBuffer<>(JAVA_BOOLEAN);
    static final EmptyBuffer<Boolean> BOOL32 = new EmptyBuffer<>(JAVA_INT);
    static final EmptyBuffer<Byte> BYTE = new EmptyBuffer<>(JAVA_BYTE);
    static final EmptyBuffer<Short> SHORT = new EmptyBuffer<>(JAVA_SHORT);
    static final EmptyBuffer<Character> CHARACTER = new EmptyBuffer<>(JAVA_CHAR);
    static final EmptyBuffer<Integer> INTEGER = new EmptyBuffer<>(JAVA_INT);
    static final EmptyBuffer<Long> LONG = new EmptyBuffer<>(JAVA_LONG);
    static final EmptyBuffer<Float> FLOAT = new EmptyBuffer<>(JAVA_FLOAT);
    static final EmptyBuffer<Double> DOUBLE = new EmptyBuffer<>(JAVA_DOUBLE);
    static final EmptyBuffer<MemorySegment> ADDRESS = new EmptyBuffer<>(ValueLayout.ADDRESS);
    static final EmptyBuffer<String> STRING = new EmptyBuffer<>(ForeignUtils.UNBOUNDED_POINTER);

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
