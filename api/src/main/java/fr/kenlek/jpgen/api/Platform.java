package fr.kenlek.jpgen.api;

import java.nio.ByteOrder;

import static java.lang.foreign.ValueLayout.ADDRESS;

/// Specialized [Host] implementation for matching (Architecture, OS) configurations.
public record Platform(Architecture architecture, OS os) implements Host
{
    /// Some of the most popular operating system families.
    public enum OS implements Host
    {
        LINUX,
        WINDOWS("", "dll"),
        MACOS("dylib"),
        AIX,
        FREEBSD,
        NETBSD,
        OPENBSD,
        DRAGONFLY,
        UNKNOWN(null, null);

        public static final OS CURRENT;

        private final String m_libraryPrefix;
        private final String m_libraryExtension;

        OS(String libraryPrefix, String libraryExtension)
        {
            this.m_libraryPrefix = libraryPrefix;
            this.m_libraryExtension = libraryExtension;
        }

        OS(String libraryExtension)
        {
            this("lib", libraryExtension);
        }

        OS()
        {
            this("so");
        }

        public String libraryPrefix()
        {
            return this.m_libraryPrefix;
        }

        public String libraryExtension()
        {
            return this.m_libraryExtension;
        }

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }

        public String code()
        {
            return this.name().toLowerCase();
        }

        static
        {
            String kernel = System.getProperty("os.name");
            if (kernel.equals("Linux"))
            {
                CURRENT = LINUX;
            }
            else if (kernel.startsWith("Windows"))
            {
                CURRENT = WINDOWS;
            }
            // OpenJDK sets os.arch to "Mac OS X" but uname prints Darwin and macOS is Unix-based
            else if (kernel.equals("Mac OS X") || kernel.equals("Darwin"))
            {
                CURRENT = MACOS;
            }
            else if (kernel.equals("AIX"))
            {
                CURRENT = AIX;
            }
            else if (kernel.equals("FreeBSD"))
            {
                CURRENT = FREEBSD;
            }
            else if (kernel.equals("NetBSD"))
            {
                CURRENT = NETBSD;
            }
            else if (kernel.equals("OpenBSD"))
            {
                CURRENT = OPENBSD;
            }
            else if (kernel.equals("DragonFly"))
            {
                CURRENT = DRAGONFLY;
            }
            else
            {
                CURRENT = UNKNOWN;
            }
        }
    }

    /// A simple compatibility layer to represent the bitness of a host. Or in
    /// simpler words, the number of bits used to represent a memory address.
    public enum Bitness implements Host
    {
        _32,
        _64,
        UNKNOWN;

        public static final Bitness CURRENT = switch ((int) ADDRESS.byteSize())
        {
            case 4 -> _32;
            case 8 -> _64;
            default -> UNKNOWN;
        };

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }
    }

    /// Another compatibility layer for endianness, which specifies the order in
    /// which bytes are placed to represent all data types.
    /// This information is already provided by the [ByteOrder#nativeOrder] method.
    public enum Endianness implements Host
    {
        LITTLE_ENDIAN,
        BIG_ENDIAN,
        UNKNOWN;

        public static final Endianness CURRENT = switch (ByteOrder.nativeOrder().toString())
        {
            case "LITTLE_ENDIAN" -> LITTLE_ENDIAN;
            case "BIG_ENDIAN" -> BIG_ENDIAN;
            default -> UNKNOWN;
        };

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }
    }

    /// Some of the most popular processor architectures.
    public enum Architecture implements Host
    {
        /// Also known as amd64.
        X86_64(Bitness._64, Endianness.LITTLE_ENDIAN),
        X86(Bitness._32, Endianness.LITTLE_ENDIAN),
        /// For 64-bit versions of the ARM architecture family.
        AARCH64(Bitness._64, Endianness.LITTLE_ENDIAN),
        /// For 32-bit versions of the ARM architecture family.
        ARM(Bitness._32, Endianness.LITTLE_ENDIAN),
        LOONGARCH64(Bitness._64, Endianness.LITTLE_ENDIAN),
        MIPS64(Bitness._64, Endianness.BIG_ENDIAN),
        MIPS64EL(Bitness._64, Endianness.LITTLE_ENDIAN),
        MIPS(Bitness._32, Endianness.BIG_ENDIAN),
        MIPSEL(Bitness._32, Endianness.LITTLE_ENDIAN),
        POWERPC64(Bitness._64, Endianness.BIG_ENDIAN),
        POWERPC64LE(Bitness._64, Endianness.LITTLE_ENDIAN),
        POWERPC(Bitness._32, Endianness.BIG_ENDIAN),
        RISCV64(Bitness._64, Endianness.LITTLE_ENDIAN),
        RISCV32(Bitness._32, Endianness.LITTLE_ENDIAN),
        S390X(Bitness._64, Endianness.BIG_ENDIAN),
        S390(Bitness._32, Endianness.BIG_ENDIAN),
        UNKNOWN(Bitness.UNKNOWN, Endianness.UNKNOWN);

        public static final Architecture CURRENT = switch (System.getProperty("os.arch"))
        {
            case "x86_64", "amd64" -> X86_64;
            case "x86", "i386", "x32" -> X86;
            case "aarch64" -> AARCH64;
            case "arm" -> ARM;
            case "loongarch64" -> LOONGARCH64;
            case "mips64" -> MIPS64;
            case "mips64el" -> MIPS64EL;
            case "mips" -> MIPS;
            case "mipsel" -> MIPSEL;
            case "ppc64" -> POWERPC64;
            case "ppc64le" -> POWERPC64LE;
            case "ppc" -> POWERPC;
            case "riscv64" -> RISCV64;
            case "riscv32" -> RISCV32;
            case "s390x" -> S390X;
            case "s390" -> S390;
            default -> UNKNOWN;
        };

        private final Bitness m_bitness;
        private final Endianness m_endianness;

        Architecture(Bitness bitness, Endianness endianness)
        {
            this.m_bitness = bitness;
            this.m_endianness = endianness;
        }

        public Bitness bitness()
        {
            return this.m_bitness;
        }

        public Endianness endianness()
        {
            return this.m_endianness;
        }

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }

        public String code()
        {
            return this.name().toLowerCase();
        }
    }

    /// The platform in which the JVM is currently running.
    public static final Platform CURRENT = new Platform(Architecture.CURRENT, OS.CURRENT);

    @Override
    public boolean isCurrent()
    {
        return this.equals(CURRENT);
    }

    public String code()
    {
        return this.architecture().code() + "-" + this.os().code();
    }
}
