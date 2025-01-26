package fr.kenlek.jpgen.clang;

import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.util.Objects.requireNonNull;
import static fr.kenlek.jpgen.ForeignUtils.*;
import static java.lang.foreign.ValueLayout.*;

public final class Index_h
{private Index_h() {}

    private static @Nullable MethodHandle downcall(String name, FunctionDescriptor descriptor)
    {
        return SymbolLookup.loaderLookup().find(name)
                .map(address -> SYSTEM_LINKER.downcallHandle(address, descriptor))
                .orElse(null);
    }

    public static final @Nullable MethodHandle MTD__clang_getCString = downcall("clang_getCString", FunctionDescriptor.of(UNBOUNDED_POINTER, CXString.LAYOUT));
    public static MemorySegment clang_getCString(CXString string)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getCString).invokeExact(string.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeString = downcall("clang_disposeString", FunctionDescriptor.ofVoid(CXString.LAYOUT));
    public static void clang_disposeString(CXString string)
    {
        try {requireNonNull(MTD__clang_disposeString).invokeExact(string.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeStringSet = downcall("clang_disposeStringSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeStringSet(MemorySegment set)
    {
        try {requireNonNull(MTD__clang_disposeStringSet).invokeExact(set);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getBuildSessionTimestamp = downcall("clang_getBuildSessionTimestamp", FunctionDescriptor.of(JAVA_LONG));
    public static long clang_getBuildSessionTimestamp()
    {
        try {return ((long)requireNonNull(MTD__clang_getBuildSessionTimestamp).invokeExact());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_VirtualFileOverlay_create = downcall("clang_VirtualFileOverlay_create", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_VirtualFileOverlay_create(int options)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_VirtualFileOverlay_create).invokeExact(options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_VirtualFileOverlay_addFileMapping = downcall("clang_VirtualFileOverlay_addFileMapping", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath)
    {
        try {return ((int)requireNonNull(MTD__clang_VirtualFileOverlay_addFileMapping).invokeExact($arg1, virtualPath, realPath));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_VirtualFileOverlay_setCaseSensitivity = downcall("clang_VirtualFileOverlay_setCaseSensitivity", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, int caseSensitive)
    {
        try {return ((int)requireNonNull(MTD__clang_VirtualFileOverlay_setCaseSensitivity).invokeExact($arg1, caseSensitive));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_VirtualFileOverlay_writeToBuffer = downcall("clang_VirtualFileOverlay_writeToBuffer", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return ((int)requireNonNull(MTD__clang_VirtualFileOverlay_writeToBuffer).invokeExact($arg1, options, out_buffer_ptr, out_buffer_size));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_free = downcall("clang_free", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_free(MemorySegment buffer)
    {
        try {requireNonNull(MTD__clang_free).invokeExact(buffer);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_VirtualFileOverlay_dispose = downcall("clang_VirtualFileOverlay_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_VirtualFileOverlay_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(MTD__clang_VirtualFileOverlay_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_ModuleMapDescriptor_create = downcall("clang_ModuleMapDescriptor_create", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_ModuleMapDescriptor_create(int options)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_ModuleMapDescriptor_create).invokeExact(options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_ModuleMapDescriptor_setFrameworkModuleName = downcall("clang_ModuleMapDescriptor_setFrameworkModuleName", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name)
    {
        try {return ((int)requireNonNull(MTD__clang_ModuleMapDescriptor_setFrameworkModuleName).invokeExact($arg1, name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_ModuleMapDescriptor_setUmbrellaHeader = downcall("clang_ModuleMapDescriptor_setUmbrellaHeader", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name)
    {
        try {return ((int)requireNonNull(MTD__clang_ModuleMapDescriptor_setUmbrellaHeader).invokeExact($arg1, name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_ModuleMapDescriptor_writeToBuffer = downcall("clang_ModuleMapDescriptor_writeToBuffer", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return ((int)requireNonNull(MTD__clang_ModuleMapDescriptor_writeToBuffer).invokeExact($arg1, options, out_buffer_ptr, out_buffer_size));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_ModuleMapDescriptor_dispose = downcall("clang_ModuleMapDescriptor_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_ModuleMapDescriptor_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(MTD__clang_ModuleMapDescriptor_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFileName = downcall("clang_getFileName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getFileName(SegmentAllocator $segmentAllocator, MemorySegment SFile)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getFileName).invokeExact($segmentAllocator, SFile)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFileTime = downcall("clang_getFileTime", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_getFileTime(MemorySegment SFile)
    {
        try {return ((long)requireNonNull(MTD__clang_getFileTime).invokeExact(SFile));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFileUniqueID = downcall("clang_getFileUniqueID", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_getFileUniqueID(MemorySegment file, MemorySegment outID)
    {
        try {return ((int)requireNonNull(MTD__clang_getFileUniqueID).invokeExact(file, outID));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_File_isEqual = downcall("clang_File_isEqual", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_File_isEqual(MemorySegment file1, MemorySegment file2)
    {
        try {return ((int)requireNonNull(MTD__clang_File_isEqual).invokeExact(file1, file2));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_File_tryGetRealPathName = downcall("clang_File_tryGetRealPathName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_File_tryGetRealPathName(SegmentAllocator $segmentAllocator, MemorySegment file)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_File_tryGetRealPathName).invokeExact($segmentAllocator, file)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNullLocation = downcall("clang_getNullLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT));
    public static CXSourceLocation clang_getNullLocation(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getNullLocation).invokeExact($segmentAllocator)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_equalLocations = downcall("clang_equalLocations", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
    public static int clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)
    {
        try {return ((int)requireNonNull(MTD__clang_equalLocations).invokeExact(loc1.ptr(), loc2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Location_isInSystemHeader = downcall("clang_Location_isInSystemHeader", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
    public static int clang_Location_isInSystemHeader(CXSourceLocation location)
    {
        try {return ((int)requireNonNull(MTD__clang_Location_isInSystemHeader).invokeExact(location.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Location_isFromMainFile = downcall("clang_Location_isFromMainFile", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
    public static int clang_Location_isFromMainFile(CXSourceLocation location)
    {
        try {return ((int)requireNonNull(MTD__clang_Location_isFromMainFile).invokeExact(location.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNullRange = downcall("clang_getNullRange", FunctionDescriptor.of(CXSourceRange.LAYOUT));
    public static CXSourceRange clang_getNullRange(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getNullRange).invokeExact($segmentAllocator)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getRange = downcall("clang_getRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
    public static CXSourceRange clang_getRange(SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getRange).invokeExact($segmentAllocator, begin.ptr(), end.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_equalRanges = downcall("clang_equalRanges", FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT, CXSourceRange.LAYOUT));
    public static int clang_equalRanges(CXSourceRange range1, CXSourceRange range2)
    {
        try {return ((int)requireNonNull(MTD__clang_equalRanges).invokeExact(range1.ptr(), range2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Range_isNull = downcall("clang_Range_isNull", FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT));
    public static int clang_Range_isNull(CXSourceRange range)
    {
        try {return ((int)requireNonNull(MTD__clang_Range_isNull).invokeExact(range.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getExpansionLocation = downcall("clang_getExpansionLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(MTD__clang_getExpansionLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getPresumedLocation = downcall("clang_getPresumedLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column)
    {
        try {requireNonNull(MTD__clang_getPresumedLocation).invokeExact(location.ptr(), filename, line, column);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getInstantiationLocation = downcall("clang_getInstantiationLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(MTD__clang_getInstantiationLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getSpellingLocation = downcall("clang_getSpellingLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(MTD__clang_getSpellingLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFileLocation = downcall("clang_getFileLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(MTD__clang_getFileLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getRangeStart = downcall("clang_getRangeStart", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
    public static CXSourceLocation clang_getRangeStart(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getRangeStart).invokeExact($segmentAllocator, range.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getRangeEnd = downcall("clang_getRangeEnd", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
    public static CXSourceLocation clang_getRangeEnd(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getRangeEnd).invokeExact($segmentAllocator, range.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeSourceRangeList = downcall("clang_disposeSourceRangeList", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeSourceRangeList(MemorySegment ranges)
    {
        try {requireNonNull(MTD__clang_disposeSourceRangeList).invokeExact(ranges);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumDiagnosticsInSet = downcall("clang_getNumDiagnosticsInSet", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumDiagnosticsInSet(MemorySegment Diags)
    {
        try {return ((int)requireNonNull(MTD__clang_getNumDiagnosticsInSet).invokeExact(Diags));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticInSet = downcall("clang_getDiagnosticInSet", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getDiagnosticInSet(MemorySegment Diags, int Index)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getDiagnosticInSet).invokeExact(Diags, Index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_loadDiagnostics = downcall("clang_loadDiagnostics", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_loadDiagnostics).invokeExact(file, error, errorString));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeDiagnosticSet = downcall("clang_disposeDiagnosticSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeDiagnosticSet(MemorySegment Diags)
    {
        try {requireNonNull(MTD__clang_disposeDiagnosticSet).invokeExact(Diags);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getChildDiagnostics = downcall("clang_getChildDiagnostics", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getChildDiagnostics(MemorySegment D)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getChildDiagnostics).invokeExact(D));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeDiagnostic = downcall("clang_disposeDiagnostic", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeDiagnostic(MemorySegment Diagnostic)
    {
        try {requireNonNull(MTD__clang_disposeDiagnostic).invokeExact(Diagnostic);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_formatDiagnostic = downcall("clang_formatDiagnostic", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_formatDiagnostic(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_formatDiagnostic).invokeExact($segmentAllocator, Diagnostic, Options)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_defaultDiagnosticDisplayOptions = downcall("clang_defaultDiagnosticDisplayOptions", FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultDiagnosticDisplayOptions()
    {
        try {return ((int)requireNonNull(MTD__clang_defaultDiagnosticDisplayOptions).invokeExact());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticSeverity = downcall("clang_getDiagnosticSeverity", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticSeverity(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getDiagnosticSeverity).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticLocation = downcall("clang_getDiagnosticLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER));
    public static CXSourceLocation clang_getDiagnosticLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticLocation).invokeExact($segmentAllocator, $arg1)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticSpelling = downcall("clang_getDiagnosticSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticSpelling).invokeExact($segmentAllocator, $arg1)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticOption = downcall("clang_getDiagnosticOption", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticOption(SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticOption).invokeExact($segmentAllocator, Diag, Disable)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticCategory = downcall("clang_getDiagnosticCategory", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticCategory(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getDiagnosticCategory).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticCategoryName = downcall("clang_getDiagnosticCategoryName", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getDiagnosticCategoryName(SegmentAllocator $segmentAllocator, int Category)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticCategoryName).invokeExact($segmentAllocator, Category)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticCategoryText = downcall("clang_getDiagnosticCategoryText", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticCategoryText(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticCategoryText).invokeExact($segmentAllocator, $arg1)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticNumRanges = downcall("clang_getDiagnosticNumRanges", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumRanges(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getDiagnosticNumRanges).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticRange = downcall("clang_getDiagnosticRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXSourceRange clang_getDiagnosticRange(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticRange).invokeExact($segmentAllocator, Diagnostic, Range)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticNumFixIts = downcall("clang_getDiagnosticNumFixIts", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getDiagnosticNumFixIts(MemorySegment Diagnostic)
    {
        try {return ((int)requireNonNull(MTD__clang_getDiagnosticNumFixIts).invokeExact(Diagnostic));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticFixIt = downcall("clang_getDiagnosticFixIt", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static CXString clang_getDiagnosticFixIt(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDiagnosticFixIt).invokeExact($segmentAllocator, Diagnostic, FixIt, ReplacementRange)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_createIndex = downcall("clang_createIndex", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_createIndex).invokeExact(excludeDeclarationsFromPCH, displayDiagnostics));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeIndex = downcall("clang_disposeIndex", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeIndex(MemorySegment index)
    {
        try {requireNonNull(MTD__clang_disposeIndex).invokeExact(index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXIndex_setGlobalOptions = downcall("clang_CXIndex_setGlobalOptions", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_CXIndex_setGlobalOptions(MemorySegment $arg1, int options)
    {
        try {requireNonNull(MTD__clang_CXIndex_setGlobalOptions).invokeExact($arg1, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXIndex_getGlobalOptions = downcall("clang_CXIndex_getGlobalOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_CXIndex_getGlobalOptions(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_CXIndex_getGlobalOptions).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXIndex_setInvocationEmissionPathOption = downcall("clang_CXIndex_setInvocationEmissionPathOption", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path)
    {
        try {requireNonNull(MTD__clang_CXIndex_setInvocationEmissionPathOption).invokeExact($arg1, Path);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isFileMultipleIncludeGuarded = downcall("clang_isFileMultipleIncludeGuarded", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file)
    {
        try {return ((int)requireNonNull(MTD__clang_isFileMultipleIncludeGuarded).invokeExact(tu, file));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFile = downcall("clang_getFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getFile(MemorySegment tu, MemorySegment file_name)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getFile).invokeExact(tu, file_name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFileContents = downcall("clang_getFileContents", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getFileContents).invokeExact(tu, file, size));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getLocation = downcall("clang_getLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static CXSourceLocation clang_getLocation(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getLocation).invokeExact($segmentAllocator, tu, file, line, column)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getLocationForOffset = downcall("clang_getLocationForOffset", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static CXSourceLocation clang_getLocationForOffset(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getLocationForOffset).invokeExact($segmentAllocator, tu, file, offset)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getSkippedRanges = downcall("clang_getSkippedRanges", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getSkippedRanges(MemorySegment tu, MemorySegment file)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getSkippedRanges).invokeExact(tu, file));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getAllSkippedRanges = downcall("clang_getAllSkippedRanges", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getAllSkippedRanges(MemorySegment tu)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getAllSkippedRanges).invokeExact(tu));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumDiagnostics = downcall("clang_getNumDiagnostics", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumDiagnostics(MemorySegment Unit)
    {
        try {return ((int)requireNonNull(MTD__clang_getNumDiagnostics).invokeExact(Unit));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnostic = downcall("clang_getDiagnostic", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getDiagnostic(MemorySegment Unit, int Index)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getDiagnostic).invokeExact(Unit, Index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDiagnosticSetFromTU = downcall("clang_getDiagnosticSetFromTU", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getDiagnosticSetFromTU(MemorySegment Unit)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getDiagnosticSetFromTU).invokeExact(Unit));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTranslationUnitSpelling = downcall("clang_getTranslationUnitSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getTranslationUnitSpelling(SegmentAllocator $segmentAllocator, MemorySegment CTUnit)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTranslationUnitSpelling).invokeExact($segmentAllocator, CTUnit)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_createTranslationUnitFromSourceFile = downcall("clang_createTranslationUnitFromSourceFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static MemorySegment clang_createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_clang_command_line_args, MemorySegment clang_command_line_args, int num_unsaved_files, MemorySegment unsaved_files)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_createTranslationUnitFromSourceFile).invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_createTranslationUnit = downcall("clang_createTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_createTranslationUnit(MemorySegment CIdx, MemorySegment ast_filename)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_createTranslationUnit).invokeExact(CIdx, ast_filename));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_createTranslationUnit2 = downcall("clang_createTranslationUnit2", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_createTranslationUnit2(MemorySegment CIdx, MemorySegment ast_filename, MemorySegment out_TU)
    {
        try {return ((int)requireNonNull(MTD__clang_createTranslationUnit2).invokeExact(CIdx, ast_filename, out_TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_defaultEditingTranslationUnitOptions = downcall("clang_defaultEditingTranslationUnitOptions", FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultEditingTranslationUnitOptions()
    {
        try {return ((int)requireNonNull(MTD__clang_defaultEditingTranslationUnitOptions).invokeExact());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_parseTranslationUnit = downcall("clang_parseTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_parseTranslationUnit).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_parseTranslationUnit2 = downcall("clang_parseTranslationUnit2", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return ((int)requireNonNull(MTD__clang_parseTranslationUnit2).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_parseTranslationUnit2FullArgv = downcall("clang_parseTranslationUnit2FullArgv", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return ((int)requireNonNull(MTD__clang_parseTranslationUnit2FullArgv).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_defaultSaveOptions = downcall("clang_defaultSaveOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_defaultSaveOptions(MemorySegment TU)
    {
        try {return ((int)requireNonNull(MTD__clang_defaultSaveOptions).invokeExact(TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_saveTranslationUnit = downcall("clang_saveTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_saveTranslationUnit(MemorySegment TU, MemorySegment FileName, int options)
    {
        try {return ((int)requireNonNull(MTD__clang_saveTranslationUnit).invokeExact(TU, FileName, options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_suspendTranslationUnit = downcall("clang_suspendTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_suspendTranslationUnit(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_suspendTranslationUnit).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeTranslationUnit = downcall("clang_disposeTranslationUnit", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeTranslationUnit(MemorySegment $arg1)
    {
        try {requireNonNull(MTD__clang_disposeTranslationUnit).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_defaultReparseOptions = downcall("clang_defaultReparseOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_defaultReparseOptions(MemorySegment TU)
    {
        try {return ((int)requireNonNull(MTD__clang_defaultReparseOptions).invokeExact(TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_reparseTranslationUnit = downcall("clang_reparseTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_reparseTranslationUnit(MemorySegment TU, int num_unsaved_files, MemorySegment unsaved_files, int options)
    {
        try {return ((int)requireNonNull(MTD__clang_reparseTranslationUnit).invokeExact(TU, num_unsaved_files, unsaved_files, options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTUResourceUsageName = downcall("clang_getTUResourceUsageName", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getTUResourceUsageName(int kind)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getTUResourceUsageName).invokeExact(kind));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCXTUResourceUsage = downcall("clang_getCXTUResourceUsage", FunctionDescriptor.of(CXTUResourceUsage.LAYOUT, UNBOUNDED_POINTER));
    public static CXTUResourceUsage clang_getCXTUResourceUsage(SegmentAllocator $segmentAllocator, MemorySegment TU)
    {
        try {return new CXTUResourceUsage(((MemorySegment)requireNonNull(MTD__clang_getCXTUResourceUsage).invokeExact($segmentAllocator, TU)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeCXTUResourceUsage = downcall("clang_disposeCXTUResourceUsage", FunctionDescriptor.ofVoid(CXTUResourceUsage.LAYOUT));
    public static void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)
    {
        try {requireNonNull(MTD__clang_disposeCXTUResourceUsage).invokeExact(usage.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTranslationUnitTargetInfo = downcall("clang_getTranslationUnitTargetInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getTranslationUnitTargetInfo(MemorySegment CTUnit)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getTranslationUnitTargetInfo).invokeExact(CTUnit));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_TargetInfo_dispose = downcall("clang_TargetInfo_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_TargetInfo_dispose(MemorySegment Info)
    {
        try {requireNonNull(MTD__clang_TargetInfo_dispose).invokeExact(Info);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_TargetInfo_getTriple = downcall("clang_TargetInfo_getTriple", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_TargetInfo_getTriple(SegmentAllocator $segmentAllocator, MemorySegment Info)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_TargetInfo_getTriple).invokeExact($segmentAllocator, Info)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_TargetInfo_getPointerWidth = downcall("clang_TargetInfo_getPointerWidth", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_TargetInfo_getPointerWidth(MemorySegment Info)
    {
        try {return ((int)requireNonNull(MTD__clang_TargetInfo_getPointerWidth).invokeExact(Info));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNullCursor = downcall("clang_getNullCursor", FunctionDescriptor.of(CXCursor.LAYOUT));
    public static CXCursor clang_getNullCursor(SegmentAllocator $segmentAllocator)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getNullCursor).invokeExact($segmentAllocator)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTranslationUnitCursor = downcall("clang_getTranslationUnitCursor", FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static CXCursor clang_getTranslationUnitCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getTranslationUnitCursor).invokeExact($segmentAllocator, $arg1)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_equalCursors = downcall("clang_equalCursors", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static int clang_equalCursors(CXCursor $arg1, CXCursor $arg2)
    {
        try {return ((int)requireNonNull(MTD__clang_equalCursors).invokeExact($arg1.ptr(), $arg2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isNull = downcall("clang_Cursor_isNull", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isNull(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isNull).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_hashCursor = downcall("clang_hashCursor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_hashCursor(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_hashCursor).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorKind = downcall("clang_getCursorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorKind(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorKind).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isDeclaration = downcall("clang_isDeclaration", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isDeclaration(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isDeclaration).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isInvalidDeclaration = downcall("clang_isInvalidDeclaration", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isInvalidDeclaration(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isInvalidDeclaration).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isReference = downcall("clang_isReference", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isReference(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isReference).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isExpression = downcall("clang_isExpression", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isExpression(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isExpression).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isStatement = downcall("clang_isStatement", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isStatement(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isStatement).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isAttribute = downcall("clang_isAttribute", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isAttribute(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isAttribute).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_hasAttrs = downcall("clang_Cursor_hasAttrs", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasAttrs(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_hasAttrs).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isInvalid = downcall("clang_isInvalid", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isInvalid(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isInvalid).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isTranslationUnit = downcall("clang_isTranslationUnit", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isTranslationUnit(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isTranslationUnit).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isPreprocessing = downcall("clang_isPreprocessing", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isPreprocessing(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isPreprocessing).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isUnexposed = downcall("clang_isUnexposed", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_isUnexposed(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isUnexposed).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorLinkage = downcall("clang_getCursorLinkage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorLinkage(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorLinkage).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorVisibility = downcall("clang_getCursorVisibility", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorVisibility(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorVisibility).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorAvailability = downcall("clang_getCursorAvailability", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorAvailability(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorAvailability).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorPlatformAvailability = downcall("clang_getCursorPlatformAvailability", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorPlatformAvailability).invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeCXPlatformAvailability = downcall("clang_disposeCXPlatformAvailability", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCXPlatformAvailability(MemorySegment availability)
    {
        try {requireNonNull(MTD__clang_disposeCXPlatformAvailability).invokeExact(availability);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getVarDeclInitializer = downcall("clang_Cursor_getVarDeclInitializer", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_Cursor_getVarDeclInitializer(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_Cursor_getVarDeclInitializer).invokeExact($segmentAllocator, cursor.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_hasVarDeclGlobalStorage = downcall("clang_Cursor_hasVarDeclGlobalStorage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_hasVarDeclGlobalStorage).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_hasVarDeclExternalStorage = downcall("clang_Cursor_hasVarDeclExternalStorage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_hasVarDeclExternalStorage).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorLanguage = downcall("clang_getCursorLanguage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorLanguage(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorLanguage).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorTLSKind = downcall("clang_getCursorTLSKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorTLSKind(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorTLSKind).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getTranslationUnit = downcall("clang_Cursor_getTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getTranslationUnit(CXCursor $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Cursor_getTranslationUnit).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_createCXCursorSet = downcall("clang_createCXCursorSet", FunctionDescriptor.of(UNBOUNDED_POINTER));
    public static MemorySegment clang_createCXCursorSet()
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_createCXCursorSet).invokeExact());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeCXCursorSet = downcall("clang_disposeCXCursorSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCXCursorSet(MemorySegment cset)
    {
        try {requireNonNull(MTD__clang_disposeCXCursorSet).invokeExact(cset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXCursorSet_contains = downcall("clang_CXCursorSet_contains", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static int clang_CXCursorSet_contains(MemorySegment cset, CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_CXCursorSet_contains).invokeExact(cset, cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXCursorSet_insert = downcall("clang_CXCursorSet_insert", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static int clang_CXCursorSet_insert(MemorySegment cset, CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_CXCursorSet_insert).invokeExact(cset, cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorSemanticParent = downcall("clang_getCursorSemanticParent", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorSemanticParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCursorSemanticParent).invokeExact($segmentAllocator, cursor.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorLexicalParent = downcall("clang_getCursorLexicalParent", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorLexicalParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCursorLexicalParent).invokeExact($segmentAllocator, cursor.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getOverriddenCursors = downcall("clang_getOverriddenCursors", FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden)
    {
        try {requireNonNull(MTD__clang_getOverriddenCursors).invokeExact(cursor.ptr(), overridden, num_overridden);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeOverriddenCursors = downcall("clang_disposeOverriddenCursors", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeOverriddenCursors(MemorySegment overridden)
    {
        try {requireNonNull(MTD__clang_disposeOverriddenCursors).invokeExact(overridden);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getIncludedFile = downcall("clang_getIncludedFile", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getIncludedFile(CXCursor cursor)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getIncludedFile).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursor = downcall("clang_getCursor", FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
    public static CXCursor clang_getCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCursor).invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorLocation = downcall("clang_getCursorLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceLocation clang_getCursorLocation(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getCursorLocation).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorExtent = downcall("clang_getCursorExtent", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceRange clang_getCursorExtent(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getCursorExtent).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorType = downcall("clang_getCursorType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getCursorType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getCursorType).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypeSpelling = downcall("clang_getTypeSpelling", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_getTypeSpelling(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTypeSpelling).invokeExact($segmentAllocator, CT.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypedefDeclUnderlyingType = downcall("clang_getTypedefDeclUnderlyingType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getTypedefDeclUnderlyingType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getTypedefDeclUnderlyingType).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getEnumDeclIntegerType = downcall("clang_getEnumDeclIntegerType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getEnumDeclIntegerType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getEnumDeclIntegerType).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getEnumConstantDeclValue = downcall("clang_getEnumConstantDeclValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_getEnumConstantDeclValue(CXCursor C)
    {
        try {return ((long)requireNonNull(MTD__clang_getEnumConstantDeclValue).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getEnumConstantDeclUnsignedValue = downcall("clang_getEnumConstantDeclUnsignedValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C)
    {
        try {return ((long)requireNonNull(MTD__clang_getEnumConstantDeclUnsignedValue).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isBitField = downcall("clang_Cursor_isBitField", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isBitField(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isBitField).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFieldDeclBitWidth = downcall("clang_getFieldDeclBitWidth", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getFieldDeclBitWidth(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_getFieldDeclBitWidth).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getNumArguments = downcall("clang_Cursor_getNumArguments", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getNumArguments(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getNumArguments).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getArgument = downcall("clang_Cursor_getArgument", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXCursor clang_Cursor_getArgument(SegmentAllocator $segmentAllocator, CXCursor C, int i)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_Cursor_getArgument).invokeExact($segmentAllocator, C.ptr(), i)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getNumTemplateArguments = downcall("clang_Cursor_getNumTemplateArguments", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getNumTemplateArguments(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getNumTemplateArguments).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getTemplateArgumentKind = downcall("clang_Cursor_getTemplateArgumentKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
    public static int clang_Cursor_getTemplateArgumentKind(CXCursor C, int I)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getTemplateArgumentKind).invokeExact(C.ptr(), I));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getTemplateArgumentType = downcall("clang_Cursor_getTemplateArgumentType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXType clang_Cursor_getTemplateArgumentType(SegmentAllocator $segmentAllocator, CXCursor C, int I)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Cursor_getTemplateArgumentType).invokeExact($segmentAllocator, C.ptr(), I)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getTemplateArgumentValue = downcall("clang_Cursor_getTemplateArgumentValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentValue(CXCursor C, int I)
    {
        try {return ((long)requireNonNull(MTD__clang_Cursor_getTemplateArgumentValue).invokeExact(C.ptr(), I));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getTemplateArgumentUnsignedValue = downcall("clang_Cursor_getTemplateArgumentUnsignedValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I)
    {
        try {return ((long)requireNonNull(MTD__clang_Cursor_getTemplateArgumentUnsignedValue).invokeExact(C.ptr(), I));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_equalTypes = downcall("clang_equalTypes", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, CXType.LAYOUT));
    public static int clang_equalTypes(CXType A, CXType B)
    {
        try {return ((int)requireNonNull(MTD__clang_equalTypes).invokeExact(A.ptr(), B.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCanonicalType = downcall("clang_getCanonicalType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getCanonicalType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getCanonicalType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isConstQualifiedType = downcall("clang_isConstQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isConstQualifiedType(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_isConstQualifiedType).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isMacroFunctionLike = downcall("clang_Cursor_isMacroFunctionLike", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isMacroFunctionLike(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isMacroFunctionLike).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isMacroBuiltin = downcall("clang_Cursor_isMacroBuiltin", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isMacroBuiltin(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isMacroBuiltin).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isFunctionInlined = downcall("clang_Cursor_isFunctionInlined", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isFunctionInlined(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isFunctionInlined).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isVolatileQualifiedType = downcall("clang_isVolatileQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isVolatileQualifiedType(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_isVolatileQualifiedType).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isRestrictQualifiedType = downcall("clang_isRestrictQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isRestrictQualifiedType(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_isRestrictQualifiedType).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getAddressSpace = downcall("clang_getAddressSpace", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getAddressSpace(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_getAddressSpace).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypedefName = downcall("clang_getTypedefName", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_getTypedefName(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTypedefName).invokeExact($segmentAllocator, CT.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getPointeeType = downcall("clang_getPointeeType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getPointeeType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getPointeeType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getUnqualifiedType = downcall("clang_getUnqualifiedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getUnqualifiedType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getUnqualifiedType).invokeExact($segmentAllocator, CT.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNonReferenceType = downcall("clang_getNonReferenceType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getNonReferenceType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getNonReferenceType).invokeExact($segmentAllocator, CT.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypeDeclaration = downcall("clang_getTypeDeclaration", FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT));
    public static CXCursor clang_getTypeDeclaration(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getTypeDeclaration).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDeclObjCTypeEncoding = downcall("clang_getDeclObjCTypeEncoding", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getDeclObjCTypeEncoding(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getDeclObjCTypeEncoding).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getObjCEncoding = downcall("clang_Type_getObjCEncoding", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
    public static CXString clang_Type_getObjCEncoding(SegmentAllocator $segmentAllocator, CXType type)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Type_getObjCEncoding).invokeExact($segmentAllocator, type.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypeKindSpelling = downcall("clang_getTypeKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getTypeKindSpelling(SegmentAllocator $segmentAllocator, int K)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTypeKindSpelling).invokeExact($segmentAllocator, K)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getFunctionTypeCallingConv = downcall("clang_getFunctionTypeCallingConv", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getFunctionTypeCallingConv(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_getFunctionTypeCallingConv).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getResultType = downcall("clang_getResultType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getResultType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getResultType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getExceptionSpecificationType = downcall("clang_getExceptionSpecificationType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getExceptionSpecificationType(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_getExceptionSpecificationType).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumArgTypes = downcall("clang_getNumArgTypes", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_getNumArgTypes(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_getNumArgTypes).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getArgType = downcall("clang_getArgType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_getArgType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getArgType).invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getObjCObjectBaseType = downcall("clang_Type_getObjCObjectBaseType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getObjCObjectBaseType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getObjCObjectBaseType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getNumObjCProtocolRefs = downcall("clang_Type_getNumObjCProtocolRefs", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumObjCProtocolRefs(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_getNumObjCProtocolRefs).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getObjCProtocolDecl = downcall("clang_Type_getObjCProtocolDecl", FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXCursor clang_Type_getObjCProtocolDecl(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_Type_getObjCProtocolDecl).invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getNumObjCTypeArgs = downcall("clang_Type_getNumObjCTypeArgs", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumObjCTypeArgs(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_getNumObjCTypeArgs).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getObjCTypeArg = downcall("clang_Type_getObjCTypeArg", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_Type_getObjCTypeArg(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getObjCTypeArg).invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isFunctionTypeVariadic = downcall("clang_isFunctionTypeVariadic", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isFunctionTypeVariadic(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_isFunctionTypeVariadic).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorResultType = downcall("clang_getCursorResultType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getCursorResultType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getCursorResultType).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorExceptionSpecificationType = downcall("clang_getCursorExceptionSpecificationType", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorExceptionSpecificationType(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorExceptionSpecificationType).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isPODType = downcall("clang_isPODType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_isPODType(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_isPODType).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getElementType = downcall("clang_getElementType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getElementType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumElements = downcall("clang_getNumElements", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_getNumElements(CXType T)
    {
        try {return ((long)requireNonNull(MTD__clang_getNumElements).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getArrayElementType = downcall("clang_getArrayElementType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_getArrayElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getArrayElementType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getArraySize = downcall("clang_getArraySize", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_getArraySize(CXType T)
    {
        try {return ((long)requireNonNull(MTD__clang_getArraySize).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getNamedType = downcall("clang_Type_getNamedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getNamedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getNamedType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_isTransparentTagTypedef = downcall("clang_Type_isTransparentTagTypedef", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_isTransparentTagTypedef(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_isTransparentTagTypedef).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getNullability = downcall("clang_Type_getNullability", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNullability(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_getNullability).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getAlignOf = downcall("clang_Type_getAlignOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_Type_getAlignOf(CXType T)
    {
        try {return ((long)requireNonNull(MTD__clang_Type_getAlignOf).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getClassType = downcall("clang_Type_getClassType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getClassType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getClassType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getSizeOf = downcall("clang_Type_getSizeOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
    public static long clang_Type_getSizeOf(CXType T)
    {
        try {return ((long)requireNonNull(MTD__clang_Type_getSizeOf).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getOffsetOf = downcall("clang_Type_getOffsetOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT, UNBOUNDED_POINTER));
    public static long clang_Type_getOffsetOf(CXType T, MemorySegment S)
    {
        try {return ((long)requireNonNull(MTD__clang_Type_getOffsetOf).invokeExact(T.ptr(), S));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getModifiedType = downcall("clang_Type_getModifiedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getModifiedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getModifiedType).invokeExact($segmentAllocator, T.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getValueType = downcall("clang_Type_getValueType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
    public static CXType clang_Type_getValueType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getValueType).invokeExact($segmentAllocator, CT.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getOffsetOfField = downcall("clang_Cursor_getOffsetOfField", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
    public static long clang_Cursor_getOffsetOfField(CXCursor C)
    {
        try {return ((long)requireNonNull(MTD__clang_Cursor_getOffsetOfField).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isAnonymous = downcall("clang_Cursor_isAnonymous", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isAnonymous(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isAnonymous).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isAnonymousRecordDecl = downcall("clang_Cursor_isAnonymousRecordDecl", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isAnonymousRecordDecl(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isAnonymousRecordDecl).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isInlineNamespace = downcall("clang_Cursor_isInlineNamespace", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isInlineNamespace(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isInlineNamespace).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getNumTemplateArguments = downcall("clang_Type_getNumTemplateArguments", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getNumTemplateArguments(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_getNumTemplateArguments).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getTemplateArgumentAsType = downcall("clang_Type_getTemplateArgumentAsType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
    public static CXType clang_Type_getTemplateArgumentAsType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Type_getTemplateArgumentAsType).invokeExact($segmentAllocator, T.ptr(), i)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_getCXXRefQualifier = downcall("clang_Type_getCXXRefQualifier", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
    public static int clang_Type_getCXXRefQualifier(CXType T)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_getCXXRefQualifier).invokeExact(T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isVirtualBase = downcall("clang_isVirtualBase", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isVirtualBase(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isVirtualBase).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getOffsetOfBase = downcall("clang_getOffsetOfBase", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base)
    {
        try {return ((long)requireNonNull(MTD__clang_getOffsetOfBase).invokeExact(Parent.ptr(), Base.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCXXAccessSpecifier = downcall("clang_getCXXAccessSpecifier", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCXXAccessSpecifier(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getCXXAccessSpecifier).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getBinaryOpcode = downcall("clang_Cursor_getBinaryOpcode", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getBinaryOpcode(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getBinaryOpcode).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getBinaryOpcodeStr = downcall("clang_Cursor_getBinaryOpcodeStr", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_Cursor_getBinaryOpcodeStr(SegmentAllocator $segmentAllocator, int Op)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getBinaryOpcodeStr).invokeExact($segmentAllocator, Op)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getStorageClass = downcall("clang_Cursor_getStorageClass", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getStorageClass(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getStorageClass).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumOverloadedDecls = downcall("clang_getNumOverloadedDecls", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getNumOverloadedDecls(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getNumOverloadedDecls).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getOverloadedDecl = downcall("clang_getOverloadedDecl", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
    public static CXCursor clang_getOverloadedDecl(SegmentAllocator $segmentAllocator, CXCursor cursor, int index)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getOverloadedDecl).invokeExact($segmentAllocator, cursor.ptr(), index)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getIBOutletCollectionType = downcall("clang_getIBOutletCollectionType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_getIBOutletCollectionType(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_getIBOutletCollectionType).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_visitChildren = downcall("clang_visitChildren", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data)
    {
        try {return ((int)requireNonNull(MTD__clang_visitChildren).invokeExact(parent.ptr(), visitor, client_data));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_visitChildrenWithBlock = downcall("clang_visitChildrenWithBlock", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static int clang_visitChildrenWithBlock(CXCursor parent, MemorySegment block)
    {
        try {return ((int)requireNonNull(MTD__clang_visitChildrenWithBlock).invokeExact(parent.ptr(), block));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorUSR = downcall("clang_getCursorUSR", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorUSR(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCursorUSR).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCClass = downcall("clang_constructUSR_ObjCClass", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCClass(SegmentAllocator $segmentAllocator, MemorySegment class_name)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCClass).invokeExact($segmentAllocator, class_name)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCCategory = downcall("clang_constructUSR_ObjCCategory", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCCategory(SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCCategory).invokeExact($segmentAllocator, class_name, category_name)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCProtocol = downcall("clang_constructUSR_ObjCProtocol", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_constructUSR_ObjCProtocol(SegmentAllocator $segmentAllocator, MemorySegment protocol_name)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCProtocol).invokeExact($segmentAllocator, protocol_name)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCIvar = downcall("clang_constructUSR_ObjCIvar", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCIvar(SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCIvar).invokeExact($segmentAllocator, name, classUSR.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCMethod = downcall("clang_constructUSR_ObjCMethod", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCMethod(SegmentAllocator $segmentAllocator, MemorySegment name, int isInstanceMethod, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCMethod).invokeExact($segmentAllocator, name, isInstanceMethod, classUSR.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_constructUSR_ObjCProperty = downcall("clang_constructUSR_ObjCProperty", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
    public static CXString clang_constructUSR_ObjCProperty(SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_constructUSR_ObjCProperty).invokeExact($segmentAllocator, property, classUSR.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorSpelling = downcall("clang_getCursorSpelling", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorSpelling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCursorSpelling).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getSpellingNameRange = downcall("clang_Cursor_getSpellingNameRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
    public static CXSourceRange clang_Cursor_getSpellingNameRange(SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_Cursor_getSpellingNameRange).invokeExact($segmentAllocator, $arg1.ptr(), pieceIndex, options)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_PrintingPolicy_getProperty = downcall("clang_PrintingPolicy_getProperty", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_PrintingPolicy_getProperty(MemorySegment Policy, int Property)
    {
        try {return ((int)requireNonNull(MTD__clang_PrintingPolicy_getProperty).invokeExact(Policy, Property));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_PrintingPolicy_setProperty = downcall("clang_PrintingPolicy_setProperty", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static void clang_PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value)
    {
        try {requireNonNull(MTD__clang_PrintingPolicy_setProperty).invokeExact(Policy, Property, Value);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorPrintingPolicy = downcall("clang_getCursorPrintingPolicy", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getCursorPrintingPolicy(CXCursor $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getCursorPrintingPolicy).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_PrintingPolicy_dispose = downcall("clang_PrintingPolicy_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_PrintingPolicy_dispose(MemorySegment Policy)
    {
        try {requireNonNull(MTD__clang_PrintingPolicy_dispose).invokeExact(Policy);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorPrettyPrinted = downcall("clang_getCursorPrettyPrinted", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getCursorPrettyPrinted(SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCursorPrettyPrinted).invokeExact($segmentAllocator, Cursor.ptr(), Policy)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTypePrettyPrinted = downcall("clang_getTypePrettyPrinted", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getTypePrettyPrinted(SegmentAllocator $segmentAllocator, CXType T, MemorySegment cxPolicy)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTypePrettyPrinted).invokeExact($segmentAllocator, T.ptr(), cxPolicy)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorDisplayName = downcall("clang_getCursorDisplayName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_getCursorDisplayName(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCursorDisplayName).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorReferenced = downcall("clang_getCursorReferenced", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorReferenced(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCursorReferenced).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorDefinition = downcall("clang_getCursorDefinition", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCursorDefinition(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCursorDefinition).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_isCursorDefinition = downcall("clang_isCursorDefinition", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_isCursorDefinition(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_isCursorDefinition).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCanonicalCursor = downcall("clang_getCanonicalCursor", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getCanonicalCursor(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getCanonicalCursor).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCSelectorIndex = downcall("clang_Cursor_getObjCSelectorIndex", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getObjCSelectorIndex(CXCursor $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getObjCSelectorIndex).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isDynamicCall = downcall("clang_Cursor_isDynamicCall", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isDynamicCall(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isDynamicCall).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getReceiverType = downcall("clang_Cursor_getReceiverType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
    public static CXType clang_Cursor_getReceiverType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType(((MemorySegment)requireNonNull(MTD__clang_Cursor_getReceiverType).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCPropertyAttributes = downcall("clang_Cursor_getObjCPropertyAttributes", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
    public static int clang_Cursor_getObjCPropertyAttributes(CXCursor C, int reserved)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getObjCPropertyAttributes).invokeExact(C.ptr(), reserved));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCPropertyGetterName = downcall("clang_Cursor_getObjCPropertyGetterName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getObjCPropertyGetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getObjCPropertyGetterName).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCPropertySetterName = downcall("clang_Cursor_getObjCPropertySetterName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getObjCPropertySetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getObjCPropertySetterName).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCDeclQualifiers = downcall("clang_Cursor_getObjCDeclQualifiers", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_getObjCDeclQualifiers(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_getObjCDeclQualifiers).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isObjCOptional = downcall("clang_Cursor_isObjCOptional", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isObjCOptional(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isObjCOptional).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isVariadic = downcall("clang_Cursor_isVariadic", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_Cursor_isVariadic(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isVariadic).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_isExternalSymbol = downcall("clang_Cursor_isExternalSymbol", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated)
    {
        try {return ((int)requireNonNull(MTD__clang_Cursor_isExternalSymbol).invokeExact(C.ptr(), language, definedIn, isGenerated));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getCommentRange = downcall("clang_Cursor_getCommentRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
    public static CXSourceRange clang_Cursor_getCommentRange(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_Cursor_getCommentRange).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getRawCommentText = downcall("clang_Cursor_getRawCommentText", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getRawCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getRawCommentText).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getBriefCommentText = downcall("clang_Cursor_getBriefCommentText", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getBriefCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getBriefCommentText).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getMangling = downcall("clang_Cursor_getMangling", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
    public static CXString clang_Cursor_getMangling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Cursor_getMangling).invokeExact($segmentAllocator, $arg1.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getCXXManglings = downcall("clang_Cursor_getCXXManglings", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getCXXManglings(CXCursor $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Cursor_getCXXManglings).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getObjCManglings = downcall("clang_Cursor_getObjCManglings", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getObjCManglings(CXCursor $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Cursor_getObjCManglings).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_getModule = downcall("clang_Cursor_getModule", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_getModule(CXCursor C)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Cursor_getModule).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getModuleForFile = downcall("clang_getModuleForFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getModuleForFile(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getModuleForFile).invokeExact($arg1, $arg2));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getASTFile = downcall("clang_Module_getASTFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_Module_getASTFile(MemorySegment Module)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Module_getASTFile).invokeExact(Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getParent = downcall("clang_Module_getParent", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_Module_getParent(MemorySegment Module)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Module_getParent).invokeExact(Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getName = downcall("clang_Module_getName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_Module_getName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Module_getName).invokeExact($segmentAllocator, Module)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getFullName = downcall("clang_Module_getFullName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_Module_getFullName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_Module_getFullName).invokeExact($segmentAllocator, Module)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_isSystem = downcall("clang_Module_isSystem", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_Module_isSystem(MemorySegment Module)
    {
        try {return ((int)requireNonNull(MTD__clang_Module_isSystem).invokeExact(Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getNumTopLevelHeaders = downcall("clang_Module_getNumTopLevelHeaders", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module)
    {
        try {return ((int)requireNonNull(MTD__clang_Module_getNumTopLevelHeaders).invokeExact($arg1, Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Module_getTopLevelHeader = downcall("clang_Module_getTopLevelHeader", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Module_getTopLevelHeader).invokeExact($arg1, Module, Index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXConstructor_isConvertingConstructor = downcall("clang_CXXConstructor_isConvertingConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isConvertingConstructor(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXConstructor_isConvertingConstructor).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXConstructor_isCopyConstructor = downcall("clang_CXXConstructor_isCopyConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isCopyConstructor(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXConstructor_isCopyConstructor).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXConstructor_isDefaultConstructor = downcall("clang_CXXConstructor_isDefaultConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isDefaultConstructor(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXConstructor_isDefaultConstructor).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXConstructor_isMoveConstructor = downcall("clang_CXXConstructor_isMoveConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXConstructor_isMoveConstructor(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXConstructor_isMoveConstructor).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXField_isMutable = downcall("clang_CXXField_isMutable", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXField_isMutable(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXField_isMutable).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isDefaulted = downcall("clang_CXXMethod_isDefaulted", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isDefaulted(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isDefaulted).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isDeleted = downcall("clang_CXXMethod_isDeleted", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isDeleted(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isDeleted).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isPureVirtual = downcall("clang_CXXMethod_isPureVirtual", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isPureVirtual(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isPureVirtual).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isStatic = downcall("clang_CXXMethod_isStatic", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isStatic(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isStatic).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isVirtual = downcall("clang_CXXMethod_isVirtual", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isVirtual(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isVirtual).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isCopyAssignmentOperator = downcall("clang_CXXMethod_isCopyAssignmentOperator", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isCopyAssignmentOperator).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isMoveAssignmentOperator = downcall("clang_CXXMethod_isMoveAssignmentOperator", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isMoveAssignmentOperator).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isExplicit = downcall("clang_CXXMethod_isExplicit", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isExplicit(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isExplicit).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXRecord_isAbstract = downcall("clang_CXXRecord_isAbstract", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXRecord_isAbstract(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXRecord_isAbstract).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EnumDecl_isScoped = downcall("clang_EnumDecl_isScoped", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_EnumDecl_isScoped(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_EnumDecl_isScoped).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_CXXMethod_isConst = downcall("clang_CXXMethod_isConst", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_CXXMethod_isConst(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_CXXMethod_isConst).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTemplateCursorKind = downcall("clang_getTemplateCursorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getTemplateCursorKind(CXCursor C)
    {
        try {return ((int)requireNonNull(MTD__clang_getTemplateCursorKind).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getSpecializedCursorTemplate = downcall("clang_getSpecializedCursorTemplate", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
    public static CXCursor clang_getSpecializedCursorTemplate(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXCursor(((MemorySegment)requireNonNull(MTD__clang_getSpecializedCursorTemplate).invokeExact($segmentAllocator, C.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorReferenceNameRange = downcall("clang_getCursorReferenceNameRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
    public static CXSourceRange clang_getCursorReferenceNameRange(SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getCursorReferenceNameRange).invokeExact($segmentAllocator, C.ptr(), NameFlags, PieceIndex)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getToken = downcall("clang_getToken", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
    public static MemorySegment clang_getToken(MemorySegment TU, CXSourceLocation Location)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getToken).invokeExact(TU, Location.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTokenKind = downcall("clang_getTokenKind", FunctionDescriptor.of(JAVA_INT, CXToken.LAYOUT));
    public static int clang_getTokenKind(CXToken $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_getTokenKind).invokeExact($arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTokenSpelling = downcall("clang_getTokenSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXString clang_getTokenSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getTokenSpelling).invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTokenLocation = downcall("clang_getTokenLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXSourceLocation clang_getTokenLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_getTokenLocation).invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getTokenExtent = downcall("clang_getTokenExtent", FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
    public static CXSourceRange clang_getTokenExtent(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceRange(((MemorySegment)requireNonNull(MTD__clang_getTokenExtent).invokeExact($segmentAllocator, $arg1, $arg2.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_tokenize = downcall("clang_tokenize", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, CXSourceRange.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens)
    {
        try {requireNonNull(MTD__clang_tokenize).invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_annotateTokens = downcall("clang_annotateTokens", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
    public static void clang_annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors)
    {
        try {requireNonNull(MTD__clang_annotateTokens).invokeExact(TU, Tokens, NumTokens, Cursors);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeTokens = downcall("clang_disposeTokens", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens)
    {
        try {requireNonNull(MTD__clang_disposeTokens).invokeExact(TU, Tokens, NumTokens);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorKindSpelling = downcall("clang_getCursorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getCursorKindSpelling(SegmentAllocator $segmentAllocator, int Kind)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCursorKindSpelling).invokeExact($segmentAllocator, Kind)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getDefinitionSpellingAndExtent = downcall("clang_getDefinitionSpellingAndExtent", FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn)
    {
        try {requireNonNull(MTD__clang_getDefinitionSpellingAndExtent).invokeExact($arg1.ptr(), startBuf, endBuf, startLine, startColumn, endLine, endColumn);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_enableStackTraces = downcall("clang_enableStackTraces", FunctionDescriptor.ofVoid());
    public static void clang_enableStackTraces()
    {
        try {requireNonNull(MTD__clang_enableStackTraces).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_executeOnThread = downcall("clang_executeOnThread", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size)
    {
        try {requireNonNull(MTD__clang_executeOnThread).invokeExact(fn, user_data, stack_size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionChunkKind = downcall("clang_getCompletionChunkKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCompletionChunkKind(MemorySegment completion_string, int chunk_number)
    {
        try {return ((int)requireNonNull(MTD__clang_getCompletionChunkKind).invokeExact(completion_string, chunk_number));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionChunkText = downcall("clang_getCompletionChunkText", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_getCompletionChunkText(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCompletionChunkText).invokeExact($segmentAllocator, completion_string, chunk_number)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionChunkCompletionString = downcall("clang_getCompletionChunkCompletionString", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getCompletionChunkCompletionString).invokeExact(completion_string, chunk_number));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getNumCompletionChunks = downcall("clang_getNumCompletionChunks", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getNumCompletionChunks(MemorySegment completion_string)
    {
        try {return ((int)requireNonNull(MTD__clang_getNumCompletionChunks).invokeExact(completion_string));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionPriority = downcall("clang_getCompletionPriority", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionPriority(MemorySegment completion_string)
    {
        try {return ((int)requireNonNull(MTD__clang_getCompletionPriority).invokeExact(completion_string));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionAvailability = downcall("clang_getCompletionAvailability", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionAvailability(MemorySegment completion_string)
    {
        try {return ((int)requireNonNull(MTD__clang_getCompletionAvailability).invokeExact(completion_string));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionNumAnnotations = downcall("clang_getCompletionNumAnnotations", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_getCompletionNumAnnotations(MemorySegment completion_string)
    {
        try {return ((int)requireNonNull(MTD__clang_getCompletionNumAnnotations).invokeExact(completion_string));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionAnnotation = downcall("clang_getCompletionAnnotation", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
    public static CXString clang_getCompletionAnnotation(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCompletionAnnotation).invokeExact($segmentAllocator, completion_string, annotation_number)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionParent = downcall("clang_getCompletionParent", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionParent(SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCompletionParent).invokeExact($segmentAllocator, completion_string, kind)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionBriefComment = downcall("clang_getCompletionBriefComment", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionBriefComment(SegmentAllocator $segmentAllocator, MemorySegment completion_string)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCompletionBriefComment).invokeExact($segmentAllocator, completion_string)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorCompletionString = downcall("clang_getCursorCompletionString", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_getCursorCompletionString(CXCursor cursor)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getCursorCompletionString).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionNumFixIts = downcall("clang_getCompletionNumFixIts", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_getCompletionNumFixIts(MemorySegment results, int completion_index)
    {
        try {return ((int)requireNonNull(MTD__clang_getCompletionNumFixIts).invokeExact(results, completion_index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCompletionFixIt = downcall("clang_getCompletionFixIt", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static CXString clang_getCompletionFixIt(SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getCompletionFixIt).invokeExact($segmentAllocator, results, completion_index, fixit_index, replacement_range)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_defaultCodeCompleteOptions = downcall("clang_defaultCodeCompleteOptions", FunctionDescriptor.of(JAVA_INT));
    public static int clang_defaultCodeCompleteOptions()
    {
        try {return ((int)requireNonNull(MTD__clang_defaultCodeCompleteOptions).invokeExact());}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteAt = downcall("clang_codeCompleteAt", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
    public static MemorySegment clang_codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_codeCompleteAt).invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_sortCodeCompletionResults = downcall("clang_sortCodeCompletionResults", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
    public static void clang_sortCodeCompletionResults(MemorySegment Results, int NumResults)
    {
        try {requireNonNull(MTD__clang_sortCodeCompletionResults).invokeExact(Results, NumResults);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_disposeCodeCompleteResults = downcall("clang_disposeCodeCompleteResults", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_disposeCodeCompleteResults(MemorySegment Results)
    {
        try {requireNonNull(MTD__clang_disposeCodeCompleteResults).invokeExact(Results);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetNumDiagnostics = downcall("clang_codeCompleteGetNumDiagnostics", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetNumDiagnostics(MemorySegment Results)
    {
        try {return ((int)requireNonNull(MTD__clang_codeCompleteGetNumDiagnostics).invokeExact(Results));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetDiagnostic = downcall("clang_codeCompleteGetDiagnostic", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_codeCompleteGetDiagnostic(MemorySegment Results, int Index)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_codeCompleteGetDiagnostic).invokeExact(Results, Index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetContexts = downcall("clang_codeCompleteGetContexts", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_codeCompleteGetContexts(MemorySegment Results)
    {
        try {return ((long)requireNonNull(MTD__clang_codeCompleteGetContexts).invokeExact(Results));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetContainerKind = downcall("clang_codeCompleteGetContainerKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete)
    {
        try {return ((int)requireNonNull(MTD__clang_codeCompleteGetContainerKind).invokeExact(Results, IsIncomplete));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetContainerUSR = downcall("clang_codeCompleteGetContainerUSR", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_codeCompleteGetContainerUSR(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_codeCompleteGetContainerUSR).invokeExact($segmentAllocator, Results)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_codeCompleteGetObjCSelector = downcall("clang_codeCompleteGetObjCSelector", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
    public static CXString clang_codeCompleteGetObjCSelector(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_codeCompleteGetObjCSelector).invokeExact($segmentAllocator, Results)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getClangVersion = downcall("clang_getClangVersion", FunctionDescriptor.of(CXString.LAYOUT));
    public static CXString clang_getClangVersion(SegmentAllocator $segmentAllocator)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getClangVersion).invokeExact($segmentAllocator)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_toggleCrashRecovery = downcall("clang_toggleCrashRecovery", FunctionDescriptor.ofVoid(JAVA_INT));
    public static void clang_toggleCrashRecovery(int isEnabled)
    {
        try {requireNonNull(MTD__clang_toggleCrashRecovery).invokeExact(isEnabled);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getInclusions = downcall("clang_getInclusions", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data)
    {
        try {requireNonNull(MTD__clang_getInclusions).invokeExact(tu, visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Cursor_Evaluate = downcall("clang_Cursor_Evaluate", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
    public static MemorySegment clang_Cursor_Evaluate(CXCursor C)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_Cursor_Evaluate).invokeExact(C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getKind = downcall("clang_EvalResult_getKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_getKind(MemorySegment E)
    {
        try {return ((int)requireNonNull(MTD__clang_EvalResult_getKind).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getAsInt = downcall("clang_EvalResult_getAsInt", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_getAsInt(MemorySegment E)
    {
        try {return ((int)requireNonNull(MTD__clang_EvalResult_getAsInt).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getAsLongLong = downcall("clang_EvalResult_getAsLongLong", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsLongLong(MemorySegment E)
    {
        try {return ((long)requireNonNull(MTD__clang_EvalResult_getAsLongLong).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_isUnsignedInt = downcall("clang_EvalResult_isUnsignedInt", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_EvalResult_isUnsignedInt(MemorySegment E)
    {
        try {return ((int)requireNonNull(MTD__clang_EvalResult_isUnsignedInt).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getAsUnsigned = downcall("clang_EvalResult_getAsUnsigned", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
    public static long clang_EvalResult_getAsUnsigned(MemorySegment E)
    {
        try {return ((long)requireNonNull(MTD__clang_EvalResult_getAsUnsigned).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getAsDouble = downcall("clang_EvalResult_getAsDouble", FunctionDescriptor.of(JAVA_DOUBLE, UNBOUNDED_POINTER));
    public static double clang_EvalResult_getAsDouble(MemorySegment E)
    {
        try {return ((double)requireNonNull(MTD__clang_EvalResult_getAsDouble).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_getAsStr = downcall("clang_EvalResult_getAsStr", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_EvalResult_getAsStr(MemorySegment E)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_EvalResult_getAsStr).invokeExact(E));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_EvalResult_dispose = downcall("clang_EvalResult_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_EvalResult_dispose(MemorySegment E)
    {
        try {requireNonNull(MTD__clang_EvalResult_dispose).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getRemappings = downcall("clang_getRemappings", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_getRemappings(MemorySegment path)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getRemappings).invokeExact(path));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getRemappingsFromFileList = downcall("clang_getRemappingsFromFileList", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
    public static MemorySegment clang_getRemappingsFromFileList(MemorySegment filePaths, int numFiles)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_getRemappingsFromFileList).invokeExact(filePaths, numFiles));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_remap_getNumFiles = downcall("clang_remap_getNumFiles", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_remap_getNumFiles(MemorySegment $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_remap_getNumFiles).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_remap_getFilenames = downcall("clang_remap_getFilenames", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_remap_getFilenames(MemorySegment $arg1, int index, MemorySegment original, MemorySegment transformed)
    {
        try {requireNonNull(MTD__clang_remap_getFilenames).invokeExact($arg1, index, original, transformed);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_remap_dispose = downcall("clang_remap_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_remap_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(MTD__clang_remap_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_findReferencesInFile = downcall("clang_findReferencesInFile", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
    public static int clang_findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return ((int)requireNonNull(MTD__clang_findReferencesInFile).invokeExact(cursor.ptr(), file, visitor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_findIncludesInFile = downcall("clang_findIncludesInFile", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
    public static int clang_findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return ((int)requireNonNull(MTD__clang_findIncludesInFile).invokeExact(TU, file, visitor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_findReferencesInFileWithBlock = downcall("clang_findReferencesInFileWithBlock", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return ((int)requireNonNull(MTD__clang_findReferencesInFileWithBlock).invokeExact($arg1.ptr(), $arg2, $arg3));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_findIncludesInFileWithBlock = downcall("clang_findIncludesInFileWithBlock", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return ((int)requireNonNull(MTD__clang_findIncludesInFileWithBlock).invokeExact($arg1, $arg2, $arg3));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_isEntityObjCContainerKind = downcall("clang_index_isEntityObjCContainerKind", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
    public static int clang_index_isEntityObjCContainerKind(int $arg1)
    {
        try {return ((int)requireNonNull(MTD__clang_index_isEntityObjCContainerKind).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getObjCContainerDeclInfo = downcall("clang_index_getObjCContainerDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCContainerDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getObjCContainerDeclInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getObjCInterfaceDeclInfo = downcall("clang_index_getObjCInterfaceDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCInterfaceDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getObjCInterfaceDeclInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getObjCCategoryDeclInfo = downcall("clang_index_getObjCCategoryDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCCategoryDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getObjCCategoryDeclInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getObjCProtocolRefListInfo = downcall("clang_index_getObjCProtocolRefListInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCProtocolRefListInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getObjCProtocolRefListInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getObjCPropertyDeclInfo = downcall("clang_index_getObjCPropertyDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getObjCPropertyDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getObjCPropertyDeclInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getIBOutletCollectionAttrInfo = downcall("clang_index_getIBOutletCollectionAttrInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getIBOutletCollectionAttrInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getIBOutletCollectionAttrInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getCXXClassDeclInfo = downcall("clang_index_getCXXClassDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getCXXClassDeclInfo(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getCXXClassDeclInfo).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getClientContainer = downcall("clang_index_getClientContainer", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getClientContainer(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getClientContainer).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_setClientContainer = downcall("clang_index_setClientContainer", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_index_setClientContainer(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {requireNonNull(MTD__clang_index_setClientContainer).invokeExact($arg1, $arg2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_getClientEntity = downcall("clang_index_getClientEntity", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_index_getClientEntity(MemorySegment $arg1)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_index_getClientEntity).invokeExact($arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_index_setClientEntity = downcall("clang_index_setClientEntity", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_index_setClientEntity(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {requireNonNull(MTD__clang_index_setClientEntity).invokeExact($arg1, $arg2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_IndexAction_create = downcall("clang_IndexAction_create", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static MemorySegment clang_IndexAction_create(MemorySegment CIdx)
    {
        try {return ((MemorySegment)requireNonNull(MTD__clang_IndexAction_create).invokeExact(CIdx));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_IndexAction_dispose = downcall("clang_IndexAction_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
    public static void clang_IndexAction_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(MTD__clang_IndexAction_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_indexSourceFile = downcall("clang_indexSourceFile", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_indexSourceFile(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return ((int)requireNonNull(MTD__clang_indexSourceFile).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_indexSourceFileFullArgv = downcall("clang_indexSourceFileFullArgv", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
    public static int clang_indexSourceFileFullArgv(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return ((int)requireNonNull(MTD__clang_indexSourceFileFullArgv).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_indexTranslationUnit = downcall("clang_indexTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
    public static int clang_indexTranslationUnit(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment $arg6)
    {
        try {return ((int)requireNonNull(MTD__clang_indexTranslationUnit).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, $arg6));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_indexLoc_getFileLocation = downcall("clang_indexLoc_getFileLocation", FunctionDescriptor.ofVoid(CXIdxLoc.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static void clang_indexLoc_getFileLocation(CXIdxLoc loc, MemorySegment indexFile, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(MTD__clang_indexLoc_getFileLocation).invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_indexLoc_getCXSourceLocation = downcall("clang_indexLoc_getCXSourceLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXIdxLoc.LAYOUT));
    public static CXSourceLocation clang_indexLoc_getCXSourceLocation(SegmentAllocator $segmentAllocator, CXIdxLoc loc)
    {
        try {return new CXSourceLocation(((MemorySegment)requireNonNull(MTD__clang_indexLoc_getCXSourceLocation).invokeExact($segmentAllocator, loc.ptr())));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_Type_visitFields = downcall("clang_Type_visitFields", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return ((int)requireNonNull(MTD__clang_Type_visitFields).invokeExact(T.ptr(), visitor, client_data));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_visitCXXBaseClasses = downcall("clang_CXXBaseClasses", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
    public static int clang_visitCXXBaseClasses(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return ((int)requireNonNull(MTD__clang_visitCXXBaseClasses).invokeExact(T.ptr(), visitor, client_data));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getBinaryOperatorKindSpelling = downcall("clang_getBinaryOperatorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getBinaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getBinaryOperatorKindSpelling).invokeExact($segmentAllocator, kind)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorBinaryOperatorKind = downcall("clang_getCursorBinaryOperatorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorBinaryOperatorKind(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorBinaryOperatorKind).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getUnaryOperatorKindSpelling = downcall("clang_getUnaryOperatorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
    public static CXString clang_getUnaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString(((MemorySegment)requireNonNull(MTD__clang_getUnaryOperatorKindSpelling).invokeExact($segmentAllocator, kind)));}
        catch (Throwable _) {throw new AssertionError();}
    }

    public static final @Nullable MethodHandle MTD__clang_getCursorUnaryOperatorKind = downcall("clang_getCursorUnaryOperatorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    public static int clang_getCursorUnaryOperatorKind(CXCursor cursor)
    {
        try {return ((int)requireNonNull(MTD__clang_getCursorUnaryOperatorKind).invokeExact(cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }
}
