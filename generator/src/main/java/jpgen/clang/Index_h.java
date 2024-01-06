package jpgen.clang;

import jpgen.NativeTypes;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Index_h
{private Index_h() {}

    private static final Linker gSystemLinker;
    private static final SymbolLookup gLibLookup;

    private static final MethodHandle USTUB$CXCursorVisitor;
    private static final MethodHandle USTUB$CXFieldVisitor;

    private static final MethodHandle MTD$clang_getClangVersion;
    private static final MethodHandle MTD$clang_createIndex;
    private static final MethodHandle MTD$clang_disposeIndex;
    private static final MethodHandle MTD$clang_parseTranslationUnit;
    private static final MethodHandle MTD$clang_parseTranslationUnit2;
    private static final MethodHandle MTD$clang_disposeTranslationUnit;
    private static final MethodHandle MTD$clang_getCString;
    private static final MethodHandle MTD$clang_disposeString;
    private static final MethodHandle MTD$clang_getNullCursor;
    private static final MethodHandle MTD$clang_getTranslationUnitCursor;
    private static final MethodHandle MTD$clang_visitChildren;
    private static final MethodHandle MTD$clang_getCursorSpelling;
    private static final MethodHandle MTD$clang_getCursorKind;
    private static final MethodHandle MTD$clang_isDeclaration;
    private static final MethodHandle MTD$clang_isExpression;
    private static final MethodHandle MTD$clang_isAttribute;
    private static final MethodHandle MTD$clang_isPreprocessing;
    private static final MethodHandle MTD$clang_getCursorExtent;
    private static final MethodHandle MTD$clang_getRange;
    private static final MethodHandle MTD$clang_getRangeStart;
    private static final MethodHandle MTD$clang_getRangeEnd;
    private static final MethodHandle MTD$clang_getLocationForOffset;
    private static final MethodHandle MTD$clang_Location_isFromMainFile;
    private static final MethodHandle MTD$clang_getSpellingLocation;
    private static final MethodHandle MTD$clang_getTokenSpelling;
    private static final MethodHandle MTD$clang_tokenize;
    private static final MethodHandle MTD$clang_disposeTokens;
    private static final MethodHandle MTD$clang_getCursorLexicalParent;
    private static final MethodHandle MTD$clang_getNullRange;
    private static final MethodHandle MTD$clang_Range_isNull;
    private static final MethodHandle MTD$clang_getTokenKind;
    private static final MethodHandle MTD$clang_getCursorType;
    private static final MethodHandle MTD$clang_getTypeSpelling;
    private static final MethodHandle MTD$clang_getCursorSemanticParent;
    private static final MethodHandle MTD$clang_getTypeDeclaration;
    private static final MethodHandle MTD$clang_equalCursors;
    private static final MethodHandle MTD$clang_getFile;
    private static final MethodHandle MTD$clang_getFileName;
    private static final MethodHandle MTD$clang_getEnumDeclIntegerType;
    private static final MethodHandle MTD$clang_Location_isInSystemHeader;
    private static final MethodHandle MTD$clang_getCursorLocation;
    private static final MethodHandle MTD$clang_getCursor;
    private static final MethodHandle MTD$clang_getEnumConstantDeclValue;
    private static final MethodHandle MTD$clang_Cursor_getNumArguments;
    private static final MethodHandle MTD$clang_Cursor_getArgument;
    private static final MethodHandle MTD$clang_CXXField_isMutable;
    private static final MethodHandle MTD$clang_isConstQualifiedType;
    private static final MethodHandle MTD$clang_Cursor_isBitField;
    private static final MethodHandle MTD$clang_getFieldDeclBitWidth;
    private static final MethodHandle MTD$clang_equalTypes;
    private static final MethodHandle MTD$clang_isCursorDefinition;
    private static final MethodHandle MTD$clang_Cursor_isVariadic;
    private static final MethodHandle MTD$clang_getCursorResultType;
    private static final MethodHandle MTD$clang_Cursor_Evaluate;
    private static final MethodHandle MTD$clang_EvalResult_getKind;
    private static final MethodHandle MTD$clang_CXXMethod_isPureVirtual;
    private static final MethodHandle MTD$clang_CXXMethod_isVirtual;
    private static final MethodHandle MTD$clang_CXXMethod_isConst;
    private static final MethodHandle MTD$clang_getPointeeType;
    private static final MethodHandle MTD$clang_Type_getSizeOf;
    private static final MethodHandle MTD$clang_getArraySize;
    private static final MethodHandle MTD$clang_getElementType;
    private static final MethodHandle MTD$clang_getNumElements;
    private static final MethodHandle MTD$clang_getArrayElementType;
    private static final MethodHandle MTD$clang_Type_getModifiedType;
    private static final MethodHandle MTD$clang_getCursorUSR;
    private static final MethodHandle MTD$clang_getTypedefDeclUnderlyingType;
    private static final MethodHandle MTD$clang_getDiagnosticSetFromTU;
    private static final MethodHandle MTD$clang_disposeDiagnosticSet;
    private static final MethodHandle MTD$clang_getNumDiagnosticsInSet;
    private static final MethodHandle MTD$clang_getDiagnosticInSet;
    private static final MethodHandle MTD$clang_getDiagnosticSeverity;
    private static final MethodHandle MTD$clang_formatDiagnostic;
    private static final MethodHandle MTD$clang_getChildDiagnostics;
    private static final MethodHandle MTD$clang_disposeDiagnostic;
    private static final MethodHandle MTD$clang_CXXMethod_isStatic;
    private static final MethodHandle MTD$clang_getCursorVisibility;
    private static final MethodHandle MTD$clang_getCXXAccessSpecifier;
    private static final MethodHandle MTD$clang_Cursor_isAnonymousRecordDecl;
    private static final MethodHandle MTD$clang_Cursor_isAnonymous;
    private static final MethodHandle MTD$clang_Cursor_getOffsetOfField;
    private static final MethodHandle MTD$clang_Cursor_getModule;
    private static final MethodHandle MTD$clang_Module_getFullName;
    private static final MethodHandle MTD$clang_Module_isSystem;
    private static final MethodHandle MTD$clang_getResultType;
    private static final MethodHandle MTD$clang_isFunctionTypeVariadic;
    private static final MethodHandle MTD$clang_getNumArgTypes;
    private static final MethodHandle MTD$clang_getArgType;
    private static final MethodHandle MTD$clang_getEnumConstantDeclUnsignedValue;
    private static final MethodHandle MTD$clang_getExpansionLocation;
    private static final MethodHandle MTD$clang_getCanonicalType;
    private static final MethodHandle MTD$clang_Cursor_isFunctionInlined;
    private static final MethodHandle MTD$clang_getTypedefName;
    private static final MethodHandle MTD$clang_getUnqualifiedType;
    private static final MethodHandle MTD$clang_getTypeKindSpelling;
    private static final MethodHandle MTD$clang_getFunctionTypeCallingConv;
    private static final MethodHandle MTD$clang_Cursor_getSpellingNameRange;
    private static final MethodHandle MTD$clang_getCursorExceptionSpecificationType;
    private static final MethodHandle MTD$clang_Type_visitFields;
    private static final MethodHandle MTD$clang_getCursorLanguage;
    private static final MethodHandle MTD$clang_getCursorLinkage;
    private static final MethodHandle MTD$clang_getCursorAvailability;
    private static final MethodHandle MTD$clang_getCursorPlatformAvailability;
    private static final MethodHandle MTD$clang_CXIndex_setInvocationEmissionPathOption;
    private static final MethodHandle MTD$clang_createTranslationUnitFromSourceFile;
    private static final MethodHandle MTD$clang_Cursor_getTemplateArgumentUnsignedValue;
    private static final MethodHandle MTD$clang_Type_getValueType;
    private static final MethodHandle MTD$clang_getCursorPrettyPrinted;
    private static final MethodHandle MTD$clang_defaultEditingTranslationUnitOptions;
    private static final MethodHandle MTD$clang_parseTranslationUnit2FullArgv;
    private static final MethodHandle MTD$clang_disposeCXPlatformAvailability;
    private static final MethodHandle MTD$clang_Type_getAlignOf;
    private static final MethodHandle MTD$clang_hashCursor;

    public static CXString clang_getClangVersion(SegmentAllocator allocator)
    {
        try {return new CXString((MemorySegment)MTD$clang_getClangVersion.invokeExact(allocator));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return (MemorySegment)MTD$clang_createIndex.invokeExact(excludeDeclarationsFromPCH, displayDiagnostics);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeIndex(MemorySegment index)
    {
        try {MTD$clang_disposeIndex.invokeExact(index);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, final MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (MemorySegment)MTD$clang_parseTranslationUnit.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, final MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return (int)MTD$clang_parseTranslationUnit2.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeTranslationUnit(MemorySegment arg1)
    {
        try {MTD$clang_disposeTranslationUnit.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_getCString(CXString string)
    {
        try {return ((MemorySegment)MTD$clang_getCString.invokeExact(string.ptr())).reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeString(CXString string)
    {
        try {MTD$clang_disposeString.invokeExact(string.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getNullCursor(SegmentAllocator allocator)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getNullCursor.invokeExact(allocator));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getTranslationUnitCursor(SegmentAllocator allocator, MemorySegment arg1)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getTranslationUnitCursor.invokeExact(allocator, arg1));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_visitChildren(Arena arena, CXCursor parent, CXCursorVisitor visitor, MemorySegment client_data)
    {
        try {return (int)MTD$clang_visitChildren.invokeExact(parent.ptr(), (MemorySegment)gSystemLinker.upcallStub(USTUB$CXCursorVisitor.bindTo(visitor), CXCursorVisitor.gDescriptor, arena), client_data);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getCursorSpelling(SegmentAllocator allocator, CXCursor arg1)
    {
        try {return new CXString((MemorySegment)MTD$clang_getCursorSpelling.invokeExact(allocator, arg1.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorKind(CXCursor arg1)
    {
        try {return (int)MTD$clang_getCursorKind.invokeExact(arg1.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isDeclaration(int arg1)
    {
        try {return (int)MTD$clang_isDeclaration.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isExpression(int arg1)
    {
        try {return (int)MTD$clang_isExpression.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isAttribute(int arg1)
    {
        try {return (int)MTD$clang_isAttribute.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isPreprocessing(int arg1)
    {
        try {return (int)MTD$clang_isPreprocessing.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceRange clang_getCursorExtent(SegmentAllocator allocator, CXCursor arg1)
    {
        try {return new CXSourceRange((MemorySegment)MTD$clang_getCursorExtent.invokeExact(allocator, arg1.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceRange clang_getRange(SegmentAllocator allocator, CXSourceLocation begin, CXSourceLocation end)
    {
        try {return new CXSourceRange((MemorySegment)MTD$clang_getRange.invokeExact(allocator, begin.ptr(), end.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceLocation clang_getRangeStart(SegmentAllocator allocator, CXSourceRange range)
    {
        try {return new CXSourceLocation((MemorySegment)MTD$clang_getRangeStart.invokeExact(allocator, range.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceLocation clang_getRangeEnd(SegmentAllocator allocator, CXSourceRange range)
    {
        try {return new CXSourceLocation((MemorySegment)MTD$clang_getRangeEnd.invokeExact(allocator, range.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceLocation clang_getLocationForOffset(SegmentAllocator allocator, MemorySegment tu, MemorySegment file, int offset)
    {
        try {return new CXSourceLocation((MemorySegment)MTD$clang_getLocationForOffset.invokeExact(allocator, tu, file, offset));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Location_isFromMainFile(CXSourceLocation location)
    {
        try {return (int)MTD$clang_Location_isFromMainFile.invokeExact(location.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD$clang_getSpellingLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getTokenSpelling(SegmentAllocator allocator, MemorySegment arg1, CXToken arg2)
    {
        try {return new CXString((MemorySegment)MTD$clang_getTokenSpelling.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens)
    {
        try {MTD$clang_tokenize.invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens)
    {
        try {MTD$clang_disposeTokens.invokeExact(TU, Tokens, NumTokens);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getCursorLexicalParent(SegmentAllocator allocator, CXCursor cursor)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getCursorLexicalParent.invokeExact(allocator, cursor.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceRange clang_getNullRange(SegmentAllocator allocator)
    {
        try {return new CXSourceRange((MemorySegment)MTD$clang_getNullRange.invokeExact(allocator));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Range_isNull(CXSourceRange range)
    {
        try {return (int)MTD$clang_Range_isNull.invokeExact(range.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getTokenKind(CXToken arg1)
    {
        try {return (int)MTD$clang_getTokenKind.invokeExact(arg1.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getCursorType(SegmentAllocator allocator, CXCursor C)
    {
        try {return new CXType((MemorySegment)MTD$clang_getCursorType.invokeExact(allocator, C.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getTypeSpelling(SegmentAllocator allocator, CXType CT)
    {
        try {return new CXString((MemorySegment)MTD$clang_getTypeSpelling.invokeExact(allocator, CT.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getCursorSemanticParent(SegmentAllocator allocator, CXCursor cursor)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getCursorSemanticParent.invokeExact(allocator, cursor.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getTypeDeclaration(SegmentAllocator allocator, CXType T)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getTypeDeclaration.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_equalCursors(CXCursor arg1, CXCursor arg2)
    {
        try {return (int)MTD$clang_equalCursors.invokeExact(arg1.ptr(), arg2.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_getFile(MemorySegment tu, MemorySegment file_name)
    {
        try {return (MemorySegment) MTD$clang_getFile.invokeExact(tu, file_name);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getFileName(SegmentAllocator allocator, MemorySegment SFile)
    {
        try {return new CXString((MemorySegment)MTD$clang_getFileName.invokeExact(allocator, SFile));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getEnumDeclIntegerType(SegmentAllocator allocator, CXCursor C)
    {
        try {return new CXType((MemorySegment)MTD$clang_getEnumDeclIntegerType.invokeExact(allocator, C.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Location_isInSystemHeader(CXSourceLocation location)
    {
        try {return (int)MTD$clang_Location_isInSystemHeader.invokeExact(location.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceLocation clang_getCursorLocation(SegmentAllocator allocator, CXCursor arg1)
    {
        try {return new CXSourceLocation((MemorySegment)MTD$clang_getCursorLocation.invokeExact(allocator, arg1.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_getCursor(SegmentAllocator allocator, MemorySegment arg1, CXSourceLocation arg2)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_getCursor.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_getEnumConstantDeclValue(CXCursor C)
    {
        try {return (long)MTD$clang_getEnumConstantDeclValue.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_getNumArguments(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_getNumArguments.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXCursor clang_Cursor_getArgument(SegmentAllocator allocator, CXCursor C, int i)
    {
        try {return new CXCursor((MemorySegment)MTD$clang_Cursor_getArgument.invokeExact(allocator, C.ptr(), i));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_CXXField_isMutable(CXCursor C)
    {
        try {return (int)MTD$clang_CXXField_isMutable.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isConstQualifiedType(CXType T)
    {
        try {return (int)MTD$clang_isConstQualifiedType.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_isBitField(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isBitField.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getFieldDeclBitWidth(CXCursor C)
    {
        try {return (int)MTD$clang_getFieldDeclBitWidth.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_equalTypes(CXType A, CXType B)
    {
        try {return (int)MTD$clang_equalTypes.invokeExact(A.ptr(), B.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isCursorDefinition(CXCursor arg1)
    {
        try {return (int)MTD$clang_isCursorDefinition.invokeExact(arg1.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_isVariadic(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isVariadic.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getCursorResultType(SegmentAllocator allocator, CXCursor C)
    {
        try {return new CXType((MemorySegment)MTD$clang_getCursorResultType.invokeExact(allocator, C.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_Cursor_Evaluate(CXCursor C)
    {
        try {return (MemorySegment)MTD$clang_Cursor_Evaluate.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_EvalResult_getKind(MemorySegment E)
    {
        try {return (int)MTD$clang_EvalResult_getKind.invokeExact(E);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_CXXMethod_isPureVirtual(CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isPureVirtual.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_CXXMethod_isVirtual(CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isVirtual.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_CXXMethod_isConst(CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isConst.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getPointeeType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_getPointeeType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_Type_getSizeOf(CXType T)
    {
        try {return (long)MTD$clang_Type_getSizeOf.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getElementType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_getElementType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_getNumElements(CXType T)
    {
        try {return (long)MTD$clang_getNumElements.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getArrayElementType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_getArrayElementType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_Type_getModifiedType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_Type_getModifiedType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_getArraySize(CXType T)
    {
        try {return (long)MTD$clang_getArraySize.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getCursorUSR(SegmentAllocator allocator, CXCursor arg1)
    {
        try {return new CXString((MemorySegment)MTD$clang_getCursorUSR.invokeExact(allocator, arg1.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getTypedefDeclUnderlyingType(SegmentAllocator allocator, CXCursor C)
    {
        try {return new CXType((MemorySegment)MTD$clang_getTypedefDeclUnderlyingType.invokeExact(allocator, C.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_getDiagnosticSetFromTU(MemorySegment Unit)
    {
        try {return (MemorySegment)MTD$clang_getDiagnosticSetFromTU.invokeExact(Unit);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeDiagnosticSet(MemorySegment Diags)
    {
        try {MTD$clang_disposeDiagnosticSet.invokeExact(Diags);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getNumDiagnosticsInSet(MemorySegment Diags)
    {
        try {return (int)MTD$clang_getNumDiagnosticsInSet.invokeExact(Diags);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_getDiagnosticInSet(MemorySegment Diags, int Index)
    {
        try {return (MemorySegment)MTD$clang_getDiagnosticInSet.invokeExact(Diags, Index);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getDiagnosticSeverity(MemorySegment arg1)
    {
        try {return (int)MTD$clang_getDiagnosticSeverity.invokeExact(arg1);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_formatDiagnostic(SegmentAllocator allocator, MemorySegment Diagnostic, int Options)
    {
        try {return new CXString((MemorySegment)MTD$clang_formatDiagnostic.invokeExact(allocator, Diagnostic, Options));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_getChildDiagnostics(MemorySegment D)
    {
        try {return (MemorySegment)MTD$clang_getChildDiagnostics.invokeExact(D);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeDiagnostic(MemorySegment Diagnostic)
    {
        try {MTD$clang_disposeDiagnostic.invokeExact(Diagnostic);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_CXXMethod_isStatic(CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isStatic.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorVisibility(CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorVisibility.invokeExact(cursor.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCXXAccessSpecifier(CXCursor arg1)
    {
        try {return (int)MTD$clang_getCXXAccessSpecifier.invokeExact(arg1.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_isAnonymousRecordDecl(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isAnonymousRecordDecl.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_isAnonymous(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isAnonymous.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_Cursor_getOffsetOfField(CXCursor C)
    {
        try {return (long)MTD$clang_Cursor_getOffsetOfField.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_Cursor_getModule(CXCursor C)
    {
        try {return (MemorySegment)MTD$clang_Cursor_getModule.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_Module_getFullName(SegmentAllocator allocator, MemorySegment Module)
    {
        try {return new CXString((MemorySegment)MTD$clang_Module_getFullName.invokeExact(allocator, Module));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Module_isSystem(MemorySegment Module)
    {
        try {return (int)MTD$clang_Module_isSystem.invokeExact(Module);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getResultType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_getResultType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_isFunctionTypeVariadic(CXType T)
    {
        try {return (int)MTD$clang_isFunctionTypeVariadic.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getNumArgTypes(CXType T)
    {
        try {return (int)MTD$clang_getNumArgTypes.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getArgType(SegmentAllocator allocator, CXType T, int i)
    {
        try {return new CXType((MemorySegment)MTD$clang_getArgType.invokeExact(allocator, T.ptr(), i));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C)
    {
        try {return (long)MTD$clang_getEnumConstantDeclUnsignedValue.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {MTD$clang_getExpansionLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getCanonicalType(SegmentAllocator allocator, CXType T)
    {
        try {return new CXType((MemorySegment)MTD$clang_getCanonicalType.invokeExact(allocator, T.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Cursor_isFunctionInlined(CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isFunctionInlined.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getTypedefName(SegmentAllocator allocator, CXType CT)
    {
        try {return new CXString((MemorySegment)MTD$clang_getTypedefName.invokeExact(allocator, CT.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_getUnqualifiedType(SegmentAllocator allocator, CXType CT)
    {
        try {return new CXType((MemorySegment)MTD$clang_getUnqualifiedType.invokeExact(allocator, CT.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getTypeKindSpelling(SegmentAllocator allocator, int K)
    {
        try {return new CXString((MemorySegment)MTD$clang_getTypeKindSpelling.invokeExact(allocator, K));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getFunctionTypeCallingConv(CXType T)
    {
        try {return (int)MTD$clang_getFunctionTypeCallingConv.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXSourceRange clang_Cursor_getSpellingNameRange(SegmentAllocator allocator, CXCursor arg1, int pieceIndex, int options)
    {
        try {return new CXSourceRange((MemorySegment)MTD$clang_Cursor_getSpellingNameRange.invokeExact(allocator, arg1.ptr(), pieceIndex, options));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorExceptionSpecificationType(CXCursor C)
    {
        try {return (int)MTD$clang_getCursorExceptionSpecificationType.invokeExact(C.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_Type_visitFields(Arena arena, CXType T, CXFieldVisitor visitor, MemorySegment client_data)
    {
        try {return (int)MTD$clang_Type_visitFields.invokeExact(T.ptr(), (MemorySegment)gSystemLinker.upcallStub(USTUB$CXFieldVisitor.bindTo(visitor), CXFieldVisitor.gDescriptor, arena), client_data);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorLanguage(CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorLanguage.invokeExact(cursor.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorLinkage(CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorLinkage.invokeExact(cursor.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorAvailability(CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorAvailability.invokeExact(cursor.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size)
    {
        try {return (int)MTD$clang_getCursorPlatformAvailability.invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_CXIndex_setInvocationEmissionPathOption(MemorySegment arg1, MemorySegment Path)
    {
        try {MTD$clang_CXIndex_setInvocationEmissionPathOption.invokeExact(arg1, Path);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static MemorySegment clang_createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_clang_command_line_args, MemorySegment clang_command_line_args, int num_unsaved_files, MemorySegment unsaved_files)
    {
        try {return (MemorySegment)MTD$clang_createTranslationUnitFromSourceFile.invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I)
    {
        try {return (long)MTD$clang_Cursor_getTemplateArgumentUnsignedValue.invokeExact(C.ptr(), I);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXType clang_Type_getValueType(SegmentAllocator allocator, CXType CT)
    {
        try {return new CXType((MemorySegment)MTD$clang_Type_getValueType.invokeExact(allocator, CT.ptr()));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static CXString clang_getCursorPrettyPrinted(SegmentAllocator allocator, CXCursor Cursor, MemorySegment Policy)
    {
        try {return new CXString((MemorySegment)MTD$clang_getCursorPrettyPrinted.invokeExact(allocator, Cursor.ptr(), Policy));}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_defaultEditingTranslationUnitOptions()
    {
        try {return (int)MTD$clang_defaultEditingTranslationUnitOptions.invokeExact();}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return (int)MTD$clang_parseTranslationUnit2FullArgv.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static void clang_disposeCXPlatformAvailability(MemorySegment availability)
    {
        try {MTD$clang_disposeCXPlatformAvailability.invokeExact(availability);}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static long clang_Type_getAlignOf(CXType T)
    {
        try {return (long)MTD$clang_Type_getAlignOf.invokeExact(T.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    public static int clang_hashCursor(CXCursor arg1)
    {
        try {return (int)MTD$clang_hashCursor.invokeExact(arg1.ptr());}
        catch (Throwable t) {throw new AssertionError(t);}
    }

    static
    {
        System.loadLibrary("libclang");
        gSystemLinker = Linker.nativeLinker();
        gLibLookup = name -> SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        try
        {
            USTUB$CXCursorVisitor = MethodHandles.lookup().findVirtual(CXCursorVisitor.class, "invoke", CXCursorVisitor.gDescriptor.toMethodType());
            USTUB$CXFieldVisitor = MethodHandles.lookup().findVirtual(CXFieldVisitor.class, "invoke", CXFieldVisitor.gDescriptor.toMethodType());
        }
        catch (NoSuchMethodException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        MTD$clang_getClangVersion = gSystemLinker.downcallHandle(gLibLookup.find("clang_getClangVersion").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout));
        MTD$clang_createIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_createIndex").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_disposeIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeIndex").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        MTD$clang_parseTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_parseTranslationUnit2 = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit2").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_disposeTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeTranslationUnit").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        MTD$clang_getCString = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCString").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, CXString.gStructLayout));
        MTD$clang_disposeString = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeString").orElseThrow(), FunctionDescriptor.ofVoid(CXString.gStructLayout));
        MTD$clang_getNullCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNullCursor").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout));
        MTD$clang_getTranslationUnitCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTranslationUnitCursor").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, ValueLayout.ADDRESS));
        MTD$clang_visitChildren = gSystemLinker.downcallHandle(gLibLookup.find("clang_visitChildren").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_getCursorSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorSpelling").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getCursorKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorKind").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_isDeclaration = gSystemLinker.downcallHandle(gLibLookup.find("clang_isDeclaration").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_isExpression = gSystemLinker.downcallHandle(gLibLookup.find("clang_isExpression").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_isAttribute = gSystemLinker.downcallHandle(gLibLookup.find("clang_isAttribute").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_isPreprocessing = gSystemLinker.downcallHandle(gLibLookup.find("clang_isPreprocessing").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_getCursorExtent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorExtent").orElseThrow(), FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRange").orElseThrow(), FunctionDescriptor.of(CXSourceRange.gStructLayout, CXSourceLocation.gStructLayout, CXSourceLocation.gStructLayout));
        MTD$clang_getRangeStart = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRangeStart").orElseThrow(), FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXSourceRange.gStructLayout));
        MTD$clang_getRangeEnd = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRangeEnd").orElseThrow(), FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXSourceRange.gStructLayout));
        MTD$clang_getLocationForOffset = gSystemLinker.downcallHandle(gLibLookup.find("clang_getLocationForOffset").orElseThrow(), FunctionDescriptor.of(CXSourceLocation.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        MTD$clang_Location_isFromMainFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_Location_isFromMainFile").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXSourceLocation.gStructLayout));
        MTD$clang_getSpellingLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSpellingLocation").orElseThrow(), FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_getTokenSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenSpelling").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, ValueLayout.ADDRESS, CXToken.gStructLayout));
        MTD$clang_tokenize = gSystemLinker.downcallHandle(gLibLookup.find("clang_tokenize").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CXSourceRange.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_disposeTokens = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeTokens").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        MTD$clang_getCursorLexicalParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLexicalParent").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getNullRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNullRange").orElseThrow(), FunctionDescriptor.of(CXSourceRange.gStructLayout));
        MTD$clang_Range_isNull = gSystemLinker.downcallHandle(gLibLookup.find("clang_Range_isNull").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXSourceRange.gStructLayout));
        MTD$clang_getTokenKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenKind").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXToken.gStructLayout));
        MTD$clang_getCursorType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getTypeSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeSpelling").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, CXType.gStructLayout));
        MTD$clang_getCursorSemanticParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorSemanticParent").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getTypeDeclaration = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeDeclaration").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, CXType.gStructLayout));
        MTD$clang_equalCursors = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalCursors").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFile").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_getFileName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileName").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, ValueLayout.ADDRESS));
        MTD$clang_getEnumDeclIntegerType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumDeclIntegerType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_Location_isInSystemHeader = gSystemLinker.downcallHandle(gLibLookup.find("clang_Location_isInSystemHeader").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXSourceLocation.gStructLayout));
        MTD$clang_getCursorLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLocation").orElseThrow(), FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursor").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, ValueLayout.ADDRESS, CXSourceLocation.gStructLayout));
        MTD$clang_getEnumConstantDeclValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumConstantDeclValue").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
        MTD$clang_Cursor_getNumArguments = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getNumArguments").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Cursor_getArgument = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getArgument").orElseThrow(), FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout, ValueLayout.JAVA_INT));
        MTD$clang_CXXField_isMutable = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXField_isMutable").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_isConstQualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_isConstQualifiedType").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout));
        MTD$clang_Cursor_isBitField = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isBitField").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getFieldDeclBitWidth = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFieldDeclBitWidth").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_equalTypes = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalTypes").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_isCursorDefinition = gSystemLinker.downcallHandle(gLibLookup.find("clang_isCursorDefinition").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Cursor_isVariadic = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isVariadic").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCursorResultType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorResultType").orElseThrow(),FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_Cursor_Evaluate = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_Evaluate").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, CXCursor.gStructLayout));
        MTD$clang_EvalResult_getKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getKind").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_CXXMethod_isPureVirtual = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isPureVirtual").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_CXXMethod_isVirtual = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isVirtual").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_CXXMethod_isConst = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isConst").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getPointeeType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getPointeeType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_Type_getSizeOf = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getSizeOf").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXType.gStructLayout));
        MTD$clang_getElementType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getElementType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_getNumElements = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumElements").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXType.gStructLayout));
        MTD$clang_getArrayElementType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArrayElementType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_getArraySize = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArraySize").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXType.gStructLayout));
        MTD$clang_Type_getModifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getModifiedType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_getCursorUSR = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorUSR").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getTypedefDeclUnderlyingType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypedefDeclUnderlyingType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
        MTD$clang_getDiagnosticSetFromTU = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticSetFromTU").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_disposeDiagnosticSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeDiagnosticSet").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        MTD$clang_getNumDiagnosticsInSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumDiagnosticsInSet").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_getDiagnosticInSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticInSet").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        MTD$clang_getDiagnosticSeverity = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticSeverity").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_formatDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_formatDiagnostic").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        MTD$clang_getChildDiagnostics = gSystemLinker.downcallHandle(gLibLookup.find("clang_getChildDiagnostics").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_disposeDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeDiagnostic").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        MTD$clang_CXXMethod_isStatic = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isStatic").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCursorVisibility = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorVisibility").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCXXAccessSpecifier = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCXXAccessSpecifier").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Cursor_isAnonymousRecordDecl = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isAnonymousRecordDecl").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Cursor_isAnonymous = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isAnonymous").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Cursor_getOffsetOfField = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getOffsetOfField").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
        MTD$clang_Cursor_getModule = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getModule").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, CXCursor.gStructLayout));
        MTD$clang_Module_getFullName = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getFullName").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, ValueLayout.ADDRESS));
        MTD$clang_Module_isSystem = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_isSystem").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_getResultType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getResultType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_isFunctionTypeVariadic = gSystemLinker.downcallHandle(gLibLookup.find("clang_isFunctionTypeVariadic").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout));
        MTD$clang_getNumArgTypes = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumArgTypes").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout));
        MTD$clang_getArgType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArgType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout, ValueLayout.JAVA_INT));
        MTD$clang_getEnumConstantDeclUnsignedValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumConstantDeclUnsignedValue").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
        MTD$clang_getExpansionLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getExpansionLocation").orElseThrow(), FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_getCanonicalType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCanonicalType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_Cursor_isFunctionInlined = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isFunctionInlined").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getTypedefName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypedefName").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, CXType.gStructLayout));
        MTD$clang_getUnqualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getUnqualifiedType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_getTypeKindSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeKindSpelling").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, ValueLayout.JAVA_INT));
        MTD$clang_getFunctionTypeCallingConv = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFunctionTypeCallingConv").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout));
        MTD$clang_Cursor_getSpellingNameRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getSpellingNameRange").orElseThrow(), FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        MTD$clang_getCursorExceptionSpecificationType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorExceptionSpecificationType").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_Type_visitFields = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_visitFields").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXType.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_getCursorLanguage = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLanguage").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCursorLinkage = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLinkage").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCursorAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorAvailability").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
        MTD$clang_getCursorPlatformAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorPlatformAvailability").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        MTD$clang_CXIndex_setInvocationEmissionPathOption = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXIndex_setInvocationEmissionPathOption").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        MTD$clang_createTranslationUnitFromSourceFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_createTranslationUnitFromSourceFile").orElseThrow(), FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_Cursor_getTemplateArgumentUnsignedValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTemplateArgumentUnsignedValue").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXCursor.gStructLayout, ValueLayout.JAVA_INT));
        MTD$clang_Type_getValueType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getValueType").orElseThrow(), FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
        MTD$clang_getCursorPrettyPrinted = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorPrettyPrinted").orElseThrow(), FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout, ValueLayout.ADDRESS));
        MTD$clang_defaultEditingTranslationUnitOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultEditingTranslationUnitOptions").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT));
        MTD$clang_parseTranslationUnit2FullArgv = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit2FullArgv").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        MTD$clang_disposeCXPlatformAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeCXPlatformAvailability").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        MTD$clang_Type_getAlignOf = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getAlignOf").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_LONG, CXType.gStructLayout));
        MTD$clang_hashCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_hashCursor").orElseThrow(), FunctionDescriptor.of(ValueLayout.JAVA_INT, CXCursor.gStructLayout));
    }
}
