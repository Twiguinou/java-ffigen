package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Host;
import fr.kenlek.jpgen.api.Platform;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.List;
import java.util.function.Function;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public sealed interface CXUnsavedFile permits CXUnsavedFile.LLP64, CXUnsavedFile.Standard
{
    StructLayout LAYOUT = Host.selectLazily(List.of(
        new Host.Provider<>(Platform.OS.WINDOWS, () -> makeStructLayout(
            UNBOUNDED_POINTER.withName("Filename"),
            UNBOUNDED_POINTER.withName("Contents"),
            JAVA_INT.withName("Length")
        )),
        new Host.Provider<>(Host.ALL_TARGETS, () -> makeStructLayout(
            UNBOUNDED_POINTER.withName("Filename"),
            UNBOUNDED_POINTER.withName("Contents"),
            JAVA_LONG.withName("Length")
        ))
    )).withName("CXUnsavedFile");
    long OFFSET__Filename = LAYOUT.byteOffset(PathElement.groupElement("Filename"));
    long OFFSET__Contents = LAYOUT.byteOffset(PathElement.groupElement("Contents"));
    long OFFSET__Length = LAYOUT.byteOffset(PathElement.groupElement("Length"));

    Function<MemorySegment, ? extends CXUnsavedFile> CONSTRUCTOR = Host.select(List.of(
        new Host.Value<>(Platform.OS.WINDOWS, LLP64::new),
        new Host.Value<>(Host.ALL_TARGETS, Standard::new)
    ));

    static CXUnsavedFile allocate(SegmentAllocator allocator)
    {
        return CONSTRUCTOR.apply(allocator.allocate(LAYOUT));
    }

    static CXUnsavedFile getAtIndex(MemorySegment buffer, long index)
    {
        return CONSTRUCTOR.apply(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    static void setAtIndex(MemorySegment buffer, long index, CXUnsavedFile value)
    {
        MemorySegment.copy(value.ptr(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    MemorySegment ptr();

    default void copyFrom(CXUnsavedFile other)
    {
        MemorySegment.copy(other.ptr(), 0, this.ptr(), 0, LAYOUT.byteSize());
    }

    default MemorySegment Filename()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__Filename);
    }

    default void Filename(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__Filename, value);
    }

    default MemorySegment $Filename()
    {
        return this.ptr().asSlice(OFFSET__Filename, UNBOUNDED_POINTER);
    }

    default MemorySegment Contents()
    {
        return this.ptr().get(UNBOUNDED_POINTER, OFFSET__Contents);
    }

    default void Contents(MemorySegment value)
    {
        this.ptr().set(UNBOUNDED_POINTER, OFFSET__Contents, value);
    }

    default MemorySegment $Contents()
    {
        return this.ptr().asSlice(OFFSET__Contents, UNBOUNDED_POINTER);
    }

    record LLP64(MemorySegment ptr) implements CXUnsavedFile
    {
        public int Length()
        {
            return this.ptr().get(JAVA_INT, OFFSET__Length);
        }

        public void Length(int value)
        {
            this.ptr().set(JAVA_INT, OFFSET__Length, value);
        }

        public MemorySegment $Length()
        {
            return this.ptr().asSlice(OFFSET__Length, JAVA_INT);
        }
    }

    record Standard(MemorySegment ptr) implements CXUnsavedFile
    {
        public long Length()
        {
            return this.ptr().get(JAVA_LONG, OFFSET__Length);
        }

        public void Length(long value)
        {
            this.ptr().set(JAVA_LONG, OFFSET__Length, value);
        }

        public MemorySegment $Length()
        {
            return this.ptr().asSlice(OFFSET__Length, JAVA_LONG);
        }
    }
}
