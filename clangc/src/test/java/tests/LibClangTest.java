package tests;

import fr.kenlek.jpgen.clang.LibClang;
import java.lang.foreign.MemorySegment;

public final class LibClangTest
{private LibClangTest() {}

    static void main()
    {
        LibClang libClang = LibClang.load();
        IO.println(libClang.getClangVersion());

        MemorySegment index = libClang.createIndex(false, false);
        try
        {
            IO.println("New libclang index: " + index.toString());
        }
        finally
        {
            libClang.disposeIndex(index);
        }
    }
}
