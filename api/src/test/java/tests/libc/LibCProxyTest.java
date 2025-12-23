package tests.libc;

import module java.base;

import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.api.data.CSizeT;
import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.UpcallDispatcher;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static fr.kenlek.jpgen.api.data.TypeUtils.C_TYPES_DOWNCALL_TRANSFORMER;
import static fr.kenlek.jpgen.api.dynload.DowncallTransformer.PUBLIC_GROUP_TRANSFORMER;
import static java.lang.foreign.ValueLayout.*;

public final class LibCProxyTest
{private LibCProxyTest() {}

    public static int compareIntegers(MemorySegment ptr1, MemorySegment ptr2)
    {
        return Integer.compare(ptr1.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0), ptr2.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0));
    }

    static void main()
    {
        IO.println("Running on platform: " + Platform.CURRENT);

        LibC libc = NativeProxies.make(LibC.class,
            new LinkingDowncallDispatcher(SYSTEM_LINKER.defaultLookup())
                .and(PUBLIC_GROUP_TRANSFORMER)
                .and(C_TYPES_DOWNCALL_TRANSFORMER)
        );

        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment stdout = libc.stdout().reinterpret(ADDRESS.byteSize()).get(ADDRESS, 0);
            libc.fputs(arena.allocateFrom("hello from stdout" + System.lineSeparator()), stdout);
            libc.fflush(stdout);
        }

        MemorySegment data = libc.malloc(CSizeT.of(128));
        IO.println("malloc(128) -> " + data.toString());
        libc.free(data);

        try (Arena arena = Arena.ofConfined())
        {
            div_t result = libc.div(arena, 41, 7);
            IO.println("div(41,7) -> quot(%d) rem(%d)".formatted(result.quot(), result.rem()));

            MemorySegment compareFunc = UpcallDispatcher.DEFAULT.dispatch(arena, CompareFunction.class, LibCProxyTest::compareIntegers);

            Buffer<Integer> array = Buffer.allocateInts(arena, List.of(0, 5, 2, 8, 9, 1, 4, 4, 7, 1, 4, 0, 9));
            libc.qsort(array.pointer(), CSizeT.of(array.size()), CSizeT.of(JAVA_INT.byteSize()), compareFunc);
            IO.println(Arrays.toString(array.pointer().toArray(JAVA_INT)));
        }
    }
}
