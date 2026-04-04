package benchmarks;

import module java.base;

import fr.kenlek.jpgen.api.data.CSizeT;
import fr.kenlek.jpgen.api.dynload.DowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import org.openjdk.jmh.annotations.*;

import static fr.kenlek.jpgen.api.data.TypeUtils.C_TYPES_DOWNCALL_TRANSFORMER;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Benchmark;

@State(Benchmark)
@BenchmarkMode(AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 5, time = 1)
public class InlineStringBenchmark
{
    private interface Stdlib
    {
        CSizeT strlen(String str);

        int strcmp(String first, String second);
    }

    private static final Stdlib stdlib = NativeProxies.make(
        MethodHandles.lookup(), Stdlib.class,
        DowncallDispatcher.DEFAULT.and(DowncallTransformer.UTF8_STRING_TRANSFORMER)
            .and(C_TYPES_DOWNCALL_TRANSFORMER)
    );

    private String string1, string2;

    @Setup
    public void init()
    {
        string1 = UUID.randomUUID().toString();
        string2 = UUID.randomUUID().toString();
    }

    @Benchmark
    public CSizeT strlen__UTF8_STRING_TRANSFORMER()
    {
        return stdlib.strlen(string1);
    }

    @Benchmark
    public int strcmp__UTF8_STRING_TRANSFORMER()
    {
        return stdlib.strcmp(string1, string2);
    }
}
