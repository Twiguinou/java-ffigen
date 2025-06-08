package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public interface DowncallDispatcher extends SymbolLookup
{
    record MatchEntry(MethodMatcher matcher, DowncallDispatcher dispatcher) {}

    static DowncallDispatcher matching(DowncallDispatcher fallbackDispatcher, MatchEntry... entries)
    {
        return new DowncallDispatcher()
        {
            @Override
            public Optional<MemorySegment> find(String name)
            {
                return fallbackDispatcher.find(name);
            }

            @Override
            public Optional<Linker> linker()
            {
                return fallbackDispatcher.linker();
            }

            @Override
            public MethodHandle dispatch(Method method)
            {
                return Arrays.stream(entries)
                    .filter(entry -> entry.matcher().matches(method))
                    .findFirst()
                    .map(MatchEntry::dispatcher)
                    .orElse(fallbackDispatcher)
                    .dispatch(method);
            }
        };
    }

    default Optional<Linker> linker()
    {
        return Optional.empty();
    }

    MethodHandle dispatch(Method method);

    default DowncallDispatcher compose(DowncallTransformer transformer)
    {
        return new DowncallDispatcher()
        {
            @Override
            public Optional<MemorySegment> find(String name)
            {
                return DowncallDispatcher.this.find(name);
            }

            @Override
            public Optional<Linker> linker()
            {
                return DowncallDispatcher.this.linker();
            }

            @Override
            public MethodHandle dispatch(Method method)
            {
                return transformer.transform(method, DowncallDispatcher.this.dispatch(method));
            }
        };
    }
}
