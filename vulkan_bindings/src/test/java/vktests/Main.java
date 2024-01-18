package vktests;

import vulkan.VkApplicationInfo;
import vulkan.VkInstance;
import vulkan.VkInstanceCreateInfo;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkResult.*;
import static java.lang.foreign.MemorySegment.NULL;

public class Main
{
    public static void main(String... args)
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkApplicationInfo applicationInfo = new VkApplicationInfo(arena);
            applicationInfo.sType(VK_STRUCTURE_TYPE_APPLICATION_INFO);
            applicationInfo.pNext(NULL);
            applicationInfo.pApplicationName(arena.allocateUtf8String("test"));
            applicationInfo.applicationVersion(0);
            applicationInfo.pEngineName(arena.allocateUtf8String("test"));
            applicationInfo.engineVersion(0);
            applicationInfo.apiVersion(4194304);

            VkInstanceCreateInfo instanceCreateInfo = new VkInstanceCreateInfo(arena);
            instanceCreateInfo.sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
            instanceCreateInfo.flags(0);
            instanceCreateInfo.pApplicationInfo(applicationInfo.ptr());
            instanceCreateInfo.enabledLayerCount(0);
            instanceCreateInfo.ppEnabledLayerNames(NULL);
            instanceCreateInfo.enabledExtensionCount(0);
            instanceCreateInfo.ppEnabledExtensionNames(NULL);

            MemorySegment pInstance = arena.allocate(ValueLayout.ADDRESS);
            if (vkCreateInstance(instanceCreateInfo.ptr(), NULL, pInstance) != VK_SUCCESS)
            {
                throw new RuntimeException();
            }

            VkInstance instance = new VkInstance(pInstance.get(ValueLayout.ADDRESS, 0));
            System.out.println(instance.handle);
            vkDestroyInstance(instance, NULL);
        }
    }
}
