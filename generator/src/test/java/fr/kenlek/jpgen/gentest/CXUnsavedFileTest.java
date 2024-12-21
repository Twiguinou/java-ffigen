package fr.kenlek.jpgen.gentest;

import fr.kenlek.jpgen.clang.CXUnsavedFile;

import java.lang.foreign.Arena;

public final class CXUnsavedFileTest
{private CXUnsavedFileTest() {}

    public static void main(String... args)
    {
        try (Arena arena = Arena.ofConfined())
        {
            CXUnsavedFile unsavedFile = CXUnsavedFile.allocate(arena);
            System.out.println(unsavedFile.ptr());
        }
    }
}
