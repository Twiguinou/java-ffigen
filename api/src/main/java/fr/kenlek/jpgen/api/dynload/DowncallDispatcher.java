package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.Arrays;

public interface DowncallDispatcher
{
    record MatchEntry(MethodMatcher matcher, DowncallDispatcher dispatcher) {}

    static DowncallDispatcher matching(DowncallDispatcher fallbackDispatcher, MatchEntry... entries)
    {
        return method -> Arrays.stream(entries)
            .filter(entry -> entry.matcher().matches(method))
            .findFirst()
            .map(MatchEntry::dispatcher)
            .orElse(fallbackDispatcher)
            .dispatch(method);
    }

    MethodHandle dispatch(Method method);

    default DowncallDispatcher compose(DowncallTransformer transformer)
    {
        return method -> transformer.transform(method, this.dispatch(method));
    }
}
