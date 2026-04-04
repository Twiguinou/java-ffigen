package tests.libc;

import module java.base;

import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.api.data.CLong;
import fr.kenlek.jpgen.api.data.CSizeT;
import fr.kenlek.jpgen.api.dynload.*;

import static fr.kenlek.jpgen.api.data.TypeUtils.C_TYPES_DOWNCALL_TRANSFORMER;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;

public final class LibCProxyTest
{private LibCProxyTest() {}

    public static int compareIntegers(MemorySegment ptr1, MemorySegment ptr2)
    {
        return Integer.compare(ptr1.get(JAVA_INT, 0), ptr2.get(JAVA_INT, 0));
    }

    public static int failingComparison(MemorySegment ptr1, MemorySegment ptr2)
    {
        throw new RuntimeException("Oh no! Please catch this...");
    }

    static void main()
    {
        IO.println("Running on platform: " + Platform.CURRENT);

        LibC libc = NativeProxies.make(MethodHandles.lookup(), LibC.class, DowncallDispatcher.DEFAULT
            .and(DowncallTransformer.PUBLIC_GROUP_TRANSFORMER)
            .and(C_TYPES_DOWNCALL_TRANSFORMER)
            .and(DowncallTransformer.UTF8_STRING_TRANSFORMER));
        UpcallDispatcher upcalls = new LinkingUpcallDispatcher(UpcallTransformer.exceptionCatcher(int.class, t ->
        {
            IO.println("An exception was thrown inside a callback!");
            IO.println(t);
            return 0;
        }).and(UpcallTransformer.UTF8_STRING_TRANSFORMER));

        IO.println();
        IO.println("fputs and fflush:");
        MemorySegment stdout = libc.stdout().reinterpret(ADDRESS.byteSize()).get(ADDRESS, 0);
        libc.fputs("hello from stdout" + System.lineSeparator(), stdout);
        libc.fflush(stdout);

        IO.println();
        IO.println("malloc:");
        MemorySegment data = libc.malloc(new CSizeT(128));
        try
        {
            IO.println("malloc(128) -> " + data.toString());
        }
        finally
        {
            libc.free(data);
        }

        IO.println();
        IO.println("div and div_t:");
        try (Arena arena = Arena.ofConfined())
        {
            div_t result = libc.div(arena, 41, 7);
            IO.println("div(41,7) -> quot(%d) rem(%d)".formatted(result.quot(), result.rem()));
        }

        IO.println();
        IO.println("qsort and upcalls:");
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment compareFunc = upcalls.dispatch(arena, CompareFunction.class, LibCProxyTest::compareIntegers);

            Buffer<Integer> array = Buffer.ofInts(arena, 0, 5, 2, 8, 9, 1, 4, 4, 7, 1, 4, 0, 9);
            IO.println(array);
            libc.qsort(array.pointer(), new CSizeT(array.size()), new CSizeT(JAVA_INT.byteSize()), compareFunc);
            IO.println(array);
        }

        IO.println();
        IO.println("upcall exception catcher:");
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment throwingFunc = upcalls.dispatch(arena, CompareFunction.class, LibCProxyTest::failingComparison);

            Buffer<Integer> array = Buffer.ofInts(arena, 1, 2, 3);
            libc.qsort(array.pointer(), new CSizeT(array.size()), new CSizeT(JAVA_INT.byteSize()), throwingFunc);
        }

        IO.println();
        IO.println("ctime:");
        try (Arena arena = Arena.ofConfined())
        {
            Buffer<CLong> pTime = CLong.buffer(arena, 1);
            pTime.set(0, libc.time(NULL));
            IO.println(libc.ctime(pTime.pointer()));
        }

        IO.println("strlen:");
        String s = "random_charaorhaeihfk";
        IO.println("strlen(" + s + ") -> " + libc.strlen(s));

        IO.println();
        String s1 = "World Hello!", s2 = "World Hallo!";
        IO.println("strcmp(\"" + s1 + "\",\"" + s2 + "\"):");
        IO.println("libc gives: " + libc.strcmp(s1, s2));
        IO.println("java gives: " + s1.compareTo(s2));
    }
}
