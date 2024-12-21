package fr.kenlek.jpgen.clang;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static fr.kenlek.jpgen.ForeignUtils.*;
import static java.lang.foreign.ValueLayout.*;

public final class Index_h
{private Index_h() {}

    public static final MemorySegment MTD_ADDRESS__clang_getCString = GLOBAL_LOOKUP.findOrThrow("clang_getCString");
    public static final MethodHandle MTD__clang_getCString = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCString, FunctionDescriptor.of(UNBOUNDED_POINTER, CXString.LAYOUT));
    public static MemorySegment clang_getCString(CXString string)
    {
        try {return ((MemorySegment)MTD__clang_getCString.invokeExact(string.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeString = GLOBAL_LOOKUP.findOrThrow("clang_disposeString");
    public static final MethodHandle MTD__clang_disposeString = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeString, FunctionDescriptor.ofVoid(CXString.LAYOUT));
    public static void clang_disposeString(CXString string)
    {
        try {MTD__clang_disposeString.invokeExact(string.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeStringSet = GLOBAL_LOOKUP.findOrThrow("clang_disposeStringSet");
    public static final MethodHandle MTD__clang_disposeStringSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeStringSet, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeStringSet(MemorySegment set)
    {
        try {MTD__clang_disposeStringSet.invokeExact(set);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getBuildSessionTimestamp = GLOBAL_LOOKUP.findOrThrow("clang_getBuildSessionTimestamp");
    public static final MethodHandle MTD__clang_getBuildSessionTimestamp = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getBuildSessionTimestamp, FunctionDescriptor.of(JAVA_LONG));
    public static long clang_getBuildSessionTimestamp()
    {
        try {return ((long)MTD__clang_getBuildSessionTimestamp.invokeExact());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_create = GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_create");
    public static final MethodHandle MTD__clang_VirtualFileOverlay_create = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_create, FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_VirtualFileOverlay_create(int options)
    {
        try {return ((MemorySegment)MTD__clang_VirtualFileOverlay_create.invokeExact(options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_addFileMapping = GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_addFileMapping");
    public static final MethodHandle MTD__clang_VirtualFileOverlay_addFileMapping = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_addFileMapping, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath)
    {
        try {return ((int)MTD__clang_VirtualFileOverlay_addFileMapping.invokeExact($arg1, virtualPath, realPath));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_setCaseSensitivity = GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_setCaseSensitivity");
    public static final MethodHandle MTD__clang_VirtualFileOverlay_setCaseSensitivity = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_setCaseSensitivity, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, int caseSensitive)
    {
        try {return ((int)MTD__clang_VirtualFileOverlay_setCaseSensitivity.invokeExact($arg1, caseSensitive));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_writeToBuffer = GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_writeToBuffer");
    public static final MethodHandle MTD__clang_VirtualFileOverlay_writeToBuffer = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_writeToBuffer, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return ((int)MTD__clang_VirtualFileOverlay_writeToBuffer.invokeExact($arg1, options, out_buffer_ptr, out_buffer_size));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_free = GLOBAL_LOOKUP.findOrThrow("clang_free");
    public static final MethodHandle MTD__clang_free = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_free, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_free(MemorySegment buffer)
    {
        try {MTD__clang_free.invokeExact(buffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_VirtualFileOverlay_dispose = GLOBAL_LOOKUP.findOrThrow("clang_VirtualFileOverlay_dispose");
    public static final MethodHandle MTD__clang_VirtualFileOverlay_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_VirtualFileOverlay_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_VirtualFileOverlay_dispose(MemorySegment $arg1)
    {
        try {MTD__clang_VirtualFileOverlay_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_create = GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_create");
    public static final MethodHandle MTD__clang_ModuleMapDescriptor_create = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_create, FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_ModuleMapDescriptor_create(int options)
    {
        try {return ((MemorySegment)MTD__clang_ModuleMapDescriptor_create.invokeExact(options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_setFrameworkModuleName = GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_setFrameworkModuleName");
    public static final MethodHandle MTD__clang_ModuleMapDescriptor_setFrameworkModuleName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_setFrameworkModuleName, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name)
    {
        try {return ((int)MTD__clang_ModuleMapDescriptor_setFrameworkModuleName.invokeExact($arg1, name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_setUmbrellaHeader = GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_setUmbrellaHeader");
    public static final MethodHandle MTD__clang_ModuleMapDescriptor_setUmbrellaHeader = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_setUmbrellaHeader, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name)
    {
        try {return ((int)MTD__clang_ModuleMapDescriptor_setUmbrellaHeader.invokeExact($arg1, name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_writeToBuffer = GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_writeToBuffer");
    public static final MethodHandle MTD__clang_ModuleMapDescriptor_writeToBuffer = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_writeToBuffer, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return ((int)MTD__clang_ModuleMapDescriptor_writeToBuffer.invokeExact($arg1, options, out_buffer_ptr, out_buffer_size));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_ModuleMapDescriptor_dispose = GLOBAL_LOOKUP.findOrThrow("clang_ModuleMapDescriptor_dispose");
    public static final MethodHandle MTD__clang_ModuleMapDescriptor_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_ModuleMapDescriptor_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_ModuleMapDescriptor_dispose(MemorySegment $arg1)
    {
        try {MTD__clang_ModuleMapDescriptor_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFileName = GLOBAL_LOOKUP.findOrThrow("clang_getFileName");
    public static final MethodHandle MTD__clang_getFileName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileName, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getFileName(SegmentAllocator $segmentAllocator, MemorySegment SFile)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getFileName.invokeExact($segmentAllocator, SFile)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFileTime = GLOBAL_LOOKUP.findOrThrow("clang_getFileTime");
    public static final MethodHandle MTD__clang_getFileTime = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileTime, FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_getFileTime(MemorySegment SFile)
    {
        try {return ((long)MTD__clang_getFileTime.invokeExact(SFile));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFileUniqueID = GLOBAL_LOOKUP.findOrThrow("clang_getFileUniqueID");
    public static final MethodHandle MTD__clang_getFileUniqueID = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileUniqueID, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_getFileUniqueID(MemorySegment file, MemorySegment outID)
    {
        try {return ((int)MTD__clang_getFileUniqueID.invokeExact(file, outID));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_File_isEqual = GLOBAL_LOOKUP.findOrThrow("clang_File_isEqual");
    public static final MethodHandle MTD__clang_File_isEqual = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_File_isEqual, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_File_isEqual(MemorySegment file1, MemorySegment file2)
    {
        try {return ((int)MTD__clang_File_isEqual.invokeExact(file1, file2));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_File_tryGetRealPathName = GLOBAL_LOOKUP.findOrThrow("clang_File_tryGetRealPathName");
    public static final MethodHandle MTD__clang_File_tryGetRealPathName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_File_tryGetRealPathName, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_File_tryGetRealPathName(SegmentAllocator $segmentAllocator, MemorySegment file)
    {
        try {return new CXString(((MemorySegment)MTD__clang_File_tryGetRealPathName.invokeExact($segmentAllocator, file)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNullLocation = GLOBAL_LOOKUP.findOrThrow("clang_getNullLocation");
    public static final MethodHandle MTD__clang_getNullLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT));
    public static CXSourceLocation clang_getNullLocation(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getNullLocation.invokeExact($segmentAllocator)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_equalLocations = GLOBAL_LOOKUP.findOrThrow("clang_equalLocations");
    public static final MethodHandle MTD__clang_equalLocations = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalLocations, FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
    public static int clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)
    {
        try {return ((int)MTD__clang_equalLocations.invokeExact(loc1.ptr(), loc2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Location_isInSystemHeader = GLOBAL_LOOKUP.findOrThrow("clang_Location_isInSystemHeader");
    public static final MethodHandle MTD__clang_Location_isInSystemHeader = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Location_isInSystemHeader, FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
    public static int clang_Location_isInSystemHeader(CXSourceLocation location)
    {
        try {return ((int)MTD__clang_Location_isInSystemHeader.invokeExact(location.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Location_isFromMainFile = GLOBAL_LOOKUP.findOrThrow("clang_Location_isFromMainFile");
    public static final MethodHandle MTD__clang_Location_isFromMainFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Location_isFromMainFile, FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
    public static int clang_Location_isFromMainFile(CXSourceLocation location)
    {
        try {return ((int)MTD__clang_Location_isFromMainFile.invokeExact(location.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNullRange = GLOBAL_LOOKUP.findOrThrow("clang_getNullRange");
    public static final MethodHandle MTD__clang_getNullRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullRange, FunctionDescriptor.of(CXSourceRange.LAYOUT));
    public static CXSourceRange clang_getNullRange(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getNullRange.invokeExact($segmentAllocator)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getRange = GLOBAL_LOOKUP.findOrThrow("clang_getRange");
    public static final MethodHandle MTD__clang_getRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRange, FunctionDescriptor.of(CXSourceRange.LAYOUT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
    public static CXSourceRange clang_getRange(SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getRange.invokeExact($segmentAllocator, begin.ptr(), end.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_equalRanges = GLOBAL_LOOKUP.findOrThrow("clang_equalRanges");
    public static final MethodHandle MTD__clang_equalRanges = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalRanges, FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT, CXSourceRange.LAYOUT));
    public static int clang_equalRanges(CXSourceRange range1, CXSourceRange range2)
    {
        try {return ((int)MTD__clang_equalRanges.invokeExact(range1.ptr(), range2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Range_isNull = GLOBAL_LOOKUP.findOrThrow("clang_Range_isNull");
    public static final MethodHandle MTD__clang_Range_isNull = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Range_isNull, FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT));
    public static int clang_Range_isNull(CXSourceRange range)
    {
        try {return ((int)MTD__clang_Range_isNull.invokeExact(range.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getExpansionLocation = GLOBAL_LOOKUP.findOrThrow("clang_getExpansionLocation");
    public static final MethodHandle MTD__clang_getExpansionLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getExpansionLocation, FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD__clang_getExpansionLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getPresumedLocation = GLOBAL_LOOKUP.findOrThrow("clang_getPresumedLocation");
    public static final MethodHandle MTD__clang_getPresumedLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getPresumedLocation, FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column)
    {
        try {MTD__clang_getPresumedLocation.invokeExact(location.ptr(), filename, line, column);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getInstantiationLocation = GLOBAL_LOOKUP.findOrThrow("clang_getInstantiationLocation");
    public static final MethodHandle MTD__clang_getInstantiationLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getInstantiationLocation, FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD__clang_getInstantiationLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getSpellingLocation = GLOBAL_LOOKUP.findOrThrow("clang_getSpellingLocation");
    public static final MethodHandle MTD__clang_getSpellingLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSpellingLocation, FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD__clang_getSpellingLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFileLocation = GLOBAL_LOOKUP.findOrThrow("clang_getFileLocation");
    public static final MethodHandle MTD__clang_getFileLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileLocation, FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD__clang_getFileLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getRangeStart = GLOBAL_LOOKUP.findOrThrow("clang_getRangeStart");
    public static final MethodHandle MTD__clang_getRangeStart = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRangeStart, FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
    public static CXSourceLocation clang_getRangeStart(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getRangeStart.invokeExact($segmentAllocator, range.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getRangeEnd = GLOBAL_LOOKUP.findOrThrow("clang_getRangeEnd");
    public static final MethodHandle MTD__clang_getRangeEnd = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRangeEnd, FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
    public static CXSourceLocation clang_getRangeEnd(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getRangeEnd.invokeExact($segmentAllocator, range.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeSourceRangeList = GLOBAL_LOOKUP.findOrThrow("clang_disposeSourceRangeList");
    public static final MethodHandle MTD__clang_disposeSourceRangeList = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeSourceRangeList, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeSourceRangeList(MemorySegment ranges)
    {
        try {MTD__clang_disposeSourceRangeList.invokeExact(ranges);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumDiagnosticsInSet = GLOBAL_LOOKUP.findOrThrow("clang_getNumDiagnosticsInSet");
    public static final MethodHandle MTD__clang_getNumDiagnosticsInSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumDiagnosticsInSet, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumDiagnosticsInSet(MemorySegment Diags)
    {
        try {return ((int)MTD__clang_getNumDiagnosticsInSet.invokeExact(Diags));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticInSet = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticInSet");
    public static final MethodHandle MTD__clang_getDiagnosticInSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticInSet, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getDiagnosticInSet(MemorySegment Diags, int Index)
    {
        try {return ((MemorySegment)MTD__clang_getDiagnosticInSet.invokeExact(Diags, Index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_loadDiagnostics = GLOBAL_LOOKUP.findOrThrow("clang_loadDiagnostics");
    public static final MethodHandle MTD__clang_loadDiagnostics = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_loadDiagnostics, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString)
    {
        try {return ((MemorySegment)MTD__clang_loadDiagnostics.invokeExact(file, error, errorString));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeDiagnosticSet = GLOBAL_LOOKUP.findOrThrow("clang_disposeDiagnosticSet");
    public static final MethodHandle MTD__clang_disposeDiagnosticSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeDiagnosticSet, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeDiagnosticSet(MemorySegment Diags)
    {
        try {MTD__clang_disposeDiagnosticSet.invokeExact(Diags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getChildDiagnostics = GLOBAL_LOOKUP.findOrThrow("clang_getChildDiagnostics");
    public static final MethodHandle MTD__clang_getChildDiagnostics = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getChildDiagnostics, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getChildDiagnostics(MemorySegment D)
    {
        try {return ((MemorySegment)MTD__clang_getChildDiagnostics.invokeExact(D));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeDiagnostic = GLOBAL_LOOKUP.findOrThrow("clang_disposeDiagnostic");
    public static final MethodHandle MTD__clang_disposeDiagnostic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeDiagnostic, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeDiagnostic(MemorySegment Diagnostic)
    {
        try {MTD__clang_disposeDiagnostic.invokeExact(Diagnostic);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_formatDiagnostic = GLOBAL_LOOKUP.findOrThrow("clang_formatDiagnostic");
    public static final MethodHandle MTD__clang_formatDiagnostic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_formatDiagnostic, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_formatDiagnostic(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options)
    {
        try {return new CXString(((MemorySegment)MTD__clang_formatDiagnostic.invokeExact($segmentAllocator, Diagnostic, Options)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_defaultDiagnosticDisplayOptions = GLOBAL_LOOKUP.findOrThrow("clang_defaultDiagnosticDisplayOptions");
    public static final MethodHandle MTD__clang_defaultDiagnosticDisplayOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultDiagnosticDisplayOptions, FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultDiagnosticDisplayOptions()
    {
        try {return ((int)MTD__clang_defaultDiagnosticDisplayOptions.invokeExact());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticSeverity = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSeverity");
    public static final MethodHandle MTD__clang_getDiagnosticSeverity = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSeverity, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticSeverity(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_getDiagnosticSeverity.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticLocation = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticLocation");
    public static final MethodHandle MTD__clang_getDiagnosticLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER));
    public static CXSourceLocation clang_getDiagnosticLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getDiagnosticLocation.invokeExact($segmentAllocator, $arg1)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSpelling");
    public static final MethodHandle MTD__clang_getDiagnosticSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSpelling, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDiagnosticSpelling.invokeExact($segmentAllocator, $arg1)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticOption = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticOption");
    public static final MethodHandle MTD__clang_getDiagnosticOption = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticOption, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticOption(SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDiagnosticOption.invokeExact($segmentAllocator, Diag, Disable)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticCategory = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategory");
    public static final MethodHandle MTD__clang_getDiagnosticCategory = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategory, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticCategory(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_getDiagnosticCategory.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticCategoryName = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategoryName");
    public static final MethodHandle MTD__clang_getDiagnosticCategoryName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategoryName, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getDiagnosticCategoryName(SegmentAllocator $segmentAllocator, int Category)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDiagnosticCategoryName.invokeExact($segmentAllocator, Category)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticCategoryText = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticCategoryText");
    public static final MethodHandle MTD__clang_getDiagnosticCategoryText = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticCategoryText, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticCategoryText(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDiagnosticCategoryText.invokeExact($segmentAllocator, $arg1)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticNumRanges = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticNumRanges");
    public static final MethodHandle MTD__clang_getDiagnosticNumRanges = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticNumRanges, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumRanges(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_getDiagnosticNumRanges.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticRange = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticRange");
    public static final MethodHandle MTD__clang_getDiagnosticRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticRange, FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXSourceRange clang_getDiagnosticRange(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getDiagnosticRange.invokeExact($segmentAllocator, Diagnostic, Range)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticNumFixIts = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticNumFixIts");
    public static final MethodHandle MTD__clang_getDiagnosticNumFixIts = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticNumFixIts, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumFixIts(MemorySegment Diagnostic)
    {
        try {return ((int)MTD__clang_getDiagnosticNumFixIts.invokeExact(Diagnostic));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticFixIt = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticFixIt");
    public static final MethodHandle MTD__clang_getDiagnosticFixIt = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticFixIt, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticFixIt(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDiagnosticFixIt.invokeExact($segmentAllocator, Diagnostic, FixIt, ReplacementRange)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_createIndex = GLOBAL_LOOKUP.findOrThrow("clang_createIndex");
    public static final MethodHandle MTD__clang_createIndex = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createIndex, FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return ((MemorySegment)MTD__clang_createIndex.invokeExact(excludeDeclarationsFromPCH, displayDiagnostics));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeIndex = GLOBAL_LOOKUP.findOrThrow("clang_disposeIndex");
    public static final MethodHandle MTD__clang_disposeIndex = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeIndex, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeIndex(MemorySegment index)
    {
        try {MTD__clang_disposeIndex.invokeExact(index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXIndex_setGlobalOptions = GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_setGlobalOptions");
    public static final MethodHandle MTD__clang_CXIndex_setGlobalOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_setGlobalOptions, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_CXIndex_setGlobalOptions(MemorySegment $arg1, int options)
    {
        try {MTD__clang_CXIndex_setGlobalOptions.invokeExact($arg1, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXIndex_getGlobalOptions = GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_getGlobalOptions");
    public static final MethodHandle MTD__clang_CXIndex_getGlobalOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_getGlobalOptions, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_CXIndex_getGlobalOptions(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_CXIndex_getGlobalOptions.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXIndex_setInvocationEmissionPathOption = GLOBAL_LOOKUP.findOrThrow("clang_CXIndex_setInvocationEmissionPathOption");
    public static final MethodHandle MTD__clang_CXIndex_setInvocationEmissionPathOption = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXIndex_setInvocationEmissionPathOption, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path)
    {
        try {MTD__clang_CXIndex_setInvocationEmissionPathOption.invokeExact($arg1, Path);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isFileMultipleIncludeGuarded = GLOBAL_LOOKUP.findOrThrow("clang_isFileMultipleIncludeGuarded");
    public static final MethodHandle MTD__clang_isFileMultipleIncludeGuarded = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isFileMultipleIncludeGuarded, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file)
    {
        try {return ((int)MTD__clang_isFileMultipleIncludeGuarded.invokeExact(tu, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFile = GLOBAL_LOOKUP.findOrThrow("clang_getFile");
    public static final MethodHandle MTD__clang_getFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFile, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getFile(MemorySegment tu, MemorySegment file_name)
    {
        try {return ((MemorySegment)MTD__clang_getFile.invokeExact(tu, file_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFileContents = GLOBAL_LOOKUP.findOrThrow("clang_getFileContents");
    public static final MethodHandle MTD__clang_getFileContents = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFileContents, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size)
    {
        try {return ((MemorySegment)MTD__clang_getFileContents.invokeExact(tu, file, size));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getLocation = GLOBAL_LOOKUP.findOrThrow("clang_getLocation");
    public static final MethodHandle MTD__clang_getLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static CXSourceLocation clang_getLocation(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getLocation.invokeExact($segmentAllocator, tu, file, line, column)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getLocationForOffset = GLOBAL_LOOKUP.findOrThrow("clang_getLocationForOffset");
    public static final MethodHandle MTD__clang_getLocationForOffset = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getLocationForOffset, FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static CXSourceLocation clang_getLocationForOffset(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getLocationForOffset.invokeExact($segmentAllocator, tu, file, offset)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getSkippedRanges = GLOBAL_LOOKUP.findOrThrow("clang_getSkippedRanges");
    public static final MethodHandle MTD__clang_getSkippedRanges = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSkippedRanges, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getSkippedRanges(MemorySegment tu, MemorySegment file)
    {
        try {return ((MemorySegment)MTD__clang_getSkippedRanges.invokeExact(tu, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getAllSkippedRanges = GLOBAL_LOOKUP.findOrThrow("clang_getAllSkippedRanges");
    public static final MethodHandle MTD__clang_getAllSkippedRanges = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getAllSkippedRanges, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getAllSkippedRanges(MemorySegment tu)
    {
        try {return ((MemorySegment)MTD__clang_getAllSkippedRanges.invokeExact(tu));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumDiagnostics = GLOBAL_LOOKUP.findOrThrow("clang_getNumDiagnostics");
    public static final MethodHandle MTD__clang_getNumDiagnostics = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumDiagnostics, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumDiagnostics(MemorySegment Unit)
    {
        try {return ((int)MTD__clang_getNumDiagnostics.invokeExact(Unit));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnostic = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnostic");
    public static final MethodHandle MTD__clang_getDiagnostic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnostic, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getDiagnostic(MemorySegment Unit, int Index)
    {
        try {return ((MemorySegment)MTD__clang_getDiagnostic.invokeExact(Unit, Index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDiagnosticSetFromTU = GLOBAL_LOOKUP.findOrThrow("clang_getDiagnosticSetFromTU");
    public static final MethodHandle MTD__clang_getDiagnosticSetFromTU = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDiagnosticSetFromTU, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getDiagnosticSetFromTU(MemorySegment Unit)
    {
        try {return ((MemorySegment)MTD__clang_getDiagnosticSetFromTU.invokeExact(Unit));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTranslationUnitSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitSpelling");
    public static final MethodHandle MTD__clang_getTranslationUnitSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitSpelling, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getTranslationUnitSpelling(SegmentAllocator $segmentAllocator, MemorySegment CTUnit)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getTranslationUnitSpelling.invokeExact($segmentAllocator, CTUnit)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_createTranslationUnitFromSourceFile = GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnitFromSourceFile");
    public static final MethodHandle MTD__clang_createTranslationUnitFromSourceFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnitFromSourceFile, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static MemorySegment clang_createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_clang_command_line_args, MemorySegment clang_command_line_args, int num_unsaved_files, MemorySegment unsaved_files)
    {
        try {return ((MemorySegment)MTD__clang_createTranslationUnitFromSourceFile.invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_createTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnit");
    public static final MethodHandle MTD__clang_createTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnit, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_createTranslationUnit(MemorySegment CIdx, MemorySegment ast_filename)
    {
        try {return ((MemorySegment)MTD__clang_createTranslationUnit.invokeExact(CIdx, ast_filename));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_createTranslationUnit2 = GLOBAL_LOOKUP.findOrThrow("clang_createTranslationUnit2");
    public static final MethodHandle MTD__clang_createTranslationUnit2 = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createTranslationUnit2, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_createTranslationUnit2(MemorySegment CIdx, MemorySegment ast_filename, MemorySegment out_TU)
    {
        try {return ((int)MTD__clang_createTranslationUnit2.invokeExact(CIdx, ast_filename, out_TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_defaultEditingTranslationUnitOptions = GLOBAL_LOOKUP.findOrThrow("clang_defaultEditingTranslationUnitOptions");
    public static final MethodHandle MTD__clang_defaultEditingTranslationUnitOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultEditingTranslationUnitOptions, FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultEditingTranslationUnitOptions()
    {
        try {return ((int)MTD__clang_defaultEditingTranslationUnitOptions.invokeExact());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_parseTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit");
    public static final MethodHandle MTD__clang_parseTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return ((MemorySegment)MTD__clang_parseTranslationUnit.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_parseTranslationUnit2 = GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit2");
    public static final MethodHandle MTD__clang_parseTranslationUnit2 = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit2, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return ((int)MTD__clang_parseTranslationUnit2.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_parseTranslationUnit2FullArgv = GLOBAL_LOOKUP.findOrThrow("clang_parseTranslationUnit2FullArgv");
    public static final MethodHandle MTD__clang_parseTranslationUnit2FullArgv = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_parseTranslationUnit2FullArgv, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return ((int)MTD__clang_parseTranslationUnit2FullArgv.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_defaultSaveOptions = GLOBAL_LOOKUP.findOrThrow("clang_defaultSaveOptions");
    public static final MethodHandle MTD__clang_defaultSaveOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultSaveOptions, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_defaultSaveOptions(MemorySegment TU)
    {
        try {return ((int)MTD__clang_defaultSaveOptions.invokeExact(TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_saveTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_saveTranslationUnit");
    public static final MethodHandle MTD__clang_saveTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_saveTranslationUnit, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_saveTranslationUnit(MemorySegment TU, MemorySegment FileName, int options)
    {
        try {return ((int)MTD__clang_saveTranslationUnit.invokeExact(TU, FileName, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_suspendTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_suspendTranslationUnit");
    public static final MethodHandle MTD__clang_suspendTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_suspendTranslationUnit, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_suspendTranslationUnit(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_suspendTranslationUnit.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_disposeTranslationUnit");
    public static final MethodHandle MTD__clang_disposeTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeTranslationUnit, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeTranslationUnit(MemorySegment $arg1)
    {
        try {MTD__clang_disposeTranslationUnit.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_defaultReparseOptions = GLOBAL_LOOKUP.findOrThrow("clang_defaultReparseOptions");
    public static final MethodHandle MTD__clang_defaultReparseOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultReparseOptions, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_defaultReparseOptions(MemorySegment TU)
    {
        try {return ((int)MTD__clang_defaultReparseOptions.invokeExact(TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_reparseTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_reparseTranslationUnit");
    public static final MethodHandle MTD__clang_reparseTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_reparseTranslationUnit, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_reparseTranslationUnit(MemorySegment TU, int num_unsaved_files, MemorySegment unsaved_files, int options)
    {
        try {return ((int)MTD__clang_reparseTranslationUnit.invokeExact(TU, num_unsaved_files, unsaved_files, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTUResourceUsageName = GLOBAL_LOOKUP.findOrThrow("clang_getTUResourceUsageName");
    public static final MethodHandle MTD__clang_getTUResourceUsageName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTUResourceUsageName, FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getTUResourceUsageName(int kind)
    {
        try {return ((MemorySegment)MTD__clang_getTUResourceUsageName.invokeExact(kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCXTUResourceUsage = GLOBAL_LOOKUP.findOrThrow("clang_getCXTUResourceUsage");
    public static final MethodHandle MTD__clang_getCXTUResourceUsage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCXTUResourceUsage, FunctionDescriptor.of(CXTUResourceUsage.LAYOUT, UNBOUNDED_POINTER));
    public static CXTUResourceUsage clang_getCXTUResourceUsage(SegmentAllocator $segmentAllocator, MemorySegment TU)
    {
        try {return new CXTUResourceUsage(((MemorySegment)MTD__clang_getCXTUResourceUsage.invokeExact($segmentAllocator, TU)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeCXTUResourceUsage = GLOBAL_LOOKUP.findOrThrow("clang_disposeCXTUResourceUsage");
    public static final MethodHandle MTD__clang_disposeCXTUResourceUsage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXTUResourceUsage, FunctionDescriptor.ofVoid(CXTUResourceUsage.LAYOUT));
    public static void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)
    {
        try {MTD__clang_disposeCXTUResourceUsage.invokeExact(usage.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTranslationUnitTargetInfo = GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitTargetInfo");
    public static final MethodHandle MTD__clang_getTranslationUnitTargetInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitTargetInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getTranslationUnitTargetInfo(MemorySegment CTUnit)
    {
        try {return ((MemorySegment)MTD__clang_getTranslationUnitTargetInfo.invokeExact(CTUnit));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_TargetInfo_dispose = GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_dispose");
    public static final MethodHandle MTD__clang_TargetInfo_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_TargetInfo_dispose(MemorySegment Info)
    {
        try {MTD__clang_TargetInfo_dispose.invokeExact(Info);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_TargetInfo_getTriple = GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_getTriple");
    public static final MethodHandle MTD__clang_TargetInfo_getTriple = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_getTriple, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_TargetInfo_getTriple(SegmentAllocator $segmentAllocator, MemorySegment Info)
    {
        try {return new CXString(((MemorySegment)MTD__clang_TargetInfo_getTriple.invokeExact($segmentAllocator, Info)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_TargetInfo_getPointerWidth = GLOBAL_LOOKUP.findOrThrow("clang_TargetInfo_getPointerWidth");
    public static final MethodHandle MTD__clang_TargetInfo_getPointerWidth = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_TargetInfo_getPointerWidth, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_TargetInfo_getPointerWidth(MemorySegment Info)
    {
        try {return ((int)MTD__clang_TargetInfo_getPointerWidth.invokeExact(Info));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNullCursor = GLOBAL_LOOKUP.findOrThrow("clang_getNullCursor");
    public static final MethodHandle MTD__clang_getNullCursor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNullCursor, FunctionDescriptor.of(CXCursor.LAYOUT));
    public static CXCursor clang_getNullCursor(SegmentAllocator $segmentAllocator)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getNullCursor.invokeExact($segmentAllocator)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTranslationUnitCursor = GLOBAL_LOOKUP.findOrThrow("clang_getTranslationUnitCursor");
    public static final MethodHandle MTD__clang_getTranslationUnitCursor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTranslationUnitCursor, FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static CXCursor clang_getTranslationUnitCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getTranslationUnitCursor.invokeExact($segmentAllocator, $arg1)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_equalCursors = GLOBAL_LOOKUP.findOrThrow("clang_equalCursors");
    public static final MethodHandle MTD__clang_equalCursors = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalCursors, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static int clang_equalCursors(CXCursor $arg1, CXCursor $arg2)
    {
        try {return ((int)MTD__clang_equalCursors.invokeExact($arg1.ptr(), $arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isNull = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isNull");
    public static final MethodHandle MTD__clang_Cursor_isNull = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isNull, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isNull(CXCursor cursor)
    {
        try {return ((int)MTD__clang_Cursor_isNull.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_hashCursor = GLOBAL_LOOKUP.findOrThrow("clang_hashCursor");
    public static final MethodHandle MTD__clang_hashCursor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_hashCursor, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_hashCursor(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_hashCursor.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorKind = GLOBAL_LOOKUP.findOrThrow("clang_getCursorKind");
    public static final MethodHandle MTD__clang_getCursorKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorKind(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_getCursorKind.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isDeclaration = GLOBAL_LOOKUP.findOrThrow("clang_isDeclaration");
    public static final MethodHandle MTD__clang_isDeclaration = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isDeclaration, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isDeclaration(int $arg1)
    {
        try {return ((int)MTD__clang_isDeclaration.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isInvalidDeclaration = GLOBAL_LOOKUP.findOrThrow("clang_isInvalidDeclaration");
    public static final MethodHandle MTD__clang_isInvalidDeclaration = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isInvalidDeclaration, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isInvalidDeclaration(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_isInvalidDeclaration.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isReference = GLOBAL_LOOKUP.findOrThrow("clang_isReference");
    public static final MethodHandle MTD__clang_isReference = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isReference, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isReference(int $arg1)
    {
        try {return ((int)MTD__clang_isReference.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isExpression = GLOBAL_LOOKUP.findOrThrow("clang_isExpression");
    public static final MethodHandle MTD__clang_isExpression = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isExpression, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isExpression(int $arg1)
    {
        try {return ((int)MTD__clang_isExpression.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isStatement = GLOBAL_LOOKUP.findOrThrow("clang_isStatement");
    public static final MethodHandle MTD__clang_isStatement = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isStatement, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isStatement(int $arg1)
    {
        try {return ((int)MTD__clang_isStatement.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isAttribute = GLOBAL_LOOKUP.findOrThrow("clang_isAttribute");
    public static final MethodHandle MTD__clang_isAttribute = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isAttribute, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isAttribute(int $arg1)
    {
        try {return ((int)MTD__clang_isAttribute.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_hasAttrs = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasAttrs");
    public static final MethodHandle MTD__clang_Cursor_hasAttrs = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasAttrs, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasAttrs(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_hasAttrs.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isInvalid = GLOBAL_LOOKUP.findOrThrow("clang_isInvalid");
    public static final MethodHandle MTD__clang_isInvalid = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isInvalid, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isInvalid(int $arg1)
    {
        try {return ((int)MTD__clang_isInvalid.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_isTranslationUnit");
    public static final MethodHandle MTD__clang_isTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isTranslationUnit, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isTranslationUnit(int $arg1)
    {
        try {return ((int)MTD__clang_isTranslationUnit.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isPreprocessing = GLOBAL_LOOKUP.findOrThrow("clang_isPreprocessing");
    public static final MethodHandle MTD__clang_isPreprocessing = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isPreprocessing, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isPreprocessing(int $arg1)
    {
        try {return ((int)MTD__clang_isPreprocessing.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isUnexposed = GLOBAL_LOOKUP.findOrThrow("clang_isUnexposed");
    public static final MethodHandle MTD__clang_isUnexposed = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isUnexposed, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isUnexposed(int $arg1)
    {
        try {return ((int)MTD__clang_isUnexposed.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorLinkage = GLOBAL_LOOKUP.findOrThrow("clang_getCursorLinkage");
    public static final MethodHandle MTD__clang_getCursorLinkage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLinkage, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorLinkage(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorLinkage.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorVisibility = GLOBAL_LOOKUP.findOrThrow("clang_getCursorVisibility");
    public static final MethodHandle MTD__clang_getCursorVisibility = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorVisibility, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorVisibility(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorVisibility.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorAvailability = GLOBAL_LOOKUP.findOrThrow("clang_getCursorAvailability");
    public static final MethodHandle MTD__clang_getCursorAvailability = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorAvailability, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorAvailability(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorAvailability.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorPlatformAvailability = GLOBAL_LOOKUP.findOrThrow("clang_getCursorPlatformAvailability");
    public static final MethodHandle MTD__clang_getCursorPlatformAvailability = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPlatformAvailability, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size)
    {
        try {return ((int)MTD__clang_getCursorPlatformAvailability.invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeCXPlatformAvailability = GLOBAL_LOOKUP.findOrThrow("clang_disposeCXPlatformAvailability");
    public static final MethodHandle MTD__clang_disposeCXPlatformAvailability = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXPlatformAvailability, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCXPlatformAvailability(MemorySegment availability)
    {
        try {MTD__clang_disposeCXPlatformAvailability.invokeExact(availability);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getVarDeclInitializer = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getVarDeclInitializer");
    public static final MethodHandle MTD__clang_Cursor_getVarDeclInitializer = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getVarDeclInitializer, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_Cursor_getVarDeclInitializer(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_Cursor_getVarDeclInitializer.invokeExact($segmentAllocator, cursor.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_hasVarDeclGlobalStorage = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasVarDeclGlobalStorage");
    public static final MethodHandle MTD__clang_Cursor_hasVarDeclGlobalStorage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasVarDeclGlobalStorage, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)
    {
        try {return ((int)MTD__clang_Cursor_hasVarDeclGlobalStorage.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_hasVarDeclExternalStorage = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_hasVarDeclExternalStorage");
    public static final MethodHandle MTD__clang_Cursor_hasVarDeclExternalStorage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_hasVarDeclExternalStorage, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)
    {
        try {return ((int)MTD__clang_Cursor_hasVarDeclExternalStorage.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorLanguage = GLOBAL_LOOKUP.findOrThrow("clang_getCursorLanguage");
    public static final MethodHandle MTD__clang_getCursorLanguage = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLanguage, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorLanguage(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorLanguage.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorTLSKind = GLOBAL_LOOKUP.findOrThrow("clang_getCursorTLSKind");
    public static final MethodHandle MTD__clang_getCursorTLSKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorTLSKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorTLSKind(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorTLSKind.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTranslationUnit");
    public static final MethodHandle MTD__clang_Cursor_getTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTranslationUnit, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getTranslationUnit(CXCursor $arg1)
    {
        try {return ((MemorySegment)MTD__clang_Cursor_getTranslationUnit.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_createCXCursorSet = GLOBAL_LOOKUP.findOrThrow("clang_createCXCursorSet");
    public static final MethodHandle MTD__clang_createCXCursorSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_createCXCursorSet, FunctionDescriptor.of(UNBOUNDED_POINTER));
    public static MemorySegment clang_createCXCursorSet()
    {
        try {return ((MemorySegment)MTD__clang_createCXCursorSet.invokeExact());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeCXCursorSet = GLOBAL_LOOKUP.findOrThrow("clang_disposeCXCursorSet");
    public static final MethodHandle MTD__clang_disposeCXCursorSet = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCXCursorSet, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCXCursorSet(MemorySegment cset)
    {
        try {MTD__clang_disposeCXCursorSet.invokeExact(cset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXCursorSet_contains = GLOBAL_LOOKUP.findOrThrow("clang_CXCursorSet_contains");
    public static final MethodHandle MTD__clang_CXCursorSet_contains = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXCursorSet_contains, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static int clang_CXCursorSet_contains(MemorySegment cset, CXCursor cursor)
    {
        try {return ((int)MTD__clang_CXCursorSet_contains.invokeExact(cset, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXCursorSet_insert = GLOBAL_LOOKUP.findOrThrow("clang_CXCursorSet_insert");
    public static final MethodHandle MTD__clang_CXCursorSet_insert = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXCursorSet_insert, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static int clang_CXCursorSet_insert(MemorySegment cset, CXCursor cursor)
    {
        try {return ((int)MTD__clang_CXCursorSet_insert.invokeExact(cset, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorSemanticParent = GLOBAL_LOOKUP.findOrThrow("clang_getCursorSemanticParent");
    public static final MethodHandle MTD__clang_getCursorSemanticParent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorSemanticParent, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorSemanticParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCursorSemanticParent.invokeExact($segmentAllocator, cursor.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorLexicalParent = GLOBAL_LOOKUP.findOrThrow("clang_getCursorLexicalParent");
    public static final MethodHandle MTD__clang_getCursorLexicalParent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLexicalParent, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorLexicalParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCursorLexicalParent.invokeExact($segmentAllocator, cursor.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getOverriddenCursors = GLOBAL_LOOKUP.findOrThrow("clang_getOverriddenCursors");
    public static final MethodHandle MTD__clang_getOverriddenCursors = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getOverriddenCursors, FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden)
    {
        try {MTD__clang_getOverriddenCursors.invokeExact(cursor.ptr(), overridden, num_overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeOverriddenCursors = GLOBAL_LOOKUP.findOrThrow("clang_disposeOverriddenCursors");
    public static final MethodHandle MTD__clang_disposeOverriddenCursors = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeOverriddenCursors, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeOverriddenCursors(MemorySegment overridden)
    {
        try {MTD__clang_disposeOverriddenCursors.invokeExact(overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getIncludedFile = GLOBAL_LOOKUP.findOrThrow("clang_getIncludedFile");
    public static final MethodHandle MTD__clang_getIncludedFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getIncludedFile, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getIncludedFile(CXCursor cursor)
    {
        try {return ((MemorySegment)MTD__clang_getIncludedFile.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursor = GLOBAL_LOOKUP.findOrThrow("clang_getCursor");
    public static final MethodHandle MTD__clang_getCursor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursor, FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
    public static CXCursor clang_getCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCursor.invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorLocation = GLOBAL_LOOKUP.findOrThrow("clang_getCursorLocation");
    public static final MethodHandle MTD__clang_getCursorLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceLocation clang_getCursorLocation(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getCursorLocation.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorExtent = GLOBAL_LOOKUP.findOrThrow("clang_getCursorExtent");
    public static final MethodHandle MTD__clang_getCursorExtent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorExtent, FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceRange clang_getCursorExtent(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getCursorExtent.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorType = GLOBAL_LOOKUP.findOrThrow("clang_getCursorType");
    public static final MethodHandle MTD__clang_getCursorType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getCursorType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getCursorType.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTypeSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getTypeSpelling");
    public static final MethodHandle MTD__clang_getTypeSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeSpelling, FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_getTypeSpelling(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getTypeSpelling.invokeExact($segmentAllocator, CT.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTypedefDeclUnderlyingType = GLOBAL_LOOKUP.findOrThrow("clang_getTypedefDeclUnderlyingType");
    public static final MethodHandle MTD__clang_getTypedefDeclUnderlyingType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypedefDeclUnderlyingType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getTypedefDeclUnderlyingType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getTypedefDeclUnderlyingType.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getEnumDeclIntegerType = GLOBAL_LOOKUP.findOrThrow("clang_getEnumDeclIntegerType");
    public static final MethodHandle MTD__clang_getEnumDeclIntegerType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumDeclIntegerType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getEnumDeclIntegerType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getEnumDeclIntegerType.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getEnumConstantDeclValue = GLOBAL_LOOKUP.findOrThrow("clang_getEnumConstantDeclValue");
    public static final MethodHandle MTD__clang_getEnumConstantDeclValue = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumConstantDeclValue, FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_getEnumConstantDeclValue(CXCursor C)
    {
        try {return ((long)MTD__clang_getEnumConstantDeclValue.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getEnumConstantDeclUnsignedValue = GLOBAL_LOOKUP.findOrThrow("clang_getEnumConstantDeclUnsignedValue");
    public static final MethodHandle MTD__clang_getEnumConstantDeclUnsignedValue = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getEnumConstantDeclUnsignedValue, FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C)
    {
        try {return ((long)MTD__clang_getEnumConstantDeclUnsignedValue.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isBitField = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isBitField");
    public static final MethodHandle MTD__clang_Cursor_isBitField = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isBitField, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isBitField(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isBitField.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFieldDeclBitWidth = GLOBAL_LOOKUP.findOrThrow("clang_getFieldDeclBitWidth");
    public static final MethodHandle MTD__clang_getFieldDeclBitWidth = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFieldDeclBitWidth, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getFieldDeclBitWidth(CXCursor C)
    {
        try {return ((int)MTD__clang_getFieldDeclBitWidth.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getNumArguments = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getNumArguments");
    public static final MethodHandle MTD__clang_Cursor_getNumArguments = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getNumArguments, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getNumArguments(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_getNumArguments.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getArgument = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getArgument");
    public static final MethodHandle MTD__clang_Cursor_getArgument = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getArgument, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXCursor clang_Cursor_getArgument(SegmentAllocator $segmentAllocator, CXCursor C, int i)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_Cursor_getArgument.invokeExact($segmentAllocator, C.ptr(), i)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getNumTemplateArguments = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getNumTemplateArguments");
    public static final MethodHandle MTD__clang_Cursor_getNumTemplateArguments = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getNumTemplateArguments, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getNumTemplateArguments(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_getNumTemplateArguments.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentKind = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentKind");
    public static final MethodHandle MTD__clang_Cursor_getTemplateArgumentKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
    public static int clang_Cursor_getTemplateArgumentKind(CXCursor C, int I)
    {
        try {return ((int)MTD__clang_Cursor_getTemplateArgumentKind.invokeExact(C.ptr(), I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentType = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentType");
    public static final MethodHandle MTD__clang_Cursor_getTemplateArgumentType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXType clang_Cursor_getTemplateArgumentType(SegmentAllocator $segmentAllocator, CXCursor C, int I)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Cursor_getTemplateArgumentType.invokeExact($segmentAllocator, C.ptr(), I)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentValue = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentValue");
    public static final MethodHandle MTD__clang_Cursor_getTemplateArgumentValue = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentValue, FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentValue(CXCursor C, int I)
    {
        try {return ((long)MTD__clang_Cursor_getTemplateArgumentValue.invokeExact(C.ptr(), I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getTemplateArgumentUnsignedValue = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getTemplateArgumentUnsignedValue");
    public static final MethodHandle MTD__clang_Cursor_getTemplateArgumentUnsignedValue = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getTemplateArgumentUnsignedValue, FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I)
    {
        try {return ((long)MTD__clang_Cursor_getTemplateArgumentUnsignedValue.invokeExact(C.ptr(), I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_equalTypes = GLOBAL_LOOKUP.findOrThrow("clang_equalTypes");
    public static final MethodHandle MTD__clang_equalTypes = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_equalTypes, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, CXType.LAYOUT));
    public static int clang_equalTypes(CXType A, CXType B)
    {
        try {return ((int)MTD__clang_equalTypes.invokeExact(A.ptr(), B.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCanonicalType = GLOBAL_LOOKUP.findOrThrow("clang_getCanonicalType");
    public static final MethodHandle MTD__clang_getCanonicalType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCanonicalType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getCanonicalType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getCanonicalType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isConstQualifiedType = GLOBAL_LOOKUP.findOrThrow("clang_isConstQualifiedType");
    public static final MethodHandle MTD__clang_isConstQualifiedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isConstQualifiedType, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isConstQualifiedType(CXType T)
    {
        try {return ((int)MTD__clang_isConstQualifiedType.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isMacroFunctionLike = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isMacroFunctionLike");
    public static final MethodHandle MTD__clang_Cursor_isMacroFunctionLike = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isMacroFunctionLike, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isMacroFunctionLike(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isMacroFunctionLike.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isMacroBuiltin = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isMacroBuiltin");
    public static final MethodHandle MTD__clang_Cursor_isMacroBuiltin = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isMacroBuiltin, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isMacroBuiltin(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isMacroBuiltin.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isFunctionInlined = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isFunctionInlined");
    public static final MethodHandle MTD__clang_Cursor_isFunctionInlined = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isFunctionInlined, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isFunctionInlined(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isFunctionInlined.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isVolatileQualifiedType = GLOBAL_LOOKUP.findOrThrow("clang_isVolatileQualifiedType");
    public static final MethodHandle MTD__clang_isVolatileQualifiedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isVolatileQualifiedType, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isVolatileQualifiedType(CXType T)
    {
        try {return ((int)MTD__clang_isVolatileQualifiedType.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isRestrictQualifiedType = GLOBAL_LOOKUP.findOrThrow("clang_isRestrictQualifiedType");
    public static final MethodHandle MTD__clang_isRestrictQualifiedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isRestrictQualifiedType, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isRestrictQualifiedType(CXType T)
    {
        try {return ((int)MTD__clang_isRestrictQualifiedType.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getAddressSpace = GLOBAL_LOOKUP.findOrThrow("clang_getAddressSpace");
    public static final MethodHandle MTD__clang_getAddressSpace = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getAddressSpace, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getAddressSpace(CXType T)
    {
        try {return ((int)MTD__clang_getAddressSpace.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTypedefName = GLOBAL_LOOKUP.findOrThrow("clang_getTypedefName");
    public static final MethodHandle MTD__clang_getTypedefName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypedefName, FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_getTypedefName(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getTypedefName.invokeExact($segmentAllocator, CT.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getPointeeType = GLOBAL_LOOKUP.findOrThrow("clang_getPointeeType");
    public static final MethodHandle MTD__clang_getPointeeType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getPointeeType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getPointeeType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getPointeeType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getUnqualifiedType = GLOBAL_LOOKUP.findOrThrow("clang_getUnqualifiedType");
    public static final MethodHandle MTD__clang_getUnqualifiedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getUnqualifiedType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getUnqualifiedType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getUnqualifiedType.invokeExact($segmentAllocator, CT.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNonReferenceType = GLOBAL_LOOKUP.findOrThrow("clang_getNonReferenceType");
    public static final MethodHandle MTD__clang_getNonReferenceType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNonReferenceType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getNonReferenceType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getNonReferenceType.invokeExact($segmentAllocator, CT.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTypeDeclaration = GLOBAL_LOOKUP.findOrThrow("clang_getTypeDeclaration");
    public static final MethodHandle MTD__clang_getTypeDeclaration = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeDeclaration, FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT));
    public static CXCursor clang_getTypeDeclaration(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getTypeDeclaration.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDeclObjCTypeEncoding = GLOBAL_LOOKUP.findOrThrow("clang_getDeclObjCTypeEncoding");
    public static final MethodHandle MTD__clang_getDeclObjCTypeEncoding = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDeclObjCTypeEncoding, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getDeclObjCTypeEncoding(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getDeclObjCTypeEncoding.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getObjCEncoding = GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCEncoding");
    public static final MethodHandle MTD__clang_Type_getObjCEncoding = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCEncoding, FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_Type_getObjCEncoding(SegmentAllocator $segmentAllocator, CXType type)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Type_getObjCEncoding.invokeExact($segmentAllocator, type.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTypeKindSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getTypeKindSpelling");
    public static final MethodHandle MTD__clang_getTypeKindSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTypeKindSpelling, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getTypeKindSpelling(SegmentAllocator $segmentAllocator, int K)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getTypeKindSpelling.invokeExact($segmentAllocator, K)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getFunctionTypeCallingConv = GLOBAL_LOOKUP.findOrThrow("clang_getFunctionTypeCallingConv");
    public static final MethodHandle MTD__clang_getFunctionTypeCallingConv = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getFunctionTypeCallingConv, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getFunctionTypeCallingConv(CXType T)
    {
        try {return ((int)MTD__clang_getFunctionTypeCallingConv.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getResultType = GLOBAL_LOOKUP.findOrThrow("clang_getResultType");
    public static final MethodHandle MTD__clang_getResultType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getResultType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getResultType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getResultType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getExceptionSpecificationType = GLOBAL_LOOKUP.findOrThrow("clang_getExceptionSpecificationType");
    public static final MethodHandle MTD__clang_getExceptionSpecificationType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getExceptionSpecificationType, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getExceptionSpecificationType(CXType T)
    {
        try {return ((int)MTD__clang_getExceptionSpecificationType.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumArgTypes = GLOBAL_LOOKUP.findOrThrow("clang_getNumArgTypes");
    public static final MethodHandle MTD__clang_getNumArgTypes = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumArgTypes, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getNumArgTypes(CXType T)
    {
        try {return ((int)MTD__clang_getNumArgTypes.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getArgType = GLOBAL_LOOKUP.findOrThrow("clang_getArgType");
    public static final MethodHandle MTD__clang_getArgType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArgType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_getArgType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getArgType.invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getObjCObjectBaseType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCObjectBaseType");
    public static final MethodHandle MTD__clang_Type_getObjCObjectBaseType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCObjectBaseType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getObjCObjectBaseType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getObjCObjectBaseType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getNumObjCProtocolRefs = GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumObjCProtocolRefs");
    public static final MethodHandle MTD__clang_Type_getNumObjCProtocolRefs = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumObjCProtocolRefs, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumObjCProtocolRefs(CXType T)
    {
        try {return ((int)MTD__clang_Type_getNumObjCProtocolRefs.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getObjCProtocolDecl = GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCProtocolDecl");
    public static final MethodHandle MTD__clang_Type_getObjCProtocolDecl = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCProtocolDecl, FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXCursor clang_Type_getObjCProtocolDecl(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_Type_getObjCProtocolDecl.invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getNumObjCTypeArgs = GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumObjCTypeArgs");
    public static final MethodHandle MTD__clang_Type_getNumObjCTypeArgs = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumObjCTypeArgs, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumObjCTypeArgs(CXType T)
    {
        try {return ((int)MTD__clang_Type_getNumObjCTypeArgs.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getObjCTypeArg = GLOBAL_LOOKUP.findOrThrow("clang_Type_getObjCTypeArg");
    public static final MethodHandle MTD__clang_Type_getObjCTypeArg = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getObjCTypeArg, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_Type_getObjCTypeArg(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getObjCTypeArg.invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isFunctionTypeVariadic = GLOBAL_LOOKUP.findOrThrow("clang_isFunctionTypeVariadic");
    public static final MethodHandle MTD__clang_isFunctionTypeVariadic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isFunctionTypeVariadic, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isFunctionTypeVariadic(CXType T)
    {
        try {return ((int)MTD__clang_isFunctionTypeVariadic.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorResultType = GLOBAL_LOOKUP.findOrThrow("clang_getCursorResultType");
    public static final MethodHandle MTD__clang_getCursorResultType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorResultType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getCursorResultType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getCursorResultType.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorExceptionSpecificationType = GLOBAL_LOOKUP.findOrThrow("clang_getCursorExceptionSpecificationType");
    public static final MethodHandle MTD__clang_getCursorExceptionSpecificationType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorExceptionSpecificationType, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorExceptionSpecificationType(CXCursor C)
    {
        try {return ((int)MTD__clang_getCursorExceptionSpecificationType.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isPODType = GLOBAL_LOOKUP.findOrThrow("clang_isPODType");
    public static final MethodHandle MTD__clang_isPODType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isPODType, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isPODType(CXType T)
    {
        try {return ((int)MTD__clang_isPODType.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getElementType = GLOBAL_LOOKUP.findOrThrow("clang_getElementType");
    public static final MethodHandle MTD__clang_getElementType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getElementType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getElementType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumElements = GLOBAL_LOOKUP.findOrThrow("clang_getNumElements");
    public static final MethodHandle MTD__clang_getNumElements = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumElements, FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_getNumElements(CXType T)
    {
        try {return ((long)MTD__clang_getNumElements.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getArrayElementType = GLOBAL_LOOKUP.findOrThrow("clang_getArrayElementType");
    public static final MethodHandle MTD__clang_getArrayElementType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArrayElementType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getArrayElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getArrayElementType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getArraySize = GLOBAL_LOOKUP.findOrThrow("clang_getArraySize");
    public static final MethodHandle MTD__clang_getArraySize = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getArraySize, FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_getArraySize(CXType T)
    {
        try {return ((long)MTD__clang_getArraySize.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getNamedType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getNamedType");
    public static final MethodHandle MTD__clang_Type_getNamedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNamedType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getNamedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getNamedType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_isTransparentTagTypedef = GLOBAL_LOOKUP.findOrThrow("clang_Type_isTransparentTagTypedef");
    public static final MethodHandle MTD__clang_Type_isTransparentTagTypedef = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_isTransparentTagTypedef, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_isTransparentTagTypedef(CXType T)
    {
        try {return ((int)MTD__clang_Type_isTransparentTagTypedef.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getNullability = GLOBAL_LOOKUP.findOrThrow("clang_Type_getNullability");
    public static final MethodHandle MTD__clang_Type_getNullability = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNullability, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNullability(CXType T)
    {
        try {return ((int)MTD__clang_Type_getNullability.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getAlignOf = GLOBAL_LOOKUP.findOrThrow("clang_Type_getAlignOf");
    public static final MethodHandle MTD__clang_Type_getAlignOf = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getAlignOf, FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_Type_getAlignOf(CXType T)
    {
        try {return ((long)MTD__clang_Type_getAlignOf.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getClassType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getClassType");
    public static final MethodHandle MTD__clang_Type_getClassType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getClassType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getClassType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getClassType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getSizeOf = GLOBAL_LOOKUP.findOrThrow("clang_Type_getSizeOf");
    public static final MethodHandle MTD__clang_Type_getSizeOf = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getSizeOf, FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_Type_getSizeOf(CXType T)
    {
        try {return ((long)MTD__clang_Type_getSizeOf.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getOffsetOf = GLOBAL_LOOKUP.findOrThrow("clang_Type_getOffsetOf");
    public static final MethodHandle MTD__clang_Type_getOffsetOf = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getOffsetOf, FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT, UNBOUNDED_POINTER));
    public static long clang_Type_getOffsetOf(CXType T, MemorySegment S)
    {
        try {return ((long)MTD__clang_Type_getOffsetOf.invokeExact(T.ptr(), S));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getModifiedType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getModifiedType");
    public static final MethodHandle MTD__clang_Type_getModifiedType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getModifiedType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getModifiedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getModifiedType.invokeExact($segmentAllocator, T.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getValueType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getValueType");
    public static final MethodHandle MTD__clang_Type_getValueType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getValueType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getValueType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getValueType.invokeExact($segmentAllocator, CT.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getOffsetOfField = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getOffsetOfField");
    public static final MethodHandle MTD__clang_Cursor_getOffsetOfField = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getOffsetOfField, FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_Cursor_getOffsetOfField(CXCursor C)
    {
        try {return ((long)MTD__clang_Cursor_getOffsetOfField.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isAnonymous = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isAnonymous");
    public static final MethodHandle MTD__clang_Cursor_isAnonymous = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isAnonymous, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isAnonymous(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isAnonymous.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isAnonymousRecordDecl = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isAnonymousRecordDecl");
    public static final MethodHandle MTD__clang_Cursor_isAnonymousRecordDecl = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isAnonymousRecordDecl, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isAnonymousRecordDecl(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isAnonymousRecordDecl.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isInlineNamespace = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isInlineNamespace");
    public static final MethodHandle MTD__clang_Cursor_isInlineNamespace = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isInlineNamespace, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isInlineNamespace(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isInlineNamespace.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getNumTemplateArguments = GLOBAL_LOOKUP.findOrThrow("clang_Type_getNumTemplateArguments");
    public static final MethodHandle MTD__clang_Type_getNumTemplateArguments = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getNumTemplateArguments, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumTemplateArguments(CXType T)
    {
        try {return ((int)MTD__clang_Type_getNumTemplateArguments.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getTemplateArgumentAsType = GLOBAL_LOOKUP.findOrThrow("clang_Type_getTemplateArgumentAsType");
    public static final MethodHandle MTD__clang_Type_getTemplateArgumentAsType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getTemplateArgumentAsType, FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_Type_getTemplateArgumentAsType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Type_getTemplateArgumentAsType.invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_getCXXRefQualifier = GLOBAL_LOOKUP.findOrThrow("clang_Type_getCXXRefQualifier");
    public static final MethodHandle MTD__clang_Type_getCXXRefQualifier = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_getCXXRefQualifier, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getCXXRefQualifier(CXType T)
    {
        try {return ((int)MTD__clang_Type_getCXXRefQualifier.invokeExact(T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isVirtualBase = GLOBAL_LOOKUP.findOrThrow("clang_isVirtualBase");
    public static final MethodHandle MTD__clang_isVirtualBase = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isVirtualBase, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isVirtualBase(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_isVirtualBase.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCXXAccessSpecifier = GLOBAL_LOOKUP.findOrThrow("clang_getCXXAccessSpecifier");
    public static final MethodHandle MTD__clang_getCXXAccessSpecifier = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCXXAccessSpecifier, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCXXAccessSpecifier(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_getCXXAccessSpecifier.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getBinaryOpcode = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBinaryOpcode");
    public static final MethodHandle MTD__clang_Cursor_getBinaryOpcode = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBinaryOpcode, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getBinaryOpcode(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_getBinaryOpcode.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getBinaryOpcodeStr = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBinaryOpcodeStr");
    public static final MethodHandle MTD__clang_Cursor_getBinaryOpcodeStr = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBinaryOpcodeStr, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_Cursor_getBinaryOpcodeStr(SegmentAllocator $segmentAllocator, int Op)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getBinaryOpcodeStr.invokeExact($segmentAllocator, Op)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getStorageClass = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getStorageClass");
    public static final MethodHandle MTD__clang_Cursor_getStorageClass = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getStorageClass, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getStorageClass(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_Cursor_getStorageClass.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumOverloadedDecls = GLOBAL_LOOKUP.findOrThrow("clang_getNumOverloadedDecls");
    public static final MethodHandle MTD__clang_getNumOverloadedDecls = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumOverloadedDecls, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getNumOverloadedDecls(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getNumOverloadedDecls.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getOverloadedDecl = GLOBAL_LOOKUP.findOrThrow("clang_getOverloadedDecl");
    public static final MethodHandle MTD__clang_getOverloadedDecl = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getOverloadedDecl, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXCursor clang_getOverloadedDecl(SegmentAllocator $segmentAllocator, CXCursor cursor, int index)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getOverloadedDecl.invokeExact($segmentAllocator, cursor.ptr(), index)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getIBOutletCollectionType = GLOBAL_LOOKUP.findOrThrow("clang_getIBOutletCollectionType");
    public static final MethodHandle MTD__clang_getIBOutletCollectionType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getIBOutletCollectionType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getIBOutletCollectionType(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXType(((MemorySegment)MTD__clang_getIBOutletCollectionType.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_visitChildren = GLOBAL_LOOKUP.findOrThrow("clang_visitChildren");
    public static final MethodHandle MTD__clang_visitChildren = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_visitChildren, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data)
    {
        try {return ((int)MTD__clang_visitChildren.invokeExact(parent.ptr(), visitor, client_data));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_visitChildrenWithBlock = GLOBAL_LOOKUP.findOrThrow("clang_visitChildrenWithBlock");
    public static final MethodHandle MTD__clang_visitChildrenWithBlock = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_visitChildrenWithBlock, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static int clang_visitChildrenWithBlock(CXCursor parent, MemorySegment block)
    {
        try {return ((int)MTD__clang_visitChildrenWithBlock.invokeExact(parent.ptr(), block));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorUSR = GLOBAL_LOOKUP.findOrThrow("clang_getCursorUSR");
    public static final MethodHandle MTD__clang_getCursorUSR = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorUSR, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorUSR(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCursorUSR.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCClass = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCClass");
    public static final MethodHandle MTD__clang_constructUSR_ObjCClass = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCClass, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCClass(SegmentAllocator $segmentAllocator, MemorySegment class_name)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCClass.invokeExact($segmentAllocator, class_name)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCCategory = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCCategory");
    public static final MethodHandle MTD__clang_constructUSR_ObjCCategory = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCCategory, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCCategory(SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCCategory.invokeExact($segmentAllocator, class_name, category_name)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCProtocol = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCProtocol");
    public static final MethodHandle MTD__clang_constructUSR_ObjCProtocol = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCProtocol, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCProtocol(SegmentAllocator $segmentAllocator, MemorySegment protocol_name)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCProtocol.invokeExact($segmentAllocator, protocol_name)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCIvar = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCIvar");
    public static final MethodHandle MTD__clang_constructUSR_ObjCIvar = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCIvar, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCIvar(SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCIvar.invokeExact($segmentAllocator, name, classUSR.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCMethod = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCMethod");
    public static final MethodHandle MTD__clang_constructUSR_ObjCMethod = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCMethod, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCMethod(SegmentAllocator $segmentAllocator, MemorySegment name, int isInstanceMethod, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCMethod.invokeExact($segmentAllocator, name, isInstanceMethod, classUSR.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_constructUSR_ObjCProperty = GLOBAL_LOOKUP.findOrThrow("clang_constructUSR_ObjCProperty");
    public static final MethodHandle MTD__clang_constructUSR_ObjCProperty = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_constructUSR_ObjCProperty, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCProperty(SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)MTD__clang_constructUSR_ObjCProperty.invokeExact($segmentAllocator, property, classUSR.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getCursorSpelling");
    public static final MethodHandle MTD__clang_getCursorSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorSpelling, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorSpelling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCursorSpelling.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getSpellingNameRange = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getSpellingNameRange");
    public static final MethodHandle MTD__clang_Cursor_getSpellingNameRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getSpellingNameRange, FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
    public static CXSourceRange clang_Cursor_getSpellingNameRange(SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_Cursor_getSpellingNameRange.invokeExact($segmentAllocator, $arg1.ptr(), pieceIndex, options)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_PrintingPolicy_getProperty = GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_getProperty");
    public static final MethodHandle MTD__clang_PrintingPolicy_getProperty = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_getProperty, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_PrintingPolicy_getProperty(MemorySegment Policy, int Property)
    {
        try {return ((int)MTD__clang_PrintingPolicy_getProperty.invokeExact(Policy, Property));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_PrintingPolicy_setProperty = GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_setProperty");
    public static final MethodHandle MTD__clang_PrintingPolicy_setProperty = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_setProperty, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static void clang_PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value)
    {
        try {MTD__clang_PrintingPolicy_setProperty.invokeExact(Policy, Property, Value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorPrintingPolicy = GLOBAL_LOOKUP.findOrThrow("clang_getCursorPrintingPolicy");
    public static final MethodHandle MTD__clang_getCursorPrintingPolicy = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPrintingPolicy, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getCursorPrintingPolicy(CXCursor $arg1)
    {
        try {return ((MemorySegment)MTD__clang_getCursorPrintingPolicy.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_PrintingPolicy_dispose = GLOBAL_LOOKUP.findOrThrow("clang_PrintingPolicy_dispose");
    public static final MethodHandle MTD__clang_PrintingPolicy_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_PrintingPolicy_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_PrintingPolicy_dispose(MemorySegment Policy)
    {
        try {MTD__clang_PrintingPolicy_dispose.invokeExact(Policy);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorPrettyPrinted = GLOBAL_LOOKUP.findOrThrow("clang_getCursorPrettyPrinted");
    public static final MethodHandle MTD__clang_getCursorPrettyPrinted = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorPrettyPrinted, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getCursorPrettyPrinted(SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCursorPrettyPrinted.invokeExact($segmentAllocator, Cursor.ptr(), Policy)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorDisplayName = GLOBAL_LOOKUP.findOrThrow("clang_getCursorDisplayName");
    public static final MethodHandle MTD__clang_getCursorDisplayName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorDisplayName, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorDisplayName(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCursorDisplayName.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorReferenced = GLOBAL_LOOKUP.findOrThrow("clang_getCursorReferenced");
    public static final MethodHandle MTD__clang_getCursorReferenced = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorReferenced, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorReferenced(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCursorReferenced.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorDefinition = GLOBAL_LOOKUP.findOrThrow("clang_getCursorDefinition");
    public static final MethodHandle MTD__clang_getCursorDefinition = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorDefinition, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorDefinition(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCursorDefinition.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_isCursorDefinition = GLOBAL_LOOKUP.findOrThrow("clang_isCursorDefinition");
    public static final MethodHandle MTD__clang_isCursorDefinition = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_isCursorDefinition, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isCursorDefinition(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_isCursorDefinition.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCanonicalCursor = GLOBAL_LOOKUP.findOrThrow("clang_getCanonicalCursor");
    public static final MethodHandle MTD__clang_getCanonicalCursor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCanonicalCursor, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCanonicalCursor(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getCanonicalCursor.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCSelectorIndex = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCSelectorIndex");
    public static final MethodHandle MTD__clang_Cursor_getObjCSelectorIndex = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCSelectorIndex, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getObjCSelectorIndex(CXCursor $arg1)
    {
        try {return ((int)MTD__clang_Cursor_getObjCSelectorIndex.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isDynamicCall = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isDynamicCall");
    public static final MethodHandle MTD__clang_Cursor_isDynamicCall = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isDynamicCall, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isDynamicCall(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isDynamicCall.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getReceiverType = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getReceiverType");
    public static final MethodHandle MTD__clang_Cursor_getReceiverType = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getReceiverType, FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_Cursor_getReceiverType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)MTD__clang_Cursor_getReceiverType.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertyAttributes = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertyAttributes");
    public static final MethodHandle MTD__clang_Cursor_getObjCPropertyAttributes = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertyAttributes, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
    public static int clang_Cursor_getObjCPropertyAttributes(CXCursor C, int reserved)
    {
        try {return ((int)MTD__clang_Cursor_getObjCPropertyAttributes.invokeExact(C.ptr(), reserved));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertyGetterName = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertyGetterName");
    public static final MethodHandle MTD__clang_Cursor_getObjCPropertyGetterName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertyGetterName, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getObjCPropertyGetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getObjCPropertyGetterName.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCPropertySetterName = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCPropertySetterName");
    public static final MethodHandle MTD__clang_Cursor_getObjCPropertySetterName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCPropertySetterName, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getObjCPropertySetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getObjCPropertySetterName.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCDeclQualifiers = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCDeclQualifiers");
    public static final MethodHandle MTD__clang_Cursor_getObjCDeclQualifiers = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCDeclQualifiers, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getObjCDeclQualifiers(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_getObjCDeclQualifiers.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isObjCOptional = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isObjCOptional");
    public static final MethodHandle MTD__clang_Cursor_isObjCOptional = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isObjCOptional, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isObjCOptional(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isObjCOptional.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isVariadic = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isVariadic");
    public static final MethodHandle MTD__clang_Cursor_isVariadic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isVariadic, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isVariadic(CXCursor C)
    {
        try {return ((int)MTD__clang_Cursor_isVariadic.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_isExternalSymbol = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_isExternalSymbol");
    public static final MethodHandle MTD__clang_Cursor_isExternalSymbol = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_isExternalSymbol, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated)
    {
        try {return ((int)MTD__clang_Cursor_isExternalSymbol.invokeExact(C.ptr(), language, definedIn, isGenerated));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getCommentRange = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getCommentRange");
    public static final MethodHandle MTD__clang_Cursor_getCommentRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getCommentRange, FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceRange clang_Cursor_getCommentRange(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_Cursor_getCommentRange.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getRawCommentText = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getRawCommentText");
    public static final MethodHandle MTD__clang_Cursor_getRawCommentText = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getRawCommentText, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getRawCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getRawCommentText.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getBriefCommentText = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getBriefCommentText");
    public static final MethodHandle MTD__clang_Cursor_getBriefCommentText = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getBriefCommentText, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getBriefCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getBriefCommentText.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getMangling = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getMangling");
    public static final MethodHandle MTD__clang_Cursor_getMangling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getMangling, FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getMangling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Cursor_getMangling.invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getCXXManglings = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getCXXManglings");
    public static final MethodHandle MTD__clang_Cursor_getCXXManglings = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getCXXManglings, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getCXXManglings(CXCursor $arg1)
    {
        try {return ((MemorySegment)MTD__clang_Cursor_getCXXManglings.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getObjCManglings = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getObjCManglings");
    public static final MethodHandle MTD__clang_Cursor_getObjCManglings = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getObjCManglings, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getObjCManglings(CXCursor $arg1)
    {
        try {return ((MemorySegment)MTD__clang_Cursor_getObjCManglings.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_getModule = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_getModule");
    public static final MethodHandle MTD__clang_Cursor_getModule = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_getModule, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getModule(CXCursor C)
    {
        try {return ((MemorySegment)MTD__clang_Cursor_getModule.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getModuleForFile = GLOBAL_LOOKUP.findOrThrow("clang_getModuleForFile");
    public static final MethodHandle MTD__clang_getModuleForFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getModuleForFile, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getModuleForFile(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {return ((MemorySegment)MTD__clang_getModuleForFile.invokeExact($arg1, $arg2));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getASTFile = GLOBAL_LOOKUP.findOrThrow("clang_Module_getASTFile");
    public static final MethodHandle MTD__clang_Module_getASTFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getASTFile, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_Module_getASTFile(MemorySegment Module)
    {
        try {return ((MemorySegment)MTD__clang_Module_getASTFile.invokeExact(Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getParent = GLOBAL_LOOKUP.findOrThrow("clang_Module_getParent");
    public static final MethodHandle MTD__clang_Module_getParent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getParent, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_Module_getParent(MemorySegment Module)
    {
        try {return ((MemorySegment)MTD__clang_Module_getParent.invokeExact(Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getName = GLOBAL_LOOKUP.findOrThrow("clang_Module_getName");
    public static final MethodHandle MTD__clang_Module_getName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getName, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_Module_getName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Module_getName.invokeExact($segmentAllocator, Module)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getFullName = GLOBAL_LOOKUP.findOrThrow("clang_Module_getFullName");
    public static final MethodHandle MTD__clang_Module_getFullName = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getFullName, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_Module_getFullName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString(((MemorySegment)MTD__clang_Module_getFullName.invokeExact($segmentAllocator, Module)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_isSystem = GLOBAL_LOOKUP.findOrThrow("clang_Module_isSystem");
    public static final MethodHandle MTD__clang_Module_isSystem = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_isSystem, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_Module_isSystem(MemorySegment Module)
    {
        try {return ((int)MTD__clang_Module_isSystem.invokeExact(Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getNumTopLevelHeaders = GLOBAL_LOOKUP.findOrThrow("clang_Module_getNumTopLevelHeaders");
    public static final MethodHandle MTD__clang_Module_getNumTopLevelHeaders = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getNumTopLevelHeaders, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module)
    {
        try {return ((int)MTD__clang_Module_getNumTopLevelHeaders.invokeExact($arg1, Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Module_getTopLevelHeader = GLOBAL_LOOKUP.findOrThrow("clang_Module_getTopLevelHeader");
    public static final MethodHandle MTD__clang_Module_getTopLevelHeader = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Module_getTopLevelHeader, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index)
    {
        try {return ((MemorySegment)MTD__clang_Module_getTopLevelHeader.invokeExact($arg1, Module, Index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXConstructor_isConvertingConstructor = GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isConvertingConstructor");
    public static final MethodHandle MTD__clang_CXXConstructor_isConvertingConstructor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isConvertingConstructor, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isConvertingConstructor(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXConstructor_isConvertingConstructor.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXConstructor_isCopyConstructor = GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isCopyConstructor");
    public static final MethodHandle MTD__clang_CXXConstructor_isCopyConstructor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isCopyConstructor, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isCopyConstructor(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXConstructor_isCopyConstructor.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXConstructor_isDefaultConstructor = GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isDefaultConstructor");
    public static final MethodHandle MTD__clang_CXXConstructor_isDefaultConstructor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isDefaultConstructor, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isDefaultConstructor(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXConstructor_isDefaultConstructor.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXConstructor_isMoveConstructor = GLOBAL_LOOKUP.findOrThrow("clang_CXXConstructor_isMoveConstructor");
    public static final MethodHandle MTD__clang_CXXConstructor_isMoveConstructor = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXConstructor_isMoveConstructor, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isMoveConstructor(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXConstructor_isMoveConstructor.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXField_isMutable = GLOBAL_LOOKUP.findOrThrow("clang_CXXField_isMutable");
    public static final MethodHandle MTD__clang_CXXField_isMutable = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXField_isMutable, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXField_isMutable(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXField_isMutable.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isDefaulted = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isDefaulted");
    public static final MethodHandle MTD__clang_CXXMethod_isDefaulted = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isDefaulted, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isDefaulted(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isDefaulted.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isDeleted = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isDeleted");
    public static final MethodHandle MTD__clang_CXXMethod_isDeleted = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isDeleted, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isDeleted(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isDeleted.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isPureVirtual = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isPureVirtual");
    public static final MethodHandle MTD__clang_CXXMethod_isPureVirtual = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isPureVirtual, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isPureVirtual(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isPureVirtual.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isStatic = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isStatic");
    public static final MethodHandle MTD__clang_CXXMethod_isStatic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isStatic, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isStatic(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isStatic.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isVirtual = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isVirtual");
    public static final MethodHandle MTD__clang_CXXMethod_isVirtual = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isVirtual, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isVirtual(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isVirtual.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isCopyAssignmentOperator = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isCopyAssignmentOperator");
    public static final MethodHandle MTD__clang_CXXMethod_isCopyAssignmentOperator = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isCopyAssignmentOperator, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isCopyAssignmentOperator.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isMoveAssignmentOperator = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isMoveAssignmentOperator");
    public static final MethodHandle MTD__clang_CXXMethod_isMoveAssignmentOperator = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isMoveAssignmentOperator, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isMoveAssignmentOperator.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isExplicit = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isExplicit");
    public static final MethodHandle MTD__clang_CXXMethod_isExplicit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isExplicit, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isExplicit(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isExplicit.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXRecord_isAbstract = GLOBAL_LOOKUP.findOrThrow("clang_CXXRecord_isAbstract");
    public static final MethodHandle MTD__clang_CXXRecord_isAbstract = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXRecord_isAbstract, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXRecord_isAbstract(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXRecord_isAbstract.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EnumDecl_isScoped = GLOBAL_LOOKUP.findOrThrow("clang_EnumDecl_isScoped");
    public static final MethodHandle MTD__clang_EnumDecl_isScoped = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EnumDecl_isScoped, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_EnumDecl_isScoped(CXCursor C)
    {
        try {return ((int)MTD__clang_EnumDecl_isScoped.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_CXXMethod_isConst = GLOBAL_LOOKUP.findOrThrow("clang_CXXMethod_isConst");
    public static final MethodHandle MTD__clang_CXXMethod_isConst = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_CXXMethod_isConst, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isConst(CXCursor C)
    {
        try {return ((int)MTD__clang_CXXMethod_isConst.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTemplateCursorKind = GLOBAL_LOOKUP.findOrThrow("clang_getTemplateCursorKind");
    public static final MethodHandle MTD__clang_getTemplateCursorKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTemplateCursorKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getTemplateCursorKind(CXCursor C)
    {
        try {return ((int)MTD__clang_getTemplateCursorKind.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getSpecializedCursorTemplate = GLOBAL_LOOKUP.findOrThrow("clang_getSpecializedCursorTemplate");
    public static final MethodHandle MTD__clang_getSpecializedCursorTemplate = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getSpecializedCursorTemplate, FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getSpecializedCursorTemplate(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXCursor(((MemorySegment)MTD__clang_getSpecializedCursorTemplate.invokeExact($segmentAllocator, C.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorReferenceNameRange = GLOBAL_LOOKUP.findOrThrow("clang_getCursorReferenceNameRange");
    public static final MethodHandle MTD__clang_getCursorReferenceNameRange = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorReferenceNameRange, FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
    public static CXSourceRange clang_getCursorReferenceNameRange(SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getCursorReferenceNameRange.invokeExact($segmentAllocator, C.ptr(), NameFlags, PieceIndex)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getToken = GLOBAL_LOOKUP.findOrThrow("clang_getToken");
    public static final MethodHandle MTD__clang_getToken = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getToken, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
    public static MemorySegment clang_getToken(MemorySegment TU, CXSourceLocation Location)
    {
        try {return ((MemorySegment)MTD__clang_getToken.invokeExact(TU, Location.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTokenKind = GLOBAL_LOOKUP.findOrThrow("clang_getTokenKind");
    public static final MethodHandle MTD__clang_getTokenKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenKind, FunctionDescriptor.of(JAVA_INT, CXToken.LAYOUT));
    public static int clang_getTokenKind(CXToken $arg1)
    {
        try {return ((int)MTD__clang_getTokenKind.invokeExact($arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTokenSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getTokenSpelling");
    public static final MethodHandle MTD__clang_getTokenSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenSpelling, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXString clang_getTokenSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getTokenSpelling.invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTokenLocation = GLOBAL_LOOKUP.findOrThrow("clang_getTokenLocation");
    public static final MethodHandle MTD__clang_getTokenLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXSourceLocation clang_getTokenLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_getTokenLocation.invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getTokenExtent = GLOBAL_LOOKUP.findOrThrow("clang_getTokenExtent");
    public static final MethodHandle MTD__clang_getTokenExtent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getTokenExtent, FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXSourceRange clang_getTokenExtent(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceRange(((MemorySegment)MTD__clang_getTokenExtent.invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_tokenize = GLOBAL_LOOKUP.findOrThrow("clang_tokenize");
    public static final MethodHandle MTD__clang_tokenize = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_tokenize, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, CXSourceRange.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens)
    {
        try {MTD__clang_tokenize.invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_annotateTokens = GLOBAL_LOOKUP.findOrThrow("clang_annotateTokens");
    public static final MethodHandle MTD__clang_annotateTokens = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_annotateTokens, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static void clang_annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors)
    {
        try {MTD__clang_annotateTokens.invokeExact(TU, Tokens, NumTokens, Cursors);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeTokens = GLOBAL_LOOKUP.findOrThrow("clang_disposeTokens");
    public static final MethodHandle MTD__clang_disposeTokens = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeTokens, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens)
    {
        try {MTD__clang_disposeTokens.invokeExact(TU, Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorKindSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getCursorKindSpelling");
    public static final MethodHandle MTD__clang_getCursorKindSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorKindSpelling, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getCursorKindSpelling(SegmentAllocator $segmentAllocator, int Kind)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCursorKindSpelling.invokeExact($segmentAllocator, Kind)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getDefinitionSpellingAndExtent = GLOBAL_LOOKUP.findOrThrow("clang_getDefinitionSpellingAndExtent");
    public static final MethodHandle MTD__clang_getDefinitionSpellingAndExtent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getDefinitionSpellingAndExtent, FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn)
    {
        try {MTD__clang_getDefinitionSpellingAndExtent.invokeExact($arg1.ptr(), startBuf, endBuf, startLine, startColumn, endLine, endColumn);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_enableStackTraces = GLOBAL_LOOKUP.findOrThrow("clang_enableStackTraces");
    public static final MethodHandle MTD__clang_enableStackTraces = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_enableStackTraces, FunctionDescriptor.ofVoid());
    public static void clang_enableStackTraces()
    {
        try {MTD__clang_enableStackTraces.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_executeOnThread = GLOBAL_LOOKUP.findOrThrow("clang_executeOnThread");
    public static final MethodHandle MTD__clang_executeOnThread = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_executeOnThread, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size)
    {
        try {MTD__clang_executeOnThread.invokeExact(fn, user_data, stack_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionChunkKind = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkKind");
    public static final MethodHandle MTD__clang_getCompletionChunkKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkKind, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCompletionChunkKind(MemorySegment completion_string, int chunk_number)
    {
        try {return ((int)MTD__clang_getCompletionChunkKind.invokeExact(completion_string, chunk_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionChunkText = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkText");
    public static final MethodHandle MTD__clang_getCompletionChunkText = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkText, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_getCompletionChunkText(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCompletionChunkText.invokeExact($segmentAllocator, completion_string, chunk_number)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionChunkCompletionString = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionChunkCompletionString");
    public static final MethodHandle MTD__clang_getCompletionChunkCompletionString = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionChunkCompletionString, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number)
    {
        try {return ((MemorySegment)MTD__clang_getCompletionChunkCompletionString.invokeExact(completion_string, chunk_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getNumCompletionChunks = GLOBAL_LOOKUP.findOrThrow("clang_getNumCompletionChunks");
    public static final MethodHandle MTD__clang_getNumCompletionChunks = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getNumCompletionChunks, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumCompletionChunks(MemorySegment completion_string)
    {
        try {return ((int)MTD__clang_getNumCompletionChunks.invokeExact(completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionPriority = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionPriority");
    public static final MethodHandle MTD__clang_getCompletionPriority = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionPriority, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionPriority(MemorySegment completion_string)
    {
        try {return ((int)MTD__clang_getCompletionPriority.invokeExact(completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionAvailability = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionAvailability");
    public static final MethodHandle MTD__clang_getCompletionAvailability = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionAvailability, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionAvailability(MemorySegment completion_string)
    {
        try {return ((int)MTD__clang_getCompletionAvailability.invokeExact(completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionNumAnnotations = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionNumAnnotations");
    public static final MethodHandle MTD__clang_getCompletionNumAnnotations = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionNumAnnotations, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionNumAnnotations(MemorySegment completion_string)
    {
        try {return ((int)MTD__clang_getCompletionNumAnnotations.invokeExact(completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionAnnotation = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionAnnotation");
    public static final MethodHandle MTD__clang_getCompletionAnnotation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionAnnotation, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_getCompletionAnnotation(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCompletionAnnotation.invokeExact($segmentAllocator, completion_string, annotation_number)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionParent = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionParent");
    public static final MethodHandle MTD__clang_getCompletionParent = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionParent, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionParent(SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCompletionParent.invokeExact($segmentAllocator, completion_string, kind)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionBriefComment = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionBriefComment");
    public static final MethodHandle MTD__clang_getCompletionBriefComment = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionBriefComment, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionBriefComment(SegmentAllocator $segmentAllocator, MemorySegment completion_string)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCompletionBriefComment.invokeExact($segmentAllocator, completion_string)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorCompletionString = GLOBAL_LOOKUP.findOrThrow("clang_getCursorCompletionString");
    public static final MethodHandle MTD__clang_getCursorCompletionString = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorCompletionString, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getCursorCompletionString(CXCursor cursor)
    {
        try {return ((MemorySegment)MTD__clang_getCursorCompletionString.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionNumFixIts = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionNumFixIts");
    public static final MethodHandle MTD__clang_getCompletionNumFixIts = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionNumFixIts, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCompletionNumFixIts(MemorySegment results, int completion_index)
    {
        try {return ((int)MTD__clang_getCompletionNumFixIts.invokeExact(results, completion_index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCompletionFixIt = GLOBAL_LOOKUP.findOrThrow("clang_getCompletionFixIt");
    public static final MethodHandle MTD__clang_getCompletionFixIt = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCompletionFixIt, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionFixIt(SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getCompletionFixIt.invokeExact($segmentAllocator, results, completion_index, fixit_index, replacement_range)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_defaultCodeCompleteOptions = GLOBAL_LOOKUP.findOrThrow("clang_defaultCodeCompleteOptions");
    public static final MethodHandle MTD__clang_defaultCodeCompleteOptions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_defaultCodeCompleteOptions, FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultCodeCompleteOptions()
    {
        try {return ((int)MTD__clang_defaultCodeCompleteOptions.invokeExact());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteAt = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteAt");
    public static final MethodHandle MTD__clang_codeCompleteAt = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteAt, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return ((MemorySegment)MTD__clang_codeCompleteAt.invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_sortCodeCompletionResults = GLOBAL_LOOKUP.findOrThrow("clang_sortCodeCompletionResults");
    public static final MethodHandle MTD__clang_sortCodeCompletionResults = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_sortCodeCompletionResults, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_sortCodeCompletionResults(MemorySegment Results, int NumResults)
    {
        try {MTD__clang_sortCodeCompletionResults.invokeExact(Results, NumResults);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_disposeCodeCompleteResults = GLOBAL_LOOKUP.findOrThrow("clang_disposeCodeCompleteResults");
    public static final MethodHandle MTD__clang_disposeCodeCompleteResults = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_disposeCodeCompleteResults, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCodeCompleteResults(MemorySegment Results)
    {
        try {MTD__clang_disposeCodeCompleteResults.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetNumDiagnostics = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetNumDiagnostics");
    public static final MethodHandle MTD__clang_codeCompleteGetNumDiagnostics = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetNumDiagnostics, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetNumDiagnostics(MemorySegment Results)
    {
        try {return ((int)MTD__clang_codeCompleteGetNumDiagnostics.invokeExact(Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetDiagnostic = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetDiagnostic");
    public static final MethodHandle MTD__clang_codeCompleteGetDiagnostic = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetDiagnostic, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_codeCompleteGetDiagnostic(MemorySegment Results, int Index)
    {
        try {return ((MemorySegment)MTD__clang_codeCompleteGetDiagnostic.invokeExact(Results, Index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetContexts = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContexts");
    public static final MethodHandle MTD__clang_codeCompleteGetContexts = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContexts, FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_codeCompleteGetContexts(MemorySegment Results)
    {
        try {return ((long)MTD__clang_codeCompleteGetContexts.invokeExact(Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetContainerKind = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContainerKind");
    public static final MethodHandle MTD__clang_codeCompleteGetContainerKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContainerKind, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete)
    {
        try {return ((int)MTD__clang_codeCompleteGetContainerKind.invokeExact(Results, IsIncomplete));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetContainerUSR = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetContainerUSR");
    public static final MethodHandle MTD__clang_codeCompleteGetContainerUSR = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetContainerUSR, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_codeCompleteGetContainerUSR(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString(((MemorySegment)MTD__clang_codeCompleteGetContainerUSR.invokeExact($segmentAllocator, Results)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_codeCompleteGetObjCSelector = GLOBAL_LOOKUP.findOrThrow("clang_codeCompleteGetObjCSelector");
    public static final MethodHandle MTD__clang_codeCompleteGetObjCSelector = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_codeCompleteGetObjCSelector, FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_codeCompleteGetObjCSelector(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString(((MemorySegment)MTD__clang_codeCompleteGetObjCSelector.invokeExact($segmentAllocator, Results)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getClangVersion = GLOBAL_LOOKUP.findOrThrow("clang_getClangVersion");
    public static final MethodHandle MTD__clang_getClangVersion = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getClangVersion, FunctionDescriptor.of(CXString.LAYOUT));
    public static CXString clang_getClangVersion(SegmentAllocator $segmentAllocator)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getClangVersion.invokeExact($segmentAllocator)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_toggleCrashRecovery = GLOBAL_LOOKUP.findOrThrow("clang_toggleCrashRecovery");
    public static final MethodHandle MTD__clang_toggleCrashRecovery = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_toggleCrashRecovery, FunctionDescriptor.ofVoid(JAVA_INT));
    public static void clang_toggleCrashRecovery(int isEnabled)
    {
        try {MTD__clang_toggleCrashRecovery.invokeExact(isEnabled);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getInclusions = GLOBAL_LOOKUP.findOrThrow("clang_getInclusions");
    public static final MethodHandle MTD__clang_getInclusions = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getInclusions, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data)
    {
        try {MTD__clang_getInclusions.invokeExact(tu, visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Cursor_Evaluate = GLOBAL_LOOKUP.findOrThrow("clang_Cursor_Evaluate");
    public static final MethodHandle MTD__clang_Cursor_Evaluate = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Cursor_Evaluate, FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_Evaluate(CXCursor C)
    {
        try {return ((MemorySegment)MTD__clang_Cursor_Evaluate.invokeExact(C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getKind = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getKind");
    public static final MethodHandle MTD__clang_EvalResult_getKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getKind, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_getKind(MemorySegment E)
    {
        try {return ((int)MTD__clang_EvalResult_getKind.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getAsInt = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsInt");
    public static final MethodHandle MTD__clang_EvalResult_getAsInt = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsInt, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_getAsInt(MemorySegment E)
    {
        try {return ((int)MTD__clang_EvalResult_getAsInt.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getAsLongLong = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsLongLong");
    public static final MethodHandle MTD__clang_EvalResult_getAsLongLong = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsLongLong, FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsLongLong(MemorySegment E)
    {
        try {return ((long)MTD__clang_EvalResult_getAsLongLong.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_isUnsignedInt = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_isUnsignedInt");
    public static final MethodHandle MTD__clang_EvalResult_isUnsignedInt = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_isUnsignedInt, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_isUnsignedInt(MemorySegment E)
    {
        try {return ((int)MTD__clang_EvalResult_isUnsignedInt.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getAsUnsigned = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsUnsigned");
    public static final MethodHandle MTD__clang_EvalResult_getAsUnsigned = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsUnsigned, FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsUnsigned(MemorySegment E)
    {
        try {return ((long)MTD__clang_EvalResult_getAsUnsigned.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getAsDouble = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsDouble");
    public static final MethodHandle MTD__clang_EvalResult_getAsDouble = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsDouble, FunctionDescriptor.of(JAVA_DOUBLE, UNBOUNDED_POINTER));
    public static double clang_EvalResult_getAsDouble(MemorySegment E)
    {
        try {return ((double)MTD__clang_EvalResult_getAsDouble.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_getAsStr = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_getAsStr");
    public static final MethodHandle MTD__clang_EvalResult_getAsStr = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_getAsStr, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_EvalResult_getAsStr(MemorySegment E)
    {
        try {return ((MemorySegment)MTD__clang_EvalResult_getAsStr.invokeExact(E));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_EvalResult_dispose = GLOBAL_LOOKUP.findOrThrow("clang_EvalResult_dispose");
    public static final MethodHandle MTD__clang_EvalResult_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_EvalResult_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_EvalResult_dispose(MemorySegment E)
    {
        try {MTD__clang_EvalResult_dispose.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getRemappings = GLOBAL_LOOKUP.findOrThrow("clang_getRemappings");
    public static final MethodHandle MTD__clang_getRemappings = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRemappings, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getRemappings(MemorySegment path)
    {
        try {return ((MemorySegment)MTD__clang_getRemappings.invokeExact(path));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getRemappingsFromFileList = GLOBAL_LOOKUP.findOrThrow("clang_getRemappingsFromFileList");
    public static final MethodHandle MTD__clang_getRemappingsFromFileList = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getRemappingsFromFileList, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getRemappingsFromFileList(MemorySegment filePaths, int numFiles)
    {
        try {return ((MemorySegment)MTD__clang_getRemappingsFromFileList.invokeExact(filePaths, numFiles));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_remap_getNumFiles = GLOBAL_LOOKUP.findOrThrow("clang_remap_getNumFiles");
    public static final MethodHandle MTD__clang_remap_getNumFiles = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_getNumFiles, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_remap_getNumFiles(MemorySegment $arg1)
    {
        try {return ((int)MTD__clang_remap_getNumFiles.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_remap_getFilenames = GLOBAL_LOOKUP.findOrThrow("clang_remap_getFilenames");
    public static final MethodHandle MTD__clang_remap_getFilenames = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_getFilenames, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_remap_getFilenames(MemorySegment $arg1, int index, MemorySegment original, MemorySegment transformed)
    {
        try {MTD__clang_remap_getFilenames.invokeExact($arg1, index, original, transformed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_remap_dispose = GLOBAL_LOOKUP.findOrThrow("clang_remap_dispose");
    public static final MethodHandle MTD__clang_remap_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_remap_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_remap_dispose(MemorySegment $arg1)
    {
        try {MTD__clang_remap_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_findReferencesInFile = GLOBAL_LOOKUP.findOrThrow("clang_findReferencesInFile");
    public static final MethodHandle MTD__clang_findReferencesInFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findReferencesInFile, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
    public static int clang_findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return ((int)MTD__clang_findReferencesInFile.invokeExact(cursor.ptr(), file, visitor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_findIncludesInFile = GLOBAL_LOOKUP.findOrThrow("clang_findIncludesInFile");
    public static final MethodHandle MTD__clang_findIncludesInFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findIncludesInFile, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
    public static int clang_findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return ((int)MTD__clang_findIncludesInFile.invokeExact(TU, file, visitor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_findReferencesInFileWithBlock = GLOBAL_LOOKUP.findOrThrow("clang_findReferencesInFileWithBlock");
    public static final MethodHandle MTD__clang_findReferencesInFileWithBlock = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findReferencesInFileWithBlock, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return ((int)MTD__clang_findReferencesInFileWithBlock.invokeExact($arg1.ptr(), $arg2, $arg3));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_findIncludesInFileWithBlock = GLOBAL_LOOKUP.findOrThrow("clang_findIncludesInFileWithBlock");
    public static final MethodHandle MTD__clang_findIncludesInFileWithBlock = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_findIncludesInFileWithBlock, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return ((int)MTD__clang_findIncludesInFileWithBlock.invokeExact($arg1, $arg2, $arg3));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_isEntityObjCContainerKind = GLOBAL_LOOKUP.findOrThrow("clang_index_isEntityObjCContainerKind");
    public static final MethodHandle MTD__clang_index_isEntityObjCContainerKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_isEntityObjCContainerKind, FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_index_isEntityObjCContainerKind(int $arg1)
    {
        try {return ((int)MTD__clang_index_isEntityObjCContainerKind.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getObjCContainerDeclInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCContainerDeclInfo");
    public static final MethodHandle MTD__clang_index_getObjCContainerDeclInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCContainerDeclInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCContainerDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getObjCContainerDeclInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getObjCInterfaceDeclInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCInterfaceDeclInfo");
    public static final MethodHandle MTD__clang_index_getObjCInterfaceDeclInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCInterfaceDeclInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCInterfaceDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getObjCInterfaceDeclInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getObjCCategoryDeclInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCCategoryDeclInfo");
    public static final MethodHandle MTD__clang_index_getObjCCategoryDeclInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCCategoryDeclInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCCategoryDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getObjCCategoryDeclInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getObjCProtocolRefListInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCProtocolRefListInfo");
    public static final MethodHandle MTD__clang_index_getObjCProtocolRefListInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCProtocolRefListInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCProtocolRefListInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getObjCProtocolRefListInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getObjCPropertyDeclInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getObjCPropertyDeclInfo");
    public static final MethodHandle MTD__clang_index_getObjCPropertyDeclInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getObjCPropertyDeclInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCPropertyDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getObjCPropertyDeclInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getIBOutletCollectionAttrInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getIBOutletCollectionAttrInfo");
    public static final MethodHandle MTD__clang_index_getIBOutletCollectionAttrInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getIBOutletCollectionAttrInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getIBOutletCollectionAttrInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getIBOutletCollectionAttrInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getCXXClassDeclInfo = GLOBAL_LOOKUP.findOrThrow("clang_index_getCXXClassDeclInfo");
    public static final MethodHandle MTD__clang_index_getCXXClassDeclInfo = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getCXXClassDeclInfo, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getCXXClassDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getCXXClassDeclInfo.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getClientContainer = GLOBAL_LOOKUP.findOrThrow("clang_index_getClientContainer");
    public static final MethodHandle MTD__clang_index_getClientContainer = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getClientContainer, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getClientContainer(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getClientContainer.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_setClientContainer = GLOBAL_LOOKUP.findOrThrow("clang_index_setClientContainer");
    public static final MethodHandle MTD__clang_index_setClientContainer = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_setClientContainer, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_index_setClientContainer(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {MTD__clang_index_setClientContainer.invokeExact($arg1, $arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_getClientEntity = GLOBAL_LOOKUP.findOrThrow("clang_index_getClientEntity");
    public static final MethodHandle MTD__clang_index_getClientEntity = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_getClientEntity, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getClientEntity(MemorySegment $arg1)
    {
        try {return ((MemorySegment)MTD__clang_index_getClientEntity.invokeExact($arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_index_setClientEntity = GLOBAL_LOOKUP.findOrThrow("clang_index_setClientEntity");
    public static final MethodHandle MTD__clang_index_setClientEntity = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_index_setClientEntity, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_index_setClientEntity(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {MTD__clang_index_setClientEntity.invokeExact($arg1, $arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_IndexAction_create = GLOBAL_LOOKUP.findOrThrow("clang_IndexAction_create");
    public static final MethodHandle MTD__clang_IndexAction_create = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_IndexAction_create, FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_IndexAction_create(MemorySegment CIdx)
    {
        try {return ((MemorySegment)MTD__clang_IndexAction_create.invokeExact(CIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_IndexAction_dispose = GLOBAL_LOOKUP.findOrThrow("clang_IndexAction_dispose");
    public static final MethodHandle MTD__clang_IndexAction_dispose = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_IndexAction_dispose, FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_IndexAction_dispose(MemorySegment $arg1)
    {
        try {MTD__clang_IndexAction_dispose.invokeExact($arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_indexSourceFile = GLOBAL_LOOKUP.findOrThrow("clang_indexSourceFile");
    public static final MethodHandle MTD__clang_indexSourceFile = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexSourceFile, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_indexSourceFile(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return ((int)MTD__clang_indexSourceFile.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_indexSourceFileFullArgv = GLOBAL_LOOKUP.findOrThrow("clang_indexSourceFileFullArgv");
    public static final MethodHandle MTD__clang_indexSourceFileFullArgv = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexSourceFileFullArgv, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_indexSourceFileFullArgv(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return ((int)MTD__clang_indexSourceFileFullArgv.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_indexTranslationUnit = GLOBAL_LOOKUP.findOrThrow("clang_indexTranslationUnit");
    public static final MethodHandle MTD__clang_indexTranslationUnit = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexTranslationUnit, FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_indexTranslationUnit(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment $arg6)
    {
        try {return ((int)MTD__clang_indexTranslationUnit.invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, $arg6));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_indexLoc_getFileLocation = GLOBAL_LOOKUP.findOrThrow("clang_indexLoc_getFileLocation");
    public static final MethodHandle MTD__clang_indexLoc_getFileLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexLoc_getFileLocation, FunctionDescriptor.ofVoid(CXIdxLoc.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_indexLoc_getFileLocation(CXIdxLoc loc, MemorySegment indexFile, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD__clang_indexLoc_getFileLocation.invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_indexLoc_getCXSourceLocation = GLOBAL_LOOKUP.findOrThrow("clang_indexLoc_getCXSourceLocation");
    public static final MethodHandle MTD__clang_indexLoc_getCXSourceLocation = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_indexLoc_getCXSourceLocation, FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXIdxLoc.LAYOUT));
    public static CXSourceLocation clang_indexLoc_getCXSourceLocation(SegmentAllocator $segmentAllocator, CXIdxLoc loc)
    {
        try {return new CXSourceLocation(((MemorySegment)MTD__clang_indexLoc_getCXSourceLocation.invokeExact($segmentAllocator, loc.ptr())));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_Type_visitFields = GLOBAL_LOOKUP.findOrThrow("clang_Type_visitFields");
    public static final MethodHandle MTD__clang_Type_visitFields = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_Type_visitFields, FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return ((int)MTD__clang_Type_visitFields.invokeExact(T.ptr(), visitor, client_data));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getBinaryOperatorKindSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getBinaryOperatorKindSpelling");
    public static final MethodHandle MTD__clang_getBinaryOperatorKindSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getBinaryOperatorKindSpelling, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getBinaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getBinaryOperatorKindSpelling.invokeExact($segmentAllocator, kind)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorBinaryOperatorKind = GLOBAL_LOOKUP.findOrThrow("clang_getCursorBinaryOperatorKind");
    public static final MethodHandle MTD__clang_getCursorBinaryOperatorKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorBinaryOperatorKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorBinaryOperatorKind(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorBinaryOperatorKind.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getUnaryOperatorKindSpelling = GLOBAL_LOOKUP.findOrThrow("clang_getUnaryOperatorKindSpelling");
    public static final MethodHandle MTD__clang_getUnaryOperatorKindSpelling = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getUnaryOperatorKindSpelling, FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getUnaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString(((MemorySegment)MTD__clang_getUnaryOperatorKindSpelling.invokeExact($segmentAllocator, kind)));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final MemorySegment MTD_ADDRESS__clang_getCursorUnaryOperatorKind = GLOBAL_LOOKUP.findOrThrow("clang_getCursorUnaryOperatorKind");
    public static final MethodHandle MTD__clang_getCursorUnaryOperatorKind = SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__clang_getCursorUnaryOperatorKind, FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorUnaryOperatorKind(CXCursor cursor)
    {
        try {return ((int)MTD__clang_getCursorUnaryOperatorKind.invokeExact(cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }
}
