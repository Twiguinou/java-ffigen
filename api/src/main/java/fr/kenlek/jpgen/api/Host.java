package fr.kenlek.jpgen.api;

import java.util.List;
import java.util.function.Supplier;

/// A host is a computer configuration.
public interface Host
{
    /// @see #select(List)
    record Value<T>(Host host, T element) {}

    /// @see #selectLazily(List)
    record Provider<T>(Host host, Supplier<T> supplier) {}

    /// @see #run(List)
    record Task(Host host, Runnable runnable) {}

    /// The universal host, available everywhere.
    Host ALL_TARGETS = () -> true;

    /// @return `true` if this host is the one running, `false` otherwise
    boolean isCurrent();

    /// Selects the first value for which the target host is the current one.
    static <T> T select(List<Value<? extends T>> values)
    {
        return values.stream()
            .filter(value -> value.host().isCurrent())
            .findFirst()
            .orElseThrow(HostNotFoundException::new)
            .element();
    }

    /// Lazily selects the first value for which the target host is the current one.
    static <T> T selectLazily(List<Provider<? extends T>> providers)
    {
        return providers.stream()
            .filter(provider -> provider.host().isCurrent())
            .findFirst()
            .orElseThrow(HostNotFoundException::new)
            .supplier()
            .get();
    }

    /// Run the first task for which the target host is the current one.
    static void run(List<Task> tasks)
    {
        for (Task task : tasks)
        {
            if (task.host().isCurrent())
            {
                task.runnable().run();
            }
        }

        throw new HostNotFoundException();
    }
}
