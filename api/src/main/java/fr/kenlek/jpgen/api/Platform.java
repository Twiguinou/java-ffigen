package fr.kenlek.jpgen.api;

public record Platform(OS os, Arch arch) implements Host
{
    public enum OS implements Host
    {
        LINUX,
        WINDOWS,
        OSX,
        UNKNOWN;

        public static final OS CURRENT;

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }

        static
        {
            String rawOs = System.getProperty("os.name");
            if (rawOs.startsWith("Linux"))
            {
                CURRENT = LINUX;
            }
            else if (rawOs.startsWith("Windows"))
            {
                CURRENT = WINDOWS;
            }
            else if (rawOs.startsWith("Mac OS X"))
            {
                CURRENT = OSX;
            }
            else
            {
                CURRENT = UNKNOWN;
            }
        }
    }

    public enum Arch implements Host
    {
        UNKNOWN;

        public static final Arch CURRENT;

        @Override
        public boolean isCurrent()
        {
            return this == CURRENT;
        }

        static
        {
            CURRENT = UNKNOWN;
        }
    }

    public static final Platform CURRENT = new Platform(OS.CURRENT, Arch.CURRENT);

    @Override
    public boolean isCurrent()
    {
        return this.equals(CURRENT);
    }
}
