package tests;

import module java.base;

import fr.kenlek.jpgen.api.Buffer;

public final class BufferTest
{private BufferTest() {}

    static void main()
    {
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

        try
        {
            Buffer<MemorySegment> buffer = Buffer.of();
            IO.println(buffer.get(0));
        }
        catch (IndexOutOfBoundsException e)
        {
            IO.println(e);
        }
    }
}
