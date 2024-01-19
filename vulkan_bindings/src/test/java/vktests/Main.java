package vktests;

import vulkan.VkApplicationInfo;
import vulkan.VkDevice;
import vulkan.VkDeviceCreateInfo;
import vulkan.VkInstance;
import vulkan.VkInstanceCreateInfo;
import vulkan.VkPhysicalDevice;

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
            VkPhysicalDevice physicalDevice;
            {
                MemorySegment pCount = arena.allocate(ValueLayout.JAVA_INT);
                vkEnumeratePhysicalDevices(instance, pCount, NULL);
                int count = pCount.get(ValueLayout.JAVA_INT, 0);
                if (count > 0)
                {
                    MemorySegment pPhysicalDevices = arena.allocateArray(ValueLayout.ADDRESS, count);
                    vkEnumeratePhysicalDevices(instance, pCount, pPhysicalDevices);
                    physicalDevice = new VkPhysicalDevice(pPhysicalDevices.get(ValueLayout.ADDRESS, 0), instance);
                }
                else
                {
                    throw new RuntimeException();
                }
            }

            VkDeviceCreateInfo deviceCreateInfo = new VkDeviceCreateInfo(arena);
            deviceCreateInfo.sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
            deviceCreateInfo.pNext(NULL);
            deviceCreateInfo.flags(0);
            deviceCreateInfo.queueCreateInfoCount(0);
            deviceCreateInfo.pQueueCreateInfos(NULL);
            deviceCreateInfo.enabledLayerCount(0);
            deviceCreateInfo.ppEnabledLayerNames(NULL);
            deviceCreateInfo.enabledExtensionCount(0);
            deviceCreateInfo.ppEnabledExtensionNames(NULL);
            deviceCreateInfo.pEnabledFeatures(NULL);

            MemorySegment pDevice = arena.allocate(ValueLayout.ADDRESS);
            if (vkCreateDevice(physicalDevice, deviceCreateInfo.ptr(), NULL, pDevice) != VK_SUCCESS)
            {
                throw new RuntimeException();
            }

            VkDevice device = new VkDevice(pDevice.get(ValueLayout.ADDRESS, 0));

            System.out.println(device.handle);
            System.out.println(instance.handle);

            vkDestroyDevice(device, NULL);
            vkDestroyInstance(instance, NULL);
        }
    }
}
