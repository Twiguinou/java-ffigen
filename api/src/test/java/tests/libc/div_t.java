package tests.libc;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.dynload.Layout;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;
import static java.lang.foreign.ValueLayout.JAVA_INT;

@Layout.Container("LAYOUT")
public record div_t(MemorySegment pointer) implements Addressable
{
    public static final StructLayout LAYOUT = makeStructLayout(
        JAVA_INT.withName("quot"),
        JAVA_INT.withName("rem")
    ).withName("div_t");
    public static final long OFFSET__quot = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("quot"));
    public static final long OFFSET__rem = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("rem"));

    public int quot()
    {
        return this.pointer().get(JAVA_INT, OFFSET__quot);
    }

    public int rem()
    {
        return this.pointer().get(JAVA_INT, OFFSET__rem);
    }
}
