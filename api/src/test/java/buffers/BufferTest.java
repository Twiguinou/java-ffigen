package buffers;

import fr.kenlek.jpgen.api.Buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.stream.StreamSupport;

public final class BufferTest
{private BufferTest() {}

    public static void main(String... args)
    {
        // parallel access is illegal for confined arenas
        try (Arena arena = Arena.ofShared())
        {
            Buffer<Long> buffer = Buffer.allocateLongs(arena, 32);
            for (long i = 0; i < buffer.size(); i++)
            {
                buffer.set(i, i);
            }

            StreamSupport.stream(buffer.spliterator(), true).forEach(System.out::println);
        }

        try
        {
            Buffer<MemorySegment> buffer = Buffer.of();
            System.out.println(buffer.get(0));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
