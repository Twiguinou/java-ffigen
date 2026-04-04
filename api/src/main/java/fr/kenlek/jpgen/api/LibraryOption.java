package fr.kenlek.jpgen.api;

import java.nio.file.Path;

/// The FFM API officially supports two ways of loading shared libraries:
/// - Either from an absolute or relative path to a shared library file.
/// - Or from a symbolic name.
///
/// The latter method is ABI-defined, for instance with [dlopen](https://pubs.opengroup.org/onlinepubs/009696799/functions/dlopen.html)
/// on POSIX compliant systems and with [LoadLibrary](https://learn.microsoft.com/en-us/cpp/build/loadlibrary-and-afxloadlibrary?view=msvc-170)
/// on Windows.
///
/// This interface is defined to unify both methods when loading with [ForeignUtils#loadFirstLookup].
public sealed interface LibraryOption permits LibraryOption.FromName, LibraryOption.FromPath
{
    /// To load from a symbolic name.
    record FromName(String name) implements LibraryOption {}

    /// To load from a relative or absolute path.
    record FromPath(Path path) implements LibraryOption {}

    /// A static constructor for [FromName].
    static FromName of(String name)
    {
        return new FromName(name);
    }

    /// A static constructor for [FromPath].
    static FromPath of(Path path)
    {
        return new FromPath(path);
    }
}
