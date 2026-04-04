package benchmarks;

import module java.base;

import org.openjdk.jmh.annotations.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Benchmark;

@State(Benchmark)
@BenchmarkMode(AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 5, time = 1)
@Threads(4)
public class AllocationBenchmark
{
    @Param({"8", "1024", "65536"})
    private int bytes;

    @Benchmark
    public MemorySegment Arena_ofShared__allocate()
    {
        try (Arena arena = Arena.ofShared())
        {
            return arena.allocate(bytes);
        }
    }

    @Benchmark
    public MemorySegment Arena_ofConfined__allocate()
    {
        try (Arena arena = Arena.ofConfined())
        {
            return arena.allocate(bytes);
        }
    }
}
