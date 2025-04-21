import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

public record div_t(MemorySegment ptr)
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("quot"),
        JAVA_INT.withName("rem")
    ).withName("div_t");
    public static final long OFFSET__quot = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("quot"));
    public static final long OFFSET__rem = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("rem"));

    public int quot()
    {
        return this.ptr().get(JAVA_INT, OFFSET__quot);
    }

    public int rem()
    {
        return this.ptr().get(JAVA_INT, OFFSET__rem);
    }
}
