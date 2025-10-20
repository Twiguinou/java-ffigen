package fr.kenlek.jpgen.api.types;

import module java.base;

import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.UpcallTransformer;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.invoke.MethodType.methodType;
import static java.util.Objects.requireNonNull;

@Layout.Container("LAYOUT")
public final class CLong
{
    public static final ValueLayout LAYOUT = (ValueLayout) requireNonNull(SYSTEM_LINKER.canonicalLayouts().get("long"));
    public static final DowncallTransformer DOWNCALL_TRANSFORMER;
    public static final UpcallTransformer UPCALL_TRANSFORMER;

    public final long value;

    private CLong(long value)
    {
        this.value = value;
    }

    public static CLong of(long value)
    {
        return new CLong(value);
    }

    public static CLong of(int value)
    {
        return new CLong(value);
    }

    public static CLong wrap(MemorySegment data)
    {
        return switch ((int) LAYOUT.byteSize())
        {
            case 4 -> CLong.of(data.get(JAVA_INT, 0));
            case 8 -> CLong.of(data.get(JAVA_LONG, 0));
            default -> throw new UnsupportedOperationException();
        };
    }

    public void unwrap(MemorySegment data)
    {
        switch ((int) LAYOUT.byteSize())
        {
            case 4 -> data.set(JAVA_INT, 0, (int) this.value);
            case 8 -> data.set(JAVA_LONG, 0, this.value);
            default -> throw new UnsupportedOperationException();
        }
    }

    static Buffer<CLong> buffer(MemorySegment data)
    {
        Buffer.checkSegmentConstraints(data, LAYOUT);
        long size = Long.divideUnsigned(data.byteSize(), LAYOUT.byteSize());
        return new Buffer<>()
        {
            @Override
            public MemorySegment pointer()
            {
                return data;
            }

            @Override
            public long size()
            {
                return size;
            }

            private MemorySegment slice(long index)
            {
                return this.pointer().asSlice(index * LAYOUT.byteAlignment(), LAYOUT);
            }

            @Override
            public CLong get(long index)
            {
                return CLong.wrap(this.slice(index));
            }

            @Override
            public void set(long index, CLong value)
            {
                value.unwrap(this.slice(index));
            }
        };
    }

    static Buffer<CLong> allocateBuffer(SegmentAllocator allocator, long size)
    {
        return buffer(allocator.allocate(LAYOUT, size));
    }

    static Buffer<CLong> allocateBuffer(SegmentAllocator allocator, List<CLong> longs)
    {
        Buffer<CLong> buffer = allocateBuffer(allocator, longs.size());
        for (ListIterator<CLong> iterator = longs.listIterator(); iterator.hasNext();)
        {
            buffer.set(iterator.nextIndex(), iterator.next());
        }

        return buffer;
    }

    static
    {
        MethodHandles.Lookup lookup = MethodHandles.publicLookup();
        try
        {
            MethodHandle wrapper = lookup.findStatic(CLong.class, "of", methodType(CLong.class, LAYOUT.carrier()));
            MethodHandle unwrapper = lookup.findGetter(CLong.class, "value", long.class).asType(methodType(LAYOUT.carrier(), CLong.class));

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
        catch (NoSuchMethodException | IllegalAccessException | NoSuchFieldException e)
        {
            throw new RuntimeException(e);
        }
    }
}
