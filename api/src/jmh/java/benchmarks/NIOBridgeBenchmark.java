package benchmarks;

import module java.base;

import org.openjdk.jmh.annotations.*;

import static java.lang.foreign.ValueLayout.*;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Benchmark;

@State(Benchmark)
@BenchmarkMode(AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 5, time = 1)
public class NIOBridgeBenchmark
{
    private MemorySegment aligned;
    private MemorySegment alignedReadOnly;
    private MemorySegment unaligned;
    private MemorySegment unalignedReadOnly;

    @Setup
    public void init()
    {
        Arena arena = Arena.ofAuto();

        aligned = arena.allocate(JAVA_INT, 128);
        alignedReadOnly = arena.allocate(JAVA_INT, 128).asReadOnly();
        unaligned = arena.allocate(JAVA_INT_UNALIGNED, 128);
        unalignedReadOnly = arena.allocate(JAVA_INT_UNALIGNED, 128);
    }

    @Benchmark
    public ByteBuffer asByteBuffer__aligned()
    {
        return aligned.asByteBuffer();
    }

    @Benchmark
    public ByteBuffer asByteBuffer__alignedReadOnly()
    {
        return alignedReadOnly.asByteBuffer();
    }

    @Benchmark
    public ByteBuffer asByteBuffer__unaligned()
    {
        return unaligned.asByteBuffer();
    }

    @Benchmark
    public ByteBuffer asByteBuffer__unalignedReadOnly()
    {
        return unalignedReadOnly.asByteBuffer();
    }

    @Benchmark
    public CharBuffer asByteBuffer_asCharBuffer__aligned()
    {
        return aligned.asByteBuffer().asCharBuffer();
    }

    @Benchmark
    public CharBuffer asByteBuffer_asCharBuffer__alignedReadOnly()
    {
        return alignedReadOnly.asByteBuffer().asCharBuffer();
    }

    @Benchmark
    public CharBuffer asByteBuffer_asCharBuffer__unaligned()
    {
        return unaligned.asByteBuffer().asCharBuffer();
    }

    @Benchmark
    public CharBuffer asByteBuffer_asCharBuffer__unalignedReadOnly()
    {
        return unalignedReadOnly.asByteBuffer().asCharBuffer();
    }
}
