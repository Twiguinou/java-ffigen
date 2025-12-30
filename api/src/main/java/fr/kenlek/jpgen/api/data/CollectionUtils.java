package fr.kenlek.jpgen.api.data;

import module java.base;

final class CollectionUtils
{private CollectionUtils() {}

    static boolean areEqual(List<?> a, List<?> b)
    {
        if (a.size() != b.size())
        {
            return false;
        }

        Iterator<?> itA = a.iterator(), itB = b.iterator();
        while (true)
        {
            if (itA.hasNext())
            {
                if (!itB.hasNext() || !Objects.equals(itA.next(), itB.next()))
                {
                    return false;
                }

                continue;
            }

            if (itB.hasNext())
            {
                return false;
            }

            break;
        }

        return true;
    }

    static int hashCode(List<?> list)
    {
        int result = 1;
        for (Object object : list)
        {
            result = 31 * result + Objects.hashCode(object);
        }

        return result;
    }

    static String toString(List<?> list)
    {
        if (list.isEmpty())
        {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Iterator<?> iterator = list.iterator();
        if (iterator.hasNext())
        {
            builder.append(iterator.next());
        }

        while (iterator.hasNext())
        {
            builder.append(", ").append(iterator.next());
        }

        return builder.append(']').toString();
    }

    static <T, B extends Buffer<T>> B copy(B buffer, List<? extends T> list)
    {
        Collections.copy(buffer, list);
        return buffer;
    }
}
