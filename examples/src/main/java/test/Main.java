package test;

import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;

import java.lang.foreign.Arena;
import java.lang.foreign.SymbolLookup;

public final class Main
{private Main() {}

    public static void main(String... args)
    {
        try (Arena arena = Arena.ofConfined())
        {
            Test test = NativeProxies.instantiate(Test.class, new LinkingDowncallDispatcher(
                SymbolLookup.libraryLookup(System.getProperty("test.path"), arena)
            ));

            System.out.println(test.sum(1, 2));
        }
    }
}
