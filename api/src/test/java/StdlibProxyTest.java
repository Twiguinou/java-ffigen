import fr.kenlek.jpgen.api.dynload.MappingProxyConfiguration;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.ProxyConfiguration;
import fr.kenlek.jpgen.api.dynload.ProxyCreationException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.invoke.MethodType.methodType;

public class StdlibProxyTest
{
    public static void main(String... args) throws ProxyCreationException
    {
        ProxyConfiguration configuration = new MappingProxyConfiguration.Builder()
            .mapLayout(div_t.class, div_t.LAYOUT)
            .mapTransformer("div", handle ->
            {
                try
                {
                    MethodHandle constructor = MethodHandles.publicLookup()
                        .in(div_t.class)
                        .findConstructor(div_t.class, methodType(void.class, MemorySegment.class));
                    return MethodHandles.filterReturnValue(handle, constructor);
                }
                catch (Throwable t)
                {
                    throw new RuntimeException(t);
                }
            })
            .build(SYSTEM_LINKER.defaultLookup());

        Stdlib stdlib = NativeProxies.instantiate(Stdlib.class, configuration);

        try (Arena arena = Arena.ofConfined())
        {
            div_t result = stdlib.div(arena, 456, 11);
            System.out.println(result.quot());
            System.out.println(result.rem());
        }
    }
}
