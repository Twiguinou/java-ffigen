package jpgen;

import java.io.File;
import java.io.IOException;

public class LibraryLoader
{
    enum OsType
    {
        OSX,
        LINUX,
        WINDOWS
    }

    private static final OsType gOsType;
    private static final boolean gArch64;

    public interface FileProvider
    {
    }

    public static void load() throws IOException
    {
        File extractFolder = new File(System.getProperty("java.io.tmpdir"), "jpgen.extracted-libs");
        if ((extractFolder.exists() && !extractFolder.isDirectory()) || (!extractFolder.exists() && !extractFolder.mkdirs()))
        {
            throw new RuntimeException("Failed to create library extraction directories.");
        }
    }

    static
    {
        final String os_name = System.getProperty("os.name").toLowerCase();
        if (os_name.contains("mac") || os_name.contains("darwin") || os_name.contains("osx")) gOsType = OsType.OSX;
        else if (os_name.contains("linux")) gOsType = OsType.LINUX;
        else if (os_name.contains("windows")) gOsType = OsType.WINDOWS;
        else throw new RuntimeException("Could not resolve system type");

        final String os_arch = System.getProperty("os.arch");
        gArch64 = os_arch.contains("64") || os_arch.contains("armv8");
    }
}
