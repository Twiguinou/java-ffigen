import fr.kenlek.jpgen.api.dynload.ProxyCreationException;
import fr.kenlek.jpgen.clang.ClangUtils;
import fr.kenlek.jpgen.clang.LibClang;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public final class LibClangTest
{private LibClangTest() {}

    public static void main(String... args) throws ProxyCreationException
    {
        try (Arena arena = Arena.ofConfined())
        {
            LibClang libClang = LibClang.load(ClangUtils.loadClang(arena));
            System.out.println(libClang.getClangVersion());

            MemorySegment index = libClang.createIndex(0, 0);
            System.out.println("New libclang index: ".concat(index.toString()));

            libClang.disposeIndex(index);
        }
    }
}
