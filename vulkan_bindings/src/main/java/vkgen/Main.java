package vkgen;

import jpgen.ProgramArguments;
import jpgen.SourceScopeScanner;

import java.io.File;
import java.util.function.Function;

public class Main
{
    private static final String DIRECTORY = "vulkan";
    private static final String PACKAGE = DIRECTORY.replaceAll("/", ".");

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0, File::new)
                .map(dir -> new File(dir, PACKAGE))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        String vulkanSdkInclude = arguments.getArgValueIndexed("vulkan_include", 0, Function.identity())
                .orElseThrow(() -> new IllegalStateException("Missing vulkan_include argument."));

        SourceScopeScanner.configureLog4j();
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{vulkanSdkInclude}/vulkan/vulkan_core.h", new String[] {
                    STR."-I\{vulkanSdkInclude}"
            });

            CodeFactory factory = new CodeFactory(scanner, "vulkan", "vulkan-1");
            factory.run(outputDirectory);
        }
    }
}
