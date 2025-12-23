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
            Buffer<Long> buffer = Buffer.allocateLongs(arena, 32);
            for (long i = 0; i < buffer.size(); i++)
            {
                buffer.set(i, i);
            }

            StreamSupport.stream(buffer.spliterator(), true).forEach(IO::println);
        }

        IO.println(System.lineSeparator() + "Trying to access an element out of bounds:");

        try
        {
            Buffer<MemorySegment> buffer = Buffer.of();
            buffer.get(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            IO.println(e);
        }
    }
}
