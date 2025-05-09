package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.SymbolLookup;
import java.util.Optional;

public final class ClangUtils
{private ClangUtils() {}

    public static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursorKind.CXCursor_StructDecl || cursorKind == CXCursorKind.CXCursor_UnionDecl;
    }

    public static boolean getBoolean(int value)
    {
        return value != 0;
    }

    public static int getBoolean(boolean value)
    {
        return value ? 1 : 0;
    }

    public static SymbolLookup loadClang(Arena arena)
    {
        return SymbolLookup.libraryLookup(
            Optional.ofNullable(System.getProperty("jpgen.clang.path")).orElse("clang"),
            arena
        );
    }

    public static SymbolLookup loadClang()
    {
        return loadClang(Arena.global());
    }
}
