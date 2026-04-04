package fr.kenlek.jpgen.api;

import module java.base;

import static java.lang.Math.*;
import static java.lang.System.mapLibraryName;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.foreign.SymbolLookup.libraryLookup;
import static java.lang.foreign.ValueLayout.*;

/// Various utility fields and methods to work with the FFM API.
public final class ForeignUtils
{private ForeignUtils() {}

    /// The system default foreign function linker.
    public static final Linker SYSTEM_LINKER = Linker.nativeLinker();
    /// An address layout whose target layout is as big as possible.
    public static final AddressLayout UNBOUNDED_POINTER = ADDRESS.withTargetLayout(sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));

    private static long getAlignmentMask(long alignment)
    {
        long m;
        if (alignment == 0 || (alignment & (m = alignment - 1)) != 0)
        {
            throw new IllegalArgumentException("Alignment is not a power of two!");
        }

        return m;
    }

    /// Aligns an address to the nearest lower multiple of some alignment.
    /// @param address The address to align.
    /// @param alignment The value to align to. It must be a power of two.
    /// @return The largest multiple of alignment that is less than the original address.
    /// @throws IllegalArgumentException If {@code alignment} is not a power of two.
    public static long alignDownwards(long address, long alignment)
    {
        return address & (~getAlignmentMask(alignment));
    }

    /// Aligns an address to the nearest upper multiple of some alignment.
    /// @see #alignDownwards
    public static long alignUpwards(long address, long alignment)
    {
        long m = getAlignmentMask(alignment);
        return addExact(address, m) & (~m);
    }

    private static long alignOffset(long base, long alignment, Consumer<PaddingLayout> paddingConsumer)
    {
        long aligned = alignUpwards(base, alignment);
        long padding = aligned - base;
        if (padding > 0)
        {
            paddingConsumer.accept(paddingLayout(padding));
        }

        return aligned;
    }

    /// Creates a [StructLayout] from a sequence of memory layouts by inserting the necessary padding
    /// to ensure proper alignment of each inner layout.
    public static StructLayout makeStructLayout(MemoryLayout... layouts)
    {
        List<MemoryLayout> arrangedLayouts = new ArrayList<>();

        long size = 0;
        long structAlignment = 1;
        for (MemoryLayout layout : layouts)
        {
            long fieldAlignment = layout.byteAlignment();
            long alignedOffset = alignOffset(size, fieldAlignment, arrangedLayouts::add);

            arrangedLayouts.add(layout);
            structAlignment = max(structAlignment, fieldAlignment);
            size = addExact(alignedOffset, layout.byteSize());
        }

        alignOffset(size, structAlignment, arrangedLayouts::add);
        return structLayout(arrangedLayouts.toArray(MemoryLayout[]::new));
    }

    /// Loads a [SymbolLookup] by first extracting the content of a library to a temporary file,
    /// from which the lookup is then loaded.
    /// @param arena The arena to which the lookup will be associated with.
    /// @param input The stream of contents that contains the library to load.
    /// @param name A name to associate with the temporary file. This parameter does not have
    /// any requirement of being unique.
    /// @return A [SymbolLookup] based on the contents of the given [InputStream].
    /// @throws IOException If an I/O exception occurs.
    public static SymbolLookup loadLookup(Arena arena, InputStream input, String name) throws IOException
    {
        Path libraryPath = Files.createTempFile(mapLibraryName("jpgen-shared-library-" + name), null);
        try
        {
            Files.copy(input, libraryPath, StandardCopyOption.REPLACE_EXISTING);
            SymbolLookup lookup = libraryLookup(libraryPath, arena);
            libraryPath.toFile().deleteOnExit();
            return lookup;
        }
        catch (Throwable t)
        {
            Files.deleteIfExists(libraryPath);
            throw t;
        }
    }

    /// C APIs often come with prefixes to distinguish their functions easily.
    /// For instance in Vulkan, all functions are prefixed with `vk`. GLFW also
    /// prefixes every function with `glfw`. This function can be used to remove that
    /// kind of content. So `vkCreateInstance` effectively becomes `createInstance`
    /// with this function.
    /// @param name The symbol from which to strip the given prefix. An exception
    /// will be thrown if such an operation cannot be performed.
    /// @param prefix The prefix to remove from the symbolic name.
    /// @return {@code name} stripped of the given {@code prefix}. Any character following the
    /// given prefix is changed to its lowercase equivalent.
    /// @throws IllegalArgumentException If {@code name} does not start with {@code prefix},
    /// or if shortening it would mean returning an empty [String].
    public static String stripAPIName(String name, String prefix)
    {
        if (!name.startsWith(prefix) || name.equals(prefix))
        {
            throw new IllegalArgumentException("%s cannot be stripped of the %s prefix.".formatted(name, prefix));
        }

        int beginIndex = prefix.length() + 1;
        return name.substring(prefix.length(), beginIndex).toLowerCase() + name.substring(beginIndex);
    }

    /// The reverse operation of [#stripAPIName].
    /// @param name The symbol to which insert the given prefix at the beginning.
    /// @param prefix The prefix to add to the symbolic name.
    /// @return {@code prefix}, followed by {@code name}. If {@code name} starts with a lowercase
    /// character, it is substituted by the uppercase equivalent.
    /// @throws IllegalArgumentException If {@code name} is empty.
    public static String prependAPIName(String prefix, String name)
    {
        if (name.isEmpty())
        {
            throw new IllegalArgumentException("Cannot prepend prefix to blank string.");
        }

        return prefix + name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    /// Attempts to load a lookup from several options. This function is especially useful
    /// for libraries that come under several names for a single platform, like Vulkan.
    /// @param arena The arena to which the returned lookup will be associated with, if
    /// any is returned.
    /// @param options A list of options to load from, each taken in the order they appear.
    /// @return A [SymbolLookup] from the first option to succeed in the creation of one.
    /// @throws IllegalArgumentException If no option led to a successful lookup creation.
    public static SymbolLookup loadFirstLookup(Arena arena, List<? extends LibraryOption> options)
    {
        for (LibraryOption option : options)
        {
            try
            {
                return switch (option)
                {
                    case LibraryOption.FromName(String name) -> libraryLookup(name, arena);
                    case LibraryOption.FromPath(Path path) -> libraryLookup(path, arena);
                };
            }
            catch (IllegalArgumentException _) {}
        }

        throw new IllegalArgumentException("Could not load Vulkan with options: " + options);
    }
}
