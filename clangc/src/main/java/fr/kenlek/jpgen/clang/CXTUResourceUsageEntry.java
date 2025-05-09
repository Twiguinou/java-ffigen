package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Host;
import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.List;
import java.util.function.Function;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;

public sealed interface CXTUResourceUsageEntry extends Addressable
    permits CXTUResourceUsageEntry.LLP64, CXTUResourceUsageEntry.Standard
{
    @Layout.Value("LAYOUT")
    StructLayout LAYOUT = Host.selectLazily(List.of(
        new Host.Provider<>(Platform.OS.WINDOWS, () -> makeStructLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("amount")
        )),
        new Host.Provider<>(Host.ALL_TARGETS, () -> makeStructLayout(
            JAVA_INT.withName("kind"),
            JAVA_LONG.withName("amount")
        ))
    )).withName("CXTUResourceUsageEntry");
    long OFFSET__kind = LAYOUT.byteOffset(PathElement.groupElement("kind"));
    long OFFSET__amount = LAYOUT.byteOffset(PathElement.groupElement("amount"));

    Function<MemorySegment, ? extends CXTUResourceUsageEntry> CONSTRUCTOR = Host.select(List.of(
        new Host.Value<>(Platform.OS.WINDOWS, LLP64::new),
        new Host.Value<>(Host.ALL_TARGETS, Standard::new)
    ));

    static CXTUResourceUsageEntry allocate(SegmentAllocator allocator)
    {
        return CONSTRUCTOR.apply(allocator.allocate(LAYOUT));
    }

    static CXTUResourceUsageEntry getAtIndex(MemorySegment buffer, long index)
    {
        return CONSTRUCTOR.apply(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long index, CXTUResourceUsageEntry value)
    {
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    default void copyFrom(CXTUResourceUsageEntry other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    default int kind()
    {
        return this.pointer().get(JAVA_INT, OFFSET__kind);
    }

    default void kind(int value)
    {
        this.pointer().set(JAVA_INT, OFFSET__kind, value);
    }

    default MemorySegment $kind()
    {
        return this.pointer().asSlice(OFFSET__kind, JAVA_INT);
    }

    record LLP64(MemorySegment pointer) implements CXTUResourceUsageEntry
    {
        public int amount()
        {
            return this.pointer().get(JAVA_INT, OFFSET__amount);
        }

        public void amount(int value)
        {
            this.pointer().set(JAVA_INT, OFFSET__amount, value);
        }

        public MemorySegment $amount()
        {
            return this.pointer().asSlice(OFFSET__amount, JAVA_INT);
        }
    }

    record Standard(MemorySegment pointer) implements CXTUResourceUsageEntry
    {
        public long amount()
        {
            return this.pointer().get(JAVA_LONG, OFFSET__amount);
        }

        public void amount(long value)
        {
            this.pointer().set(JAVA_LONG, OFFSET__amount, value);
        }

        public MemorySegment $amount()
        {
            return this.pointer().asSlice(OFFSET__amount, JAVA_LONG);
        }
    }
}
