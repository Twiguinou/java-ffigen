package vkgen;

import jpgen.SourceScopeScanner;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    private static List<FunctionType.Declaration> gatherInstanceFunctions(Collection<FunctionType.Declaration> functions)
    {
        return functions.stream()
                .filter(function -> function.argNames().length > 0 &&
                        (function.argNames()[0].equals("instance") || function.argNames()[0].equals("physicalDevice")))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static boolean isStandardFunction(FunctionType.Declaration function)
    {
        if (function.argNames().length > 0)
        {
            return Arrays.stream(function.innerType().argTypes()).noneMatch(type -> type instanceof TypeManifold.Pointer(RecordType pointee) && pointee.fields().length == 0);
        }

        return true;
    }

    public static void main(String... args)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process("C:\\VulkanSDK\\1.3.268.0\\Include\\vulkan\\vulkan_core.h", new String[] {
                    "-IC:\\VulkanSDK\\1.3.268.0\\Include"
            });

            CodeFactory factory = new CodeFactory(scanner);
            factory.run();
            /*File outputDirectory = new File(System.getProperty("user.dir"), "output/vulkan");
            if (outputDirectory.exists() || outputDirectory.mkdirs())
            {
                scanner.produceOutput(outputDirectory, "vulkan", "VulkanCore", "vulkan-1", declaration ->
                {
                    if (declaration instanceof FunctionType.Declaration function)
                    {
                        return isStandardFunction(function);
                    }
                    return true;
                });
            }*/
        }
    }
}
