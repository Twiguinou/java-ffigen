/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public interface CXUnsavedFile
{
    java.util.function.Function<java.lang.foreign.MemorySegment, CXUnsavedFile> $ELEMENT_MAKER = fr.kenlek.jpgen.Host.select(
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.OS_WINDOWS, fr.kenlek.jpgen.clang.win32.CXUnsavedFile::new),
            new fr.kenlek.jpgen.Host.Value<>(fr.kenlek.jpgen.Host.POSIX, fr.kenlek.jpgen.clang.posix.CXUnsavedFile::new)
    );

    static CXUnsavedFile of(java.lang.foreign.MemorySegment data)
    {
        return $ELEMENT_MAKER.apply(data);
    }

    static CXUnsavedFile allocate(java.lang.foreign.SegmentAllocator allocator)
    {
        return of(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile));
    }

    static CXUnsavedFile getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return of(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile));
    }

    static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXUnsavedFile value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr(), 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.byteSize());
    }

    java.lang.foreign.MemorySegment ptr();

    default void copyFrom(CXUnsavedFile other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile.byteSize());
    }

    java.lang.foreign.MemorySegment Filename();
    void Filename(java.lang.foreign.MemorySegment value);
    java.lang.foreign.MemorySegment $Filename();

    java.lang.foreign.MemorySegment Contents();
    void Contents(java.lang.foreign.MemorySegment value);
    java.lang.foreign.MemorySegment $Contents();
}
