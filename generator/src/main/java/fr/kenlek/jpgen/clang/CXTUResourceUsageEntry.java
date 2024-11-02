/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public interface CXTUResourceUsageEntry
{
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
        return of(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry));
    }

    static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return of(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry));
    }

    static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsageEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr(), 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.byteSize());
    }

    java.lang.foreign.MemorySegment ptr();

    default void copyFrom(CXTUResourceUsageEntry other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry.byteSize());
    }

    int kind();
    void kind(int value);
    java.lang.foreign.MemorySegment $kind();
}
