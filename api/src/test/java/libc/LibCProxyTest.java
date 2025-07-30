package libc;

import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Arrays;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public final class LibCProxyTest
{private LibCProxyTest() {}

    public static int compareIntegers(MemorySegment ptr1, MemorySegment ptr2)
    {
        return Integer.compare(ptr1.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0), ptr2.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0));
    }

    public static void main(String... args)
    {
        System.out.println("Running on platform: " + Platform.CURRENT);

        LibC libc = NativeProxies.instantiate(LibC.class,
            new LinkingDowncallDispatcher(SYSTEM_LINKER.defaultLookup()).compose(DowncallTransformer.PUBLIC_GROUP_TRANSFORMER)
        );
        System.out.println("dispatcher -> " + libc.dispatcher());

        MemorySegment data = libc.malloc(128);
        System.out.println("malloc(128) -> " + data.toString());
        libc.free(data);

        try (Arena arena = Arena.ofConfined())
        {
            div_t result = libc.div(arena, 41, 7);
            System.out.printf("div(41,7) -> quot(%d) rem(%d)%n", result.quot(), result.rem());

            MemorySegment compareFunc = CompareFunction.makeHandle(LibCProxyTest::compareIntegers, arena);
            MemorySegment array = arena.allocateFrom(JAVA_INT, 0, 5, 2, 8, 9, 1, 4, 4, 7, 1, 4, 0, 9);
            libc.qsort(array, array.byteSize() / JAVA_INT.byteSize(), JAVA_INT.byteSize(), compareFunc);
            System.out.println(Arrays.toString(array.toArray(JAVA_INT)));
        }
    }
}
