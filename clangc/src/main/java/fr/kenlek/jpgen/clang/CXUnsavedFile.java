package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Host;
import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Function;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.*;

public sealed interface CXUnsavedFile extends Addressable
    permits CXUnsavedFile.LLP64, CXUnsavedFile.Standard
{
    @Layout.Value("LAYOUT")
    StructLayout LAYOUT = makeStructLayout(
        UNBOUNDED_POINTER.withName("Filename"),
        UNBOUNDED_POINTER.withName("Contents"),
        Host.select(
            Platform.OS.WINDOWS.value(JAVA_INT),
            Host.ALL_TARGETS.value(JAVA_LONG)
        ).withName("Length")
    ).withName("CXUnsavedFile");
    long OFFSET__Filename = LAYOUT.byteOffset(PathElement.groupElement("Filename"));
    long OFFSET__Contents = LAYOUT.byteOffset(PathElement.groupElement("Contents"));
    long OFFSET__Length = LAYOUT.byteOffset(PathElement.groupElement("Length"));

    Function<MemorySegment, ? extends CXUnsavedFile> CONSTRUCTOR = Host.select(
        Platform.OS.WINDOWS.value(LLP64::new),
        Host.ALL_TARGETS.value(Standard::new)
    );

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
        MemorySegment.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    MemorySegment pointer();

    default void copyFrom(CXUnsavedFile other)
    {
        MemorySegment.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());
    }

    default MemorySegment Filename()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Filename);
    }

    default void Filename(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Filename, value);
    }

    default MemorySegment $Filename()
    {
        return this.pointer().asSlice(OFFSET__Filename, UNBOUNDED_POINTER);
    }

    default MemorySegment Contents()
    {
        return this.pointer().get(UNBOUNDED_POINTER, OFFSET__Contents);
    }

    default void Contents(MemorySegment value)
    {
        this.pointer().set(UNBOUNDED_POINTER, OFFSET__Contents, value);
    }

    default MemorySegment $Contents()
    {
        return this.pointer().asSlice(OFFSET__Contents, UNBOUNDED_POINTER);
    }

    record LLP64(MemorySegment pointer) implements CXUnsavedFile
    {
        public int Length()
        {
            return this.pointer().get(JAVA_INT, OFFSET__Length);
        }

        public void Length(int value)
        {
            this.pointer().set(JAVA_INT, OFFSET__Length, value);
        }

        public MemorySegment $Length()
        {
            return this.pointer().asSlice(OFFSET__Length, JAVA_INT);
        }
    }

    record Standard(MemorySegment pointer) implements CXUnsavedFile
    {
        public long Length()
        {
            return this.pointer().get(JAVA_LONG, OFFSET__Length);
        }

        public void Length(long value)
        {
            this.pointer().set(JAVA_LONG, OFFSET__Length, value);
        }

        public MemorySegment $Length()
        {
            return this.pointer().asSlice(OFFSET__Length, JAVA_LONG);
        }
    }
}
