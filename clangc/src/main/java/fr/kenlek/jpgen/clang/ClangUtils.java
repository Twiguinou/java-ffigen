package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.Optional;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;

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

    /// Do not use in a multithreaded environment!
    /// This function attempts to overwrite the LIBCLANG_DISABLE_CRASH_RECOVERY environment variable
    /// and set it to 1 to prevent libclang from installing its own signal handlers.
    public static boolean disableCrashRecovery()
    {
        MethodHandle setenv = UpfrontIndex_h.downcall(
            SymbolLookup.loaderLookup(), Linker.nativeLinker(),
            "setenv", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT)
        );
        if (setenv == null)
        {
            return false;
        }

        try (Arena arena = Arena.ofConfined())
        {
            return (int) setenv.invokeExact(arena.allocateFrom("LIBCLANG_DISABLE_CRASH_RECOVERY"), arena.allocateFrom("1"), 1) == 0;
        }
        catch (Throwable _)
        {
            return false;
        }
    }

    public static void loadClang()
    {
        Optional.ofNullable(System.getProperty("jpgen.clang.path"))
            .ifPresentOrElse(System::load, () -> System.loadLibrary("clang"));
    }
}
