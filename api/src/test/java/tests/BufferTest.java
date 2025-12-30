package tests;

import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;

public final class BufferTest
{private BufferTest() {}

    static void main()
    {
        IO.println("Parallel traversal of a buffer:");
        // parallel access is illegal for confined arenas
        try (Arena arena = Arena.ofShared())
        {
            Buffer<Long> buffer = Buffer.longs(arena, 32);
            for (long i = 0; i < buffer.size(); i++)
            {
                buffer.set(i, i);
            }

            AtomicLong counter = new AtomicLong();
            buffer.parallelStream().forEach(l ->
            {
                IO.println(l);
                counter.incrementAndGet();
            });
            IO.println("Counted " + counter + " elements");
        }

        IO.println(System.lineSeparator() + "Trying to access an element out of bounds:");

        try
        {
            Buffer<Integer> buffer = Buffer.ints();
            buffer.getFirst();
        }
        catch (Throwable t)
        {
            IO.println(t);
        }
    }
}
