package benchmarks;

import module java.base;

import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import org.openjdk.jmh.annotations.*;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Benchmark;

@State(Benchmark)
@BenchmarkMode(AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
public class ProxiesBenchmark
{
    private Stdlib stdlib;
    @Param({"-5678"})
    private int value;
    private MemorySegment fp_abs;

    @Setup
    public void init()
    {
        stdlib = NativeProxies.make(Stdlib.class, LinkingDowncallDispatcher.DEFAULT);
        fp_abs = SYSTEM_LINKER.defaultLookup().findOrThrow("abs");
    }

    @Benchmark
    public int stdlib__abs()
    {
        return stdlib.abs(value);
    }

    @Benchmark
    public int stdlib__abs_critical()
    {
        return stdlib.abs_critical(value);
    }

    @Benchmark
    public int stdlib__abs_unbound()
    {
        return stdlib.abs_unbound(fp_abs, value);
    }

    @Benchmark
    public int stdlib__abs_unbound_critical()
    {
        return stdlib.abs_unbound_critical(fp_abs, value);
    }
}
