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

	public static void vkDestroyDevice(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDevice.invokeExact(device.handle(), pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceQueue(vulkan.VkDevice device, int queueFamilyIndex, int queueIndex, java.lang.foreign.MemorySegment pQueue)
	{
		try {device.funcHandle__vkGetDeviceQueue.invokeExact(device.handle(), queueFamilyIndex, queueIndex, pQueue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueSubmit(vulkan.VkQueue queue, int submitCount, java.lang.foreign.MemorySegment pSubmits, java.lang.foreign.MemorySegment fence)
	{
		try {return (int)queue.device().funcHandle__vkQueueSubmit.invokeExact(queue.handle(), submitCount, pSubmits, fence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueWaitIdle(vulkan.VkQueue queue)
	{
		try {return (int)queue.device().funcHandle__vkQueueWaitIdle.invokeExact(queue.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkDeviceWaitIdle(vulkan.VkDevice device)
	{
		try {return (int)device.funcHandle__vkDeviceWaitIdle.invokeExact(device.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAllocateMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAllocateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pMemory)
	{
		try {return (int)device.funcHandle__vkAllocateMemory.invokeExact(device.handle(), pAllocateInfo, pAllocator, pMemory);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkFreeMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment memory, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkFreeMemory.invokeExact(device.handle(), memory, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkMapMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment memory, long offset, long size, int flags, java.lang.foreign.MemorySegment ppData)
	{
		try {return (int)device.funcHandle__vkMapMemory.invokeExact(device.handle(), memory, offset, size, flags, ppData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkUnmapMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment memory)
	{
		try {device.funcHandle__vkUnmapMemory.invokeExact(device.handle(), memory);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkFlushMappedMemoryRanges(vulkan.VkDevice device, int memoryRangeCount, java.lang.foreign.MemorySegment pMemoryRanges)
	{
		try {return (int)device.funcHandle__vkFlushMappedMemoryRanges.invokeExact(device.handle(), memoryRangeCount, pMemoryRanges);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkInvalidateMappedMemoryRanges(vulkan.VkDevice device, int memoryRangeCount, java.lang.foreign.MemorySegment pMemoryRanges)
	{
		try {return (int)device.funcHandle__vkInvalidateMappedMemoryRanges.invokeExact(device.handle(), memoryRangeCount, pMemoryRanges);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceMemoryCommitment(vulkan.VkDevice device, java.lang.foreign.MemorySegment memory, java.lang.foreign.MemorySegment pCommittedMemoryInBytes)
	{
		try {device.funcHandle__vkGetDeviceMemoryCommitment.invokeExact(device.handle(), memory, pCommittedMemoryInBytes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindBufferMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment memory, long memoryOffset)
	{
		try {return (int)device.funcHandle__vkBindBufferMemory.invokeExact(device.handle(), buffer, memory, memoryOffset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindImageMemory(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment memory, long memoryOffset)
	{
		try {return (int)device.funcHandle__vkBindImageMemory.invokeExact(device.handle(), image, memory, memoryOffset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetBufferMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetBufferMemoryRequirements.invokeExact(device.handle(), buffer, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageMemoryRequirements.invokeExact(device.handle(), image, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSparseMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageSparseMemoryRequirements.invokeExact(device.handle(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueBindSparse(vulkan.VkQueue queue, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfo, java.lang.foreign.MemorySegment fence)
	{
		try {return (int)queue.device().funcHandle__vkQueueBindSparse.invokeExact(queue.handle(), bindInfoCount, pBindInfo, fence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateFence(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFence)
	{
		try {return (int)device.funcHandle__vkCreateFence.invokeExact(device.handle(), pCreateInfo, pAllocator, pFence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyFence(vulkan.VkDevice device, java.lang.foreign.MemorySegment fence, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyFence.invokeExact(device.handle(), fence, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkResetFences(vulkan.VkDevice device, int fenceCount, java.lang.foreign.MemorySegment pFences)
	{
		try {return (int)device.funcHandle__vkResetFences.invokeExact(device.handle(), fenceCount, pFences);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetFenceStatus(vulkan.VkDevice device, java.lang.foreign.MemorySegment fence)
	{
		try {return (int)device.funcHandle__vkGetFenceStatus.invokeExact(device.handle(), fence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWaitForFences(vulkan.VkDevice device, int fenceCount, java.lang.foreign.MemorySegment pFences, int waitAll, long timeout)
	{
		try {return (int)device.funcHandle__vkWaitForFences.invokeExact(device.handle(), fenceCount, pFences, waitAll, timeout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSemaphore(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSemaphore)
	{
		try {return (int)device.funcHandle__vkCreateSemaphore.invokeExact(device.handle(), pCreateInfo, pAllocator, pSemaphore);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroySemaphore(vulkan.VkDevice device, java.lang.foreign.MemorySegment semaphore, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroySemaphore.invokeExact(device.handle(), semaphore, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateEvent(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pEvent)
	{
		try {return (int)device.funcHandle__vkCreateEvent.invokeExact(device.handle(), pCreateInfo, pAllocator, pEvent);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyEvent(vulkan.VkDevice device, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyEvent.invokeExact(device.handle(), event, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetEventStatus(vulkan.VkDevice device, java.lang.foreign.MemorySegment event)
	{
		try {return (int)device.funcHandle__vkGetEventStatus.invokeExact(device.handle(), event);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetEvent(vulkan.VkDevice device, java.lang.foreign.MemorySegment event)
	{
		try {return (int)device.funcHandle__vkSetEvent.invokeExact(device.handle(), event);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkResetEvent(vulkan.VkDevice device, java.lang.foreign.MemorySegment event)
	{
		try {return (int)device.funcHandle__vkResetEvent.invokeExact(device.handle(), event);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateQueryPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pQueryPool)
	{
		try {return (int)device.funcHandle__vkCreateQueryPool.invokeExact(device.handle(), pCreateInfo, pAllocator, pQueryPool);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyQueryPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment queryPool, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyQueryPool.invokeExact(device.handle(), queryPool, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetQueryPoolResults(vulkan.VkDevice device, java.lang.foreign.MemorySegment queryPool, int firstQuery, int queryCount, long dataSize, java.lang.foreign.MemorySegment pData, long stride, int flags)
	{
		try {return (int)device.funcHandle__vkGetQueryPoolResults.invokeExact(device.handle(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateBuffer(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pBuffer)
	{
		try {return (int)device.funcHandle__vkCreateBuffer.invokeExact(device.handle(), pCreateInfo, pAllocator, pBuffer);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyBuffer(vulkan.VkDevice device, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyBuffer.invokeExact(device.handle(), buffer, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateBufferView(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pView)
	{
		try {return (int)device.funcHandle__vkCreateBufferView.invokeExact(device.handle(), pCreateInfo, pAllocator, pView);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyBufferView(vulkan.VkDevice device, java.lang.foreign.MemorySegment bufferView, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyBufferView.invokeExact(device.handle(), bufferView, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateImage(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pImage)
	{
		try {return (int)device.funcHandle__vkCreateImage.invokeExact(device.handle(), pCreateInfo, pAllocator, pImage);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyImage(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyImage.invokeExact(device.handle(), image, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSubresourceLayout(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pSubresource, java.lang.foreign.MemorySegment pLayout)
	{
		try {device.funcHandle__vkGetImageSubresourceLayout.invokeExact(device.handle(), image, pSubresource, pLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateImageView(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pView)
	{
		try {return (int)device.funcHandle__vkCreateImageView.invokeExact(device.handle(), pCreateInfo, pAllocator, pView);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyImageView(vulkan.VkDevice device, java.lang.foreign.MemorySegment imageView, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyImageView.invokeExact(device.handle(), imageView, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateShaderModule(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pShaderModule)
	{
		try {return (int)device.funcHandle__vkCreateShaderModule.invokeExact(device.handle(), pCreateInfo, pAllocator, pShaderModule);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyShaderModule(vulkan.VkDevice device, java.lang.foreign.MemorySegment shaderModule, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyShaderModule.invokeExact(device.handle(), shaderModule, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreatePipelineCache(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelineCache)
	{
		try {return (int)device.funcHandle__vkCreatePipelineCache.invokeExact(device.handle(), pCreateInfo, pAllocator, pPipelineCache);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyPipelineCache(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineCache, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyPipelineCache.invokeExact(device.handle(), pipelineCache, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPipelineCacheData(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineCache, java.lang.foreign.MemorySegment pDataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetPipelineCacheData.invokeExact(device.handle(), pipelineCache, pDataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkMergePipelineCaches(vulkan.VkDevice device, java.lang.foreign.MemorySegment dstCache, int srcCacheCount, java.lang.foreign.MemorySegment pSrcCaches)
	{
		try {return (int)device.funcHandle__vkMergePipelineCaches.invokeExact(device.handle(), dstCache, srcCacheCount, pSrcCaches);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateGraphicsPipelines(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineCache, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelines)
	{
		try {return (int)device.funcHandle__vkCreateGraphicsPipelines.invokeExact(device.handle(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateComputePipelines(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineCache, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelines)
	{
		try {return (int)device.funcHandle__vkCreateComputePipelines.invokeExact(device.handle(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyPipeline(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyPipeline.invokeExact(device.handle(), pipeline, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreatePipelineLayout(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelineLayout)
	{
		try {return (int)device.funcHandle__vkCreatePipelineLayout.invokeExact(device.handle(), pCreateInfo, pAllocator, pPipelineLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyPipelineLayout(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineLayout, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyPipelineLayout.invokeExact(device.handle(), pipelineLayout, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSampler(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSampler)
	{
		try {return (int)device.funcHandle__vkCreateSampler.invokeExact(device.handle(), pCreateInfo, pAllocator, pSampler);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroySampler(vulkan.VkDevice device, java.lang.foreign.MemorySegment sampler, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroySampler.invokeExact(device.handle(), sampler, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateDescriptorSetLayout(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSetLayout)
	{
		try {return (int)device.funcHandle__vkCreateDescriptorSetLayout.invokeExact(device.handle(), pCreateInfo, pAllocator, pSetLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyDescriptorSetLayout(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorSetLayout, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDescriptorSetLayout.invokeExact(device.handle(), descriptorSetLayout, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateDescriptorPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pDescriptorPool)
	{
		try {return (int)device.funcHandle__vkCreateDescriptorPool.invokeExact(device.handle(), pCreateInfo, pAllocator, pDescriptorPool);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyDescriptorPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorPool, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDescriptorPool.invokeExact(device.handle(), descriptorPool, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkResetDescriptorPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorPool, int flags)
	{
		try {return (int)device.funcHandle__vkResetDescriptorPool.invokeExact(device.handle(), descriptorPool, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAllocateDescriptorSets(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAllocateInfo, java.lang.foreign.MemorySegment pDescriptorSets)
	{
		try {return (int)device.funcHandle__vkAllocateDescriptorSets.invokeExact(device.handle(), pAllocateInfo, pDescriptorSets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkFreeDescriptorSets(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorPool, int descriptorSetCount, java.lang.foreign.MemorySegment pDescriptorSets)
	{
		try {return (int)device.funcHandle__vkFreeDescriptorSets.invokeExact(device.handle(), descriptorPool, descriptorSetCount, pDescriptorSets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkUpdateDescriptorSets(vulkan.VkDevice device, int descriptorWriteCount, java.lang.foreign.MemorySegment pDescriptorWrites, int descriptorCopyCount, java.lang.foreign.MemorySegment pDescriptorCopies)
	{
		try {device.funcHandle__vkUpdateDescriptorSets.invokeExact(device.handle(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateFramebuffer(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFramebuffer)
	{
		try {return (int)device.funcHandle__vkCreateFramebuffer.invokeExact(device.handle(), pCreateInfo, pAllocator, pFramebuffer);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyFramebuffer(vulkan.VkDevice device, java.lang.foreign.MemorySegment framebuffer, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyFramebuffer.invokeExact(device.handle(), framebuffer, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateRenderPass(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pRenderPass)
	{
		try {return (int)device.funcHandle__vkCreateRenderPass.invokeExact(device.handle(), pCreateInfo, pAllocator, pRenderPass);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyRenderPass(vulkan.VkDevice device, java.lang.foreign.MemorySegment renderPass, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyRenderPass.invokeExact(device.handle(), renderPass, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetRenderAreaGranularity(vulkan.VkDevice device, java.lang.foreign.MemorySegment renderPass, java.lang.foreign.MemorySegment pGranularity)
	{
		try {device.funcHandle__vkGetRenderAreaGranularity.invokeExact(device.handle(), renderPass, pGranularity);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateCommandPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pCommandPool)
	{
		try {return (int)device.funcHandle__vkCreateCommandPool.invokeExact(device.handle(), pCreateInfo, pAllocator, pCommandPool);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyCommandPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment commandPool, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyCommandPool.invokeExact(device.handle(), commandPool, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkResetCommandPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment commandPool, int flags)
	{
		try {return (int)device.funcHandle__vkResetCommandPool.invokeExact(device.handle(), commandPool, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAllocateCommandBuffers(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAllocateInfo, java.lang.foreign.MemorySegment pCommandBuffers)
	{
		try {return (int)device.funcHandle__vkAllocateCommandBuffers.invokeExact(device.handle(), pAllocateInfo, pCommandBuffers);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkFreeCommandBuffers(vulkan.VkDevice device, java.lang.foreign.MemorySegment commandPool, int commandBufferCount, java.lang.foreign.MemorySegment pCommandBuffers)
	{
		try {device.funcHandle__vkFreeCommandBuffers.invokeExact(device.handle(), commandPool, commandBufferCount, pCommandBuffers);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBeginCommandBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pBeginInfo)
	{
		try {return (int)commandBuffer.device().funcHandle__vkBeginCommandBuffer.invokeExact(commandBuffer.handle(), pBeginInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkEndCommandBuffer(vulkan.VkCommandBuffer commandBuffer)
	{
		try {return (int)commandBuffer.device().funcHandle__vkEndCommandBuffer.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkResetCommandBuffer(vulkan.VkCommandBuffer commandBuffer, int flags)
	{
		try {return (int)commandBuffer.device().funcHandle__vkResetCommandBuffer.invokeExact(commandBuffer.handle(), flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindPipeline(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment pipeline)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindPipeline.invokeExact(commandBuffer.handle(), pipelineBindPoint, pipeline);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewport(vulkan.VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, java.lang.foreign.MemorySegment pViewports)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewport.invokeExact(commandBuffer.handle(), firstViewport, viewportCount, pViewports);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetScissor(vulkan.VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, java.lang.foreign.MemorySegment pScissors)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetScissor.invokeExact(commandBuffer.handle(), firstScissor, scissorCount, pScissors);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLineWidth(vulkan.VkCommandBuffer commandBuffer, float lineWidth)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLineWidth.invokeExact(commandBuffer.handle(), lineWidth);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBias(vulkan.VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBias.invokeExact(commandBuffer.handle(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetBlendConstants(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment blendConstants)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetBlendConstants.invokeExact(commandBuffer.handle(), blendConstants);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBounds(vulkan.VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBounds.invokeExact(commandBuffer.handle(), minDepthBounds, maxDepthBounds);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilCompareMask(vulkan.VkCommandBuffer commandBuffer, int faceMask, int compareMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilCompareMask.invokeExact(commandBuffer.handle(), faceMask, compareMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilWriteMask(vulkan.VkCommandBuffer commandBuffer, int faceMask, int writeMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilWriteMask.invokeExact(commandBuffer.handle(), faceMask, writeMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilReference(vulkan.VkCommandBuffer commandBuffer, int faceMask, int reference)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilReference.invokeExact(commandBuffer.handle(), faceMask, reference);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindDescriptorSets(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int firstSet, int descriptorSetCount, java.lang.foreign.MemorySegment pDescriptorSets, int dynamicOffsetCount, java.lang.foreign.MemorySegment pDynamicOffsets)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindDescriptorSets.invokeExact(commandBuffer.handle(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindIndexBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, int indexType)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindIndexBuffer.invokeExact(commandBuffer.handle(), buffer, offset, indexType);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindVertexBuffers(vulkan.VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, java.lang.foreign.MemorySegment pBuffers, java.lang.foreign.MemorySegment pOffsets)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindVertexBuffers.invokeExact(commandBuffer.handle(), firstBinding, bindingCount, pBuffers, pOffsets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDraw(vulkan.VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance)
	{
		try {commandBuffer.device().funcHandle__vkCmdDraw.invokeExact(commandBuffer.handle(), vertexCount, instanceCount, firstVertex, firstInstance);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndexed(vulkan.VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndexed.invokeExact(commandBuffer.handle(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndirect(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, int drawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndirect.invokeExact(commandBuffer.handle(), buffer, offset, drawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndexedIndirect(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, int drawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndexedIndirect.invokeExact(commandBuffer.handle(), buffer, offset, drawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDispatch(vulkan.VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ)
	{
		try {commandBuffer.device().funcHandle__vkCmdDispatch.invokeExact(commandBuffer.handle(), groupCountX, groupCountY, groupCountZ);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDispatchIndirect(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset)
	{
		try {commandBuffer.device().funcHandle__vkCmdDispatchIndirect.invokeExact(commandBuffer.handle(), buffer, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcBuffer, java.lang.foreign.MemorySegment dstBuffer, int regionCount, java.lang.foreign.MemorySegment pRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBuffer.invokeExact(commandBuffer.handle(), srcBuffer, dstBuffer, regionCount, pRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcImage, int srcImageLayout, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImage.invokeExact(commandBuffer.handle(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBlitImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcImage, int srcImageLayout, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions, int filter)
	{
		try {commandBuffer.device().funcHandle__vkCmdBlitImage.invokeExact(commandBuffer.handle(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBufferToImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcBuffer, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBufferToImage.invokeExact(commandBuffer.handle(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImageToBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcImage, int srcImageLayout, java.lang.foreign.MemorySegment dstBuffer, int regionCount, java.lang.foreign.MemorySegment pRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImageToBuffer.invokeExact(commandBuffer.handle(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdUpdateBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, long dataSize, java.lang.foreign.MemorySegment pData)
	{
		try {commandBuffer.device().funcHandle__vkCmdUpdateBuffer.invokeExact(commandBuffer.handle(), dstBuffer, dstOffset, dataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdFillBuffer(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, long size, int data)
	{
		try {commandBuffer.device().funcHandle__vkCmdFillBuffer.invokeExact(commandBuffer.handle(), dstBuffer, dstOffset, size, data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdClearColorImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment image, int imageLayout, java.lang.foreign.MemorySegment pColor, int rangeCount, java.lang.foreign.MemorySegment pRanges)
	{
		try {commandBuffer.device().funcHandle__vkCmdClearColorImage.invokeExact(commandBuffer.handle(), image, imageLayout, pColor, rangeCount, pRanges);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdClearDepthStencilImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment image, int imageLayout, java.lang.foreign.MemorySegment pDepthStencil, int rangeCount, java.lang.foreign.MemorySegment pRanges)
	{
		try {commandBuffer.device().funcHandle__vkCmdClearDepthStencilImage.invokeExact(commandBuffer.handle(), image, imageLayout, pDepthStencil, rangeCount, pRanges);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdClearAttachments(vulkan.VkCommandBuffer commandBuffer, int attachmentCount, java.lang.foreign.MemorySegment pAttachments, int rectCount, java.lang.foreign.MemorySegment pRects)
	{
		try {commandBuffer.device().funcHandle__vkCmdClearAttachments.invokeExact(commandBuffer.handle(), attachmentCount, pAttachments, rectCount, pRects);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResolveImage(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment srcImage, int srcImageLayout, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdResolveImage.invokeExact(commandBuffer.handle(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetEvent(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, int stageMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetEvent.invokeExact(commandBuffer.handle(), event, stageMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResetEvent(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, int stageMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdResetEvent.invokeExact(commandBuffer.handle(), event, stageMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWaitEvents(vulkan.VkCommandBuffer commandBuffer, int eventCount, java.lang.foreign.MemorySegment pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, java.lang.foreign.MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, java.lang.foreign.MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, java.lang.foreign.MemorySegment pImageMemoryBarriers)
	{
		try {commandBuffer.device().funcHandle__vkCmdWaitEvents.invokeExact(commandBuffer.handle(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPipelineBarrier(vulkan.VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, java.lang.foreign.MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, java.lang.foreign.MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, java.lang.foreign.MemorySegment pImageMemoryBarriers)
	{
		try {commandBuffer.device().funcHandle__vkCmdPipelineBarrier.invokeExact(commandBuffer.handle(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginQuery(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int query, int flags)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginQuery.invokeExact(commandBuffer.handle(), queryPool, query, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndQuery(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int query)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndQuery.invokeExact(commandBuffer.handle(), queryPool, query);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResetQueryPool(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int firstQuery, int queryCount)
	{
		try {commandBuffer.device().funcHandle__vkCmdResetQueryPool.invokeExact(commandBuffer.handle(), queryPool, firstQuery, queryCount);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteTimestamp(vulkan.VkCommandBuffer commandBuffer, int pipelineStage, java.lang.foreign.MemorySegment queryPool, int query)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteTimestamp.invokeExact(commandBuffer.handle(), pipelineStage, queryPool, query);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyQueryPoolResults(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int firstQuery, int queryCount, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, long stride, int flags)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyQueryPoolResults.invokeExact(commandBuffer.handle(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPushConstants(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment layout, int stageFlags, int offset, int size, java.lang.foreign.MemorySegment pValues)
	{
		try {commandBuffer.device().funcHandle__vkCmdPushConstants.invokeExact(commandBuffer.handle(), layout, stageFlags, offset, size, pValues);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginRenderPass(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRenderPassBegin, int contents)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginRenderPass.invokeExact(commandBuffer.handle(), pRenderPassBegin, contents);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdNextSubpass(vulkan.VkCommandBuffer commandBuffer, int contents)
	{
		try {commandBuffer.device().funcHandle__vkCmdNextSubpass.invokeExact(commandBuffer.handle(), contents);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndRenderPass(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndRenderPass.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdExecuteCommands(vulkan.VkCommandBuffer commandBuffer, int commandBufferCount, java.lang.foreign.MemorySegment pCommandBuffers)
	{
		try {commandBuffer.device().funcHandle__vkCmdExecuteCommands.invokeExact(commandBuffer.handle(), commandBufferCount, pCommandBuffers);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindBufferMemory2(vulkan.VkDevice device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos)
	{
		try {return (int)device.funcHandle__vkBindBufferMemory2.invokeExact(device.handle(), bindInfoCount, pBindInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindImageMemory2(vulkan.VkDevice device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos)
	{
		try {return (int)device.funcHandle__vkBindImageMemory2.invokeExact(device.handle(), bindInfoCount, pBindInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceGroupPeerMemoryFeatures(vulkan.VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, java.lang.foreign.MemorySegment pPeerMemoryFeatures)
	{
		try {device.funcHandle__vkGetDeviceGroupPeerMemoryFeatures.invokeExact(device.handle(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDeviceMask(vulkan.VkCommandBuffer commandBuffer, int deviceMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDeviceMask.invokeExact(commandBuffer.handle(), deviceMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDispatchBase(vulkan.VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ)
	{
		try {commandBuffer.device().funcHandle__vkCmdDispatchBase.invokeExact(commandBuffer.handle(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageMemoryRequirements2(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageMemoryRequirements2.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetBufferMemoryRequirements2(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetBufferMemoryRequirements2.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSparseMemoryRequirements2(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageSparseMemoryRequirements2.invokeExact(device.handle(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkTrimCommandPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment commandPool, int flags)
	{
		try {device.funcHandle__vkTrimCommandPool.invokeExact(device.handle(), commandPool, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceQueue2(vulkan.VkDevice device, java.lang.foreign.MemorySegment pQueueInfo, java.lang.foreign.MemorySegment pQueue)
	{
		try {device.funcHandle__vkGetDeviceQueue2.invokeExact(device.handle(), pQueueInfo, pQueue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSamplerYcbcrConversion(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pYcbcrConversion)
	{
		try {return (int)device.funcHandle__vkCreateSamplerYcbcrConversion.invokeExact(device.handle(), pCreateInfo, pAllocator, pYcbcrConversion);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroySamplerYcbcrConversion(vulkan.VkDevice device, java.lang.foreign.MemorySegment ycbcrConversion, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroySamplerYcbcrConversion.invokeExact(device.handle(), ycbcrConversion, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateDescriptorUpdateTemplate(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pDescriptorUpdateTemplate)
	{
		try {return (int)device.funcHandle__vkCreateDescriptorUpdateTemplate.invokeExact(device.handle(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyDescriptorUpdateTemplate(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDescriptorUpdateTemplate.invokeExact(device.handle(), descriptorUpdateTemplate, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkUpdateDescriptorSetWithTemplate(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorSet, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment pData)
	{
		try {device.funcHandle__vkUpdateDescriptorSetWithTemplate.invokeExact(device.handle(), descriptorSet, descriptorUpdateTemplate, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetLayoutSupport(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pSupport)
	{
		try {device.funcHandle__vkGetDescriptorSetLayoutSupport.invokeExact(device.handle(), pCreateInfo, pSupport);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndirectCount(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndirectCount.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndexedIndirectCount(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndexedIndirectCount.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateRenderPass2(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pRenderPass)
	{
		try {return (int)device.funcHandle__vkCreateRenderPass2.invokeExact(device.handle(), pCreateInfo, pAllocator, pRenderPass);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginRenderPass2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRenderPassBegin, java.lang.foreign.MemorySegment pSubpassBeginInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginRenderPass2.invokeExact(commandBuffer.handle(), pRenderPassBegin, pSubpassBeginInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdNextSubpass2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pSubpassBeginInfo, java.lang.foreign.MemorySegment pSubpassEndInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdNextSubpass2.invokeExact(commandBuffer.handle(), pSubpassBeginInfo, pSubpassEndInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndRenderPass2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pSubpassEndInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndRenderPass2.invokeExact(commandBuffer.handle(), pSubpassEndInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkResetQueryPool(vulkan.VkDevice device, java.lang.foreign.MemorySegment queryPool, int firstQuery, int queryCount)
	{
		try {device.funcHandle__vkResetQueryPool.invokeExact(device.handle(), queryPool, firstQuery, queryCount);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSemaphoreCounterValue(vulkan.VkDevice device, java.lang.foreign.MemorySegment semaphore, java.lang.foreign.MemorySegment pValue)
	{
		try {return (int)device.funcHandle__vkGetSemaphoreCounterValue.invokeExact(device.handle(), semaphore, pValue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWaitSemaphores(vulkan.VkDevice device, java.lang.foreign.MemorySegment pWaitInfo, long timeout)
	{
		try {return (int)device.funcHandle__vkWaitSemaphores.invokeExact(device.handle(), pWaitInfo, timeout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSignalSemaphore(vulkan.VkDevice device, java.lang.foreign.MemorySegment pSignalInfo)
	{
		try {return (int)device.funcHandle__vkSignalSemaphore.invokeExact(device.handle(), pSignalInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetBufferDeviceAddress(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetBufferDeviceAddress.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetBufferOpaqueCaptureAddress(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetBufferOpaqueCaptureAddress.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetDeviceMemoryOpaqueCaptureAddress(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetDeviceMemoryOpaqueCaptureAddress.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreatePrivateDataSlot(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPrivateDataSlot)
	{
		try {return (int)device.funcHandle__vkCreatePrivateDataSlot.invokeExact(device.handle(), pCreateInfo, pAllocator, pPrivateDataSlot);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyPrivateDataSlot(vulkan.VkDevice device, java.lang.foreign.MemorySegment privateDataSlot, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyPrivateDataSlot.invokeExact(device.handle(), privateDataSlot, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetPrivateData(vulkan.VkDevice device, int objectType, long objectHandle, java.lang.foreign.MemorySegment privateDataSlot, long data)
	{
		try {return (int)device.funcHandle__vkSetPrivateData.invokeExact(device.handle(), objectType, objectHandle, privateDataSlot, data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetPrivateData(vulkan.VkDevice device, int objectType, long objectHandle, java.lang.foreign.MemorySegment privateDataSlot, java.lang.foreign.MemorySegment pData)
	{
		try {device.funcHandle__vkGetPrivateData.invokeExact(device.handle(), objectType, objectHandle, privateDataSlot, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetEvent2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment pDependencyInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetEvent2.invokeExact(commandBuffer.handle(), event, pDependencyInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResetEvent2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, long stageMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdResetEvent2.invokeExact(commandBuffer.handle(), event, stageMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWaitEvents2(vulkan.VkCommandBuffer commandBuffer, int eventCount, java.lang.foreign.MemorySegment pEvents, java.lang.foreign.MemorySegment pDependencyInfos)
	{
		try {commandBuffer.device().funcHandle__vkCmdWaitEvents2.invokeExact(commandBuffer.handle(), eventCount, pEvents, pDependencyInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPipelineBarrier2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pDependencyInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdPipelineBarrier2.invokeExact(commandBuffer.handle(), pDependencyInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteTimestamp2(vulkan.VkCommandBuffer commandBuffer, long stage, java.lang.foreign.MemorySegment queryPool, int query)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteTimestamp2.invokeExact(commandBuffer.handle(), stage, queryPool, query);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueSubmit2(vulkan.VkQueue queue, int submitCount, java.lang.foreign.MemorySegment pSubmits, java.lang.foreign.MemorySegment fence)
	{
		try {return (int)queue.device().funcHandle__vkQueueSubmit2.invokeExact(queue.handle(), submitCount, pSubmits, fence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBuffer2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyBufferInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBuffer2.invokeExact(commandBuffer.handle(), pCopyBufferInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImage2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImage2.invokeExact(commandBuffer.handle(), pCopyImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBufferToImage2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyBufferToImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBufferToImage2.invokeExact(commandBuffer.handle(), pCopyBufferToImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImageToBuffer2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyImageToBufferInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImageToBuffer2.invokeExact(commandBuffer.handle(), pCopyImageToBufferInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBlitImage2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pBlitImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBlitImage2.invokeExact(commandBuffer.handle(), pBlitImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResolveImage2(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pResolveImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdResolveImage2.invokeExact(commandBuffer.handle(), pResolveImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginRendering(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRenderingInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginRendering.invokeExact(commandBuffer.handle(), pRenderingInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndRendering(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndRendering.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCullMode(vulkan.VkCommandBuffer commandBuffer, int cullMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCullMode.invokeExact(commandBuffer.handle(), cullMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetFrontFace(vulkan.VkCommandBuffer commandBuffer, int frontFace)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetFrontFace.invokeExact(commandBuffer.handle(), frontFace);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPrimitiveTopology(vulkan.VkCommandBuffer commandBuffer, int primitiveTopology)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPrimitiveTopology.invokeExact(commandBuffer.handle(), primitiveTopology);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportWithCount(vulkan.VkCommandBuffer commandBuffer, int viewportCount, java.lang.foreign.MemorySegment pViewports)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportWithCount.invokeExact(commandBuffer.handle(), viewportCount, pViewports);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetScissorWithCount(vulkan.VkCommandBuffer commandBuffer, int scissorCount, java.lang.foreign.MemorySegment pScissors)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetScissorWithCount.invokeExact(commandBuffer.handle(), scissorCount, pScissors);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindVertexBuffers2(vulkan.VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, java.lang.foreign.MemorySegment pBuffers, java.lang.foreign.MemorySegment pOffsets, java.lang.foreign.MemorySegment pSizes, java.lang.foreign.MemorySegment pStrides)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindVertexBuffers2.invokeExact(commandBuffer.handle(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthTestEnable(vulkan.VkCommandBuffer commandBuffer, int depthTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthTestEnable.invokeExact(commandBuffer.handle(), depthTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthWriteEnable(vulkan.VkCommandBuffer commandBuffer, int depthWriteEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthWriteEnable.invokeExact(commandBuffer.handle(), depthWriteEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthCompareOp(vulkan.VkCommandBuffer commandBuffer, int depthCompareOp)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthCompareOp.invokeExact(commandBuffer.handle(), depthCompareOp);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBoundsTestEnable(vulkan.VkCommandBuffer commandBuffer, int depthBoundsTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBoundsTestEnable.invokeExact(commandBuffer.handle(), depthBoundsTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilTestEnable(vulkan.VkCommandBuffer commandBuffer, int stencilTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilTestEnable.invokeExact(commandBuffer.handle(), stencilTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilOp(vulkan.VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilOp.invokeExact(commandBuffer.handle(), faceMask, failOp, passOp, depthFailOp, compareOp);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRasterizerDiscardEnable(vulkan.VkCommandBuffer commandBuffer, int rasterizerDiscardEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRasterizerDiscardEnable.invokeExact(commandBuffer.handle(), rasterizerDiscardEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBiasEnable(vulkan.VkCommandBuffer commandBuffer, int depthBiasEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBiasEnable.invokeExact(commandBuffer.handle(), depthBiasEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPrimitiveRestartEnable(vulkan.VkCommandBuffer commandBuffer, int primitiveRestartEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPrimitiveRestartEnable.invokeExact(commandBuffer.handle(), primitiveRestartEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceBufferMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceBufferMemoryRequirements.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceImageMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceImageMemoryRequirements.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceImageSparseMemoryRequirements(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceImageSparseMemoryRequirements.invokeExact(device.handle(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSwapchainKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSwapchain)
	{
		try {return (int)device.funcHandle__vkCreateSwapchainKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pSwapchain);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroySwapchainKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroySwapchainKHR.invokeExact(device.handle(), swapchain, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSwapchainImagesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pSwapchainImageCount, java.lang.foreign.MemorySegment pSwapchainImages)
	{
		try {return (int)device.funcHandle__vkGetSwapchainImagesKHR.invokeExact(device.handle(), swapchain, pSwapchainImageCount, pSwapchainImages);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAcquireNextImageKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, long timeout, java.lang.foreign.MemorySegment semaphore, java.lang.foreign.MemorySegment fence, java.lang.foreign.MemorySegment pImageIndex)
	{
		try {return (int)device.funcHandle__vkAcquireNextImageKHR.invokeExact(device.handle(), swapchain, timeout, semaphore, fence, pImageIndex);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueuePresentKHR(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pPresentInfo)
	{
		try {return (int)queue.device().funcHandle__vkQueuePresentKHR.invokeExact(queue.handle(), pPresentInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeviceGroupPresentCapabilitiesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pDeviceGroupPresentCapabilities)
	{
		try {return (int)device.funcHandle__vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(device.handle(), pDeviceGroupPresentCapabilities);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeviceGroupSurfacePresentModesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment surface, java.lang.foreign.MemorySegment pModes)
	{
		try {return (int)device.funcHandle__vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(device.handle(), surface, pModes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAcquireNextImage2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAcquireInfo, java.lang.foreign.MemorySegment pImageIndex)
	{
		try {return (int)device.funcHandle__vkAcquireNextImage2KHR.invokeExact(device.handle(), pAcquireInfo, pImageIndex);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSharedSwapchainsKHR(vulkan.VkDevice device, int swapchainCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSwapchains)
	{
		try {return (int)device.funcHandle__vkCreateSharedSwapchainsKHR.invokeExact(device.handle(), swapchainCount, pCreateInfos, pAllocator, pSwapchains);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateVideoSessionKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pVideoSession)
	{
		try {return (int)device.funcHandle__vkCreateVideoSessionKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pVideoSession);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyVideoSessionKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment videoSession, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyVideoSessionKHR.invokeExact(device.handle(), videoSession, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetVideoSessionMemoryRequirementsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment videoSession, java.lang.foreign.MemorySegment pMemoryRequirementsCount, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {return (int)device.funcHandle__vkGetVideoSessionMemoryRequirementsKHR.invokeExact(device.handle(), videoSession, pMemoryRequirementsCount, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindVideoSessionMemoryKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment videoSession, int bindSessionMemoryInfoCount, java.lang.foreign.MemorySegment pBindSessionMemoryInfos)
	{
		try {return (int)device.funcHandle__vkBindVideoSessionMemoryKHR.invokeExact(device.handle(), videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateVideoSessionParametersKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pVideoSessionParameters)
	{
		try {return (int)device.funcHandle__vkCreateVideoSessionParametersKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pVideoSessionParameters);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkUpdateVideoSessionParametersKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment videoSessionParameters, java.lang.foreign.MemorySegment pUpdateInfo)
	{
		try {return (int)device.funcHandle__vkUpdateVideoSessionParametersKHR.invokeExact(device.handle(), videoSessionParameters, pUpdateInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyVideoSessionParametersKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment videoSessionParameters, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyVideoSessionParametersKHR.invokeExact(device.handle(), videoSessionParameters, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginVideoCodingKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pBeginInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginVideoCodingKHR.invokeExact(commandBuffer.handle(), pBeginInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndVideoCodingKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pEndCodingInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndVideoCodingKHR.invokeExact(commandBuffer.handle(), pEndCodingInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdControlVideoCodingKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCodingControlInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdControlVideoCodingKHR.invokeExact(commandBuffer.handle(), pCodingControlInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDecodeVideoKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pDecodeInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdDecodeVideoKHR.invokeExact(commandBuffer.handle(), pDecodeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginRenderingKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRenderingInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginRenderingKHR.invokeExact(commandBuffer.handle(), pRenderingInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndRenderingKHR(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndRenderingKHR.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(vulkan.VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, java.lang.foreign.MemorySegment pPeerMemoryFeatures)
	{
		try {device.funcHandle__vkGetDeviceGroupPeerMemoryFeaturesKHR.invokeExact(device.handle(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDeviceMaskKHR(vulkan.VkCommandBuffer commandBuffer, int deviceMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDeviceMaskKHR.invokeExact(commandBuffer.handle(), deviceMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDispatchBaseKHR(vulkan.VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ)
	{
		try {commandBuffer.device().funcHandle__vkCmdDispatchBaseKHR.invokeExact(commandBuffer.handle(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkTrimCommandPoolKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment commandPool, int flags)
	{
		try {device.funcHandle__vkTrimCommandPoolKHR.invokeExact(device.handle(), commandPool, flags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetMemoryFdKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pGetFdInfo, java.lang.foreign.MemorySegment pFd)
	{
		try {return (int)device.funcHandle__vkGetMemoryFdKHR.invokeExact(device.handle(), pGetFdInfo, pFd);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetMemoryFdPropertiesKHR(vulkan.VkDevice device, int handleType, int fd, java.lang.foreign.MemorySegment pMemoryFdProperties)
	{
		try {return (int)device.funcHandle__vkGetMemoryFdPropertiesKHR.invokeExact(device.handle(), handleType, fd, pMemoryFdProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkImportSemaphoreFdKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pImportSemaphoreFdInfo)
	{
		try {return (int)device.funcHandle__vkImportSemaphoreFdKHR.invokeExact(device.handle(), pImportSemaphoreFdInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSemaphoreFdKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pGetFdInfo, java.lang.foreign.MemorySegment pFd)
	{
		try {return (int)device.funcHandle__vkGetSemaphoreFdKHR.invokeExact(device.handle(), pGetFdInfo, pFd);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPushDescriptorSetKHR(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int set, int descriptorWriteCount, java.lang.foreign.MemorySegment pDescriptorWrites)
	{
		try {commandBuffer.device().funcHandle__vkCmdPushDescriptorSetKHR.invokeExact(commandBuffer.handle(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPushDescriptorSetWithTemplateKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment layout, int set, java.lang.foreign.MemorySegment pData)
	{
		try {commandBuffer.device().funcHandle__vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(commandBuffer.handle(), descriptorUpdateTemplate, layout, set, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateDescriptorUpdateTemplateKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pDescriptorUpdateTemplate)
	{
		try {return (int)device.funcHandle__vkCreateDescriptorUpdateTemplateKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyDescriptorUpdateTemplateKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDescriptorUpdateTemplateKHR.invokeExact(device.handle(), descriptorUpdateTemplate, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkUpdateDescriptorSetWithTemplateKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorSet, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment pData)
	{
		try {device.funcHandle__vkUpdateDescriptorSetWithTemplateKHR.invokeExact(device.handle(), descriptorSet, descriptorUpdateTemplate, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateRenderPass2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pRenderPass)
	{
		try {return (int)device.funcHandle__vkCreateRenderPass2KHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pRenderPass);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginRenderPass2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRenderPassBegin, java.lang.foreign.MemorySegment pSubpassBeginInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginRenderPass2KHR.invokeExact(commandBuffer.handle(), pRenderPassBegin, pSubpassBeginInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdNextSubpass2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pSubpassBeginInfo, java.lang.foreign.MemorySegment pSubpassEndInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdNextSubpass2KHR.invokeExact(commandBuffer.handle(), pSubpassBeginInfo, pSubpassEndInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndRenderPass2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pSubpassEndInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndRenderPass2KHR.invokeExact(commandBuffer.handle(), pSubpassEndInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSwapchainStatusKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain)
	{
		try {return (int)device.funcHandle__vkGetSwapchainStatusKHR.invokeExact(device.handle(), swapchain);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkImportFenceFdKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pImportFenceFdInfo)
	{
		try {return (int)device.funcHandle__vkImportFenceFdKHR.invokeExact(device.handle(), pImportFenceFdInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetFenceFdKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pGetFdInfo, java.lang.foreign.MemorySegment pFd)
	{
		try {return (int)device.funcHandle__vkGetFenceFdKHR.invokeExact(device.handle(), pGetFdInfo, pFd);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAcquireProfilingLockKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkAcquireProfilingLockKHR.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkReleaseProfilingLockKHR(vulkan.VkDevice device)
	{
		try {device.funcHandle__vkReleaseProfilingLockKHR.invokeExact(device.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageMemoryRequirements2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageMemoryRequirements2KHR.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetBufferMemoryRequirements2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetBufferMemoryRequirements2KHR.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSparseMemoryRequirements2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements)
	{
		try {device.funcHandle__vkGetImageSparseMemoryRequirements2KHR.invokeExact(device.handle(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateSamplerYcbcrConversionKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pYcbcrConversion)
	{
		try {return (int)device.funcHandle__vkCreateSamplerYcbcrConversionKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pYcbcrConversion);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroySamplerYcbcrConversionKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment ycbcrConversion, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroySamplerYcbcrConversionKHR.invokeExact(device.handle(), ycbcrConversion, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindBufferMemory2KHR(vulkan.VkDevice device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos)
	{
		try {return (int)device.funcHandle__vkBindBufferMemory2KHR.invokeExact(device.handle(), bindInfoCount, pBindInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindImageMemory2KHR(vulkan.VkDevice device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos)
	{
		try {return (int)device.funcHandle__vkBindImageMemory2KHR.invokeExact(device.handle(), bindInfoCount, pBindInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetLayoutSupportKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pSupport)
	{
		try {device.funcHandle__vkGetDescriptorSetLayoutSupportKHR.invokeExact(device.handle(), pCreateInfo, pSupport);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndirectCountKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndirectCountKHR.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndexedIndirectCountKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndexedIndirectCountKHR.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSemaphoreCounterValueKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment semaphore, java.lang.foreign.MemorySegment pValue)
	{
		try {return (int)device.funcHandle__vkGetSemaphoreCounterValueKHR.invokeExact(device.handle(), semaphore, pValue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWaitSemaphoresKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pWaitInfo, long timeout)
	{
		try {return (int)device.funcHandle__vkWaitSemaphoresKHR.invokeExact(device.handle(), pWaitInfo, timeout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSignalSemaphoreKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pSignalInfo)
	{
		try {return (int)device.funcHandle__vkSignalSemaphoreKHR.invokeExact(device.handle(), pSignalInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetFragmentShadingRateKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pFragmentSize, java.lang.foreign.MemorySegment combinerOps)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetFragmentShadingRateKHR.invokeExact(commandBuffer.handle(), pFragmentSize, combinerOps);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWaitForPresentKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, long presentId, long timeout)
	{
		try {return (int)device.funcHandle__vkWaitForPresentKHR.invokeExact(device.handle(), swapchain, presentId, timeout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetBufferDeviceAddressKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetBufferDeviceAddressKHR.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetBufferOpaqueCaptureAddressKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetBufferOpaqueCaptureAddressKHR.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetDeviceMemoryOpaqueCaptureAddressKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetDeviceMemoryOpaqueCaptureAddressKHR.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateDeferredOperationKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pDeferredOperation)
	{
		try {return (int)device.funcHandle__vkCreateDeferredOperationKHR.invokeExact(device.handle(), pAllocator, pDeferredOperation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyDeferredOperationKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment operation, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyDeferredOperationKHR.invokeExact(device.handle(), operation, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeferredOperationMaxConcurrencyKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment operation)
	{
		try {return (int)device.funcHandle__vkGetDeferredOperationMaxConcurrencyKHR.invokeExact(device.handle(), operation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeferredOperationResultKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment operation)
	{
		try {return (int)device.funcHandle__vkGetDeferredOperationResultKHR.invokeExact(device.handle(), operation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkDeferredOperationJoinKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment operation)
	{
		try {return (int)device.funcHandle__vkDeferredOperationJoinKHR.invokeExact(device.handle(), operation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPipelineExecutablePropertiesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pPipelineInfo, java.lang.foreign.MemorySegment pExecutableCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)device.funcHandle__vkGetPipelineExecutablePropertiesKHR.invokeExact(device.handle(), pPipelineInfo, pExecutableCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPipelineExecutableStatisticsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pExecutableInfo, java.lang.foreign.MemorySegment pStatisticCount, java.lang.foreign.MemorySegment pStatistics)
	{
		try {return (int)device.funcHandle__vkGetPipelineExecutableStatisticsKHR.invokeExact(device.handle(), pExecutableInfo, pStatisticCount, pStatistics);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPipelineExecutableInternalRepresentationsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pExecutableInfo, java.lang.foreign.MemorySegment pInternalRepresentationCount, java.lang.foreign.MemorySegment pInternalRepresentations)
	{
		try {return (int)device.funcHandle__vkGetPipelineExecutableInternalRepresentationsKHR.invokeExact(device.handle(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkMapMemory2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pMemoryMapInfo, java.lang.foreign.MemorySegment ppData)
	{
		try {return (int)device.funcHandle__vkMapMemory2KHR.invokeExact(device.handle(), pMemoryMapInfo, ppData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkUnmapMemory2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pMemoryUnmapInfo)
	{
		try {return (int)device.funcHandle__vkUnmapMemory2KHR.invokeExact(device.handle(), pMemoryUnmapInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetEvent2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment pDependencyInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetEvent2KHR.invokeExact(commandBuffer.handle(), event, pDependencyInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResetEvent2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment event, long stageMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdResetEvent2KHR.invokeExact(commandBuffer.handle(), event, stageMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWaitEvents2KHR(vulkan.VkCommandBuffer commandBuffer, int eventCount, java.lang.foreign.MemorySegment pEvents, java.lang.foreign.MemorySegment pDependencyInfos)
	{
		try {commandBuffer.device().funcHandle__vkCmdWaitEvents2KHR.invokeExact(commandBuffer.handle(), eventCount, pEvents, pDependencyInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPipelineBarrier2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pDependencyInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdPipelineBarrier2KHR.invokeExact(commandBuffer.handle(), pDependencyInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteTimestamp2KHR(vulkan.VkCommandBuffer commandBuffer, long stage, java.lang.foreign.MemorySegment queryPool, int query)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteTimestamp2KHR.invokeExact(commandBuffer.handle(), stage, queryPool, query);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueSubmit2KHR(vulkan.VkQueue queue, int submitCount, java.lang.foreign.MemorySegment pSubmits, java.lang.foreign.MemorySegment fence)
	{
		try {return (int)queue.device().funcHandle__vkQueueSubmit2KHR.invokeExact(queue.handle(), submitCount, pSubmits, fence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteBufferMarker2AMD(vulkan.VkCommandBuffer commandBuffer, long stage, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, int marker)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteBufferMarker2AMD.invokeExact(commandBuffer.handle(), stage, dstBuffer, dstOffset, marker);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetQueueCheckpointData2NV(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pCheckpointDataCount, java.lang.foreign.MemorySegment pCheckpointData)
	{
		try {queue.device().funcHandle__vkGetQueueCheckpointData2NV.invokeExact(queue.handle(), pCheckpointDataCount, pCheckpointData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBuffer2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyBufferInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBuffer2KHR.invokeExact(commandBuffer.handle(), pCopyBufferInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImage2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImage2KHR.invokeExact(commandBuffer.handle(), pCopyImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyBufferToImage2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyBufferToImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyBufferToImage2KHR.invokeExact(commandBuffer.handle(), pCopyBufferToImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyImageToBuffer2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCopyImageToBufferInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyImageToBuffer2KHR.invokeExact(commandBuffer.handle(), pCopyImageToBufferInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBlitImage2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pBlitImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBlitImage2KHR.invokeExact(commandBuffer.handle(), pBlitImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdResolveImage2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pResolveImageInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdResolveImage2KHR.invokeExact(commandBuffer.handle(), pResolveImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdTraceRaysIndirect2KHR(vulkan.VkCommandBuffer commandBuffer, long indirectDeviceAddress)
	{
		try {commandBuffer.device().funcHandle__vkCmdTraceRaysIndirect2KHR.invokeExact(commandBuffer.handle(), indirectDeviceAddress);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceBufferMemoryRequirementsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceBufferMemoryRequirementsKHR.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceImageMemoryRequirementsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceImageMemoryRequirementsKHR.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceImageSparseMemoryRequirementsKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pSparseMemoryRequirementCount, java.lang.foreign.MemorySegment pSparseMemoryRequirements)
	{
		try {device.funcHandle__vkGetDeviceImageSparseMemoryRequirementsKHR.invokeExact(device.handle(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindIndexBuffer2KHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, long size, int indexType)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindIndexBuffer2KHR.invokeExact(commandBuffer.handle(), buffer, offset, size, indexType);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetRenderingAreaGranularityKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pRenderingAreaInfo, java.lang.foreign.MemorySegment pGranularity)
	{
		try {device.funcHandle__vkGetRenderingAreaGranularityKHR.invokeExact(device.handle(), pRenderingAreaInfo, pGranularity);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceImageSubresourceLayoutKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pLayout)
	{
		try {device.funcHandle__vkGetDeviceImageSubresourceLayoutKHR.invokeExact(device.handle(), pInfo, pLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSubresourceLayout2KHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pSubresource, java.lang.foreign.MemorySegment pLayout)
	{
		try {device.funcHandle__vkGetImageSubresourceLayout2KHR.invokeExact(device.handle(), image, pSubresource, pLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkDebugMarkerSetObjectTagEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pTagInfo)
	{
		try {return (int)device.funcHandle__vkDebugMarkerSetObjectTagEXT.invokeExact(device.handle(), pTagInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkDebugMarkerSetObjectNameEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pNameInfo)
	{
		try {return (int)device.funcHandle__vkDebugMarkerSetObjectNameEXT.invokeExact(device.handle(), pNameInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDebugMarkerBeginEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pMarkerInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdDebugMarkerBeginEXT.invokeExact(commandBuffer.handle(), pMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDebugMarkerEndEXT(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdDebugMarkerEndEXT.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDebugMarkerInsertEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pMarkerInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdDebugMarkerInsertEXT.invokeExact(commandBuffer.handle(), pMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindTransformFeedbackBuffersEXT(vulkan.VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, java.lang.foreign.MemorySegment pBuffers, java.lang.foreign.MemorySegment pOffsets, java.lang.foreign.MemorySegment pSizes)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindTransformFeedbackBuffersEXT.invokeExact(commandBuffer.handle(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginTransformFeedbackEXT(vulkan.VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, java.lang.foreign.MemorySegment pCounterBuffers, java.lang.foreign.MemorySegment pCounterBufferOffsets)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginTransformFeedbackEXT.invokeExact(commandBuffer.handle(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndTransformFeedbackEXT(vulkan.VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, java.lang.foreign.MemorySegment pCounterBuffers, java.lang.foreign.MemorySegment pCounterBufferOffsets)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndTransformFeedbackEXT.invokeExact(commandBuffer.handle(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginQueryIndexedEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int query, int flags, int index)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginQueryIndexedEXT.invokeExact(commandBuffer.handle(), queryPool, query, flags, index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndQueryIndexedEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment queryPool, int query, int index)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndQueryIndexedEXT.invokeExact(commandBuffer.handle(), queryPool, query, index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndirectByteCountEXT(vulkan.VkCommandBuffer commandBuffer, int instanceCount, int firstInstance, java.lang.foreign.MemorySegment counterBuffer, long counterBufferOffset, int counterOffset, int vertexStride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndirectByteCountEXT.invokeExact(commandBuffer.handle(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateCuModuleNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pModule)
	{
		try {return (int)device.funcHandle__vkCreateCuModuleNVX.invokeExact(device.handle(), pCreateInfo, pAllocator, pModule);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateCuFunctionNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFunction)
	{
		try {return (int)device.funcHandle__vkCreateCuFunctionNVX.invokeExact(device.handle(), pCreateInfo, pAllocator, pFunction);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyCuModuleNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment module, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyCuModuleNVX.invokeExact(device.handle(), module, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyCuFunctionNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment function, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyCuFunctionNVX.invokeExact(device.handle(), function, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCuLaunchKernelNVX(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pLaunchInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCuLaunchKernelNVX.invokeExact(commandBuffer.handle(), pLaunchInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetImageViewHandleNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkGetImageViewHandleNVX.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetImageViewAddressNVX(vulkan.VkDevice device, java.lang.foreign.MemorySegment imageView, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)device.funcHandle__vkGetImageViewAddressNVX.invokeExact(device.handle(), imageView, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndirectCountAMD(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndirectCountAMD.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawIndexedIndirectCountAMD(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawIndexedIndirectCountAMD.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetShaderInfoAMD(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int shaderStage, int infoType, java.lang.foreign.MemorySegment pInfoSize, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkGetShaderInfoAMD.invokeExact(device.handle(), pipeline, shaderStage, infoType, pInfoSize, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginConditionalRenderingEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pConditionalRenderingBegin)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginConditionalRenderingEXT.invokeExact(commandBuffer.handle(), pConditionalRenderingBegin);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndConditionalRenderingEXT(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndConditionalRenderingEXT.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportWScalingNV(vulkan.VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, java.lang.foreign.MemorySegment pViewportWScalings)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportWScalingNV.invokeExact(commandBuffer.handle(), firstViewport, viewportCount, pViewportWScalings);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkDisplayPowerControlEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pDisplayPowerInfo)
	{
		try {return (int)device.funcHandle__vkDisplayPowerControlEXT.invokeExact(device.handle(), display, pDisplayPowerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkRegisterDeviceEventEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pDeviceEventInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFence)
	{
		try {return (int)device.funcHandle__vkRegisterDeviceEventEXT.invokeExact(device.handle(), pDeviceEventInfo, pAllocator, pFence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkRegisterDisplayEventEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pDisplayEventInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFence)
	{
		try {return (int)device.funcHandle__vkRegisterDisplayEventEXT.invokeExact(device.handle(), display, pDisplayEventInfo, pAllocator, pFence);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSwapchainCounterEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, int counter, java.lang.foreign.MemorySegment pCounterValue)
	{
		try {return (int)device.funcHandle__vkGetSwapchainCounterEXT.invokeExact(device.handle(), swapchain, counter, pCounterValue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetRefreshCycleDurationGOOGLE(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pDisplayTimingProperties)
	{
		try {return (int)device.funcHandle__vkGetRefreshCycleDurationGOOGLE.invokeExact(device.handle(), swapchain, pDisplayTimingProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPastPresentationTimingGOOGLE(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pPresentationTimingCount, java.lang.foreign.MemorySegment pPresentationTimings)
	{
		try {return (int)device.funcHandle__vkGetPastPresentationTimingGOOGLE.invokeExact(device.handle(), swapchain, pPresentationTimingCount, pPresentationTimings);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDiscardRectangleEXT(vulkan.VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, java.lang.foreign.MemorySegment pDiscardRectangles)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDiscardRectangleEXT.invokeExact(commandBuffer.handle(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDiscardRectangleEnableEXT(vulkan.VkCommandBuffer commandBuffer, int discardRectangleEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDiscardRectangleEnableEXT.invokeExact(commandBuffer.handle(), discardRectangleEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDiscardRectangleModeEXT(vulkan.VkCommandBuffer commandBuffer, int discardRectangleMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDiscardRectangleModeEXT.invokeExact(commandBuffer.handle(), discardRectangleMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkSetHdrMetadataEXT(vulkan.VkDevice device, int swapchainCount, java.lang.foreign.MemorySegment pSwapchains, java.lang.foreign.MemorySegment pMetadata)
	{
		try {device.funcHandle__vkSetHdrMetadataEXT.invokeExact(device.handle(), swapchainCount, pSwapchains, pMetadata);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetDebugUtilsObjectNameEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pNameInfo)
	{
		try {return (int)device.funcHandle__vkSetDebugUtilsObjectNameEXT.invokeExact(device.handle(), pNameInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetDebugUtilsObjectTagEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pTagInfo)
	{
		try {return (int)device.funcHandle__vkSetDebugUtilsObjectTagEXT.invokeExact(device.handle(), pTagInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkQueueBeginDebugUtilsLabelEXT(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pLabelInfo)
	{
		try {queue.device().funcHandle__vkQueueBeginDebugUtilsLabelEXT.invokeExact(queue.handle(), pLabelInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkQueueEndDebugUtilsLabelEXT(vulkan.VkQueue queue)
	{
		try {queue.device().funcHandle__vkQueueEndDebugUtilsLabelEXT.invokeExact(queue.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkQueueInsertDebugUtilsLabelEXT(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pLabelInfo)
	{
		try {queue.device().funcHandle__vkQueueInsertDebugUtilsLabelEXT.invokeExact(queue.handle(), pLabelInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBeginDebugUtilsLabelEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pLabelInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdBeginDebugUtilsLabelEXT.invokeExact(commandBuffer.handle(), pLabelInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdEndDebugUtilsLabelEXT(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdEndDebugUtilsLabelEXT.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdInsertDebugUtilsLabelEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pLabelInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdInsertDebugUtilsLabelEXT.invokeExact(commandBuffer.handle(), pLabelInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetSampleLocationsEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pSampleLocationsInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetSampleLocationsEXT.invokeExact(commandBuffer.handle(), pSampleLocationsInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetImageDrmFormatModifierPropertiesEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)device.funcHandle__vkGetImageDrmFormatModifierPropertiesEXT.invokeExact(device.handle(), image, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateValidationCacheEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pValidationCache)
	{
		try {return (int)device.funcHandle__vkCreateValidationCacheEXT.invokeExact(device.handle(), pCreateInfo, pAllocator, pValidationCache);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyValidationCacheEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment validationCache, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyValidationCacheEXT.invokeExact(device.handle(), validationCache, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkMergeValidationCachesEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment dstCache, int srcCacheCount, java.lang.foreign.MemorySegment pSrcCaches)
	{
		try {return (int)device.funcHandle__vkMergeValidationCachesEXT.invokeExact(device.handle(), dstCache, srcCacheCount, pSrcCaches);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetValidationCacheDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment validationCache, java.lang.foreign.MemorySegment pDataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetValidationCacheDataEXT.invokeExact(device.handle(), validationCache, pDataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindShadingRateImageNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment imageView, int imageLayout)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindShadingRateImageNV.invokeExact(commandBuffer.handle(), imageView, imageLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportShadingRatePaletteNV(vulkan.VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, java.lang.foreign.MemorySegment pShadingRatePalettes)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportShadingRatePaletteNV.invokeExact(commandBuffer.handle(), firstViewport, viewportCount, pShadingRatePalettes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoarseSampleOrderNV(vulkan.VkCommandBuffer commandBuffer, int sampleOrderType, int customSampleOrderCount, java.lang.foreign.MemorySegment pCustomSampleOrders)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoarseSampleOrderNV.invokeExact(commandBuffer.handle(), sampleOrderType, customSampleOrderCount, pCustomSampleOrders);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateAccelerationStructureNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pAccelerationStructure)
	{
		try {return (int)device.funcHandle__vkCreateAccelerationStructureNV.invokeExact(device.handle(), pCreateInfo, pAllocator, pAccelerationStructure);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyAccelerationStructureNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment accelerationStructure, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyAccelerationStructureNV.invokeExact(device.handle(), accelerationStructure, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetAccelerationStructureMemoryRequirementsNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetAccelerationStructureMemoryRequirementsNV.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindAccelerationStructureMemoryNV(vulkan.VkDevice device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos)
	{
		try {return (int)device.funcHandle__vkBindAccelerationStructureMemoryNV.invokeExact(device.handle(), bindInfoCount, pBindInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBuildAccelerationStructureNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment instanceData, long instanceOffset, int update, java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src, java.lang.foreign.MemorySegment scratch, long scratchOffset)
	{
		try {commandBuffer.device().funcHandle__vkCmdBuildAccelerationStructureNV.invokeExact(commandBuffer.handle(), pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyAccelerationStructureNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src, int mode)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyAccelerationStructureNV.invokeExact(commandBuffer.handle(), dst, src, mode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdTraceRaysNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, java.lang.foreign.MemorySegment missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, java.lang.foreign.MemorySegment hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, java.lang.foreign.MemorySegment callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth)
	{
		try {commandBuffer.device().funcHandle__vkCmdTraceRaysNV.invokeExact(commandBuffer.handle(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateRayTracingPipelinesNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipelineCache, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelines)
	{
		try {return (int)device.funcHandle__vkCreateRayTracingPipelinesNV.invokeExact(device.handle(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetRayTracingShaderGroupHandlesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int firstGroup, int groupCount, long dataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetRayTracingShaderGroupHandlesKHR.invokeExact(device.handle(), pipeline, firstGroup, groupCount, dataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetRayTracingShaderGroupHandlesNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int firstGroup, int groupCount, long dataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetRayTracingShaderGroupHandlesNV.invokeExact(device.handle(), pipeline, firstGroup, groupCount, dataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetAccelerationStructureHandleNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment accelerationStructure, long dataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetAccelerationStructureHandleNV.invokeExact(device.handle(), accelerationStructure, dataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteAccelerationStructuresPropertiesNV(vulkan.VkCommandBuffer commandBuffer, int accelerationStructureCount, java.lang.foreign.MemorySegment pAccelerationStructures, int queryType, java.lang.foreign.MemorySegment queryPool, int firstQuery)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteAccelerationStructuresPropertiesNV.invokeExact(commandBuffer.handle(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCompileDeferredNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int shader)
	{
		try {return (int)device.funcHandle__vkCompileDeferredNV.invokeExact(device.handle(), pipeline, shader);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetMemoryHostPointerPropertiesEXT(vulkan.VkDevice device, int handleType, java.lang.foreign.MemorySegment pHostPointer, java.lang.foreign.MemorySegment pMemoryHostPointerProperties)
	{
		try {return (int)device.funcHandle__vkGetMemoryHostPointerPropertiesEXT.invokeExact(device.handle(), handleType, pHostPointer, pMemoryHostPointerProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteBufferMarkerAMD(vulkan.VkCommandBuffer commandBuffer, int pipelineStage, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, int marker)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteBufferMarkerAMD.invokeExact(commandBuffer.handle(), pipelineStage, dstBuffer, dstOffset, marker);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetCalibratedTimestampsEXT(vulkan.VkDevice device, int timestampCount, java.lang.foreign.MemorySegment pTimestampInfos, java.lang.foreign.MemorySegment pTimestamps, java.lang.foreign.MemorySegment pMaxDeviation)
	{
		try {return (int)device.funcHandle__vkGetCalibratedTimestampsEXT.invokeExact(device.handle(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksNV(vulkan.VkCommandBuffer commandBuffer, int taskCount, int firstTask)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksNV.invokeExact(commandBuffer.handle(), taskCount, firstTask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksIndirectNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, int drawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksIndirectNV.invokeExact(commandBuffer.handle(), buffer, offset, drawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksIndirectCountNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksIndirectCountNV.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetExclusiveScissorEnableNV(vulkan.VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, java.lang.foreign.MemorySegment pExclusiveScissorEnables)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetExclusiveScissorEnableNV.invokeExact(commandBuffer.handle(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetExclusiveScissorNV(vulkan.VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, java.lang.foreign.MemorySegment pExclusiveScissors)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetExclusiveScissorNV.invokeExact(commandBuffer.handle(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCheckpointNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pCheckpointMarker)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCheckpointNV.invokeExact(commandBuffer.handle(), pCheckpointMarker);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetQueueCheckpointDataNV(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pCheckpointDataCount, java.lang.foreign.MemorySegment pCheckpointData)
	{
		try {queue.device().funcHandle__vkGetQueueCheckpointDataNV.invokeExact(queue.handle(), pCheckpointDataCount, pCheckpointData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkInitializePerformanceApiINTEL(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInitializeInfo)
	{
		try {return (int)device.funcHandle__vkInitializePerformanceApiINTEL.invokeExact(device.handle(), pInitializeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkUninitializePerformanceApiINTEL(vulkan.VkDevice device)
	{
		try {device.funcHandle__vkUninitializePerformanceApiINTEL.invokeExact(device.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCmdSetPerformanceMarkerINTEL(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pMarkerInfo)
	{
		try {return (int)commandBuffer.device().funcHandle__vkCmdSetPerformanceMarkerINTEL.invokeExact(commandBuffer.handle(), pMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCmdSetPerformanceStreamMarkerINTEL(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pMarkerInfo)
	{
		try {return (int)commandBuffer.device().funcHandle__vkCmdSetPerformanceStreamMarkerINTEL.invokeExact(commandBuffer.handle(), pMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCmdSetPerformanceOverrideINTEL(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pOverrideInfo)
	{
		try {return (int)commandBuffer.device().funcHandle__vkCmdSetPerformanceOverrideINTEL.invokeExact(commandBuffer.handle(), pOverrideInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkAcquirePerformanceConfigurationINTEL(vulkan.VkDevice device, java.lang.foreign.MemorySegment pAcquireInfo, java.lang.foreign.MemorySegment pConfiguration)
	{
		try {return (int)device.funcHandle__vkAcquirePerformanceConfigurationINTEL.invokeExact(device.handle(), pAcquireInfo, pConfiguration);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkReleasePerformanceConfigurationINTEL(vulkan.VkDevice device, java.lang.foreign.MemorySegment configuration)
	{
		try {return (int)device.funcHandle__vkReleasePerformanceConfigurationINTEL.invokeExact(device.handle(), configuration);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkQueueSetPerformanceConfigurationINTEL(vulkan.VkQueue queue, java.lang.foreign.MemorySegment configuration)
	{
		try {return (int)queue.device().funcHandle__vkQueueSetPerformanceConfigurationINTEL.invokeExact(queue.handle(), configuration);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPerformanceParameterINTEL(vulkan.VkDevice device, int parameter, java.lang.foreign.MemorySegment pValue)
	{
		try {return (int)device.funcHandle__vkGetPerformanceParameterINTEL.invokeExact(device.handle(), parameter, pValue);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkSetLocalDimmingAMD(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapChain, int localDimmingEnable)
	{
		try {device.funcHandle__vkSetLocalDimmingAMD.invokeExact(device.handle(), swapChain, localDimmingEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetBufferDeviceAddressEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetBufferDeviceAddressEXT.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLineStippleEXT(vulkan.VkCommandBuffer commandBuffer, int lineStippleFactor, short lineStipplePattern)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLineStippleEXT.invokeExact(commandBuffer.handle(), lineStippleFactor, lineStipplePattern);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkResetQueryPoolEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment queryPool, int firstQuery, int queryCount)
	{
		try {device.funcHandle__vkResetQueryPoolEXT.invokeExact(device.handle(), queryPool, firstQuery, queryCount);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCullModeEXT(vulkan.VkCommandBuffer commandBuffer, int cullMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCullModeEXT.invokeExact(commandBuffer.handle(), cullMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetFrontFaceEXT(vulkan.VkCommandBuffer commandBuffer, int frontFace)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetFrontFaceEXT.invokeExact(commandBuffer.handle(), frontFace);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPrimitiveTopologyEXT(vulkan.VkCommandBuffer commandBuffer, int primitiveTopology)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPrimitiveTopologyEXT.invokeExact(commandBuffer.handle(), primitiveTopology);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportWithCountEXT(vulkan.VkCommandBuffer commandBuffer, int viewportCount, java.lang.foreign.MemorySegment pViewports)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportWithCountEXT.invokeExact(commandBuffer.handle(), viewportCount, pViewports);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetScissorWithCountEXT(vulkan.VkCommandBuffer commandBuffer, int scissorCount, java.lang.foreign.MemorySegment pScissors)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetScissorWithCountEXT.invokeExact(commandBuffer.handle(), scissorCount, pScissors);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindVertexBuffers2EXT(vulkan.VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, java.lang.foreign.MemorySegment pBuffers, java.lang.foreign.MemorySegment pOffsets, java.lang.foreign.MemorySegment pSizes, java.lang.foreign.MemorySegment pStrides)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindVertexBuffers2EXT.invokeExact(commandBuffer.handle(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthTestEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthTestEnableEXT.invokeExact(commandBuffer.handle(), depthTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthWriteEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthWriteEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthWriteEnableEXT.invokeExact(commandBuffer.handle(), depthWriteEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthCompareOpEXT(vulkan.VkCommandBuffer commandBuffer, int depthCompareOp)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthCompareOpEXT.invokeExact(commandBuffer.handle(), depthCompareOp);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBoundsTestEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthBoundsTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBoundsTestEnableEXT.invokeExact(commandBuffer.handle(), depthBoundsTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilTestEnableEXT(vulkan.VkCommandBuffer commandBuffer, int stencilTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilTestEnableEXT.invokeExact(commandBuffer.handle(), stencilTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetStencilOpEXT(vulkan.VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetStencilOpEXT.invokeExact(commandBuffer.handle(), faceMask, failOp, passOp, depthFailOp, compareOp);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyMemoryToImageEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCopyMemoryToImageInfo)
	{
		try {return (int)device.funcHandle__vkCopyMemoryToImageEXT.invokeExact(device.handle(), pCopyMemoryToImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyImageToMemoryEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCopyImageToMemoryInfo)
	{
		try {return (int)device.funcHandle__vkCopyImageToMemoryEXT.invokeExact(device.handle(), pCopyImageToMemoryInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyImageToImageEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCopyImageToImageInfo)
	{
		try {return (int)device.funcHandle__vkCopyImageToImageEXT.invokeExact(device.handle(), pCopyImageToImageInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkTransitionImageLayoutEXT(vulkan.VkDevice device, int transitionCount, java.lang.foreign.MemorySegment pTransitions)
	{
		try {return (int)device.funcHandle__vkTransitionImageLayoutEXT.invokeExact(device.handle(), transitionCount, pTransitions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetImageSubresourceLayout2EXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pSubresource, java.lang.foreign.MemorySegment pLayout)
	{
		try {device.funcHandle__vkGetImageSubresourceLayout2EXT.invokeExact(device.handle(), image, pSubresource, pLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkReleaseSwapchainImagesEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pReleaseInfo)
	{
		try {return (int)device.funcHandle__vkReleaseSwapchainImagesEXT.invokeExact(device.handle(), pReleaseInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetGeneratedCommandsMemoryRequirementsNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetGeneratedCommandsMemoryRequirementsNV.invokeExact(device.handle(), pInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdPreprocessGeneratedCommandsNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pGeneratedCommandsInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdPreprocessGeneratedCommandsNV.invokeExact(commandBuffer.handle(), pGeneratedCommandsInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdExecuteGeneratedCommandsNV(vulkan.VkCommandBuffer commandBuffer, int isPreprocessed, java.lang.foreign.MemorySegment pGeneratedCommandsInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdExecuteGeneratedCommandsNV.invokeExact(commandBuffer.handle(), isPreprocessed, pGeneratedCommandsInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindPipelineShaderGroupNV(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment pipeline, int groupIndex)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindPipelineShaderGroupNV.invokeExact(commandBuffer.handle(), pipelineBindPoint, pipeline, groupIndex);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateIndirectCommandsLayoutNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pIndirectCommandsLayout)
	{
		try {return (int)device.funcHandle__vkCreateIndirectCommandsLayoutNV.invokeExact(device.handle(), pCreateInfo, pAllocator, pIndirectCommandsLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyIndirectCommandsLayoutNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment indirectCommandsLayout, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyIndirectCommandsLayoutNV.invokeExact(device.handle(), indirectCommandsLayout, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBias2EXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pDepthBiasInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBias2EXT.invokeExact(commandBuffer.handle(), pDepthBiasInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreatePrivateDataSlotEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPrivateDataSlot)
	{
		try {return (int)device.funcHandle__vkCreatePrivateDataSlotEXT.invokeExact(device.handle(), pCreateInfo, pAllocator, pPrivateDataSlot);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyPrivateDataSlotEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment privateDataSlot, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyPrivateDataSlotEXT.invokeExact(device.handle(), privateDataSlot, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetPrivateDataEXT(vulkan.VkDevice device, int objectType, long objectHandle, java.lang.foreign.MemorySegment privateDataSlot, long data)
	{
		try {return (int)device.funcHandle__vkSetPrivateDataEXT.invokeExact(device.handle(), objectType, objectHandle, privateDataSlot, data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetPrivateDataEXT(vulkan.VkDevice device, int objectType, long objectHandle, java.lang.foreign.MemorySegment privateDataSlot, java.lang.foreign.MemorySegment pData)
	{
		try {device.funcHandle__vkGetPrivateDataEXT.invokeExact(device.handle(), objectType, objectHandle, privateDataSlot, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetLayoutSizeEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment layout, java.lang.foreign.MemorySegment pLayoutSizeInBytes)
	{
		try {device.funcHandle__vkGetDescriptorSetLayoutSizeEXT.invokeExact(device.handle(), layout, pLayoutSizeInBytes);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetLayoutBindingOffsetEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment layout, int binding, java.lang.foreign.MemorySegment pOffset)
	{
		try {device.funcHandle__vkGetDescriptorSetLayoutBindingOffsetEXT.invokeExact(device.handle(), layout, binding, pOffset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pDescriptorInfo, long dataSize, java.lang.foreign.MemorySegment pDescriptor)
	{
		try {device.funcHandle__vkGetDescriptorEXT.invokeExact(device.handle(), pDescriptorInfo, dataSize, pDescriptor);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindDescriptorBuffersEXT(vulkan.VkCommandBuffer commandBuffer, int bufferCount, java.lang.foreign.MemorySegment pBindingInfos)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindDescriptorBuffersEXT.invokeExact(commandBuffer.handle(), bufferCount, pBindingInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDescriptorBufferOffsetsEXT(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int firstSet, int setCount, java.lang.foreign.MemorySegment pBufferIndices, java.lang.foreign.MemorySegment pOffsets)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDescriptorBufferOffsetsEXT.invokeExact(commandBuffer.handle(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int set)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindDescriptorBufferEmbeddedSamplersEXT.invokeExact(commandBuffer.handle(), pipelineBindPoint, layout, set);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetBufferOpaqueCaptureDescriptorDataEXT.invokeExact(device.handle(), pInfo, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetImageOpaqueCaptureDescriptorDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetImageOpaqueCaptureDescriptorDataEXT.invokeExact(device.handle(), pInfo, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetImageViewOpaqueCaptureDescriptorDataEXT.invokeExact(device.handle(), pInfo, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetSamplerOpaqueCaptureDescriptorDataEXT.invokeExact(device.handle(), pInfo, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.invokeExact(device.handle(), pInfo, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetFragmentShadingRateEnumNV(vulkan.VkCommandBuffer commandBuffer, int shadingRate, java.lang.foreign.MemorySegment combinerOps)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetFragmentShadingRateEnumNV.invokeExact(commandBuffer.handle(), shadingRate, combinerOps);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeviceFaultInfoEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pFaultCounts, java.lang.foreign.MemorySegment pFaultInfo)
	{
		try {return (int)device.funcHandle__vkGetDeviceFaultInfoEXT.invokeExact(device.handle(), pFaultCounts, pFaultInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetVertexInputEXT(vulkan.VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, java.lang.foreign.MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, java.lang.foreign.MemorySegment pVertexAttributeDescriptions)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetVertexInputEXT.invokeExact(commandBuffer.handle(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(vulkan.VkDevice device, java.lang.foreign.MemorySegment renderpass, java.lang.foreign.MemorySegment pMaxWorkgroupSize)
	{
		try {return (int)device.funcHandle__vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.invokeExact(device.handle(), renderpass, pMaxWorkgroupSize);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSubpassShadingHUAWEI(vulkan.VkCommandBuffer commandBuffer)
	{
		try {commandBuffer.device().funcHandle__vkCmdSubpassShadingHUAWEI.invokeExact(commandBuffer.handle());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindInvocationMaskHUAWEI(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment imageView, int imageLayout)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindInvocationMaskHUAWEI.invokeExact(commandBuffer.handle(), imageView, imageLayout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetMemoryRemoteAddressNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pMemoryGetRemoteAddressInfo, java.lang.foreign.MemorySegment pAddress)
	{
		try {return (int)device.funcHandle__vkGetMemoryRemoteAddressNV.invokeExact(device.handle(), pMemoryGetRemoteAddressInfo, pAddress);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetPipelinePropertiesEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pPipelineInfo, java.lang.foreign.MemorySegment pPipelineProperties)
	{
		try {return (int)device.funcHandle__vkGetPipelinePropertiesEXT.invokeExact(device.handle(), pPipelineInfo, pPipelineProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPatchControlPointsEXT(vulkan.VkCommandBuffer commandBuffer, int patchControlPoints)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPatchControlPointsEXT.invokeExact(commandBuffer.handle(), patchControlPoints);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRasterizerDiscardEnableEXT(vulkan.VkCommandBuffer commandBuffer, int rasterizerDiscardEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRasterizerDiscardEnableEXT.invokeExact(commandBuffer.handle(), rasterizerDiscardEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthBiasEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthBiasEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthBiasEnableEXT.invokeExact(commandBuffer.handle(), depthBiasEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLogicOpEXT(vulkan.VkCommandBuffer commandBuffer, int logicOp)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLogicOpEXT.invokeExact(commandBuffer.handle(), logicOp);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPrimitiveRestartEnableEXT(vulkan.VkCommandBuffer commandBuffer, int primitiveRestartEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPrimitiveRestartEnableEXT.invokeExact(commandBuffer.handle(), primitiveRestartEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetColorWriteEnableEXT(vulkan.VkCommandBuffer commandBuffer, int attachmentCount, java.lang.foreign.MemorySegment pColorWriteEnables)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetColorWriteEnableEXT.invokeExact(commandBuffer.handle(), attachmentCount, pColorWriteEnables);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMultiEXT(vulkan.VkCommandBuffer commandBuffer, int drawCount, java.lang.foreign.MemorySegment pVertexInfo, int instanceCount, int firstInstance, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMultiEXT.invokeExact(commandBuffer.handle(), drawCount, pVertexInfo, instanceCount, firstInstance, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMultiIndexedEXT(vulkan.VkCommandBuffer commandBuffer, int drawCount, java.lang.foreign.MemorySegment pIndexInfo, int instanceCount, int firstInstance, int stride, java.lang.foreign.MemorySegment pVertexOffset)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMultiIndexedEXT.invokeExact(commandBuffer.handle(), drawCount, pIndexInfo, instanceCount, firstInstance, stride, pVertexOffset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateMicromapEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pMicromap)
	{
		try {return (int)device.funcHandle__vkCreateMicromapEXT.invokeExact(device.handle(), pCreateInfo, pAllocator, pMicromap);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyMicromapEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment micromap, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyMicromapEXT.invokeExact(device.handle(), micromap, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBuildMicromapsEXT(vulkan.VkCommandBuffer commandBuffer, int infoCount, java.lang.foreign.MemorySegment pInfos)
	{
		try {commandBuffer.device().funcHandle__vkCmdBuildMicromapsEXT.invokeExact(commandBuffer.handle(), infoCount, pInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBuildMicromapsEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, int infoCount, java.lang.foreign.MemorySegment pInfos)
	{
		try {return (int)device.funcHandle__vkBuildMicromapsEXT.invokeExact(device.handle(), deferredOperation, infoCount, pInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyMicromapEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyMicromapEXT.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyMicromapToMemoryEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyMicromapToMemoryEXT.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyMemoryToMicromapEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyMemoryToMicromapEXT.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWriteMicromapsPropertiesEXT(vulkan.VkDevice device, int micromapCount, java.lang.foreign.MemorySegment pMicromaps, int queryType, long dataSize, java.lang.foreign.MemorySegment pData, long stride)
	{
		try {return (int)device.funcHandle__vkWriteMicromapsPropertiesEXT.invokeExact(device.handle(), micromapCount, pMicromaps, queryType, dataSize, pData, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMicromapEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMicromapEXT.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMicromapToMemoryEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMicromapToMemoryEXT.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMemoryToMicromapEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMemoryToMicromapEXT.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteMicromapsPropertiesEXT(vulkan.VkCommandBuffer commandBuffer, int micromapCount, java.lang.foreign.MemorySegment pMicromaps, int queryType, java.lang.foreign.MemorySegment queryPool, int firstQuery)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteMicromapsPropertiesEXT.invokeExact(commandBuffer.handle(), micromapCount, pMicromaps, queryType, queryPool, firstQuery);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceMicromapCompatibilityEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pVersionInfo, java.lang.foreign.MemorySegment pCompatibility)
	{
		try {device.funcHandle__vkGetDeviceMicromapCompatibilityEXT.invokeExact(device.handle(), pVersionInfo, pCompatibility);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetMicromapBuildSizesEXT(vulkan.VkDevice device, int buildType, java.lang.foreign.MemorySegment pBuildInfo, java.lang.foreign.MemorySegment pSizeInfo)
	{
		try {device.funcHandle__vkGetMicromapBuildSizesEXT.invokeExact(device.handle(), buildType, pBuildInfo, pSizeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawClusterHUAWEI(vulkan.VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawClusterHUAWEI.invokeExact(commandBuffer.handle(), groupCountX, groupCountY, groupCountZ);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawClusterIndirectHUAWEI(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawClusterIndirectHUAWEI.invokeExact(commandBuffer.handle(), buffer, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkSetDeviceMemoryPriorityEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment memory, float priority)
	{
		try {device.funcHandle__vkSetDeviceMemoryPriorityEXT.invokeExact(device.handle(), memory, priority);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(vulkan.VkDevice device, java.lang.foreign.MemorySegment pBindingReference, java.lang.foreign.MemorySegment pHostMapping)
	{
		try {device.funcHandle__vkGetDescriptorSetLayoutHostMappingInfoVALVE.invokeExact(device.handle(), pBindingReference, pHostMapping);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDescriptorSetHostMappingVALVE(vulkan.VkDevice device, java.lang.foreign.MemorySegment descriptorSet, java.lang.foreign.MemorySegment ppData)
	{
		try {device.funcHandle__vkGetDescriptorSetHostMappingVALVE.invokeExact(device.handle(), descriptorSet, ppData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMemoryIndirectNV(vulkan.VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMemoryIndirectNV.invokeExact(commandBuffer.handle(), copyBufferAddress, copyCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMemoryToImageIndirectNV(vulkan.VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, java.lang.foreign.MemorySegment pImageSubresources)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMemoryToImageIndirectNV.invokeExact(commandBuffer.handle(), copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDecompressMemoryNV(vulkan.VkCommandBuffer commandBuffer, int decompressRegionCount, java.lang.foreign.MemorySegment pDecompressMemoryRegions)
	{
		try {commandBuffer.device().funcHandle__vkCmdDecompressMemoryNV.invokeExact(commandBuffer.handle(), decompressRegionCount, pDecompressMemoryRegions);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDecompressMemoryIndirectCountNV(vulkan.VkCommandBuffer commandBuffer, long indirectCommandsAddress, long indirectCommandsCountAddress, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDecompressMemoryIndirectCountNV.invokeExact(commandBuffer.handle(), indirectCommandsAddress, indirectCommandsCountAddress, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetPipelineIndirectMemoryRequirementsNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pMemoryRequirements)
	{
		try {device.funcHandle__vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(device.handle(), pCreateInfo, pMemoryRequirements);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdUpdatePipelineIndirectBufferNV(vulkan.VkCommandBuffer commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment pipeline)
	{
		try {commandBuffer.device().funcHandle__vkCmdUpdatePipelineIndirectBufferNV.invokeExact(commandBuffer.handle(), pipelineBindPoint, pipeline);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetPipelineIndirectDeviceAddressNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetPipelineIndirectDeviceAddressNV.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetTessellationDomainOriginEXT(vulkan.VkCommandBuffer commandBuffer, int domainOrigin)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetTessellationDomainOriginEXT.invokeExact(commandBuffer.handle(), domainOrigin);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthClampEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthClampEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthClampEnableEXT.invokeExact(commandBuffer.handle(), depthClampEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetPolygonModeEXT(vulkan.VkCommandBuffer commandBuffer, int polygonMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetPolygonModeEXT.invokeExact(commandBuffer.handle(), polygonMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRasterizationSamplesEXT(vulkan.VkCommandBuffer commandBuffer, int rasterizationSamples)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRasterizationSamplesEXT.invokeExact(commandBuffer.handle(), rasterizationSamples);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetSampleMaskEXT(vulkan.VkCommandBuffer commandBuffer, int samples, java.lang.foreign.MemorySegment pSampleMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetSampleMaskEXT.invokeExact(commandBuffer.handle(), samples, pSampleMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetAlphaToCoverageEnableEXT(vulkan.VkCommandBuffer commandBuffer, int alphaToCoverageEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetAlphaToCoverageEnableEXT.invokeExact(commandBuffer.handle(), alphaToCoverageEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetAlphaToOneEnableEXT(vulkan.VkCommandBuffer commandBuffer, int alphaToOneEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetAlphaToOneEnableEXT.invokeExact(commandBuffer.handle(), alphaToOneEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLogicOpEnableEXT(vulkan.VkCommandBuffer commandBuffer, int logicOpEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLogicOpEnableEXT.invokeExact(commandBuffer.handle(), logicOpEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetColorBlendEnableEXT(vulkan.VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, java.lang.foreign.MemorySegment pColorBlendEnables)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetColorBlendEnableEXT.invokeExact(commandBuffer.handle(), firstAttachment, attachmentCount, pColorBlendEnables);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetColorBlendEquationEXT(vulkan.VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, java.lang.foreign.MemorySegment pColorBlendEquations)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetColorBlendEquationEXT.invokeExact(commandBuffer.handle(), firstAttachment, attachmentCount, pColorBlendEquations);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetColorWriteMaskEXT(vulkan.VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, java.lang.foreign.MemorySegment pColorWriteMasks)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetColorWriteMaskEXT.invokeExact(commandBuffer.handle(), firstAttachment, attachmentCount, pColorWriteMasks);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRasterizationStreamEXT(vulkan.VkCommandBuffer commandBuffer, int rasterizationStream)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRasterizationStreamEXT.invokeExact(commandBuffer.handle(), rasterizationStream);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetConservativeRasterizationModeEXT(vulkan.VkCommandBuffer commandBuffer, int conservativeRasterizationMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetConservativeRasterizationModeEXT.invokeExact(commandBuffer.handle(), conservativeRasterizationMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(vulkan.VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(commandBuffer.handle(), extraPrimitiveOverestimationSize);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthClipEnableEXT(vulkan.VkCommandBuffer commandBuffer, int depthClipEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthClipEnableEXT.invokeExact(commandBuffer.handle(), depthClipEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetSampleLocationsEnableEXT(vulkan.VkCommandBuffer commandBuffer, int sampleLocationsEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetSampleLocationsEnableEXT.invokeExact(commandBuffer.handle(), sampleLocationsEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetColorBlendAdvancedEXT(vulkan.VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, java.lang.foreign.MemorySegment pColorBlendAdvanced)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetColorBlendAdvancedEXT.invokeExact(commandBuffer.handle(), firstAttachment, attachmentCount, pColorBlendAdvanced);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetProvokingVertexModeEXT(vulkan.VkCommandBuffer commandBuffer, int provokingVertexMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetProvokingVertexModeEXT.invokeExact(commandBuffer.handle(), provokingVertexMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLineRasterizationModeEXT(vulkan.VkCommandBuffer commandBuffer, int lineRasterizationMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLineRasterizationModeEXT.invokeExact(commandBuffer.handle(), lineRasterizationMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetLineStippleEnableEXT(vulkan.VkCommandBuffer commandBuffer, int stippledLineEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetLineStippleEnableEXT.invokeExact(commandBuffer.handle(), stippledLineEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetDepthClipNegativeOneToOneEXT(vulkan.VkCommandBuffer commandBuffer, int negativeOneToOne)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(commandBuffer.handle(), negativeOneToOne);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportWScalingEnableNV(vulkan.VkCommandBuffer commandBuffer, int viewportWScalingEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportWScalingEnableNV.invokeExact(commandBuffer.handle(), viewportWScalingEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetViewportSwizzleNV(vulkan.VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, java.lang.foreign.MemorySegment pViewportSwizzles)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetViewportSwizzleNV.invokeExact(commandBuffer.handle(), firstViewport, viewportCount, pViewportSwizzles);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageToColorEnableNV(vulkan.VkCommandBuffer commandBuffer, int coverageToColorEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageToColorEnableNV.invokeExact(commandBuffer.handle(), coverageToColorEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageToColorLocationNV(vulkan.VkCommandBuffer commandBuffer, int coverageToColorLocation)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageToColorLocationNV.invokeExact(commandBuffer.handle(), coverageToColorLocation);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageModulationModeNV(vulkan.VkCommandBuffer commandBuffer, int coverageModulationMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageModulationModeNV.invokeExact(commandBuffer.handle(), coverageModulationMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageModulationTableEnableNV(vulkan.VkCommandBuffer commandBuffer, int coverageModulationTableEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageModulationTableEnableNV.invokeExact(commandBuffer.handle(), coverageModulationTableEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageModulationTableNV(vulkan.VkCommandBuffer commandBuffer, int coverageModulationTableCount, java.lang.foreign.MemorySegment pCoverageModulationTable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageModulationTableNV.invokeExact(commandBuffer.handle(), coverageModulationTableCount, pCoverageModulationTable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetShadingRateImageEnableNV(vulkan.VkCommandBuffer commandBuffer, int shadingRateImageEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetShadingRateImageEnableNV.invokeExact(commandBuffer.handle(), shadingRateImageEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRepresentativeFragmentTestEnableNV(vulkan.VkCommandBuffer commandBuffer, int representativeFragmentTestEnable)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(commandBuffer.handle(), representativeFragmentTestEnable);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetCoverageReductionModeNV(vulkan.VkCommandBuffer commandBuffer, int coverageReductionMode)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetCoverageReductionModeNV.invokeExact(commandBuffer.handle(), coverageReductionMode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetShaderModuleIdentifierEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment shaderModule, java.lang.foreign.MemorySegment pIdentifier)
	{
		try {device.funcHandle__vkGetShaderModuleIdentifierEXT.invokeExact(device.handle(), shaderModule, pIdentifier);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetShaderModuleCreateInfoIdentifierEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pIdentifier)
	{
		try {device.funcHandle__vkGetShaderModuleCreateInfoIdentifierEXT.invokeExact(device.handle(), pCreateInfo, pIdentifier);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateOpticalFlowSessionNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pSession)
	{
		try {return (int)device.funcHandle__vkCreateOpticalFlowSessionNV.invokeExact(device.handle(), pCreateInfo, pAllocator, pSession);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyOpticalFlowSessionNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment session, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyOpticalFlowSessionNV.invokeExact(device.handle(), session, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBindOpticalFlowSessionImageNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment session, int bindingPoint, java.lang.foreign.MemorySegment view, int layout)
	{
		try {return (int)device.funcHandle__vkBindOpticalFlowSessionImageNV.invokeExact(device.handle(), session, bindingPoint, view, layout);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdOpticalFlowExecuteNV(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment session, java.lang.foreign.MemorySegment pExecuteInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdOpticalFlowExecuteNV.invokeExact(commandBuffer.handle(), session, pExecuteInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateShadersEXT(vulkan.VkDevice device, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pShaders)
	{
		try {return (int)device.funcHandle__vkCreateShadersEXT.invokeExact(device.handle(), createInfoCount, pCreateInfos, pAllocator, pShaders);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyShaderEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment shader, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyShaderEXT.invokeExact(device.handle(), shader, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetShaderBinaryDataEXT(vulkan.VkDevice device, java.lang.foreign.MemorySegment shader, java.lang.foreign.MemorySegment pDataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetShaderBinaryDataEXT.invokeExact(device.handle(), shader, pDataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBindShadersEXT(vulkan.VkCommandBuffer commandBuffer, int stageCount, java.lang.foreign.MemorySegment pStages, java.lang.foreign.MemorySegment pShaders)
	{
		try {commandBuffer.device().funcHandle__vkCmdBindShadersEXT.invokeExact(commandBuffer.handle(), stageCount, pStages, pShaders);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetFramebufferTilePropertiesQCOM(vulkan.VkDevice device, java.lang.foreign.MemorySegment framebuffer, java.lang.foreign.MemorySegment pPropertiesCount, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)device.funcHandle__vkGetFramebufferTilePropertiesQCOM.invokeExact(device.handle(), framebuffer, pPropertiesCount, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetDynamicRenderingTilePropertiesQCOM(vulkan.VkDevice device, java.lang.foreign.MemorySegment pRenderingInfo, java.lang.foreign.MemorySegment pProperties)
	{
		try {return (int)device.funcHandle__vkGetDynamicRenderingTilePropertiesQCOM.invokeExact(device.handle(), pRenderingInfo, pProperties);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkSetLatencySleepModeNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pSleepModeInfo)
	{
		try {return (int)device.funcHandle__vkSetLatencySleepModeNV.invokeExact(device.handle(), swapchain, pSleepModeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkLatencySleepNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pSleepInfo)
	{
		try {return (int)device.funcHandle__vkLatencySleepNV.invokeExact(device.handle(), swapchain, pSleepInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkSetLatencyMarkerNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pLatencyMarkerInfo)
	{
		try {device.funcHandle__vkSetLatencyMarkerNV.invokeExact(device.handle(), swapchain, pLatencyMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetLatencyTimingsNV(vulkan.VkDevice device, java.lang.foreign.MemorySegment swapchain, java.lang.foreign.MemorySegment pTimingCount, java.lang.foreign.MemorySegment pLatencyMarkerInfo)
	{
		try {device.funcHandle__vkGetLatencyTimingsNV.invokeExact(device.handle(), swapchain, pTimingCount, pLatencyMarkerInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkQueueNotifyOutOfBandNV(vulkan.VkQueue queue, java.lang.foreign.MemorySegment pQueueTypeInfo)
	{
		try {queue.device().funcHandle__vkQueueNotifyOutOfBandNV.invokeExact(queue.handle(), pQueueTypeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(vulkan.VkCommandBuffer commandBuffer, int aspectMask)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetAttachmentFeedbackLoopEnableEXT.invokeExact(commandBuffer.handle(), aspectMask);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateAccelerationStructureKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pAccelerationStructure)
	{
		try {return (int)device.funcHandle__vkCreateAccelerationStructureKHR.invokeExact(device.handle(), pCreateInfo, pAllocator, pAccelerationStructure);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkDestroyAccelerationStructureKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment accelerationStructure, java.lang.foreign.MemorySegment pAllocator)
	{
		try {device.funcHandle__vkDestroyAccelerationStructureKHR.invokeExact(device.handle(), accelerationStructure, pAllocator);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBuildAccelerationStructuresKHR(vulkan.VkCommandBuffer commandBuffer, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment ppBuildRangeInfos)
	{
		try {commandBuffer.device().funcHandle__vkCmdBuildAccelerationStructuresKHR.invokeExact(commandBuffer.handle(), infoCount, pInfos, ppBuildRangeInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdBuildAccelerationStructuresIndirectKHR(vulkan.VkCommandBuffer commandBuffer, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment pIndirectDeviceAddresses, java.lang.foreign.MemorySegment pIndirectStrides, java.lang.foreign.MemorySegment ppMaxPrimitiveCounts)
	{
		try {commandBuffer.device().funcHandle__vkCmdBuildAccelerationStructuresIndirectKHR.invokeExact(commandBuffer.handle(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkBuildAccelerationStructuresKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment ppBuildRangeInfos)
	{
		try {return (int)device.funcHandle__vkBuildAccelerationStructuresKHR.invokeExact(device.handle(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyAccelerationStructureKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyAccelerationStructureKHR.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyAccelerationStructureToMemoryKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyAccelerationStructureToMemoryKHR.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCopyMemoryToAccelerationStructureKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (int)device.funcHandle__vkCopyMemoryToAccelerationStructureKHR.invokeExact(device.handle(), deferredOperation, pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkWriteAccelerationStructuresPropertiesKHR(vulkan.VkDevice device, int accelerationStructureCount, java.lang.foreign.MemorySegment pAccelerationStructures, int queryType, long dataSize, java.lang.foreign.MemorySegment pData, long stride)
	{
		try {return (int)device.funcHandle__vkWriteAccelerationStructuresPropertiesKHR.invokeExact(device.handle(), accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyAccelerationStructureKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyAccelerationStructureKHR.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyAccelerationStructureToMemoryKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyAccelerationStructureToMemoryKHR.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdCopyMemoryToAccelerationStructureKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pInfo)
	{
		try {commandBuffer.device().funcHandle__vkCmdCopyMemoryToAccelerationStructureKHR.invokeExact(commandBuffer.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetAccelerationStructureDeviceAddressKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pInfo)
	{
		try {return (long)device.funcHandle__vkGetAccelerationStructureDeviceAddressKHR.invokeExact(device.handle(), pInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdWriteAccelerationStructuresPropertiesKHR(vulkan.VkCommandBuffer commandBuffer, int accelerationStructureCount, java.lang.foreign.MemorySegment pAccelerationStructures, int queryType, java.lang.foreign.MemorySegment queryPool, int firstQuery)
	{
		try {commandBuffer.device().funcHandle__vkCmdWriteAccelerationStructuresPropertiesKHR.invokeExact(commandBuffer.handle(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetDeviceAccelerationStructureCompatibilityKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pVersionInfo, java.lang.foreign.MemorySegment pCompatibility)
	{
		try {device.funcHandle__vkGetDeviceAccelerationStructureCompatibilityKHR.invokeExact(device.handle(), pVersionInfo, pCompatibility);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkGetAccelerationStructureBuildSizesKHR(vulkan.VkDevice device, int buildType, java.lang.foreign.MemorySegment pBuildInfo, java.lang.foreign.MemorySegment pMaxPrimitiveCounts, java.lang.foreign.MemorySegment pSizeInfo)
	{
		try {device.funcHandle__vkGetAccelerationStructureBuildSizesKHR.invokeExact(device.handle(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdTraceRaysKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRaygenShaderBindingTable, java.lang.foreign.MemorySegment pMissShaderBindingTable, java.lang.foreign.MemorySegment pHitShaderBindingTable, java.lang.foreign.MemorySegment pCallableShaderBindingTable, int width, int height, int depth)
	{
		try {commandBuffer.device().funcHandle__vkCmdTraceRaysKHR.invokeExact(commandBuffer.handle(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkCreateRayTracingPipelinesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pipelineCache, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pPipelines)
	{
		try {return (int)device.funcHandle__vkCreateRayTracingPipelinesKHR.invokeExact(device.handle(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int firstGroup, int groupCount, long dataSize, java.lang.foreign.MemorySegment pData)
	{
		try {return (int)device.funcHandle__vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invokeExact(device.handle(), pipeline, firstGroup, groupCount, dataSize, pData);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdTraceRaysIndirectKHR(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment pRaygenShaderBindingTable, java.lang.foreign.MemorySegment pMissShaderBindingTable, java.lang.foreign.MemorySegment pHitShaderBindingTable, java.lang.foreign.MemorySegment pCallableShaderBindingTable, long indirectDeviceAddress)
	{
		try {commandBuffer.device().funcHandle__vkCmdTraceRaysIndirectKHR.invokeExact(commandBuffer.handle(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long vkGetRayTracingShaderGroupStackSizeKHR(vulkan.VkDevice device, java.lang.foreign.MemorySegment pipeline, int group, int groupShader)
	{
		try {return (long)device.funcHandle__vkGetRayTracingShaderGroupStackSizeKHR.invokeExact(device.handle(), pipeline, group, groupShader);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdSetRayTracingPipelineStackSizeKHR(vulkan.VkCommandBuffer commandBuffer, int pipelineStackSize)
	{
		try {commandBuffer.device().funcHandle__vkCmdSetRayTracingPipelineStackSizeKHR.invokeExact(commandBuffer.handle(), pipelineStackSize);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksEXT(vulkan.VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksEXT.invokeExact(commandBuffer.handle(), groupCountX, groupCountY, groupCountZ);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksIndirectEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, int drawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksIndirectEXT.invokeExact(commandBuffer.handle(), buffer, offset, drawCount, stride);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void vkCmdDrawMeshTasksIndirectCountEXT(vulkan.VkCommandBuffer commandBuffer, java.lang.foreign.MemorySegment buffer, long offset, java.lang.foreign.MemorySegment countBuffer, long countBufferOffset, int maxDrawCount, int stride)
	{
		try {commandBuffer.device().funcHandle__vkCmdDrawMeshTasksIndirectCountEXT.invokeExact(commandBuffer.handle(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);}
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
