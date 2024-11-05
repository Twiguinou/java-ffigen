/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public interface CXTUResourceUsageEntry
{
    java.lang.foreign.GroupLayout LAYOUT = fr.kenlek.jpgen.Host.select(
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.OS_WINDOWS, fr.kenlek.jpgen.clang.win32.CXTUResourceUsageEntry.LAYOUT_DATA.layout),
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.POSIX, fr.kenlek.jpgen.clang.posix.CXTUResourceUsageEntry.LAYOUT_DATA.layout)
    );
    java.util.function.Function<java.lang.foreign.MemorySegment, CXTUResourceUsageEntry> $ELEMENT_MAKER = fr.kenlek.jpgen.Host.select(
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.OS_WINDOWS, fr.kenlek.jpgen.clang.win32.CXTUResourceUsageEntry::new),
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.POSIX, fr.kenlek.jpgen.clang.posix.CXTUResourceUsageEntry::new)
    );

    static CXTUResourceUsageEntry of(java.lang.foreign.MemorySegment data)
    {
        return $ELEMENT_MAKER.apply(data);
    }

    static CXTUResourceUsageEntry allocate(java.lang.foreign.SegmentAllocator allocator)
    {
        return of(allocator.allocate(LAYOUT));
    }

    static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return of(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsageEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    java.lang.foreign.MemorySegment ptr();

    default void copyFrom(CXTUResourceUsageEntry other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    int kind();
    void kind(int value);
    java.lang.foreign.MemorySegment $kind();
}
