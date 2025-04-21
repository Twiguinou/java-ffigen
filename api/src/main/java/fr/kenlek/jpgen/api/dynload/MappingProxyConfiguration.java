package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public class MappingProxyConfiguration implements ProxyConfiguration
{
    private final SymbolLookup m_lookup;
    private final Linker m_linker;
    private final Map<String, Supplier<? extends MemoryLayout>> m_idLayoutMappings;
    private final Map<Class<?>, Supplier<? extends MemoryLayout>> m_classLayoutMappings;
    private final Map<String, Function<MethodHandle, ? extends MethodHandle>> m_transformerMappings;

    private MappingProxyConfiguration(SymbolLookup lookup, Linker linker,
                                      Map<String, Supplier<? extends MemoryLayout>> idLayoutMappings,
                                      Map<Class<?>, Supplier<? extends MemoryLayout>> classLayoutMappings,
                                      Map<String, Function<MethodHandle, ? extends MethodHandle>> transformerMappings)
    {
        this.m_lookup = lookup;
        this.m_linker = linker;
        this.m_idLayoutMappings = idLayoutMappings;
        this.m_classLayoutMappings = classLayoutMappings;
        this.m_transformerMappings = transformerMappings;
    }

    @Override
    public SymbolLookup lookup()
    {
        return this.m_lookup;
    }

    @Override
    public Linker linker()
    {
        return this.m_linker;
    }

    @Override
    public Optional<MemoryLayout> layout(String hint)
    {
        return Optional.ofNullable(this.m_idLayoutMappings.get(hint)).map(Supplier::get);
    }

    @Override
    public Optional<MemoryLayout> layout(Class<?> clazz)
    {
        return Optional.ofNullable(this.m_classLayoutMappings.get(clazz)).map(Supplier::get);
    }

    @Override
    public MethodHandle transform(MethodHandle handle, String hint)
    {
        return this.m_transformerMappings.getOrDefault(hint, Function.identity()).apply(handle);
    }

    public static class Builder
    {
        private final Map<String, Supplier<? extends MemoryLayout>> m_idLayoutMappings;
        private final Map<Class<?>, Supplier<? extends MemoryLayout>> m_classLayoutMappings;
        private final Map<String, Function<MethodHandle, ? extends MethodHandle>> m_transformerMappings;

        public Builder()
        {
            this.m_idLayoutMappings = new HashMap<>();
            this.m_classLayoutMappings = new HashMap<>();
            this.m_transformerMappings = new HashMap<>();
        }

        private Builder(Map<String, Supplier<? extends MemoryLayout>> idLayoutMappings,
                       Map<Class<?>, Supplier<? extends MemoryLayout>> classLayoutMappings,
                       Map<String, Function<MethodHandle, ? extends MethodHandle>> transformerMappings)
        {
            this.m_idLayoutMappings = new HashMap<>(idLayoutMappings);
            this.m_classLayoutMappings = new HashMap<>(classLayoutMappings);
            this.m_transformerMappings = new HashMap<>(transformerMappings);
        }

        public Builder(MappingProxyConfiguration configuration)
        {
            this(configuration.m_idLayoutMappings, configuration.m_classLayoutMappings, configuration.m_transformerMappings);
        }

        public Builder(Builder builder)
        {
            this(builder.m_idLayoutMappings, builder.m_classLayoutMappings, builder.m_transformerMappings);
        }

        public Builder mapLayout(String id, Supplier<? extends MemoryLayout> layoutSupplier)
        {
            Objects.requireNonNull(id, "Mapping key must be non null.");
            Objects.requireNonNull(layoutSupplier, "Mapped layout must be non null.");

            this.m_idLayoutMappings.put(id, layoutSupplier);
            return this;
        }

        public Builder mapLayout(String id, MemoryLayout layout)
        {
            return this.mapLayout(id, () -> layout);
        }

        public Builder mapLayout(Class<?> clazz, Supplier<? extends MemoryLayout> layoutSupplier)
        {
            Objects.requireNonNull(clazz, "Mapping class must be non null.");
            Objects.requireNonNull(layoutSupplier, "Mapped layout must be non null.");

            this.m_classLayoutMappings.put(clazz, layoutSupplier);
            return this;
        }

        public Builder mapLayout(Class<?> clazz, MemoryLayout layout)
        {
            return this.mapLayout(clazz, () -> layout);
        }

        public Builder unmapLayout(String id)
        {
            this.m_idLayoutMappings.remove(id);
            return this;
        }

        public Builder unmapLayout(Class<?> clazz)
        {
            this.m_classLayoutMappings.remove(clazz);
            return this;
        }

        public Builder mapTransformer(String id, Function<MethodHandle, ? extends MethodHandle> transformer)
        {
            Objects.requireNonNull(id, "Mapping key must be non null.");
            Objects.requireNonNull(transformer, "Mapped transformer must be non null.");

            this.m_transformerMappings.put(id, transformer);
            return this;
        }

        public Builder unmapTransformer(String id)
        {
            this.m_transformerMappings.remove(id);
            return this;
        }

        public MappingProxyConfiguration build(SymbolLookup lookup, Linker linker, boolean useNativeLayouts)
        {
            Map<String, Supplier<? extends MemoryLayout>> idLayoutMappings;
            if (useNativeLayouts)
            {
                idLayoutMappings = new HashMap<>(this.m_idLayoutMappings);
                linker.canonicalLayouts().forEach((key, layout) -> idLayoutMappings.putIfAbsent(key, () -> layout));
            }
            else
            {
                idLayoutMappings = this.m_idLayoutMappings;
            }

            return new MappingProxyConfiguration(lookup, linker,
                Map.copyOf(idLayoutMappings), Map.copyOf(this.m_classLayoutMappings), Map.copyOf(this.m_transformerMappings));
        }

        public MappingProxyConfiguration build(SymbolLookup lookup, Linker linker)
        {
            return this.build(lookup, linker, true);
        }

        public MappingProxyConfiguration build(SymbolLookup lookup, boolean useNativeLayouts)
        {
            return this.build(lookup, SYSTEM_LINKER, useNativeLayouts);
        }

        public MappingProxyConfiguration build(SymbolLookup lookup)
        {
            return this.build(lookup, true);
        }
    }
}
