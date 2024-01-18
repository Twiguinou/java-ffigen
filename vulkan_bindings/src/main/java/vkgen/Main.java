package vkgen;

import jpgen.SourceScopeScanner;

import java.io.File;

public class Main
{
    public static void main(String... args)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process("C:\\VulkanSDK\\1.3.268.0\\Include\\vulkan\\vulkan_core.h", new String[] {
                    "-IC:\\VulkanSDK\\1.3.268.0\\Include"
            });

            CodeFactory factory = new CodeFactory(scanner, "vulkan", "vulkan-1");
            factory.run(new File(System.getProperty("user.dir"), "vulkan_bindings/src/test/java/vulkan"));
        }
    }
}
