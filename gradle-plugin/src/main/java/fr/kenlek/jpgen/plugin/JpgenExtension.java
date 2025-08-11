package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.clang.LibClang;
import javax.inject.Inject;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.process.ExecOperations;
import org.jspecify.annotations.NonNull;

import java.io.ByteArrayOutputStream;
import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.foreign.SymbolLookup.libraryLookup;

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
            if (!Platform.OS.WINDOWS.isCurrent() || !Files.exists(vsWhere))
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

        this.getLibClangMSVC().convention(this.getVisualStudio().map(path -> switch (Platform.Architecture.CURRENT)
        {
            case X86_64 -> path.resolve("VC/Tools/Llvm/x64/bin/libclang.dll");
            case X86 -> path.resolve("VC/Tools/Llvm/bin/libclang.dll");
            case AARCH64 -> path.resolve("VC/Tools/Llvm/ARM64/bin/libclang.dll");
            default -> null;
        }).map(path -> LibClang.load(libraryLookup(path, Arena.ofAuto()), SYSTEM_LINKER)));
    }

    public abstract Property<@NonNull Path> getVisualStudio();

    public abstract Property<@NonNull LibClang> getLibClangMSVC();

    public abstract Property<@NonNull LibClang> getLibClang();
}
