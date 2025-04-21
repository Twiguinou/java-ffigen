package fr.kenlek.jpgen.clang;

import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static java.util.Objects.requireNonNull;

final class UpfrontIndex_h implements Index_h
{
    public final @Nullable MethodHandle clang_getCString;
    public final @Nullable MethodHandle clang_disposeString;
    public final @Nullable MethodHandle clang_disposeStringSet;
    public final @Nullable MethodHandle clang_getBuildSessionTimestamp;
    public final @Nullable MethodHandle clang_VirtualFileOverlay_create;
    public final @Nullable MethodHandle clang_VirtualFileOverlay_addFileMapping;
    public final @Nullable MethodHandle clang_VirtualFileOverlay_setCaseSensitivity;
    public final @Nullable MethodHandle clang_VirtualFileOverlay_writeToBuffer;
    public final @Nullable MethodHandle clang_free;
    public final @Nullable MethodHandle clang_VirtualFileOverlay_dispose;
    public final @Nullable MethodHandle clang_ModuleMapDescriptor_create;
    public final @Nullable MethodHandle clang_ModuleMapDescriptor_setFrameworkModuleName;
    public final @Nullable MethodHandle clang_ModuleMapDescriptor_setUmbrellaHeader;
    public final @Nullable MethodHandle clang_ModuleMapDescriptor_writeToBuffer;
    public final @Nullable MethodHandle clang_ModuleMapDescriptor_dispose;
    public final @Nullable MethodHandle clang_getFileName;
    public final @Nullable MethodHandle clang_getFileTime;
    public final @Nullable MethodHandle clang_getFileUniqueID;
    public final @Nullable MethodHandle clang_File_isEqual;
    public final @Nullable MethodHandle clang_File_tryGetRealPathName;
    public final @Nullable MethodHandle clang_getNullLocation;
    public final @Nullable MethodHandle clang_equalLocations;
    public final @Nullable MethodHandle clang_Location_isInSystemHeader;
    public final @Nullable MethodHandle clang_Location_isFromMainFile;
    public final @Nullable MethodHandle clang_getNullRange;
    public final @Nullable MethodHandle clang_getRange;
    public final @Nullable MethodHandle clang_equalRanges;
    public final @Nullable MethodHandle clang_Range_isNull;
    public final @Nullable MethodHandle clang_getExpansionLocation;
    public final @Nullable MethodHandle clang_getPresumedLocation;
    public final @Nullable MethodHandle clang_getInstantiationLocation;
    public final @Nullable MethodHandle clang_getSpellingLocation;
    public final @Nullable MethodHandle clang_getFileLocation;
    public final @Nullable MethodHandle clang_getRangeStart;
    public final @Nullable MethodHandle clang_getRangeEnd;
    public final @Nullable MethodHandle clang_disposeSourceRangeList;
    public final @Nullable MethodHandle clang_getNumDiagnosticsInSet;
    public final @Nullable MethodHandle clang_getDiagnosticInSet;
    public final @Nullable MethodHandle clang_loadDiagnostics;
    public final @Nullable MethodHandle clang_disposeDiagnosticSet;
    public final @Nullable MethodHandle clang_getChildDiagnostics;
    public final @Nullable MethodHandle clang_disposeDiagnostic;
    public final @Nullable MethodHandle clang_formatDiagnostic;
    public final @Nullable MethodHandle clang_defaultDiagnosticDisplayOptions;
    public final @Nullable MethodHandle clang_getDiagnosticSeverity;
    public final @Nullable MethodHandle clang_getDiagnosticLocation;
    public final @Nullable MethodHandle clang_getDiagnosticSpelling;
    public final @Nullable MethodHandle clang_getDiagnosticOption;
    public final @Nullable MethodHandle clang_getDiagnosticCategory;
    public final @Nullable MethodHandle clang_getDiagnosticCategoryName;
    public final @Nullable MethodHandle clang_getDiagnosticCategoryText;
    public final @Nullable MethodHandle clang_getDiagnosticNumRanges;
    public final @Nullable MethodHandle clang_getDiagnosticRange;
    public final @Nullable MethodHandle clang_getDiagnosticNumFixIts;
    public final @Nullable MethodHandle clang_getDiagnosticFixIt;
    public final @Nullable MethodHandle clang_createIndex;
    public final @Nullable MethodHandle clang_disposeIndex;
    public final @Nullable MethodHandle clang_CXIndex_setGlobalOptions;
    public final @Nullable MethodHandle clang_CXIndex_getGlobalOptions;
    public final @Nullable MethodHandle clang_CXIndex_setInvocationEmissionPathOption;
    public final @Nullable MethodHandle clang_isFileMultipleIncludeGuarded;
    public final @Nullable MethodHandle clang_getFile;
    public final @Nullable MethodHandle clang_getFileContents;
    public final @Nullable MethodHandle clang_getLocation;
    public final @Nullable MethodHandle clang_getLocationForOffset;
    public final @Nullable MethodHandle clang_getSkippedRanges;
    public final @Nullable MethodHandle clang_getAllSkippedRanges;
    public final @Nullable MethodHandle clang_getNumDiagnostics;
    public final @Nullable MethodHandle clang_getDiagnostic;
    public final @Nullable MethodHandle clang_getDiagnosticSetFromTU;
    public final @Nullable MethodHandle clang_getTranslationUnitSpelling;
    public final @Nullable MethodHandle clang_createTranslationUnitFromSourceFile;
    public final @Nullable MethodHandle clang_createTranslationUnit;
    public final @Nullable MethodHandle clang_createTranslationUnit2;
    public final @Nullable MethodHandle clang_defaultEditingTranslationUnitOptions;
    public final @Nullable MethodHandle clang_parseTranslationUnit;
    public final @Nullable MethodHandle clang_parseTranslationUnit2;
    public final @Nullable MethodHandle clang_parseTranslationUnit2FullArgv;
    public final @Nullable MethodHandle clang_defaultSaveOptions;
    public final @Nullable MethodHandle clang_saveTranslationUnit;
    public final @Nullable MethodHandle clang_suspendTranslationUnit;
    public final @Nullable MethodHandle clang_disposeTranslationUnit;
    public final @Nullable MethodHandle clang_defaultReparseOptions;
    public final @Nullable MethodHandle clang_reparseTranslationUnit;
    public final @Nullable MethodHandle clang_getTUResourceUsageName;
    public final @Nullable MethodHandle clang_getCXTUResourceUsage;
    public final @Nullable MethodHandle clang_disposeCXTUResourceUsage;
    public final @Nullable MethodHandle clang_getTranslationUnitTargetInfo;
    public final @Nullable MethodHandle clang_TargetInfo_dispose;
    public final @Nullable MethodHandle clang_TargetInfo_getTriple;
    public final @Nullable MethodHandle clang_TargetInfo_getPointerWidth;
    public final @Nullable MethodHandle clang_getNullCursor;
    public final @Nullable MethodHandle clang_getTranslationUnitCursor;
    public final @Nullable MethodHandle clang_equalCursors;
    public final @Nullable MethodHandle clang_Cursor_isNull;
    public final @Nullable MethodHandle clang_hashCursor;
    public final @Nullable MethodHandle clang_getCursorKind;
    public final @Nullable MethodHandle clang_isDeclaration;
    public final @Nullable MethodHandle clang_isInvalidDeclaration;
    public final @Nullable MethodHandle clang_isReference;
    public final @Nullable MethodHandle clang_isExpression;
    public final @Nullable MethodHandle clang_isStatement;
    public final @Nullable MethodHandle clang_isAttribute;
    public final @Nullable MethodHandle clang_Cursor_hasAttrs;
    public final @Nullable MethodHandle clang_isInvalid;
    public final @Nullable MethodHandle clang_isTranslationUnit;
    public final @Nullable MethodHandle clang_isPreprocessing;
    public final @Nullable MethodHandle clang_isUnexposed;
    public final @Nullable MethodHandle clang_getCursorLinkage;
    public final @Nullable MethodHandle clang_getCursorVisibility;
    public final @Nullable MethodHandle clang_getCursorAvailability;
    public final @Nullable MethodHandle clang_getCursorPlatformAvailability;
    public final @Nullable MethodHandle clang_disposeCXPlatformAvailability;
    public final @Nullable MethodHandle clang_Cursor_getVarDeclInitializer;
    public final @Nullable MethodHandle clang_Cursor_hasVarDeclGlobalStorage;
    public final @Nullable MethodHandle clang_Cursor_hasVarDeclExternalStorage;
    public final @Nullable MethodHandle clang_getCursorLanguage;
    public final @Nullable MethodHandle clang_getCursorTLSKind;
    public final @Nullable MethodHandle clang_Cursor_getTranslationUnit;
    public final @Nullable MethodHandle clang_createCXCursorSet;
    public final @Nullable MethodHandle clang_disposeCXCursorSet;
    public final @Nullable MethodHandle clang_CXCursorSet_contains;
    public final @Nullable MethodHandle clang_CXCursorSet_insert;
    public final @Nullable MethodHandle clang_getCursorSemanticParent;
    public final @Nullable MethodHandle clang_getCursorLexicalParent;
    public final @Nullable MethodHandle clang_getOverriddenCursors;
    public final @Nullable MethodHandle clang_disposeOverriddenCursors;
    public final @Nullable MethodHandle clang_getIncludedFile;
    public final @Nullable MethodHandle clang_getCursor;
    public final @Nullable MethodHandle clang_getCursorLocation;
    public final @Nullable MethodHandle clang_getCursorExtent;
    public final @Nullable MethodHandle clang_getCursorType;
    public final @Nullable MethodHandle clang_getTypeSpelling;
    public final @Nullable MethodHandle clang_getTypedefDeclUnderlyingType;
    public final @Nullable MethodHandle clang_getEnumDeclIntegerType;
    public final @Nullable MethodHandle clang_getEnumConstantDeclValue;
    public final @Nullable MethodHandle clang_getEnumConstantDeclUnsignedValue;
    public final @Nullable MethodHandle clang_Cursor_isBitField;
    public final @Nullable MethodHandle clang_getFieldDeclBitWidth;
    public final @Nullable MethodHandle clang_Cursor_getNumArguments;
    public final @Nullable MethodHandle clang_Cursor_getArgument;
    public final @Nullable MethodHandle clang_Cursor_getNumTemplateArguments;
    public final @Nullable MethodHandle clang_Cursor_getTemplateArgumentKind;
    public final @Nullable MethodHandle clang_Cursor_getTemplateArgumentType;
    public final @Nullable MethodHandle clang_Cursor_getTemplateArgumentValue;
    public final @Nullable MethodHandle clang_Cursor_getTemplateArgumentUnsignedValue;
    public final @Nullable MethodHandle clang_equalTypes;
    public final @Nullable MethodHandle clang_getCanonicalType;
    public final @Nullable MethodHandle clang_isConstQualifiedType;
    public final @Nullable MethodHandle clang_Cursor_isMacroFunctionLike;
    public final @Nullable MethodHandle clang_Cursor_isMacroBuiltin;
    public final @Nullable MethodHandle clang_Cursor_isFunctionInlined;
    public final @Nullable MethodHandle clang_isVolatileQualifiedType;
    public final @Nullable MethodHandle clang_isRestrictQualifiedType;
    public final @Nullable MethodHandle clang_getAddressSpace;
    public final @Nullable MethodHandle clang_getTypedefName;
    public final @Nullable MethodHandle clang_getPointeeType;
    public final @Nullable MethodHandle clang_getUnqualifiedType;
    public final @Nullable MethodHandle clang_getNonReferenceType;
    public final @Nullable MethodHandle clang_getTypeDeclaration;
    public final @Nullable MethodHandle clang_getDeclObjCTypeEncoding;
    public final @Nullable MethodHandle clang_Type_getObjCEncoding;
    public final @Nullable MethodHandle clang_getTypeKindSpelling;
    public final @Nullable MethodHandle clang_getFunctionTypeCallingConv;
    public final @Nullable MethodHandle clang_getResultType;
    public final @Nullable MethodHandle clang_getExceptionSpecificationType;
    public final @Nullable MethodHandle clang_getNumArgTypes;
    public final @Nullable MethodHandle clang_getArgType;
    public final @Nullable MethodHandle clang_Type_getObjCObjectBaseType;
    public final @Nullable MethodHandle clang_Type_getNumObjCProtocolRefs;
    public final @Nullable MethodHandle clang_Type_getObjCProtocolDecl;
    public final @Nullable MethodHandle clang_Type_getNumObjCTypeArgs;
    public final @Nullable MethodHandle clang_Type_getObjCTypeArg;
    public final @Nullable MethodHandle clang_isFunctionTypeVariadic;
    public final @Nullable MethodHandle clang_getCursorResultType;
    public final @Nullable MethodHandle clang_getCursorExceptionSpecificationType;
    public final @Nullable MethodHandle clang_isPODType;
    public final @Nullable MethodHandle clang_getElementType;
    public final @Nullable MethodHandle clang_getNumElements;
    public final @Nullable MethodHandle clang_getArrayElementType;
    public final @Nullable MethodHandle clang_getArraySize;
    public final @Nullable MethodHandle clang_Type_getNamedType;
    public final @Nullable MethodHandle clang_Type_isTransparentTagTypedef;
    public final @Nullable MethodHandle clang_Type_getNullability;
    public final @Nullable MethodHandle clang_Type_getAlignOf;
    public final @Nullable MethodHandle clang_Type_getClassType;
    public final @Nullable MethodHandle clang_Type_getSizeOf;
    public final @Nullable MethodHandle clang_Type_getOffsetOf;
    public final @Nullable MethodHandle clang_Type_getModifiedType;
    public final @Nullable MethodHandle clang_Type_getValueType;
    public final @Nullable MethodHandle clang_Cursor_getOffsetOfField;
    public final @Nullable MethodHandle clang_Cursor_isAnonymous;
    public final @Nullable MethodHandle clang_Cursor_isAnonymousRecordDecl;
    public final @Nullable MethodHandle clang_Cursor_isInlineNamespace;
    public final @Nullable MethodHandle clang_Type_getNumTemplateArguments;
    public final @Nullable MethodHandle clang_Type_getTemplateArgumentAsType;
    public final @Nullable MethodHandle clang_Type_getCXXRefQualifier;
    public final @Nullable MethodHandle clang_isVirtualBase;
    public final @Nullable MethodHandle clang_getOffsetOfBase;
    public final @Nullable MethodHandle clang_getCXXAccessSpecifier;
    public final @Nullable MethodHandle clang_Cursor_getBinaryOpcode;
    public final @Nullable MethodHandle clang_Cursor_getBinaryOpcodeStr;
    public final @Nullable MethodHandle clang_Cursor_getStorageClass;
    public final @Nullable MethodHandle clang_getNumOverloadedDecls;
    public final @Nullable MethodHandle clang_getOverloadedDecl;
    public final @Nullable MethodHandle clang_getIBOutletCollectionType;
    public final @Nullable MethodHandle clang_visitChildren;
    public final @Nullable MethodHandle clang_visitChildrenWithBlock;
    public final @Nullable MethodHandle clang_getCursorUSR;
    public final @Nullable MethodHandle clang_constructUSR_ObjCClass;
    public final @Nullable MethodHandle clang_constructUSR_ObjCCategory;
    public final @Nullable MethodHandle clang_constructUSR_ObjCProtocol;
    public final @Nullable MethodHandle clang_constructUSR_ObjCIvar;
    public final @Nullable MethodHandle clang_constructUSR_ObjCMethod;
    public final @Nullable MethodHandle clang_constructUSR_ObjCProperty;
    public final @Nullable MethodHandle clang_getCursorSpelling;
    public final @Nullable MethodHandle clang_Cursor_getSpellingNameRange;
    public final @Nullable MethodHandle clang_PrintingPolicy_getProperty;
    public final @Nullable MethodHandle clang_PrintingPolicy_setProperty;
    public final @Nullable MethodHandle clang_getCursorPrintingPolicy;
    public final @Nullable MethodHandle clang_PrintingPolicy_dispose;
    public final @Nullable MethodHandle clang_getCursorPrettyPrinted;
    public final @Nullable MethodHandle clang_getTypePrettyPrinted;
    public final @Nullable MethodHandle clang_getFullyQualifiedName;
    public final @Nullable MethodHandle clang_getCursorDisplayName;
    public final @Nullable MethodHandle clang_getCursorReferenced;
    public final @Nullable MethodHandle clang_getCursorDefinition;
    public final @Nullable MethodHandle clang_isCursorDefinition;
    public final @Nullable MethodHandle clang_getCanonicalCursor;
    public final @Nullable MethodHandle clang_Cursor_getObjCSelectorIndex;
    public final @Nullable MethodHandle clang_Cursor_isDynamicCall;
    public final @Nullable MethodHandle clang_Cursor_getReceiverType;
    public final @Nullable MethodHandle clang_Cursor_getObjCPropertyAttributes;
    public final @Nullable MethodHandle clang_Cursor_getObjCPropertyGetterName;
    public final @Nullable MethodHandle clang_Cursor_getObjCPropertySetterName;
    public final @Nullable MethodHandle clang_Cursor_getObjCDeclQualifiers;
    public final @Nullable MethodHandle clang_Cursor_isObjCOptional;
    public final @Nullable MethodHandle clang_Cursor_isVariadic;
    public final @Nullable MethodHandle clang_Cursor_isExternalSymbol;
    public final @Nullable MethodHandle clang_Cursor_getCommentRange;
    public final @Nullable MethodHandle clang_Cursor_getRawCommentText;
    public final @Nullable MethodHandle clang_Cursor_getBriefCommentText;
    public final @Nullable MethodHandle clang_Cursor_getMangling;
    public final @Nullable MethodHandle clang_Cursor_getCXXManglings;
    public final @Nullable MethodHandle clang_Cursor_getObjCManglings;
    public final @Nullable MethodHandle clang_Cursor_getModule;
    public final @Nullable MethodHandle clang_getModuleForFile;
    public final @Nullable MethodHandle clang_Module_getASTFile;
    public final @Nullable MethodHandle clang_Module_getParent;
    public final @Nullable MethodHandle clang_Module_getName;
    public final @Nullable MethodHandle clang_Module_getFullName;
    public final @Nullable MethodHandle clang_Module_isSystem;
    public final @Nullable MethodHandle clang_Module_getNumTopLevelHeaders;
    public final @Nullable MethodHandle clang_Module_getTopLevelHeader;
    public final @Nullable MethodHandle clang_CXXConstructor_isConvertingConstructor;
    public final @Nullable MethodHandle clang_CXXConstructor_isCopyConstructor;
    public final @Nullable MethodHandle clang_CXXConstructor_isDefaultConstructor;
    public final @Nullable MethodHandle clang_CXXConstructor_isMoveConstructor;
    public final @Nullable MethodHandle clang_CXXField_isMutable;
    public final @Nullable MethodHandle clang_CXXMethod_isDefaulted;
    public final @Nullable MethodHandle clang_CXXMethod_isDeleted;
    public final @Nullable MethodHandle clang_CXXMethod_isPureVirtual;
    public final @Nullable MethodHandle clang_CXXMethod_isStatic;
    public final @Nullable MethodHandle clang_CXXMethod_isVirtual;
    public final @Nullable MethodHandle clang_CXXMethod_isCopyAssignmentOperator;
    public final @Nullable MethodHandle clang_CXXMethod_isMoveAssignmentOperator;
    public final @Nullable MethodHandle clang_CXXMethod_isExplicit;
    public final @Nullable MethodHandle clang_CXXRecord_isAbstract;
    public final @Nullable MethodHandle clang_EnumDecl_isScoped;
    public final @Nullable MethodHandle clang_CXXMethod_isConst;
    public final @Nullable MethodHandle clang_getTemplateCursorKind;
    public final @Nullable MethodHandle clang_getSpecializedCursorTemplate;
    public final @Nullable MethodHandle clang_getCursorReferenceNameRange;
    public final @Nullable MethodHandle clang_getToken;
    public final @Nullable MethodHandle clang_getTokenKind;
    public final @Nullable MethodHandle clang_getTokenSpelling;
    public final @Nullable MethodHandle clang_getTokenLocation;
    public final @Nullable MethodHandle clang_getTokenExtent;
    public final @Nullable MethodHandle clang_tokenize;
    public final @Nullable MethodHandle clang_annotateTokens;
    public final @Nullable MethodHandle clang_disposeTokens;
    public final @Nullable MethodHandle clang_getCursorKindSpelling;
    public final @Nullable MethodHandle clang_getDefinitionSpellingAndExtent;
    public final @Nullable MethodHandle clang_enableStackTraces;
    public final @Nullable MethodHandle clang_executeOnThread;
    public final @Nullable MethodHandle clang_getCompletionChunkKind;
    public final @Nullable MethodHandle clang_getCompletionChunkText;
    public final @Nullable MethodHandle clang_getCompletionChunkCompletionString;
    public final @Nullable MethodHandle clang_getNumCompletionChunks;
    public final @Nullable MethodHandle clang_getCompletionPriority;
    public final @Nullable MethodHandle clang_getCompletionAvailability;
    public final @Nullable MethodHandle clang_getCompletionNumAnnotations;
    public final @Nullable MethodHandle clang_getCompletionAnnotation;
    public final @Nullable MethodHandle clang_getCompletionParent;
    public final @Nullable MethodHandle clang_getCompletionBriefComment;
    public final @Nullable MethodHandle clang_getCursorCompletionString;
    public final @Nullable MethodHandle clang_getCompletionNumFixIts;
    public final @Nullable MethodHandle clang_getCompletionFixIt;
    public final @Nullable MethodHandle clang_defaultCodeCompleteOptions;
    public final @Nullable MethodHandle clang_codeCompleteAt;
    public final @Nullable MethodHandle clang_sortCodeCompletionResults;
    public final @Nullable MethodHandle clang_disposeCodeCompleteResults;
    public final @Nullable MethodHandle clang_codeCompleteGetNumDiagnostics;
    public final @Nullable MethodHandle clang_codeCompleteGetDiagnostic;
    public final @Nullable MethodHandle clang_codeCompleteGetContexts;
    public final @Nullable MethodHandle clang_codeCompleteGetContainerKind;
    public final @Nullable MethodHandle clang_codeCompleteGetContainerUSR;
    public final @Nullable MethodHandle clang_codeCompleteGetObjCSelector;
    public final @Nullable MethodHandle clang_getClangVersion;
    public final @Nullable MethodHandle clang_toggleCrashRecovery;
    public final @Nullable MethodHandle clang_getInclusions;
    public final @Nullable MethodHandle clang_Cursor_Evaluate;
    public final @Nullable MethodHandle clang_EvalResult_getKind;
    public final @Nullable MethodHandle clang_EvalResult_getAsInt;
    public final @Nullable MethodHandle clang_EvalResult_getAsLongLong;
    public final @Nullable MethodHandle clang_EvalResult_isUnsignedInt;
    public final @Nullable MethodHandle clang_EvalResult_getAsUnsigned;
    public final @Nullable MethodHandle clang_EvalResult_getAsDouble;
    public final @Nullable MethodHandle clang_EvalResult_getAsStr;
    public final @Nullable MethodHandle clang_EvalResult_dispose;
    public final @Nullable MethodHandle clang_findReferencesInFile;
    public final @Nullable MethodHandle clang_findIncludesInFile;
    public final @Nullable MethodHandle clang_findReferencesInFileWithBlock;
    public final @Nullable MethodHandle clang_findIncludesInFileWithBlock;
    public final @Nullable MethodHandle clang_index_isEntityObjCContainerKind;
    public final @Nullable MethodHandle clang_index_getObjCContainerDeclInfo;
    public final @Nullable MethodHandle clang_index_getObjCInterfaceDeclInfo;
    public final @Nullable MethodHandle clang_index_getObjCCategoryDeclInfo;
    public final @Nullable MethodHandle clang_index_getObjCProtocolRefListInfo;
    public final @Nullable MethodHandle clang_index_getObjCPropertyDeclInfo;
    public final @Nullable MethodHandle clang_index_getIBOutletCollectionAttrInfo;
    public final @Nullable MethodHandle clang_index_getCXXClassDeclInfo;
    public final @Nullable MethodHandle clang_index_getClientContainer;
    public final @Nullable MethodHandle clang_index_setClientContainer;
    public final @Nullable MethodHandle clang_index_getClientEntity;
    public final @Nullable MethodHandle clang_index_setClientEntity;
    public final @Nullable MethodHandle clang_IndexAction_create;
    public final @Nullable MethodHandle clang_IndexAction_dispose;
    public final @Nullable MethodHandle clang_indexSourceFile;
    public final @Nullable MethodHandle clang_indexSourceFileFullArgv;
    public final @Nullable MethodHandle clang_indexTranslationUnit;
    public final @Nullable MethodHandle clang_indexLoc_getFileLocation;
    public final @Nullable MethodHandle clang_indexLoc_getCXSourceLocation;
    public final @Nullable MethodHandle clang_Type_visitFields;
    public final @Nullable MethodHandle clang_visitCXXBaseClasses;
    public final @Nullable MethodHandle clang_visitCXXMethods;
    public final @Nullable MethodHandle clang_getBinaryOperatorKindSpelling;
    public final @Nullable MethodHandle clang_getCursorBinaryOperatorKind;
    public final @Nullable MethodHandle clang_getUnaryOperatorKindSpelling;
    public final @Nullable MethodHandle clang_getCursorUnaryOperatorKind;

    UpfrontIndex_h(SymbolLookup lookup, Linker linker)
    {
        this.clang_getCString = downcall(lookup, linker, "clang_getCString", FunctionDescriptor.of(UNBOUNDED_POINTER, CXString.LAYOUT));
        this.clang_disposeString = downcall(lookup, linker, "clang_disposeString", FunctionDescriptor.ofVoid(CXString.LAYOUT));
        this.clang_disposeStringSet = downcall(lookup, linker, "clang_disposeStringSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getBuildSessionTimestamp = downcall(lookup, linker, "clang_getBuildSessionTimestamp", FunctionDescriptor.of(JAVA_LONG));
        this.clang_VirtualFileOverlay_create = downcall(lookup, linker, "clang_VirtualFileOverlay_create", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
        this.clang_VirtualFileOverlay_addFileMapping = downcall(lookup, linker, "clang_VirtualFileOverlay_addFileMapping", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_VirtualFileOverlay_setCaseSensitivity = downcall(lookup, linker, "clang_VirtualFileOverlay_setCaseSensitivity", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_VirtualFileOverlay_writeToBuffer = downcall(lookup, linker, "clang_VirtualFileOverlay_writeToBuffer", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_free = downcall(lookup, linker, "clang_free", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_VirtualFileOverlay_dispose = downcall(lookup, linker, "clang_VirtualFileOverlay_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_ModuleMapDescriptor_create = downcall(lookup, linker, "clang_ModuleMapDescriptor_create", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
        this.clang_ModuleMapDescriptor_setFrameworkModuleName = downcall(lookup, linker, "clang_ModuleMapDescriptor_setFrameworkModuleName", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_ModuleMapDescriptor_setUmbrellaHeader = downcall(lookup, linker, "clang_ModuleMapDescriptor_setUmbrellaHeader", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_ModuleMapDescriptor_writeToBuffer = downcall(lookup, linker, "clang_ModuleMapDescriptor_writeToBuffer", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_ModuleMapDescriptor_dispose = downcall(lookup, linker, "clang_ModuleMapDescriptor_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getFileName = downcall(lookup, linker, "clang_getFileName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getFileTime = downcall(lookup, linker, "clang_getFileTime", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
        this.clang_getFileUniqueID = downcall(lookup, linker, "clang_getFileUniqueID", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_File_isEqual = downcall(lookup, linker, "clang_File_isEqual", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_File_tryGetRealPathName = downcall(lookup, linker, "clang_File_tryGetRealPathName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getNullLocation = downcall(lookup, linker, "clang_getNullLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT));
        this.clang_equalLocations = downcall(lookup, linker, "clang_equalLocations", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
        this.clang_Location_isInSystemHeader = downcall(lookup, linker, "clang_Location_isInSystemHeader", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
        this.clang_Location_isFromMainFile = downcall(lookup, linker, "clang_Location_isFromMainFile", FunctionDescriptor.of(JAVA_INT, CXSourceLocation.LAYOUT));
        this.clang_getNullRange = downcall(lookup, linker, "clang_getNullRange", FunctionDescriptor.of(CXSourceRange.LAYOUT));
        this.clang_getRange = downcall(lookup, linker, "clang_getRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT));
        this.clang_equalRanges = downcall(lookup, linker, "clang_equalRanges", FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT, CXSourceRange.LAYOUT));
        this.clang_Range_isNull = downcall(lookup, linker, "clang_Range_isNull", FunctionDescriptor.of(JAVA_INT, CXSourceRange.LAYOUT));
        this.clang_getExpansionLocation = downcall(lookup, linker, "clang_getExpansionLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getPresumedLocation = downcall(lookup, linker, "clang_getPresumedLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getInstantiationLocation = downcall(lookup, linker, "clang_getInstantiationLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getSpellingLocation = downcall(lookup, linker, "clang_getSpellingLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getFileLocation = downcall(lookup, linker, "clang_getFileLocation", FunctionDescriptor.ofVoid(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getRangeStart = downcall(lookup, linker, "clang_getRangeStart", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
        this.clang_getRangeEnd = downcall(lookup, linker, "clang_getRangeEnd", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT));
        this.clang_disposeSourceRangeList = downcall(lookup, linker, "clang_disposeSourceRangeList", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getNumDiagnosticsInSet = downcall(lookup, linker, "clang_getNumDiagnosticsInSet", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticInSet = downcall(lookup, linker, "clang_getDiagnosticInSet", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_loadDiagnostics = downcall(lookup, linker, "clang_loadDiagnostics", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_disposeDiagnosticSet = downcall(lookup, linker, "clang_disposeDiagnosticSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getChildDiagnostics = downcall(lookup, linker, "clang_getChildDiagnostics", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_disposeDiagnostic = downcall(lookup, linker, "clang_disposeDiagnostic", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_formatDiagnostic = downcall(lookup, linker, "clang_formatDiagnostic", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_defaultDiagnosticDisplayOptions = downcall(lookup, linker, "clang_defaultDiagnosticDisplayOptions", FunctionDescriptor.of(JAVA_INT));
        this.clang_getDiagnosticSeverity = downcall(lookup, linker, "clang_getDiagnosticSeverity", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticLocation = downcall(lookup, linker, "clang_getDiagnosticLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticSpelling = downcall(lookup, linker, "clang_getDiagnosticSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticOption = downcall(lookup, linker, "clang_getDiagnosticOption", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getDiagnosticCategory = downcall(lookup, linker, "clang_getDiagnosticCategory", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticCategoryName = downcall(lookup, linker, "clang_getDiagnosticCategoryName", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_getDiagnosticCategoryText = downcall(lookup, linker, "clang_getDiagnosticCategoryText", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticNumRanges = downcall(lookup, linker, "clang_getDiagnosticNumRanges", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticRange = downcall(lookup, linker, "clang_getDiagnosticRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getDiagnosticNumFixIts = downcall(lookup, linker, "clang_getDiagnosticNumFixIts", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnosticFixIt = downcall(lookup, linker, "clang_getDiagnosticFixIt", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_createIndex = downcall(lookup, linker, "clang_createIndex", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
        this.clang_disposeIndex = downcall(lookup, linker, "clang_disposeIndex", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_CXIndex_setGlobalOptions = downcall(lookup, linker, "clang_CXIndex_setGlobalOptions", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
        this.clang_CXIndex_getGlobalOptions = downcall(lookup, linker, "clang_CXIndex_getGlobalOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_CXIndex_setInvocationEmissionPathOption = downcall(lookup, linker, "clang_CXIndex_setInvocationEmissionPathOption", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_isFileMultipleIncludeGuarded = downcall(lookup, linker, "clang_isFileMultipleIncludeGuarded", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getFile = downcall(lookup, linker, "clang_getFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getFileContents = downcall(lookup, linker, "clang_getFileContents", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getLocation = downcall(lookup, linker, "clang_getLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
        this.clang_getLocationForOffset = downcall(lookup, linker, "clang_getLocationForOffset", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getSkippedRanges = downcall(lookup, linker, "clang_getSkippedRanges", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getAllSkippedRanges = downcall(lookup, linker, "clang_getAllSkippedRanges", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getNumDiagnostics = downcall(lookup, linker, "clang_getNumDiagnostics", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getDiagnostic = downcall(lookup, linker, "clang_getDiagnostic", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getDiagnosticSetFromTU = downcall(lookup, linker, "clang_getDiagnosticSetFromTU", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getTranslationUnitSpelling = downcall(lookup, linker, "clang_getTranslationUnitSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_createTranslationUnitFromSourceFile = downcall(lookup, linker, "clang_createTranslationUnitFromSourceFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_createTranslationUnit = downcall(lookup, linker, "clang_createTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_createTranslationUnit2 = downcall(lookup, linker, "clang_createTranslationUnit2", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_defaultEditingTranslationUnitOptions = downcall(lookup, linker, "clang_defaultEditingTranslationUnitOptions", FunctionDescriptor.of(JAVA_INT));
        this.clang_parseTranslationUnit = downcall(lookup, linker, "clang_parseTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
        this.clang_parseTranslationUnit2 = downcall(lookup, linker, "clang_parseTranslationUnit2", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_parseTranslationUnit2FullArgv = downcall(lookup, linker, "clang_parseTranslationUnit2FullArgv", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_defaultSaveOptions = downcall(lookup, linker, "clang_defaultSaveOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_saveTranslationUnit = downcall(lookup, linker, "clang_saveTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_suspendTranslationUnit = downcall(lookup, linker, "clang_suspendTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_disposeTranslationUnit = downcall(lookup, linker, "clang_disposeTranslationUnit", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_defaultReparseOptions = downcall(lookup, linker, "clang_defaultReparseOptions", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_reparseTranslationUnit = downcall(lookup, linker, "clang_reparseTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getTUResourceUsageName = downcall(lookup, linker, "clang_getTUResourceUsageName", FunctionDescriptor.of(UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCXTUResourceUsage = downcall(lookup, linker, "clang_getCXTUResourceUsage", FunctionDescriptor.of(CXTUResourceUsage.LAYOUT, UNBOUNDED_POINTER));
        this.clang_disposeCXTUResourceUsage = downcall(lookup, linker, "clang_disposeCXTUResourceUsage", FunctionDescriptor.ofVoid(CXTUResourceUsage.LAYOUT));
        this.clang_getTranslationUnitTargetInfo = downcall(lookup, linker, "clang_getTranslationUnitTargetInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_TargetInfo_dispose = downcall(lookup, linker, "clang_TargetInfo_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_TargetInfo_getTriple = downcall(lookup, linker, "clang_TargetInfo_getTriple", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_TargetInfo_getPointerWidth = downcall(lookup, linker, "clang_TargetInfo_getPointerWidth", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getNullCursor = downcall(lookup, linker, "clang_getNullCursor", FunctionDescriptor.of(CXCursor.LAYOUT));
        this.clang_getTranslationUnitCursor = downcall(lookup, linker, "clang_getTranslationUnitCursor", FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER));
        this.clang_equalCursors = downcall(lookup, linker, "clang_equalCursors", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_isNull = downcall(lookup, linker, "clang_Cursor_isNull", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_hashCursor = downcall(lookup, linker, "clang_hashCursor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorKind = downcall(lookup, linker, "clang_getCursorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_isDeclaration = downcall(lookup, linker, "clang_isDeclaration", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isInvalidDeclaration = downcall(lookup, linker, "clang_isInvalidDeclaration", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_isReference = downcall(lookup, linker, "clang_isReference", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isExpression = downcall(lookup, linker, "clang_isExpression", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isStatement = downcall(lookup, linker, "clang_isStatement", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isAttribute = downcall(lookup, linker, "clang_isAttribute", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_Cursor_hasAttrs = downcall(lookup, linker, "clang_Cursor_hasAttrs", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_isInvalid = downcall(lookup, linker, "clang_isInvalid", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isTranslationUnit = downcall(lookup, linker, "clang_isTranslationUnit", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isPreprocessing = downcall(lookup, linker, "clang_isPreprocessing", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_isUnexposed = downcall(lookup, linker, "clang_isUnexposed", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_getCursorLinkage = downcall(lookup, linker, "clang_getCursorLinkage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorVisibility = downcall(lookup, linker, "clang_getCursorVisibility", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorAvailability = downcall(lookup, linker, "clang_getCursorAvailability", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorPlatformAvailability = downcall(lookup, linker, "clang_getCursorPlatformAvailability", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_disposeCXPlatformAvailability = downcall(lookup, linker, "clang_disposeCXPlatformAvailability", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_Cursor_getVarDeclInitializer = downcall(lookup, linker, "clang_Cursor_getVarDeclInitializer", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_hasVarDeclGlobalStorage = downcall(lookup, linker, "clang_Cursor_hasVarDeclGlobalStorage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_hasVarDeclExternalStorage = downcall(lookup, linker, "clang_Cursor_hasVarDeclExternalStorage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorLanguage = downcall(lookup, linker, "clang_getCursorLanguage", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCursorTLSKind = downcall(lookup, linker, "clang_getCursorTLSKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getTranslationUnit = downcall(lookup, linker, "clang_Cursor_getTranslationUnit", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_createCXCursorSet = downcall(lookup, linker, "clang_createCXCursorSet", FunctionDescriptor.of(UNBOUNDED_POINTER));
        this.clang_disposeCXCursorSet = downcall(lookup, linker, "clang_disposeCXCursorSet", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_CXCursorSet_contains = downcall(lookup, linker, "clang_CXCursorSet_contains", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_CXCursorSet_insert = downcall(lookup, linker, "clang_CXCursorSet_insert", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_getCursorSemanticParent = downcall(lookup, linker, "clang_getCursorSemanticParent", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorLexicalParent = downcall(lookup, linker, "clang_getCursorLexicalParent", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_getOverriddenCursors = downcall(lookup, linker, "clang_getOverriddenCursors", FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_disposeOverriddenCursors = downcall(lookup, linker, "clang_disposeOverriddenCursors", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getIncludedFile = downcall(lookup, linker, "clang_getIncludedFile", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_getCursor = downcall(lookup, linker, "clang_getCursor", FunctionDescriptor.of(CXCursor.LAYOUT, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
        this.clang_getCursorLocation = downcall(lookup, linker, "clang_getCursorLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorExtent = downcall(lookup, linker, "clang_getCursorExtent", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorType = downcall(lookup, linker, "clang_getCursorType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_getTypeSpelling = downcall(lookup, linker, "clang_getTypeSpelling", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
        this.clang_getTypedefDeclUnderlyingType = downcall(lookup, linker, "clang_getTypedefDeclUnderlyingType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_getEnumDeclIntegerType = downcall(lookup, linker, "clang_getEnumDeclIntegerType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_getEnumConstantDeclValue = downcall(lookup, linker, "clang_getEnumConstantDeclValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
        this.clang_getEnumConstantDeclUnsignedValue = downcall(lookup, linker, "clang_getEnumConstantDeclUnsignedValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
        this.clang_Cursor_isBitField = downcall(lookup, linker, "clang_Cursor_isBitField", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getFieldDeclBitWidth = downcall(lookup, linker, "clang_getFieldDeclBitWidth", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getNumArguments = downcall(lookup, linker, "clang_Cursor_getNumArguments", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getArgument = downcall(lookup, linker, "clang_Cursor_getArgument", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
        this.clang_Cursor_getNumTemplateArguments = downcall(lookup, linker, "clang_Cursor_getNumTemplateArguments", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getTemplateArgumentKind = downcall(lookup, linker, "clang_Cursor_getTemplateArgumentKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
        this.clang_Cursor_getTemplateArgumentType = downcall(lookup, linker, "clang_Cursor_getTemplateArgumentType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
        this.clang_Cursor_getTemplateArgumentValue = downcall(lookup, linker, "clang_Cursor_getTemplateArgumentValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
        this.clang_Cursor_getTemplateArgumentUnsignedValue = downcall(lookup, linker, "clang_Cursor_getTemplateArgumentUnsignedValue", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, JAVA_INT));
        this.clang_equalTypes = downcall(lookup, linker, "clang_equalTypes", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getCanonicalType = downcall(lookup, linker, "clang_getCanonicalType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_isConstQualifiedType = downcall(lookup, linker, "clang_isConstQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Cursor_isMacroFunctionLike = downcall(lookup, linker, "clang_Cursor_isMacroFunctionLike", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isMacroBuiltin = downcall(lookup, linker, "clang_Cursor_isMacroBuiltin", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isFunctionInlined = downcall(lookup, linker, "clang_Cursor_isFunctionInlined", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_isVolatileQualifiedType = downcall(lookup, linker, "clang_isVolatileQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_isRestrictQualifiedType = downcall(lookup, linker, "clang_isRestrictQualifiedType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getAddressSpace = downcall(lookup, linker, "clang_getAddressSpace", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getTypedefName = downcall(lookup, linker, "clang_getTypedefName", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
        this.clang_getPointeeType = downcall(lookup, linker, "clang_getPointeeType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getUnqualifiedType = downcall(lookup, linker, "clang_getUnqualifiedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getNonReferenceType = downcall(lookup, linker, "clang_getNonReferenceType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getTypeDeclaration = downcall(lookup, linker, "clang_getTypeDeclaration", FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT));
        this.clang_getDeclObjCTypeEncoding = downcall(lookup, linker, "clang_getDeclObjCTypeEncoding", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Type_getObjCEncoding = downcall(lookup, linker, "clang_Type_getObjCEncoding", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT));
        this.clang_getTypeKindSpelling = downcall(lookup, linker, "clang_getTypeKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_getFunctionTypeCallingConv = downcall(lookup, linker, "clang_getFunctionTypeCallingConv", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getResultType = downcall(lookup, linker, "clang_getResultType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getExceptionSpecificationType = downcall(lookup, linker, "clang_getExceptionSpecificationType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getNumArgTypes = downcall(lookup, linker, "clang_getNumArgTypes", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getArgType = downcall(lookup, linker, "clang_getArgType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
        this.clang_Type_getObjCObjectBaseType = downcall(lookup, linker, "clang_Type_getObjCObjectBaseType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_Type_getNumObjCProtocolRefs = downcall(lookup, linker, "clang_Type_getNumObjCProtocolRefs", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Type_getObjCProtocolDecl = downcall(lookup, linker, "clang_Type_getObjCProtocolDecl", FunctionDescriptor.of(CXCursor.LAYOUT, CXType.LAYOUT, JAVA_INT));
        this.clang_Type_getNumObjCTypeArgs = downcall(lookup, linker, "clang_Type_getNumObjCTypeArgs", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Type_getObjCTypeArg = downcall(lookup, linker, "clang_Type_getObjCTypeArg", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
        this.clang_isFunctionTypeVariadic = downcall(lookup, linker, "clang_isFunctionTypeVariadic", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getCursorResultType = downcall(lookup, linker, "clang_getCursorResultType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorExceptionSpecificationType = downcall(lookup, linker, "clang_getCursorExceptionSpecificationType", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_isPODType = downcall(lookup, linker, "clang_isPODType", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_getElementType = downcall(lookup, linker, "clang_getElementType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getNumElements = downcall(lookup, linker, "clang_getNumElements", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
        this.clang_getArrayElementType = downcall(lookup, linker, "clang_getArrayElementType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_getArraySize = downcall(lookup, linker, "clang_getArraySize", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
        this.clang_Type_getNamedType = downcall(lookup, linker, "clang_Type_getNamedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_Type_isTransparentTagTypedef = downcall(lookup, linker, "clang_Type_isTransparentTagTypedef", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Type_getNullability = downcall(lookup, linker, "clang_Type_getNullability", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Type_getAlignOf = downcall(lookup, linker, "clang_Type_getAlignOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
        this.clang_Type_getClassType = downcall(lookup, linker, "clang_Type_getClassType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_Type_getSizeOf = downcall(lookup, linker, "clang_Type_getSizeOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT));
        this.clang_Type_getOffsetOf = downcall(lookup, linker, "clang_Type_getOffsetOf", FunctionDescriptor.of(JAVA_LONG, CXType.LAYOUT, UNBOUNDED_POINTER));
        this.clang_Type_getModifiedType = downcall(lookup, linker, "clang_Type_getModifiedType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_Type_getValueType = downcall(lookup, linker, "clang_Type_getValueType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT));
        this.clang_Cursor_getOffsetOfField = downcall(lookup, linker, "clang_Cursor_getOffsetOfField", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT));
        this.clang_Cursor_isAnonymous = downcall(lookup, linker, "clang_Cursor_isAnonymous", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isAnonymousRecordDecl = downcall(lookup, linker, "clang_Cursor_isAnonymousRecordDecl", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isInlineNamespace = downcall(lookup, linker, "clang_Cursor_isInlineNamespace", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Type_getNumTemplateArguments = downcall(lookup, linker, "clang_Type_getNumTemplateArguments", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_Type_getTemplateArgumentAsType = downcall(lookup, linker, "clang_Type_getTemplateArgumentAsType", FunctionDescriptor.of(CXType.LAYOUT, CXType.LAYOUT, JAVA_INT));
        this.clang_Type_getCXXRefQualifier = downcall(lookup, linker, "clang_Type_getCXXRefQualifier", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT));
        this.clang_isVirtualBase = downcall(lookup, linker, "clang_isVirtualBase", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getOffsetOfBase = downcall(lookup, linker, "clang_getOffsetOfBase", FunctionDescriptor.of(JAVA_LONG, CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCXXAccessSpecifier = downcall(lookup, linker, "clang_getCXXAccessSpecifier", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getBinaryOpcode = downcall(lookup, linker, "clang_Cursor_getBinaryOpcode", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getBinaryOpcodeStr = downcall(lookup, linker, "clang_Cursor_getBinaryOpcodeStr", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_Cursor_getStorageClass = downcall(lookup, linker, "clang_Cursor_getStorageClass", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getNumOverloadedDecls = downcall(lookup, linker, "clang_getNumOverloadedDecls", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getOverloadedDecl = downcall(lookup, linker, "clang_getOverloadedDecl", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT));
        this.clang_getIBOutletCollectionType = downcall(lookup, linker, "clang_getIBOutletCollectionType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_visitChildren = downcall(lookup, linker, "clang_visitChildren", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_visitChildrenWithBlock = downcall(lookup, linker, "clang_visitChildrenWithBlock", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getCursorUSR = downcall(lookup, linker, "clang_getCursorUSR", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_constructUSR_ObjCClass = downcall(lookup, linker, "clang_constructUSR_ObjCClass", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_constructUSR_ObjCCategory = downcall(lookup, linker, "clang_constructUSR_ObjCCategory", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_constructUSR_ObjCProtocol = downcall(lookup, linker, "clang_constructUSR_ObjCProtocol", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_constructUSR_ObjCIvar = downcall(lookup, linker, "clang_constructUSR_ObjCIvar", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
        this.clang_constructUSR_ObjCMethod = downcall(lookup, linker, "clang_constructUSR_ObjCMethod", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, CXString.LAYOUT));
        this.clang_constructUSR_ObjCProperty = downcall(lookup, linker, "clang_constructUSR_ObjCProperty", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXString.LAYOUT));
        this.clang_getCursorSpelling = downcall(lookup, linker, "clang_getCursorSpelling", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getSpellingNameRange = downcall(lookup, linker, "clang_Cursor_getSpellingNameRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
        this.clang_PrintingPolicy_getProperty = downcall(lookup, linker, "clang_PrintingPolicy_getProperty", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_PrintingPolicy_setProperty = downcall(lookup, linker, "clang_PrintingPolicy_setProperty", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
        this.clang_getCursorPrintingPolicy = downcall(lookup, linker, "clang_getCursorPrintingPolicy", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_PrintingPolicy_dispose = downcall(lookup, linker, "clang_PrintingPolicy_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_getCursorPrettyPrinted = downcall(lookup, linker, "clang_getCursorPrettyPrinted", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getTypePrettyPrinted = downcall(lookup, linker, "clang_getTypePrettyPrinted", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getFullyQualifiedName = downcall(lookup, linker, "clang_getFullyQualifiedName", FunctionDescriptor.of(CXString.LAYOUT, CXType.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCursorDisplayName = downcall(lookup, linker, "clang_getCursorDisplayName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorReferenced = downcall(lookup, linker, "clang_getCursorReferenced", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorDefinition = downcall(lookup, linker, "clang_getCursorDefinition", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_isCursorDefinition = downcall(lookup, linker, "clang_isCursorDefinition", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getCanonicalCursor = downcall(lookup, linker, "clang_getCanonicalCursor", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getObjCSelectorIndex = downcall(lookup, linker, "clang_Cursor_getObjCSelectorIndex", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isDynamicCall = downcall(lookup, linker, "clang_Cursor_isDynamicCall", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_getReceiverType = downcall(lookup, linker, "clang_Cursor_getReceiverType", FunctionDescriptor.of(CXType.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getObjCPropertyAttributes = downcall(lookup, linker, "clang_Cursor_getObjCPropertyAttributes", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, JAVA_INT));
        this.clang_Cursor_getObjCPropertyGetterName = downcall(lookup, linker, "clang_Cursor_getObjCPropertyGetterName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getObjCPropertySetterName = downcall(lookup, linker, "clang_Cursor_getObjCPropertySetterName", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getObjCDeclQualifiers = downcall(lookup, linker, "clang_Cursor_getObjCDeclQualifiers", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isObjCOptional = downcall(lookup, linker, "clang_Cursor_isObjCOptional", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isVariadic = downcall(lookup, linker, "clang_Cursor_isVariadic", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_Cursor_isExternalSymbol = downcall(lookup, linker, "clang_Cursor_isExternalSymbol", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Cursor_getCommentRange = downcall(lookup, linker, "clang_Cursor_getCommentRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getRawCommentText = downcall(lookup, linker, "clang_Cursor_getRawCommentText", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getBriefCommentText = downcall(lookup, linker, "clang_Cursor_getBriefCommentText", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getMangling = downcall(lookup, linker, "clang_Cursor_getMangling", FunctionDescriptor.of(CXString.LAYOUT, CXCursor.LAYOUT));
        this.clang_Cursor_getCXXManglings = downcall(lookup, linker, "clang_Cursor_getCXXManglings", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_Cursor_getObjCManglings = downcall(lookup, linker, "clang_Cursor_getObjCManglings", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_Cursor_getModule = downcall(lookup, linker, "clang_Cursor_getModule", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_getModuleForFile = downcall(lookup, linker, "clang_getModuleForFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Module_getASTFile = downcall(lookup, linker, "clang_Module_getASTFile", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Module_getParent = downcall(lookup, linker, "clang_Module_getParent", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Module_getName = downcall(lookup, linker, "clang_Module_getName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_Module_getFullName = downcall(lookup, linker, "clang_Module_getFullName", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_Module_isSystem = downcall(lookup, linker, "clang_Module_isSystem", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_Module_getNumTopLevelHeaders = downcall(lookup, linker, "clang_Module_getNumTopLevelHeaders", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Module_getTopLevelHeader = downcall(lookup, linker, "clang_Module_getTopLevelHeader", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_CXXConstructor_isConvertingConstructor = downcall(lookup, linker, "clang_CXXConstructor_isConvertingConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXConstructor_isCopyConstructor = downcall(lookup, linker, "clang_CXXConstructor_isCopyConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXConstructor_isDefaultConstructor = downcall(lookup, linker, "clang_CXXConstructor_isDefaultConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXConstructor_isMoveConstructor = downcall(lookup, linker, "clang_CXXConstructor_isMoveConstructor", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXField_isMutable = downcall(lookup, linker, "clang_CXXField_isMutable", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isDefaulted = downcall(lookup, linker, "clang_CXXMethod_isDefaulted", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isDeleted = downcall(lookup, linker, "clang_CXXMethod_isDeleted", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isPureVirtual = downcall(lookup, linker, "clang_CXXMethod_isPureVirtual", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isStatic = downcall(lookup, linker, "clang_CXXMethod_isStatic", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isVirtual = downcall(lookup, linker, "clang_CXXMethod_isVirtual", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isCopyAssignmentOperator = downcall(lookup, linker, "clang_CXXMethod_isCopyAssignmentOperator", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isMoveAssignmentOperator = downcall(lookup, linker, "clang_CXXMethod_isMoveAssignmentOperator", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isExplicit = downcall(lookup, linker, "clang_CXXMethod_isExplicit", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXRecord_isAbstract = downcall(lookup, linker, "clang_CXXRecord_isAbstract", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_EnumDecl_isScoped = downcall(lookup, linker, "clang_EnumDecl_isScoped", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_CXXMethod_isConst = downcall(lookup, linker, "clang_CXXMethod_isConst", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getTemplateCursorKind = downcall(lookup, linker, "clang_getTemplateCursorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getSpecializedCursorTemplate = downcall(lookup, linker, "clang_getSpecializedCursorTemplate", FunctionDescriptor.of(CXCursor.LAYOUT, CXCursor.LAYOUT));
        this.clang_getCursorReferenceNameRange = downcall(lookup, linker, "clang_getCursorReferenceNameRange", FunctionDescriptor.of(CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT));
        this.clang_getToken = downcall(lookup, linker, "clang_getToken", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXSourceLocation.LAYOUT));
        this.clang_getTokenKind = downcall(lookup, linker, "clang_getTokenKind", FunctionDescriptor.of(JAVA_INT, CXToken.LAYOUT));
        this.clang_getTokenSpelling = downcall(lookup, linker, "clang_getTokenSpelling", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
        this.clang_getTokenLocation = downcall(lookup, linker, "clang_getTokenLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
        this.clang_getTokenExtent = downcall(lookup, linker, "clang_getTokenExtent", FunctionDescriptor.of(CXSourceRange.LAYOUT, UNBOUNDED_POINTER, CXToken.LAYOUT));
        this.clang_tokenize = downcall(lookup, linker, "clang_tokenize", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, CXSourceRange.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_annotateTokens = downcall(lookup, linker, "clang_annotateTokens", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_disposeTokens = downcall(lookup, linker, "clang_disposeTokens", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCursorKindSpelling = downcall(lookup, linker, "clang_getCursorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_getDefinitionSpellingAndExtent = downcall(lookup, linker, "clang_getDefinitionSpellingAndExtent", FunctionDescriptor.ofVoid(CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_enableStackTraces = downcall(lookup, linker, "clang_enableStackTraces", FunctionDescriptor.ofVoid());
        this.clang_executeOnThread = downcall(lookup, linker, "clang_executeOnThread", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCompletionChunkKind = downcall(lookup, linker, "clang_getCompletionChunkKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCompletionChunkText = downcall(lookup, linker, "clang_getCompletionChunkText", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCompletionChunkCompletionString = downcall(lookup, linker, "clang_getCompletionChunkCompletionString", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getNumCompletionChunks = downcall(lookup, linker, "clang_getNumCompletionChunks", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getCompletionPriority = downcall(lookup, linker, "clang_getCompletionPriority", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getCompletionAvailability = downcall(lookup, linker, "clang_getCompletionAvailability", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getCompletionNumAnnotations = downcall(lookup, linker, "clang_getCompletionNumAnnotations", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_getCompletionAnnotation = downcall(lookup, linker, "clang_getCompletionAnnotation", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCompletionParent = downcall(lookup, linker, "clang_getCompletionParent", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getCompletionBriefComment = downcall(lookup, linker, "clang_getCompletionBriefComment", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getCursorCompletionString = downcall(lookup, linker, "clang_getCursorCompletionString", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_getCompletionNumFixIts = downcall(lookup, linker, "clang_getCompletionNumFixIts", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_getCompletionFixIt = downcall(lookup, linker, "clang_getCompletionFixIt", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_defaultCodeCompleteOptions = downcall(lookup, linker, "clang_defaultCodeCompleteOptions", FunctionDescriptor.of(JAVA_INT));
        this.clang_codeCompleteAt = downcall(lookup, linker, "clang_codeCompleteAt", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT));
        this.clang_sortCodeCompletionResults = downcall(lookup, linker, "clang_sortCodeCompletionResults", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, JAVA_INT));
        this.clang_disposeCodeCompleteResults = downcall(lookup, linker, "clang_disposeCodeCompleteResults", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_codeCompleteGetNumDiagnostics = downcall(lookup, linker, "clang_codeCompleteGetNumDiagnostics", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_codeCompleteGetDiagnostic = downcall(lookup, linker, "clang_codeCompleteGetDiagnostic", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_codeCompleteGetContexts = downcall(lookup, linker, "clang_codeCompleteGetContexts", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
        this.clang_codeCompleteGetContainerKind = downcall(lookup, linker, "clang_codeCompleteGetContainerKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_codeCompleteGetContainerUSR = downcall(lookup, linker, "clang_codeCompleteGetContainerUSR", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_codeCompleteGetObjCSelector = downcall(lookup, linker, "clang_codeCompleteGetObjCSelector", FunctionDescriptor.of(CXString.LAYOUT, UNBOUNDED_POINTER));
        this.clang_getClangVersion = downcall(lookup, linker, "clang_getClangVersion", FunctionDescriptor.of(CXString.LAYOUT));
        this.clang_toggleCrashRecovery = downcall(lookup, linker, "clang_toggleCrashRecovery", FunctionDescriptor.ofVoid(JAVA_INT));
        this.clang_getInclusions = downcall(lookup, linker, "clang_getInclusions", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_Cursor_Evaluate = downcall(lookup, linker, "clang_Cursor_Evaluate", FunctionDescriptor.of(UNBOUNDED_POINTER, CXCursor.LAYOUT));
        this.clang_EvalResult_getKind = downcall(lookup, linker, "clang_EvalResult_getKind", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_EvalResult_getAsInt = downcall(lookup, linker, "clang_EvalResult_getAsInt", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_EvalResult_getAsLongLong = downcall(lookup, linker, "clang_EvalResult_getAsLongLong", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
        this.clang_EvalResult_isUnsignedInt = downcall(lookup, linker, "clang_EvalResult_isUnsignedInt", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER));
        this.clang_EvalResult_getAsUnsigned = downcall(lookup, linker, "clang_EvalResult_getAsUnsigned", FunctionDescriptor.of(JAVA_LONG, UNBOUNDED_POINTER));
        this.clang_EvalResult_getAsDouble = downcall(lookup, linker, "clang_EvalResult_getAsDouble", FunctionDescriptor.of(JAVA_DOUBLE, UNBOUNDED_POINTER));
        this.clang_EvalResult_getAsStr = downcall(lookup, linker, "clang_EvalResult_getAsStr", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_EvalResult_dispose = downcall(lookup, linker, "clang_EvalResult_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_findReferencesInFile = downcall(lookup, linker, "clang_findReferencesInFile", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
        this.clang_findIncludesInFile = downcall(lookup, linker, "clang_findIncludesInFile", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, CXCursorAndRangeVisitor.LAYOUT));
        this.clang_findReferencesInFileWithBlock = downcall(lookup, linker, "clang_findReferencesInFileWithBlock", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_findIncludesInFileWithBlock = downcall(lookup, linker, "clang_findIncludesInFileWithBlock", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_isEntityObjCContainerKind = downcall(lookup, linker, "clang_index_isEntityObjCContainerKind", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
        this.clang_index_getObjCContainerDeclInfo = downcall(lookup, linker, "clang_index_getObjCContainerDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getObjCInterfaceDeclInfo = downcall(lookup, linker, "clang_index_getObjCInterfaceDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getObjCCategoryDeclInfo = downcall(lookup, linker, "clang_index_getObjCCategoryDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getObjCProtocolRefListInfo = downcall(lookup, linker, "clang_index_getObjCProtocolRefListInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getObjCPropertyDeclInfo = downcall(lookup, linker, "clang_index_getObjCPropertyDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getIBOutletCollectionAttrInfo = downcall(lookup, linker, "clang_index_getIBOutletCollectionAttrInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getCXXClassDeclInfo = downcall(lookup, linker, "clang_index_getCXXClassDeclInfo", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getClientContainer = downcall(lookup, linker, "clang_index_getClientContainer", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_setClientContainer = downcall(lookup, linker, "clang_index_setClientContainer", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_getClientEntity = downcall(lookup, linker, "clang_index_getClientEntity", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_index_setClientEntity = downcall(lookup, linker, "clang_index_setClientEntity", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_IndexAction_create = downcall(lookup, linker, "clang_IndexAction_create", FunctionDescriptor.of(UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_IndexAction_dispose = downcall(lookup, linker, "clang_IndexAction_dispose", FunctionDescriptor.ofVoid(UNBOUNDED_POINTER));
        this.clang_indexSourceFile = downcall(lookup, linker, "clang_indexSourceFile", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_indexSourceFileFullArgv = downcall(lookup, linker, "clang_indexSourceFileFullArgv", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT, UNBOUNDED_POINTER, JAVA_INT));
        this.clang_indexTranslationUnit = downcall(lookup, linker, "clang_indexTranslationUnit", FunctionDescriptor.of(JAVA_INT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, JAVA_INT, JAVA_INT, UNBOUNDED_POINTER));
        this.clang_indexLoc_getFileLocation = downcall(lookup, linker, "clang_indexLoc_getFileLocation", FunctionDescriptor.ofVoid(CXIdxLoc.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_indexLoc_getCXSourceLocation = downcall(lookup, linker, "clang_indexLoc_getCXSourceLocation", FunctionDescriptor.of(CXSourceLocation.LAYOUT, CXIdxLoc.LAYOUT));
        this.clang_Type_visitFields = downcall(lookup, linker, "clang_Type_visitFields", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_visitCXXBaseClasses = downcall(lookup, linker, "clang_visitCXXBaseClasses", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_visitCXXMethods = downcall(lookup, linker, "clang_visitCXXMethods", FunctionDescriptor.of(JAVA_INT, CXType.LAYOUT, UNBOUNDED_POINTER, UNBOUNDED_POINTER));
        this.clang_getBinaryOperatorKindSpelling = downcall(lookup, linker, "clang_getBinaryOperatorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_getCursorBinaryOperatorKind = downcall(lookup, linker, "clang_getCursorBinaryOperatorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
        this.clang_getUnaryOperatorKindSpelling = downcall(lookup, linker, "clang_getUnaryOperatorKindSpelling", FunctionDescriptor.of(CXString.LAYOUT, JAVA_INT));
        this.clang_getCursorUnaryOperatorKind = downcall(lookup, linker, "clang_getCursorUnaryOperatorKind", FunctionDescriptor.of(JAVA_INT, CXCursor.LAYOUT));
    }

    static @Nullable MethodHandle downcall(SymbolLookup lookup, Linker linker, String name, FunctionDescriptor descriptor)
    {
        return lookup.find(name)
            .map(address -> linker.downcallHandle(address, descriptor))
            .orElse(null);
    }

    @Override
    public MemorySegment clang_getCString(CXString string)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getCString).invokeExact(string.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeString(CXString string)
    {
        try {requireNonNull(this.clang_disposeString).invokeExact(string.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeStringSet(MemorySegment set)
    {
        try {requireNonNull(this.clang_disposeStringSet).invokeExact(set);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getBuildSessionTimestamp()
    {
        try {return (long) requireNonNull(this.clang_getBuildSessionTimestamp).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_VirtualFileOverlay_create(int options)
    {
        try {return (MemorySegment) requireNonNull(this.clang_VirtualFileOverlay_create).invokeExact(options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_VirtualFileOverlay_addFileMapping(MemorySegment $arg1, MemorySegment virtualPath, MemorySegment realPath)
    {
        try {return (int) requireNonNull(this.clang_VirtualFileOverlay_addFileMapping).invokeExact($arg1, virtualPath, realPath);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_VirtualFileOverlay_setCaseSensitivity(MemorySegment $arg1, int caseSensitive)
    {
        try {return (int) requireNonNull(this.clang_VirtualFileOverlay_setCaseSensitivity).invokeExact($arg1, caseSensitive);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_VirtualFileOverlay_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return (int) requireNonNull(this.clang_VirtualFileOverlay_writeToBuffer).invokeExact($arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_free(MemorySegment buffer)
    {
        try {requireNonNull(this.clang_free).invokeExact(buffer);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_VirtualFileOverlay_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(this.clang_VirtualFileOverlay_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_ModuleMapDescriptor_create(int options)
    {
        try {return (MemorySegment) requireNonNull(this.clang_ModuleMapDescriptor_create).invokeExact(options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_ModuleMapDescriptor_setFrameworkModuleName(MemorySegment $arg1, MemorySegment name)
    {
        try {return (int) requireNonNull(this.clang_ModuleMapDescriptor_setFrameworkModuleName).invokeExact($arg1, name);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_ModuleMapDescriptor_setUmbrellaHeader(MemorySegment $arg1, MemorySegment name)
    {
        try {return (int) requireNonNull(this.clang_ModuleMapDescriptor_setUmbrellaHeader).invokeExact($arg1, name);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_ModuleMapDescriptor_writeToBuffer(MemorySegment $arg1, int options, MemorySegment out_buffer_ptr, MemorySegment out_buffer_size)
    {
        try {return (int) requireNonNull(this.clang_ModuleMapDescriptor_writeToBuffer).invokeExact($arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_ModuleMapDescriptor_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(this.clang_ModuleMapDescriptor_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getFileName(SegmentAllocator $segmentAllocator, MemorySegment SFile)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getFileName).invokeExact($segmentAllocator, SFile));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getFileTime(MemorySegment SFile)
    {
        try {return (long) requireNonNull(this.clang_getFileTime).invokeExact(SFile);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getFileUniqueID(MemorySegment file, MemorySegment outID)
    {
        try {return (int) requireNonNull(this.clang_getFileUniqueID).invokeExact(file, outID);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_File_isEqual(MemorySegment file1, MemorySegment file2)
    {
        try {return (int) requireNonNull(this.clang_File_isEqual).invokeExact(file1, file2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_File_tryGetRealPathName(SegmentAllocator $segmentAllocator, MemorySegment file)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_File_tryGetRealPathName).invokeExact($segmentAllocator, file));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getNullLocation(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getNullLocation).invokeExact($segmentAllocator));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)
    {
        try {return (int) requireNonNull(this.clang_equalLocations).invokeExact(loc1.ptr(), loc2.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Location_isInSystemHeader(CXSourceLocation location)
    {
        try {return (int) requireNonNull(this.clang_Location_isInSystemHeader).invokeExact(location.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Location_isFromMainFile(CXSourceLocation location)
    {
        try {return (int) requireNonNull(this.clang_Location_isFromMainFile).invokeExact(location.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getNullRange(SegmentAllocator $segmentAllocator)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getNullRange).invokeExact($segmentAllocator));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getRange(SegmentAllocator $segmentAllocator, CXSourceLocation begin, CXSourceLocation end)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getRange).invokeExact($segmentAllocator, begin.ptr(), end.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_equalRanges(CXSourceRange range1, CXSourceRange range2)
    {
        try {return (int) requireNonNull(this.clang_equalRanges).invokeExact(range1.ptr(), range2.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Range_isNull(CXSourceRange range)
    {
        try {return (int) requireNonNull(this.clang_Range_isNull).invokeExact(range.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getExpansionLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(this.clang_getExpansionLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getPresumedLocation(CXSourceLocation location, MemorySegment filename, MemorySegment line, MemorySegment column)
    {
        try {requireNonNull(this.clang_getPresumedLocation).invokeExact(location.ptr(), filename, line, column);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getInstantiationLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(this.clang_getInstantiationLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getSpellingLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(this.clang_getSpellingLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getFileLocation(CXSourceLocation location, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(this.clang_getFileLocation).invokeExact(location.ptr(), file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getRangeStart(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getRangeStart).invokeExact($segmentAllocator, range.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getRangeEnd(SegmentAllocator $segmentAllocator, CXSourceRange range)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getRangeEnd).invokeExact($segmentAllocator, range.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeSourceRangeList(MemorySegment ranges)
    {
        try {requireNonNull(this.clang_disposeSourceRangeList).invokeExact(ranges);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getNumDiagnosticsInSet(MemorySegment Diags)
    {
        try {return (int) requireNonNull(this.clang_getNumDiagnosticsInSet).invokeExact(Diags);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getDiagnosticInSet(MemorySegment Diags, int Index)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getDiagnosticInSet).invokeExact(Diags, Index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_loadDiagnostics(MemorySegment file, MemorySegment error, MemorySegment errorString)
    {
        try {return (MemorySegment) requireNonNull(this.clang_loadDiagnostics).invokeExact(file, error, errorString);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeDiagnosticSet(MemorySegment Diags)
    {
        try {requireNonNull(this.clang_disposeDiagnosticSet).invokeExact(Diags);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getChildDiagnostics(MemorySegment D)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getChildDiagnostics).invokeExact(D);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeDiagnostic(MemorySegment Diagnostic)
    {
        try {requireNonNull(this.clang_disposeDiagnostic).invokeExact(Diagnostic);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_formatDiagnostic(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Options)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_formatDiagnostic).invokeExact($segmentAllocator, Diagnostic, Options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_defaultDiagnosticDisplayOptions()
    {
        try {return (int) requireNonNull(this.clang_defaultDiagnosticDisplayOptions).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getDiagnosticSeverity(MemorySegment $arg1)
    {
        try {return (int) requireNonNull(this.clang_getDiagnosticSeverity).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getDiagnosticLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getDiagnosticLocation).invokeExact($segmentAllocator, $arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDiagnosticSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDiagnosticSpelling).invokeExact($segmentAllocator, $arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDiagnosticOption(SegmentAllocator $segmentAllocator, MemorySegment Diag, MemorySegment Disable)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDiagnosticOption).invokeExact($segmentAllocator, Diag, Disable));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getDiagnosticCategory(MemorySegment $arg1)
    {
        try {return (int) requireNonNull(this.clang_getDiagnosticCategory).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDiagnosticCategoryName(SegmentAllocator $segmentAllocator, int Category)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDiagnosticCategoryName).invokeExact($segmentAllocator, Category));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDiagnosticCategoryText(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDiagnosticCategoryText).invokeExact($segmentAllocator, $arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getDiagnosticNumRanges(MemorySegment $arg1)
    {
        try {return (int) requireNonNull(this.clang_getDiagnosticNumRanges).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getDiagnosticRange(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int Range)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getDiagnosticRange).invokeExact($segmentAllocator, Diagnostic, Range));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getDiagnosticNumFixIts(MemorySegment Diagnostic)
    {
        try {return (int) requireNonNull(this.clang_getDiagnosticNumFixIts).invokeExact(Diagnostic);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDiagnosticFixIt(SegmentAllocator $segmentAllocator, MemorySegment Diagnostic, int FixIt, MemorySegment ReplacementRange)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDiagnosticFixIt).invokeExact($segmentAllocator, Diagnostic, FixIt, ReplacementRange));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return (MemorySegment) requireNonNull(this.clang_createIndex).invokeExact(excludeDeclarationsFromPCH, displayDiagnostics);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeIndex(MemorySegment index)
    {
        try {requireNonNull(this.clang_disposeIndex).invokeExact(index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_CXIndex_setGlobalOptions(MemorySegment $arg1, int options)
    {
        try {requireNonNull(this.clang_CXIndex_setGlobalOptions).invokeExact($arg1, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXIndex_getGlobalOptions(MemorySegment $arg1)
    {
        try {return (int) requireNonNull(this.clang_CXIndex_getGlobalOptions).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_CXIndex_setInvocationEmissionPathOption(MemorySegment $arg1, MemorySegment Path)
    {
        try {requireNonNull(this.clang_CXIndex_setInvocationEmissionPathOption).invokeExact($arg1, Path);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isFileMultipleIncludeGuarded(MemorySegment tu, MemorySegment file)
    {
        try {return (int) requireNonNull(this.clang_isFileMultipleIncludeGuarded).invokeExact(tu, file);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getFile(MemorySegment tu, MemorySegment file_name)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getFile).invokeExact(tu, file_name);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getFileContents(MemorySegment tu, MemorySegment file, MemorySegment size)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getFileContents).invokeExact(tu, file, size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getLocation(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int line, int column)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getLocation).invokeExact($segmentAllocator, tu, file, line, column));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getLocationForOffset(SegmentAllocator $segmentAllocator, MemorySegment tu, MemorySegment file, int offset)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getLocationForOffset).invokeExact($segmentAllocator, tu, file, offset));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getSkippedRanges(MemorySegment tu, MemorySegment file)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getSkippedRanges).invokeExact(tu, file);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getAllSkippedRanges(MemorySegment tu)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getAllSkippedRanges).invokeExact(tu);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getNumDiagnostics(MemorySegment Unit)
    {
        try {return (int) requireNonNull(this.clang_getNumDiagnostics).invokeExact(Unit);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getDiagnostic(MemorySegment Unit, int Index)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getDiagnostic).invokeExact(Unit, Index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getDiagnosticSetFromTU(MemorySegment Unit)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getDiagnosticSetFromTU).invokeExact(Unit);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTranslationUnitSpelling(SegmentAllocator $segmentAllocator, MemorySegment CTUnit)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTranslationUnitSpelling).invokeExact($segmentAllocator, CTUnit));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_createTranslationUnitFromSourceFile(MemorySegment CIdx, MemorySegment source_filename, int num_clang_command_line_args, MemorySegment clang_command_line_args, int num_unsaved_files, MemorySegment unsaved_files)
    {
        try {return (MemorySegment) requireNonNull(this.clang_createTranslationUnitFromSourceFile).invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_createTranslationUnit(MemorySegment CIdx, MemorySegment ast_filename)
    {
        try {return (MemorySegment) requireNonNull(this.clang_createTranslationUnit).invokeExact(CIdx, ast_filename);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_createTranslationUnit2(MemorySegment CIdx, MemorySegment ast_filename, MemorySegment out_TU)
    {
        try {return (int) requireNonNull(this.clang_createTranslationUnit2).invokeExact(CIdx, ast_filename, out_TU);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_defaultEditingTranslationUnitOptions()
    {
        try {return (int) requireNonNull(this.clang_defaultEditingTranslationUnitOptions).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_parseTranslationUnit(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (MemorySegment) requireNonNull(this.clang_parseTranslationUnit).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_parseTranslationUnit2(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return (int) requireNonNull(this.clang_parseTranslationUnit2).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_parseTranslationUnit2FullArgv(MemorySegment CIdx, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, int options, MemorySegment out_TU)
    {
        try {return (int) requireNonNull(this.clang_parseTranslationUnit2FullArgv).invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_defaultSaveOptions(MemorySegment TU)
    {
        try {return (int) requireNonNull(this.clang_defaultSaveOptions).invokeExact(TU);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_saveTranslationUnit(MemorySegment TU, MemorySegment FileName, int options)
    {
        try {return (int) requireNonNull(this.clang_saveTranslationUnit).invokeExact(TU, FileName, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_suspendTranslationUnit(MemorySegment $arg1)
    {
        try {return (int) requireNonNull(this.clang_suspendTranslationUnit).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeTranslationUnit(MemorySegment $arg1)
    {
        try {requireNonNull(this.clang_disposeTranslationUnit).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_defaultReparseOptions(MemorySegment TU)
    {
        try {return (int) requireNonNull(this.clang_defaultReparseOptions).invokeExact(TU);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_reparseTranslationUnit(MemorySegment TU, int num_unsaved_files, MemorySegment unsaved_files, int options)
    {
        try {return (int) requireNonNull(this.clang_reparseTranslationUnit).invokeExact(TU, num_unsaved_files, unsaved_files, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getTUResourceUsageName(int kind)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getTUResourceUsageName).invokeExact(kind);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXTUResourceUsage clang_getCXTUResourceUsage(SegmentAllocator $segmentAllocator, MemorySegment TU)
    {
        try {return new CXTUResourceUsage((MemorySegment) requireNonNull(this.clang_getCXTUResourceUsage).invokeExact($segmentAllocator, TU));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)
    {
        try {requireNonNull(this.clang_disposeCXTUResourceUsage).invokeExact(usage.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getTranslationUnitTargetInfo(MemorySegment CTUnit)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getTranslationUnitTargetInfo).invokeExact(CTUnit);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_TargetInfo_dispose(MemorySegment Info)
    {
        try {requireNonNull(this.clang_TargetInfo_dispose).invokeExact(Info);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_TargetInfo_getTriple(SegmentAllocator $segmentAllocator, MemorySegment Info)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_TargetInfo_getTriple).invokeExact($segmentAllocator, Info));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_TargetInfo_getPointerWidth(MemorySegment Info)
    {
        try {return (int) requireNonNull(this.clang_TargetInfo_getPointerWidth).invokeExact(Info);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getNullCursor(SegmentAllocator $segmentAllocator)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getNullCursor).invokeExact($segmentAllocator));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getTranslationUnitCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getTranslationUnitCursor).invokeExact($segmentAllocator, $arg1));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_equalCursors(CXCursor $arg1, CXCursor $arg2)
    {
        try {return (int) requireNonNull(this.clang_equalCursors).invokeExact($arg1.ptr(), $arg2.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isNull(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isNull).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_hashCursor(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_hashCursor).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorKind(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_getCursorKind).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isDeclaration(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isDeclaration).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isInvalidDeclaration(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_isInvalidDeclaration).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isReference(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isReference).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isExpression(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isExpression).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isStatement(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isStatement).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isAttribute(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isAttribute).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_hasAttrs(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_hasAttrs).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isInvalid(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isInvalid).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isTranslationUnit(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isTranslationUnit).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isPreprocessing(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isPreprocessing).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isUnexposed(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_isUnexposed).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorLinkage(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorLinkage).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorVisibility(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorVisibility).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorAvailability(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorAvailability).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorPlatformAvailability(CXCursor cursor, MemorySegment always_deprecated, MemorySegment deprecated_message, MemorySegment always_unavailable, MemorySegment unavailable_message, MemorySegment availability, int availability_size)
    {
        try {return (int) requireNonNull(this.clang_getCursorPlatformAvailability).invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeCXPlatformAvailability(MemorySegment availability)
    {
        try {requireNonNull(this.clang_disposeCXPlatformAvailability).invokeExact(availability);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_Cursor_getVarDeclInitializer(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_Cursor_getVarDeclInitializer).invokeExact($segmentAllocator, cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_Cursor_hasVarDeclGlobalStorage).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_Cursor_hasVarDeclExternalStorage).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorLanguage(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorLanguage).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorTLSKind(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorTLSKind).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Cursor_getTranslationUnit(CXCursor $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Cursor_getTranslationUnit).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_createCXCursorSet()
    {
        try {return (MemorySegment) requireNonNull(this.clang_createCXCursorSet).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeCXCursorSet(MemorySegment cset)
    {
        try {requireNonNull(this.clang_disposeCXCursorSet).invokeExact(cset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXCursorSet_contains(MemorySegment cset, CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_CXCursorSet_contains).invokeExact(cset, cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXCursorSet_insert(MemorySegment cset, CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_CXCursorSet_insert).invokeExact(cset, cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCursorSemanticParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCursorSemanticParent).invokeExact($segmentAllocator, cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCursorLexicalParent(SegmentAllocator $segmentAllocator, CXCursor cursor)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCursorLexicalParent).invokeExact($segmentAllocator, cursor.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getOverriddenCursors(CXCursor cursor, MemorySegment overridden, MemorySegment num_overridden)
    {
        try {requireNonNull(this.clang_getOverriddenCursors).invokeExact(cursor.ptr(), overridden, num_overridden);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeOverriddenCursors(MemorySegment overridden)
    {
        try {requireNonNull(this.clang_disposeOverriddenCursors).invokeExact(overridden);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getIncludedFile(CXCursor cursor)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getIncludedFile).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCursor(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXSourceLocation $arg2)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCursor).invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getCursorLocation(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getCursorLocation).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getCursorExtent(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getCursorExtent).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getCursorType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getCursorType).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTypeSpelling(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTypeSpelling).invokeExact($segmentAllocator, CT.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getTypedefDeclUnderlyingType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getTypedefDeclUnderlyingType).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getEnumDeclIntegerType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getEnumDeclIntegerType).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getEnumConstantDeclValue(CXCursor C)
    {
        try {return (long) requireNonNull(this.clang_getEnumConstantDeclValue).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getEnumConstantDeclUnsignedValue(CXCursor C)
    {
        try {return (long) requireNonNull(this.clang_getEnumConstantDeclUnsignedValue).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isBitField(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isBitField).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getFieldDeclBitWidth(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_getFieldDeclBitWidth).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getNumArguments(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getNumArguments).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_Cursor_getArgument(SegmentAllocator $segmentAllocator, CXCursor C, int i)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_Cursor_getArgument).invokeExact($segmentAllocator, C.ptr(), i));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getNumTemplateArguments(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getNumTemplateArguments).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getTemplateArgumentKind(CXCursor C, int I)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getTemplateArgumentKind).invokeExact(C.ptr(), I);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Cursor_getTemplateArgumentType(SegmentAllocator $segmentAllocator, CXCursor C, int I)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Cursor_getTemplateArgumentType).invokeExact($segmentAllocator, C.ptr(), I));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Cursor_getTemplateArgumentValue(CXCursor C, int I)
    {
        try {return (long) requireNonNull(this.clang_Cursor_getTemplateArgumentValue).invokeExact(C.ptr(), I);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I)
    {
        try {return (long) requireNonNull(this.clang_Cursor_getTemplateArgumentUnsignedValue).invokeExact(C.ptr(), I);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_equalTypes(CXType A, CXType B)
    {
        try {return (int) requireNonNull(this.clang_equalTypes).invokeExact(A.ptr(), B.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getCanonicalType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getCanonicalType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isConstQualifiedType(CXType T)
    {
        try {return (int) requireNonNull(this.clang_isConstQualifiedType).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isMacroFunctionLike(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isMacroFunctionLike).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isMacroBuiltin(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isMacroBuiltin).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isFunctionInlined(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isFunctionInlined).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isVolatileQualifiedType(CXType T)
    {
        try {return (int) requireNonNull(this.clang_isVolatileQualifiedType).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isRestrictQualifiedType(CXType T)
    {
        try {return (int) requireNonNull(this.clang_isRestrictQualifiedType).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getAddressSpace(CXType T)
    {
        try {return (int) requireNonNull(this.clang_getAddressSpace).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTypedefName(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTypedefName).invokeExact($segmentAllocator, CT.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getPointeeType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getPointeeType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getUnqualifiedType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getUnqualifiedType).invokeExact($segmentAllocator, CT.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getNonReferenceType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getNonReferenceType).invokeExact($segmentAllocator, CT.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getTypeDeclaration(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getTypeDeclaration).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getDeclObjCTypeEncoding(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getDeclObjCTypeEncoding).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Type_getObjCEncoding(SegmentAllocator $segmentAllocator, CXType type)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Type_getObjCEncoding).invokeExact($segmentAllocator, type.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTypeKindSpelling(SegmentAllocator $segmentAllocator, int K)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTypeKindSpelling).invokeExact($segmentAllocator, K));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getFunctionTypeCallingConv(CXType T)
    {
        try {return (int) requireNonNull(this.clang_getFunctionTypeCallingConv).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getResultType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getResultType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getExceptionSpecificationType(CXType T)
    {
        try {return (int) requireNonNull(this.clang_getExceptionSpecificationType).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getNumArgTypes(CXType T)
    {
        try {return (int) requireNonNull(this.clang_getNumArgTypes).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getArgType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getArgType).invokeExact($segmentAllocator, T.ptr(), i));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getObjCObjectBaseType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getObjCObjectBaseType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_getNumObjCProtocolRefs(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_getNumObjCProtocolRefs).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_Type_getObjCProtocolDecl(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_Type_getObjCProtocolDecl).invokeExact($segmentAllocator, T.ptr(), i));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_getNumObjCTypeArgs(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_getNumObjCTypeArgs).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getObjCTypeArg(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getObjCTypeArg).invokeExact($segmentAllocator, T.ptr(), i));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isFunctionTypeVariadic(CXType T)
    {
        try {return (int) requireNonNull(this.clang_isFunctionTypeVariadic).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getCursorResultType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getCursorResultType).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorExceptionSpecificationType(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_getCursorExceptionSpecificationType).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isPODType(CXType T)
    {
        try {return (int) requireNonNull(this.clang_isPODType).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getElementType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getNumElements(CXType T)
    {
        try {return (long) requireNonNull(this.clang_getNumElements).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getArrayElementType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getArrayElementType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getArraySize(CXType T)
    {
        try {return (long) requireNonNull(this.clang_getArraySize).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getNamedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getNamedType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_isTransparentTagTypedef(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_isTransparentTagTypedef).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_getNullability(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_getNullability).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Type_getAlignOf(CXType T)
    {
        try {return (long) requireNonNull(this.clang_Type_getAlignOf).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getClassType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getClassType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Type_getSizeOf(CXType T)
    {
        try {return (long) requireNonNull(this.clang_Type_getSizeOf).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Type_getOffsetOf(CXType T, MemorySegment S)
    {
        try {return (long) requireNonNull(this.clang_Type_getOffsetOf).invokeExact(T.ptr(), S);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getModifiedType(SegmentAllocator $segmentAllocator, CXType T)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getModifiedType).invokeExact($segmentAllocator, T.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getValueType(SegmentAllocator $segmentAllocator, CXType CT)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getValueType).invokeExact($segmentAllocator, CT.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_Cursor_getOffsetOfField(CXCursor C)
    {
        try {return (long) requireNonNull(this.clang_Cursor_getOffsetOfField).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isAnonymous(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isAnonymous).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isAnonymousRecordDecl(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isAnonymousRecordDecl).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isInlineNamespace(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isInlineNamespace).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_getNumTemplateArguments(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_getNumTemplateArguments).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Type_getTemplateArgumentAsType(SegmentAllocator $segmentAllocator, CXType T, int i)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Type_getTemplateArgumentAsType).invokeExact($segmentAllocator, T.ptr(), i));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_getCXXRefQualifier(CXType T)
    {
        try {return (int) requireNonNull(this.clang_Type_getCXXRefQualifier).invokeExact(T.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isVirtualBase(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_isVirtualBase).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base)
    {
        try {return (long) requireNonNull(this.clang_getOffsetOfBase).invokeExact(Parent.ptr(), Base.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCXXAccessSpecifier(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_getCXXAccessSpecifier).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getBinaryOpcode(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getBinaryOpcode).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getBinaryOpcodeStr(SegmentAllocator $segmentAllocator, int Op)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getBinaryOpcodeStr).invokeExact($segmentAllocator, Op));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getStorageClass(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getStorageClass).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getNumOverloadedDecls(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getNumOverloadedDecls).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getOverloadedDecl(SegmentAllocator $segmentAllocator, CXCursor cursor, int index)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getOverloadedDecl).invokeExact($segmentAllocator, cursor.ptr(), index));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_getIBOutletCollectionType(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_getIBOutletCollectionType).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_visitChildren(CXCursor parent, MemorySegment visitor, MemorySegment client_data)
    {
        try {return (int) requireNonNull(this.clang_visitChildren).invokeExact(parent.ptr(), visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_visitChildrenWithBlock(CXCursor parent, MemorySegment block)
    {
        try {return (int) requireNonNull(this.clang_visitChildrenWithBlock).invokeExact(parent.ptr(), block);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCursorUSR(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCursorUSR).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCClass(SegmentAllocator $segmentAllocator, MemorySegment class_name)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCClass).invokeExact($segmentAllocator, class_name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCCategory(SegmentAllocator $segmentAllocator, MemorySegment class_name, MemorySegment category_name)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCCategory).invokeExact($segmentAllocator, class_name, category_name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCProtocol(SegmentAllocator $segmentAllocator, MemorySegment protocol_name)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCProtocol).invokeExact($segmentAllocator, protocol_name));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCIvar(SegmentAllocator $segmentAllocator, MemorySegment name, CXString classUSR)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCIvar).invokeExact($segmentAllocator, name, classUSR.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCMethod(SegmentAllocator $segmentAllocator, MemorySegment name, int isInstanceMethod, CXString classUSR)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCMethod).invokeExact($segmentAllocator, name, isInstanceMethod, classUSR.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_constructUSR_ObjCProperty(SegmentAllocator $segmentAllocator, MemorySegment property, CXString classUSR)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_constructUSR_ObjCProperty).invokeExact($segmentAllocator, property, classUSR.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCursorSpelling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCursorSpelling).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_Cursor_getSpellingNameRange(SegmentAllocator $segmentAllocator, CXCursor $arg1, int pieceIndex, int options)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_Cursor_getSpellingNameRange).invokeExact($segmentAllocator, $arg1.ptr(), pieceIndex, options));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_PrintingPolicy_getProperty(MemorySegment Policy, int Property)
    {
        try {return (int) requireNonNull(this.clang_PrintingPolicy_getProperty).invokeExact(Policy, Property);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_PrintingPolicy_setProperty(MemorySegment Policy, int Property, int Value)
    {
        try {requireNonNull(this.clang_PrintingPolicy_setProperty).invokeExact(Policy, Property, Value);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getCursorPrintingPolicy(CXCursor $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getCursorPrintingPolicy).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_PrintingPolicy_dispose(MemorySegment Policy)
    {
        try {requireNonNull(this.clang_PrintingPolicy_dispose).invokeExact(Policy);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCursorPrettyPrinted(SegmentAllocator $segmentAllocator, CXCursor Cursor, MemorySegment Policy)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCursorPrettyPrinted).invokeExact($segmentAllocator, Cursor.ptr(), Policy));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTypePrettyPrinted(SegmentAllocator $segmentAllocator, CXType T, MemorySegment cxPolicy)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTypePrettyPrinted).invokeExact($segmentAllocator, T.ptr(), cxPolicy));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getFullyQualifiedName(SegmentAllocator $segmentAllocator, CXType CT, MemorySegment Policy, int WithGlobalNsPrefix)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getFullyQualifiedName).invokeExact($segmentAllocator, CT.ptr(), Policy, WithGlobalNsPrefix));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCursorDisplayName(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCursorDisplayName).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCursorReferenced(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCursorReferenced).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCursorDefinition(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCursorDefinition).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_isCursorDefinition(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_isCursorDefinition).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getCanonicalCursor(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getCanonicalCursor).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getObjCSelectorIndex(CXCursor $arg1)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getObjCSelectorIndex).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isDynamicCall(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isDynamicCall).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXType clang_Cursor_getReceiverType(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXType((MemorySegment) requireNonNull(this.clang_Cursor_getReceiverType).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getObjCPropertyAttributes(CXCursor C, int reserved)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getObjCPropertyAttributes).invokeExact(C.ptr(), reserved);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getObjCPropertyGetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getObjCPropertyGetterName).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getObjCPropertySetterName(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getObjCPropertySetterName).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_getObjCDeclQualifiers(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_getObjCDeclQualifiers).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isObjCOptional(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isObjCOptional).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isVariadic(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isVariadic).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Cursor_isExternalSymbol(CXCursor C, MemorySegment language, MemorySegment definedIn, MemorySegment isGenerated)
    {
        try {return (int) requireNonNull(this.clang_Cursor_isExternalSymbol).invokeExact(C.ptr(), language, definedIn, isGenerated);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_Cursor_getCommentRange(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_Cursor_getCommentRange).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getRawCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getRawCommentText).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getBriefCommentText(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getBriefCommentText).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Cursor_getMangling(SegmentAllocator $segmentAllocator, CXCursor $arg1)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Cursor_getMangling).invokeExact($segmentAllocator, $arg1.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Cursor_getCXXManglings(CXCursor $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Cursor_getCXXManglings).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Cursor_getObjCManglings(CXCursor $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Cursor_getObjCManglings).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Cursor_getModule(CXCursor C)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Cursor_getModule).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getModuleForFile(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getModuleForFile).invokeExact($arg1, $arg2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Module_getASTFile(MemorySegment Module)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Module_getASTFile).invokeExact(Module);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Module_getParent(MemorySegment Module)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Module_getParent).invokeExact(Module);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Module_getName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Module_getName).invokeExact($segmentAllocator, Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_Module_getFullName(SegmentAllocator $segmentAllocator, MemorySegment Module)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_Module_getFullName).invokeExact($segmentAllocator, Module));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Module_isSystem(MemorySegment Module)
    {
        try {return (int) requireNonNull(this.clang_Module_isSystem).invokeExact(Module);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Module_getNumTopLevelHeaders(MemorySegment $arg1, MemorySegment Module)
    {
        try {return (int) requireNonNull(this.clang_Module_getNumTopLevelHeaders).invokeExact($arg1, Module);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Module_getTopLevelHeader(MemorySegment $arg1, MemorySegment Module, int Index)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Module_getTopLevelHeader).invokeExact($arg1, Module, Index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXConstructor_isConvertingConstructor(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXConstructor_isConvertingConstructor).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXConstructor_isCopyConstructor(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXConstructor_isCopyConstructor).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXConstructor_isDefaultConstructor(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXConstructor_isDefaultConstructor).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXConstructor_isMoveConstructor(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXConstructor_isMoveConstructor).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXField_isMutable(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXField_isMutable).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isDefaulted(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isDefaulted).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isDeleted(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isDeleted).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isPureVirtual(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isPureVirtual).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isStatic(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isStatic).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isVirtual(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isVirtual).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isCopyAssignmentOperator).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isMoveAssignmentOperator).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isExplicit(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isExplicit).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXRecord_isAbstract(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXRecord_isAbstract).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_EnumDecl_isScoped(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_EnumDecl_isScoped).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_CXXMethod_isConst(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_CXXMethod_isConst).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getTemplateCursorKind(CXCursor C)
    {
        try {return (int) requireNonNull(this.clang_getTemplateCursorKind).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXCursor clang_getSpecializedCursorTemplate(SegmentAllocator $segmentAllocator, CXCursor C)
    {
        try {return new CXCursor((MemorySegment) requireNonNull(this.clang_getSpecializedCursorTemplate).invokeExact($segmentAllocator, C.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getCursorReferenceNameRange(SegmentAllocator $segmentAllocator, CXCursor C, int NameFlags, int PieceIndex)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getCursorReferenceNameRange).invokeExact($segmentAllocator, C.ptr(), NameFlags, PieceIndex));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getToken(MemorySegment TU, CXSourceLocation Location)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getToken).invokeExact(TU, Location.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getTokenKind(CXToken $arg1)
    {
        try {return (int) requireNonNull(this.clang_getTokenKind).invokeExact($arg1.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getTokenSpelling(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getTokenSpelling).invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_getTokenLocation(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_getTokenLocation).invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceRange clang_getTokenExtent(SegmentAllocator $segmentAllocator, MemorySegment $arg1, CXToken $arg2)
    {
        try {return new CXSourceRange((MemorySegment) requireNonNull(this.clang_getTokenExtent).invokeExact($segmentAllocator, $arg1, $arg2.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_tokenize(MemorySegment TU, CXSourceRange Range, MemorySegment Tokens, MemorySegment NumTokens)
    {
        try {requireNonNull(this.clang_tokenize).invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_annotateTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens, MemorySegment Cursors)
    {
        try {requireNonNull(this.clang_annotateTokens).invokeExact(TU, Tokens, NumTokens, Cursors);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeTokens(MemorySegment TU, MemorySegment Tokens, int NumTokens)
    {
        try {requireNonNull(this.clang_disposeTokens).invokeExact(TU, Tokens, NumTokens);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCursorKindSpelling(SegmentAllocator $segmentAllocator, int Kind)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCursorKindSpelling).invokeExact($segmentAllocator, Kind));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getDefinitionSpellingAndExtent(CXCursor $arg1, MemorySegment startBuf, MemorySegment endBuf, MemorySegment startLine, MemorySegment startColumn, MemorySegment endLine, MemorySegment endColumn)
    {
        try {requireNonNull(this.clang_getDefinitionSpellingAndExtent).invokeExact($arg1.ptr(), startBuf, endBuf, startLine, startColumn, endLine, endColumn);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_enableStackTraces()
    {
        try {requireNonNull(this.clang_enableStackTraces).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_executeOnThread(MemorySegment fn, MemorySegment user_data, int stack_size)
    {
        try {requireNonNull(this.clang_executeOnThread).invokeExact(fn, user_data, stack_size);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCompletionChunkKind(MemorySegment completion_string, int chunk_number)
    {
        try {return (int) requireNonNull(this.clang_getCompletionChunkKind).invokeExact(completion_string, chunk_number);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCompletionChunkText(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int chunk_number)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCompletionChunkText).invokeExact($segmentAllocator, completion_string, chunk_number));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getCompletionChunkCompletionString(MemorySegment completion_string, int chunk_number)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getCompletionChunkCompletionString).invokeExact(completion_string, chunk_number);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getNumCompletionChunks(MemorySegment completion_string)
    {
        try {return (int) requireNonNull(this.clang_getNumCompletionChunks).invokeExact(completion_string);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCompletionPriority(MemorySegment completion_string)
    {
        try {return (int) requireNonNull(this.clang_getCompletionPriority).invokeExact(completion_string);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCompletionAvailability(MemorySegment completion_string)
    {
        try {return (int) requireNonNull(this.clang_getCompletionAvailability).invokeExact(completion_string);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCompletionNumAnnotations(MemorySegment completion_string)
    {
        try {return (int) requireNonNull(this.clang_getCompletionNumAnnotations).invokeExact(completion_string);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCompletionAnnotation(SegmentAllocator $segmentAllocator, MemorySegment completion_string, int annotation_number)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCompletionAnnotation).invokeExact($segmentAllocator, completion_string, annotation_number));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCompletionParent(SegmentAllocator $segmentAllocator, MemorySegment completion_string, MemorySegment kind)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCompletionParent).invokeExact($segmentAllocator, completion_string, kind));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCompletionBriefComment(SegmentAllocator $segmentAllocator, MemorySegment completion_string)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCompletionBriefComment).invokeExact($segmentAllocator, completion_string));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_getCursorCompletionString(CXCursor cursor)
    {
        try {return (MemorySegment) requireNonNull(this.clang_getCursorCompletionString).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCompletionNumFixIts(MemorySegment results, int completion_index)
    {
        try {return (int) requireNonNull(this.clang_getCompletionNumFixIts).invokeExact(results, completion_index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getCompletionFixIt(SegmentAllocator $segmentAllocator, MemorySegment results, int completion_index, int fixit_index, MemorySegment replacement_range)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getCompletionFixIt).invokeExact($segmentAllocator, results, completion_index, fixit_index, replacement_range));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_defaultCodeCompleteOptions()
    {
        try {return (int) requireNonNull(this.clang_defaultCodeCompleteOptions).invokeExact();}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_codeCompleteAt(MemorySegment TU, MemorySegment complete_filename, int complete_line, int complete_column, MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (MemorySegment) requireNonNull(this.clang_codeCompleteAt).invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_sortCodeCompletionResults(MemorySegment Results, int NumResults)
    {
        try {requireNonNull(this.clang_sortCodeCompletionResults).invokeExact(Results, NumResults);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_disposeCodeCompleteResults(MemorySegment Results)
    {
        try {requireNonNull(this.clang_disposeCodeCompleteResults).invokeExact(Results);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_codeCompleteGetNumDiagnostics(MemorySegment Results)
    {
        try {return (int) requireNonNull(this.clang_codeCompleteGetNumDiagnostics).invokeExact(Results);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_codeCompleteGetDiagnostic(MemorySegment Results, int Index)
    {
        try {return (MemorySegment) requireNonNull(this.clang_codeCompleteGetDiagnostic).invokeExact(Results, Index);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_codeCompleteGetContexts(MemorySegment Results)
    {
        try {return (long) requireNonNull(this.clang_codeCompleteGetContexts).invokeExact(Results);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_codeCompleteGetContainerKind(MemorySegment Results, MemorySegment IsIncomplete)
    {
        try {return (int) requireNonNull(this.clang_codeCompleteGetContainerKind).invokeExact(Results, IsIncomplete);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_codeCompleteGetContainerUSR(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_codeCompleteGetContainerUSR).invokeExact($segmentAllocator, Results));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_codeCompleteGetObjCSelector(SegmentAllocator $segmentAllocator, MemorySegment Results)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_codeCompleteGetObjCSelector).invokeExact($segmentAllocator, Results));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getClangVersion(SegmentAllocator $segmentAllocator)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getClangVersion).invokeExact($segmentAllocator));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_toggleCrashRecovery(int isEnabled)
    {
        try {requireNonNull(this.clang_toggleCrashRecovery).invokeExact(isEnabled);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_getInclusions(MemorySegment tu, MemorySegment visitor, MemorySegment client_data)
    {
        try {requireNonNull(this.clang_getInclusions).invokeExact(tu, visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_Cursor_Evaluate(CXCursor C)
    {
        try {return (MemorySegment) requireNonNull(this.clang_Cursor_Evaluate).invokeExact(C.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_EvalResult_getKind(MemorySegment E)
    {
        try {return (int) requireNonNull(this.clang_EvalResult_getKind).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_EvalResult_getAsInt(MemorySegment E)
    {
        try {return (int) requireNonNull(this.clang_EvalResult_getAsInt).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_EvalResult_getAsLongLong(MemorySegment E)
    {
        try {return (long) requireNonNull(this.clang_EvalResult_getAsLongLong).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_EvalResult_isUnsignedInt(MemorySegment E)
    {
        try {return (int) requireNonNull(this.clang_EvalResult_isUnsignedInt).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public long clang_EvalResult_getAsUnsigned(MemorySegment E)
    {
        try {return (long) requireNonNull(this.clang_EvalResult_getAsUnsigned).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public double clang_EvalResult_getAsDouble(MemorySegment E)
    {
        try {return (double) requireNonNull(this.clang_EvalResult_getAsDouble).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_EvalResult_getAsStr(MemorySegment E)
    {
        try {return (MemorySegment) requireNonNull(this.clang_EvalResult_getAsStr).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_EvalResult_dispose(MemorySegment E)
    {
        try {requireNonNull(this.clang_EvalResult_dispose).invokeExact(E);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_findReferencesInFile(CXCursor cursor, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return (int) requireNonNull(this.clang_findReferencesInFile).invokeExact(cursor.ptr(), file, visitor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_findIncludesInFile(MemorySegment TU, MemorySegment file, CXCursorAndRangeVisitor visitor)
    {
        try {return (int) requireNonNull(this.clang_findIncludesInFile).invokeExact(TU, file, visitor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_findReferencesInFileWithBlock(CXCursor $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return (int) requireNonNull(this.clang_findReferencesInFileWithBlock).invokeExact($arg1.ptr(), $arg2, $arg3);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_findIncludesInFileWithBlock(MemorySegment $arg1, MemorySegment $arg2, MemorySegment $arg3)
    {
        try {return (int) requireNonNull(this.clang_findIncludesInFileWithBlock).invokeExact($arg1, $arg2, $arg3);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_index_isEntityObjCContainerKind(int $arg1)
    {
        try {return (int) requireNonNull(this.clang_index_isEntityObjCContainerKind).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getObjCContainerDeclInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getObjCContainerDeclInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getObjCInterfaceDeclInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getObjCInterfaceDeclInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getObjCCategoryDeclInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getObjCCategoryDeclInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getObjCProtocolRefListInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getObjCProtocolRefListInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getObjCPropertyDeclInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getObjCPropertyDeclInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getIBOutletCollectionAttrInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getIBOutletCollectionAttrInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getCXXClassDeclInfo(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getCXXClassDeclInfo).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getClientContainer(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getClientContainer).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_index_setClientContainer(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {requireNonNull(this.clang_index_setClientContainer).invokeExact($arg1, $arg2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_index_getClientEntity(MemorySegment $arg1)
    {
        try {return (MemorySegment) requireNonNull(this.clang_index_getClientEntity).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_index_setClientEntity(MemorySegment $arg1, MemorySegment $arg2)
    {
        try {requireNonNull(this.clang_index_setClientEntity).invokeExact($arg1, $arg2);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public MemorySegment clang_IndexAction_create(MemorySegment CIdx)
    {
        try {return (MemorySegment) requireNonNull(this.clang_IndexAction_create).invokeExact(CIdx);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_IndexAction_dispose(MemorySegment $arg1)
    {
        try {requireNonNull(this.clang_IndexAction_dispose).invokeExact($arg1);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_indexSourceFile(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return (int) requireNonNull(this.clang_indexSourceFile).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_indexSourceFileFullArgv(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment source_filename, MemorySegment command_line_args, int num_command_line_args, MemorySegment unsaved_files, int num_unsaved_files, MemorySegment out_TU, int TU_options)
    {
        try {return (int) requireNonNull(this.clang_indexSourceFileFullArgv).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_indexTranslationUnit(MemorySegment $arg1, MemorySegment client_data, MemorySegment index_callbacks, int index_callbacks_size, int index_options, MemorySegment $arg6)
    {
        try {return (int) requireNonNull(this.clang_indexTranslationUnit).invokeExact($arg1, client_data, index_callbacks, index_callbacks_size, index_options, $arg6);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public void clang_indexLoc_getFileLocation(CXIdxLoc loc, MemorySegment indexFile, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        try {requireNonNull(this.clang_indexLoc_getFileLocation).invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXSourceLocation clang_indexLoc_getCXSourceLocation(SegmentAllocator $segmentAllocator, CXIdxLoc loc)
    {
        try {return new CXSourceLocation((MemorySegment) requireNonNull(this.clang_indexLoc_getCXSourceLocation).invokeExact($segmentAllocator, loc.ptr()));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_Type_visitFields(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return (int) requireNonNull(this.clang_Type_visitFields).invokeExact(T.ptr(), visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_visitCXXBaseClasses(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return (int) requireNonNull(this.clang_visitCXXBaseClasses).invokeExact(T.ptr(), visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_visitCXXMethods(CXType T, MemorySegment visitor, MemorySegment client_data)
    {
        try {return (int) requireNonNull(this.clang_visitCXXMethods).invokeExact(T.ptr(), visitor, client_data);}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getBinaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getBinaryOperatorKindSpelling).invokeExact($segmentAllocator, kind));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorBinaryOperatorKind(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorBinaryOperatorKind).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public CXString clang_getUnaryOperatorKindSpelling(SegmentAllocator $segmentAllocator, int kind)
    {
        try {return new CXString((MemorySegment) requireNonNull(this.clang_getUnaryOperatorKindSpelling).invokeExact($segmentAllocator, kind));}
        catch (Throwable _) {throw new AssertionError();}
    }

    @Override
    public int clang_getCursorUnaryOperatorKind(CXCursor cursor)
    {
        try {return (int) requireNonNull(this.clang_getCursorUnaryOperatorKind).invokeExact(cursor.ptr());}
        catch (Throwable _) {throw new AssertionError();}
    }
}
