/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public final class Index_h
{private Index_h() {}

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCString = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCString");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCString = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCString, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static java.lang.foreign.MemorySegment clang_getCString(fr.kenlek.jpgen.clang.CXString string)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getCString.invokeExact(string.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeString = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeString");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeString = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeString, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static void clang_disposeString(fr.kenlek.jpgen.clang.CXString string)
    {
        try {MTD__clang_disposeString.invokeExact(string.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeStringSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeStringSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeStringSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeStringSet, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeStringSet(java.lang.foreign.MemorySegment set)
    {
        try {MTD__clang_disposeStringSet.invokeExact(set);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getBuildSessionTimestamp = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getBuildSessionTimestamp");
    public static final java.lang.invoke.MethodHandle MTD__clang_getBuildSessionTimestamp = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getBuildSessionTimestamp, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG));
    public static long clang_getBuildSessionTimestamp()
    {
        try {return (long)MTD__clang_getBuildSessionTimestamp.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_create = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_create");
    public static final java.lang.invoke.MethodHandle MTD__clang_VirtualFileOverlay_create = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_create, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_VirtualFileOverlay_create(int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_VirtualFileOverlay_create.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_addFileMapping = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_addFileMapping");
    public static final java.lang.invoke.MethodHandle MTD__clang_VirtualFileOverlay_addFileMapping = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_addFileMapping, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_addFileMapping(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment virtualPath, java.lang.foreign.MemorySegment realPath)
    {
        try {return (int)MTD__clang_VirtualFileOverlay_addFileMapping.invokeExact($arg1, virtualPath, realPath);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_setCaseSensitivity = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_setCaseSensitivity");
    public static final java.lang.invoke.MethodHandle MTD__clang_VirtualFileOverlay_setCaseSensitivity = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_setCaseSensitivity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_VirtualFileOverlay_setCaseSensitivity(java.lang.foreign.MemorySegment $arg1, int caseSensitive)
    {
        try {return (int)MTD__clang_VirtualFileOverlay_setCaseSensitivity.invokeExact($arg1, caseSensitive);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_writeToBuffer = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_writeToBuffer");
    public static final java.lang.invoke.MethodHandle MTD__clang_VirtualFileOverlay_writeToBuffer = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_writeToBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_writeToBuffer(java.lang.foreign.MemorySegment $arg1, int options, java.lang.foreign.MemorySegment out_buffer_ptr, java.lang.foreign.MemorySegment out_buffer_size)
    {
        try {return (int)MTD__clang_VirtualFileOverlay_writeToBuffer.invokeExact($arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_free = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_free");
    public static final java.lang.invoke.MethodHandle MTD__clang_free = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_free, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_free(java.lang.foreign.MemorySegment buffer)
    {
        try {MTD__clang_free.invokeExact(buffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_VirtualFileOverlay_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_VirtualFileOverlay_dispose(java.lang.foreign.MemorySegment $arg1)
    {
        try {MTD__clang_VirtualFileOverlay_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_create = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_create");
    public static final java.lang.invoke.MethodHandle MTD__clang_ModuleMapDescriptor_create = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_create, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_ModuleMapDescriptor_create(int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_ModuleMapDescriptor_create.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_setFrameworkModuleName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_setFrameworkModuleName");
    public static final java.lang.invoke.MethodHandle MTD__clang_ModuleMapDescriptor_setFrameworkModuleName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_setFrameworkModuleName, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD__clang_ModuleMapDescriptor_setFrameworkModuleName.invokeExact($arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_setUmbrellaHeader = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_setUmbrellaHeader");
    public static final java.lang.invoke.MethodHandle MTD__clang_ModuleMapDescriptor_setUmbrellaHeader = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_setUmbrellaHeader, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD__clang_ModuleMapDescriptor_setUmbrellaHeader.invokeExact($arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_writeToBuffer = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_writeToBuffer");
    public static final java.lang.invoke.MethodHandle MTD__clang_ModuleMapDescriptor_writeToBuffer = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_writeToBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_writeToBuffer(java.lang.foreign.MemorySegment $arg1, int options, java.lang.foreign.MemorySegment out_buffer_ptr, java.lang.foreign.MemorySegment out_buffer_size)
    {
        try {return (int)MTD__clang_ModuleMapDescriptor_writeToBuffer.invokeExact($arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_ModuleMapDescriptor_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_ModuleMapDescriptor_dispose(java.lang.foreign.MemorySegment $arg1)
    {
        try {MTD__clang_ModuleMapDescriptor_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFileName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFileName");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFileName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getFileName(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment SFile)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getFileName.invokeExact($segmentAllocator, SFile));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFileTime = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFileTime");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFileTime = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileTime, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static long clang_getFileTime(java.lang.foreign.MemorySegment SFile)
    {
        try {return (long)MTD__clang_getFileTime.invokeExact(SFile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFileUniqueID = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFileUniqueID");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFileUniqueID = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileUniqueID, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getFileUniqueID(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment outID)
    {
        try {return (int)MTD__clang_getFileUniqueID.invokeExact(file, outID);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_File_isEqual = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_File_isEqual");
    public static final java.lang.invoke.MethodHandle MTD__clang_File_isEqual = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_File_isEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_File_isEqual(java.lang.foreign.MemorySegment file1, java.lang.foreign.MemorySegment file2)
    {
        try {return (int)MTD__clang_File_isEqual.invokeExact(file1, file2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_File_tryGetRealPathName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_File_tryGetRealPathName");
    public static final java.lang.invoke.MethodHandle MTD__clang_File_tryGetRealPathName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_File_tryGetRealPathName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_File_tryGetRealPathName(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment file)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_File_tryGetRealPathName.invokeExact($segmentAllocator, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNullLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNullLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNullLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getNullLocation(java.lang.foreign.SegmentAllocator $segmentAllocator)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getNullLocation.invokeExact($segmentAllocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_equalLocations = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_equalLocations");
    public static final java.lang.invoke.MethodHandle MTD__clang_equalLocations = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalLocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static int clang_equalLocations(fr.kenlek.jpgen.clang.CXSourceLocation loc1, fr.kenlek.jpgen.clang.CXSourceLocation loc2)
    {
        try {return (int)MTD__clang_equalLocations.invokeExact(loc1.ptr(), loc2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Location_isInSystemHeader = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Location_isInSystemHeader");
    public static final java.lang.invoke.MethodHandle MTD__clang_Location_isInSystemHeader = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Location_isInSystemHeader, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static int clang_Location_isInSystemHeader(fr.kenlek.jpgen.clang.CXSourceLocation location)
    {
        try {return (int)MTD__clang_Location_isInSystemHeader.invokeExact(location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Location_isFromMainFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Location_isFromMainFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_Location_isFromMainFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Location_isFromMainFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static int clang_Location_isFromMainFile(fr.kenlek.jpgen.clang.CXSourceLocation location)
    {
        try {return (int)MTD__clang_Location_isFromMainFile.invokeExact(location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNullRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNullRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNullRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getNullRange(java.lang.foreign.SegmentAllocator $segmentAllocator)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getNullRange.invokeExact($segmentAllocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_getRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getRange(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXSourceLocation begin, fr.kenlek.jpgen.clang.CXSourceLocation end)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getRange.invokeExact($segmentAllocator, begin.ptr(), end.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_equalRanges = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_equalRanges");
    public static final java.lang.invoke.MethodHandle MTD__clang_equalRanges = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalRanges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout));
    public static int clang_equalRanges(fr.kenlek.jpgen.clang.CXSourceRange range1, fr.kenlek.jpgen.clang.CXSourceRange range2)
    {
        try {return (int)MTD__clang_equalRanges.invokeExact(range1.ptr(), range2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Range_isNull = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Range_isNull");
    public static final java.lang.invoke.MethodHandle MTD__clang_Range_isNull = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Range_isNull, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout));
    public static int clang_Range_isNull(fr.kenlek.jpgen.clang.CXSourceRange range)
    {
        try {return (int)MTD__clang_Range_isNull.invokeExact(range.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getExpansionLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getExpansionLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getExpansionLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getExpansionLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getExpansionLocation(fr.kenlek.jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD__clang_getExpansionLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getPresumedLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getPresumedLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getPresumedLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getPresumedLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getPresumedLocation(fr.kenlek.jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column)
    {
        try {MTD__clang_getPresumedLocation.invokeExact(location.ptr(), filename, line, column);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getInstantiationLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getInstantiationLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getInstantiationLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getInstantiationLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getInstantiationLocation(fr.kenlek.jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD__clang_getInstantiationLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getSpellingLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getSpellingLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getSpellingLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSpellingLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getSpellingLocation(fr.kenlek.jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD__clang_getSpellingLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFileLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFileLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFileLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getFileLocation(fr.kenlek.jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD__clang_getFileLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getRangeStart = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getRangeStart");
    public static final java.lang.invoke.MethodHandle MTD__clang_getRangeStart = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRangeStart, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getRangeStart(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXSourceRange range)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getRangeStart.invokeExact($segmentAllocator, range.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getRangeEnd = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getRangeEnd");
    public static final java.lang.invoke.MethodHandle MTD__clang_getRangeEnd = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRangeEnd, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getRangeEnd(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXSourceRange range)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getRangeEnd.invokeExact($segmentAllocator, range.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeSourceRangeList = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeSourceRangeList");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeSourceRangeList = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeSourceRangeList, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeSourceRangeList(java.lang.foreign.MemorySegment ranges)
    {
        try {MTD__clang_disposeSourceRangeList.invokeExact(ranges);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumDiagnosticsInSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumDiagnosticsInSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumDiagnosticsInSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumDiagnosticsInSet, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getNumDiagnosticsInSet(java.lang.foreign.MemorySegment Diags)
    {
        try {return (int)MTD__clang_getNumDiagnosticsInSet.invokeExact(Diags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticInSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticInSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticInSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticInSet, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_getDiagnosticInSet(java.lang.foreign.MemorySegment Diags, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticInSet.invokeExact(Diags, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_loadDiagnostics = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_loadDiagnostics");
    public static final java.lang.invoke.MethodHandle MTD__clang_loadDiagnostics = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_loadDiagnostics, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_loadDiagnostics(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment errorString)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_loadDiagnostics.invokeExact(file, error, errorString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeDiagnosticSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeDiagnosticSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeDiagnosticSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeDiagnosticSet, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeDiagnosticSet(java.lang.foreign.MemorySegment Diags)
    {
        try {MTD__clang_disposeDiagnosticSet.invokeExact(Diags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getChildDiagnostics = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getChildDiagnostics");
    public static final java.lang.invoke.MethodHandle MTD__clang_getChildDiagnostics = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getChildDiagnostics, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getChildDiagnostics(java.lang.foreign.MemorySegment D)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getChildDiagnostics.invokeExact(D);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeDiagnostic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeDiagnostic");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeDiagnostic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeDiagnostic, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeDiagnostic(java.lang.foreign.MemorySegment Diagnostic)
    {
        try {MTD__clang_disposeDiagnostic.invokeExact(Diagnostic);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_formatDiagnostic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_formatDiagnostic");
    public static final java.lang.invoke.MethodHandle MTD__clang_formatDiagnostic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_formatDiagnostic, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_formatDiagnostic(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Diagnostic, int Options)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_formatDiagnostic.invokeExact($segmentAllocator, Diagnostic, Options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_defaultDiagnosticDisplayOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_defaultDiagnosticDisplayOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_defaultDiagnosticDisplayOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultDiagnosticDisplayOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_defaultDiagnosticDisplayOptions()
    {
        try {return (int)MTD__clang_defaultDiagnosticDisplayOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticSeverity = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSeverity");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticSeverity = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSeverity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getDiagnosticSeverity(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_getDiagnosticSeverity.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getDiagnosticLocation(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticLocation.invokeExact($segmentAllocator, $arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getDiagnosticSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticSpelling.invokeExact($segmentAllocator, $arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticOption = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticOption");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticOption = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticOption, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getDiagnosticOption(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Diag, java.lang.foreign.MemorySegment Disable)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticOption.invokeExact($segmentAllocator, Diag, Disable));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticCategory = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategory");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticCategory = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getDiagnosticCategory(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_getDiagnosticCategory.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticCategoryName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategoryName");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticCategoryName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategoryName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getDiagnosticCategoryName(java.lang.foreign.SegmentAllocator $segmentAllocator, int Category)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticCategoryName.invokeExact($segmentAllocator, Category));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticCategoryText = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategoryText");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticCategoryText = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategoryText, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getDiagnosticCategoryText(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticCategoryText.invokeExact($segmentAllocator, $arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticNumRanges = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticNumRanges");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticNumRanges = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticNumRanges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumRanges(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_getDiagnosticNumRanges.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getDiagnosticRange(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Diagnostic, int Range)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticRange.invokeExact($segmentAllocator, Diagnostic, Range));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticNumFixIts = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticNumFixIts");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticNumFixIts = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticNumFixIts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumFixIts(java.lang.foreign.MemorySegment Diagnostic)
    {
        try {return (int)MTD__clang_getDiagnosticNumFixIts.invokeExact(Diagnostic);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticFixIt = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticFixIt");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticFixIt = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticFixIt, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getDiagnosticFixIt(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Diagnostic, int FixIt, java.lang.foreign.MemorySegment ReplacementRange)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticFixIt.invokeExact($segmentAllocator, Diagnostic, FixIt, ReplacementRange));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createIndex = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createIndex");
    public static final java.lang.invoke.MethodHandle MTD__clang_createIndex = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createIndex, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_createIndex.invokeExact(excludeDeclarationsFromPCH, displayDiagnostics);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeIndex = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeIndex");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeIndex = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeIndex, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeIndex(java.lang.foreign.MemorySegment index)
    {
        try {MTD__clang_disposeIndex.invokeExact(index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createIndexWithOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createIndexWithOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_createIndexWithOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createIndexWithOptions, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_createIndexWithOptions(java.lang.foreign.MemorySegment options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_createIndexWithOptions.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXIndex_setGlobalOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_setGlobalOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXIndex_setGlobalOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_setGlobalOptions, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_CXIndex_setGlobalOptions(java.lang.foreign.MemorySegment $arg1, int options)
    {
        try {MTD__clang_CXIndex_setGlobalOptions.invokeExact($arg1, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXIndex_getGlobalOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_getGlobalOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXIndex_getGlobalOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_getGlobalOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_CXIndex_getGlobalOptions(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_CXIndex_getGlobalOptions.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXIndex_setInvocationEmissionPathOption = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_setInvocationEmissionPathOption");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXIndex_setInvocationEmissionPathOption = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_setInvocationEmissionPathOption, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_CXIndex_setInvocationEmissionPathOption(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment Path)
    {
        try {MTD__clang_CXIndex_setInvocationEmissionPathOption.invokeExact($arg1, Path);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isFileMultipleIncludeGuarded = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isFileMultipleIncludeGuarded");
    public static final java.lang.invoke.MethodHandle MTD__clang_isFileMultipleIncludeGuarded = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isFileMultipleIncludeGuarded, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_isFileMultipleIncludeGuarded(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
    {
        try {return (int)MTD__clang_isFileMultipleIncludeGuarded.invokeExact(tu, file);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFile, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getFile(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file_name)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getFile.invokeExact(tu, file_name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFileContents = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFileContents");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFileContents = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileContents, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getFileContents(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment size)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getFileContents.invokeExact(tu, file, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getLocation(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int line, int column)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getLocation.invokeExact($segmentAllocator, tu, file, line, column));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getLocationForOffset = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getLocationForOffset");
    public static final java.lang.invoke.MethodHandle MTD__clang_getLocationForOffset = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getLocationForOffset, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getLocationForOffset(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int offset)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getLocationForOffset.invokeExact($segmentAllocator, tu, file, offset));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getSkippedRanges = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getSkippedRanges");
    public static final java.lang.invoke.MethodHandle MTD__clang_getSkippedRanges = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSkippedRanges, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getSkippedRanges(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getSkippedRanges.invokeExact(tu, file);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getAllSkippedRanges = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getAllSkippedRanges");
    public static final java.lang.invoke.MethodHandle MTD__clang_getAllSkippedRanges = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getAllSkippedRanges, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getAllSkippedRanges(java.lang.foreign.MemorySegment tu)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getAllSkippedRanges.invokeExact(tu);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumDiagnostics = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumDiagnostics");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumDiagnostics = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumDiagnostics, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getNumDiagnostics(java.lang.foreign.MemorySegment Unit)
    {
        try {return (int)MTD__clang_getNumDiagnostics.invokeExact(Unit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnostic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnostic");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnostic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnostic, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_getDiagnostic(java.lang.foreign.MemorySegment Unit, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getDiagnostic.invokeExact(Unit, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDiagnosticSetFromTU = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSetFromTU");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDiagnosticSetFromTU = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSetFromTU, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getDiagnosticSetFromTU(java.lang.foreign.MemorySegment Unit)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getDiagnosticSetFromTU.invokeExact(Unit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTranslationUnitSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTranslationUnitSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getTranslationUnitSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment CTUnit)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getTranslationUnitSpelling.invokeExact($segmentAllocator, CTUnit));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createTranslationUnitFromSourceFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnitFromSourceFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_createTranslationUnitFromSourceFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnitFromSourceFile, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_createTranslationUnitFromSourceFile(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, int num_clang_command_line_args, java.lang.foreign.MemorySegment clang_command_line_args, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_createTranslationUnitFromSourceFile.invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_createTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnit, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_createTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_createTranslationUnit.invokeExact(CIdx, ast_filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createTranslationUnit2 = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnit2");
    public static final java.lang.invoke.MethodHandle MTD__clang_createTranslationUnit2 = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnit2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_createTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD__clang_createTranslationUnit2.invokeExact(CIdx, ast_filename, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_defaultEditingTranslationUnitOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_defaultEditingTranslationUnitOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_defaultEditingTranslationUnitOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultEditingTranslationUnitOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_defaultEditingTranslationUnitOptions()
    {
        try {return (int)MTD__clang_defaultEditingTranslationUnitOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_parseTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_parseTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_parseTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_parseTranslationUnit.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_parseTranslationUnit2 = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit2");
    public static final java.lang.invoke.MethodHandle MTD__clang_parseTranslationUnit2 = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD__clang_parseTranslationUnit2.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_parseTranslationUnit2FullArgv = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit2FullArgv");
    public static final java.lang.invoke.MethodHandle MTD__clang_parseTranslationUnit2FullArgv = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit2FullArgv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2FullArgv(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD__clang_parseTranslationUnit2FullArgv.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_defaultSaveOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_defaultSaveOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_defaultSaveOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultSaveOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_defaultSaveOptions(java.lang.foreign.MemorySegment TU)
    {
        try {return (int)MTD__clang_defaultSaveOptions.invokeExact(TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_saveTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_saveTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_saveTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_saveTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_saveTranslationUnit(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment FileName, int options)
    {
        try {return (int)MTD__clang_saveTranslationUnit.invokeExact(TU, FileName, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_suspendTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_suspendTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_suspendTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_suspendTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_suspendTranslationUnit(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_suspendTranslationUnit.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeTranslationUnit, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeTranslationUnit(java.lang.foreign.MemorySegment $arg1)
    {
        try {MTD__clang_disposeTranslationUnit.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_defaultReparseOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_defaultReparseOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_defaultReparseOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultReparseOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_defaultReparseOptions(java.lang.foreign.MemorySegment TU)
    {
        try {return (int)MTD__clang_defaultReparseOptions.invokeExact(TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_reparseTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_reparseTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_reparseTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_reparseTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_reparseTranslationUnit(java.lang.foreign.MemorySegment TU, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files, int options)
    {
        try {return (int)MTD__clang_reparseTranslationUnit.invokeExact(TU, num_unsaved_files, unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTUResourceUsageName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTUResourceUsageName");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTUResourceUsageName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTUResourceUsageName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_getTUResourceUsageName(int kind)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getTUResourceUsageName.invokeExact(kind);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCXTUResourceUsage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCXTUResourceUsage");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCXTUResourceUsage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCXTUResourceUsage, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXTUResourceUsage clang_getCXTUResourceUsage(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment TU)
    {
        try {return new fr.kenlek.jpgen.clang.CXTUResourceUsage((java.lang.foreign.MemorySegment)MTD__clang_getCXTUResourceUsage.invokeExact($segmentAllocator, TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeCXTUResourceUsage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeCXTUResourceUsage");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeCXTUResourceUsage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXTUResourceUsage, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage.layout));
    public static void clang_disposeCXTUResourceUsage(fr.kenlek.jpgen.clang.CXTUResourceUsage usage)
    {
        try {MTD__clang_disposeCXTUResourceUsage.invokeExact(usage.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTranslationUnitTargetInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitTargetInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTranslationUnitTargetInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitTargetInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getTranslationUnitTargetInfo(java.lang.foreign.MemorySegment CTUnit)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getTranslationUnitTargetInfo.invokeExact(CTUnit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_TargetInfo_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_TargetInfo_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_TargetInfo_dispose(java.lang.foreign.MemorySegment Info)
    {
        try {MTD__clang_TargetInfo_dispose.invokeExact(Info);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_TargetInfo_getTriple = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_getTriple");
    public static final java.lang.invoke.MethodHandle MTD__clang_TargetInfo_getTriple = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_getTriple, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_TargetInfo_getTriple(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Info)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_TargetInfo_getTriple.invokeExact($segmentAllocator, Info));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_TargetInfo_getPointerWidth = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_getPointerWidth");
    public static final java.lang.invoke.MethodHandle MTD__clang_TargetInfo_getPointerWidth = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_getPointerWidth, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_TargetInfo_getPointerWidth(java.lang.foreign.MemorySegment Info)
    {
        try {return (int)MTD__clang_TargetInfo_getPointerWidth.invokeExact(Info);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNullCursor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNullCursor");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNullCursor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullCursor, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getNullCursor(java.lang.foreign.SegmentAllocator $segmentAllocator)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getNullCursor.invokeExact($segmentAllocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTranslationUnitCursor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitCursor");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTranslationUnitCursor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitCursor, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getTranslationUnitCursor(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getTranslationUnitCursor.invokeExact($segmentAllocator, $arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_equalCursors = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_equalCursors");
    public static final java.lang.invoke.MethodHandle MTD__clang_equalCursors = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalCursors, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_equalCursors(fr.kenlek.jpgen.clang.CXCursor $arg1, fr.kenlek.jpgen.clang.CXCursor $arg2)
    {
        try {return (int)MTD__clang_equalCursors.invokeExact($arg1.ptr(), $arg2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isNull = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isNull");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isNull = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isNull, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isNull(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_Cursor_isNull.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_hashCursor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_hashCursor");
    public static final java.lang.invoke.MethodHandle MTD__clang_hashCursor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_hashCursor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_hashCursor(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_hashCursor.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorKind(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_getCursorKind.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isDeclaration = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isDeclaration");
    public static final java.lang.invoke.MethodHandle MTD__clang_isDeclaration = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isDeclaration, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isDeclaration(int $arg1)
    {
        try {return (int)MTD__clang_isDeclaration.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isInvalidDeclaration = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isInvalidDeclaration");
    public static final java.lang.invoke.MethodHandle MTD__clang_isInvalidDeclaration = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isInvalidDeclaration, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_isInvalidDeclaration(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_isInvalidDeclaration.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isReference = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isReference");
    public static final java.lang.invoke.MethodHandle MTD__clang_isReference = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isReference, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isReference(int $arg1)
    {
        try {return (int)MTD__clang_isReference.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isExpression = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isExpression");
    public static final java.lang.invoke.MethodHandle MTD__clang_isExpression = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isExpression, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isExpression(int $arg1)
    {
        try {return (int)MTD__clang_isExpression.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isStatement = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isStatement");
    public static final java.lang.invoke.MethodHandle MTD__clang_isStatement = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isStatement, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isStatement(int $arg1)
    {
        try {return (int)MTD__clang_isStatement.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isAttribute = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isAttribute");
    public static final java.lang.invoke.MethodHandle MTD__clang_isAttribute = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isAttribute, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isAttribute(int $arg1)
    {
        try {return (int)MTD__clang_isAttribute.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_hasAttrs = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasAttrs");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_hasAttrs = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasAttrs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_hasAttrs(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_hasAttrs.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isInvalid = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isInvalid");
    public static final java.lang.invoke.MethodHandle MTD__clang_isInvalid = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isInvalid, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isInvalid(int $arg1)
    {
        try {return (int)MTD__clang_isInvalid.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_isTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isTranslationUnit(int $arg1)
    {
        try {return (int)MTD__clang_isTranslationUnit.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isPreprocessing = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isPreprocessing");
    public static final java.lang.invoke.MethodHandle MTD__clang_isPreprocessing = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isPreprocessing, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isPreprocessing(int $arg1)
    {
        try {return (int)MTD__clang_isPreprocessing.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isUnexposed = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isUnexposed");
    public static final java.lang.invoke.MethodHandle MTD__clang_isUnexposed = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isUnexposed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_isUnexposed(int $arg1)
    {
        try {return (int)MTD__clang_isUnexposed.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorLinkage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorLinkage");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorLinkage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLinkage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorLinkage(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorLinkage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorVisibility = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorVisibility");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorVisibility = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorVisibility, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorVisibility(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorVisibility.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorAvailability = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorAvailability");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorAvailability = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorAvailability(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorAvailability.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorPlatformAvailability = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorPlatformAvailability");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorPlatformAvailability = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPlatformAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_getCursorPlatformAvailability(fr.kenlek.jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment always_deprecated, java.lang.foreign.MemorySegment deprecated_message, java.lang.foreign.MemorySegment always_unavailable, java.lang.foreign.MemorySegment unavailable_message, java.lang.foreign.MemorySegment availability, int availability_size)
    {
        try {return (int)MTD__clang_getCursorPlatformAvailability.invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeCXPlatformAvailability = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeCXPlatformAvailability");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeCXPlatformAvailability = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXPlatformAvailability, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeCXPlatformAvailability(java.lang.foreign.MemorySegment availability)
    {
        try {MTD__clang_disposeCXPlatformAvailability.invokeExact(availability);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getVarDeclInitializer = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getVarDeclInitializer");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getVarDeclInitializer = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getVarDeclInitializer, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_Cursor_getVarDeclInitializer(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getVarDeclInitializer.invokeExact($segmentAllocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_hasVarDeclGlobalStorage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasVarDeclGlobalStorage");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_hasVarDeclGlobalStorage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasVarDeclGlobalStorage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_hasVarDeclGlobalStorage(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_Cursor_hasVarDeclGlobalStorage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_hasVarDeclExternalStorage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasVarDeclExternalStorage");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_hasVarDeclExternalStorage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasVarDeclExternalStorage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_hasVarDeclExternalStorage(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_Cursor_hasVarDeclExternalStorage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorLanguage = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorLanguage");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorLanguage = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLanguage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorLanguage(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorLanguage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorTLSKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorTLSKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorTLSKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorTLSKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorTLSKind(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorTLSKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTranslationUnit, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_Cursor_getTranslationUnit(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Cursor_getTranslationUnit.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_createCXCursorSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_createCXCursorSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_createCXCursorSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createCXCursorSet, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_createCXCursorSet()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_createCXCursorSet.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeCXCursorSet = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeCXCursorSet");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeCXCursorSet = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXCursorSet, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeCXCursorSet(java.lang.foreign.MemorySegment cset)
    {
        try {MTD__clang_disposeCXCursorSet.invokeExact(cset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXCursorSet_contains = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXCursorSet_contains");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXCursorSet_contains = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXCursorSet_contains, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXCursorSet_contains(java.lang.foreign.MemorySegment cset, fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_CXCursorSet_contains.invokeExact(cset, cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXCursorSet_insert = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXCursorSet_insert");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXCursorSet_insert = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXCursorSet_insert, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXCursorSet_insert(java.lang.foreign.MemorySegment cset, fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_CXCursorSet_insert.invokeExact(cset, cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorSemanticParent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorSemanticParent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorSemanticParent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorSemanticParent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCursorSemanticParent(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCursorSemanticParent.invokeExact($segmentAllocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorLexicalParent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorLexicalParent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorLexicalParent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLexicalParent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCursorLexicalParent(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCursorLexicalParent.invokeExact($segmentAllocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getOverriddenCursors = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getOverriddenCursors");
    public static final java.lang.invoke.MethodHandle MTD__clang_getOverriddenCursors = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getOverriddenCursors, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getOverriddenCursors(fr.kenlek.jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment overridden, java.lang.foreign.MemorySegment num_overridden)
    {
        try {MTD__clang_getOverriddenCursors.invokeExact(cursor.ptr(), overridden, num_overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeOverriddenCursors = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeOverriddenCursors");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeOverriddenCursors = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeOverriddenCursors, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeOverriddenCursors(java.lang.foreign.MemorySegment overridden)
    {
        try {MTD__clang_disposeOverriddenCursors.invokeExact(overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getIncludedFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getIncludedFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_getIncludedFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getIncludedFile, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_getIncludedFile(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getIncludedFile.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursor");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursor, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCursor(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1, fr.kenlek.jpgen.clang.CXSourceLocation $arg2)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCursor.invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getCursorLocation(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getCursorLocation.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorExtent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorExtent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorExtent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorExtent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getCursorExtent(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getCursorExtent.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getCursorType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getCursorType.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTypeSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTypeSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTypeSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getTypeSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType CT)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getTypeSpelling.invokeExact($segmentAllocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTypedefDeclUnderlyingType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTypedefDeclUnderlyingType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTypedefDeclUnderlyingType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypedefDeclUnderlyingType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getTypedefDeclUnderlyingType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getTypedefDeclUnderlyingType.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getEnumDeclIntegerType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getEnumDeclIntegerType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getEnumDeclIntegerType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumDeclIntegerType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getEnumDeclIntegerType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getEnumDeclIntegerType.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getEnumConstantDeclValue = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getEnumConstantDeclValue");
    public static final java.lang.invoke.MethodHandle MTD__clang_getEnumConstantDeclValue = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumConstantDeclValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static long clang_getEnumConstantDeclValue(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (long)MTD__clang_getEnumConstantDeclValue.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getEnumConstantDeclUnsignedValue = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getEnumConstantDeclUnsignedValue");
    public static final java.lang.invoke.MethodHandle MTD__clang_getEnumConstantDeclUnsignedValue = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumConstantDeclUnsignedValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static long clang_getEnumConstantDeclUnsignedValue(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (long)MTD__clang_getEnumConstantDeclUnsignedValue.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isBitField = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isBitField");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isBitField = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isBitField, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isBitField(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isBitField.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFieldDeclBitWidth = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFieldDeclBitWidth");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFieldDeclBitWidth = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFieldDeclBitWidth, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getFieldDeclBitWidth(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_getFieldDeclBitWidth.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getNumArguments = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getNumArguments");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getNumArguments = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getNumArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getNumArguments(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_getNumArguments.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getArgument = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getArgument");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getArgument = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getArgument, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXCursor clang_Cursor_getArgument(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C, int i)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getArgument.invokeExact($segmentAllocator, C.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getNumTemplateArguments = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getNumTemplateArguments");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getNumTemplateArguments = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getNumTemplateArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getNumTemplateArguments(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_getNumTemplateArguments.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getTemplateArgumentKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_Cursor_getTemplateArgumentKind(fr.kenlek.jpgen.clang.CXCursor C, int I)
    {
        try {return (int)MTD__clang_Cursor_getTemplateArgumentKind.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getTemplateArgumentType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXType clang_Cursor_getTemplateArgumentType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C, int I)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getTemplateArgumentType.invokeExact($segmentAllocator, C.ptr(), I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentValue = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentValue");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getTemplateArgumentValue = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentValue(fr.kenlek.jpgen.clang.CXCursor C, int I)
    {
        try {return (long)MTD__clang_Cursor_getTemplateArgumentValue.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentUnsignedValue = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentUnsignedValue");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getTemplateArgumentUnsignedValue = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentUnsignedValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(fr.kenlek.jpgen.clang.CXCursor C, int I)
    {
        try {return (long)MTD__clang_Cursor_getTemplateArgumentUnsignedValue.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_equalTypes = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_equalTypes");
    public static final java.lang.invoke.MethodHandle MTD__clang_equalTypes = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalTypes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_equalTypes(fr.kenlek.jpgen.clang.CXType A, fr.kenlek.jpgen.clang.CXType B)
    {
        try {return (int)MTD__clang_equalTypes.invokeExact(A.ptr(), B.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCanonicalType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCanonicalType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCanonicalType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCanonicalType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getCanonicalType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getCanonicalType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isConstQualifiedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isConstQualifiedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_isConstQualifiedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isConstQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_isConstQualifiedType(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_isConstQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isMacroFunctionLike = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isMacroFunctionLike");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isMacroFunctionLike = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isMacroFunctionLike, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isMacroFunctionLike(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isMacroFunctionLike.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isMacroBuiltin = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isMacroBuiltin");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isMacroBuiltin = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isMacroBuiltin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isMacroBuiltin(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isMacroBuiltin.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isFunctionInlined = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isFunctionInlined");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isFunctionInlined = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isFunctionInlined, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isFunctionInlined(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isFunctionInlined.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isVolatileQualifiedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isVolatileQualifiedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_isVolatileQualifiedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isVolatileQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_isVolatileQualifiedType(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_isVolatileQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isRestrictQualifiedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isRestrictQualifiedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_isRestrictQualifiedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isRestrictQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_isRestrictQualifiedType(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_isRestrictQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getAddressSpace = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getAddressSpace");
    public static final java.lang.invoke.MethodHandle MTD__clang_getAddressSpace = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getAddressSpace, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_getAddressSpace(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_getAddressSpace.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTypedefName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTypedefName");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTypedefName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypedefName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getTypedefName(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType CT)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getTypedefName.invokeExact($segmentAllocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getPointeeType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getPointeeType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getPointeeType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getPointeeType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getPointeeType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getPointeeType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getUnqualifiedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getUnqualifiedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getUnqualifiedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getUnqualifiedType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getUnqualifiedType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType CT)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getUnqualifiedType.invokeExact($segmentAllocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNonReferenceType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNonReferenceType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNonReferenceType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNonReferenceType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getNonReferenceType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType CT)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getNonReferenceType.invokeExact($segmentAllocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTypeDeclaration = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTypeDeclaration");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTypeDeclaration = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeDeclaration, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getTypeDeclaration(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getTypeDeclaration.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDeclObjCTypeEncoding = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDeclObjCTypeEncoding");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDeclObjCTypeEncoding = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDeclObjCTypeEncoding, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getDeclObjCTypeEncoding(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getDeclObjCTypeEncoding.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getObjCEncoding = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCEncoding");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getObjCEncoding = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCEncoding, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Type_getObjCEncoding(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType type)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Type_getObjCEncoding.invokeExact($segmentAllocator, type.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTypeKindSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTypeKindSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTypeKindSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeKindSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getTypeKindSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, int K)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getTypeKindSpelling.invokeExact($segmentAllocator, K));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getFunctionTypeCallingConv = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getFunctionTypeCallingConv");
    public static final java.lang.invoke.MethodHandle MTD__clang_getFunctionTypeCallingConv = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFunctionTypeCallingConv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_getFunctionTypeCallingConv(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_getFunctionTypeCallingConv.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getResultType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getResultType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getResultType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getResultType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getResultType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getResultType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getExceptionSpecificationType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getExceptionSpecificationType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getExceptionSpecificationType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getExceptionSpecificationType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_getExceptionSpecificationType(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_getExceptionSpecificationType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumArgTypes = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumArgTypes");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumArgTypes = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumArgTypes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_getNumArgTypes(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_getNumArgTypes.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getArgType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getArgType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getArgType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArgType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXType clang_getArgType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T, int i)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getArgType.invokeExact($segmentAllocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getObjCObjectBaseType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCObjectBaseType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getObjCObjectBaseType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCObjectBaseType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getObjCObjectBaseType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getObjCObjectBaseType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getNumObjCProtocolRefs = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumObjCProtocolRefs");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getNumObjCProtocolRefs = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumObjCProtocolRefs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_getNumObjCProtocolRefs(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_getNumObjCProtocolRefs.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getObjCProtocolDecl = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCProtocolDecl");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getObjCProtocolDecl = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCProtocolDecl, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXCursor clang_Type_getObjCProtocolDecl(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T, int i)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_Type_getObjCProtocolDecl.invokeExact($segmentAllocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getNumObjCTypeArgs = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumObjCTypeArgs");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getNumObjCTypeArgs = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumObjCTypeArgs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_getNumObjCTypeArgs(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_getNumObjCTypeArgs.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getObjCTypeArg = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCTypeArg");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getObjCTypeArg = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCTypeArg, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getObjCTypeArg(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T, int i)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getObjCTypeArg.invokeExact($segmentAllocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isFunctionTypeVariadic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isFunctionTypeVariadic");
    public static final java.lang.invoke.MethodHandle MTD__clang_isFunctionTypeVariadic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isFunctionTypeVariadic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_isFunctionTypeVariadic(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_isFunctionTypeVariadic.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorResultType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorResultType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorResultType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorResultType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getCursorResultType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getCursorResultType.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorExceptionSpecificationType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorExceptionSpecificationType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorExceptionSpecificationType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorExceptionSpecificationType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorExceptionSpecificationType(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_getCursorExceptionSpecificationType.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isPODType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isPODType");
    public static final java.lang.invoke.MethodHandle MTD__clang_isPODType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isPODType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_isPODType(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_isPODType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getElementType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getElementType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getElementType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getElementType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getElementType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getElementType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumElements = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumElements");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumElements = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumElements, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static long clang_getNumElements(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (long)MTD__clang_getNumElements.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getArrayElementType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getArrayElementType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getArrayElementType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArrayElementType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getArrayElementType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getArrayElementType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getArraySize = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getArraySize");
    public static final java.lang.invoke.MethodHandle MTD__clang_getArraySize = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArraySize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static long clang_getArraySize(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (long)MTD__clang_getArraySize.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getNamedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getNamedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getNamedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNamedType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getNamedType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getNamedType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_isTransparentTagTypedef = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_isTransparentTagTypedef");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_isTransparentTagTypedef = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_isTransparentTagTypedef, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_isTransparentTagTypedef(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_isTransparentTagTypedef.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getNullability = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getNullability");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getNullability = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNullability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_getNullability(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_getNullability.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getAlignOf = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getAlignOf");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getAlignOf = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getAlignOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static long clang_Type_getAlignOf(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (long)MTD__clang_Type_getAlignOf.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getClassType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getClassType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getClassType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getClassType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getClassType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getClassType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getSizeOf = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getSizeOf");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getSizeOf = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getSizeOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static long clang_Type_getSizeOf(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (long)MTD__clang_Type_getSizeOf.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getOffsetOf = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getOffsetOf");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getOffsetOf = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getOffsetOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static long clang_Type_getOffsetOf(fr.kenlek.jpgen.clang.CXType T, java.lang.foreign.MemorySegment S)
    {
        try {return (long)MTD__clang_Type_getOffsetOf.invokeExact(T.ptr(), S);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getModifiedType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getModifiedType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getModifiedType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getModifiedType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getModifiedType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getModifiedType.invokeExact($segmentAllocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getValueType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getValueType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getValueType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getValueType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getValueType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType CT)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getValueType.invokeExact($segmentAllocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getOffsetOfField = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getOffsetOfField");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getOffsetOfField = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getOffsetOfField, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static long clang_Cursor_getOffsetOfField(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (long)MTD__clang_Cursor_getOffsetOfField.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isAnonymous = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isAnonymous");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isAnonymous = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isAnonymous, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isAnonymous(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isAnonymous.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isAnonymousRecordDecl = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isAnonymousRecordDecl");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isAnonymousRecordDecl = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isAnonymousRecordDecl, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isAnonymousRecordDecl(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isAnonymousRecordDecl.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isInlineNamespace = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isInlineNamespace");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isInlineNamespace = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isInlineNamespace, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isInlineNamespace(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isInlineNamespace.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getNumTemplateArguments = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumTemplateArguments");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getNumTemplateArguments = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumTemplateArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_getNumTemplateArguments(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_getNumTemplateArguments.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getTemplateArgumentAsType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getTemplateArgumentAsType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getTemplateArgumentAsType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getTemplateArgumentAsType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXType clang_Type_getTemplateArgumentAsType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXType T, int i)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Type_getTemplateArgumentAsType.invokeExact($segmentAllocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_getCXXRefQualifier = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_getCXXRefQualifier");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_getCXXRefQualifier = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getCXXRefQualifier, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    public static int clang_Type_getCXXRefQualifier(fr.kenlek.jpgen.clang.CXType T)
    {
        try {return (int)MTD__clang_Type_getCXXRefQualifier.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isVirtualBase = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isVirtualBase");
    public static final java.lang.invoke.MethodHandle MTD__clang_isVirtualBase = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isVirtualBase, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_isVirtualBase(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_isVirtualBase.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCXXAccessSpecifier = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCXXAccessSpecifier");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCXXAccessSpecifier = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCXXAccessSpecifier, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCXXAccessSpecifier(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_getCXXAccessSpecifier.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getBinaryOpcode = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBinaryOpcode");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getBinaryOpcode = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBinaryOpcode, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getBinaryOpcode(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_getBinaryOpcode.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getBinaryOpcodeStr = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBinaryOpcodeStr");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getBinaryOpcodeStr = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBinaryOpcodeStr, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getBinaryOpcodeStr(java.lang.foreign.SegmentAllocator $segmentAllocator, int Op)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getBinaryOpcodeStr.invokeExact($segmentAllocator, Op));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getStorageClass = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getStorageClass");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getStorageClass = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getStorageClass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getStorageClass(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_Cursor_getStorageClass.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumOverloadedDecls = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumOverloadedDecls");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumOverloadedDecls = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumOverloadedDecls, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getNumOverloadedDecls(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getNumOverloadedDecls.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getOverloadedDecl = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getOverloadedDecl");
    public static final java.lang.invoke.MethodHandle MTD__clang_getOverloadedDecl = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getOverloadedDecl, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getOverloadedDecl(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor cursor, int index)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getOverloadedDecl.invokeExact($segmentAllocator, cursor.ptr(), index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getIBOutletCollectionType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getIBOutletCollectionType");
    public static final java.lang.invoke.MethodHandle MTD__clang_getIBOutletCollectionType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getIBOutletCollectionType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_getIBOutletCollectionType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_getIBOutletCollectionType.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_visitChildren = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_visitChildren");
    public static final java.lang.invoke.MethodHandle MTD__clang_visitChildren = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_visitChildren, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_visitChildren(fr.kenlek.jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {return (int)MTD__clang_visitChildren.invokeExact(parent.ptr(), visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_visitChildrenWithBlock = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_visitChildrenWithBlock");
    public static final java.lang.invoke.MethodHandle MTD__clang_visitChildrenWithBlock = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_visitChildrenWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_visitChildrenWithBlock(fr.kenlek.jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment block)
    {
        try {return (int)MTD__clang_visitChildrenWithBlock.invokeExact(parent.ptr(), block);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorUSR = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorUSR");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorUSR = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorUSR, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getCursorUSR(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCursorUSR.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCClass = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCClass");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCClass = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCClass, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCClass(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment class_name)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCClass.invokeExact($segmentAllocator, class_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCCategory = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCCategory");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCCategory = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCCategory, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCCategory(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment class_name, java.lang.foreign.MemorySegment category_name)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCCategory.invokeExact($segmentAllocator, class_name, category_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCProtocol = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCProtocol");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCProtocol = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCProtocol, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCProtocol(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment protocol_name)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCProtocol.invokeExact($segmentAllocator, protocol_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCIvar = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCIvar");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCIvar = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCIvar, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCIvar(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment name, fr.kenlek.jpgen.clang.CXString classUSR)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCIvar.invokeExact($segmentAllocator, name, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCMethod = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCMethod");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCMethod = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCMethod, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCMethod(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment name, int isInstanceMethod, fr.kenlek.jpgen.clang.CXString classUSR)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCMethod.invokeExact($segmentAllocator, name, isInstanceMethod, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCProperty = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCProperty");
    public static final java.lang.invoke.MethodHandle MTD__clang_constructUSR_ObjCProperty = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCProperty, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_constructUSR_ObjCProperty(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment property, fr.kenlek.jpgen.clang.CXString classUSR)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_constructUSR_ObjCProperty.invokeExact($segmentAllocator, property, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getCursorSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCursorSpelling.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getSpellingNameRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getSpellingNameRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getSpellingNameRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getSpellingNameRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_Cursor_getSpellingNameRange(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1, int pieceIndex, int options)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getSpellingNameRange.invokeExact($segmentAllocator, $arg1.ptr(), pieceIndex, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_PrintingPolicy_getProperty = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_getProperty");
    public static final java.lang.invoke.MethodHandle MTD__clang_PrintingPolicy_getProperty = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_getProperty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_PrintingPolicy_getProperty(java.lang.foreign.MemorySegment Policy, int Property)
    {
        try {return (int)MTD__clang_PrintingPolicy_getProperty.invokeExact(Policy, Property);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_PrintingPolicy_setProperty = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_setProperty");
    public static final java.lang.invoke.MethodHandle MTD__clang_PrintingPolicy_setProperty = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_setProperty, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_PrintingPolicy_setProperty(java.lang.foreign.MemorySegment Policy, int Property, int Value)
    {
        try {MTD__clang_PrintingPolicy_setProperty.invokeExact(Policy, Property, Value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorPrintingPolicy = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorPrintingPolicy");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorPrintingPolicy = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPrintingPolicy, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_getCursorPrintingPolicy(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getCursorPrintingPolicy.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_PrintingPolicy_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_PrintingPolicy_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_PrintingPolicy_dispose(java.lang.foreign.MemorySegment Policy)
    {
        try {MTD__clang_PrintingPolicy_dispose.invokeExact(Policy);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorPrettyPrinted = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorPrettyPrinted");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorPrettyPrinted = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPrettyPrinted, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getCursorPrettyPrinted(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor Cursor, java.lang.foreign.MemorySegment Policy)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCursorPrettyPrinted.invokeExact($segmentAllocator, Cursor.ptr(), Policy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorDisplayName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorDisplayName");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorDisplayName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorDisplayName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getCursorDisplayName(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCursorDisplayName.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorReferenced = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorReferenced");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorReferenced = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorReferenced, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCursorReferenced(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCursorReferenced.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorDefinition = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorDefinition");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorDefinition = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorDefinition, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCursorDefinition(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCursorDefinition.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_isCursorDefinition = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_isCursorDefinition");
    public static final java.lang.invoke.MethodHandle MTD__clang_isCursorDefinition = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isCursorDefinition, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_isCursorDefinition(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_isCursorDefinition.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCanonicalCursor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCanonicalCursor");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCanonicalCursor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCanonicalCursor, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getCanonicalCursor(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getCanonicalCursor.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCSelectorIndex = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCSelectorIndex");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCSelectorIndex = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCSelectorIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getObjCSelectorIndex(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (int)MTD__clang_Cursor_getObjCSelectorIndex.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isDynamicCall = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isDynamicCall");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isDynamicCall = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isDynamicCall, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isDynamicCall(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isDynamicCall.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getReceiverType = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getReceiverType");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getReceiverType = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getReceiverType, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXType clang_Cursor_getReceiverType(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getReceiverType.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertyAttributes = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertyAttributes");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCPropertyAttributes = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertyAttributes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_Cursor_getObjCPropertyAttributes(fr.kenlek.jpgen.clang.CXCursor C, int reserved)
    {
        try {return (int)MTD__clang_Cursor_getObjCPropertyAttributes.invokeExact(C.ptr(), reserved);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertyGetterName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertyGetterName");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCPropertyGetterName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertyGetterName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getObjCPropertyGetterName(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getObjCPropertyGetterName.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertySetterName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertySetterName");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCPropertySetterName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertySetterName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getObjCPropertySetterName(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getObjCPropertySetterName.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCDeclQualifiers = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCDeclQualifiers");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCDeclQualifiers = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCDeclQualifiers, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_getObjCDeclQualifiers(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_getObjCDeclQualifiers.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isObjCOptional = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isObjCOptional");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isObjCOptional = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isObjCOptional, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isObjCOptional(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isObjCOptional.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isVariadic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isVariadic");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isVariadic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isVariadic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_Cursor_isVariadic(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_Cursor_isVariadic.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_isExternalSymbol = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isExternalSymbol");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_isExternalSymbol = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isExternalSymbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_Cursor_isExternalSymbol(fr.kenlek.jpgen.clang.CXCursor C, java.lang.foreign.MemorySegment language, java.lang.foreign.MemorySegment definedIn, java.lang.foreign.MemorySegment isGenerated)
    {
        try {return (int)MTD__clang_Cursor_isExternalSymbol.invokeExact(C.ptr(), language, definedIn, isGenerated);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getCommentRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getCommentRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getCommentRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getCommentRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_Cursor_getCommentRange(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getCommentRange.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getRawCommentText = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getRawCommentText");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getRawCommentText = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getRawCommentText, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getRawCommentText(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getRawCommentText.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getBriefCommentText = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBriefCommentText");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getBriefCommentText = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBriefCommentText, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getBriefCommentText(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getBriefCommentText.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getMangling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getMangling");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getMangling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getMangling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_Cursor_getMangling(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Cursor_getMangling.invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getCXXManglings = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getCXXManglings");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getCXXManglings = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getCXXManglings, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_Cursor_getCXXManglings(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Cursor_getCXXManglings.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getObjCManglings = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCManglings");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getObjCManglings = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCManglings, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_Cursor_getObjCManglings(fr.kenlek.jpgen.clang.CXCursor $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Cursor_getObjCManglings.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_getModule = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getModule");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_getModule = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getModule, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_Cursor_getModule(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Cursor_getModule.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getModuleForFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getModuleForFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_getModuleForFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getModuleForFile, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getModuleForFile(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment $arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getModuleForFile.invokeExact($arg1, $arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getASTFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getASTFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getASTFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getASTFile, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_Module_getASTFile(java.lang.foreign.MemorySegment Module)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Module_getASTFile.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getParent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getParent");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getParent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getParent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_Module_getParent(java.lang.foreign.MemorySegment Module)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Module_getParent.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getName");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_Module_getName(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Module)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Module_getName.invokeExact($segmentAllocator, Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getFullName = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getFullName");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getFullName = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getFullName, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_Module_getFullName(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Module)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_Module_getFullName.invokeExact($segmentAllocator, Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_isSystem = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_isSystem");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_isSystem = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_isSystem, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_Module_isSystem(java.lang.foreign.MemorySegment Module)
    {
        try {return (int)MTD__clang_Module_isSystem.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getNumTopLevelHeaders = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getNumTopLevelHeaders");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getNumTopLevelHeaders = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getNumTopLevelHeaders, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_Module_getNumTopLevelHeaders(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment Module)
    {
        try {return (int)MTD__clang_Module_getNumTopLevelHeaders.invokeExact($arg1, Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Module_getTopLevelHeader = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Module_getTopLevelHeader");
    public static final java.lang.invoke.MethodHandle MTD__clang_Module_getTopLevelHeader = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getTopLevelHeader, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_Module_getTopLevelHeader(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment Module, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Module_getTopLevelHeader.invokeExact($arg1, Module, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXConstructor_isConvertingConstructor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isConvertingConstructor");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXConstructor_isConvertingConstructor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isConvertingConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXConstructor_isConvertingConstructor(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXConstructor_isConvertingConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXConstructor_isCopyConstructor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isCopyConstructor");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXConstructor_isCopyConstructor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isCopyConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXConstructor_isCopyConstructor(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXConstructor_isCopyConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXConstructor_isDefaultConstructor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isDefaultConstructor");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXConstructor_isDefaultConstructor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isDefaultConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXConstructor_isDefaultConstructor(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXConstructor_isDefaultConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXConstructor_isMoveConstructor = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isMoveConstructor");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXConstructor_isMoveConstructor = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isMoveConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXConstructor_isMoveConstructor(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXConstructor_isMoveConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXField_isMutable = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXField_isMutable");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXField_isMutable = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXField_isMutable, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXField_isMutable(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXField_isMutable.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isDefaulted = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isDefaulted");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isDefaulted = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isDefaulted, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isDefaulted(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isDefaulted.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isDeleted = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isDeleted");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isDeleted = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isDeleted, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isDeleted(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isDeleted.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isPureVirtual = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isPureVirtual");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isPureVirtual = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isPureVirtual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isPureVirtual(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isPureVirtual.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isStatic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isStatic");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isStatic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isStatic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isStatic(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isStatic.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isVirtual = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isVirtual");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isVirtual = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isVirtual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isVirtual(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isVirtual.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isCopyAssignmentOperator = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isCopyAssignmentOperator");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isCopyAssignmentOperator = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isCopyAssignmentOperator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isCopyAssignmentOperator(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isCopyAssignmentOperator.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isMoveAssignmentOperator = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isMoveAssignmentOperator");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isMoveAssignmentOperator = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isMoveAssignmentOperator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isMoveAssignmentOperator(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isMoveAssignmentOperator.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isExplicit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isExplicit");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isExplicit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isExplicit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isExplicit(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isExplicit.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXRecord_isAbstract = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXRecord_isAbstract");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXRecord_isAbstract = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXRecord_isAbstract, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXRecord_isAbstract(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXRecord_isAbstract.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EnumDecl_isScoped = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EnumDecl_isScoped");
    public static final java.lang.invoke.MethodHandle MTD__clang_EnumDecl_isScoped = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EnumDecl_isScoped, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_EnumDecl_isScoped(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_EnumDecl_isScoped.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_CXXMethod_isConst = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isConst");
    public static final java.lang.invoke.MethodHandle MTD__clang_CXXMethod_isConst = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isConst, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_CXXMethod_isConst(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_CXXMethod_isConst.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTemplateCursorKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTemplateCursorKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTemplateCursorKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTemplateCursorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getTemplateCursorKind(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (int)MTD__clang_getTemplateCursorKind.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getSpecializedCursorTemplate = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getSpecializedCursorTemplate");
    public static final java.lang.invoke.MethodHandle MTD__clang_getSpecializedCursorTemplate = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSpecializedCursorTemplate, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static fr.kenlek.jpgen.clang.CXCursor clang_getSpecializedCursorTemplate(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return new fr.kenlek.jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD__clang_getSpecializedCursorTemplate.invokeExact($segmentAllocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorReferenceNameRange = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorReferenceNameRange");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorReferenceNameRange = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorReferenceNameRange, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getCursorReferenceNameRange(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXCursor C, int NameFlags, int PieceIndex)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getCursorReferenceNameRange.invokeExact($segmentAllocator, C.ptr(), NameFlags, PieceIndex));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getToken = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getToken");
    public static final java.lang.invoke.MethodHandle MTD__clang_getToken = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getToken, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    public static java.lang.foreign.MemorySegment clang_getToken(java.lang.foreign.MemorySegment TU, fr.kenlek.jpgen.clang.CXSourceLocation Location)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getToken.invokeExact(TU, Location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTokenKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTokenKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTokenKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXToken.layout));
    public static int clang_getTokenKind(fr.kenlek.jpgen.clang.CXToken $arg1)
    {
        try {return (int)MTD__clang_getTokenKind.invokeExact($arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTokenSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTokenSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTokenSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXToken.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getTokenSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1, fr.kenlek.jpgen.clang.CXToken $arg2)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getTokenSpelling.invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTokenLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTokenLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTokenLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXToken.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_getTokenLocation(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1, fr.kenlek.jpgen.clang.CXToken $arg2)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_getTokenLocation.invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getTokenExtent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getTokenExtent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getTokenExtent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenExtent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXToken.layout));
    public static fr.kenlek.jpgen.clang.CXSourceRange clang_getTokenExtent(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment $arg1, fr.kenlek.jpgen.clang.CXToken $arg2)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD__clang_getTokenExtent.invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_tokenize = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_tokenize");
    public static final java.lang.invoke.MethodHandle MTD__clang_tokenize = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_tokenize, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_tokenize(java.lang.foreign.MemorySegment TU, fr.kenlek.jpgen.clang.CXSourceRange Range, java.lang.foreign.MemorySegment Tokens, java.lang.foreign.MemorySegment NumTokens)
    {
        try {MTD__clang_tokenize.invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_annotateTokens = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_annotateTokens");
    public static final java.lang.invoke.MethodHandle MTD__clang_annotateTokens = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_annotateTokens, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_annotateTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens, java.lang.foreign.MemorySegment Cursors)
    {
        try {MTD__clang_annotateTokens.invokeExact(TU, Tokens, NumTokens, Cursors);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeTokens = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeTokens");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeTokens = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeTokens, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_disposeTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens)
    {
        try {MTD__clang_disposeTokens.invokeExact(TU, Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorKindSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorKindSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorKindSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorKindSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getCursorKindSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, int Kind)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCursorKindSpelling.invokeExact($segmentAllocator, Kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getDefinitionSpellingAndExtent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getDefinitionSpellingAndExtent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getDefinitionSpellingAndExtent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDefinitionSpellingAndExtent, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getDefinitionSpellingAndExtent(fr.kenlek.jpgen.clang.CXCursor $arg1, java.lang.foreign.MemorySegment startBuf, java.lang.foreign.MemorySegment endBuf, java.lang.foreign.MemorySegment startLine, java.lang.foreign.MemorySegment startColumn, java.lang.foreign.MemorySegment endLine, java.lang.foreign.MemorySegment endColumn)
    {
        try {MTD__clang_getDefinitionSpellingAndExtent.invokeExact($arg1.ptr(), startBuf, endBuf, startLine, startColumn, endLine, endColumn);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_enableStackTraces = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_enableStackTraces");
    public static final java.lang.invoke.MethodHandle MTD__clang_enableStackTraces = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_enableStackTraces, java.lang.foreign.FunctionDescriptor.ofVoid());
    public static void clang_enableStackTraces()
    {
        try {MTD__clang_enableStackTraces.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_executeOnThread = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_executeOnThread");
    public static final java.lang.invoke.MethodHandle MTD__clang_executeOnThread = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_executeOnThread, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_executeOnThread(java.lang.foreign.MemorySegment fn, java.lang.foreign.MemorySegment user_data, int stack_size)
    {
        try {MTD__clang_executeOnThread.invokeExact(fn, user_data, stack_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionChunkKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionChunkKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_getCompletionChunkKind(java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return (int)MTD__clang_getCompletionChunkKind.invokeExact(completion_string, chunk_number);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionChunkText = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkText");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionChunkText = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkText, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getCompletionChunkText(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCompletionChunkText.invokeExact($segmentAllocator, completion_string, chunk_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionChunkCompletionString = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkCompletionString");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionChunkCompletionString = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkCompletionString, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_getCompletionChunkCompletionString(java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getCompletionChunkCompletionString.invokeExact(completion_string, chunk_number);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getNumCompletionChunks = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getNumCompletionChunks");
    public static final java.lang.invoke.MethodHandle MTD__clang_getNumCompletionChunks = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumCompletionChunks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getNumCompletionChunks(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD__clang_getNumCompletionChunks.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionPriority = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionPriority");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionPriority = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionPriority, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getCompletionPriority(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD__clang_getCompletionPriority.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionAvailability = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionAvailability");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionAvailability = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getCompletionAvailability(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD__clang_getCompletionAvailability.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionNumAnnotations = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionNumAnnotations");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionNumAnnotations = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionNumAnnotations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_getCompletionNumAnnotations(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD__clang_getCompletionNumAnnotations.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionAnnotation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionAnnotation");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionAnnotation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionAnnotation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getCompletionAnnotation(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment completion_string, int annotation_number)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCompletionAnnotation.invokeExact($segmentAllocator, completion_string, annotation_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionParent = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionParent");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionParent = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionParent, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getCompletionParent(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment completion_string, java.lang.foreign.MemorySegment kind)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCompletionParent.invokeExact($segmentAllocator, completion_string, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionBriefComment = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionBriefComment");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionBriefComment = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionBriefComment, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getCompletionBriefComment(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment completion_string)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCompletionBriefComment.invokeExact($segmentAllocator, completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorCompletionString = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorCompletionString");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorCompletionString = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorCompletionString, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_getCursorCompletionString(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getCursorCompletionString.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionNumFixIts = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionNumFixIts");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionNumFixIts = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionNumFixIts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_getCompletionNumFixIts(java.lang.foreign.MemorySegment results, int completion_index)
    {
        try {return (int)MTD__clang_getCompletionNumFixIts.invokeExact(results, completion_index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCompletionFixIt = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCompletionFixIt");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCompletionFixIt = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionFixIt, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_getCompletionFixIt(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment results, int completion_index, int fixit_index, java.lang.foreign.MemorySegment replacement_range)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getCompletionFixIt.invokeExact($segmentAllocator, results, completion_index, fixit_index, replacement_range));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_defaultCodeCompleteOptions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_defaultCodeCompleteOptions");
    public static final java.lang.invoke.MethodHandle MTD__clang_defaultCodeCompleteOptions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultCodeCompleteOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_defaultCodeCompleteOptions()
    {
        try {return (int)MTD__clang_defaultCodeCompleteOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteAt = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteAt");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteAt = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteAt, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_codeCompleteAt(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment complete_filename, int complete_line, int complete_column, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_codeCompleteAt.invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_sortCodeCompletionResults = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_sortCodeCompletionResults");
    public static final java.lang.invoke.MethodHandle MTD__clang_sortCodeCompletionResults = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_sortCodeCompletionResults, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_sortCodeCompletionResults(java.lang.foreign.MemorySegment Results, int NumResults)
    {
        try {MTD__clang_sortCodeCompletionResults.invokeExact(Results, NumResults);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_disposeCodeCompleteResults = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_disposeCodeCompleteResults");
    public static final java.lang.invoke.MethodHandle MTD__clang_disposeCodeCompleteResults = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCodeCompleteResults, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_disposeCodeCompleteResults(java.lang.foreign.MemorySegment Results)
    {
        try {MTD__clang_disposeCodeCompleteResults.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetNumDiagnostics = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetNumDiagnostics");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetNumDiagnostics = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetNumDiagnostics, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetNumDiagnostics(java.lang.foreign.MemorySegment Results)
    {
        try {return (int)MTD__clang_codeCompleteGetNumDiagnostics.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetDiagnostic = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetDiagnostic");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetDiagnostic = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetDiagnostic, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_codeCompleteGetDiagnostic(java.lang.foreign.MemorySegment Results, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_codeCompleteGetDiagnostic.invokeExact(Results, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetContexts = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContexts");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetContexts = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContexts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static long clang_codeCompleteGetContexts(java.lang.foreign.MemorySegment Results)
    {
        try {return (long)MTD__clang_codeCompleteGetContexts.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetContainerKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContainerKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetContainerKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContainerKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetContainerKind(java.lang.foreign.MemorySegment Results, java.lang.foreign.MemorySegment IsIncomplete)
    {
        try {return (int)MTD__clang_codeCompleteGetContainerKind.invokeExact(Results, IsIncomplete);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetContainerUSR = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContainerUSR");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetContainerUSR = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContainerUSR, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_codeCompleteGetContainerUSR(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Results)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_codeCompleteGetContainerUSR.invokeExact($segmentAllocator, Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_codeCompleteGetObjCSelector = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetObjCSelector");
    public static final java.lang.invoke.MethodHandle MTD__clang_codeCompleteGetObjCSelector = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetObjCSelector, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static fr.kenlek.jpgen.clang.CXString clang_codeCompleteGetObjCSelector(java.lang.foreign.SegmentAllocator $segmentAllocator, java.lang.foreign.MemorySegment Results)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_codeCompleteGetObjCSelector.invokeExact($segmentAllocator, Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getClangVersion = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getClangVersion");
    public static final java.lang.invoke.MethodHandle MTD__clang_getClangVersion = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getClangVersion, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    public static fr.kenlek.jpgen.clang.CXString clang_getClangVersion(java.lang.foreign.SegmentAllocator $segmentAllocator)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getClangVersion.invokeExact($segmentAllocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_toggleCrashRecovery = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_toggleCrashRecovery");
    public static final java.lang.invoke.MethodHandle MTD__clang_toggleCrashRecovery = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_toggleCrashRecovery, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
    public static void clang_toggleCrashRecovery(int isEnabled)
    {
        try {MTD__clang_toggleCrashRecovery.invokeExact(isEnabled);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getInclusions = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getInclusions");
    public static final java.lang.invoke.MethodHandle MTD__clang_getInclusions = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getInclusions, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_getInclusions(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {MTD__clang_getInclusions.invokeExact(tu, visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Cursor_Evaluate = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Cursor_Evaluate");
    public static final java.lang.invoke.MethodHandle MTD__clang_Cursor_Evaluate = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_Evaluate, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static java.lang.foreign.MemorySegment clang_Cursor_Evaluate(fr.kenlek.jpgen.clang.CXCursor C)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_Cursor_Evaluate.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_EvalResult_getKind(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD__clang_EvalResult_getKind.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getAsInt = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsInt");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getAsInt = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsInt, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_EvalResult_getAsInt(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD__clang_EvalResult_getAsInt.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getAsLongLong = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsLongLong");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getAsLongLong = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsLongLong, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsLongLong(java.lang.foreign.MemorySegment E)
    {
        try {return (long)MTD__clang_EvalResult_getAsLongLong.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_isUnsignedInt = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_isUnsignedInt");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_isUnsignedInt = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_isUnsignedInt, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_EvalResult_isUnsignedInt(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD__clang_EvalResult_isUnsignedInt.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getAsUnsigned = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsUnsigned");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getAsUnsigned = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsUnsigned, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsUnsigned(java.lang.foreign.MemorySegment E)
    {
        try {return (long)MTD__clang_EvalResult_getAsUnsigned.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getAsDouble = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsDouble");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getAsDouble = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsDouble, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static double clang_EvalResult_getAsDouble(java.lang.foreign.MemorySegment E)
    {
        try {return (double)MTD__clang_EvalResult_getAsDouble.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_getAsStr = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsStr");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_getAsStr = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsStr, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_EvalResult_getAsStr(java.lang.foreign.MemorySegment E)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_EvalResult_getAsStr.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_EvalResult_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_EvalResult_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_EvalResult_dispose(java.lang.foreign.MemorySegment E)
    {
        try {MTD__clang_EvalResult_dispose.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getRemappings = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getRemappings");
    public static final java.lang.invoke.MethodHandle MTD__clang_getRemappings = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRemappings, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_getRemappings(java.lang.foreign.MemorySegment path)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getRemappings.invokeExact(path);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getRemappingsFromFileList = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getRemappingsFromFileList");
    public static final java.lang.invoke.MethodHandle MTD__clang_getRemappingsFromFileList = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRemappingsFromFileList, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static java.lang.foreign.MemorySegment clang_getRemappingsFromFileList(java.lang.foreign.MemorySegment filePaths, int numFiles)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_getRemappingsFromFileList.invokeExact(filePaths, numFiles);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_remap_getNumFiles = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_remap_getNumFiles");
    public static final java.lang.invoke.MethodHandle MTD__clang_remap_getNumFiles = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_getNumFiles, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_remap_getNumFiles(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (int)MTD__clang_remap_getNumFiles.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_remap_getFilenames = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_remap_getFilenames");
    public static final java.lang.invoke.MethodHandle MTD__clang_remap_getFilenames = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_getFilenames, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_remap_getFilenames(java.lang.foreign.MemorySegment $arg1, int index, java.lang.foreign.MemorySegment original, java.lang.foreign.MemorySegment transformed)
    {
        try {MTD__clang_remap_getFilenames.invokeExact($arg1, index, original, transformed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_remap_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_remap_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_remap_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_remap_dispose(java.lang.foreign.MemorySegment $arg1)
    {
        try {MTD__clang_remap_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_findReferencesInFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_findReferencesInFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_findReferencesInFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findReferencesInFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursorAndRangeVisitor.layout));
    public static int clang_findReferencesInFile(fr.kenlek.jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment file, fr.kenlek.jpgen.clang.CXCursorAndRangeVisitor visitor)
    {
        try {return (int)MTD__clang_findReferencesInFile.invokeExact(cursor.ptr(), file, visitor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_findIncludesInFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_findIncludesInFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_findIncludesInFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findIncludesInFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursorAndRangeVisitor.layout));
    public static int clang_findIncludesInFile(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment file, fr.kenlek.jpgen.clang.CXCursorAndRangeVisitor visitor)
    {
        try {return (int)MTD__clang_findIncludesInFile.invokeExact(TU, file, visitor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_findReferencesInFileWithBlock = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_findReferencesInFileWithBlock");
    public static final java.lang.invoke.MethodHandle MTD__clang_findReferencesInFileWithBlock = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findReferencesInFileWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_findReferencesInFileWithBlock(fr.kenlek.jpgen.clang.CXCursor $arg1, java.lang.foreign.MemorySegment $arg2, java.lang.foreign.MemorySegment $arg3)
    {
        try {return (int)MTD__clang_findReferencesInFileWithBlock.invokeExact($arg1.ptr(), $arg2, $arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_findIncludesInFileWithBlock = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_findIncludesInFileWithBlock");
    public static final java.lang.invoke.MethodHandle MTD__clang_findIncludesInFileWithBlock = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findIncludesInFileWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_findIncludesInFileWithBlock(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment $arg2, java.lang.foreign.MemorySegment $arg3)
    {
        try {return (int)MTD__clang_findIncludesInFileWithBlock.invokeExact($arg1, $arg2, $arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_isEntityObjCContainerKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_isEntityObjCContainerKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_isEntityObjCContainerKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_isEntityObjCContainerKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_index_isEntityObjCContainerKind(int $arg1)
    {
        try {return (int)MTD__clang_index_isEntityObjCContainerKind.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getObjCContainerDeclInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCContainerDeclInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getObjCContainerDeclInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCContainerDeclInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getObjCContainerDeclInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getObjCContainerDeclInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getObjCInterfaceDeclInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCInterfaceDeclInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getObjCInterfaceDeclInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCInterfaceDeclInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getObjCInterfaceDeclInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getObjCInterfaceDeclInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getObjCCategoryDeclInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCCategoryDeclInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getObjCCategoryDeclInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCCategoryDeclInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getObjCCategoryDeclInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getObjCCategoryDeclInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getObjCProtocolRefListInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCProtocolRefListInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getObjCProtocolRefListInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCProtocolRefListInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getObjCProtocolRefListInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getObjCProtocolRefListInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getObjCPropertyDeclInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCPropertyDeclInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getObjCPropertyDeclInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCPropertyDeclInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getObjCPropertyDeclInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getObjCPropertyDeclInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getIBOutletCollectionAttrInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getIBOutletCollectionAttrInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getIBOutletCollectionAttrInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getIBOutletCollectionAttrInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getIBOutletCollectionAttrInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getCXXClassDeclInfo = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getCXXClassDeclInfo");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getCXXClassDeclInfo = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getCXXClassDeclInfo, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getCXXClassDeclInfo(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getCXXClassDeclInfo.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getClientContainer = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getClientContainer");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getClientContainer = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getClientContainer, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getClientContainer(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getClientContainer.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_setClientContainer = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_setClientContainer");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_setClientContainer = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_setClientContainer, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_index_setClientContainer(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment $arg2)
    {
        try {MTD__clang_index_setClientContainer.invokeExact($arg1, $arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_getClientEntity = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_getClientEntity");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_getClientEntity = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getClientEntity, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_index_getClientEntity(java.lang.foreign.MemorySegment $arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_index_getClientEntity.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_index_setClientEntity = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_index_setClientEntity");
    public static final java.lang.invoke.MethodHandle MTD__clang_index_setClientEntity = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_setClientEntity, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_index_setClientEntity(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment $arg2)
    {
        try {MTD__clang_index_setClientEntity.invokeExact($arg1, $arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_IndexAction_create = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_IndexAction_create");
    public static final java.lang.invoke.MethodHandle MTD__clang_IndexAction_create = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_IndexAction_create, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static java.lang.foreign.MemorySegment clang_IndexAction_create(java.lang.foreign.MemorySegment CIdx)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__clang_IndexAction_create.invokeExact(CIdx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_IndexAction_dispose = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_IndexAction_dispose");
    public static final java.lang.invoke.MethodHandle MTD__clang_IndexAction_dispose = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_IndexAction_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_IndexAction_dispose(java.lang.foreign.MemorySegment $arg1)
    {
        try {MTD__clang_IndexAction_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_indexSourceFile = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_indexSourceFile");
    public static final java.lang.invoke.MethodHandle MTD__clang_indexSourceFile = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexSourceFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_indexSourceFile(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
    {
        try {return (int)MTD__clang_indexSourceFile.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_indexSourceFileFullArgv = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_indexSourceFileFullArgv");
    public static final java.lang.invoke.MethodHandle MTD__clang_indexSourceFileFullArgv = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexSourceFileFullArgv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    public static int clang_indexSourceFileFullArgv(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
    {
        try {return (int)MTD__clang_indexSourceFileFullArgv.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_indexTranslationUnit = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_indexTranslationUnit");
    public static final java.lang.invoke.MethodHandle MTD__clang_indexTranslationUnit = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_indexTranslationUnit(java.lang.foreign.MemorySegment $arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment $arg6)
    {
        try {return (int)MTD__clang_indexTranslationUnit.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, $arg6);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_indexLoc_getFileLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_indexLoc_getFileLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_indexLoc_getFileLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexLoc_getFileLocation, java.lang.foreign.FunctionDescriptor.ofVoid(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static void clang_indexLoc_getFileLocation(fr.kenlek.jpgen.clang.CXIdxLoc loc, java.lang.foreign.MemorySegment indexFile, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD__clang_indexLoc_getFileLocation.invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_indexLoc_getCXSourceLocation = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_indexLoc_getCXSourceLocation");
    public static final java.lang.invoke.MethodHandle MTD__clang_indexLoc_getCXSourceLocation = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexLoc_getCXSourceLocation, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout));
    public static fr.kenlek.jpgen.clang.CXSourceLocation clang_indexLoc_getCXSourceLocation(java.lang.foreign.SegmentAllocator $segmentAllocator, fr.kenlek.jpgen.clang.CXIdxLoc loc)
    {
        try {return new fr.kenlek.jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD__clang_indexLoc_getCXSourceLocation.invokeExact($segmentAllocator, loc.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_Type_visitFields = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_Type_visitFields");
    public static final java.lang.invoke.MethodHandle MTD__clang_Type_visitFields = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_visitFields, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER));
    public static int clang_Type_visitFields(fr.kenlek.jpgen.clang.CXType T, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {return (int)MTD__clang_Type_visitFields.invokeExact(T.ptr(), visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getBinaryOperatorKindSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getBinaryOperatorKindSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getBinaryOperatorKindSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getBinaryOperatorKindSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getBinaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getBinaryOperatorKindSpelling.invokeExact($segmentAllocator, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorBinaryOperatorKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorBinaryOperatorKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorBinaryOperatorKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorBinaryOperatorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorBinaryOperatorKind(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorBinaryOperatorKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getUnaryOperatorKindSpelling = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getUnaryOperatorKindSpelling");
    public static final java.lang.invoke.MethodHandle MTD__clang_getUnaryOperatorKindSpelling = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getUnaryOperatorKindSpelling, java.lang.foreign.FunctionDescriptor.of(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout, java.lang.foreign.ValueLayout.JAVA_INT));
    public static fr.kenlek.jpgen.clang.CXString clang_getUnaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new fr.kenlek.jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD__clang_getUnaryOperatorKindSpelling.invokeExact($segmentAllocator, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__clang_getCursorUnaryOperatorKind = fr.kenlek.jpgen.ForeignUtils.GLOBAL_LOOKUP.findOrThrow("clang_getCursorUnaryOperatorKind");
    public static final java.lang.invoke.MethodHandle MTD__clang_getCursorUnaryOperatorKind = fr.kenlek.jpgen.ForeignUtils.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorUnaryOperatorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout));
    public static int clang_getCursorUnaryOperatorKind(fr.kenlek.jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD__clang_getCursorUnaryOperatorKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }
}
