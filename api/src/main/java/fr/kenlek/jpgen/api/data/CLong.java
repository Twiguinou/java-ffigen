package fr.kenlek.jpgen.api.data;

import module java.base;

import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.UpcallTransformer;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.invoke.MethodType.methodType;
import static java.util.Objects.requireNonNull;

/// C is much more implementation-permissive than Java when it comes to data types.
/// As a matter of fact, no data type in the C specification is required to follow any particular
/// constraint other than a range of values to represent.
/// For this reason, {@code sizeof(long)} will usually be 8 on Unix and 4 on Windows.
///
/// This type encapsulates both possibilities to be able to manipulate this data type without
/// bloated branching.
@Layout.Container("LAYOUT")
public record CLong(long value)
{
    private enum LayoutSize
    {
        _4,
        _8
    }

    /// The native layout of `long`, will be either [ValueLayout#JAVA_INT] or [ValueLayout#JAVA_LONG].
    public static final ValueLayout LAYOUT = (ValueLayout) requireNonNull(SYSTEM_LINKER.canonicalLayouts().get("long"));
    private static final EmptyBuffer<CLong> EMPTY_BUFFER = new EmptyBuffer<>(LAYOUT);
    private static final LayoutSize LAYOUT_SIZE = switch ((int) LAYOUT.byteSize())
    {
        case 4 -> LayoutSize._4;
        case 8 -> LayoutSize._8;
        default -> throw new UnsupportedOperationException();
    };
    /// A downcall transformer that maps [CLong] to the runtime carrier data type.
    public static final DowncallTransformer DOWNCALL_TRANSFORMER;
    /// An upcall transformer that maps [CLong] to the runtime carrier data type.
    public static final UpcallTransformer UPCALL_TRANSFORMER;

    /// Read a `long` inside a memory slice at the given offset.
    public CLong(MemorySegment data, long offset)
    {
        this(switch (LAYOUT_SIZE)
        {
            case _4 -> data.get(JAVA_INT, offset);
            case _8 -> data.get(JAVA_LONG, offset);
        });
    }

    /// Read a `long` inside a memory slice without offset.
    public CLong(MemorySegment data)
    {
        this(data, 0);
    }

    /// Creates a [Buffer] of `long`s for the given memory slice.
    public static Buffer<CLong> buffer(MemorySegment pointer)
    {
        return new InlineBufferImpl<>(pointer, LAYOUT)
        {
            @Override
            public CLong get(long index)
            {
                return new CLong(this.pointer(), LAYOUT.scale(0, index));
            }

            @Override
            public void set(long index, CLong value)
            {
                value.unwrap(this.pointer(), LAYOUT.scale(0, index));
            }
        };
    }

    /// Allocates a [Buffer] of `long`s with the given size and allocator.
    public static Buffer<CLong> buffer(SegmentAllocator allocator, long size)
    {
        return size == 0 ? buffer() : buffer(allocator.allocate(LAYOUT, size));
    }

    /// Allocates a [Buffer] of `long`s with the given elements and allocator.
    public static Buffer<CLong> buffer(SegmentAllocator allocator, List<CLong> longs)
    {
        return CollectionUtils.copy(buffer(allocator, longs.size()), longs);
    }

    /// Allocates a [Buffer] of `long`s with the given elements and allocator.
    public static Buffer<CLong> buffer(SegmentAllocator allocator, CLong... longs)
    {
        Buffer<CLong> buffer = buffer(allocator, longs.length);
        for (int i = 0; i < longs.length; i++)
        {
            longs[i].unwrap(buffer.pointer(), LAYOUT.scale(0, i));
        }

        return buffer;
    }

    /// Return an empty [Buffer] of `long`s.
    public static Buffer<CLong> buffer()
    {
        return EMPTY_BUFFER;
    }

    /// Writes the `long` represented by `this` in a memory slice at the given offset.
    public void unwrap(MemorySegment data, long offset)
    {
        switch (LAYOUT_SIZE)
        {
            case _4 -> data.set(JAVA_INT, offset, (int) this.value());
            case _8 -> data.set(JAVA_LONG, offset, this.value());
        }
    }

    /// Writes the `long` represented by `this` in a memory slice without offset.
    public void unwrap(MemorySegment data)
    {
        this.unwrap(data, 0);
    }

    /// Returns true if and only if `obj` is also a [CLong] and the first n bits of [#value()]
    /// are the same as `this`. (n is [#LAYOUT_SIZE])
    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof CLong(long other) && switch (LAYOUT_SIZE)
        {
            case _4 -> (int) this.value() == (int) other;
            case _8 -> this.value() == other;
        };
    }

    /// Computes either [Integer#hashCode(int)] or [Long#hashCode(long)] depending on the carrier type.
    @Override
    public int hashCode()
    {
        return switch (LAYOUT_SIZE)
        {
            case _4 -> Integer.hashCode((int) this.value());
            case _8 -> Long.hashCode(this.value());
        };
    }

    @Override
    public String toString()
    {
        return switch (LAYOUT_SIZE)
        {
            case _4 -> Integer.toString((int) this.value());
            case _8 -> Long.toString(this.value);
        };
    }

    static
    {
        MethodHandles.Lookup lookup = MethodHandles.publicLookup();
        try
        {
            MethodHandle wrapper = lookup.findConstructor(CLong.class, methodType(void.class, long.class))
                .asType(methodType(CLong.class, LAYOUT.carrier()));
            MethodHandle unwrapper = lookup.findVirtual(CLong.class, "value", methodType(long.class))
                .asType(methodType(LAYOUT.carrier(), CLong.class));

            DOWNCALL_TRANSFORMER = DowncallTransformer.pairwiseTransformer((source, target, location) ->
            {
                if (source.equals(LAYOUT.carrier()) && target.equals(CLong.class))
                {
                    return Optional.of(switch (location)
                    {
                        case RESULT -> wrapper;
                        case PARAMETER -> unwrapper;
                    });
                }

                return Optional.empty();
            });
            UPCALL_TRANSFORMER = UpcallTransformer.pairwiseTransformer((source, target, location) ->
            {
                if (source.equals(LAYOUT.carrier()) && target.equals(CLong.class))
                {
                    return Optional.of(switch (location)
                    {
                        case RESULT -> unwrapper;
                        case PARAMETER -> wrapper;
                    });
                }

                return Optional.empty();
            });
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
