package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.dynload.DowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.ProxyCreationException;
import fr.kenlek.jpgen.api.dynload.Redirect;

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
import static fr.kenlek.jpgen.api.dynload.DowncallTransformer.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.CXCursor_FieldDecl;
import static fr.kenlek.jpgen.clang.CXDiagnosticSeverity.CXDiagnostic_Error;

@Redirect.Generic(@Redirect.Case("clang_$1"))
public interface LibClang
{
    /// There appears to be a bug on Windows with libclang that causes an access violation when
    /// the corresponding shared library is closed. Therefore, it is strongly recommended to use
    /// the global arena to delay unloading for as long as possible.
    static SymbolLookup libraryLookup(Arena arena)
    {
        return SymbolLookup.libraryLookup(
            Optional.ofNullable(System.getProperty("jpgen.clang.path")).orElse("clang"),
            arena
        );
    }

    private static LibClang load(DowncallDispatcher dispatcher) throws ProxyCreationException
    {
        return NativeProxies.instantiate(LibClang.class, dispatcher.compose(PUBLIC_GROUP_TRANSFORMER).compose(EXPLICIT_CAST_TRANSFORMER));
    }

    static LibClang load(SymbolLookup lookup, Linker linker) throws ProxyCreationException
    {
        return load(new LinkingDowncallDispatcher(lookup, linker));
    }

    static LibClang load(Arena arena) throws ProxyCreationException
    {
        return load(new LinkingDowncallDispatcher(libraryLookup(arena)));
    }

    static LibClang load() throws ProxyCreationException
    {
        return load(new LinkingDowncallDispatcher(libraryLookup(Arena.global())));
    }

    static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursorKind.CXCursor_StructDecl || cursorKind == CXCursorKind.CXCursor_UnionDecl;
    }

    MemorySegment getCString(CXString string);
    void disposeString(CXString string);
    void disposeStringSet(MemorySegment set);
    long getBuildSessionTimestamp();
    MemorySegment VirtualFileOverlay_create(int options);
    int VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath);
    int VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, @Layout("int") boolean caseSensitive);
    int VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void free(MemorySegment buffer);
    void VirtualFileOverlay_dispose(MemorySegment $arg1);
    MemorySegment ModuleMapDescriptor_create(int options);
    int ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name);
    int ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name);
    int ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void ModuleMapDescriptor_dispose(MemorySegment $arg1);
    CXString getFileName(SegmentAllocator $segmentAllocator, MemorySegment SFile);
    long getFileTime(MemorySegment SFile);
    int getFileUniqueID(MemorySegment file, MemorySegment outID);
    @Layout("int") boolean File_isEqual(MemorySegment file1, MemorySegment file2);
    CXString File_tryGetRealPathName(SegmentAllocator $segmentAllocator, MemorySegment file);
    CXSourceLocation getNullLocation(SegmentAllocator $segmentAllocator);
    @Layout("int") boolean equalLocations(CXSourceLocation loc1, CXSourceLocation loc2);
    @Layout("int") boolean Location_isInSystemHeader(CXSourceLocation location);
    @Layout("int") boolean Location_isFromMainFile(CXSourceLocation location);
    CXSourceRange getNullRange(SegmentAllocator $segmentAllocator);
    CXSourceRange getRange(SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end);
    @Layout("int") boolean equalRanges(CXSourceRange range1, CXSourceRange range2);
    @Layout("int") boolean Range_isNull(CXSourceRange range);
    void getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column);
    void getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    CXSourceLocation getRangeStart(SegmentAllocator $segmentAllocator, CXSourceRange range);
    CXSourceLocation getRangeEnd(SegmentAllocator $segmentAllocator, CXSourceRange range);
    void disposeSourceRangeList(MemorySegment ranges);
    int getNumDiagnosticsInSet(MemorySegment Diags);
    MemorySegment getDiagnosticInSet(MemorySegment Diags, int Index);
    MemorySegment loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString);
    void disposeDiagnosticSet(MemorySegment Diags);
    MemorySegment getChildDiagnostics(MemorySegment D);
    void disposeDiagnostic(MemorySegment Diagnostic);
    CXString formatDiagnostic(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options);
    int defaultDiagnosticDisplayOptions();
    int getDiagnosticSeverity(MemorySegment $arg1);
    CXSourceLocation getDiagnosticLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString getDiagnosticSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString getDiagnosticOption(SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable);
    int getDiagnosticCategory(MemorySegment $arg1);
    CXString getDiagnosticCategoryName(SegmentAllocator $segmentAllocator, int Category);
    CXString getDiagnosticCategoryText(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    int getDiagnosticNumRanges(MemorySegment $arg1);
    CXSourceRange getDiagnosticRange(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range);
    int getDiagnosticNumFixIts(MemorySegment Diagnostic);
    CXString getDiagnosticFixIt(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange);
    MemorySegment createIndex(@Layout("int") boolean excludeDeclarationsFromPCH, @Layout("int") boolean displayDiagnostics);
    void disposeIndex(MemorySegment index);
    void CXIndex_setGlobalOptions(MemorySegment $arg1, int options);
    int CXIndex_getGlobalOptions(MemorySegment $arg1);
    void CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path);
    @Layout("int") boolean isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file);
    MemorySegment getFile(MemorySegment tu, MemorySegment file_name);
    MemorySegment getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size);
    CXSourceLocation getLocation(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column);
    CXSourceLocation getLocationForOffset(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset);
    MemorySegment getSkippedRanges(MemorySegment tu, MemorySegment file);
    MemorySegment getAllSkippedRanges(MemorySegment tu);
    int getNumDiagnostics(MemorySegment Unit);
    MemorySegment getDiagnostic(MemorySegment Unit, int Index);
    MemorySegment getDiagnosticSetFromTU(MemorySegment Unit);
    CXString getTranslationUnitSpelling(SegmentAllocator $segmentAllocator, MemorySegment CTUnit);
    MemorySegment createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_command_line_args, MemorySegment command_line_args, int num_unsaved_files, MemorySegment unsaved_files);
    MemorySegment createTranslationUnit(MemorySegment CIdx, MemorySegment ast_filename);
    int createTranslationUnit2(MemorySegment CIdx, MemorySegment ast_filename, MemorySegment out_TU);
    int defaultEditingTranslationUnitOptions();
    MemorySegment parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options);
    int parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU);
    int parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU);
    int defaultSaveOptions(MemorySegment TU);
    int saveTranslationUnit(MemorySegment TU, MemorySegment FileName, int options);
    int suspendTranslationUnit(MemorySegment $arg1);
    void disposeTranslationUnit(MemorySegment $arg1);
    int defaultReparseOptions(MemorySegment TU);
    int reparseTranslationUnit(MemorySegment TU, int num_unsaved_files, MemorySegment unsaved_files, int options);
    MemorySegment getTUResourceUsageName(int kind);
    CXTUResourceUsage getCXTUResourceUsage(SegmentAllocator $segmentAllocator, MemorySegment TU);
    void disposeCXTUResourceUsage(CXTUResourceUsage usage);
    MemorySegment getTranslationUnitTargetInfo(MemorySegment CTUnit);
    void TargetInfo_dispose(MemorySegment Info);
    CXString TargetInfo_getTriple(SegmentAllocator $segmentAllocator, MemorySegment Info);
    int TargetInfo_getPointerWidth(MemorySegment Info);
    CXCursor getNullCursor(SegmentAllocator $segmentAllocator);
    CXCursor getTranslationUnitCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    @Layout("int") boolean equalCursors(CXCursor $arg1, CXCursor $arg2);
    @Layout("int") boolean Cursor_isNull(CXCursor cursor);
    int hashCursor(CXCursor $arg1);
    int getCursorKind(CXCursor $arg1);
    @Layout("int") boolean isDeclaration(int $arg1);
    @Layout("int") boolean isInvalidDeclaration(CXCursor $arg1);
    @Layout("int") boolean isReference(int $arg1);
    @Layout("int") boolean isExpression(int $arg1);
    @Layout("int") boolean isStatement(int $arg1);
    @Layout("int") boolean isAttribute(int $arg1);
    @Layout("int") boolean Cursor_hasAttrs(CXCursor C);
    @Layout("int") boolean isInvalid(int $arg1);
    @Layout("int") boolean isTranslationUnit(int $arg1);
    @Layout("int") boolean isPreprocessing(int $arg1);
    @Layout("int") boolean isUnexposed(int $arg1);
    int getCursorLinkage(CXCursor cursor);
    int getCursorVisibility(CXCursor cursor);
    int getCursorAvailability(CXCursor cursor);
    int getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size);
    void disposeCXPlatformAvailability(MemorySegment availability);
    CXCursor Cursor_getVarDeclInitializer(SegmentAllocator $segmentAllocator, CXCursor cursor);
    @Layout("int") boolean Cursor_hasVarDeclGlobalStorage(CXCursor cursor);
    @Layout("int") boolean Cursor_hasVarDeclExternalStorage(CXCursor cursor);
    int getCursorLanguage(CXCursor cursor);
    int getCursorTLSKind(CXCursor cursor);
    MemorySegment Cursor_getTranslationUnit(CXCursor $arg1);
    MemorySegment createCXCursorSet();
    void disposeCXCursorSet(MemorySegment cset);
    @Layout("int") boolean CXCursorSet_contains(MemorySegment cset, CXCursor cursor);
    @Layout("int") boolean CXCursorSet_insert(MemorySegment cset, CXCursor cursor);
    CXCursor getCursorSemanticParent(SegmentAllocator $segmentAllocator, CXCursor cursor);
    CXCursor getCursorLexicalParent(SegmentAllocator $segmentAllocator, CXCursor cursor);
    void getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden);
    void disposeOverriddenCursors(MemorySegment overridden);
    MemorySegment getIncludedFile(CXCursor cursor);
    CXCursor getCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2);
    CXSourceLocation getCursorLocation(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange getCursorExtent(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXType getCursorType(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString getTypeSpelling(SegmentAllocator $segmentAllocator, CXType CT);
    CXType getTypedefDeclUnderlyingType(SegmentAllocator $segmentAllocator, CXCursor C);
    CXType getEnumDeclIntegerType(SegmentAllocator $segmentAllocator, CXCursor C);
    long getEnumConstantDeclValue(CXCursor C);
    long getEnumConstantDeclUnsignedValue(CXCursor C);
    @Layout("int") boolean Cursor_isBitField(CXCursor C);
    int getFieldDeclBitWidth(CXCursor C);
    int Cursor_getNumArguments(CXCursor C);
    CXCursor Cursor_getArgument(SegmentAllocator $segmentAllocator, CXCursor C, int i);
    int Cursor_getNumTemplateArguments(CXCursor C);
    int Cursor_getTemplateArgumentKind(CXCursor C, int I);
    CXType Cursor_getTemplateArgumentType(SegmentAllocator $segmentAllocator, CXCursor C, int I);
    long Cursor_getTemplateArgumentValue(CXCursor C, int I);
    long Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I);
    @Layout("int") boolean equalTypes(CXType A, CXType B);
    CXType getCanonicalType(SegmentAllocator $segmentAllocator, CXType T);
    @Layout("int") boolean isConstQualifiedType(CXType T);
    @Layout("int") boolean Cursor_isMacroFunctionLike(CXCursor C);
    @Layout("int") boolean Cursor_isMacroBuiltin(CXCursor C);
    @Layout("int") boolean Cursor_isFunctionInlined(CXCursor C);
    @Layout("int") boolean isVolatileQualifiedType(CXType T);
    @Layout("int") boolean isRestrictQualifiedType(CXType T);
    int getAddressSpace(CXType T);
    CXString getTypedefName(SegmentAllocator $segmentAllocator, CXType CT);
    CXType getPointeeType(SegmentAllocator $segmentAllocator, CXType T);
    CXType getUnqualifiedType(SegmentAllocator $segmentAllocator, CXType CT);
    CXType getNonReferenceType(SegmentAllocator $segmentAllocator, CXType CT);
    CXCursor getTypeDeclaration(SegmentAllocator $segmentAllocator, CXType T);
    CXString getDeclObjCTypeEncoding(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Type_getObjCEncoding(SegmentAllocator $segmentAllocator, CXType type);
    CXString getTypeKindSpelling(SegmentAllocator $segmentAllocator, int K);
    int getFunctionTypeCallingConv(CXType T);
    CXType getResultType(SegmentAllocator $segmentAllocator, CXType T);
    int getExceptionSpecificationType(CXType T);
    int getNumArgTypes(CXType T);
    CXType getArgType(SegmentAllocator $segmentAllocator, CXType T, int i);
    CXType Type_getObjCObjectBaseType(SegmentAllocator $segmentAllocator, CXType T);
    int Type_getNumObjCProtocolRefs(CXType T);
    CXCursor Type_getObjCProtocolDecl(SegmentAllocator $segmentAllocator, CXType T, int i);
    int Type_getNumObjCTypeArgs(CXType T);
    CXType Type_getObjCTypeArg(SegmentAllocator $segmentAllocator, CXType T, int i);
    @Layout("int") boolean isFunctionTypeVariadic(CXType T);
    CXType getCursorResultType(SegmentAllocator $segmentAllocator, CXCursor C);
    int getCursorExceptionSpecificationType(CXCursor C);
    @Layout("int") boolean isPODType(CXType T);
    CXType getElementType(SegmentAllocator $segmentAllocator, CXType T);
    long getNumElements(CXType T);
    CXType getArrayElementType(SegmentAllocator $segmentAllocator, CXType T);
    long getArraySize(CXType T);
    CXType Type_getNamedType(SegmentAllocator $segmentAllocator, CXType T);
    @Layout("int") boolean Type_isTransparentTagTypedef(CXType T);
    int Type_getNullability(CXType T);
    long Type_getAlignOf(CXType T);
    CXType Type_getClassType(SegmentAllocator $segmentAllocator, CXType T);
    long Type_getSizeOf(CXType T);
    long Type_getOffsetOf(CXType T, MemorySegment S);
    CXType Type_getModifiedType(SegmentAllocator $segmentAllocator, CXType T);
    CXType Type_getValueType(SegmentAllocator $segmentAllocator, CXType CT);
    long Cursor_getOffsetOfField(CXCursor C);
    @Layout("int") boolean Cursor_isAnonymous(CXCursor C);
    @Layout("int") boolean Cursor_isAnonymousRecordDecl(CXCursor C);
    @Layout("int") boolean Cursor_isInlineNamespace(CXCursor C);
    int Type_getNumTemplateArguments(CXType T);
    CXType Type_getTemplateArgumentAsType(SegmentAllocator $segmentAllocator, CXType T, int i);
    int Type_getCXXRefQualifier(CXType T);
    @Layout("int") boolean isVirtualBase(CXCursor $arg1);
    long getOffsetOfBase(CXCursor Parent, CXCursor Base);
    int getCXXAccessSpecifier(CXCursor $arg1);
    int Cursor_getBinaryOpcode(CXCursor C);
    CXString Cursor_getBinaryOpcodeStr(SegmentAllocator $segmentAllocator, int Op);
    int Cursor_getStorageClass(CXCursor $arg1);
    int getNumOverloadedDecls(CXCursor cursor);
    CXCursor getOverloadedDecl(SegmentAllocator $segmentAllocator, CXCursor cursor, int index);
    CXType getIBOutletCollectionType(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data);
    int visitChildrenWithBlock(CXCursor parent, MemorySegment block);
    CXString getCursorUSR(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXString constructUSR_ObjCClass(SegmentAllocator $segmentAllocator, MemorySegment class_name);
    CXString constructUSR_ObjCCategory(SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name);
    CXString constructUSR_ObjCProtocol(SegmentAllocator $segmentAllocator, MemorySegment protocol_name);
    CXString constructUSR_ObjCIvar(SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR);
    CXString constructUSR_ObjCMethod(SegmentAllocator $segmentAllocator, MemorySegment name, @Layout("int") boolean isInstanceMethod, CXString classUSR);
    CXString constructUSR_ObjCProperty(SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR);
    CXString getCursorSpelling(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange Cursor_getSpellingNameRange(SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options);
    int PrintingPolicy_getProperty(MemorySegment Policy, int Property);
    void PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value);
    MemorySegment getCursorPrintingPolicy(CXCursor $arg1);
    void PrintingPolicy_dispose(MemorySegment Policy);
    CXString getCursorPrettyPrinted(SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy);
    CXString getTypePrettyPrinted(SegmentAllocator $segmentAllocator, CXType T, MemorySegment cxPolicy);
    CXString getFullyQualifiedName(SegmentAllocator $segmentAllocator, CXType CT, MemorySegment Policy, @Layout("int") boolean WithGlobalNsPrefix);
    CXString getCursorDisplayName(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor getCursorReferenced(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor getCursorDefinition(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    @Layout("int") boolean isCursorDefinition(CXCursor $arg1);
    CXCursor getCanonicalCursor(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int Cursor_getObjCSelectorIndex(CXCursor $arg1);
    @Layout("int") boolean Cursor_isDynamicCall(CXCursor C);
    CXType Cursor_getReceiverType(SegmentAllocator $segmentAllocator, CXCursor C);
    int Cursor_getObjCPropertyAttributes(CXCursor C, int reserved);
    CXString Cursor_getObjCPropertyGetterName(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getObjCPropertySetterName(SegmentAllocator $segmentAllocator, CXCursor C);
    int Cursor_getObjCDeclQualifiers(CXCursor C);
    @Layout("int") boolean Cursor_isObjCOptional(CXCursor C);
    @Layout("int") boolean Cursor_isVariadic(CXCursor C);
    @Layout("int") boolean Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated);
    CXSourceRange Cursor_getCommentRange(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getRawCommentText(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getBriefCommentText(SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getMangling(SegmentAllocator $segmentAllocator, CXCursor $arg1);
    MemorySegment Cursor_getCXXManglings(CXCursor $arg1);
    MemorySegment Cursor_getObjCManglings(CXCursor $arg1);
    MemorySegment Cursor_getModule(CXCursor C);
    MemorySegment getModuleForFile(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment Module_getASTFile(MemorySegment Module);
    MemorySegment Module_getParent(MemorySegment Module);
    CXString Module_getName(SegmentAllocator $segmentAllocator, MemorySegment Module);
    CXString Module_getFullName(SegmentAllocator $segmentAllocator, MemorySegment Module);
    @Layout("int") boolean Module_isSystem(MemorySegment Module);
    int Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module);
    MemorySegment Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index);
    @Layout("int") boolean CXXConstructor_isConvertingConstructor(CXCursor C);
    @Layout("int") boolean CXXConstructor_isCopyConstructor(CXCursor C);
    @Layout("int") boolean CXXConstructor_isDefaultConstructor(CXCursor C);
    @Layout("int") boolean CXXConstructor_isMoveConstructor(CXCursor C);
    @Layout("int") boolean CXXField_isMutable(CXCursor C);
    @Layout("int") boolean CXXMethod_isDefaulted(CXCursor C);
    @Layout("int") boolean CXXMethod_isDeleted(CXCursor C);
    @Layout("int") boolean CXXMethod_isPureVirtual(CXCursor C);
    @Layout("int") boolean CXXMethod_isStatic(CXCursor C);
    @Layout("int") boolean CXXMethod_isVirtual(CXCursor C);
    @Layout("int") boolean CXXMethod_isCopyAssignmentOperator(CXCursor C);
    @Layout("int") boolean CXXMethod_isMoveAssignmentOperator(CXCursor C);
    @Layout("int") boolean CXXMethod_isExplicit(CXCursor C);
    @Layout("int") boolean CXXRecord_isAbstract(CXCursor C);
    @Layout("int") boolean EnumDecl_isScoped(CXCursor C);
    @Layout("int") boolean CXXMethod_isConst(CXCursor C);
    int getTemplateCursorKind(CXCursor C);
    CXCursor getSpecializedCursorTemplate(SegmentAllocator $segmentAllocator, CXCursor C);
    CXSourceRange getCursorReferenceNameRange(SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex);
    MemorySegment getToken(MemorySegment TU, CXSourceLocation Location);
    int getTokenKind(CXToken $arg1);
    CXString getTokenSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceLocation getTokenLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceRange getTokenExtent(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    void tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens);
    void annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors);
    void disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens);
    CXString getCursorKindSpelling(SegmentAllocator $segmentAllocator, int Kind);
    void getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn);
    void enableStackTraces();
    void executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size);
    int getCompletionChunkKind(MemorySegment completion_string, int chunk_number);
    CXString getCompletionChunkText(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number);
    MemorySegment getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number);
    int getNumCompletionChunks(MemorySegment completion_string);
    int getCompletionPriority(MemorySegment completion_string);
    int getCompletionAvailability(MemorySegment completion_string);
    int getCompletionNumAnnotations(MemorySegment completion_string);
    CXString getCompletionAnnotation(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number);
    CXString getCompletionParent(SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind);
    CXString getCompletionBriefComment(SegmentAllocator $segmentAllocator, MemorySegment completion_string);
    MemorySegment getCursorCompletionString(CXCursor cursor);
    int getCompletionNumFixIts(MemorySegment results, int completion_index);
    CXString getCompletionFixIt(SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range);
    int defaultCodeCompleteOptions();
    MemorySegment codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options);
    void sortCodeCompletionResults(MemorySegment Results, int NumResults);
    void disposeCodeCompleteResults(MemorySegment Results);
    int codeCompleteGetNumDiagnostics(MemorySegment Results);
    MemorySegment codeCompleteGetDiagnostic(MemorySegment Results, int Index);
    long codeCompleteGetContexts(MemorySegment Results);
    int codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete);
    CXString codeCompleteGetContainerUSR(SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString codeCompleteGetObjCSelector(SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString getClangVersion(SegmentAllocator $segmentAllocator);
    void toggleCrashRecovery(@Layout("int") boolean isEnabled);
    void getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data);
    MemorySegment Cursor_Evaluate(CXCursor C);
    int EvalResult_getKind(MemorySegment E);
    int EvalResult_getAsInt(MemorySegment E);
    long EvalResult_getAsLongLong(MemorySegment E);
    @Layout("int") boolean EvalResult_isUnsignedInt(MemorySegment E);
    long EvalResult_getAsUnsigned(MemorySegment E);
    double EvalResult_getAsDouble(MemorySegment E);
    MemorySegment EvalResult_getAsStr(MemorySegment E);
    void EvalResult_dispose(MemorySegment E);
    int findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3);
    int findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3);
    @Layout("int") boolean index_isEntityObjCContainerKind(int $arg1);
    MemorySegment index_getObjCContainerDeclInfo(MemorySegment $arg1);
    MemorySegment index_getObjCInterfaceDeclInfo(MemorySegment $arg1);
    MemorySegment index_getObjCCategoryDeclInfo(MemorySegment $arg1);
    MemorySegment index_getObjCProtocolRefListInfo(MemorySegment $arg1);
    MemorySegment index_getObjCPropertyDeclInfo(MemorySegment $arg1);
    MemorySegment index_getIBOutletCollectionAttrInfo(MemorySegment $arg1);
    MemorySegment index_getCXXClassDeclInfo(MemorySegment $arg1);
    MemorySegment index_getClientContainer(MemorySegment $arg1);
    void index_setClientContainer(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment index_getClientEntity(MemorySegment $arg1);
    void index_setClientEntity(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment IndexAction_create(MemorySegment CIdx);
    void IndexAction_dispose(MemorySegment $arg1);
    int indexSourceFile(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options);
    int indexSourceFileFullArgv(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options);
    int indexTranslationUnit(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment $arg6);
    void indexLoc_getFileLocation(CXIdxLoc loc, MemorySegment indexFile, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    CXSourceLocation indexLoc_getCXSourceLocation(SegmentAllocator $segmentAllocator, CXIdxLoc loc);
    int Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data);
    int visitCXXBaseClasses(CXType T, MemorySegment visitor, MemorySegment client_data);
    int visitCXXMethods(CXType T, MemorySegment visitor, MemorySegment client_data);
    CXString getBinaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind);
    int getCursorBinaryOperatorKind(CXCursor cursor);
    CXString getUnaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind);
    int getCursorUnaryOperatorKind(CXCursor cursor);

    default Optional<String> retrieveString(CXString string)
    {
        MemorySegment cString = this.getCString(string);
        if (cString.equals(NULL))
        {
            return Optional.empty();
        }

        final String res = cString.getString(0);
        this.disposeString(string);
        return Optional.of(res).filter(Predicate.not(String::isEmpty));
    }

    default boolean isCursorAnonymous(CXCursor cursor)
    {
        if (this.getCursorKind(cursor) == CXCursor_FieldDecl)
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXType fieldType = this.getCursorType(arena, cursor);
                return this.isCursorAnonymous(getTypeDeclaration(arena, fieldType));
            }
        }

        return Cursor_isAnonymous(cursor);
    }

    default Optional<String> getCursorSpelling(CXCursor cursor)
    {
        if (this.isCursorAnonymous(cursor))
        {
            return Optional.empty();
        }

        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.getCursorSpelling(arena, cursor));
        }
    }

    default CXSourceLocation getCursorLocation(SegmentAllocator allocator, CXCursor cursor, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        CXSourceLocation location = this.getCursorLocation(allocator, cursor);
        this.getFileLocation(location, file, line, column, offset);
        return location;
    }

    default Optional<Path> getFilePath(MemorySegment file)
    {
        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.getFileName(arena, file))
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
            return this.retrieveString(this.getClangVersion(arena)).orElse("unknown");
        }
    }

    /// Do not use this function, use [#dumpDiagnostics(java.lang.foreign.MemorySegment, int, java.lang.StringBuilder)] instead.
    default boolean dumpDiagnostics(SegmentAllocator allocator, MemorySegment diagnostics, int options, StringBuilder clangReport)
    {
        boolean fail = false;
        for (int i = 0; i < this.getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diag = this.getDiagnosticInSet(diagnostics, i);
            retrieveString(this.formatDiagnostic(allocator, diag, options)).ifPresent(diagString ->
            {
                clangReport.append(System.lineSeparator());
                clangReport.append(diagString);
            });

            MemorySegment children = this.getChildDiagnostics(diag);
            fail |= this.getDiagnosticSeverity(diag) >= CXDiagnostic_Error;
            fail |= this.dumpDiagnostics(allocator, children, options, clangReport);
            this.disposeDiagnostic(diag);
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
