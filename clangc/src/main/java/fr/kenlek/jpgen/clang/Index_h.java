package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Predicate;

import static java.lang.foreign.MemorySegment.NULL;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static fr.kenlek.jpgen.clang.CXCursorKind.CXCursor_FieldDecl;
import static fr.kenlek.jpgen.clang.CXDiagnosticSeverity.CXDiagnostic_Error;

public interface Index_h
{
    static Index_h load(SymbolLookup lookup, Linker linker)
    {
        return new UpfrontIndex_h(lookup, linker);
    }

    static Index_h load(SymbolLookup lookup)
    {
        return load(lookup, Linker.nativeLinker());
    }

    static Index_h load()
    {
        return load(SymbolLookup.loaderLookup());
    }

    MemorySegment clang_getCString(CXString string);
    void clang_disposeString(CXString string);
    void clang_disposeStringSet(MemorySegment set);
    long clang_getBuildSessionTimestamp();
    MemorySegment clang_VirtualFileOverlay_create(int options);
    int clang_VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath);
    int clang_VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, int caseSensitive);
    int clang_VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void clang_free(MemorySegment buffer);
    void clang_VirtualFileOverlay_dispose(MemorySegment $arg1);
    MemorySegment clang_ModuleMapDescriptor_create(int options);
    int clang_ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name);
    int clang_ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name);
    int clang_ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void clang_ModuleMapDescriptor_dispose(MemorySegment $arg1);
    CXString clang_getFileName(SegmentAllocator $segmentAllocator, MemorySegment SFile);
    long clang_getFileTime(MemorySegment SFile);
    int clang_getFileUniqueID(MemorySegment file, MemorySegment outID);
    int clang_File_isEqual(MemorySegment file1, MemorySegment file2);
    CXString clang_File_tryGetRealPathName(SegmentAllocator $segmentAllocator, MemorySegment file);
    CXSourceLocation clang_getNullLocation(SegmentAllocator $segmentAllocator);
    int clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2);
    int clang_Location_isInSystemHeader(CXSourceLocation location);
    int clang_Location_isFromMainFile(CXSourceLocation location);
    CXSourceRange clang_getNullRange(SegmentAllocator $segmentAllocator);
    CXSourceRange clang_getRange(SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end);
    int clang_equalRanges(CXSourceRange range1, CXSourceRange range2);
    int clang_Range_isNull(CXSourceRange range);
    void clang_getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void clang_getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column);
    void clang_getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void clang_getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void clang_getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    CXSourceLocation clang_getRangeStart(SegmentAllocator $segmentAllocator, CXSourceRange range);
    CXSourceLocation clang_getRangeEnd(SegmentAllocator $segmentAllocator, CXSourceRange range);
    void clang_disposeSourceRangeList(MemorySegment ranges);
    int clang_getNumDiagnosticsInSet(MemorySegment Diags);
    MemorySegment clang_getDiagnosticInSet(MemorySegment Diags, int Index);
    MemorySegment clang_loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString);
    void clang_disposeDiagnosticSet(MemorySegment Diags);
    MemorySegment clang_getChildDiagnostics(MemorySegment D);
    void clang_disposeDiagnostic(MemorySegment Diagnostic);
    CXString clang_formatDiagnostic(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options);
    int clang_defaultDiagnosticDisplayOptions();
    int clang_getDiagnosticSeverity(MemorySegment $arg1);
    CXSourceLocation clang_getDiagnosticLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString clang_getDiagnosticSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString clang_getDiagnosticOption(SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable);
    int clang_getDiagnosticCategory(MemorySegment $arg1);
    CXString clang_getDiagnosticCategoryName(SegmentAllocator $segmentAllocator, int Category);
    CXString clang_getDiagnosticCategoryText(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    int clang_getDiagnosticNumRanges(MemorySegment $arg1);
    CXSourceRange clang_getDiagnosticRange(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range);
    int clang_getDiagnosticNumFixIts(MemorySegment Diagnostic);
    CXString clang_getDiagnosticFixIt(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange);
    MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics);
    void clang_disposeIndex(MemorySegment index);
    void clang_CXIndex_setGlobalOptions(MemorySegment $arg1, int options);
    int clang_CXIndex_getGlobalOptions(MemorySegment $arg1);
    void clang_CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path);
    int clang_isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file);
    MemorySegment clang_getFile(MemorySegment tu, MemorySegment file_name);
    MemorySegment clang_getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size);
    CXSourceLocation clang_getLocation(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column);
    CXSourceLocation clang_getLocationForOffset(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset);
    MemorySegment clang_getSkippedRanges(MemorySegment tu, MemorySegment file);
    MemorySegment clang_getAllSkippedRanges(MemorySegment tu);
    int clang_getNumDiagnostics(MemorySegment Unit);
    MemorySegment clang_getDiagnostic(MemorySegment Unit, int Index);
    MemorySegment clang_getDiagnosticSetFromTU(MemorySegment Unit);
    CXString clang_getTranslationUnitSpelling(SegmentAllocator $segmentAllocator, MemorySegment CTUnit);
    MemorySegment clang_createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_clang_command_line_args, MemorySegment clang_command_line_args, int num_unsaved_files, MemorySegment unsaved_files);
    MemorySegment clang_createTranslationUnit(MemorySegment CIdx, MemorySegment ast_filename);
    int clang_createTranslationUnit2(MemorySegment CIdx, MemorySegment ast_filename, MemorySegment out_TU);
    int clang_defaultEditingTranslationUnitOptions();
    MemorySegment clang_parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options);
    int clang_parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU);
    int clang_parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU);
    int clang_defaultSaveOptions(MemorySegment TU);
    int clang_saveTranslationUnit(MemorySegment TU, MemorySegment FileName, int options);
    int clang_suspendTranslationUnit(MemorySegment $arg1);
    void clang_disposeTranslationUnit(MemorySegment $arg1);
    int clang_defaultReparseOptions(MemorySegment TU);
    int clang_reparseTranslationUnit(MemorySegment TU, int num_unsaved_files, MemorySegment unsaved_files, int options);
    MemorySegment clang_getTUResourceUsageName(int kind);
    CXTUResourceUsage clang_getCXTUResourceUsage(SegmentAllocator $segmentAllocator, MemorySegment TU);
    void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage);
    MemorySegment clang_getTranslationUnitTargetInfo(MemorySegment CTUnit);
    void clang_TargetInfo_dispose(MemorySegment Info);
    CXString clang_TargetInfo_getTriple(SegmentAllocator $segmentAllocator, MemorySegment Info);
    int clang_TargetInfo_getPointerWidth(MemorySegment Info);
    CXCursor clang_getNullCursor(SegmentAllocator $segmentAllocator);
    CXCursor clang_getTranslationUnitCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    int clang_equalCursors(CXCursor $arg1, CXCursor $arg2);
    int clang_Cursor_isNull(CXCursor cursor);
    int clang_hashCursor(CXCursor $arg1);
    int clang_getCursorKind(CXCursor $arg1);
    int clang_isDeclaration(int $arg1);
    int clang_isInvalidDeclaration(CXCursor $arg1);
    int clang_isReference(int $arg1);
    int clang_isExpression(int $arg1);
    int clang_isStatement(int $arg1);
    int clang_isAttribute(int $arg1);
    int clang_Cursor_hasAttrs(CXCursor C);
    int clang_isInvalid(int $arg1);
    int clang_isTranslationUnit(int $arg1);
    int clang_isPreprocessing(int $arg1);
    int clang_isUnexposed(int $arg1);
    int clang_getCursorLinkage(CXCursor cursor);
    int clang_getCursorVisibility(CXCursor cursor);
    int clang_getCursorAvailability(CXCursor cursor);
    int clang_getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size);
    void clang_disposeCXPlatformAvailability(MemorySegment availability);
    CXCursor clang_Cursor_getVarDeclInitializer(SegmentAllocator $segmentAllocator, CXCursor cursor);
    int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor);
    int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor);
    int clang_getCursorLanguage(CXCursor cursor);
    int clang_getCursorTLSKind(CXCursor cursor);
    MemorySegment clang_Cursor_getTranslationUnit(CXCursor $arg1);
    MemorySegment clang_createCXCursorSet();
    void clang_disposeCXCursorSet(MemorySegment cset);
    int clang_CXCursorSet_contains(MemorySegment cset, CXCursor cursor);
    int clang_CXCursorSet_insert(MemorySegment cset, CXCursor cursor);
    CXCursor clang_getCursorSemanticParent(SegmentAllocator $segmentAllocator, CXCursor cursor);
    CXCursor clang_getCursorLexicalParent(SegmentAllocator $segmentAllocator, CXCursor cursor);
    void clang_getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden);
    void clang_disposeOverriddenCursors(MemorySegment overridden);
    MemorySegment clang_getIncludedFile(CXCursor cursor);
    CXCursor clang_getCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2);
    CXSourceLocation clang_getCursorLocation(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange clang_getCursorExtent(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXType clang_getCursorType(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_getTypeSpelling(SegmentAllocator $segmentAllocator, CXType CT);
    CXType clang_getTypedefDeclUnderlyingType(SegmentAllocator $segmentAllocator, CXCursor C);
    CXType clang_getEnumDeclIntegerType(SegmentAllocator $segmentAllocator, CXCursor C);
    long clang_getEnumConstantDeclValue(CXCursor C);
    long clang_getEnumConstantDeclUnsignedValue(CXCursor C);
    int clang_Cursor_isBitField(CXCursor C);
    int clang_getFieldDeclBitWidth(CXCursor C);
    int clang_Cursor_getNumArguments(CXCursor C);
    CXCursor clang_Cursor_getArgument(SegmentAllocator $segmentAllocator, CXCursor C, int i);
    int clang_Cursor_getNumTemplateArguments(CXCursor C);
    int clang_Cursor_getTemplateArgumentKind(CXCursor C, int I);
    CXType clang_Cursor_getTemplateArgumentType(SegmentAllocator $segmentAllocator, CXCursor C, int I);
    long clang_Cursor_getTemplateArgumentValue(CXCursor C, int I);
    long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I);
    int clang_equalTypes(CXType A, CXType B);
    CXType clang_getCanonicalType(SegmentAllocator $segmentAllocator, CXType T);
    int clang_isConstQualifiedType(CXType T);
    int clang_Cursor_isMacroFunctionLike(CXCursor C);
    int clang_Cursor_isMacroBuiltin(CXCursor C);
    int clang_Cursor_isFunctionInlined(CXCursor C);
    int clang_isVolatileQualifiedType(CXType T);
    int clang_isRestrictQualifiedType(CXType T);
    int clang_getAddressSpace(CXType T);
    CXString clang_getTypedefName(SegmentAllocator $segmentAllocator, CXType CT);
    CXType clang_getPointeeType(SegmentAllocator $segmentAllocator, CXType T);
    CXType clang_getUnqualifiedType(SegmentAllocator $segmentAllocator, CXType CT);
    CXType clang_getNonReferenceType(SegmentAllocator $segmentAllocator, CXType CT);
    CXCursor clang_getTypeDeclaration(SegmentAllocator $segmentAllocator, CXType T);
    CXString clang_getDeclObjCTypeEncoding(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_Type_getObjCEncoding(SegmentAllocator $segmentAllocator, CXType type);
    CXString clang_getTypeKindSpelling(SegmentAllocator $segmentAllocator, int K);
    int clang_getFunctionTypeCallingConv(CXType T);
    CXType clang_getResultType(SegmentAllocator $segmentAllocator, CXType T);
    int clang_getExceptionSpecificationType(CXType T);
    int clang_getNumArgTypes(CXType T);
    CXType clang_getArgType(SegmentAllocator $segmentAllocator, CXType T, int i);
    CXType clang_Type_getObjCObjectBaseType(SegmentAllocator $segmentAllocator, CXType T);
    int clang_Type_getNumObjCProtocolRefs(CXType T);
    CXCursor clang_Type_getObjCProtocolDecl(SegmentAllocator $segmentAllocator, CXType T, int i);
    int clang_Type_getNumObjCTypeArgs(CXType T);
    CXType clang_Type_getObjCTypeArg(SegmentAllocator $segmentAllocator, CXType T, int i);
    int clang_isFunctionTypeVariadic(CXType T);
    CXType clang_getCursorResultType(SegmentAllocator $segmentAllocator, CXCursor C);
    int clang_getCursorExceptionSpecificationType(CXCursor C);
    int clang_isPODType(CXType T);
    CXType clang_getElementType(SegmentAllocator $segmentAllocator, CXType T);
    long clang_getNumElements(CXType T);
    CXType clang_getArrayElementType(SegmentAllocator $segmentAllocator, CXType T);
    long clang_getArraySize(CXType T);
    CXType clang_Type_getNamedType(SegmentAllocator $segmentAllocator, CXType T);
    int clang_Type_isTransparentTagTypedef(CXType T);
    int clang_Type_getNullability(CXType T);
    long clang_Type_getAlignOf(CXType T);
    CXType clang_Type_getClassType(SegmentAllocator $segmentAllocator, CXType T);
    long clang_Type_getSizeOf(CXType T);
    long clang_Type_getOffsetOf(CXType T, MemorySegment S);
    CXType clang_Type_getModifiedType(SegmentAllocator $segmentAllocator, CXType T);
    CXType clang_Type_getValueType(SegmentAllocator $segmentAllocator, CXType CT);
    long clang_Cursor_getOffsetOfField(CXCursor C);
    int clang_Cursor_isAnonymous(CXCursor C);
    int clang_Cursor_isAnonymousRecordDecl(CXCursor C);
    int clang_Cursor_isInlineNamespace(CXCursor C);
    int clang_Type_getNumTemplateArguments(CXType T);
    CXType clang_Type_getTemplateArgumentAsType(SegmentAllocator $segmentAllocator, CXType T, int i);
    int clang_Type_getCXXRefQualifier(CXType T);
    int clang_isVirtualBase(CXCursor $arg1);
    long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base);
    int clang_getCXXAccessSpecifier(CXCursor $arg1);
    int clang_Cursor_getBinaryOpcode(CXCursor C);
    CXString clang_Cursor_getBinaryOpcodeStr(SegmentAllocator $segmentAllocator, int Op);
    int clang_Cursor_getStorageClass(CXCursor $arg1);
    int clang_getNumOverloadedDecls(CXCursor cursor);
    CXCursor clang_getOverloadedDecl(SegmentAllocator $segmentAllocator, CXCursor cursor, int index);
    CXType clang_getIBOutletCollectionType(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int clang_visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data);
    int clang_visitChildrenWithBlock(CXCursor parent, MemorySegment block);
    CXString clang_getCursorUSR(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXString clang_constructUSR_ObjCClass(SegmentAllocator $segmentAllocator, MemorySegment class_name);
    CXString clang_constructUSR_ObjCCategory(SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name);
    CXString clang_constructUSR_ObjCProtocol(SegmentAllocator $segmentAllocator, MemorySegment protocol_name);
    CXString clang_constructUSR_ObjCIvar(SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR);
    CXString clang_constructUSR_ObjCMethod(SegmentAllocator $segmentAllocator, MemorySegment name, int isInstanceMethod, CXString classUSR);
    CXString clang_constructUSR_ObjCProperty(SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR);
    CXString clang_getCursorSpelling(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange clang_Cursor_getSpellingNameRange(SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options);
    int clang_PrintingPolicy_getProperty(MemorySegment Policy, int Property);
    void clang_PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value);
    MemorySegment clang_getCursorPrintingPolicy(CXCursor $arg1);
    void clang_PrintingPolicy_dispose(MemorySegment Policy);
    CXString clang_getCursorPrettyPrinted(SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy);
    CXString clang_getTypePrettyPrinted(SegmentAllocator $segmentAllocator, CXType T, MemorySegment cxPolicy);
    CXString clang_getFullyQualifiedName(SegmentAllocator $segmentAllocator, CXType CT, MemorySegment Policy, int WithGlobalNsPrefix);
    CXString clang_getCursorDisplayName(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor clang_getCursorReferenced(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor clang_getCursorDefinition(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int clang_isCursorDefinition(CXCursor $arg1);
    CXCursor clang_getCanonicalCursor(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int clang_Cursor_getObjCSelectorIndex(CXCursor $arg1);
    int clang_Cursor_isDynamicCall(CXCursor C);
    CXType clang_Cursor_getReceiverType(SegmentAllocator $segmentAllocator, CXCursor C);
    int clang_Cursor_getObjCPropertyAttributes(CXCursor C, int reserved);
    CXString clang_Cursor_getObjCPropertyGetterName(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_Cursor_getObjCPropertySetterName(SegmentAllocator $segmentAllocator, CXCursor C);
    int clang_Cursor_getObjCDeclQualifiers(CXCursor C);
    int clang_Cursor_isObjCOptional(CXCursor C);
    int clang_Cursor_isVariadic(CXCursor C);
    int clang_Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated);
    CXSourceRange clang_Cursor_getCommentRange(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_Cursor_getRawCommentText(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_Cursor_getBriefCommentText(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString clang_Cursor_getMangling(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    MemorySegment clang_Cursor_getCXXManglings(CXCursor $arg1);
    MemorySegment clang_Cursor_getObjCManglings(CXCursor $arg1);
    MemorySegment clang_Cursor_getModule(CXCursor C);
    MemorySegment clang_getModuleForFile(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment clang_Module_getASTFile(MemorySegment Module);
    MemorySegment clang_Module_getParent(MemorySegment Module);
    CXString clang_Module_getName(SegmentAllocator $segmentAllocator, MemorySegment Module);
    CXString clang_Module_getFullName(SegmentAllocator $segmentAllocator, MemorySegment Module);
    int clang_Module_isSystem(MemorySegment Module);
    int clang_Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module);
    MemorySegment clang_Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index);
    int clang_CXXConstructor_isConvertingConstructor(CXCursor C);
    int clang_CXXConstructor_isCopyConstructor(CXCursor C);
    int clang_CXXConstructor_isDefaultConstructor(CXCursor C);
    int clang_CXXConstructor_isMoveConstructor(CXCursor C);
    int clang_CXXField_isMutable(CXCursor C);
    int clang_CXXMethod_isDefaulted(CXCursor C);
    int clang_CXXMethod_isDeleted(CXCursor C);
    int clang_CXXMethod_isPureVirtual(CXCursor C);
    int clang_CXXMethod_isStatic(CXCursor C);
    int clang_CXXMethod_isVirtual(CXCursor C);
    int clang_CXXMethod_isCopyAssignmentOperator(CXCursor C);
    int clang_CXXMethod_isMoveAssignmentOperator(CXCursor C);
    int clang_CXXMethod_isExplicit(CXCursor C);
    int clang_CXXRecord_isAbstract(CXCursor C);
    int clang_EnumDecl_isScoped(CXCursor C);
    int clang_CXXMethod_isConst(CXCursor C);
    int clang_getTemplateCursorKind(CXCursor C);
    CXCursor clang_getSpecializedCursorTemplate(SegmentAllocator $segmentAllocator, CXCursor C);
    CXSourceRange clang_getCursorReferenceNameRange(SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex);
    MemorySegment clang_getToken(MemorySegment TU, CXSourceLocation Location);
    int clang_getTokenKind(CXToken $arg1);
    CXString clang_getTokenSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceLocation clang_getTokenLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceRange clang_getTokenExtent(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    void clang_tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens);
    void clang_annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors);
    void clang_disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens);
    CXString clang_getCursorKindSpelling(SegmentAllocator $segmentAllocator, int Kind);
    void clang_getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn);
    void clang_enableStackTraces();
    void clang_executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size);
    int clang_getCompletionChunkKind(MemorySegment completion_string, int chunk_number);
    CXString clang_getCompletionChunkText(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number);
    MemorySegment clang_getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number);
    int clang_getNumCompletionChunks(MemorySegment completion_string);
    int clang_getCompletionPriority(MemorySegment completion_string);
    int clang_getCompletionAvailability(MemorySegment completion_string);
    int clang_getCompletionNumAnnotations(MemorySegment completion_string);
    CXString clang_getCompletionAnnotation(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number);
    CXString clang_getCompletionParent(SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind);
    CXString clang_getCompletionBriefComment(SegmentAllocator $segmentAllocator, MemorySegment completion_string);
    MemorySegment clang_getCursorCompletionString(CXCursor cursor);
    int clang_getCompletionNumFixIts(MemorySegment results, int completion_index);
    CXString clang_getCompletionFixIt(SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range);
    int clang_defaultCodeCompleteOptions();
    MemorySegment clang_codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options);
    void clang_sortCodeCompletionResults(MemorySegment Results, int NumResults);
    void clang_disposeCodeCompleteResults(MemorySegment Results);
    int clang_codeCompleteGetNumDiagnostics(MemorySegment Results);
    MemorySegment clang_codeCompleteGetDiagnostic(MemorySegment Results, int Index);
    long clang_codeCompleteGetContexts(MemorySegment Results);
    int clang_codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete);
    CXString clang_codeCompleteGetContainerUSR(SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString clang_codeCompleteGetObjCSelector(SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString clang_getClangVersion(SegmentAllocator $segmentAllocator);
    void clang_toggleCrashRecovery(int isEnabled);
    void clang_getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data);
    MemorySegment clang_Cursor_Evaluate(CXCursor C);
    int clang_EvalResult_getKind(MemorySegment E);
    int clang_EvalResult_getAsInt(MemorySegment E);
    long clang_EvalResult_getAsLongLong(MemorySegment E);
    int clang_EvalResult_isUnsignedInt(MemorySegment E);
    long clang_EvalResult_getAsUnsigned(MemorySegment E);
    double clang_EvalResult_getAsDouble(MemorySegment E);
    MemorySegment clang_EvalResult_getAsStr(MemorySegment E);
    void clang_EvalResult_dispose(MemorySegment E);
    int clang_findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int clang_findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int clang_findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3);
    int clang_findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3);
    int clang_index_isEntityObjCContainerKind(int $arg1);
    MemorySegment clang_index_getObjCContainerDeclInfo(MemorySegment $arg1);
    MemorySegment clang_index_getObjCInterfaceDeclInfo(MemorySegment $arg1);
    MemorySegment clang_index_getObjCCategoryDeclInfo(MemorySegment $arg1);
    MemorySegment clang_index_getObjCProtocolRefListInfo(MemorySegment $arg1);
    MemorySegment clang_index_getObjCPropertyDeclInfo(MemorySegment $arg1);
    MemorySegment clang_index_getIBOutletCollectionAttrInfo(MemorySegment $arg1);
    MemorySegment clang_index_getCXXClassDeclInfo(MemorySegment $arg1);
    MemorySegment clang_index_getClientContainer(MemorySegment $arg1);
    void clang_index_setClientContainer(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment clang_index_getClientEntity(MemorySegment $arg1);
    void clang_index_setClientEntity(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment clang_IndexAction_create(MemorySegment CIdx);
    void clang_IndexAction_dispose(MemorySegment $arg1);
    int clang_indexSourceFile(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options);
    int clang_indexSourceFileFullArgv(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options);
    int clang_indexTranslationUnit(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment $arg6);
    void clang_indexLoc_getFileLocation(CXIdxLoc loc, MemorySegment indexFile, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    CXSourceLocation clang_indexLoc_getCXSourceLocation(SegmentAllocator $segmentAllocator, CXIdxLoc loc);
    int clang_Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data);
    int clang_visitCXXBaseClasses(CXType T, MemorySegment visitor, MemorySegment client_data);
    int clang_visitCXXMethods(CXType T, MemorySegment visitor, MemorySegment client_data);
    CXString clang_getBinaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind);
    int clang_getCursorBinaryOperatorKind(CXCursor cursor);
    CXString clang_getUnaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind);
    int clang_getCursorUnaryOperatorKind(CXCursor cursor);

    default Optional<String> retrieveString(CXString string)
    {
        MemorySegment cString = this.clang_getCString(string);
        if (cString.equals(NULL))
        {
            return Optional.empty();
        }

        final String res = cString.getString(0);
        this.clang_disposeString(string);
        return Optional.of(res).filter(Predicate.not(String::isEmpty));
    }

    default boolean isCursorAnonymous(CXCursor cursor)
    {
        if (this.clang_getCursorKind(cursor) == CXCursor_FieldDecl)
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXType fieldType = this.clang_getCursorType(arena, cursor);
                return this.isCursorAnonymous(clang_getTypeDeclaration(arena, fieldType));
            }
        }

        return clang_Cursor_isAnonymous(cursor) != 0;
    }

    default Optional<String> getCursorSpelling(CXCursor cursor)
    {
        if (this.isCursorAnonymous(cursor))
        {
            return Optional.empty();
        }

        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.clang_getCursorSpelling(arena, cursor));
        }
    }

    default CXSourceLocation getCursorLocation(SegmentAllocator allocator, CXCursor cursor, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        CXSourceLocation location = this.clang_getCursorLocation(allocator, cursor);
        this.clang_getFileLocation(location, file, line, column, offset);
        return location;
    }

    default Optional<Path> getFilePath(MemorySegment file)
    {
        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.clang_getFileName(arena, file))
                .map(filename -> Path.of(filename).toAbsolutePath().normalize());
        }
    }

    default Optional<Path> getCursorFilePath(CXCursor cursor)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pFile = arena.allocate(UNBOUNDED_POINTER);
            this.getCursorLocation(arena, cursor, pFile, NULL, NULL, NULL);
            return this.getFilePath(pFile.get(UNBOUNDED_POINTER, 0));
        }
    }

    default String getClangVersion()
    {
        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.clang_getClangVersion(arena)).orElse("unknown");
        }
    }

    /// Do not use this function, use [#dumpDiagnostics(java.lang.foreign.MemorySegment, int, java.lang.StringBuilder)] instead.
    default boolean dumpDiagnostics(SegmentAllocator allocator, MemorySegment diagnostics, int options, StringBuilder clangReport)
    {
        boolean fail = false;
        for (int i = 0; i < this.clang_getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diag = this.clang_getDiagnosticInSet(diagnostics, i);
            retrieveString(this.clang_formatDiagnostic(allocator, diag, options)).ifPresent(diagString ->
            {
                clangReport.append(System.lineSeparator());
                clangReport.append(diagString);
            });

            MemorySegment children = this.clang_getChildDiagnostics(diag);
            fail |= this.clang_getDiagnosticSeverity(diag) >= CXDiagnostic_Error;
            fail |= this.dumpDiagnostics(allocator, children, options, clangReport);
            this.clang_disposeDiagnostic(diag);
        }

        return fail;
    }

    default boolean dumpDiagnostics(MemorySegment diagnostics, int options, StringBuilder clangReport)
    {
        try (Arena arena = Arena.ofConfined())
        {
            return this.dumpDiagnostics(SegmentAllocator.prefixAllocator(arena.allocate(CXString.LAYOUT)), diagnostics, options, clangReport);
        }
    }
}
