package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.clang.LibClang;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.lang.foreign.Arena;
import java.nio.file.Path;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;
import static java.lang.foreign.SymbolLookup.libraryLookup;

public class JpgenPlugin implements Plugin<Project>
{
    @Override
    public void apply(Project project)
    {
        JpgenExtension extension = project.getExtensions().create(JpgenExtension.NAME, JpgenExtension.class);
        extension.getCMake().convention(project.provider(() -> (String) project.findProperty("jpgen.cmake.path"))
            .orElse(extension.getCMakeMSVC().map(Path::toString).orElse("cmake"))
        );
        extension.getLibClang().convention(project.provider(() -> (String) project.findProperty("jpgen.clang.path"))
            .map(path -> LibClang.load(libraryLookup(Path.of(path), Arena.global()), SYSTEM_LINKER))
            .orElse(extension.getLibClangMSVC())
            .orElse(project.provider(LibClang::load))
        );
    }
}
