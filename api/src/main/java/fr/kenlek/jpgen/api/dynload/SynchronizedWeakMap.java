package fr.kenlek.jpgen.api.dynload;

import module java.base;

final class SynchronizedWeakMap<K, V>
{
    private final Map<K, WeakReference<V>> m_storage = new WeakHashMap<>();

    SynchronizedWeakMap() {}

    synchronized V get(K key, Function<? super K, ? extends V> factory)
    {
        return Optional.ofNullable(this.m_storage.get(key))
            .flatMap(reference -> Optional.ofNullable(reference.get()))
            .orElseGet(() ->
            {
                V computed = factory.apply(key);
                this.m_storage.put(key, new WeakReference<>(computed));
                return computed;
            });
    }
}
