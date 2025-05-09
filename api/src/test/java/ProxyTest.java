import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.ProxyCreationException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class ProxyTest
{
    public static void main(String... args) throws ProxyCreationException
    {
        LibC libc = NativeProxies.instantiate(LibC.class,
            LinkingDowncallDispatcher.DEFAULT.compose(DowncallTransformer.groupTransformer())
        );

        MemorySegment data = libc.malloc(128);
        System.out.println("malloc(128) -> ".concat(data.toString()));
        libc.free(data);

        try (Arena arena = Arena.ofConfined())
        {
            div_t result = libc.div(arena, 41, 7);
            System.out.printf("div(41,7) -> quot(%d) rem(%d)%n", result.quot(), result.rem());
        }
    }
}
