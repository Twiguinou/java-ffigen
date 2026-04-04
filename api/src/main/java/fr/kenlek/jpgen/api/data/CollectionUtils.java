package fr.kenlek.jpgen.api.data;

import module java.base;

final class CollectionUtils
{private CollectionUtils() {}

    static boolean areEqual(Collection<?> a, Collection<?> b)
    {
        if (a instanceof Buffer.Inline<?> bufferA && b instanceof Buffer.Inline<?> bufferB)
        {
            return bufferA.pointer().mismatch(bufferB.pointer()) == -1;
        }

        if (a.size() != b.size())
        {
            return false;
        }

        Iterator<?> itA = a.iterator(), itB = b.iterator();
        while (true)
        {
            if (!itA.hasNext())
            {
                return !itB.hasNext();
            }

            if (!itB.hasNext() || !Objects.equals(itA.next(), itB.next()))
            {
                return false;
            }
        }
    }

    static int hashCode(Iterable<?> list)
    {
        int result = 1;
        for (Object object : list)
        {
            result = 31 * result + Objects.hashCode(object);
        }

        return result;
    }

    static String toString(Iterable<?> list)
    {
        Iterator<?> iterator = list.iterator();
        if (!iterator.hasNext())
        {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        while (true)
        {
            builder.append(iterator.next());
            if (!iterator.hasNext())
            {
                break;
            }

            builder.append(", ");
        }

        return builder.append(']').toString();
    }

    static <T, B extends Buffer<T>> B copy(B buffer, List<? extends T> list)
    {
        if (buffer instanceof Buffer.Inline<?> && list instanceof Buffer.Inline<?> buffer2)
        {
            buffer.pointer().copyFrom(buffer2.pointer());
        }
        else
        {
            Collections.copy(buffer, list);
        }

        return buffer;
    }

    static <B extends Buffer<?>> B copy(B buffer, MemorySegment data)
    {
        buffer.pointer().copyFrom(data);
        return buffer;
    }
}
