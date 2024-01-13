package vkgen;

import jpgen.SourceScopeScanner;
import jpgen.data.TypeManifold;

import java.util.Map;
import java.util.stream.Collectors;

public class CodeFactory
{
    private final Map<String, TypeManifold> m_handleTypes;

    public CodeFactory(SourceScopeScanner scanner)
    {
        this.m_handleTypes = scanner.getTypes().stream()
                .filter(type -> type instanceof TypeManifold.Typedef(String alias, _) && switch (alias)
                {
                    case "VkBuffer", "VkImage", "VkInstance", "VkPhysicalDevice", "VkDevice", "VkQueue",
                            "VkSemaphore", "VkCommandBuffer", "VkFence", "VkDeviceMemory", "VkEvent", "VkQueryPool",
                            "VkBufferView", "VkImageView", "VkShaderModule", "VkPipelineCache", "VkPipelineLayout",
                            "VkPipeline", "VkRenderPass", "VkDescriptorSetLayout", "VkSampler", "VkDescriptorSet",
                            "VkDescriptorPool", "VkFramebuffer", "VkCommandPool"
                            -> true;
                    default -> false;
                })
                .map(type -> (TypeManifold.Typedef) type)
                .collect(Collectors.toMap(TypeManifold.Typedef::alias, TypeManifold.Typedef::underlying));
    }

    public void run()
    {
        System.out.println(this.m_handleTypes.size());
    }
}
