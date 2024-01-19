package vulkan;

public final class VkMemoryPropertyFlagBits
{private VkMemoryPropertyFlagBits() {}

    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 2;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 4;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 8;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 16;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 32;
    public static final int VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD = 64;
    public static final int VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD = 128;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 256;
    public static final int VK_MEMORY_PROPERTY_FLAG_BITS_MAX_ENUM = 2147483647;
}
