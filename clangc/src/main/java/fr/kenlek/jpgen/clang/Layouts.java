package fr.kenlek.jpgen.clang;

import module java.base;

import static java.lang.foreign.ValueLayout.*;

public final class Layouts
{private Layouts() {}

    public static final SequenceLayout ARRAY_2__POINTER = MemoryLayout.sequenceLayout(2, ADDRESS);
    public static final SequenceLayout ARRAY_3__INT_64 = MemoryLayout.sequenceLayout(3, JAVA_LONG);
    public static final SequenceLayout ARRAY_3__POINTER = MemoryLayout.sequenceLayout(3, ADDRESS);
    public static final SequenceLayout ARRAY_4__INT_32 = MemoryLayout.sequenceLayout(4, JAVA_INT);
}
