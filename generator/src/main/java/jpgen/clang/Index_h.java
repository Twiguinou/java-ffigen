package jpgen.clang;

public final class Index_h
{private Index_h() {}

	static final java.lang.foreign.Linker gSystemLinker;
	private static final java.lang.foreign.SymbolLookup gLibLookup;

	private static final java.lang.invoke.MethodHandle MTD$clang_createIndex;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeIndex;
	private static final java.lang.invoke.MethodHandle MTD$clang_createIndexWithOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_setGlobalOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_getGlobalOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_setInvocationEmissionPathOption;
	private static final java.lang.invoke.MethodHandle MTD$clang_isFileMultipleIncludeGuarded;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFileContents;
	private static final java.lang.invoke.MethodHandle MTD$clang_getLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getLocationForOffset;
	private static final java.lang.invoke.MethodHandle MTD$clang_getSkippedRanges;
	private static final java.lang.invoke.MethodHandle MTD$clang_getAllSkippedRanges;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumDiagnostics;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnostic;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSetFromTU;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnitFromSourceFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnit2;
	private static final java.lang.invoke.MethodHandle MTD$clang_defaultEditingTranslationUnitOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit2;
	private static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit2FullArgv;
	private static final java.lang.invoke.MethodHandle MTD$clang_defaultSaveOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_saveTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_suspendTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_defaultReparseOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_reparseTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTUResourceUsageName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCXTUResourceUsage;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeCXTUResourceUsage;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitTargetInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_getTriple;
	private static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_getPointerWidth;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNullCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_equalCursors;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isNull;
	private static final java.lang.invoke.MethodHandle MTD$clang_hashCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_isDeclaration;
	private static final java.lang.invoke.MethodHandle MTD$clang_isInvalidDeclaration;
	private static final java.lang.invoke.MethodHandle MTD$clang_isReference;
	private static final java.lang.invoke.MethodHandle MTD$clang_isExpression;
	private static final java.lang.invoke.MethodHandle MTD$clang_isStatement;
	private static final java.lang.invoke.MethodHandle MTD$clang_isAttribute;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasAttrs;
	private static final java.lang.invoke.MethodHandle MTD$clang_isInvalid;
	private static final java.lang.invoke.MethodHandle MTD$clang_isTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_isPreprocessing;
	private static final java.lang.invoke.MethodHandle MTD$clang_isUnexposed;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorLinkage;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorVisibility;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorAvailability;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorPlatformAvailability;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeCXPlatformAvailability;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getVarDeclInitializer;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasVarDeclGlobalStorage;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasVarDeclExternalStorage;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorLanguage;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorTLSKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_createCXCursorSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeCXCursorSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXCursorSet_contains;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXCursorSet_insert;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorSemanticParent;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorLexicalParent;
	private static final java.lang.invoke.MethodHandle MTD$clang_getOverriddenCursors;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeOverriddenCursors;
	private static final java.lang.invoke.MethodHandle MTD$clang_getIncludedFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorExtent;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTypeSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTypedefDeclUnderlyingType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getEnumDeclIntegerType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getEnumConstantDeclValue;
	private static final java.lang.invoke.MethodHandle MTD$clang_getEnumConstantDeclUnsignedValue;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isBitField;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFieldDeclBitWidth;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getNumArguments;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getArgument;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getNumTemplateArguments;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentValue;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentUnsignedValue;
	private static final java.lang.invoke.MethodHandle MTD$clang_equalTypes;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCanonicalType;
	private static final java.lang.invoke.MethodHandle MTD$clang_isConstQualifiedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isMacroFunctionLike;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isMacroBuiltin;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isFunctionInlined;
	private static final java.lang.invoke.MethodHandle MTD$clang_isVolatileQualifiedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_isRestrictQualifiedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getAddressSpace;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTypedefName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getPointeeType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getUnqualifiedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNonReferenceType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTypeDeclaration;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDeclObjCTypeEncoding;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCEncoding;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTypeKindSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFunctionTypeCallingConv;
	private static final java.lang.invoke.MethodHandle MTD$clang_getResultType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getExceptionSpecificationType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumArgTypes;
	private static final java.lang.invoke.MethodHandle MTD$clang_getArgType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCObjectBaseType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumObjCProtocolRefs;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCProtocolDecl;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumObjCTypeArgs;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCTypeArg;
	private static final java.lang.invoke.MethodHandle MTD$clang_isFunctionTypeVariadic;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorResultType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorExceptionSpecificationType;
	private static final java.lang.invoke.MethodHandle MTD$clang_isPODType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getElementType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumElements;
	private static final java.lang.invoke.MethodHandle MTD$clang_getArrayElementType;
	private static final java.lang.invoke.MethodHandle MTD$clang_getArraySize;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getNamedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_isTransparentTagTypedef;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getNullability;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getAlignOf;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getClassType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getSizeOf;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getOffsetOf;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getModifiedType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getValueType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getOffsetOfField;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isAnonymous;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isAnonymousRecordDecl;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isInlineNamespace;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumTemplateArguments;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getTemplateArgumentAsType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_getCXXRefQualifier;
	private static final java.lang.invoke.MethodHandle MTD$clang_isVirtualBase;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCXXAccessSpecifier;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getStorageClass;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumOverloadedDecls;
	private static final java.lang.invoke.MethodHandle MTD$clang_getOverloadedDecl;
	private static final java.lang.invoke.MethodHandle MTD$clang_getIBOutletCollectionType;
	private static final java.lang.invoke.MethodHandle MTD$clang_visitChildren;
	private static final java.lang.invoke.MethodHandle MTD$clang_visitChildrenWithBlock;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorUSR;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCClass;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCCategory;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCProtocol;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCIvar;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCMethod;
	private static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCProperty;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getSpellingNameRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_getProperty;
	private static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_setProperty;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorPrintingPolicy;
	private static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorPrettyPrinted;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorDisplayName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorReferenced;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorDefinition;
	private static final java.lang.invoke.MethodHandle MTD$clang_isCursorDefinition;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCanonicalCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCSelectorIndex;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isDynamicCall;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getReceiverType;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertyAttributes;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertyGetterName;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertySetterName;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCDeclQualifiers;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isObjCOptional;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isVariadic;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isExternalSymbol;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getCommentRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getRawCommentText;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getBriefCommentText;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getMangling;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getCXXManglings;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCManglings;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getModule;
	private static final java.lang.invoke.MethodHandle MTD$clang_getModuleForFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getASTFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getParent;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getName;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getFullName;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_isSystem;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getNumTopLevelHeaders;
	private static final java.lang.invoke.MethodHandle MTD$clang_Module_getTopLevelHeader;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isConvertingConstructor;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isCopyConstructor;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isDefaultConstructor;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isMoveConstructor;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXField_isMutable;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isDefaulted;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isDeleted;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isPureVirtual;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isStatic;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isVirtual;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isCopyAssignmentOperator;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isMoveAssignmentOperator;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isExplicit;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXRecord_isAbstract;
	private static final java.lang.invoke.MethodHandle MTD$clang_EnumDecl_isScoped;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isConst;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTemplateCursorKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_getSpecializedCursorTemplate;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorReferenceNameRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_getToken;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTokenKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTokenSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTokenLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getTokenExtent;
	private static final java.lang.invoke.MethodHandle MTD$clang_tokenize;
	private static final java.lang.invoke.MethodHandle MTD$clang_annotateTokens;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeTokens;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorKindSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDefinitionSpellingAndExtent;
	private static final java.lang.invoke.MethodHandle MTD$clang_enableStackTraces;
	private static final java.lang.invoke.MethodHandle MTD$clang_executeOnThread;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkText;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkCompletionString;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumCompletionChunks;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionPriority;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionAvailability;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionNumAnnotations;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionAnnotation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionParent;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionBriefComment;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorCompletionString;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionNumFixIts;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCompletionFixIt;
	private static final java.lang.invoke.MethodHandle MTD$clang_defaultCodeCompleteOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteAt;
	private static final java.lang.invoke.MethodHandle MTD$clang_sortCodeCompletionResults;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeCodeCompleteResults;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetNumDiagnostics;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetDiagnostic;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContexts;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContainerKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContainerUSR;
	private static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetObjCSelector;
	private static final java.lang.invoke.MethodHandle MTD$clang_getClangVersion;
	private static final java.lang.invoke.MethodHandle MTD$clang_toggleCrashRecovery;
	private static final java.lang.invoke.MethodHandle MTD$clang_getInclusions;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_Evaluate;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsInt;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsLongLong;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_isUnsignedInt;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsUnsigned;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsDouble;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsStr;
	private static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_getRemappings;
	private static final java.lang.invoke.MethodHandle MTD$clang_getRemappingsFromFileList;
	private static final java.lang.invoke.MethodHandle MTD$clang_remap_getNumFiles;
	private static final java.lang.invoke.MethodHandle MTD$clang_remap_getFilenames;
	private static final java.lang.invoke.MethodHandle MTD$clang_remap_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_findReferencesInFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_findIncludesInFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_findReferencesInFileWithBlock;
	private static final java.lang.invoke.MethodHandle MTD$clang_findIncludesInFileWithBlock;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_isEntityObjCContainerKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCContainerDeclInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCInterfaceDeclInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCCategoryDeclInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCProtocolRefListInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCPropertyDeclInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getIBOutletCollectionAttrInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getCXXClassDeclInfo;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getClientContainer;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_setClientContainer;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_getClientEntity;
	private static final java.lang.invoke.MethodHandle MTD$clang_index_setClientEntity;
	private static final java.lang.invoke.MethodHandle MTD$clang_IndexAction_create;
	private static final java.lang.invoke.MethodHandle MTD$clang_IndexAction_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_indexSourceFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_indexSourceFileFullArgv;
	private static final java.lang.invoke.MethodHandle MTD$clang_indexTranslationUnit;
	private static final java.lang.invoke.MethodHandle MTD$clang_indexLoc_getFileLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_indexLoc_getCXSourceLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_Type_visitFields;
	private static final java.lang.invoke.MethodHandle MTD$clang_getBinaryOperatorKindSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorBinaryOperatorKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_getUnaryOperatorKindSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCursorUnaryOperatorKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_getCString;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeString;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeStringSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_create;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_insertTextBefore;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_replaceText;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_removeText;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_overwriteChangedFiles;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_writeMainFileToStdOut;
	private static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_install_aborting_llvm_fatal_error_handler;
	private static final java.lang.invoke.MethodHandle MTD$clang_uninstall_llvm_fatal_error_handler;
	private static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getParsedComment;
	private static final java.lang.invoke.MethodHandle MTD$clang_Comment_getKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_Comment_getNumChildren;
	private static final java.lang.invoke.MethodHandle MTD$clang_Comment_getChild;
	private static final java.lang.invoke.MethodHandle MTD$clang_Comment_isWhitespace;
	private static final java.lang.invoke.MethodHandle MTD$clang_InlineContentComment_hasTrailingNewline;
	private static final java.lang.invoke.MethodHandle MTD$clang_TextComment_getText;
	private static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getCommandName;
	private static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getRenderKind;
	private static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getNumArgs;
	private static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getArgText;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLTagComment_getTagName;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTagComment_isSelfClosing;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getNumAttrs;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getAttrName;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getAttrValue;
	private static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getCommandName;
	private static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getNumArgs;
	private static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getArgText;
	private static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getParagraph;
	private static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getParamName;
	private static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_isParamIndexValid;
	private static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getParamIndex;
	private static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_isDirectionExplicit;
	private static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getDirection;
	private static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getParamName;
	private static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_isParamPositionValid;
	private static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getDepth;
	private static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getIndex;
	private static final java.lang.invoke.MethodHandle MTD$clang_VerbatimBlockLineComment_getText;
	private static final java.lang.invoke.MethodHandle MTD$clang_VerbatimLineComment_getText;
	private static final java.lang.invoke.MethodHandle MTD$clang_HTMLTagComment_getAsString;
	private static final java.lang.invoke.MethodHandle MTD$clang_FullComment_getAsHTML;
	private static final java.lang.invoke.MethodHandle MTD$clang_FullComment_getAsXML;
	private static final java.lang.invoke.MethodHandle MTD$clang_createAPISet;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeAPISet;
	private static final java.lang.invoke.MethodHandle MTD$clang_getSymbolGraphForUSR;
	private static final java.lang.invoke.MethodHandle MTD$clang_getSymbolGraphForCursor;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNullLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_equalLocations;
	private static final java.lang.invoke.MethodHandle MTD$clang_Location_isInSystemHeader;
	private static final java.lang.invoke.MethodHandle MTD$clang_Location_isFromMainFile;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNullRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_getRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_equalRanges;
	private static final java.lang.invoke.MethodHandle MTD$clang_Range_isNull;
	private static final java.lang.invoke.MethodHandle MTD$clang_getExpansionLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getPresumedLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getInstantiationLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getSpellingLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFileLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getRangeStart;
	private static final java.lang.invoke.MethodHandle MTD$clang_getRangeEnd;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeSourceRangeList;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFileName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFileTime;
	private static final java.lang.invoke.MethodHandle MTD$clang_getFileUniqueID;
	private static final java.lang.invoke.MethodHandle MTD$clang_File_isEqual;
	private static final java.lang.invoke.MethodHandle MTD$clang_File_tryGetRealPathName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getNumDiagnosticsInSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticInSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_loadDiagnostics;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeDiagnosticSet;
	private static final java.lang.invoke.MethodHandle MTD$clang_getChildDiagnostics;
	private static final java.lang.invoke.MethodHandle MTD$clang_disposeDiagnostic;
	private static final java.lang.invoke.MethodHandle MTD$clang_formatDiagnostic;
	private static final java.lang.invoke.MethodHandle MTD$clang_defaultDiagnosticDisplayOptions;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSeverity;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticLocation;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSpelling;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticOption;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategory;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategoryName;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategoryText;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticNumRanges;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticRange;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticNumFixIts;
	private static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticFixIt;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_fromDirectory;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_getCompileCommands;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_getAllCompileCommands;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_dispose;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_getSize;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_getCommand;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getDirectory;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getFilename;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getNumArgs;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getArg;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getNumMappedSources;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getMappedSourcePath;
	private static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getMappedSourceContent;

	public static java.lang.foreign.MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_createIndex.invokeExact(excludeDeclarationsFromPCH, displayDiagnostics);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeIndex(java.lang.foreign.MemorySegment index)
	{
		try {MTD$clang_disposeIndex.invokeExact(index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_createIndexWithOptions(java.lang.foreign.MemorySegment options)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_createIndexWithOptions.invokeExact(options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXIndex_setGlobalOptions(java.lang.foreign.MemorySegment arg1, int options)
	{
		try {MTD$clang_CXIndex_setGlobalOptions.invokeExact(arg1, options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXIndex_getGlobalOptions(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_CXIndex_getGlobalOptions.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXIndex_setInvocationEmissionPathOption(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Path)
	{
		try {MTD$clang_CXIndex_setInvocationEmissionPathOption.invokeExact(arg1, Path);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isFileMultipleIncludeGuarded(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
	{
		try {return (int)MTD$clang_isFileMultipleIncludeGuarded.invokeExact(tu, file);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getFile(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file_name)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getFile.invokeExact(tu, file_name);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getFileContents(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment size)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getFileContents.invokeExact(tu, file, size);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int line, int column)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getLocation.invokeExact(allocator, tu, file, line, column));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getLocationForOffset(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int offset)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getLocationForOffset.invokeExact(allocator, tu, file, offset));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getSkippedRanges(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getSkippedRanges.invokeExact(tu, file);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getAllSkippedRanges(java.lang.foreign.MemorySegment tu)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getAllSkippedRanges.invokeExact(tu);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getNumDiagnostics(java.lang.foreign.MemorySegment Unit)
	{
		try {return (int)MTD$clang_getNumDiagnostics.invokeExact(Unit);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getDiagnostic(java.lang.foreign.MemorySegment Unit, int Index)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnostic.invokeExact(Unit, Index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getDiagnosticSetFromTU(java.lang.foreign.MemorySegment Unit)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticSetFromTU.invokeExact(Unit);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getTranslationUnitSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment CTUnit)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitSpelling.invokeExact(allocator, CTUnit));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_createTranslationUnitFromSourceFile(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, int num_clang_command_line_args, java.lang.foreign.MemorySegment clang_command_line_args, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_createTranslationUnitFromSourceFile.invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_createTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_createTranslationUnit.invokeExact(CIdx, ast_filename);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_createTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename, java.lang.foreign.MemorySegment out_TU)
	{
		try {return (int)MTD$clang_createTranslationUnit2.invokeExact(CIdx, ast_filename, out_TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_defaultEditingTranslationUnitOptions()
	{
		try {return (int)MTD$clang_defaultEditingTranslationUnitOptions.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_parseTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_parseTranslationUnit.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_parseTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
	{
		try {return (int)MTD$clang_parseTranslationUnit2.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_parseTranslationUnit2FullArgv(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
	{
		try {return (int)MTD$clang_parseTranslationUnit2FullArgv.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_defaultSaveOptions(java.lang.foreign.MemorySegment TU)
	{
		try {return (int)MTD$clang_defaultSaveOptions.invokeExact(TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_saveTranslationUnit(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment FileName, int options)
	{
		try {return (int)MTD$clang_saveTranslationUnit.invokeExact(TU, FileName, options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_suspendTranslationUnit(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_suspendTranslationUnit.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeTranslationUnit(java.lang.foreign.MemorySegment arg1)
	{
		try {MTD$clang_disposeTranslationUnit.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_defaultReparseOptions(java.lang.foreign.MemorySegment TU)
	{
		try {return (int)MTD$clang_defaultReparseOptions.invokeExact(TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_reparseTranslationUnit(java.lang.foreign.MemorySegment TU, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files, int options)
	{
		try {return (int)MTD$clang_reparseTranslationUnit.invokeExact(TU, num_unsaved_files, unsaved_files, options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getTUResourceUsageName(int kind)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getTUResourceUsageName.invokeExact(kind);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXTUResourceUsage clang_getCXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment TU)
	{
		try {return new CXTUResourceUsage((java.lang.foreign.MemorySegment)MTD$clang_getCXTUResourceUsage.invokeExact(allocator, TU));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)
	{
		try {MTD$clang_disposeCXTUResourceUsage.invokeExact(usage.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getTranslationUnitTargetInfo(java.lang.foreign.MemorySegment CTUnit)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitTargetInfo.invokeExact(CTUnit);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_TargetInfo_dispose(java.lang.foreign.MemorySegment Info)
	{
		try {MTD$clang_TargetInfo_dispose.invokeExact(Info);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_TargetInfo_getTriple(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Info)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_TargetInfo_getTriple.invokeExact(allocator, Info));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_TargetInfo_getPointerWidth(java.lang.foreign.MemorySegment Info)
	{
		try {return (int)MTD$clang_TargetInfo_getPointerWidth.invokeExact(Info);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getNullCursor(java.lang.foreign.SegmentAllocator allocator)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getNullCursor.invokeExact(allocator));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getTranslationUnitCursor(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitCursor.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_equalCursors(CXCursor arg1, CXCursor arg2)
	{
		try {return (int)MTD$clang_equalCursors.invokeExact(arg1.ptr(), arg2.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isNull(CXCursor cursor)
	{
		try {return (int)MTD$clang_Cursor_isNull.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_hashCursor(CXCursor arg1)
	{
		try {return (int)MTD$clang_hashCursor.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorKind(CXCursor arg1)
	{
		try {return (int)MTD$clang_getCursorKind.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isDeclaration(int arg1)
	{
		try {return (int)MTD$clang_isDeclaration.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isInvalidDeclaration(CXCursor arg1)
	{
		try {return (int)MTD$clang_isInvalidDeclaration.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isReference(int arg1)
	{
		try {return (int)MTD$clang_isReference.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isExpression(int arg1)
	{
		try {return (int)MTD$clang_isExpression.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isStatement(int arg1)
	{
		try {return (int)MTD$clang_isStatement.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isAttribute(int arg1)
	{
		try {return (int)MTD$clang_isAttribute.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_hasAttrs(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_hasAttrs.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isInvalid(int arg1)
	{
		try {return (int)MTD$clang_isInvalid.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isTranslationUnit(int arg1)
	{
		try {return (int)MTD$clang_isTranslationUnit.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isPreprocessing(int arg1)
	{
		try {return (int)MTD$clang_isPreprocessing.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isUnexposed(int arg1)
	{
		try {return (int)MTD$clang_isUnexposed.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorLinkage(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorLinkage.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorVisibility(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorVisibility.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorAvailability(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorAvailability.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorPlatformAvailability(CXCursor cursor, java.lang.foreign.MemorySegment always_deprecated, java.lang.foreign.MemorySegment deprecated_message, java.lang.foreign.MemorySegment always_unavailable, java.lang.foreign.MemorySegment unavailable_message, java.lang.foreign.MemorySegment availability, int availability_size)
	{
		try {return (int)MTD$clang_getCursorPlatformAvailability.invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeCXPlatformAvailability(java.lang.foreign.MemorySegment availability)
	{
		try {MTD$clang_disposeCXPlatformAvailability.invokeExact(availability);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_Cursor_getVarDeclInitializer(java.lang.foreign.SegmentAllocator allocator, CXCursor cursor)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getVarDeclInitializer.invokeExact(allocator, cursor.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)
	{
		try {return (int)MTD$clang_Cursor_hasVarDeclGlobalStorage.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)
	{
		try {return (int)MTD$clang_Cursor_hasVarDeclExternalStorage.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorLanguage(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorLanguage.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorTLSKind(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorTLSKind.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Cursor_getTranslationUnit(CXCursor arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getTranslationUnit.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_createCXCursorSet()
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_createCXCursorSet.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeCXCursorSet(java.lang.foreign.MemorySegment cset)
	{
		try {MTD$clang_disposeCXCursorSet.invokeExact(cset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXCursorSet_contains(java.lang.foreign.MemorySegment cset, CXCursor cursor)
	{
		try {return (int)MTD$clang_CXCursorSet_contains.invokeExact(cset, cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXCursorSet_insert(java.lang.foreign.MemorySegment cset, CXCursor cursor)
	{
		try {return (int)MTD$clang_CXCursorSet_insert.invokeExact(cset, cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCursorSemanticParent(java.lang.foreign.SegmentAllocator allocator, CXCursor cursor)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorSemanticParent.invokeExact(allocator, cursor.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCursorLexicalParent(java.lang.foreign.SegmentAllocator allocator, CXCursor cursor)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorLexicalParent.invokeExact(allocator, cursor.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getOverriddenCursors(CXCursor cursor, java.lang.foreign.MemorySegment overridden, java.lang.foreign.MemorySegment num_overridden)
	{
		try {MTD$clang_getOverriddenCursors.invokeExact(cursor.ptr(), overridden, num_overridden);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeOverriddenCursors(java.lang.foreign.MemorySegment overridden)
	{
		try {MTD$clang_disposeOverriddenCursors.invokeExact(overridden);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getIncludedFile(CXCursor cursor)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getIncludedFile.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCursor(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, CXSourceLocation arg2)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursor.invokeExact(allocator, arg1, arg2.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getCursorLocation(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getCursorLocation.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getCursorExtent(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getCursorExtent.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getCursorType(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getCursorType.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getTypeSpelling(java.lang.foreign.SegmentAllocator allocator, CXType CT)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypeSpelling.invokeExact(allocator, CT.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getTypedefDeclUnderlyingType(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getTypedefDeclUnderlyingType.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getEnumDeclIntegerType(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getEnumDeclIntegerType.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_getEnumConstantDeclValue(CXCursor C)
	{
		try {return (long)MTD$clang_getEnumConstantDeclValue.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C)
	{
		try {return (long)MTD$clang_getEnumConstantDeclUnsignedValue.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isBitField(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isBitField.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getFieldDeclBitWidth(CXCursor C)
	{
		try {return (int)MTD$clang_getFieldDeclBitWidth.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getNumArguments(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_getNumArguments.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_Cursor_getArgument(java.lang.foreign.SegmentAllocator allocator, CXCursor C, int i)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getArgument.invokeExact(allocator, C.ptr(), i));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getNumTemplateArguments(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_getNumTemplateArguments.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getTemplateArgumentKind(CXCursor C, int I)
	{
		try {return (int)MTD$clang_Cursor_getTemplateArgumentKind.invokeExact(C.ptr(), I);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Cursor_getTemplateArgumentType(java.lang.foreign.SegmentAllocator allocator, CXCursor C, int I)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getTemplateArgumentType.invokeExact(allocator, C.ptr(), I));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Cursor_getTemplateArgumentValue(CXCursor C, int I)
	{
		try {return (long)MTD$clang_Cursor_getTemplateArgumentValue.invokeExact(C.ptr(), I);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, int I)
	{
		try {return (long)MTD$clang_Cursor_getTemplateArgumentUnsignedValue.invokeExact(C.ptr(), I);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_equalTypes(CXType A, CXType B)
	{
		try {return (int)MTD$clang_equalTypes.invokeExact(A.ptr(), B.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getCanonicalType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getCanonicalType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isConstQualifiedType(CXType T)
	{
		try {return (int)MTD$clang_isConstQualifiedType.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isMacroFunctionLike(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isMacroFunctionLike.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isMacroBuiltin(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isMacroBuiltin.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isFunctionInlined(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isFunctionInlined.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isVolatileQualifiedType(CXType T)
	{
		try {return (int)MTD$clang_isVolatileQualifiedType.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isRestrictQualifiedType(CXType T)
	{
		try {return (int)MTD$clang_isRestrictQualifiedType.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getAddressSpace(CXType T)
	{
		try {return (int)MTD$clang_getAddressSpace.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getTypedefName(java.lang.foreign.SegmentAllocator allocator, CXType CT)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypedefName.invokeExact(allocator, CT.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getPointeeType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getPointeeType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getUnqualifiedType(java.lang.foreign.SegmentAllocator allocator, CXType CT)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getUnqualifiedType.invokeExact(allocator, CT.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getNonReferenceType(java.lang.foreign.SegmentAllocator allocator, CXType CT)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getNonReferenceType.invokeExact(allocator, CT.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getTypeDeclaration(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getTypeDeclaration.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDeclObjCTypeEncoding(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDeclObjCTypeEncoding.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Type_getObjCEncoding(java.lang.foreign.SegmentAllocator allocator, CXType type)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCEncoding.invokeExact(allocator, type.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getTypeKindSpelling(java.lang.foreign.SegmentAllocator allocator, int K)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypeKindSpelling.invokeExact(allocator, K));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getFunctionTypeCallingConv(CXType T)
	{
		try {return (int)MTD$clang_getFunctionTypeCallingConv.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getResultType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getResultType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getExceptionSpecificationType(CXType T)
	{
		try {return (int)MTD$clang_getExceptionSpecificationType.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getNumArgTypes(CXType T)
	{
		try {return (int)MTD$clang_getNumArgTypes.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getArgType(java.lang.foreign.SegmentAllocator allocator, CXType T, int i)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getArgType.invokeExact(allocator, T.ptr(), i));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getObjCObjectBaseType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCObjectBaseType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_getNumObjCProtocolRefs(CXType T)
	{
		try {return (int)MTD$clang_Type_getNumObjCProtocolRefs.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_Type_getObjCProtocolDecl(java.lang.foreign.SegmentAllocator allocator, CXType T, int i)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCProtocolDecl.invokeExact(allocator, T.ptr(), i));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_getNumObjCTypeArgs(CXType T)
	{
		try {return (int)MTD$clang_Type_getNumObjCTypeArgs.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getObjCTypeArg(java.lang.foreign.SegmentAllocator allocator, CXType T, int i)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCTypeArg.invokeExact(allocator, T.ptr(), i));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isFunctionTypeVariadic(CXType T)
	{
		try {return (int)MTD$clang_isFunctionTypeVariadic.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getCursorResultType(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getCursorResultType.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorExceptionSpecificationType(CXCursor C)
	{
		try {return (int)MTD$clang_getCursorExceptionSpecificationType.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isPODType(CXType T)
	{
		try {return (int)MTD$clang_isPODType.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getElementType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getElementType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_getNumElements(CXType T)
	{
		try {return (long)MTD$clang_getNumElements.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getArrayElementType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getArrayElementType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_getArraySize(CXType T)
	{
		try {return (long)MTD$clang_getArraySize.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getNamedType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getNamedType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_isTransparentTagTypedef(CXType T)
	{
		try {return (int)MTD$clang_Type_isTransparentTagTypedef.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_getNullability(CXType T)
	{
		try {return (int)MTD$clang_Type_getNullability.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Type_getAlignOf(CXType T)
	{
		try {return (long)MTD$clang_Type_getAlignOf.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getClassType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getClassType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Type_getSizeOf(CXType T)
	{
		try {return (long)MTD$clang_Type_getSizeOf.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Type_getOffsetOf(CXType T, java.lang.foreign.MemorySegment S)
	{
		try {return (long)MTD$clang_Type_getOffsetOf.invokeExact(T.ptr(), S);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getModifiedType(java.lang.foreign.SegmentAllocator allocator, CXType T)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getModifiedType.invokeExact(allocator, T.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getValueType(java.lang.foreign.SegmentAllocator allocator, CXType CT)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getValueType.invokeExact(allocator, CT.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_Cursor_getOffsetOfField(CXCursor C)
	{
		try {return (long)MTD$clang_Cursor_getOffsetOfField.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isAnonymous(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isAnonymous.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isAnonymousRecordDecl(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isAnonymousRecordDecl.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isInlineNamespace(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isInlineNamespace.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_getNumTemplateArguments(CXType T)
	{
		try {return (int)MTD$clang_Type_getNumTemplateArguments.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Type_getTemplateArgumentAsType(java.lang.foreign.SegmentAllocator allocator, CXType T, int i)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getTemplateArgumentAsType.invokeExact(allocator, T.ptr(), i));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_getCXXRefQualifier(CXType T)
	{
		try {return (int)MTD$clang_Type_getCXXRefQualifier.invokeExact(T.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isVirtualBase(CXCursor arg1)
	{
		try {return (int)MTD$clang_isVirtualBase.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCXXAccessSpecifier(CXCursor arg1)
	{
		try {return (int)MTD$clang_getCXXAccessSpecifier.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getStorageClass(CXCursor arg1)
	{
		try {return (int)MTD$clang_Cursor_getStorageClass.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getNumOverloadedDecls(CXCursor cursor)
	{
		try {return (int)MTD$clang_getNumOverloadedDecls.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getOverloadedDecl(java.lang.foreign.SegmentAllocator allocator, CXCursor cursor, int index)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getOverloadedDecl.invokeExact(allocator, cursor.ptr(), index));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_getIBOutletCollectionType(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_getIBOutletCollectionType.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_visitChildren(CXCursor parent, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
	{
		try {return (int)MTD$clang_visitChildren.invokeExact(parent.ptr(), visitor, client_data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_visitChildrenWithBlock(CXCursor parent, java.lang.foreign.MemorySegment block)
	{
		try {return (int)MTD$clang_visitChildrenWithBlock.invokeExact(parent.ptr(), block);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCursorUSR(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorUSR.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCClass(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment class_name)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCClass.invokeExact(allocator, class_name));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCCategory(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment class_name, java.lang.foreign.MemorySegment category_name)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCCategory.invokeExact(allocator, class_name, category_name));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCProtocol(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment protocol_name)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCProtocol.invokeExact(allocator, protocol_name));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCIvar(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment name, CXString classUSR)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCIvar.invokeExact(allocator, name, classUSR.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCMethod(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment name, int isInstanceMethod, CXString classUSR)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCMethod.invokeExact(allocator, name, isInstanceMethod, classUSR.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_constructUSR_ObjCProperty(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment property, CXString classUSR)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCProperty.invokeExact(allocator, property, classUSR.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCursorSpelling(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorSpelling.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_Cursor_getSpellingNameRange(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1, int pieceIndex, int options)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getSpellingNameRange.invokeExact(allocator, arg1.ptr(), pieceIndex, options));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_PrintingPolicy_getProperty(java.lang.foreign.MemorySegment Policy, int Property)
	{
		try {return (int)MTD$clang_PrintingPolicy_getProperty.invokeExact(Policy, Property);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_PrintingPolicy_setProperty(java.lang.foreign.MemorySegment Policy, int Property, int Value)
	{
		try {MTD$clang_PrintingPolicy_setProperty.invokeExact(Policy, Property, Value);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getCursorPrintingPolicy(CXCursor arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getCursorPrintingPolicy.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_PrintingPolicy_dispose(java.lang.foreign.MemorySegment Policy)
	{
		try {MTD$clang_PrintingPolicy_dispose.invokeExact(Policy);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCursorPrettyPrinted(java.lang.foreign.SegmentAllocator allocator, CXCursor Cursor, java.lang.foreign.MemorySegment Policy)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorPrettyPrinted.invokeExact(allocator, Cursor.ptr(), Policy));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCursorDisplayName(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorDisplayName.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCursorReferenced(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorReferenced.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCursorDefinition(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorDefinition.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_isCursorDefinition(CXCursor arg1)
	{
		try {return (int)MTD$clang_isCursorDefinition.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getCanonicalCursor(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCanonicalCursor.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getObjCSelectorIndex(CXCursor arg1)
	{
		try {return (int)MTD$clang_Cursor_getObjCSelectorIndex.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isDynamicCall(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isDynamicCall.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXType clang_Cursor_getReceiverType(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXType((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getReceiverType.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getObjCPropertyAttributes(CXCursor C, int reserved)
	{
		try {return (int)MTD$clang_Cursor_getObjCPropertyAttributes.invokeExact(C.ptr(), reserved);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Cursor_getObjCPropertyGetterName(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCPropertyGetterName.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Cursor_getObjCPropertySetterName(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCPropertySetterName.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_getObjCDeclQualifiers(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_getObjCDeclQualifiers.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isObjCOptional(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isObjCOptional.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isVariadic(CXCursor C)
	{
		try {return (int)MTD$clang_Cursor_isVariadic.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Cursor_isExternalSymbol(CXCursor C, java.lang.foreign.MemorySegment language, java.lang.foreign.MemorySegment definedIn, java.lang.foreign.MemorySegment isGenerated)
	{
		try {return (int)MTD$clang_Cursor_isExternalSymbol.invokeExact(C.ptr(), language, definedIn, isGenerated);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_Cursor_getCommentRange(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getCommentRange.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Cursor_getRawCommentText(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getRawCommentText.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Cursor_getBriefCommentText(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getBriefCommentText.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Cursor_getMangling(java.lang.foreign.SegmentAllocator allocator, CXCursor arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getMangling.invokeExact(allocator, arg1.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Cursor_getCXXManglings(CXCursor arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getCXXManglings.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Cursor_getObjCManglings(CXCursor arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCManglings.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Cursor_getModule(CXCursor C)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getModule.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getModuleForFile(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getModuleForFile.invokeExact(arg1, arg2);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Module_getASTFile(java.lang.foreign.MemorySegment Module)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getASTFile.invokeExact(Module);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Module_getParent(java.lang.foreign.MemorySegment Module)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getParent.invokeExact(Module);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Module_getName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Module)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Module_getName.invokeExact(allocator, Module));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_Module_getFullName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Module)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_Module_getFullName.invokeExact(allocator, Module));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Module_isSystem(java.lang.foreign.MemorySegment Module)
	{
		try {return (int)MTD$clang_Module_isSystem.invokeExact(Module);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Module_getNumTopLevelHeaders(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Module)
	{
		try {return (int)MTD$clang_Module_getNumTopLevelHeaders.invokeExact(arg1, Module);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Module_getTopLevelHeader(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Module, int Index)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getTopLevelHeader.invokeExact(arg1, Module, Index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXConstructor_isConvertingConstructor(CXCursor C)
	{
		try {return (int)MTD$clang_CXXConstructor_isConvertingConstructor.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXConstructor_isCopyConstructor(CXCursor C)
	{
		try {return (int)MTD$clang_CXXConstructor_isCopyConstructor.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXConstructor_isDefaultConstructor(CXCursor C)
	{
		try {return (int)MTD$clang_CXXConstructor_isDefaultConstructor.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXConstructor_isMoveConstructor(CXCursor C)
	{
		try {return (int)MTD$clang_CXXConstructor_isMoveConstructor.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXField_isMutable(CXCursor C)
	{
		try {return (int)MTD$clang_CXXField_isMutable.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isDefaulted(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isDefaulted.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isDeleted(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isDeleted.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isPureVirtual(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isPureVirtual.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isStatic(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isStatic.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isVirtual(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isVirtual.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isCopyAssignmentOperator.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isMoveAssignmentOperator.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isExplicit(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isExplicit.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXRecord_isAbstract(CXCursor C)
	{
		try {return (int)MTD$clang_CXXRecord_isAbstract.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_EnumDecl_isScoped(CXCursor C)
	{
		try {return (int)MTD$clang_EnumDecl_isScoped.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXXMethod_isConst(CXCursor C)
	{
		try {return (int)MTD$clang_CXXMethod_isConst.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getTemplateCursorKind(CXCursor C)
	{
		try {return (int)MTD$clang_getTemplateCursorKind.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXCursor clang_getSpecializedCursorTemplate(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getSpecializedCursorTemplate.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getCursorReferenceNameRange(java.lang.foreign.SegmentAllocator allocator, CXCursor C, int NameFlags, int PieceIndex)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getCursorReferenceNameRange.invokeExact(allocator, C.ptr(), NameFlags, PieceIndex));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getToken(java.lang.foreign.MemorySegment TU, CXSourceLocation Location)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getToken.invokeExact(TU, Location.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getTokenKind(CXToken arg1)
	{
		try {return (int)MTD$clang_getTokenKind.invokeExact(arg1.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getTokenSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, CXToken arg2)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getTokenSpelling.invokeExact(allocator, arg1, arg2.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getTokenLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, CXToken arg2)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getTokenLocation.invokeExact(allocator, arg1, arg2.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getTokenExtent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, CXToken arg2)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getTokenExtent.invokeExact(allocator, arg1, arg2.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_tokenize(java.lang.foreign.MemorySegment TU, CXSourceRange Range, java.lang.foreign.MemorySegment Tokens, java.lang.foreign.MemorySegment NumTokens)
	{
		try {MTD$clang_tokenize.invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_annotateTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens, java.lang.foreign.MemorySegment Cursors)
	{
		try {MTD$clang_annotateTokens.invokeExact(TU, Tokens, NumTokens, Cursors);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens)
	{
		try {MTD$clang_disposeTokens.invokeExact(TU, Tokens, NumTokens);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCursorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int Kind)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorKindSpelling.invokeExact(allocator, Kind));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getDefinitionSpellingAndExtent(CXCursor arg1, java.lang.foreign.MemorySegment startBuf, java.lang.foreign.MemorySegment endBuf, java.lang.foreign.MemorySegment startLine, java.lang.foreign.MemorySegment startColumn, java.lang.foreign.MemorySegment endLine, java.lang.foreign.MemorySegment endColumn)
	{
		try {MTD$clang_getDefinitionSpellingAndExtent.invokeExact(arg1.ptr(), startBuf, endBuf, startLine, startColumn, endLine, endColumn);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_enableStackTraces()
	{
		try {MTD$clang_enableStackTraces.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_executeOnThread(java.lang.foreign.MemorySegment fn, java.lang.foreign.MemorySegment user_data, int stack_size)
	{
		try {MTD$clang_executeOnThread.invokeExact(fn, user_data, stack_size);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCompletionChunkKind(java.lang.foreign.MemorySegment completion_string, int chunk_number)
	{
		try {return (int)MTD$clang_getCompletionChunkKind.invokeExact(completion_string, chunk_number);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCompletionChunkText(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, int chunk_number)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionChunkText.invokeExact(allocator, completion_string, chunk_number));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getCompletionChunkCompletionString(java.lang.foreign.MemorySegment completion_string, int chunk_number)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getCompletionChunkCompletionString.invokeExact(completion_string, chunk_number);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getNumCompletionChunks(java.lang.foreign.MemorySegment completion_string)
	{
		try {return (int)MTD$clang_getNumCompletionChunks.invokeExact(completion_string);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCompletionPriority(java.lang.foreign.MemorySegment completion_string)
	{
		try {return (int)MTD$clang_getCompletionPriority.invokeExact(completion_string);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCompletionAvailability(java.lang.foreign.MemorySegment completion_string)
	{
		try {return (int)MTD$clang_getCompletionAvailability.invokeExact(completion_string);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCompletionNumAnnotations(java.lang.foreign.MemorySegment completion_string)
	{
		try {return (int)MTD$clang_getCompletionNumAnnotations.invokeExact(completion_string);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCompletionAnnotation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, int annotation_number)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionAnnotation.invokeExact(allocator, completion_string, annotation_number));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCompletionParent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, java.lang.foreign.MemorySegment kind)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionParent.invokeExact(allocator, completion_string, kind));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCompletionBriefComment(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionBriefComment.invokeExact(allocator, completion_string));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getCursorCompletionString(CXCursor cursor)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getCursorCompletionString.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCompletionNumFixIts(java.lang.foreign.MemorySegment results, int completion_index)
	{
		try {return (int)MTD$clang_getCompletionNumFixIts.invokeExact(results, completion_index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getCompletionFixIt(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment results, int completion_index, int fixit_index, java.lang.foreign.MemorySegment replacement_range)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionFixIt.invokeExact(allocator, results, completion_index, fixit_index, replacement_range));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_defaultCodeCompleteOptions()
	{
		try {return (int)MTD$clang_defaultCodeCompleteOptions.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_codeCompleteAt(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment complete_filename, int complete_line, int complete_column, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_codeCompleteAt.invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_sortCodeCompletionResults(java.lang.foreign.MemorySegment Results, int NumResults)
	{
		try {MTD$clang_sortCodeCompletionResults.invokeExact(Results, NumResults);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeCodeCompleteResults(java.lang.foreign.MemorySegment Results)
	{
		try {MTD$clang_disposeCodeCompleteResults.invokeExact(Results);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_codeCompleteGetNumDiagnostics(java.lang.foreign.MemorySegment Results)
	{
		try {return (int)MTD$clang_codeCompleteGetNumDiagnostics.invokeExact(Results);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_codeCompleteGetDiagnostic(java.lang.foreign.MemorySegment Results, int Index)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetDiagnostic.invokeExact(Results, Index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_codeCompleteGetContexts(java.lang.foreign.MemorySegment Results)
	{
		try {return (long)MTD$clang_codeCompleteGetContexts.invokeExact(Results);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_codeCompleteGetContainerKind(java.lang.foreign.MemorySegment Results, java.lang.foreign.MemorySegment IsIncomplete)
	{
		try {return (int)MTD$clang_codeCompleteGetContainerKind.invokeExact(Results, IsIncomplete);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_codeCompleteGetContainerUSR(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Results)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetContainerUSR.invokeExact(allocator, Results));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_codeCompleteGetObjCSelector(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Results)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetObjCSelector.invokeExact(allocator, Results));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getClangVersion(java.lang.foreign.SegmentAllocator allocator)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getClangVersion.invokeExact(allocator));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_toggleCrashRecovery(int isEnabled)
	{
		try {MTD$clang_toggleCrashRecovery.invokeExact(isEnabled);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getInclusions(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
	{
		try {MTD$clang_getInclusions.invokeExact(tu, visitor, client_data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_Cursor_Evaluate(CXCursor C)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_Evaluate.invokeExact(C.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_EvalResult_getKind(java.lang.foreign.MemorySegment E)
	{
		try {return (int)MTD$clang_EvalResult_getKind.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_EvalResult_getAsInt(java.lang.foreign.MemorySegment E)
	{
		try {return (int)MTD$clang_EvalResult_getAsInt.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_EvalResult_getAsLongLong(java.lang.foreign.MemorySegment E)
	{
		try {return (long)MTD$clang_EvalResult_getAsLongLong.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_EvalResult_isUnsignedInt(java.lang.foreign.MemorySegment E)
	{
		try {return (int)MTD$clang_EvalResult_isUnsignedInt.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_EvalResult_getAsUnsigned(java.lang.foreign.MemorySegment E)
	{
		try {return (long)MTD$clang_EvalResult_getAsUnsigned.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static double clang_EvalResult_getAsDouble(java.lang.foreign.MemorySegment E)
	{
		try {return (double)MTD$clang_EvalResult_getAsDouble.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_EvalResult_getAsStr(java.lang.foreign.MemorySegment E)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_EvalResult_getAsStr.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_EvalResult_dispose(java.lang.foreign.MemorySegment E)
	{
		try {MTD$clang_EvalResult_dispose.invokeExact(E);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getRemappings(java.lang.foreign.MemorySegment path)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getRemappings.invokeExact(path);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getRemappingsFromFileList(java.lang.foreign.MemorySegment filePaths, int numFiles)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getRemappingsFromFileList.invokeExact(filePaths, numFiles);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_remap_getNumFiles(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_remap_getNumFiles.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_remap_getFilenames(java.lang.foreign.MemorySegment arg1, int index, java.lang.foreign.MemorySegment original, java.lang.foreign.MemorySegment transformed)
	{
		try {MTD$clang_remap_getFilenames.invokeExact(arg1, index, original, transformed);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_remap_dispose(java.lang.foreign.MemorySegment arg1)
	{
		try {MTD$clang_remap_dispose.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_findReferencesInFile(CXCursor cursor, java.lang.foreign.MemorySegment file, CXCursorAndRangeVisitor visitor)
	{
		try {return (int)MTD$clang_findReferencesInFile.invokeExact(cursor.ptr(), file, visitor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_findIncludesInFile(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment file, CXCursorAndRangeVisitor visitor)
	{
		try {return (int)MTD$clang_findIncludesInFile.invokeExact(TU, file, visitor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_findReferencesInFileWithBlock(CXCursor arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
	{
		try {return (int)MTD$clang_findReferencesInFileWithBlock.invokeExact(arg1.ptr(), arg2, arg3);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_findIncludesInFileWithBlock(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
	{
		try {return (int)MTD$clang_findIncludesInFileWithBlock.invokeExact(arg1, arg2, arg3);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_index_isEntityObjCContainerKind(int arg1)
	{
		try {return (int)MTD$clang_index_isEntityObjCContainerKind.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getObjCContainerDeclInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getObjCContainerDeclInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getObjCInterfaceDeclInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getObjCInterfaceDeclInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getObjCCategoryDeclInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getObjCCategoryDeclInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getObjCProtocolRefListInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getObjCProtocolRefListInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getObjCPropertyDeclInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getObjCPropertyDeclInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getIBOutletCollectionAttrInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getIBOutletCollectionAttrInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getCXXClassDeclInfo(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getCXXClassDeclInfo.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getClientContainer(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getClientContainer.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_index_setClientContainer(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
	{
		try {MTD$clang_index_setClientContainer.invokeExact(arg1, arg2);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_index_getClientEntity(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getClientEntity.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_index_setClientEntity(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
	{
		try {MTD$clang_index_setClientEntity.invokeExact(arg1, arg2);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_IndexAction_create(java.lang.foreign.MemorySegment CIdx)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_IndexAction_create.invokeExact(CIdx);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_IndexAction_dispose(java.lang.foreign.MemorySegment arg1)
	{
		try {MTD$clang_IndexAction_dispose.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_indexSourceFile(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
	{
		try {return (int)MTD$clang_indexSourceFile.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_indexSourceFileFullArgv(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
	{
		try {return (int)MTD$clang_indexSourceFileFullArgv.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_indexTranslationUnit(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment arg6)
	{
		try {return (int)MTD$clang_indexTranslationUnit.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, arg6);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_indexLoc_getFileLocation(CXIdxLoc loc, java.lang.foreign.MemorySegment indexFile, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
	{
		try {MTD$clang_indexLoc_getFileLocation.invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_indexLoc_getCXSourceLocation(java.lang.foreign.SegmentAllocator allocator, CXIdxLoc loc)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_indexLoc_getCXSourceLocation.invokeExact(allocator, loc.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Type_visitFields(CXType T, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
	{
		try {return (int)MTD$clang_Type_visitFields.invokeExact(T.ptr(), visitor, client_data);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getBinaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int kind)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getBinaryOperatorKindSpelling.invokeExact(allocator, kind));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorBinaryOperatorKind(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorBinaryOperatorKind.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getUnaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int kind)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getUnaryOperatorKindSpelling.invokeExact(allocator, kind));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getCursorUnaryOperatorKind(CXCursor cursor)
	{
		try {return (int)MTD$clang_getCursorUnaryOperatorKind.invokeExact(cursor.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getCString(CXString string)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getCString.invokeExact(string.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeString(CXString string)
	{
		try {MTD$clang_disposeString.invokeExact(string.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeStringSet(java.lang.foreign.MemorySegment set)
	{
		try {MTD$clang_disposeStringSet.invokeExact(set);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_CXRewriter_create(java.lang.foreign.MemorySegment TU)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_CXRewriter_create.invokeExact(TU);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXRewriter_insertTextBefore(java.lang.foreign.MemorySegment Rew, CXSourceLocation Loc, java.lang.foreign.MemorySegment Insert)
	{
		try {MTD$clang_CXRewriter_insertTextBefore.invokeExact(Rew, Loc.ptr(), Insert);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXRewriter_replaceText(java.lang.foreign.MemorySegment Rew, CXSourceRange ToBeReplaced, java.lang.foreign.MemorySegment Replacement)
	{
		try {MTD$clang_CXRewriter_replaceText.invokeExact(Rew, ToBeReplaced.ptr(), Replacement);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXRewriter_removeText(java.lang.foreign.MemorySegment Rew, CXSourceRange ToBeRemoved)
	{
		try {MTD$clang_CXRewriter_removeText.invokeExact(Rew, ToBeRemoved.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CXRewriter_overwriteChangedFiles(java.lang.foreign.MemorySegment Rew)
	{
		try {return (int)MTD$clang_CXRewriter_overwriteChangedFiles.invokeExact(Rew);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXRewriter_writeMainFileToStdOut(java.lang.foreign.MemorySegment Rew)
	{
		try {MTD$clang_CXRewriter_writeMainFileToStdOut.invokeExact(Rew);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CXRewriter_dispose(java.lang.foreign.MemorySegment Rew)
	{
		try {MTD$clang_CXRewriter_dispose.invokeExact(Rew);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_install_aborting_llvm_fatal_error_handler()
	{
		try {MTD$clang_install_aborting_llvm_fatal_error_handler.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_uninstall_llvm_fatal_error_handler()
	{
		try {MTD$clang_uninstall_llvm_fatal_error_handler.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXComment clang_Cursor_getParsedComment(java.lang.foreign.SegmentAllocator allocator, CXCursor C)
	{
		try {return new CXComment((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getParsedComment.invokeExact(allocator, C.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Comment_getKind(CXComment Comment)
	{
		try {return (int)MTD$clang_Comment_getKind.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Comment_getNumChildren(CXComment Comment)
	{
		try {return (int)MTD$clang_Comment_getNumChildren.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXComment clang_Comment_getChild(java.lang.foreign.SegmentAllocator allocator, CXComment Comment, int ChildIdx)
	{
		try {return new CXComment((java.lang.foreign.MemorySegment)MTD$clang_Comment_getChild.invokeExact(allocator, Comment.ptr(), ChildIdx));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Comment_isWhitespace(CXComment Comment)
	{
		try {return (int)MTD$clang_Comment_isWhitespace.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_InlineContentComment_hasTrailingNewline(CXComment Comment)
	{
		try {return (int)MTD$clang_InlineContentComment_hasTrailingNewline.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_TextComment_getText(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_TextComment_getText.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_InlineCommandComment_getCommandName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_InlineCommandComment_getCommandName.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_InlineCommandComment_getRenderKind(CXComment Comment)
	{
		try {return (int)MTD$clang_InlineCommandComment_getRenderKind.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_InlineCommandComment_getNumArgs(CXComment Comment)
	{
		try {return (int)MTD$clang_InlineCommandComment_getNumArgs.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_InlineCommandComment_getArgText(java.lang.foreign.SegmentAllocator allocator, CXComment Comment, int ArgIdx)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_InlineCommandComment_getArgText.invokeExact(allocator, Comment.ptr(), ArgIdx));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_HTMLTagComment_getTagName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLTagComment_getTagName.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_HTMLStartTagComment_isSelfClosing(CXComment Comment)
	{
		try {return (int)MTD$clang_HTMLStartTagComment_isSelfClosing.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_HTMLStartTag_getNumAttrs(CXComment Comment)
	{
		try {return (int)MTD$clang_HTMLStartTag_getNumAttrs.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_HTMLStartTag_getAttrName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment, int AttrIdx)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLStartTag_getAttrName.invokeExact(allocator, Comment.ptr(), AttrIdx));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_HTMLStartTag_getAttrValue(java.lang.foreign.SegmentAllocator allocator, CXComment Comment, int AttrIdx)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLStartTag_getAttrValue.invokeExact(allocator, Comment.ptr(), AttrIdx));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_BlockCommandComment_getCommandName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getCommandName.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_BlockCommandComment_getNumArgs(CXComment Comment)
	{
		try {return (int)MTD$clang_BlockCommandComment_getNumArgs.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_BlockCommandComment_getArgText(java.lang.foreign.SegmentAllocator allocator, CXComment Comment, int ArgIdx)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getArgText.invokeExact(allocator, Comment.ptr(), ArgIdx));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXComment clang_BlockCommandComment_getParagraph(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXComment((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getParagraph.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_ParamCommandComment_getParamName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_ParamCommandComment_getParamName.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_ParamCommandComment_isParamIndexValid(CXComment Comment)
	{
		try {return (int)MTD$clang_ParamCommandComment_isParamIndexValid.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_ParamCommandComment_getParamIndex(CXComment Comment)
	{
		try {return (int)MTD$clang_ParamCommandComment_getParamIndex.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_ParamCommandComment_isDirectionExplicit(CXComment Comment)
	{
		try {return (int)MTD$clang_ParamCommandComment_isDirectionExplicit.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_ParamCommandComment_getDirection(CXComment Comment)
	{
		try {return (int)MTD$clang_ParamCommandComment_getDirection.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_TParamCommandComment_getParamName(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_TParamCommandComment_getParamName.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_TParamCommandComment_isParamPositionValid(CXComment Comment)
	{
		try {return (int)MTD$clang_TParamCommandComment_isParamPositionValid.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_TParamCommandComment_getDepth(CXComment Comment)
	{
		try {return (int)MTD$clang_TParamCommandComment_getDepth.invokeExact(Comment.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_TParamCommandComment_getIndex(CXComment Comment, int Depth)
	{
		try {return (int)MTD$clang_TParamCommandComment_getIndex.invokeExact(Comment.ptr(), Depth);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_VerbatimBlockLineComment_getText(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_VerbatimBlockLineComment_getText.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_VerbatimLineComment_getText(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_VerbatimLineComment_getText.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_HTMLTagComment_getAsString(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLTagComment_getAsString.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_FullComment_getAsHTML(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_FullComment_getAsHTML.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_FullComment_getAsXML(java.lang.foreign.SegmentAllocator allocator, CXComment Comment)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_FullComment_getAsXML.invokeExact(allocator, Comment.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_createAPISet(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment out_api)
	{
		try {return (int)MTD$clang_createAPISet.invokeExact(tu, out_api);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeAPISet(java.lang.foreign.MemorySegment api)
	{
		try {MTD$clang_disposeAPISet.invokeExact(api);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getSymbolGraphForUSR(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment usr, java.lang.foreign.MemorySegment api)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getSymbolGraphForUSR.invokeExact(allocator, usr, api));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getSymbolGraphForCursor(java.lang.foreign.SegmentAllocator allocator, CXCursor cursor)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getSymbolGraphForCursor.invokeExact(allocator, cursor.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getNullLocation(java.lang.foreign.SegmentAllocator allocator)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getNullLocation.invokeExact(allocator));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)
	{
		try {return (int)MTD$clang_equalLocations.invokeExact(loc1.ptr(), loc2.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Location_isInSystemHeader(CXSourceLocation location)
	{
		try {return (int)MTD$clang_Location_isInSystemHeader.invokeExact(location.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Location_isFromMainFile(CXSourceLocation location)
	{
		try {return (int)MTD$clang_Location_isFromMainFile.invokeExact(location.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getNullRange(java.lang.foreign.SegmentAllocator allocator)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getNullRange.invokeExact(allocator));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getRange(java.lang.foreign.SegmentAllocator allocator, CXSourceLocation begin, CXSourceLocation end)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getRange.invokeExact(allocator, begin.ptr(), end.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_equalRanges(CXSourceRange range1, CXSourceRange range2)
	{
		try {return (int)MTD$clang_equalRanges.invokeExact(range1.ptr(), range2.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_Range_isNull(CXSourceRange range)
	{
		try {return (int)MTD$clang_Range_isNull.invokeExact(range.ptr());}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getExpansionLocation(CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
	{
		try {MTD$clang_getExpansionLocation.invokeExact(location.ptr(), file, line, column, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getPresumedLocation(CXSourceLocation location, java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column)
	{
		try {MTD$clang_getPresumedLocation.invokeExact(location.ptr(), filename, line, column);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getInstantiationLocation(CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
	{
		try {MTD$clang_getInstantiationLocation.invokeExact(location.ptr(), file, line, column, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getSpellingLocation(CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
	{
		try {MTD$clang_getSpellingLocation.invokeExact(location.ptr(), file, line, column, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_getFileLocation(CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
	{
		try {MTD$clang_getFileLocation.invokeExact(location.ptr(), file, line, column, offset);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getRangeStart(java.lang.foreign.SegmentAllocator allocator, CXSourceRange range)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getRangeStart.invokeExact(allocator, range.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getRangeEnd(java.lang.foreign.SegmentAllocator allocator, CXSourceRange range)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getRangeEnd.invokeExact(allocator, range.ptr()));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeSourceRangeList(java.lang.foreign.MemorySegment ranges)
	{
		try {MTD$clang_disposeSourceRangeList.invokeExact(ranges);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getFileName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment SFile)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getFileName.invokeExact(allocator, SFile));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static long clang_getFileTime(java.lang.foreign.MemorySegment SFile)
	{
		try {return (long)MTD$clang_getFileTime.invokeExact(SFile);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getFileUniqueID(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment outID)
	{
		try {return (int)MTD$clang_getFileUniqueID.invokeExact(file, outID);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_File_isEqual(java.lang.foreign.MemorySegment file1, java.lang.foreign.MemorySegment file2)
	{
		try {return (int)MTD$clang_File_isEqual.invokeExact(file1, file2);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_File_tryGetRealPathName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment file)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_File_tryGetRealPathName.invokeExact(allocator, file));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getNumDiagnosticsInSet(java.lang.foreign.MemorySegment Diags)
	{
		try {return (int)MTD$clang_getNumDiagnosticsInSet.invokeExact(Diags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getDiagnosticInSet(java.lang.foreign.MemorySegment Diags, int Index)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticInSet.invokeExact(Diags, Index);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_loadDiagnostics(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment errorString)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_loadDiagnostics.invokeExact(file, error, errorString);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeDiagnosticSet(java.lang.foreign.MemorySegment Diags)
	{
		try {MTD$clang_disposeDiagnosticSet.invokeExact(Diags);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_getChildDiagnostics(java.lang.foreign.MemorySegment D)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_getChildDiagnostics.invokeExact(D);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_disposeDiagnostic(java.lang.foreign.MemorySegment Diagnostic)
	{
		try {MTD$clang_disposeDiagnostic.invokeExact(Diagnostic);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_formatDiagnostic(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int Options)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_formatDiagnostic.invokeExact(allocator, Diagnostic, Options));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_defaultDiagnosticDisplayOptions()
	{
		try {return (int)MTD$clang_defaultDiagnosticDisplayOptions.invokeExact();}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getDiagnosticSeverity(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_getDiagnosticSeverity.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceLocation clang_getDiagnosticLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticLocation.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDiagnosticSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticSpelling.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDiagnosticOption(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diag, java.lang.foreign.MemorySegment Disable)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticOption.invokeExact(allocator, Diag, Disable));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getDiagnosticCategory(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_getDiagnosticCategory.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDiagnosticCategoryName(java.lang.foreign.SegmentAllocator allocator, int Category)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticCategoryName.invokeExact(allocator, Category));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDiagnosticCategoryText(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticCategoryText.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getDiagnosticNumRanges(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_getDiagnosticNumRanges.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXSourceRange clang_getDiagnosticRange(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int Range)
	{
		try {return new CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticRange.invokeExact(allocator, Diagnostic, Range));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_getDiagnosticNumFixIts(java.lang.foreign.MemorySegment Diagnostic)
	{
		try {return (int)MTD$clang_getDiagnosticNumFixIts.invokeExact(Diagnostic);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_getDiagnosticFixIt(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int FixIt, java.lang.foreign.MemorySegment ReplacementRange)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticFixIt.invokeExact(allocator, Diagnostic, FixIt, ReplacementRange));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_CompilationDatabase_fromDirectory(java.lang.foreign.MemorySegment BuildDir, java.lang.foreign.MemorySegment ErrorCode)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_fromDirectory.invokeExact(BuildDir, ErrorCode);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CompilationDatabase_dispose(java.lang.foreign.MemorySegment arg1)
	{
		try {MTD$clang_CompilationDatabase_dispose.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_CompilationDatabase_getCompileCommands(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment CompleteFileName)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_getCompileCommands.invokeExact(arg1, CompleteFileName);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_CompilationDatabase_getAllCompileCommands(java.lang.foreign.MemorySegment arg1)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_getAllCompileCommands.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static void clang_CompileCommands_dispose(java.lang.foreign.MemorySegment arg1)
	{
		try {MTD$clang_CompileCommands_dispose.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CompileCommands_getSize(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_CompileCommands_getSize.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static java.lang.foreign.MemorySegment clang_CompileCommands_getCommand(java.lang.foreign.MemorySegment arg1, int I)
	{
		try {return (java.lang.foreign.MemorySegment)MTD$clang_CompileCommands_getCommand.invokeExact(arg1, I);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_CompileCommand_getDirectory(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getDirectory.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_CompileCommand_getFilename(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getFilename.invokeExact(allocator, arg1));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CompileCommand_getNumArgs(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_CompileCommand_getNumArgs.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_CompileCommand_getArg(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getArg.invokeExact(allocator, arg1, I));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static int clang_CompileCommand_getNumMappedSources(java.lang.foreign.MemorySegment arg1)
	{
		try {return (int)MTD$clang_CompileCommand_getNumMappedSources.invokeExact(arg1);}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_CompileCommand_getMappedSourcePath(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getMappedSourcePath.invokeExact(allocator, arg1, I));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	public static CXString clang_CompileCommand_getMappedSourceContent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
	{
		try {return new CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getMappedSourceContent.invokeExact(allocator, arg1, I));}
		catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
	}

	static
	{
		java.lang.System.loadLibrary("libclang");
		gSystemLinker = java.lang.foreign.Linker.nativeLinker();
		gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

		MTD$clang_createIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_createIndex").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_disposeIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeIndex").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_createIndexWithOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_createIndexWithOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXIndex_setGlobalOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXIndex_setGlobalOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_CXIndex_getGlobalOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXIndex_getGlobalOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXIndex_setInvocationEmissionPathOption = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXIndex_setInvocationEmissionPathOption").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_isFileMultipleIncludeGuarded = gSystemLinker.downcallHandle(gLibLookup.find("clang_isFileMultipleIncludeGuarded").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFileContents = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileContents").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getLocationForOffset = gSystemLinker.downcallHandle(gLibLookup.find("clang_getLocationForOffset").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getSkippedRanges = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSkippedRanges").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getAllSkippedRanges = gSystemLinker.downcallHandle(gLibLookup.find("clang_getAllSkippedRanges").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getNumDiagnostics = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumDiagnostics").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnostic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getDiagnosticSetFromTU = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticSetFromTU").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getTranslationUnitSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTranslationUnitSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_createTranslationUnitFromSourceFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_createTranslationUnitFromSourceFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_createTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_createTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_createTranslationUnit2 = gSystemLinker.downcallHandle(gLibLookup.find("clang_createTranslationUnit2").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_defaultEditingTranslationUnitOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultEditingTranslationUnitOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_parseTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_parseTranslationUnit2 = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit2").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_parseTranslationUnit2FullArgv = gSystemLinker.downcallHandle(gLibLookup.find("clang_parseTranslationUnit2FullArgv").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_defaultSaveOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultSaveOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_saveTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_saveTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_suspendTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_suspendTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_defaultReparseOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultReparseOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_reparseTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_reparseTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getTUResourceUsageName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTUResourceUsageName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCXTUResourceUsage = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCXTUResourceUsage").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXTUResourceUsage.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeCXTUResourceUsage = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeCXTUResourceUsage").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXTUResourceUsage.gStructLayout));
		MTD$clang_getTranslationUnitTargetInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTranslationUnitTargetInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_TargetInfo_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_TargetInfo_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_TargetInfo_getTriple = gSystemLinker.downcallHandle(gLibLookup.find("clang_TargetInfo_getTriple").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_TargetInfo_getPointerWidth = gSystemLinker.downcallHandle(gLibLookup.find("clang_TargetInfo_getPointerWidth").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getNullCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNullCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout));
		MTD$clang_getTranslationUnitCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTranslationUnitCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_equalCursors = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalCursors").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_isNull = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isNull").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_hashCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_hashCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_isDeclaration = gSystemLinker.downcallHandle(gLibLookup.find("clang_isDeclaration").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isInvalidDeclaration = gSystemLinker.downcallHandle(gLibLookup.find("clang_isInvalidDeclaration").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_isReference = gSystemLinker.downcallHandle(gLibLookup.find("clang_isReference").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isExpression = gSystemLinker.downcallHandle(gLibLookup.find("clang_isExpression").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isStatement = gSystemLinker.downcallHandle(gLibLookup.find("clang_isStatement").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isAttribute = gSystemLinker.downcallHandle(gLibLookup.find("clang_isAttribute").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_hasAttrs = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_hasAttrs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_isInvalid = gSystemLinker.downcallHandle(gLibLookup.find("clang_isInvalid").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_isTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isPreprocessing = gSystemLinker.downcallHandle(gLibLookup.find("clang_isPreprocessing").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isUnexposed = gSystemLinker.downcallHandle(gLibLookup.find("clang_isUnexposed").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCursorLinkage = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLinkage").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorVisibility = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorVisibility").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorAvailability").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorPlatformAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorPlatformAvailability").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_disposeCXPlatformAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeCXPlatformAvailability").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Cursor_getVarDeclInitializer = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getVarDeclInitializer").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_hasVarDeclGlobalStorage = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_hasVarDeclGlobalStorage").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_hasVarDeclExternalStorage = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_hasVarDeclExternalStorage").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorLanguage = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLanguage").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCursorTLSKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorTLSKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_createCXCursorSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_createCXCursorSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeCXCursorSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeCXCursorSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXCursorSet_contains = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXCursorSet_contains").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_CXCursorSet_insert = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXCursorSet_insert").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_getCursorSemanticParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorSemanticParent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorLexicalParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLexicalParent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getOverriddenCursors = gSystemLinker.downcallHandle(gLibLookup.find("clang_getOverriddenCursors").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeOverriddenCursors = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeOverriddenCursors").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getIncludedFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_getIncludedFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_getCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXSourceLocation.gStructLayout));
		MTD$clang_getCursorLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorExtent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorExtent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getTypeSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXType.gStructLayout));
		MTD$clang_getTypedefDeclUnderlyingType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypedefDeclUnderlyingType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getEnumDeclIntegerType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumDeclIntegerType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getEnumConstantDeclValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumConstantDeclValue").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
		MTD$clang_getEnumConstantDeclUnsignedValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_getEnumConstantDeclUnsignedValue").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
		MTD$clang_Cursor_isBitField = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isBitField").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getFieldDeclBitWidth = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFieldDeclBitWidth").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getNumArguments = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getNumArguments").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getArgument = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getArgument").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_getNumTemplateArguments = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getNumTemplateArguments").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getTemplateArgumentKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTemplateArgumentKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_getTemplateArgumentType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTemplateArgumentType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_getTemplateArgumentValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTemplateArgumentValue").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_getTemplateArgumentUnsignedValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getTemplateArgumentUnsignedValue").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_equalTypes = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalTypes").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getCanonicalType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCanonicalType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_isConstQualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_isConstQualifiedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Cursor_isMacroFunctionLike = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isMacroFunctionLike").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isMacroBuiltin = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isMacroBuiltin").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isFunctionInlined = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isFunctionInlined").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_isVolatileQualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_isVolatileQualifiedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_isRestrictQualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_isRestrictQualifiedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getAddressSpace = gSystemLinker.downcallHandle(gLibLookup.find("clang_getAddressSpace").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getTypedefName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypedefName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXType.gStructLayout));
		MTD$clang_getPointeeType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getPointeeType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getUnqualifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getUnqualifiedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getNonReferenceType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNonReferenceType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getTypeDeclaration = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeDeclaration").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXType.gStructLayout));
		MTD$clang_getDeclObjCTypeEncoding = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDeclObjCTypeEncoding").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Type_getObjCEncoding = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getObjCEncoding").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXType.gStructLayout));
		MTD$clang_getTypeKindSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTypeKindSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getFunctionTypeCallingConv = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFunctionTypeCallingConv").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getResultType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getResultType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getExceptionSpecificationType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getExceptionSpecificationType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getNumArgTypes = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumArgTypes").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getArgType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArgType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Type_getObjCObjectBaseType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getObjCObjectBaseType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_Type_getNumObjCProtocolRefs = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getNumObjCProtocolRefs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Type_getObjCProtocolDecl = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getObjCProtocolDecl").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Type_getNumObjCTypeArgs = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getNumObjCTypeArgs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Type_getObjCTypeArg = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getObjCTypeArg").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_isFunctionTypeVariadic = gSystemLinker.downcallHandle(gLibLookup.find("clang_isFunctionTypeVariadic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getCursorResultType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorResultType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorExceptionSpecificationType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorExceptionSpecificationType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_isPODType = gSystemLinker.downcallHandle(gLibLookup.find("clang_isPODType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_getElementType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getElementType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getNumElements = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumElements").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXType.gStructLayout));
		MTD$clang_getArrayElementType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArrayElementType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_getArraySize = gSystemLinker.downcallHandle(gLibLookup.find("clang_getArraySize").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXType.gStructLayout));
		MTD$clang_Type_getNamedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getNamedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_Type_isTransparentTagTypedef = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_isTransparentTagTypedef").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Type_getNullability = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getNullability").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Type_getAlignOf = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getAlignOf").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXType.gStructLayout));
		MTD$clang_Type_getClassType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getClassType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_Type_getSizeOf = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getSizeOf").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXType.gStructLayout));
		MTD$clang_Type_getOffsetOf = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getOffsetOf").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXType.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Type_getModifiedType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getModifiedType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_Type_getValueType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getValueType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout));
		MTD$clang_Cursor_getOffsetOfField = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getOffsetOfField").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, CXCursor.gStructLayout));
		MTD$clang_Cursor_isAnonymous = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isAnonymous").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isAnonymousRecordDecl = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isAnonymousRecordDecl").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isInlineNamespace = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isInlineNamespace").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Type_getNumTemplateArguments = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getNumTemplateArguments").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_Type_getTemplateArgumentAsType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getTemplateArgumentAsType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Type_getCXXRefQualifier = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_getCXXRefQualifier").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout));
		MTD$clang_isVirtualBase = gSystemLinker.downcallHandle(gLibLookup.find("clang_isVirtualBase").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCXXAccessSpecifier = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCXXAccessSpecifier").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getStorageClass = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getStorageClass").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getNumOverloadedDecls = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumOverloadedDecls").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getOverloadedDecl = gSystemLinker.downcallHandle(gLibLookup.find("clang_getOverloadedDecl").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getIBOutletCollectionType = gSystemLinker.downcallHandle(gLibLookup.find("clang_getIBOutletCollectionType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_visitChildren = gSystemLinker.downcallHandle(gLibLookup.find("clang_visitChildren").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_visitChildrenWithBlock = gSystemLinker.downcallHandle(gLibLookup.find("clang_visitChildrenWithBlock").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCursorUSR = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorUSR").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_constructUSR_ObjCClass = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCClass").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_constructUSR_ObjCCategory = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCCategory").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_constructUSR_ObjCProtocol = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCProtocol").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_constructUSR_ObjCIvar = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCIvar").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXString.gStructLayout));
		MTD$clang_constructUSR_ObjCMethod = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCMethod").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, CXString.gStructLayout));
		MTD$clang_constructUSR_ObjCProperty = gSystemLinker.downcallHandle(gLibLookup.find("clang_constructUSR_ObjCProperty").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXString.gStructLayout));
		MTD$clang_getCursorSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getSpellingNameRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getSpellingNameRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_PrintingPolicy_getProperty = gSystemLinker.downcallHandle(gLibLookup.find("clang_PrintingPolicy_getProperty").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_PrintingPolicy_setProperty = gSystemLinker.downcallHandle(gLibLookup.find("clang_PrintingPolicy_setProperty").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCursorPrintingPolicy = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorPrintingPolicy").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_PrintingPolicy_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_PrintingPolicy_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCursorPrettyPrinted = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorPrettyPrinted").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCursorDisplayName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorDisplayName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorReferenced = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorReferenced").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorDefinition = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorDefinition").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_isCursorDefinition = gSystemLinker.downcallHandle(gLibLookup.find("clang_isCursorDefinition").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCanonicalCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCanonicalCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getObjCSelectorIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCSelectorIndex").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isDynamicCall = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isDynamicCall").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_getReceiverType = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getReceiverType").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXType.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getObjCPropertyAttributes = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCPropertyAttributes").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Cursor_getObjCPropertyGetterName = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCPropertyGetterName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getObjCPropertySetterName = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCPropertySetterName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getObjCDeclQualifiers = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCDeclQualifiers").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isObjCOptional = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isObjCOptional").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isVariadic = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isVariadic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_Cursor_isExternalSymbol = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_isExternalSymbol").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Cursor_getCommentRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getCommentRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getRawCommentText = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getRawCommentText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getBriefCommentText = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getBriefCommentText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getMangling = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getMangling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Cursor_getCXXManglings = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getCXXManglings").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_Cursor_getObjCManglings = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getObjCManglings").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_Cursor_getModule = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getModule").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_getModuleForFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_getModuleForFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getASTFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getASTFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getParent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getName = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getFullName = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getFullName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_isSystem = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_isSystem").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getNumTopLevelHeaders = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getNumTopLevelHeaders").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Module_getTopLevelHeader = gSystemLinker.downcallHandle(gLibLookup.find("clang_Module_getTopLevelHeader").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_CXXConstructor_isConvertingConstructor = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXConstructor_isConvertingConstructor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXConstructor_isCopyConstructor = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXConstructor_isCopyConstructor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXConstructor_isDefaultConstructor = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXConstructor_isDefaultConstructor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXConstructor_isMoveConstructor = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXConstructor_isMoveConstructor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXField_isMutable = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXField_isMutable").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isDefaulted = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isDefaulted").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isDeleted = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isDeleted").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isPureVirtual = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isPureVirtual").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isStatic = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isStatic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isVirtual = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isVirtual").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isCopyAssignmentOperator = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isCopyAssignmentOperator").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isMoveAssignmentOperator = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isMoveAssignmentOperator").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isExplicit = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isExplicit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXRecord_isAbstract = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXRecord_isAbstract").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_EnumDecl_isScoped = gSystemLinker.downcallHandle(gLibLookup.find("clang_EnumDecl_isScoped").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_CXXMethod_isConst = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXXMethod_isConst").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getTemplateCursorKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTemplateCursorKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getSpecializedCursorTemplate = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSpecializedCursorTemplate").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXCursor.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getCursorReferenceNameRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorReferenceNameRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getToken = gSystemLinker.downcallHandle(gLibLookup.find("clang_getToken").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, CXSourceLocation.gStructLayout));
		MTD$clang_getTokenKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXToken.gStructLayout));
		MTD$clang_getTokenSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXToken.gStructLayout));
		MTD$clang_getTokenLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXToken.gStructLayout));
		MTD$clang_getTokenExtent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getTokenExtent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXToken.gStructLayout));
		MTD$clang_tokenize = gSystemLinker.downcallHandle(gLibLookup.find("clang_tokenize").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, CXSourceRange.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_annotateTokens = gSystemLinker.downcallHandle(gLibLookup.find("clang_annotateTokens").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeTokens = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeTokens").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCursorKindSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorKindSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getDefinitionSpellingAndExtent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDefinitionSpellingAndExtent").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_enableStackTraces = gSystemLinker.downcallHandle(gLibLookup.find("clang_enableStackTraces").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid());
		MTD$clang_executeOnThread = gSystemLinker.downcallHandle(gLibLookup.find("clang_executeOnThread").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCompletionChunkKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionChunkKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCompletionChunkText = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionChunkText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCompletionChunkCompletionString = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionChunkCompletionString").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getNumCompletionChunks = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumCompletionChunks").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCompletionPriority = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionPriority").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCompletionAvailability = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionAvailability").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCompletionNumAnnotations = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionNumAnnotations").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCompletionAnnotation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionAnnotation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCompletionParent = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionParent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCompletionBriefComment = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionBriefComment").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getCursorCompletionString = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorCompletionString").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_getCompletionNumFixIts = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionNumFixIts").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCompletionFixIt = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCompletionFixIt").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_defaultCodeCompleteOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultCodeCompleteOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_codeCompleteAt = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteAt").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_sortCodeCompletionResults = gSystemLinker.downcallHandle(gLibLookup.find("clang_sortCodeCompletionResults").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_disposeCodeCompleteResults = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeCodeCompleteResults").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_codeCompleteGetNumDiagnostics = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetNumDiagnostics").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_codeCompleteGetDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetDiagnostic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_codeCompleteGetContexts = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetContexts").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_codeCompleteGetContainerKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetContainerKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_codeCompleteGetContainerUSR = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetContainerUSR").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_codeCompleteGetObjCSelector = gSystemLinker.downcallHandle(gLibLookup.find("clang_codeCompleteGetObjCSelector").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getClangVersion = gSystemLinker.downcallHandle(gLibLookup.find("clang_getClangVersion").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout));
		MTD$clang_toggleCrashRecovery = gSystemLinker.downcallHandle(gLibLookup.find("clang_toggleCrashRecovery").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getInclusions = gSystemLinker.downcallHandle(gLibLookup.find("clang_getInclusions").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_Cursor_Evaluate = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_Evaluate").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXCursor.gStructLayout));
		MTD$clang_EvalResult_getKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_getAsInt = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getAsInt").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_getAsLongLong = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getAsLongLong").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_isUnsignedInt = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_isUnsignedInt").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_getAsUnsigned = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getAsUnsigned").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_getAsDouble = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getAsDouble").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_getAsStr = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_getAsStr").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_EvalResult_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_EvalResult_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getRemappings = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRemappings").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getRemappingsFromFileList = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRemappingsFromFileList").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_remap_getNumFiles = gSystemLinker.downcallHandle(gLibLookup.find("clang_remap_getNumFiles").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_remap_getFilenames = gSystemLinker.downcallHandle(gLibLookup.find("clang_remap_getFilenames").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_remap_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_remap_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_findReferencesInFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_findReferencesInFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, CXCursorAndRangeVisitor.gStructLayout));
		MTD$clang_findIncludesInFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_findIncludesInFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, CXCursorAndRangeVisitor.gStructLayout));
		MTD$clang_findReferencesInFileWithBlock = gSystemLinker.downcallHandle(gLibLookup.find("clang_findReferencesInFileWithBlock").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_findIncludesInFileWithBlock = gSystemLinker.downcallHandle(gLibLookup.find("clang_findIncludesInFileWithBlock").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_isEntityObjCContainerKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_isEntityObjCContainerKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_index_getObjCContainerDeclInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getObjCContainerDeclInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getObjCInterfaceDeclInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getObjCInterfaceDeclInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getObjCCategoryDeclInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getObjCCategoryDeclInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getObjCProtocolRefListInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getObjCProtocolRefListInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getObjCPropertyDeclInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getObjCPropertyDeclInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getIBOutletCollectionAttrInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getIBOutletCollectionAttrInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getCXXClassDeclInfo = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getCXXClassDeclInfo").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getClientContainer = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getClientContainer").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_setClientContainer = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_setClientContainer").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_getClientEntity = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_getClientEntity").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_index_setClientEntity = gSystemLinker.downcallHandle(gLibLookup.find("clang_index_setClientEntity").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_IndexAction_create = gSystemLinker.downcallHandle(gLibLookup.find("clang_IndexAction_create").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_IndexAction_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_IndexAction_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_indexSourceFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_indexSourceFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_indexSourceFileFullArgv = gSystemLinker.downcallHandle(gLibLookup.find("clang_indexSourceFileFullArgv").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_indexTranslationUnit = gSystemLinker.downcallHandle(gLibLookup.find("clang_indexTranslationUnit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_indexLoc_getFileLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_indexLoc_getFileLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXIdxLoc.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_indexLoc_getCXSourceLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_indexLoc_getCXSourceLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXIdxLoc.gStructLayout));
		MTD$clang_Type_visitFields = gSystemLinker.downcallHandle(gLibLookup.find("clang_Type_visitFields").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXType.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getBinaryOperatorKindSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getBinaryOperatorKindSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCursorBinaryOperatorKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorBinaryOperatorKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getUnaryOperatorKindSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getUnaryOperatorKindSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getCursorUnaryOperatorKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCursorUnaryOperatorKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXCursor.gStructLayout));
		MTD$clang_getCString = gSystemLinker.downcallHandle(gLibLookup.find("clang_getCString").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, CXString.gStructLayout));
		MTD$clang_disposeString = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeString").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXString.gStructLayout));
		MTD$clang_disposeStringSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeStringSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_create = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_create").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_insertTextBefore = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_insertTextBefore").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_replaceText = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_replaceText").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, CXSourceRange.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_removeText = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_removeText").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, CXSourceRange.gStructLayout));
		MTD$clang_CXRewriter_overwriteChangedFiles = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_overwriteChangedFiles").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_writeMainFileToStdOut = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_writeMainFileToStdOut").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CXRewriter_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_CXRewriter_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_install_aborting_llvm_fatal_error_handler = gSystemLinker.downcallHandle(gLibLookup.find("clang_install_aborting_llvm_fatal_error_handler").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid());
		MTD$clang_uninstall_llvm_fatal_error_handler = gSystemLinker.downcallHandle(gLibLookup.find("clang_uninstall_llvm_fatal_error_handler").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid());
		MTD$clang_Cursor_getParsedComment = gSystemLinker.downcallHandle(gLibLookup.find("clang_Cursor_getParsedComment").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXComment.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_Comment_getKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_Comment_getKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_Comment_getNumChildren = gSystemLinker.downcallHandle(gLibLookup.find("clang_Comment_getNumChildren").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_Comment_getChild = gSystemLinker.downcallHandle(gLibLookup.find("clang_Comment_getChild").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXComment.gStructLayout, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_Comment_isWhitespace = gSystemLinker.downcallHandle(gLibLookup.find("clang_Comment_isWhitespace").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_InlineContentComment_hasTrailingNewline = gSystemLinker.downcallHandle(gLibLookup.find("clang_InlineContentComment_hasTrailingNewline").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_TextComment_getText = gSystemLinker.downcallHandle(gLibLookup.find("clang_TextComment_getText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_InlineCommandComment_getCommandName = gSystemLinker.downcallHandle(gLibLookup.find("clang_InlineCommandComment_getCommandName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_InlineCommandComment_getRenderKind = gSystemLinker.downcallHandle(gLibLookup.find("clang_InlineCommandComment_getRenderKind").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_InlineCommandComment_getNumArgs = gSystemLinker.downcallHandle(gLibLookup.find("clang_InlineCommandComment_getNumArgs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_InlineCommandComment_getArgText = gSystemLinker.downcallHandle(gLibLookup.find("clang_InlineCommandComment_getArgText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_HTMLTagComment_getTagName = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLTagComment_getTagName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_HTMLStartTagComment_isSelfClosing = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLStartTagComment_isSelfClosing").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_HTMLStartTag_getNumAttrs = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLStartTag_getNumAttrs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_HTMLStartTag_getAttrName = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLStartTag_getAttrName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_HTMLStartTag_getAttrValue = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLStartTag_getAttrValue").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_BlockCommandComment_getCommandName = gSystemLinker.downcallHandle(gLibLookup.find("clang_BlockCommandComment_getCommandName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_BlockCommandComment_getNumArgs = gSystemLinker.downcallHandle(gLibLookup.find("clang_BlockCommandComment_getNumArgs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_BlockCommandComment_getArgText = gSystemLinker.downcallHandle(gLibLookup.find("clang_BlockCommandComment_getArgText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_BlockCommandComment_getParagraph = gSystemLinker.downcallHandle(gLibLookup.find("clang_BlockCommandComment_getParagraph").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXComment.gStructLayout, CXComment.gStructLayout));
		MTD$clang_ParamCommandComment_getParamName = gSystemLinker.downcallHandle(gLibLookup.find("clang_ParamCommandComment_getParamName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_ParamCommandComment_isParamIndexValid = gSystemLinker.downcallHandle(gLibLookup.find("clang_ParamCommandComment_isParamIndexValid").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_ParamCommandComment_getParamIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_ParamCommandComment_getParamIndex").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_ParamCommandComment_isDirectionExplicit = gSystemLinker.downcallHandle(gLibLookup.find("clang_ParamCommandComment_isDirectionExplicit").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_ParamCommandComment_getDirection = gSystemLinker.downcallHandle(gLibLookup.find("clang_ParamCommandComment_getDirection").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_TParamCommandComment_getParamName = gSystemLinker.downcallHandle(gLibLookup.find("clang_TParamCommandComment_getParamName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_TParamCommandComment_isParamPositionValid = gSystemLinker.downcallHandle(gLibLookup.find("clang_TParamCommandComment_isParamPositionValid").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_TParamCommandComment_getDepth = gSystemLinker.downcallHandle(gLibLookup.find("clang_TParamCommandComment_getDepth").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout));
		MTD$clang_TParamCommandComment_getIndex = gSystemLinker.downcallHandle(gLibLookup.find("clang_TParamCommandComment_getIndex").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_VerbatimBlockLineComment_getText = gSystemLinker.downcallHandle(gLibLookup.find("clang_VerbatimBlockLineComment_getText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_VerbatimLineComment_getText = gSystemLinker.downcallHandle(gLibLookup.find("clang_VerbatimLineComment_getText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_HTMLTagComment_getAsString = gSystemLinker.downcallHandle(gLibLookup.find("clang_HTMLTagComment_getAsString").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_FullComment_getAsHTML = gSystemLinker.downcallHandle(gLibLookup.find("clang_FullComment_getAsHTML").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_FullComment_getAsXML = gSystemLinker.downcallHandle(gLibLookup.find("clang_FullComment_getAsXML").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXComment.gStructLayout));
		MTD$clang_createAPISet = gSystemLinker.downcallHandle(gLibLookup.find("clang_createAPISet").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeAPISet = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeAPISet").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getSymbolGraphForUSR = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSymbolGraphForUSR").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getSymbolGraphForCursor = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSymbolGraphForCursor").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, CXCursor.gStructLayout));
		MTD$clang_getNullLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNullLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout));
		MTD$clang_equalLocations = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalLocations").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXSourceLocation.gStructLayout, CXSourceLocation.gStructLayout));
		MTD$clang_Location_isInSystemHeader = gSystemLinker.downcallHandle(gLibLookup.find("clang_Location_isInSystemHeader").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXSourceLocation.gStructLayout));
		MTD$clang_Location_isFromMainFile = gSystemLinker.downcallHandle(gLibLookup.find("clang_Location_isFromMainFile").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXSourceLocation.gStructLayout));
		MTD$clang_getNullRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNullRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout));
		MTD$clang_getRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, CXSourceLocation.gStructLayout, CXSourceLocation.gStructLayout));
		MTD$clang_equalRanges = gSystemLinker.downcallHandle(gLibLookup.find("clang_equalRanges").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXSourceRange.gStructLayout, CXSourceRange.gStructLayout));
		MTD$clang_Range_isNull = gSystemLinker.downcallHandle(gLibLookup.find("clang_Range_isNull").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, CXSourceRange.gStructLayout));
		MTD$clang_getExpansionLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getExpansionLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getPresumedLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getPresumedLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getInstantiationLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getInstantiationLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getSpellingLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getSpellingLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFileLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getRangeStart = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRangeStart").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXSourceRange.gStructLayout));
		MTD$clang_getRangeEnd = gSystemLinker.downcallHandle(gLibLookup.find("clang_getRangeEnd").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, CXSourceRange.gStructLayout));
		MTD$clang_disposeSourceRangeList = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeSourceRangeList").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFileName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFileTime = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileTime").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getFileUniqueID = gSystemLinker.downcallHandle(gLibLookup.find("clang_getFileUniqueID").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_File_isEqual = gSystemLinker.downcallHandle(gLibLookup.find("clang_File_isEqual").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_File_tryGetRealPathName = gSystemLinker.downcallHandle(gLibLookup.find("clang_File_tryGetRealPathName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getNumDiagnosticsInSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_getNumDiagnosticsInSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticInSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticInSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_loadDiagnostics = gSystemLinker.downcallHandle(gLibLookup.find("clang_loadDiagnostics").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeDiagnosticSet = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeDiagnosticSet").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getChildDiagnostics = gSystemLinker.downcallHandle(gLibLookup.find("clang_getChildDiagnostics").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_disposeDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_disposeDiagnostic").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_formatDiagnostic = gSystemLinker.downcallHandle(gLibLookup.find("clang_formatDiagnostic").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_defaultDiagnosticDisplayOptions = gSystemLinker.downcallHandle(gLibLookup.find("clang_defaultDiagnosticDisplayOptions").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getDiagnosticSeverity = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticSeverity").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticLocation = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticLocation").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceLocation.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticSpelling = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticSpelling").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticOption = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticOption").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticCategory = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticCategory").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticCategoryName = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticCategoryName").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getDiagnosticCategoryText = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticCategoryText").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticNumRanges = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticNumRanges").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticRange = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticRange").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXSourceRange.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_getDiagnosticNumFixIts = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticNumFixIts").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_getDiagnosticFixIt = gSystemLinker.downcallHandle(gLibLookup.find("clang_getDiagnosticFixIt").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompilationDatabase_fromDirectory = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompilationDatabase_fromDirectory").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompilationDatabase_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompilationDatabase_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompilationDatabase_getCompileCommands = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompilationDatabase_getCompileCommands").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompilationDatabase_getAllCompileCommands = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompilationDatabase_getAllCompileCommands").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommands_dispose = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommands_dispose").orElseThrow(), java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommands_getSize = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommands_getSize").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommands_getCommand = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommands_getCommand").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_CompileCommand_getDirectory = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getDirectory").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommand_getFilename = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getFilename").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommand_getNumArgs = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getNumArgs").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommand_getArg = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getArg").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_CompileCommand_getNumMappedSources = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getNumMappedSources").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
		MTD$clang_CompileCommand_getMappedSourcePath = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getMappedSourcePath").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
		MTD$clang_CompileCommand_getMappedSourceContent = gSystemLinker.downcallHandle(gLibLookup.find("clang_CompileCommand_getMappedSourceContent").orElseThrow(), java.lang.foreign.FunctionDescriptor.of(CXString.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
	}
}
