package vulkan;

public final class VulkanCore
{private VulkanCore() {}

	public static final java.lang.foreign.Linker gSystemLinker;
	public static final java.lang.foreign.SymbolLookup gLibLookup;

	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkCreateInstance;
	public static final java.lang.invoke.MethodHandle MTD$vkCreateInstance;
	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkGetInstanceProcAddr;
	public static final java.lang.invoke.MethodHandle MTD$vkGetInstanceProcAddr;
	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkGetDeviceProcAddr;
	public static final java.lang.invoke.MethodHandle MTD$vkGetDeviceProcAddr;
	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkEnumerateInstanceExtensionProperties;
	public static final java.lang.invoke.MethodHandle MTD$vkEnumerateInstanceExtensionProperties;
	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkEnumerateInstanceLayerProperties;
	public static final java.lang.invoke.MethodHandle MTD$vkEnumerateInstanceLayerProperties;
	public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vkEnumerateInstanceVersion;
	public static final java.lang.invoke.MethodHandle MTD$vkEnumerateInstanceVersion;

	public static int vkCreateInstance(java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pInstance)
	{
		try {return (int)MTD$vkCreateInstance.invokeExact(pCreateInfo, pAllocator, pInstance);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static java.lang.foreign.MemorySegment vkGetInstanceProcAddr(java.lang.foreign.MemorySegment instance, java.lang.foreign.MemorySegment pName)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$vkGetInstanceProcAddr.invokeExact(instance, pName);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static java.lang.foreign.MemorySegment vkGetDeviceProcAddr(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pName)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$vkGetDeviceProcAddr.invokeExact(device, pName);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumerateInstanceExtensionProperties(java.lang.foreign.MemorySegment pLayerName, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)MTD$vkEnumerateInstanceExtensionProperties.invokeExact(pLayerName, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumerateInstanceLayerProperties(java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)MTD$vkEnumerateInstanceLayerProperties.invokeExact(pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumerateInstanceVersion(java.lang.foreign.MemorySegment pApiVersion)
	{
		try {return (int)MTD$vkEnumerateInstanceVersion.invokeExact(pApiVersion);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkDestroyInstance(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pAllocator)
	{
		try {instance.funcHandle__vkDestroyInstance.invokeExact(instance.handle(), pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumeratePhysicalDevices(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pPhysicalDeviceCount, java.lang.foreign.MemorySegment pPhysicalDevices)
	{
		try {return (int)instance.funcHandle__vkEnumeratePhysicalDevices.invokeExact(instance.handle(), pPhysicalDeviceCount, pPhysicalDevices);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFeatures(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFeatures)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFeatures.invokeExact(physicalDevice.handle(), pFeatures);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFormatProperties(vulkan.VkPhysicalDevice physicalDevice, int format, java.lang.foreign.MemorySegment pFormatProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFormatProperties.invokeExact(physicalDevice.handle(), format, pFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceImageFormatProperties(vulkan.VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, java.lang.foreign.MemorySegment pImageFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceImageFormatProperties.invokeExact(physicalDevice.handle(), format, type, tiling, usage, flags, pImageFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceProperties.invokeExact(physicalDevice.handle(), pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceQueueFamilyProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pQueueFamilyPropertyCount, java.lang.foreign.MemorySegment pQueueFamilyProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(physicalDevice.handle(), pQueueFamilyPropertyCount, pQueueFamilyProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceMemoryProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pMemoryProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceMemoryProperties.invokeExact(physicalDevice.handle(), pMemoryProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateDevice(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pDevice)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkCreateDevice.invokeExact(physicalDevice.handle(), pCreateInfo, pAllocator, pDevice);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumerateDeviceExtensionProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pLayerName, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkEnumerateDeviceExtensionProperties.invokeExact(physicalDevice.handle(), pLayerName, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumerateDeviceLayerProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkEnumerateDeviceLayerProperties.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceSparseImageFormatProperties(vulkan.VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(physicalDevice.handle(), format, type, samples, usage, tiling, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumeratePhysicalDeviceGroups(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pPhysicalDeviceGroupCount, java.lang.foreign.MemorySegment pPhysicalDeviceGroupProperties)
	{
		try {return (int)instance.funcHandle__vkEnumeratePhysicalDeviceGroups.invokeExact(instance.handle(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFeatures2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFeatures)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFeatures2.invokeExact(physicalDevice.handle(), pFeatures);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceProperties2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceProperties2.invokeExact(physicalDevice.handle(), pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFormatProperties2(vulkan.VkPhysicalDevice physicalDevice, int format, java.lang.foreign.MemorySegment pFormatProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFormatProperties2.invokeExact(physicalDevice.handle(), format, pFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceImageFormatProperties2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pImageFormatInfo, java.lang.foreign.MemorySegment pImageFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceImageFormatProperties2.invokeExact(physicalDevice.handle(), pImageFormatInfo, pImageFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceQueueFamilyProperties2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pQueueFamilyPropertyCount, java.lang.foreign.MemorySegment pQueueFamilyProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceQueueFamilyProperties2.invokeExact(physicalDevice.handle(), pQueueFamilyPropertyCount, pQueueFamilyProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceMemoryProperties2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pMemoryProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceMemoryProperties2.invokeExact(physicalDevice.handle(), pMemoryProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceSparseImageFormatProperties2(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFormatInfo, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSparseImageFormatProperties2.invokeExact(physicalDevice.handle(), pFormatInfo, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalBufferProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalBufferInfo, java.lang.foreign.MemorySegment pExternalBufferProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalBufferProperties.invokeExact(physicalDevice.handle(), pExternalBufferInfo, pExternalBufferProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalFenceProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalFenceInfo, java.lang.foreign.MemorySegment pExternalFenceProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalFenceProperties.invokeExact(physicalDevice.handle(), pExternalFenceInfo, pExternalFenceProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalSemaphoreProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalSemaphoreInfo, java.lang.foreign.MemorySegment pExternalSemaphoreProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalSemaphoreProperties.invokeExact(physicalDevice.handle(), pExternalSemaphoreInfo, pExternalSemaphoreProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceToolProperties(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pToolCount, java.lang.foreign.MemorySegment pToolProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceToolProperties.invokeExact(physicalDevice.handle(), pToolCount, pToolProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkDestroySurfaceKHR(vulkan.VkInstance instance, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pAllocator)
	{
		try {instance.funcHandle__vkDestroySurfaceKHR.invokeExact(instance.handle(), surface, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceSupportKHR(vulkan.VkPhysicalDevice physicalDevice, int queueFamilyIndex, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pSupported)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceSupportKHR.invokeExact(physicalDevice.handle(), queueFamilyIndex, surface, pSupported);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pSurfaceCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invokeExact(physicalDevice.handle(), surface, pSurfaceCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceFormatsKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pSurfaceFormatCount, java.lang.foreign.MemorySegment pSurfaceFormats)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceFormatsKHR.invokeExact(physicalDevice.handle(), surface, pSurfaceFormatCount, pSurfaceFormats);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfacePresentModesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pPresentModeCount, java.lang.foreign.MemorySegment pPresentModes)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfacePresentModesKHR.invokeExact(physicalDevice.handle(), surface, pPresentModeCount, pPresentModes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDevicePresentRectanglesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pRectCount, java.lang.foreign.MemorySegment pRects)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(physicalDevice.handle(), surface, pRectCount, pRects);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceDisplayPropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDisplayPlaneSupportedDisplaysKHR(vulkan.VkPhysicalDevice physicalDevice, int planeIndex, java.lang.foreign.MemorySegment pDisplayCount, java.lang.foreign.MemorySegment pDisplays)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(physicalDevice.handle(), planeIndex, pDisplayCount, pDisplays);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDisplayModePropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDisplayModePropertiesKHR.invokeExact(physicalDevice.handle(), display, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateDisplayModeKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pMode)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkCreateDisplayModeKHR.invokeExact(physicalDevice.handle(), display, pCreateInfo, pAllocator, pMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDisplayPlaneCapabilitiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment mode, int planeIndex, java.lang.foreign.MemorySegment pCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDisplayPlaneCapabilitiesKHR.invokeExact(physicalDevice.handle(), mode, planeIndex, pCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateDisplayPlaneSurfaceKHR(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSurface)
	{
		try {return (int)instance.funcHandle__vkCreateDisplayPlaneSurfaceKHR.invokeExact(instance.handle(), pCreateInfo, pAllocator, pSurface);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pVideoProfile, java.lang.foreign.MemorySegment pCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceVideoCapabilitiesKHR.invokeExact(physicalDevice.handle(), pVideoProfile, pCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pVideoFormatInfo, java.lang.foreign.MemorySegment pVideoFormatPropertyCount, java.lang.foreign.MemorySegment pVideoFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceVideoFormatPropertiesKHR.invokeExact(physicalDevice.handle(), pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFeatures2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFeatures)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFeatures2KHR.invokeExact(physicalDevice.handle(), pFeatures);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceProperties2KHR.invokeExact(physicalDevice.handle(), pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceFormatProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, int format, java.lang.foreign.MemorySegment pFormatProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFormatProperties2KHR.invokeExact(physicalDevice.handle(), format, pFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceImageFormatProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pImageFormatInfo, java.lang.foreign.MemorySegment pImageFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceImageFormatProperties2KHR.invokeExact(physicalDevice.handle(), pImageFormatInfo, pImageFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pQueueFamilyPropertyCount, java.lang.foreign.MemorySegment pQueueFamilyProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceQueueFamilyProperties2KHR.invokeExact(physicalDevice.handle(), pQueueFamilyPropertyCount, pQueueFamilyProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceMemoryProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pMemoryProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceMemoryProperties2KHR.invokeExact(physicalDevice.handle(), pMemoryProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFormatInfo, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSparseImageFormatProperties2KHR.invokeExact(physicalDevice.handle(), pFormatInfo, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumeratePhysicalDeviceGroupsKHR(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pPhysicalDeviceGroupCount, java.lang.foreign.MemorySegment pPhysicalDeviceGroupProperties)
	{
		try {return (int)instance.funcHandle__vkEnumeratePhysicalDeviceGroupsKHR.invokeExact(instance.handle(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalBufferPropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalBufferInfo, java.lang.foreign.MemorySegment pExternalBufferProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalBufferPropertiesKHR.invokeExact(physicalDevice.handle(), pExternalBufferInfo, pExternalBufferProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalSemaphoreInfo, java.lang.foreign.MemorySegment pExternalSemaphoreProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalSemaphorePropertiesKHR.invokeExact(physicalDevice.handle(), pExternalSemaphoreInfo, pExternalSemaphoreProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pExternalFenceInfo, java.lang.foreign.MemorySegment pExternalFenceProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalFencePropertiesKHR.invokeExact(physicalDevice.handle(), pExternalFenceInfo, pExternalFenceProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(vulkan.VkPhysicalDevice physicalDevice, int queueFamilyIndex, java.lang.foreign.MemorySegment pCounterCount, java.lang.foreign.MemorySegment pCounters, java.lang.foreign.MemorySegment pCounterDescriptions)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR.invokeExact(physicalDevice.handle(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPerformanceQueryCreateInfo, java.lang.foreign.MemorySegment pNumPasses)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR.invokeExact(physicalDevice.handle(), pPerformanceQueryCreateInfo, pNumPasses);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pSurfaceInfo, java.lang.foreign.MemorySegment pSurfaceCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceCapabilities2KHR.invokeExact(physicalDevice.handle(), pSurfaceInfo, pSurfaceCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceFormats2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pSurfaceInfo, java.lang.foreign.MemorySegment pSurfaceFormatCount, java.lang.foreign.MemorySegment pSurfaceFormats)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceFormats2KHR.invokeExact(physicalDevice.handle(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceDisplayProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceDisplayProperties2KHR.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDisplayModeProperties2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDisplayModeProperties2KHR.invokeExact(physicalDevice.handle(), display, pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDisplayPlaneCapabilities2KHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pDisplayPlaneInfo, java.lang.foreign.MemorySegment pCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDisplayPlaneCapabilities2KHR.invokeExact(physicalDevice.handle(), pDisplayPlaneInfo, pCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pFragmentShadingRateCount, java.lang.foreign.MemorySegment pFragmentShadingRates)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceFragmentShadingRatesKHR.invokeExact(physicalDevice.handle(), pFragmentShadingRateCount, pFragmentShadingRates);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateDebugReportCallbackEXT(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pCallback)
	{
		try {return (int)instance.funcHandle__vkCreateDebugReportCallbackEXT.invokeExact(instance.handle(), pCreateInfo, pAllocator, pCallback);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkDestroyDebugReportCallbackEXT(vulkan.VkInstance instance, java.lang.foreign.MemorySegment callback, java.lang.foreign.MemorySegment pAllocator)
	{
		try {instance.funcHandle__vkDestroyDebugReportCallbackEXT.invokeExact(instance.handle(), callback, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkDebugReportMessageEXT(vulkan.VkInstance instance, int flags, int objectType, long object, long location, int messageCode, java.lang.foreign.MemorySegment pLayerPrefix, java.lang.foreign.MemorySegment pMessage)
	{
		try {instance.funcHandle__vkDebugReportMessageEXT.invokeExact(instance.handle(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(vulkan.VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, java.lang.foreign.MemorySegment pExternalImageFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceExternalImageFormatPropertiesNV.invokeExact(physicalDevice.handle(), format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkReleaseDisplayEXT(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment display)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkReleaseDisplayEXT.invokeExact(physicalDevice.handle(), display);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pSurfaceCapabilities)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(physicalDevice.handle(), surface, pSurfaceCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateDebugUtilsMessengerEXT(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pMessenger)
	{
		try {return (int)instance.funcHandle__vkCreateDebugUtilsMessengerEXT.invokeExact(instance.handle(), pCreateInfo, pAllocator, pMessenger);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkDestroyDebugUtilsMessengerEXT(vulkan.VkInstance instance, java.lang.foreign.MemorySegment messenger, java.lang.foreign.MemorySegment pAllocator)
	{
		try {instance.funcHandle__vkDestroyDebugUtilsMessengerEXT.invokeExact(instance.handle(), messenger, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkSubmitDebugUtilsMessageEXT(vulkan.VkInstance instance, int messageSeverity, int messageTypes, java.lang.foreign.MemorySegment pCallbackData)
	{
		try {instance.funcHandle__vkSubmitDebugUtilsMessageEXT.invokeExact(instance.handle(), messageSeverity, messageTypes, pCallbackData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(vulkan.VkPhysicalDevice physicalDevice, int samples, java.lang.foreign.MemorySegment pMultisampleProperties)
	{
		try {physicalDevice.instance().funcHandle__vkGetPhysicalDeviceMultisamplePropertiesEXT.invokeExact(physicalDevice.handle(), samples, pMultisampleProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pTimeDomainCount, java.lang.foreign.MemorySegment pTimeDomains)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceCalibrateableTimeDomainsEXT.invokeExact(physicalDevice.handle(), pTimeDomainCount, pTimeDomains);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceToolPropertiesEXT(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pToolCount, java.lang.foreign.MemorySegment pToolProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceToolPropertiesEXT.invokeExact(physicalDevice.handle(), pToolCount, pToolProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pPropertyCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.invokeExact(physicalDevice.handle(), pPropertyCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pCombinationCount, java.lang.foreign.MemorySegment pCombinations)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invokeExact(physicalDevice.handle(), pCombinationCount, pCombinations);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkCreateHeadlessSurfaceEXT(vulkan.VkInstance instance, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSurface)
	{
		try {return (int)instance.funcHandle__vkCreateHeadlessSurfaceEXT.invokeExact(instance.handle(), pCreateInfo, pAllocator, pSurface);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkAcquireDrmDisplayEXT(vulkan.VkPhysicalDevice physicalDevice, int drmFd, java.lang.foreign.MemorySegment display)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkAcquireDrmDisplayEXT.invokeExact(physicalDevice.handle(), drmFd, display);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetDrmDisplayEXT(vulkan.VkPhysicalDevice physicalDevice, int drmFd, int connectorId, java.lang.foreign.MemorySegment display)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetDrmDisplayEXT.invokeExact(physicalDevice.handle(), drmFd, connectorId, display);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(vulkan.VkPhysicalDevice physicalDevice, java.lang.foreign.MemorySegment pOpticalFlowImageFormatInfo, java.lang.foreign.MemorySegment pFormatCount, java.lang.foreign.MemorySegment pImageFormatProperties)
	{
		try {return (int)physicalDevice.instance().funcHandle__vkGetPhysicalDeviceOpticalFlowImageFormatsNV.invokeExact(physicalDevice.handle(), pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}
	static
	{
		java.lang.System.loadLibrary("vulkan-1");
		gSystemLinker = java.lang.foreign.Linker.nativeLinker();
		gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

		MTD_ADDRESS$vkCreateInstance = gLibLookup.find("vkCreateInstance").orElseThrow();
		MTD$vkCreateInstance = gSystemLinker.downcallHandle(MTD_ADDRESS$vkCreateInstance, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD_ADDRESS$vkGetInstanceProcAddr = gLibLookup.find("vkGetInstanceProcAddr").orElseThrow();
		MTD$vkGetInstanceProcAddr = gSystemLinker.downcallHandle(MTD_ADDRESS$vkGetInstanceProcAddr, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD_ADDRESS$vkGetDeviceProcAddr = gLibLookup.find("vkGetDeviceProcAddr").orElseThrow();
		MTD$vkGetDeviceProcAddr = gSystemLinker.downcallHandle(MTD_ADDRESS$vkGetDeviceProcAddr, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD_ADDRESS$vkEnumerateInstanceExtensionProperties = gLibLookup.find("vkEnumerateInstanceExtensionProperties").orElseThrow();
		MTD$vkEnumerateInstanceExtensionProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vkEnumerateInstanceExtensionProperties, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD_ADDRESS$vkEnumerateInstanceLayerProperties = gLibLookup.find("vkEnumerateInstanceLayerProperties").orElseThrow();
		MTD$vkEnumerateInstanceLayerProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vkEnumerateInstanceLayerProperties, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD_ADDRESS$vkEnumerateInstanceVersion = gLibLookup.find("vkEnumerateInstanceVersion").orElseThrow();
		MTD$vkEnumerateInstanceVersion = gSystemLinker.downcallHandle(MTD_ADDRESS$vkEnumerateInstanceVersion, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
	}
}
