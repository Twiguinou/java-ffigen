package fr.kenlek.jpgen;

import java.util.List;
import java.util.function.Supplier;

public interface Host
{
    Host ALL_TARGETS = () -> true;
    Host OS_WINDOWS = () -> Platform.CURRENT.os() == Platform.Os.WINDOWS;
    Host POSIX = () -> Platform.CURRENT.os() != Platform.Os.WINDOWS;

    record Value<T>(Host host, T element) {}

    record Provider<T>(Host host, Supplier<T> supplier) {}

    record Task(Host host, Runnable runnable) {}

    boolean isCurrent();

    static <T> T select(List<Value<? extends T>> values)
    {
        return values.stream()
                .filter(value -> value.host.isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .element;
    }

    @SafeVarargs
    static <T> T select(Value<? extends T>... values)
    {
        return select(List.of(values));
    }

    static <T> T selectLazily(List<Provider<? extends T>> providers)
    {
        return providers.stream()
                .filter(provider -> provider.host().isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .supplier.get();
    }

    @SafeVarargs
    static <T> T selectLazily(Provider<? extends T>... providers)
    {
        return selectLazily(List.of(providers));
    }

    static void runLazily(List<Task> tasks)
    {
        tasks.stream()
                .filter(task -> task.host().isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .runnable.run();
    }

    static void runLazily(Task... tasks)
    {
        runLazily(List.of(tasks));
    }
}
