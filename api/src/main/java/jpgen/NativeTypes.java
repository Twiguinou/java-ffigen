package jpgen;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;

public final class NativeTypes
{private NativeTypes() {}

    public static final SequenceLayout UNCHECKED_CHAR_PTR = MemoryLayout.sequenceLayout(ValueLayout.JAVA_CHAR);
}
