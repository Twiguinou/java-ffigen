package fr.kenlek.jpgen;

/// Small utility class used to identify a specific platform.
/// The detection code was not tested for the most part.
public record Platform(Os os, Arch arch) implements Host
{
    public static final Platform CURRENT;

    public enum Os
    {
        LINUX,
        WINDOWS,
        OSX,
        UNKNOWN
    }

    public enum Arch
    {
        X64,
        AARCH_64,
        S390X,
        PPC_64,
        PPC_64_LE,
        RISCV_64,
        UNKNOWN
    }

    @Override
    public boolean isCurrent()
    {
        return this.equals(CURRENT);
    }

    static
    {
        Os os = Os.UNKNOWN;
        String rawOs = System.getProperty("os.name");
        if (rawOs.startsWith("Linux"))
        {
            os = Os.LINUX;
        }
        else if (rawOs.startsWith("Windows"))
        {
            os = Os.WINDOWS;
        }
        else if (rawOs.startsWith("Mac OS X"))
        {
            os = Os.OSX;
        }

        Arch arch = switch (System.getProperty("os.arch"))
        {
            case "amd64", "x86_64" -> Arch.X64;
            case "arm64", "aarch64" -> Arch.AARCH_64;
            case "ppc64" -> Arch.PPC_64;
            case "ppc64le" -> Arch.PPC_64_LE;
            case "riscv64" -> Arch.RISCV_64;
            case "s390x" -> Arch.S390X;
            default -> Arch.UNKNOWN;
        };

        CURRENT = new Platform(os, arch);
    }
}
