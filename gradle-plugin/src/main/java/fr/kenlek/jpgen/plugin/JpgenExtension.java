package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.clang.LibClang;
import javax.inject.Inject;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.internal.os.OperatingSystem;
import org.gradle.process.ExecOperations;

import java.io.ByteArrayOutputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.SymbolLookup;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.util.Objects.requireNonNull;

public abstract class JpgenExtension
{
    public static final String NAME = "jpgen";

    @Inject
    public JpgenExtension(ProviderFactory providers, ExecOperations execOperations)
    {
        // From Windows 8 and beyond, the strategy I use is to seek the latest Visual Studio installation
        // and grab CMake from there. However this works only if the user has installed CMake from Visual Studio
        // along with MSVC and the standard libraries.
        // UPDATE: LLVM is resolved this way too now.
        this.getVisualStudio().convention(providers.environmentVariable("ProgramFiles(x86)").map(programFiles ->
        {
            Path vsWhere = Path.of(programFiles).resolve("Microsoft Visual Studio/Installer/vswhere.exe");
            if (!OperatingSystem.current().isWindows() || !Files.exists(vsWhere))
            {
                return null;
            }

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            execOperations.exec(exec ->
            {
                exec.executable(vsWhere);
                exec.args("-latest", "-property", "installationPath");
                exec.setStandardOutput(output);
            });

            return output.toString().lines()
                .filter(Predicate.not(String::isBlank))
                .findFirst()
                .map(Path::of)
                .orElse(null);
        }));

        this.getCMakeMSVC().convention(this.getVisualStudio().map(path ->
        {
            Path executable = path.resolve("Common7/IDE/CommonExtensions/Microsoft/CMake/CMake/bin/cmake.exe");
            return Files.exists(executable) ? executable : null;
        }));
        this.getCMake().convention(this.getCMakeMSVC().map(Path::toString).orElse("cmake"));

        this.getLibClangMSVC().convention(this.getVisualStudio().map(path ->
        {
            String arch = requireNonNull(System.getProperty("os.arch"));
            if (arch.startsWith("arm") || arch.startsWith("aarch"))
            {
                return path.resolve("VC/Tools/Llvm/ARM64/bin/libclang.dll");
            }

            if (arch.equals("i386"))
            {
                return path.resolve("VC/Tools/Llvm/bin/libclang.dll");
            }

            return path.resolve("VC/Tools/Llvm/x64/bin/libclang.dll");
        }).map(path -> LibClang.load(SymbolLookup.libraryLookup(path, Arena.global()), SYSTEM_LINKER)));
        this.getLibClang().convention(this.getLibClangMSVC().orElse(providers.provider(LibClang::load)));
    }

    public abstract Property<Path> getVisualStudio();

    public abstract Property<Path> getCMakeMSVC();

    public abstract Property<String> getCMake();

    public abstract Property<LibClang> getLibClangMSVC();

    public abstract Property<LibClang> getLibClang();
}
