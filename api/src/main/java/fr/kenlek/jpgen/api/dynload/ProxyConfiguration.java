package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.Optional;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public interface ProxyConfiguration
{
    static ProxyConfiguration of(SymbolLookup lookup, Linker linker)
    {
        return new ProxyConfiguration()
        {
            @Override
            public SymbolLookup lookup()
            {
                return lookup;
            }

            @Override
            public Linker linker()
            {
                return linker;
            }
        };
    }

    static ProxyConfiguration of(SymbolLookup lookup)
    {
        return of(lookup, SYSTEM_LINKER);
    }

    SymbolLookup lookup();

    Linker linker();

    default Optional<MemoryLayout> layout(String hint)
    {
        return Optional.empty();
    }

    default Optional<MemoryLayout> layout(Class<?> clazz)
    {
        return Optional.empty();
    }

    default MethodHandle transform(MethodHandle handle, String hint)
    {
        return handle;
    }
}
