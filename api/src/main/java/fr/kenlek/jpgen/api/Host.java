package fr.kenlek.jpgen.api;

import module java.base;

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

    default <T> Value<T> value(T element)
    {
        return new Value<>(this, element);
    }

    default <T> Provider<T> provider(Supplier<T> element)
    {
        return new Provider<>(this, element);
    }

    default Task task(Runnable runnable)
    {
        return new Task(this, runnable);
    }

    /// Selects the first value for which the target host is the current one.
    static <T> T select(List<Value<? extends T>> values)
    {
        return values.stream()
            .filter(value -> value.host().isCurrent())
            .findFirst()
            .orElseThrow(HostNotFoundException::new)
            .element();
    }

    @SafeVarargs @SuppressWarnings("varargs")
    static <T> T select(Value<? extends T>... values)
    {
        return select(List.of(values));
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

    @SafeVarargs @SuppressWarnings("varargs")
    static <T> T selectLazily(Provider<? extends T>... providers)
    {
        return selectLazily(List.of(providers));
    }

    /// Run the first task for which the target host is the current one.
    static void run(List<Task> tasks)
    {
        for (Task task : tasks)
        {
            if (task.host().isCurrent())
            {
                task.runnable().run();
                return;
            }
        }

        throw new HostNotFoundException();
    }

    static void run(Task... tasks)
    {
        run(List.of(tasks));
    }
}
