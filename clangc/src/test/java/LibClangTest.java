import fr.kenlek.jpgen.clang.LibClang;

import java.lang.foreign.MemorySegment;

public final class LibClangTest
{private LibClangTest() {}

    public static void main(String... args)
    {
        LibClang libClang = LibClang.load();
        System.out.println(libClang.getClangVersion());

        MemorySegment index = libClang.createIndex(false, false);
        System.out.println("New libclang index: " + index.toString());

        libClang.disposeIndex(index);
    }
}
