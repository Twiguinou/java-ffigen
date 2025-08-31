package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.dynload.Dispatcher;
import fr.kenlek.jpgen.api.dynload.DowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.Ignore;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.Redirect;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

import static fr.kenlek.jpgen.api.dynload.DowncallTransformer.*;

/// Targeted for llvm commit: 22/07/2025
/// To load libclang, it is highly advised to directly use [#load()] to prevent crashes.
@Redirect.Generic(@Redirect.Case("clang_$1"))
@Layout.Generic({
    @Layout.Case(target = boolean.class, layout = @Layout(value = "JAVA_INT", container = ValueLayout.class))
})
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

    private static LibClang load(DowncallDispatcher dispatcher)
    {
        return NativeProxies.instantiate(LibClang.class, dispatcher.compose(PUBLIC_GROUP_TRANSFORMER).compose(BOOL32_TRANSFORMER));
    }

    static LibClang load(SymbolLookup lookup, Linker linker)
    {
        return load(new LinkingDowncallDispatcher(lookup, linker));
    }

    static LibClang load(Arena arena)
    {
        return load(new LinkingDowncallDispatcher(libraryLookup(arena)));
    }

    static LibClang load()
    {
        return load(Arena.global());
    }

    static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursorKind.CXCursor_StructDecl || cursorKind == CXCursorKind.CXCursor_UnionDecl;
    }

    @Dispatcher
    DowncallDispatcher dispatcher();

    MemorySegment getCString(CXString string);
    void disposeString(CXString string);
    void disposeStringSet(MemorySegment set);
    long getBuildSessionTimestamp();
    MemorySegment VirtualFileOverlay_create(int options);
    int VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath);
    int VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, boolean caseSensitive);
    int VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void free(MemorySegment buffer);
    void VirtualFileOverlay_dispose(MemorySegment $arg1);
    MemorySegment ModuleMapDescriptor_create(int options);
    int ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name);
    int ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name);
    int ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size);
    void ModuleMapDescriptor_dispose(MemorySegment $arg1);
    CXString getFileName(@Ignore SegmentAllocator $segmentAllocator, MemorySegment SFile);
    long getFileTime(MemorySegment SFile);
    int getFileUniqueID(MemorySegment file, MemorySegment outID);
    boolean File_isEqual(MemorySegment file1, MemorySegment file2);
    CXString File_tryGetRealPathName(@Ignore SegmentAllocator $segmentAllocator, MemorySegment file);
    CXSourceLocation getNullLocation(@Ignore SegmentAllocator $segmentAllocator);
    boolean equalLocations(CXSourceLocation loc1, CXSourceLocation loc2);
    boolean Location_isInSystemHeader(CXSourceLocation location);
    boolean Location_isFromMainFile(CXSourceLocation location);
    CXSourceRange getNullRange(@Ignore SegmentAllocator $segmentAllocator);
    CXSourceRange getRange(@Ignore SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end);
    boolean equalRanges(CXSourceRange range1, CXSourceRange range2);
    boolean Range_isNull(CXSourceRange range);
    void getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column);
    void getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    void getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset);
    CXSourceLocation getRangeStart(@Ignore SegmentAllocator $segmentAllocator, CXSourceRange range);
    CXSourceLocation getRangeEnd(@Ignore SegmentAllocator $segmentAllocator, CXSourceRange range);
    void disposeSourceRangeList(MemorySegment ranges);
    int getNumDiagnosticsInSet(MemorySegment Diags);
    MemorySegment getDiagnosticInSet(MemorySegment Diags, int Index);
    MemorySegment loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString);
    void disposeDiagnosticSet(MemorySegment Diags);
    MemorySegment getChildDiagnostics(MemorySegment D);
    void disposeDiagnostic(MemorySegment Diagnostic);
    CXString formatDiagnostic(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options);
    int defaultDiagnosticDisplayOptions();
    int getDiagnosticSeverity(MemorySegment $arg1);
    CXSourceLocation getDiagnosticLocation(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString getDiagnosticSpelling(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    CXString getDiagnosticOption(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable);
    int getDiagnosticCategory(MemorySegment $arg1);
    CXString getDiagnosticCategoryName(@Ignore SegmentAllocator $segmentAllocator, int Category);
    CXString getDiagnosticCategoryText(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    int getDiagnosticNumRanges(MemorySegment $arg1);
    CXSourceRange getDiagnosticRange(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range);
    int getDiagnosticNumFixIts(MemorySegment Diagnostic);
    CXString getDiagnosticFixIt(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange);
    MemorySegment createIndex(boolean excludeDeclarationsFromPCH, boolean displayDiagnostics);
    void disposeIndex(MemorySegment index);
    void CXIndex_setGlobalOptions(MemorySegment $arg1, int options);
    int CXIndex_getGlobalOptions(MemorySegment $arg1);
    void CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path);
    boolean isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file);
    MemorySegment getFile(MemorySegment tu, MemorySegment file_name);
    MemorySegment getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size);
    CXSourceLocation getLocation(@Ignore SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column);
    CXSourceLocation getLocationForOffset(@Ignore SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset);
    MemorySegment getSkippedRanges(MemorySegment tu, MemorySegment file);
    MemorySegment getAllSkippedRanges(MemorySegment tu);
    int getNumDiagnostics(MemorySegment Unit);
    MemorySegment getDiagnostic(MemorySegment Unit, int Index);
    MemorySegment getDiagnosticSetFromTU(MemorySegment Unit);
    CXString getTranslationUnitSpelling(@Ignore SegmentAllocator $segmentAllocator, MemorySegment CTUnit);
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
    CXTUResourceUsage getCXTUResourceUsage(@Ignore SegmentAllocator $segmentAllocator, MemorySegment TU);
    void disposeCXTUResourceUsage(CXTUResourceUsage usage);
    MemorySegment getTranslationUnitTargetInfo(MemorySegment CTUnit);
    void TargetInfo_dispose(MemorySegment Info);
    CXString TargetInfo_getTriple(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Info);
    int TargetInfo_getPointerWidth(MemorySegment Info);
    CXCursor getNullCursor(@Ignore SegmentAllocator $segmentAllocator);
    CXCursor getTranslationUnitCursor(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1);
    boolean equalCursors(CXCursor $arg1, CXCursor $arg2);
    boolean Cursor_isNull(CXCursor cursor);
    int hashCursor(CXCursor $arg1);
    int getCursorKind(CXCursor $arg1);
    boolean isDeclaration(int $arg1);
    boolean isInvalidDeclaration(CXCursor $arg1);
    boolean isReference(int $arg1);
    boolean isExpression(int $arg1);
    boolean isStatement(int $arg1);
    boolean isAttribute(int $arg1);
    boolean Cursor_hasAttrs(CXCursor C);
    boolean isInvalid(int $arg1);
    boolean isTranslationUnit(int $arg1);
    boolean isPreprocessing(int $arg1);
    boolean isUnexposed(int $arg1);
    int getCursorLinkage(CXCursor cursor);
    int getCursorVisibility(CXCursor cursor);
    int getCursorAvailability(CXCursor cursor);
    int getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size);
    void disposeCXPlatformAvailability(MemorySegment availability);
    CXCursor Cursor_getVarDeclInitializer(@Ignore SegmentAllocator $segmentAllocator, CXCursor cursor);
    boolean Cursor_hasVarDeclGlobalStorage(CXCursor cursor);
    boolean Cursor_hasVarDeclExternalStorage(CXCursor cursor);
    int getCursorLanguage(CXCursor cursor);
    int getCursorTLSKind(CXCursor cursor);
    MemorySegment Cursor_getTranslationUnit(CXCursor $arg1);
    MemorySegment createCXCursorSet();
    void disposeCXCursorSet(MemorySegment cset);
    boolean CXCursorSet_contains(MemorySegment cset, CXCursor cursor);
    boolean CXCursorSet_insert(MemorySegment cset, CXCursor cursor);
    CXCursor getCursorSemanticParent(@Ignore SegmentAllocator $segmentAllocator, CXCursor cursor);
    CXCursor getCursorLexicalParent(@Ignore SegmentAllocator $segmentAllocator, CXCursor cursor);
    void getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden);
    void disposeOverriddenCursors(MemorySegment overridden);
    MemorySegment getIncludedFile(CXCursor cursor);
    CXCursor getCursor(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2);
    CXSourceLocation getCursorLocation(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange getCursorExtent(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXType getCursorType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString getTypeSpelling(@Ignore SegmentAllocator $segmentAllocator, CXType CT);
    CXType getTypedefDeclUnderlyingType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXType getEnumDeclIntegerType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    long getEnumConstantDeclValue(CXCursor C);
    long getEnumConstantDeclUnsignedValue(CXCursor C);
    boolean Cursor_isBitField(CXCursor C);
    int getFieldDeclBitWidth(CXCursor C);
    int Cursor_getNumArguments(CXCursor C);
    CXCursor Cursor_getArgument(@Ignore SegmentAllocator $segmentAllocator, CXCursor C, int i);
    int Cursor_getNumTemplateArguments(CXCursor C);
    int Cursor_getTemplateArgumentKind(CXCursor C, int I);
    CXType Cursor_getTemplateArgumentType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C, int I);
    long Cursor_getTemplateArgumentValue(CXCursor C, int I);
    long Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I);
    boolean equalTypes(CXType A, CXType B);
    CXType getCanonicalType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    boolean isConstQualifiedType(CXType T);
    boolean Cursor_isMacroFunctionLike(CXCursor C);
    boolean Cursor_isMacroBuiltin(CXCursor C);
    boolean Cursor_isFunctionInlined(CXCursor C);
    boolean isVolatileQualifiedType(CXType T);
    boolean isRestrictQualifiedType(CXType T);
    int getAddressSpace(CXType T);
    CXString getTypedefName(@Ignore SegmentAllocator $segmentAllocator, CXType CT);
    CXType getPointeeType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    CXType getUnqualifiedType(@Ignore SegmentAllocator $segmentAllocator, CXType CT);
    CXType getNonReferenceType(@Ignore SegmentAllocator $segmentAllocator, CXType CT);
    CXCursor getTypeDeclaration(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    CXString getDeclObjCTypeEncoding(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Type_getObjCEncoding(@Ignore SegmentAllocator $segmentAllocator, CXType type);
    CXString getTypeKindSpelling(@Ignore SegmentAllocator $segmentAllocator, int K);
    int getFunctionTypeCallingConv(CXType T);
    CXType getResultType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    int getExceptionSpecificationType(CXType T);
    int getNumArgTypes(CXType T);
    CXType getArgType(@Ignore SegmentAllocator $segmentAllocator, CXType T, int i);
    CXType Type_getObjCObjectBaseType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    int Type_getNumObjCProtocolRefs(CXType T);
    CXCursor Type_getObjCProtocolDecl(@Ignore SegmentAllocator $segmentAllocator, CXType T, int i);
    int Type_getNumObjCTypeArgs(CXType T);
    CXType Type_getObjCTypeArg(@Ignore SegmentAllocator $segmentAllocator, CXType T, int i);
    boolean isFunctionTypeVariadic(CXType T);
    CXType getCursorResultType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    int getCursorExceptionSpecificationType(CXCursor C);
    boolean isPODType(CXType T);
    CXType getElementType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    long getNumElements(CXType T);
    CXType getArrayElementType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    long getArraySize(CXType T);
    CXType Type_getNamedType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    boolean Type_isTransparentTagTypedef(CXType T);
    int Type_getNullability(CXType T);
    long Type_getAlignOf(CXType T);
    CXType Type_getClassType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    long Type_getSizeOf(CXType T);
    long Type_getOffsetOf(CXType T, MemorySegment S);
    CXType Type_getModifiedType(@Ignore SegmentAllocator $segmentAllocator, CXType T);
    CXType Type_getValueType(@Ignore SegmentAllocator $segmentAllocator, CXType CT);
    long Cursor_getOffsetOfField(CXCursor C);
    boolean Cursor_isAnonymous(CXCursor C);
    boolean Cursor_isAnonymousRecordDecl(CXCursor C);
    boolean Cursor_isInlineNamespace(CXCursor C);
    int Type_getNumTemplateArguments(CXType T);
    CXType Type_getTemplateArgumentAsType(@Ignore SegmentAllocator $segmentAllocator, CXType T, int i);
    int Type_getCXXRefQualifier(CXType T);
    boolean isVirtualBase(CXCursor $arg1);
    long getOffsetOfBase(CXCursor Parent, CXCursor Base);
    int getCXXAccessSpecifier(CXCursor $arg1);
    int Cursor_getBinaryOpcode(CXCursor C);
    CXString Cursor_getBinaryOpcodeStr(@Ignore SegmentAllocator $segmentAllocator, int Op);
    int Cursor_getStorageClass(CXCursor $arg1);
    int getNumOverloadedDecls(CXCursor cursor);
    CXCursor getOverloadedDecl(@Ignore SegmentAllocator $segmentAllocator, CXCursor cursor, int index);
    CXType getIBOutletCollectionType(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data);
    int visitChildrenWithBlock(CXCursor parent, MemorySegment block);
    CXString getCursorUSR(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXString constructUSR_ObjCClass(@Ignore SegmentAllocator $segmentAllocator, MemorySegment class_name);
    CXString constructUSR_ObjCCategory(@Ignore SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name);
    CXString constructUSR_ObjCProtocol(@Ignore SegmentAllocator $segmentAllocator, MemorySegment protocol_name);
    CXString constructUSR_ObjCIvar(@Ignore SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR);
    CXString constructUSR_ObjCMethod(@Ignore SegmentAllocator $segmentAllocator, MemorySegment name, boolean isInstanceMethod, CXString classUSR);
    CXString constructUSR_ObjCProperty(@Ignore SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR);
    CXString getCursorSpelling(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXSourceRange Cursor_getSpellingNameRange(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options);
    int PrintingPolicy_getProperty(MemorySegment Policy, int Property);
    void PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value);
    MemorySegment getCursorPrintingPolicy(CXCursor $arg1);
    void PrintingPolicy_dispose(MemorySegment Policy);
    CXString getCursorPrettyPrinted(@Ignore SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy);
    CXString getTypePrettyPrinted(@Ignore SegmentAllocator $segmentAllocator, CXType T, MemorySegment cxPolicy);
    CXString getFullyQualifiedName(@Ignore SegmentAllocator $segmentAllocator, CXType CT, MemorySegment Policy, boolean WithGlobalNsPrefix);
    CXString getCursorDisplayName(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor getCursorReferenced(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    CXCursor getCursorDefinition(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    boolean isCursorDefinition(CXCursor $arg1);
    CXCursor getCanonicalCursor(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    int Cursor_getObjCSelectorIndex(CXCursor $arg1);
    boolean Cursor_isDynamicCall(CXCursor C);
    CXType Cursor_getReceiverType(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    int Cursor_getObjCPropertyAttributes(CXCursor C, int reserved);
    CXString Cursor_getObjCPropertyGetterName(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getObjCPropertySetterName(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    int Cursor_getObjCDeclQualifiers(CXCursor C);
    boolean Cursor_isObjCOptional(CXCursor C);
    boolean Cursor_isVariadic(CXCursor C);
    boolean Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated);
    CXSourceRange Cursor_getCommentRange(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getRawCommentText(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getBriefCommentText(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXString Cursor_getMangling(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    MemorySegment Cursor_getCXXManglings(CXCursor $arg1);
    MemorySegment Cursor_getObjCManglings(CXCursor $arg1);
    CXString Cursor_getGCCAssemblyTemplate(@Ignore SegmentAllocator $segmentAllocator, CXCursor $arg1);
    boolean Cursor_isGCCAssemblyHasGoto(CXCursor $arg1);
    int Cursor_getGCCAssemblyNumOutputs(CXCursor $arg1);
    int Cursor_getGCCAssemblyNumInputs(CXCursor $arg1);
    int Cursor_getGCCAssemblyInput(CXCursor Cursor, int Index, MemorySegment Constraint, MemorySegment Expr);
    int Cursor_getGCCAssemblyOutput(CXCursor Cursor, int Index, MemorySegment Constraint, MemorySegment Expr);
    int Cursor_getGCCAssemblyNumClobbers(CXCursor Cursor);
    int Cursor_getGCCAssemblyClobber(CXCursor Cursor, int Index);
    boolean Cursor_isGCCAssemblyVolatile(CXCursor Cursor);
    MemorySegment Cursor_getModule(CXCursor C);
    MemorySegment getModuleForFile(MemorySegment $arg1, MemorySegment $arg2);
    MemorySegment Module_getASTFile(MemorySegment Module);
    MemorySegment Module_getParent(MemorySegment Module);
    CXString Module_getName(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Module);
    CXString Module_getFullName(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Module);
    boolean Module_isSystem(MemorySegment Module);
    int Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module);
    MemorySegment Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index);
    boolean CXXConstructor_isConvertingConstructor(CXCursor C);
    boolean CXXConstructor_isCopyConstructor(CXCursor C);
    boolean CXXConstructor_isDefaultConstructor(CXCursor C);
    boolean CXXConstructor_isMoveConstructor(CXCursor C);
    boolean CXXField_isMutable(CXCursor C);
    boolean CXXMethod_isDefaulted(CXCursor C);
    boolean CXXMethod_isDeleted(CXCursor C);
    boolean CXXMethod_isPureVirtual(CXCursor C);
    boolean CXXMethod_isStatic(CXCursor C);
    boolean CXXMethod_isVirtual(CXCursor C);
    boolean CXXMethod_isCopyAssignmentOperator(CXCursor C);
    boolean CXXMethod_isMoveAssignmentOperator(CXCursor C);
    boolean CXXMethod_isExplicit(CXCursor C);
    boolean CXXRecord_isAbstract(CXCursor C);
    boolean EnumDecl_isScoped(CXCursor C);
    boolean CXXMethod_isConst(CXCursor C);
    int getTemplateCursorKind(CXCursor C);
    CXCursor getSpecializedCursorTemplate(@Ignore SegmentAllocator $segmentAllocator, CXCursor C);
    CXSourceRange getCursorReferenceNameRange(@Ignore SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex);
    MemorySegment getToken(MemorySegment TU, CXSourceLocation Location);
    int getTokenKind(CXToken $arg1);
    CXString getTokenSpelling(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceLocation getTokenLocation(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    CXSourceRange getTokenExtent(@Ignore SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2);
    void tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens);
    void annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors);
    void disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens);
    CXString getCursorKindSpelling(@Ignore SegmentAllocator $segmentAllocator, int Kind);
    void getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn);
    void enableStackTraces();
    void executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size);
    int getCompletionChunkKind(MemorySegment completion_string, int chunk_number);
    CXString getCompletionChunkText(@Ignore SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number);
    MemorySegment getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number);
    int getNumCompletionChunks(MemorySegment completion_string);
    int getCompletionPriority(MemorySegment completion_string);
    int getCompletionAvailability(MemorySegment completion_string);
    int getCompletionNumAnnotations(MemorySegment completion_string);
    CXString getCompletionAnnotation(@Ignore SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number);
    CXString getCompletionParent(@Ignore SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind);
    CXString getCompletionBriefComment(@Ignore SegmentAllocator $segmentAllocator, MemorySegment completion_string);
    MemorySegment getCursorCompletionString(CXCursor cursor);
    int getCompletionNumFixIts(MemorySegment results, int completion_index);
    CXString getCompletionFixIt(@Ignore SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range);
    int defaultCodeCompleteOptions();
    MemorySegment codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options);
    void sortCodeCompletionResults(MemorySegment Results, int NumResults);
    void disposeCodeCompleteResults(MemorySegment Results);
    int codeCompleteGetNumDiagnostics(MemorySegment Results);
    MemorySegment codeCompleteGetDiagnostic(MemorySegment Results, int Index);
    long codeCompleteGetContexts(MemorySegment Results);
    int codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete);
    CXString codeCompleteGetContainerUSR(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString codeCompleteGetObjCSelector(@Ignore SegmentAllocator $segmentAllocator, MemorySegment Results);
    CXString getClangVersion(@Ignore SegmentAllocator $segmentAllocator);
    void toggleCrashRecovery(boolean isEnabled);
    void getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data);
    MemorySegment Cursor_Evaluate(CXCursor C);
    int EvalResult_getKind(MemorySegment E);
    int EvalResult_getAsInt(MemorySegment E);
    long EvalResult_getAsLongLong(MemorySegment E);
    boolean EvalResult_isUnsignedInt(MemorySegment E);
    long EvalResult_getAsUnsigned(MemorySegment E);
    double EvalResult_getAsDouble(MemorySegment E);
    MemorySegment EvalResult_getAsStr(MemorySegment E);
    void EvalResult_dispose(MemorySegment E);
    int findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor);
    int findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3);
    int findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3);
    boolean index_isEntityObjCContainerKind(int $arg1);
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
    CXSourceLocation indexLoc_getCXSourceLocation(@Ignore SegmentAllocator $segmentAllocator, CXIdxLoc loc);
    int Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data);
    int visitCXXBaseClasses(CXType T, MemorySegment visitor, MemorySegment client_data);
    int visitCXXMethods(CXType T, MemorySegment visitor, MemorySegment client_data);
    CXString getBinaryOperatorKindSpelling(@Ignore SegmentAllocator $segmentAllocator, int kind);
    int getCursorBinaryOperatorKind(CXCursor cursor);
    CXString getUnaryOperatorKindSpelling(@Ignore SegmentAllocator $segmentAllocator, int kind);
    int getCursorUnaryOperatorKind(CXCursor cursor);
    MemorySegment getRemappings(MemorySegment $arg1);
    MemorySegment getRemappingsFromFileList(MemorySegment $arg1, int $arg2);
    int remap_getNumFiles(MemorySegment $arg1);
    void remap_getFilenames(MemorySegment $arg1, int $arg2, MemorySegment $arg3, MemorySegment $arg4);
    void remap_dispose(MemorySegment $arg1);

    default String retrieveString(CXString string)
    {
        try
        {
            return this.getCString(string).reinterpret(Long.MAX_VALUE).getString(0);
        }
        finally
        {
            this.disposeString(string);
        }
    }

    default String getClangVersion()
    {
        try (Arena arena = Arena.ofConfined())
        {
            return this.retrieveString(this.getClangVersion(arena));
        }
    }
}
