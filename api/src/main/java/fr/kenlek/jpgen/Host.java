package fr.kenlek.jpgen;

import java.util.List;
import java.util.function.Supplier;

public interface Host
{
    record Value<T>(Host host, T element) {}
    record Provider<T>(Host host, Supplier<T> supplier) {}
    record Task(Host host, Runnable runnable) {}

    Host ALL_TARGETS = () -> true;

    boolean isCurrent();

    static <T> T select(List<Value<? extends T>> values)
    {
        return values.stream()
                .filter(value -> value.host().isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .element();
    }

    static <T> T selectLazily(List<Provider<? extends T>> providers)
    {
        return providers.stream()
                .filter(provider -> provider.host().isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .supplier().get();
    }

    static void run(List<Task> tasks)
    {
        tasks.stream()
                .filter(task -> task.host().isCurrent())
                .findFirst()
                .orElseThrow(HostNotFoundException::new)
                .runnable().run();
    }
}
