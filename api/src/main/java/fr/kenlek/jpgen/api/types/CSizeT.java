package fr.kenlek.jpgen.api.types;

import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.Layout;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.invoke.MethodType.methodType;
import static java.util.Objects.requireNonNull;

public final class CSizeT
{
    @Layout.Value("LAYOUT")
    public static final ValueLayout LAYOUT = (ValueLayout) requireNonNull(SYSTEM_LINKER.canonicalLayouts().get("size_t"));
    public static final DowncallTransformer TRANSFORMER = (method, handle) ->
    {
        final class Container
        {
            static final MethodHandle WRAPPER, UNWRAPPER;

            static
            {
                try
                {
                    MethodHandles.Lookup lookup = MethodHandles.publicLookup();
                    WRAPPER = lookup.findStatic(CSizeT.class, "of", methodType(CSizeT.class, LAYOUT.carrier()));
                    UNWRAPPER = lookup.findGetter(CSizeT.class, "value", long.class).asType(methodType(LAYOUT.carrier(), CSizeT.class));
                }
                catch (NoSuchMethodException | IllegalAccessException | NoSuchFieldException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        if (method.getParameterCount() != handle.type().parameterCount())
        {
            return handle;
        }

        if (method.getReturnType().equals(CSizeT.class) && handle.type().returnType().equals(LAYOUT.carrier()))
        {
            handle = MethodHandles.filterReturnValue(handle, Container.WRAPPER);
        }

        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < method.getParameterCount(); i++)
        {
            if (parameterTypes[i].equals(CSizeT.class) && handle.type().parameterType(i).equals(LAYOUT.carrier()))
            {
                handle = MethodHandles.filterArguments(handle, i, Container.UNWRAPPER);
            }
        }

        return handle;
    };

    public final long value;

    private CSizeT(long value)
    {
        this.value = value;
    }

    public static CSizeT of(long value)
    {
        return new CSizeT(value);
    }

    public static CSizeT of(int value)
    {
        return new CSizeT(Integer.toUnsignedLong(value));
    }

    public static CSizeT wrap(MemorySegment data)
    {
        return switch ((int) LAYOUT.byteSize())
        {
            case 4 -> CSizeT.of(data.get(JAVA_INT, 0));
            case 8 -> CSizeT.of(data.get(JAVA_LONG, 0));
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
}
