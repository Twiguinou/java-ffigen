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
    public static long alignDownwards(long address, long alignment)
    {
        return address & (~getAlignmentMask(alignment));
    }

    /// Aligns an address to the nearest upper multiple of some alignment.
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

    public static String stripAPIName(String name, String prefix)
    {
        if (!name.startsWith(prefix) || name.equals(prefix))
        {
            throw new IllegalArgumentException("%s cannot be stripped of the %s prefix.".formatted(name, prefix));
        }

        int beginIndex = prefix.length() + 1;
        return name.substring(prefix.length(), beginIndex).toLowerCase() + name.substring(beginIndex);
    }

    public static String prependAPIName(String prefix, String name)
    {
        if (name.isEmpty())
        {
            throw new IllegalArgumentException("Cannot prepend prefix to blank string.");
        }

        return prefix + name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
