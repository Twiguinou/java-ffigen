package jpgen.clang;

public final class Index_h
{private Index_h() {}

    public static final int CINDEX_VERSION_MAJOR = 0;
    public static final int CINDEX_VERSION_MINOR = 64;

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createIndex;
    public static final java.lang.invoke.MethodHandle MTD$clang_createIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeIndex;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createIndexWithOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_createIndexWithOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXIndex_setGlobalOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_setGlobalOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXIndex_getGlobalOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_getGlobalOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXIndex_setInvocationEmissionPathOption;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXIndex_setInvocationEmissionPathOption;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isFileMultipleIncludeGuarded;
    public static final java.lang.invoke.MethodHandle MTD$clang_isFileMultipleIncludeGuarded;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFileContents;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFileContents;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getLocationForOffset;
    public static final java.lang.invoke.MethodHandle MTD$clang_getLocationForOffset;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getSkippedRanges;
    public static final java.lang.invoke.MethodHandle MTD$clang_getSkippedRanges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getAllSkippedRanges;
    public static final java.lang.invoke.MethodHandle MTD$clang_getAllSkippedRanges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumDiagnostics;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumDiagnostics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnostic;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnostic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticSetFromTU;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSetFromTU;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTranslationUnitSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createTranslationUnitFromSourceFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnitFromSourceFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createTranslationUnit2;
    public static final java.lang.invoke.MethodHandle MTD$clang_createTranslationUnit2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_defaultEditingTranslationUnitOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_defaultEditingTranslationUnitOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_parseTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_parseTranslationUnit2;
    public static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_parseTranslationUnit2FullArgv;
    public static final java.lang.invoke.MethodHandle MTD$clang_parseTranslationUnit2FullArgv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_defaultSaveOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_defaultSaveOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_saveTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_saveTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_suspendTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_suspendTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_defaultReparseOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_defaultReparseOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_reparseTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_reparseTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTUResourceUsageName;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTUResourceUsageName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCXTUResourceUsage;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCXTUResourceUsage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeCXTUResourceUsage;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeCXTUResourceUsage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTranslationUnitTargetInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitTargetInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TargetInfo_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TargetInfo_getTriple;
    public static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_getTriple;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TargetInfo_getPointerWidth;
    public static final java.lang.invoke.MethodHandle MTD$clang_TargetInfo_getPointerWidth;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNullCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNullCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTranslationUnitCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTranslationUnitCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_equalCursors;
    public static final java.lang.invoke.MethodHandle MTD$clang_equalCursors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isNull;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isNull;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_hashCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_hashCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isDeclaration;
    public static final java.lang.invoke.MethodHandle MTD$clang_isDeclaration;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isInvalidDeclaration;
    public static final java.lang.invoke.MethodHandle MTD$clang_isInvalidDeclaration;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isReference;
    public static final java.lang.invoke.MethodHandle MTD$clang_isReference;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isExpression;
    public static final java.lang.invoke.MethodHandle MTD$clang_isExpression;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isStatement;
    public static final java.lang.invoke.MethodHandle MTD$clang_isStatement;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isAttribute;
    public static final java.lang.invoke.MethodHandle MTD$clang_isAttribute;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_hasAttrs;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasAttrs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isInvalid;
    public static final java.lang.invoke.MethodHandle MTD$clang_isInvalid;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_isTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isPreprocessing;
    public static final java.lang.invoke.MethodHandle MTD$clang_isPreprocessing;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isUnexposed;
    public static final java.lang.invoke.MethodHandle MTD$clang_isUnexposed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorLinkage;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorLinkage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorVisibility;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorVisibility;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorAvailability;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorAvailability;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorPlatformAvailability;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorPlatformAvailability;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeCXPlatformAvailability;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeCXPlatformAvailability;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getVarDeclInitializer;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getVarDeclInitializer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_hasVarDeclGlobalStorage;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasVarDeclGlobalStorage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_hasVarDeclExternalStorage;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_hasVarDeclExternalStorage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorLanguage;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorLanguage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorTLSKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorTLSKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createCXCursorSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_createCXCursorSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeCXCursorSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeCXCursorSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXCursorSet_contains;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXCursorSet_contains;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXCursorSet_insert;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXCursorSet_insert;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorSemanticParent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorSemanticParent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorLexicalParent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorLexicalParent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getOverriddenCursors;
    public static final java.lang.invoke.MethodHandle MTD$clang_getOverriddenCursors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeOverriddenCursors;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeOverriddenCursors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getIncludedFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_getIncludedFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorExtent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorExtent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTypeSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTypeSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTypedefDeclUnderlyingType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTypedefDeclUnderlyingType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getEnumDeclIntegerType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getEnumDeclIntegerType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getEnumConstantDeclValue;
    public static final java.lang.invoke.MethodHandle MTD$clang_getEnumConstantDeclValue;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getEnumConstantDeclUnsignedValue;
    public static final java.lang.invoke.MethodHandle MTD$clang_getEnumConstantDeclUnsignedValue;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isBitField;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isBitField;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFieldDeclBitWidth;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFieldDeclBitWidth;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getNumArguments;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getNumArguments;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getArgument;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getArgument;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getNumTemplateArguments;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getNumTemplateArguments;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getTemplateArgumentKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getTemplateArgumentType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getTemplateArgumentValue;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentValue;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getTemplateArgumentUnsignedValue;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getTemplateArgumentUnsignedValue;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_equalTypes;
    public static final java.lang.invoke.MethodHandle MTD$clang_equalTypes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCanonicalType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCanonicalType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isConstQualifiedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_isConstQualifiedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isMacroFunctionLike;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isMacroFunctionLike;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isMacroBuiltin;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isMacroBuiltin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isFunctionInlined;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isFunctionInlined;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isVolatileQualifiedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_isVolatileQualifiedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isRestrictQualifiedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_isRestrictQualifiedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getAddressSpace;
    public static final java.lang.invoke.MethodHandle MTD$clang_getAddressSpace;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTypedefName;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTypedefName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getPointeeType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getPointeeType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getUnqualifiedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getUnqualifiedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNonReferenceType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNonReferenceType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTypeDeclaration;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTypeDeclaration;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDeclObjCTypeEncoding;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDeclObjCTypeEncoding;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getObjCEncoding;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCEncoding;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTypeKindSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTypeKindSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFunctionTypeCallingConv;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFunctionTypeCallingConv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getResultType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getResultType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getExceptionSpecificationType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getExceptionSpecificationType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumArgTypes;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumArgTypes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getArgType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getArgType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getObjCObjectBaseType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCObjectBaseType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getNumObjCProtocolRefs;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumObjCProtocolRefs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getObjCProtocolDecl;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCProtocolDecl;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getNumObjCTypeArgs;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumObjCTypeArgs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getObjCTypeArg;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getObjCTypeArg;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isFunctionTypeVariadic;
    public static final java.lang.invoke.MethodHandle MTD$clang_isFunctionTypeVariadic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorResultType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorResultType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorExceptionSpecificationType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorExceptionSpecificationType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isPODType;
    public static final java.lang.invoke.MethodHandle MTD$clang_isPODType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getElementType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getElementType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumElements;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumElements;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getArrayElementType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getArrayElementType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getArraySize;
    public static final java.lang.invoke.MethodHandle MTD$clang_getArraySize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getNamedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getNamedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_isTransparentTagTypedef;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_isTransparentTagTypedef;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getNullability;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getNullability;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getAlignOf;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getAlignOf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getClassType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getClassType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getSizeOf;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getSizeOf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getOffsetOf;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getOffsetOf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getModifiedType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getModifiedType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getValueType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getValueType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getOffsetOfField;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getOffsetOfField;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isAnonymous;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isAnonymous;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isAnonymousRecordDecl;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isAnonymousRecordDecl;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isInlineNamespace;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isInlineNamespace;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getNumTemplateArguments;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getNumTemplateArguments;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getTemplateArgumentAsType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getTemplateArgumentAsType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_getCXXRefQualifier;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_getCXXRefQualifier;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isVirtualBase;
    public static final java.lang.invoke.MethodHandle MTD$clang_isVirtualBase;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCXXAccessSpecifier;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCXXAccessSpecifier;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getStorageClass;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getStorageClass;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumOverloadedDecls;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumOverloadedDecls;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getOverloadedDecl;
    public static final java.lang.invoke.MethodHandle MTD$clang_getOverloadedDecl;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getIBOutletCollectionType;
    public static final java.lang.invoke.MethodHandle MTD$clang_getIBOutletCollectionType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_visitChildren;
    public static final java.lang.invoke.MethodHandle MTD$clang_visitChildren;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_visitChildrenWithBlock;
    public static final java.lang.invoke.MethodHandle MTD$clang_visitChildrenWithBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorUSR;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorUSR;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCClass;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCClass;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCCategory;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCCategory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCProtocol;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCProtocol;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCIvar;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCIvar;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCMethod;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCMethod;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_constructUSR_ObjCProperty;
    public static final java.lang.invoke.MethodHandle MTD$clang_constructUSR_ObjCProperty;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getSpellingNameRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getSpellingNameRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_PrintingPolicy_getProperty;
    public static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_getProperty;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_PrintingPolicy_setProperty;
    public static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_setProperty;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorPrintingPolicy;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorPrintingPolicy;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_PrintingPolicy_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_PrintingPolicy_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorPrettyPrinted;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorPrettyPrinted;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorDisplayName;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorDisplayName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorReferenced;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorReferenced;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorDefinition;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorDefinition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_isCursorDefinition;
    public static final java.lang.invoke.MethodHandle MTD$clang_isCursorDefinition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCanonicalCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCanonicalCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCSelectorIndex;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCSelectorIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isDynamicCall;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isDynamicCall;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getReceiverType;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getReceiverType;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCPropertyAttributes;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertyAttributes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCPropertyGetterName;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertyGetterName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCPropertySetterName;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCPropertySetterName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCDeclQualifiers;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCDeclQualifiers;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isObjCOptional;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isObjCOptional;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isVariadic;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isVariadic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_isExternalSymbol;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_isExternalSymbol;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getCommentRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getCommentRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getRawCommentText;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getRawCommentText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getBriefCommentText;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getBriefCommentText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getMangling;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getMangling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getCXXManglings;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getCXXManglings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getObjCManglings;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getObjCManglings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getModule;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getModule;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getModuleForFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_getModuleForFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getASTFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getASTFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getParent;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getParent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getName;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getFullName;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getFullName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_isSystem;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_isSystem;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getNumTopLevelHeaders;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getNumTopLevelHeaders;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Module_getTopLevelHeader;
    public static final java.lang.invoke.MethodHandle MTD$clang_Module_getTopLevelHeader;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXConstructor_isConvertingConstructor;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isConvertingConstructor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXConstructor_isCopyConstructor;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isCopyConstructor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXConstructor_isDefaultConstructor;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isDefaultConstructor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXConstructor_isMoveConstructor;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXConstructor_isMoveConstructor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXField_isMutable;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXField_isMutable;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isDefaulted;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isDefaulted;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isDeleted;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isDeleted;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isPureVirtual;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isPureVirtual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isStatic;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isStatic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isVirtual;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isVirtual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isCopyAssignmentOperator;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isCopyAssignmentOperator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isMoveAssignmentOperator;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isMoveAssignmentOperator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isExplicit;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isExplicit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXRecord_isAbstract;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXRecord_isAbstract;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EnumDecl_isScoped;
    public static final java.lang.invoke.MethodHandle MTD$clang_EnumDecl_isScoped;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXXMethod_isConst;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXXMethod_isConst;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTemplateCursorKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTemplateCursorKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getSpecializedCursorTemplate;
    public static final java.lang.invoke.MethodHandle MTD$clang_getSpecializedCursorTemplate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorReferenceNameRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorReferenceNameRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getToken;
    public static final java.lang.invoke.MethodHandle MTD$clang_getToken;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTokenKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTokenKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTokenSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTokenSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTokenLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTokenLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getTokenExtent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getTokenExtent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_tokenize;
    public static final java.lang.invoke.MethodHandle MTD$clang_tokenize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_annotateTokens;
    public static final java.lang.invoke.MethodHandle MTD$clang_annotateTokens;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeTokens;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeTokens;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorKindSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorKindSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDefinitionSpellingAndExtent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDefinitionSpellingAndExtent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_enableStackTraces;
    public static final java.lang.invoke.MethodHandle MTD$clang_enableStackTraces;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_executeOnThread;
    public static final java.lang.invoke.MethodHandle MTD$clang_executeOnThread;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionChunkKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionChunkText;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionChunkCompletionString;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionChunkCompletionString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumCompletionChunks;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumCompletionChunks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionPriority;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionPriority;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionAvailability;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionAvailability;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionNumAnnotations;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionNumAnnotations;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionAnnotation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionAnnotation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionParent;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionParent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionBriefComment;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionBriefComment;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorCompletionString;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorCompletionString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionNumFixIts;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionNumFixIts;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCompletionFixIt;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCompletionFixIt;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_defaultCodeCompleteOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_defaultCodeCompleteOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteAt;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteAt;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_sortCodeCompletionResults;
    public static final java.lang.invoke.MethodHandle MTD$clang_sortCodeCompletionResults;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeCodeCompleteResults;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeCodeCompleteResults;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetNumDiagnostics;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetNumDiagnostics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetDiagnostic;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetDiagnostic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetContexts;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContexts;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetContainerKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContainerKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetContainerUSR;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetContainerUSR;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_codeCompleteGetObjCSelector;
    public static final java.lang.invoke.MethodHandle MTD$clang_codeCompleteGetObjCSelector;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getClangVersion;
    public static final java.lang.invoke.MethodHandle MTD$clang_getClangVersion;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_toggleCrashRecovery;
    public static final java.lang.invoke.MethodHandle MTD$clang_toggleCrashRecovery;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getInclusions;
    public static final java.lang.invoke.MethodHandle MTD$clang_getInclusions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_Evaluate;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_Evaluate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getAsInt;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsInt;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getAsLongLong;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsLongLong;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_isUnsignedInt;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_isUnsignedInt;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getAsUnsigned;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsUnsigned;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getAsDouble;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsDouble;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_getAsStr;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_getAsStr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_EvalResult_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_EvalResult_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getRemappings;
    public static final java.lang.invoke.MethodHandle MTD$clang_getRemappings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getRemappingsFromFileList;
    public static final java.lang.invoke.MethodHandle MTD$clang_getRemappingsFromFileList;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_remap_getNumFiles;
    public static final java.lang.invoke.MethodHandle MTD$clang_remap_getNumFiles;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_remap_getFilenames;
    public static final java.lang.invoke.MethodHandle MTD$clang_remap_getFilenames;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_remap_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_remap_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_findReferencesInFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_findReferencesInFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_findIncludesInFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_findIncludesInFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_findReferencesInFileWithBlock;
    public static final java.lang.invoke.MethodHandle MTD$clang_findReferencesInFileWithBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_findIncludesInFileWithBlock;
    public static final java.lang.invoke.MethodHandle MTD$clang_findIncludesInFileWithBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_isEntityObjCContainerKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_isEntityObjCContainerKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getObjCContainerDeclInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCContainerDeclInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getObjCInterfaceDeclInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCInterfaceDeclInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getObjCCategoryDeclInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCCategoryDeclInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getObjCProtocolRefListInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCProtocolRefListInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getObjCPropertyDeclInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getObjCPropertyDeclInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getIBOutletCollectionAttrInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getIBOutletCollectionAttrInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getCXXClassDeclInfo;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getCXXClassDeclInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getClientContainer;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getClientContainer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_setClientContainer;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_setClientContainer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_getClientEntity;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_getClientEntity;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_index_setClientEntity;
    public static final java.lang.invoke.MethodHandle MTD$clang_index_setClientEntity;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_IndexAction_create;
    public static final java.lang.invoke.MethodHandle MTD$clang_IndexAction_create;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_IndexAction_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_IndexAction_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_indexSourceFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_indexSourceFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_indexSourceFileFullArgv;
    public static final java.lang.invoke.MethodHandle MTD$clang_indexSourceFileFullArgv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_indexTranslationUnit;
    public static final java.lang.invoke.MethodHandle MTD$clang_indexTranslationUnit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_indexLoc_getFileLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_indexLoc_getFileLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_indexLoc_getCXSourceLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_indexLoc_getCXSourceLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Type_visitFields;
    public static final java.lang.invoke.MethodHandle MTD$clang_Type_visitFields;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getBinaryOperatorKindSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getBinaryOperatorKindSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorBinaryOperatorKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorBinaryOperatorKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getUnaryOperatorKindSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getUnaryOperatorKindSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCursorUnaryOperatorKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCursorUnaryOperatorKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_create;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_create;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_insertTextBefore;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_insertTextBefore;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_replaceText;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_replaceText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_removeText;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_removeText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_overwriteChangedFiles;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_overwriteChangedFiles;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_writeMainFileToStdOut;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_writeMainFileToStdOut;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CXRewriter_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_CXRewriter_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_install_aborting_llvm_fatal_error_handler;
    public static final java.lang.invoke.MethodHandle MTD$clang_install_aborting_llvm_fatal_error_handler;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_uninstall_llvm_fatal_error_handler;
    public static final java.lang.invoke.MethodHandle MTD$clang_uninstall_llvm_fatal_error_handler;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Cursor_getParsedComment;
    public static final java.lang.invoke.MethodHandle MTD$clang_Cursor_getParsedComment;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Comment_getKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_Comment_getKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Comment_getNumChildren;
    public static final java.lang.invoke.MethodHandle MTD$clang_Comment_getNumChildren;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Comment_getChild;
    public static final java.lang.invoke.MethodHandle MTD$clang_Comment_getChild;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Comment_isWhitespace;
    public static final java.lang.invoke.MethodHandle MTD$clang_Comment_isWhitespace;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_InlineContentComment_hasTrailingNewline;
    public static final java.lang.invoke.MethodHandle MTD$clang_InlineContentComment_hasTrailingNewline;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TextComment_getText;
    public static final java.lang.invoke.MethodHandle MTD$clang_TextComment_getText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_InlineCommandComment_getCommandName;
    public static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getCommandName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_InlineCommandComment_getRenderKind;
    public static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getRenderKind;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_InlineCommandComment_getNumArgs;
    public static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getNumArgs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_InlineCommandComment_getArgText;
    public static final java.lang.invoke.MethodHandle MTD$clang_InlineCommandComment_getArgText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLTagComment_getTagName;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLTagComment_getTagName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLStartTagComment_isSelfClosing;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTagComment_isSelfClosing;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLStartTag_getNumAttrs;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getNumAttrs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLStartTag_getAttrName;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getAttrName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLStartTag_getAttrValue;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLStartTag_getAttrValue;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_BlockCommandComment_getCommandName;
    public static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getCommandName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_BlockCommandComment_getNumArgs;
    public static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getNumArgs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_BlockCommandComment_getArgText;
    public static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getArgText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_BlockCommandComment_getParagraph;
    public static final java.lang.invoke.MethodHandle MTD$clang_BlockCommandComment_getParagraph;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ParamCommandComment_getParamName;
    public static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getParamName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ParamCommandComment_isParamIndexValid;
    public static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_isParamIndexValid;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ParamCommandComment_getParamIndex;
    public static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getParamIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ParamCommandComment_isDirectionExplicit;
    public static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_isDirectionExplicit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ParamCommandComment_getDirection;
    public static final java.lang.invoke.MethodHandle MTD$clang_ParamCommandComment_getDirection;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TParamCommandComment_getParamName;
    public static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getParamName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TParamCommandComment_isParamPositionValid;
    public static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_isParamPositionValid;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TParamCommandComment_getDepth;
    public static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getDepth;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_TParamCommandComment_getIndex;
    public static final java.lang.invoke.MethodHandle MTD$clang_TParamCommandComment_getIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VerbatimBlockLineComment_getText;
    public static final java.lang.invoke.MethodHandle MTD$clang_VerbatimBlockLineComment_getText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VerbatimLineComment_getText;
    public static final java.lang.invoke.MethodHandle MTD$clang_VerbatimLineComment_getText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_HTMLTagComment_getAsString;
    public static final java.lang.invoke.MethodHandle MTD$clang_HTMLTagComment_getAsString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_FullComment_getAsHTML;
    public static final java.lang.invoke.MethodHandle MTD$clang_FullComment_getAsHTML;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_FullComment_getAsXML;
    public static final java.lang.invoke.MethodHandle MTD$clang_FullComment_getAsXML;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_createAPISet;
    public static final java.lang.invoke.MethodHandle MTD$clang_createAPISet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeAPISet;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeAPISet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getSymbolGraphForUSR;
    public static final java.lang.invoke.MethodHandle MTD$clang_getSymbolGraphForUSR;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getSymbolGraphForCursor;
    public static final java.lang.invoke.MethodHandle MTD$clang_getSymbolGraphForCursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getCString;
    public static final java.lang.invoke.MethodHandle MTD$clang_getCString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeString;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeStringSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeStringSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNullLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNullLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_equalLocations;
    public static final java.lang.invoke.MethodHandle MTD$clang_equalLocations;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Location_isInSystemHeader;
    public static final java.lang.invoke.MethodHandle MTD$clang_Location_isInSystemHeader;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Location_isFromMainFile;
    public static final java.lang.invoke.MethodHandle MTD$clang_Location_isFromMainFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNullRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNullRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_getRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_equalRanges;
    public static final java.lang.invoke.MethodHandle MTD$clang_equalRanges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_Range_isNull;
    public static final java.lang.invoke.MethodHandle MTD$clang_Range_isNull;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getExpansionLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getExpansionLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getPresumedLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getPresumedLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getInstantiationLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getInstantiationLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getSpellingLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getSpellingLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFileLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFileLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getRangeStart;
    public static final java.lang.invoke.MethodHandle MTD$clang_getRangeStart;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getRangeEnd;
    public static final java.lang.invoke.MethodHandle MTD$clang_getRangeEnd;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeSourceRangeList;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeSourceRangeList;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFileName;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFileName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFileTime;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFileTime;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getFileUniqueID;
    public static final java.lang.invoke.MethodHandle MTD$clang_getFileUniqueID;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_File_isEqual;
    public static final java.lang.invoke.MethodHandle MTD$clang_File_isEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_File_tryGetRealPathName;
    public static final java.lang.invoke.MethodHandle MTD$clang_File_tryGetRealPathName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getNumDiagnosticsInSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_getNumDiagnosticsInSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticInSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticInSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_loadDiagnostics;
    public static final java.lang.invoke.MethodHandle MTD$clang_loadDiagnostics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeDiagnosticSet;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeDiagnosticSet;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getChildDiagnostics;
    public static final java.lang.invoke.MethodHandle MTD$clang_getChildDiagnostics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_disposeDiagnostic;
    public static final java.lang.invoke.MethodHandle MTD$clang_disposeDiagnostic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_formatDiagnostic;
    public static final java.lang.invoke.MethodHandle MTD$clang_formatDiagnostic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_defaultDiagnosticDisplayOptions;
    public static final java.lang.invoke.MethodHandle MTD$clang_defaultDiagnosticDisplayOptions;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticSeverity;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSeverity;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticLocation;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticLocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticSpelling;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticSpelling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticOption;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticOption;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticCategory;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticCategoryName;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategoryName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticCategoryText;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticCategoryText;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticNumRanges;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticNumRanges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticRange;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticRange;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticNumFixIts;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticNumFixIts;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getDiagnosticFixIt;
    public static final java.lang.invoke.MethodHandle MTD$clang_getDiagnosticFixIt;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompilationDatabase_fromDirectory;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_fromDirectory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompilationDatabase_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompilationDatabase_getCompileCommands;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_getCompileCommands;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompilationDatabase_getAllCompileCommands;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompilationDatabase_getAllCompileCommands;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommands_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommands_getSize;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_getSize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommands_getCommand;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommands_getCommand;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getDirectory;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getDirectory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getFilename;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getFilename;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getNumArgs;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getNumArgs;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getArg;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getArg;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getNumMappedSources;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getNumMappedSources;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getMappedSourcePath;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getMappedSourcePath;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_CompileCommand_getMappedSourceContent;
    public static final java.lang.invoke.MethodHandle MTD$clang_CompileCommand_getMappedSourceContent;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_getBuildSessionTimestamp;
    public static final java.lang.invoke.MethodHandle MTD$clang_getBuildSessionTimestamp;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VirtualFileOverlay_create;
    public static final java.lang.invoke.MethodHandle MTD$clang_VirtualFileOverlay_create;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VirtualFileOverlay_addFileMapping;
    public static final java.lang.invoke.MethodHandle MTD$clang_VirtualFileOverlay_addFileMapping;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VirtualFileOverlay_setCaseSensitivity;
    public static final java.lang.invoke.MethodHandle MTD$clang_VirtualFileOverlay_setCaseSensitivity;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VirtualFileOverlay_writeToBuffer;
    public static final java.lang.invoke.MethodHandle MTD$clang_VirtualFileOverlay_writeToBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_free;
    public static final java.lang.invoke.MethodHandle MTD$clang_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_VirtualFileOverlay_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_VirtualFileOverlay_dispose;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ModuleMapDescriptor_create;
    public static final java.lang.invoke.MethodHandle MTD$clang_ModuleMapDescriptor_create;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ModuleMapDescriptor_setFrameworkModuleName;
    public static final java.lang.invoke.MethodHandle MTD$clang_ModuleMapDescriptor_setFrameworkModuleName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ModuleMapDescriptor_setUmbrellaHeader;
    public static final java.lang.invoke.MethodHandle MTD$clang_ModuleMapDescriptor_setUmbrellaHeader;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ModuleMapDescriptor_writeToBuffer;
    public static final java.lang.invoke.MethodHandle MTD$clang_ModuleMapDescriptor_writeToBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$clang_ModuleMapDescriptor_dispose;
    public static final java.lang.invoke.MethodHandle MTD$clang_ModuleMapDescriptor_dispose;

    /**
     * Provides a shared context for creating translation units.
     *
     * It provides two options:
     *
     * - excludeDeclarationsFromPCH: When non-zero, allows enumeration of "local"
     * declarations (when loading any new translation units). A "local" declaration
     * is one that belongs in the translation unit itself and not in a precompiled
     * header that was used by the translation unit. If zero, all declarations
     * will be enumerated.
     *
     * Here is an example:
     *
     * \code
     *   // excludeDeclsFromPCH = 1, displayDiagnostics=1
     *   Idx = clang_createIndex(1, 1);
     *
     *   // IndexTest.pch was produced with the following command:
     *   // "clang -x c IndexTest.h -emit-ast -o IndexTest.pch"
     *   TU = clang_createTranslationUnit(Idx, "IndexTest.pch");
     *
     *   // This will load all the symbols from 'IndexTest.pch'
     *   clang_visitChildren(clang_getTranslationUnitCursor(TU),
     *                       TranslationUnitVisitor, 0);
     *   clang_disposeTranslationUnit(TU);
     *
     *   // This will load all the symbols from 'IndexTest.c', excluding symbols
     *   // from 'IndexTest.pch'.
     *   char *args[] = { "-Xclang", "-include-pch=IndexTest.pch" };
     *   TU = clang_createTranslationUnitFromSourceFile(Idx, "IndexTest.c", 2, args,
     *                                                  0, 0);
     *   clang_visitChildren(clang_getTranslationUnitCursor(TU),
     *                       TranslationUnitVisitor, 0);
     *   clang_disposeTranslationUnit(TU);
     * \endcode
     *
     * This process of creating the 'pch', loading it separately, and using it (via
     * -include-pch) allows 'excludeDeclsFromPCH' to remove redundant callbacks
     * (which gives the indexer the same performance benefit as the compiler).
     */
    public static java.lang.foreign.MemorySegment clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_createIndex.invokeExact(excludeDeclarationsFromPCH, displayDiagnostics);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy the given index.
     *
     * The index must not be destroyed until all of the translation units created
     * within that index have been destroyed.
     */
    public static void clang_disposeIndex(java.lang.foreign.MemorySegment index)
    {
        try {MTD$clang_disposeIndex.invokeExact(index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Provides a shared context for creating translation units.
     *
     * Call this function instead of clang_createIndex() if you need to configure
     * the additional options in CXIndexOptions.
     *
     * \returns The created index or null in case of error, such as an unsupported
     * value of options->Size.
     *
     * For example:
     * \code
     * CXIndex createIndex(const char *ApplicationTemporaryPath) {
     *   const int ExcludeDeclarationsFromPCH = 1;
     *   const int DisplayDiagnostics = 1;
     *   CXIndex Idx;
     * #if CINDEX_VERSION_MINOR >= 64
     *   CXIndexOptions Opts;
     *   memset(&Opts, 0, sizeof(Opts));
     *   Opts.Size = sizeof(CXIndexOptions);
     *   Opts.ThreadBackgroundPriorityForIndexing = 1;
     *   Opts.ExcludeDeclarationsFromPCH = ExcludeDeclarationsFromPCH;
     *   Opts.DisplayDiagnostics = DisplayDiagnostics;
     *   Opts.PreambleStoragePath = ApplicationTemporaryPath;
     *   Idx = clang_createIndexWithOptions(&Opts);
     *   if (Idx)
     *     return Idx;
     *   fprintf(stderr,
     *           "clang_createIndexWithOptions() failed. "
     *           "CINDEX_VERSION_MINOR = %d, sizeof(CXIndexOptions) = %u\n",
     *           CINDEX_VERSION_MINOR, Opts.Size);
     * #else
     *   (void)ApplicationTemporaryPath;
     * #endif
     *   Idx = clang_createIndex(ExcludeDeclarationsFromPCH, DisplayDiagnostics);
     *   clang_CXIndex_setGlobalOptions(
     *       Idx, clang_CXIndex_getGlobalOptions(Idx) |
     *                CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
     *   return Idx;
     * }
     * \endcode
     *
     * \sa clang_createIndex()
     */
    public static java.lang.foreign.MemorySegment clang_createIndexWithOptions(java.lang.foreign.MemorySegment options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_createIndexWithOptions.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Sets general options associated with a CXIndex.
     *
     * This function is DEPRECATED. Set
     * CXIndexOptions::ThreadBackgroundPriorityForIndexing and/or
     * CXIndexOptions::ThreadBackgroundPriorityForEditing and call
     * clang_createIndexWithOptions() instead.
     *
     * For example:
     * \code
     * CXIndex idx = ...;
     * clang_CXIndex_setGlobalOptions(idx,
     *     clang_CXIndex_getGlobalOptions(idx) |
     *     CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
     * \endcode
     *
     * \param options A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags.
     */
    public static void clang_CXIndex_setGlobalOptions(java.lang.foreign.MemorySegment arg1, int options)
    {
        try {MTD$clang_CXIndex_setGlobalOptions.invokeExact(arg1, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Gets the general options associated with a CXIndex.
     *
     * This function allows to obtain the final option values used by libclang after
     * specifying the option policies via CXChoice enumerators.
     *
     * \returns A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags that
     * are associated with the given CXIndex object.
     */
    public static int clang_CXIndex_getGlobalOptions(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_CXIndex_getGlobalOptions.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Sets the invocation emission path option in a CXIndex.
     *
     * This function is DEPRECATED. Set CXIndexOptions::InvocationEmissionPath and
     * call clang_createIndexWithOptions() instead.
     *
     * The invocation emission path specifies a path which will contain log
     * files for certain libclang invocations. A null value (default) implies that
     * libclang invocations are not logged..
     */
    public static void clang_CXIndex_setInvocationEmissionPathOption(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Path)
    {
        try {MTD$clang_CXIndex_setInvocationEmissionPathOption.invokeExact(arg1, Path);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given header is guarded against
     * multiple inclusions, either with the conventional
     * \#ifndef/\#define/\#endif macro guards or with \#pragma once.
     */
    public static int clang_isFileMultipleIncludeGuarded(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
    {
        try {return (int)MTD$clang_isFileMultipleIncludeGuarded.invokeExact(tu, file);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a file handle within the given translation unit.
     *
     * \param tu the translation unit
     *
     * \param file_name the name of the file.
     *
     * \returns the file handle for the named file in the translation unit \p tu,
     * or a NULL file handle if the file was not a part of this translation unit.
     */
    public static java.lang.foreign.MemorySegment clang_getFile(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file_name)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getFile.invokeExact(tu, file_name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the buffer associated with the given file.
     *
     * \param tu the translation unit
     *
     * \param file the file for which to retrieve the buffer.
     *
     * \param size [out] if non-NULL, will be set to the size of the buffer.
     *
     * \returns a pointer to the buffer in memory that holds the contents of
     * \p file, or a NULL pointer when the file is not loaded.
     */
    public static java.lang.foreign.MemorySegment clang_getFileContents(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment size)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getFileContents.invokeExact(tu, file, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieves the source location associated with a given file/line/column
     * in a particular translation unit.
     */
    public static jpgen.clang.CXSourceLocation clang_getLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int line, int column)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getLocation.invokeExact(allocator, tu, file, line, column));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieves the source location associated with a given character offset
     * in a particular translation unit.
     */
    public static jpgen.clang.CXSourceLocation clang_getLocationForOffset(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file, int offset)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getLocationForOffset.invokeExact(allocator, tu, file, offset));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve all ranges that were skipped by the preprocessor.
     *
     * The preprocessor will skip lines when they are surrounded by an
     * if/ifdef/ifndef directive whose condition does not evaluate to true.
     */
    public static java.lang.foreign.MemorySegment clang_getSkippedRanges(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment file)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getSkippedRanges.invokeExact(tu, file);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve all ranges from all files that were skipped by the
     * preprocessor.
     *
     * The preprocessor will skip lines when they are surrounded by an
     * if/ifdef/ifndef directive whose condition does not evaluate to true.
     */
    public static java.lang.foreign.MemorySegment clang_getAllSkippedRanges(java.lang.foreign.MemorySegment tu)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getAllSkippedRanges.invokeExact(tu);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of diagnostics produced for the given
     * translation unit.
     */
    public static int clang_getNumDiagnostics(java.lang.foreign.MemorySegment Unit)
    {
        try {return (int)MTD$clang_getNumDiagnostics.invokeExact(Unit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a diagnostic associated with the given translation unit.
     *
     * \param Unit the translation unit to query.
     * \param Index the zero-based diagnostic number to retrieve.
     *
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    public static java.lang.foreign.MemorySegment clang_getDiagnostic(java.lang.foreign.MemorySegment Unit, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnostic.invokeExact(Unit, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the complete set of diagnostics associated with a
     *        translation unit.
     *
     * \param Unit the translation unit to query.
     */
    public static java.lang.foreign.MemorySegment clang_getDiagnosticSetFromTU(java.lang.foreign.MemorySegment Unit)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticSetFromTU.invokeExact(Unit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the original translation unit source file name.
     */
    public static jpgen.clang.CXString clang_getTranslationUnitSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment CTUnit)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitSpelling.invokeExact(allocator, CTUnit));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the CXTranslationUnit for a given source file and the provided
     * command line arguments one would pass to the compiler.
     *
     * Note: The 'source_filename' argument is optional.  If the caller provides a
     * NULL pointer, the name of the source file is expected to reside in the
     * specified command line arguments.
     *
     * Note: When encountered in 'clang_command_line_args', the following options
     * are ignored:
     *
     *   '-c'
     *   '-emit-ast'
     *   '-fsyntax-only'
     *   '-o \<output file>'  (both '-o' and '\<output file>' are ignored)
     *
     * \param CIdx The index object with which the translation unit will be
     * associated.
     *
     * \param source_filename The name of the source file to load, or NULL if the
     * source file is included in \p clang_command_line_args.
     *
     * \param num_clang_command_line_args The number of command-line arguments in
     * \p clang_command_line_args.
     *
     * \param clang_command_line_args The command-line arguments that would be
     * passed to the \c clang executable if it were being invoked out-of-process.
     * These command-line options will be parsed and will affect how the translation
     * unit is parsed. Note that the following options are ignored: '-c',
     * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
     *
     * \param num_unsaved_files the number of unsaved file entries in \p
     * unsaved_files.
     *
     * \param unsaved_files the files that have not yet been saved to disk
     * but may be required for code completion, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     */
    public static java.lang.foreign.MemorySegment clang_createTranslationUnitFromSourceFile(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, int num_clang_command_line_args, java.lang.foreign.MemorySegment clang_command_line_args, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_createTranslationUnitFromSourceFile.invokeExact(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Same as \c clang_createTranslationUnit2, but returns
     * the \c CXTranslationUnit instead of an error code.  In case of an error this
     * routine returns a \c NULL \c CXTranslationUnit, without further detailed
     * error codes.
     */
    public static java.lang.foreign.MemorySegment clang_createTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_createTranslationUnit.invokeExact(CIdx, ast_filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Create a translation unit from an AST file (\c -emit-ast).
     *
     * \param[out] out_TU A non-NULL pointer to store the created
     * \c CXTranslationUnit.
     *
     * \returns Zero on success, otherwise returns an error code.
     */
    public static int clang_createTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment ast_filename, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD$clang_createTranslationUnit2.invokeExact(CIdx, ast_filename, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the set of flags that is suitable for parsing a translation
     * unit that is being edited.
     *
     * The set of flags returned provide options for \c clang_parseTranslationUnit()
     * to indicate that the translation unit is likely to be reparsed many times,
     * either explicitly (via \c clang_reparseTranslationUnit()) or implicitly
     * (e.g., by code completion (\c clang_codeCompletionAt())). The returned flag
     * set contains an unspecified set of optimizations (e.g., the precompiled
     * preamble) geared toward improving the performance of these routines. The
     * set of optimizations enabled may change from one version to the next.
     */
    public static int clang_defaultEditingTranslationUnitOptions()
    {
        try {return (int)MTD$clang_defaultEditingTranslationUnitOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Same as \c clang_parseTranslationUnit2, but returns
     * the \c CXTranslationUnit instead of an error code.  In case of an error this
     * routine returns a \c NULL \c CXTranslationUnit, without further detailed
     * error codes.
     */
    public static java.lang.foreign.MemorySegment clang_parseTranslationUnit(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_parseTranslationUnit.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Parse the given source file and the translation unit corresponding
     * to that file.
     *
     * This routine is the main entry point for the Clang C API, providing the
     * ability to parse a source file into a translation unit that can then be
     * queried by other functions in the API. This routine accepts a set of
     * command-line arguments so that the compilation can be configured in the same
     * way that the compiler is configured on the command line.
     *
     * \param CIdx The index object with which the translation unit will be
     * associated.
     *
     * \param source_filename The name of the source file to load, or NULL if the
     * source file is included in \c command_line_args.
     *
     * \param command_line_args The command-line arguments that would be
     * passed to the \c clang executable if it were being invoked out-of-process.
     * These command-line options will be parsed and will affect how the translation
     * unit is parsed. Note that the following options are ignored: '-c',
     * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
     *
     * \param num_command_line_args The number of command-line arguments in
     * \c command_line_args.
     *
     * \param unsaved_files the files that have not yet been saved to disk
     * but may be required for parsing, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     *
     * \param num_unsaved_files the number of unsaved file entries in \p
     * unsaved_files.
     *
     * \param options A bitmask of options that affects how the translation unit
     * is managed but not its compilation. This should be a bitwise OR of the
     * CXTranslationUnit_XXX flags.
     *
     * \param[out] out_TU A non-NULL pointer to store the created
     * \c CXTranslationUnit, describing the parsed code and containing any
     * diagnostics produced by the compiler.
     *
     * \returns Zero on success, otherwise returns an error code.
     */
    public static int clang_parseTranslationUnit2(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD$clang_parseTranslationUnit2.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Same as clang_parseTranslationUnit2 but requires a full command line
     * for \c command_line_args including argv[0]. This is useful if the standard
     * library paths are relative to the binary.
     */
    public static int clang_parseTranslationUnit2FullArgv(java.lang.foreign.MemorySegment CIdx, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options, java.lang.foreign.MemorySegment out_TU)
    {
        try {return (int)MTD$clang_parseTranslationUnit2FullArgv.invokeExact(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the set of flags that is suitable for saving a translation
     * unit.
     *
     * The set of flags returned provide options for
     * \c clang_saveTranslationUnit() by default. The returned flag
     * set contains an unspecified set of options that save translation units with
     * the most commonly-requested data.
     */
    public static int clang_defaultSaveOptions(java.lang.foreign.MemorySegment TU)
    {
        try {return (int)MTD$clang_defaultSaveOptions.invokeExact(TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Saves a translation unit into a serialized representation of
     * that translation unit on disk.
     *
     * Any translation unit that was parsed without error can be saved
     * into a file. The translation unit can then be deserialized into a
     * new \c CXTranslationUnit with \c clang_createTranslationUnit() or,
     * if it is an incomplete translation unit that corresponds to a
     * header, used as a precompiled header when parsing other translation
     * units.
     *
     * \param TU The translation unit to save.
     *
     * \param FileName The file to which the translation unit will be saved.
     *
     * \param options A bitmask of options that affects how the translation unit
     * is saved. This should be a bitwise OR of the
     * CXSaveTranslationUnit_XXX flags.
     *
     * \returns A value that will match one of the enumerators of the CXSaveError
     * enumeration. Zero (CXSaveError_None) indicates that the translation unit was
     * saved successfully, while a non-zero value indicates that a problem occurred.
     */
    public static int clang_saveTranslationUnit(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment FileName, int options)
    {
        try {return (int)MTD$clang_saveTranslationUnit.invokeExact(TU, FileName, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Suspend a translation unit in order to free memory associated with it.
     *
     * A suspended translation unit uses significantly less memory but on the other
     * side does not support any other calls than \c clang_reparseTranslationUnit
     * to resume it or \c clang_disposeTranslationUnit to dispose it completely.
     */
    public static int clang_suspendTranslationUnit(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_suspendTranslationUnit.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy the specified CXTranslationUnit object.
     */
    public static void clang_disposeTranslationUnit(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_disposeTranslationUnit.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the set of flags that is suitable for reparsing a translation
     * unit.
     *
     * The set of flags returned provide options for
     * \c clang_reparseTranslationUnit() by default. The returned flag
     * set contains an unspecified set of optimizations geared toward common uses
     * of reparsing. The set of optimizations enabled may change from one version
     * to the next.
     */
    public static int clang_defaultReparseOptions(java.lang.foreign.MemorySegment TU)
    {
        try {return (int)MTD$clang_defaultReparseOptions.invokeExact(TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Reparse the source files that produced this translation unit.
     *
     * This routine can be used to re-parse the source files that originally
     * created the given translation unit, for example because those source files
     * have changed (either on disk or as passed via \p unsaved_files). The
     * source code will be reparsed with the same command-line options as it
     * was originally parsed.
     *
     * Reparsing a translation unit invalidates all cursors and source locations
     * that refer into that translation unit. This makes reparsing a translation
     * unit semantically equivalent to destroying the translation unit and then
     * creating a new translation unit with the same command-line arguments.
     * However, it may be more efficient to reparse a translation
     * unit using this routine.
     *
     * \param TU The translation unit whose contents will be re-parsed. The
     * translation unit must originally have been built with
     * \c clang_createTranslationUnitFromSourceFile().
     *
     * \param num_unsaved_files The number of unsaved file entries in \p
     * unsaved_files.
     *
     * \param unsaved_files The files that have not yet been saved to disk
     * but may be required for parsing, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     *
     * \param options A bitset of options composed of the flags in CXReparse_Flags.
     * The function \c clang_defaultReparseOptions() produces a default set of
     * options recommended for most uses, based on the translation unit.
     *
     * \returns 0 if the sources could be reparsed.  A non-zero error code will be
     * returned if reparsing was impossible, such that the translation unit is
     * invalid. In such cases, the only valid call for \c TU is
     * \c clang_disposeTranslationUnit(TU).  The error codes returned by this
     * routine are described by the \c CXErrorCode enum.
     */
    public static int clang_reparseTranslationUnit(java.lang.foreign.MemorySegment TU, int num_unsaved_files, java.lang.foreign.MemorySegment unsaved_files, int options)
    {
        try {return (int)MTD$clang_reparseTranslationUnit.invokeExact(TU, num_unsaved_files, unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the human-readable null-terminated C string that represents
     *  the name of the memory category.  This string should never be freed.
     */
    public static java.lang.foreign.MemorySegment clang_getTUResourceUsageName(int kind)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getTUResourceUsageName.invokeExact(kind);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the memory usage of a translation unit.  This object
     *  should be released with clang_disposeCXTUResourceUsage().
     */
    public static jpgen.clang.CXTUResourceUsage clang_getCXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment TU)
    {
        try {return new jpgen.clang.CXTUResourceUsage((java.lang.foreign.MemorySegment)MTD$clang_getCXTUResourceUsage.invokeExact(allocator, TU));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void clang_disposeCXTUResourceUsage(jpgen.clang.CXTUResourceUsage usage)
    {
        try {MTD$clang_disposeCXTUResourceUsage.invokeExact(usage.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get target information for this translation unit.
     *
     * The CXTargetInfo object cannot outlive the CXTranslationUnit object.
     */
    public static java.lang.foreign.MemorySegment clang_getTranslationUnitTargetInfo(java.lang.foreign.MemorySegment CTUnit)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitTargetInfo.invokeExact(CTUnit);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy the CXTargetInfo object.
     */
    public static void clang_TargetInfo_dispose(java.lang.foreign.MemorySegment Info)
    {
        try {MTD$clang_TargetInfo_dispose.invokeExact(Info);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the normalized target triple as a string.
     *
     * Returns the empty string in case of any error.
     */
    public static jpgen.clang.CXString clang_TargetInfo_getTriple(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Info)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_TargetInfo_getTriple.invokeExact(allocator, Info));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the pointer width of the target in bits.
     *
     * Returns -1 in case of error.
     */
    public static int clang_TargetInfo_getPointerWidth(java.lang.foreign.MemorySegment Info)
    {
        try {return (int)MTD$clang_TargetInfo_getPointerWidth.invokeExact(Info);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the NULL cursor, which represents no entity.
     */
    public static jpgen.clang.CXCursor clang_getNullCursor(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getNullCursor.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the cursor that represents the given translation unit.
     *
     * The translation unit cursor can be used to start traversing the
     * various declarations within the given translation unit.
     */
    public static jpgen.clang.CXCursor clang_getTranslationUnitCursor(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getTranslationUnitCursor.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether two cursors are equivalent.
     */
    public static int clang_equalCursors(jpgen.clang.CXCursor arg1, jpgen.clang.CXCursor arg2)
    {
        try {return (int)MTD$clang_equalCursors.invokeExact(arg1.ptr(), arg2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if \p cursor is null.
     */
    public static int clang_Cursor_isNull(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_Cursor_isNull.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Compute a hash value for the given cursor.
     */
    public static int clang_hashCursor(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_hashCursor.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the kind of the given cursor.
     */
    public static int clang_getCursorKind(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_getCursorKind.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents a declaration.
     */
    public static int clang_isDeclaration(int arg1)
    {
        try {return (int)MTD$clang_isDeclaration.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given declaration is invalid.
     *
     * A declaration is invalid if it could not be parsed successfully.
     *
     * \returns non-zero if the cursor represents a declaration and it is
     * invalid, otherwise NULL.
     */
    public static int clang_isInvalidDeclaration(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_isInvalidDeclaration.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents a simple
     * reference.
     *
     * Note that other kinds of cursors (such as expressions) can also refer to
     * other cursors. Use clang_getCursorReferenced() to determine whether a
     * particular cursor refers to another entity.
     */
    public static int clang_isReference(int arg1)
    {
        try {return (int)MTD$clang_isReference.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents an expression.
     */
    public static int clang_isExpression(int arg1)
    {
        try {return (int)MTD$clang_isExpression.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents a statement.
     */
    public static int clang_isStatement(int arg1)
    {
        try {return (int)MTD$clang_isStatement.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents an attribute.
     */
    public static int clang_isAttribute(int arg1)
    {
        try {return (int)MTD$clang_isAttribute.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor has any attributes.
     */
    public static int clang_Cursor_hasAttrs(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_hasAttrs.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents an invalid
     * cursor.
     */
    public static int clang_isInvalid(int arg1)
    {
        try {return (int)MTD$clang_isInvalid.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor kind represents a translation
     * unit.
     */
    public static int clang_isTranslationUnit(int arg1)
    {
        try {return (int)MTD$clang_isTranslationUnit.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /***
     * Determine whether the given cursor represents a preprocessing
     * element, such as a preprocessor directive or macro instantiation.
     */
    public static int clang_isPreprocessing(int arg1)
    {
        try {return (int)MTD$clang_isPreprocessing.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /***
     * Determine whether the given cursor represents a currently
     *  unexposed piece of the AST (e.g., CXCursor_UnexposedStmt).
     */
    public static int clang_isUnexposed(int arg1)
    {
        try {return (int)MTD$clang_isUnexposed.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the linkage of the entity referred to by a given cursor.
     */
    public static int clang_getCursorLinkage(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorLinkage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Describe the visibility of the entity referred to by a cursor.
     *
     * This returns the default visibility if not explicitly specified by
     * a visibility attribute. The default visibility may be changed by
     * commandline arguments.
     *
     * \param cursor The cursor to query.
     *
     * \returns The visibility of the cursor.
     */
    public static int clang_getCursorVisibility(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorVisibility.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the availability of the entity that this cursor refers to,
     * taking the current target platform into account.
     *
     * \param cursor The cursor to query.
     *
     * \returns The availability of the cursor.
     */
    public static int clang_getCursorAvailability(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorAvailability.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the availability of the entity that this cursor refers to
     * on any platforms for which availability information is known.
     *
     * \param cursor The cursor to query.
     *
     * \param always_deprecated If non-NULL, will be set to indicate whether the
     * entity is deprecated on all platforms.
     *
     * \param deprecated_message If non-NULL, will be set to the message text
     * provided along with the unconditional deprecation of this entity. The client
     * is responsible for deallocating this string.
     *
     * \param always_unavailable If non-NULL, will be set to indicate whether the
     * entity is unavailable on all platforms.
     *
     * \param unavailable_message If non-NULL, will be set to the message text
     * provided along with the unconditional unavailability of this entity. The
     * client is responsible for deallocating this string.
     *
     * \param availability If non-NULL, an array of CXPlatformAvailability instances
     * that will be populated with platform availability information, up to either
     * the number of platforms for which availability information is available (as
     * returned by this function) or \c availability_size, whichever is smaller.
     *
     * \param availability_size The number of elements available in the
     * \c availability array.
     *
     * \returns The number of platforms (N) for which availability information is
     * available (which is unrelated to \c availability_size).
     *
     * Note that the client is responsible for calling
     * \c clang_disposeCXPlatformAvailability to free each of the
     * platform-availability structures returned. There are
     * \c min(N, availability_size) such structures.
     */
    public static int clang_getCursorPlatformAvailability(jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment always_deprecated, java.lang.foreign.MemorySegment deprecated_message, java.lang.foreign.MemorySegment always_unavailable, java.lang.foreign.MemorySegment unavailable_message, java.lang.foreign.MemorySegment availability, int availability_size)
    {
        try {return (int)MTD$clang_getCursorPlatformAvailability.invokeExact(cursor.ptr(), always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the memory associated with a \c CXPlatformAvailability structure.
     */
    public static void clang_disposeCXPlatformAvailability(java.lang.foreign.MemorySegment availability)
    {
        try {MTD$clang_disposeCXPlatformAvailability.invokeExact(availability);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * If cursor refers to a variable declaration and it has initializer returns
     * cursor referring to the initializer otherwise return null cursor.
     */
    public static jpgen.clang.CXCursor clang_Cursor_getVarDeclInitializer(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor cursor)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getVarDeclInitializer.invokeExact(allocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * If cursor refers to a variable declaration that has global storage returns 1.
     * If cursor refers to a variable declaration that doesn't have global storage
     * returns 0. Otherwise returns -1.
     */
    public static int clang_Cursor_hasVarDeclGlobalStorage(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_Cursor_hasVarDeclGlobalStorage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * If cursor refers to a variable declaration that has external storage
     * returns 1. If cursor refers to a variable declaration that doesn't have
     * external storage returns 0. Otherwise returns -1.
     */
    public static int clang_Cursor_hasVarDeclExternalStorage(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_Cursor_hasVarDeclExternalStorage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the "language" of the entity referred to by a given cursor.
     */
    public static int clang_getCursorLanguage(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorLanguage.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the "thread-local storage (TLS) kind" of the declaration
     * referred to by a cursor.
     */
    public static int clang_getCursorTLSKind(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorTLSKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the translation unit that a cursor originated from.
     */
    public static java.lang.foreign.MemorySegment clang_Cursor_getTranslationUnit(jpgen.clang.CXCursor arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getTranslationUnit.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Creates an empty CXCursorSet.
     */
    public static java.lang.foreign.MemorySegment clang_createCXCursorSet()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_createCXCursorSet.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Disposes a CXCursorSet and releases its associated memory.
     */
    public static void clang_disposeCXCursorSet(java.lang.foreign.MemorySegment cset)
    {
        try {MTD$clang_disposeCXCursorSet.invokeExact(cset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Queries a CXCursorSet to see if it contains a specific CXCursor.
     *
     * \returns non-zero if the set contains the specified cursor.
     */
    public static int clang_CXCursorSet_contains(java.lang.foreign.MemorySegment cset, jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_CXCursorSet_contains.invokeExact(cset, cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Inserts a CXCursor into a CXCursorSet.
     *
     * \returns zero if the CXCursor was already in the set, and non-zero otherwise.
     */
    public static int clang_CXCursorSet_insert(java.lang.foreign.MemorySegment cset, jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_CXCursorSet_insert.invokeExact(cset, cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the semantic parent of the given cursor.
     *
     * The semantic parent of a cursor is the cursor that semantically contains
     * the given \p cursor. For many declarations, the lexical and semantic parents
     * are equivalent (the lexical parent is returned by
     * \c clang_getCursorLexicalParent()). They diverge when declarations or
     * definitions are provided out-of-line. For example:
     *
     * \code
     * class C {
     *  void f();
     * };
     *
     * void C::f() { }
     * \endcode
     *
     * In the out-of-line definition of \c C::f, the semantic parent is
     * the class \c C, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this
     * case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics
     * of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration,
     * on the other hand, can have a major impact on semantics, and redeclarations
     * of a particular entity should all have the same semantic context.
     *
     * In the example above, both declarations of \c C::f have \c C as their
     * semantic context, while the lexical context of the first \c C::f is \c C
     * and the lexical context of the second \c C::f is the translation unit.
     *
     * For global declarations, the semantic parent is the translation unit.
     */
    public static jpgen.clang.CXCursor clang_getCursorSemanticParent(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor cursor)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorSemanticParent.invokeExact(allocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the lexical parent of the given cursor.
     *
     * The lexical parent of a cursor is the cursor in which the given \p cursor
     * was actually written. For many declarations, the lexical and semantic parents
     * are equivalent (the semantic parent is returned by
     * \c clang_getCursorSemanticParent()). They diverge when declarations or
     * definitions are provided out-of-line. For example:
     *
     * \code
     * class C {
     *  void f();
     * };
     *
     * void C::f() { }
     * \endcode
     *
     * In the out-of-line definition of \c C::f, the semantic parent is
     * the class \c C, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this
     * case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics
     * of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration,
     * on the other hand, can have a major impact on semantics, and redeclarations
     * of a particular entity should all have the same semantic context.
     *
     * In the example above, both declarations of \c C::f have \c C as their
     * semantic context, while the lexical context of the first \c C::f is \c C
     * and the lexical context of the second \c C::f is the translation unit.
     *
     * For declarations written in the global scope, the lexical parent is
     * the translation unit.
     */
    public static jpgen.clang.CXCursor clang_getCursorLexicalParent(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor cursor)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorLexicalParent.invokeExact(allocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the set of methods that are overridden by the given
     * method.
     *
     * In both Objective-C and C++, a method (aka virtual member function,
     * in C++) can override a virtual method in a base class. For
     * Objective-C, a method is said to override any method in the class's
     * base class, its protocols, or its categories' protocols, that has the same
     * selector and is of the same kind (class or instance).
     * If no such method exists, the search continues to the class's superclass,
     * its protocols, and its categories, and so on. A method from an Objective-C
     * implementation is considered to override the same methods as its
     * corresponding method in the interface.
     *
     * For C++, a virtual member function overrides any virtual member
     * function with the same signature that occurs in its base
     * classes. With multiple inheritance, a virtual member function can
     * override several virtual member functions coming from different
     * base classes.
     *
     * In all cases, this function determines the immediate overridden
     * method, rather than all of the overridden methods. For example, if
     * a method is originally declared in a class A, then overridden in B
     * (which in inherits from A) and also in C (which inherited from B),
     * then the only overridden method returned from this function when
     * invoked on C's method will be B's method. The client may then
     * invoke this function again, given the previously-found overridden
     * methods, to map out the complete method-override set.
     *
     * \param cursor A cursor representing an Objective-C or C++
     * method. This routine will compute the set of methods that this
     * method overrides.
     *
     * \param overridden A pointer whose pointee will be replaced with a
     * pointer to an array of cursors, representing the set of overridden
     * methods. If there are no overridden methods, the pointee will be
     * set to NULL. The pointee must be freed via a call to
     * \c clang_disposeOverriddenCursors().
     *
     * \param num_overridden A pointer to the number of overridden
     * functions, will be set to the number of overridden functions in the
     * array pointed to by \p overridden.
     */
    public static void clang_getOverriddenCursors(jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment overridden, java.lang.foreign.MemorySegment num_overridden)
    {
        try {MTD$clang_getOverriddenCursors.invokeExact(cursor.ptr(), overridden, num_overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the set of overridden cursors returned by \c
     * clang_getOverriddenCursors().
     */
    public static void clang_disposeOverriddenCursors(java.lang.foreign.MemorySegment overridden)
    {
        try {MTD$clang_disposeOverriddenCursors.invokeExact(overridden);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the file that is included by the given inclusion directive
     * cursor.
     */
    public static java.lang.foreign.MemorySegment clang_getIncludedFile(jpgen.clang.CXCursor cursor)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getIncludedFile.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Map a source location to the cursor that describes the entity at that
     * location in the source code.
     *
     * clang_getCursor() maps an arbitrary source location within a translation
     * unit down to the most specific cursor that describes the entity at that
     * location. For example, given an expression \c x + y, invoking
     * clang_getCursor() with a source location pointing to "x" will return the
     * cursor for "x"; similarly for "y". If the cursor points anywhere between
     * "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
     * will return a cursor referring to the "+" expression.
     *
     * \returns a cursor representing the entity at the given source location, or
     * a NULL cursor if no such entity can be found.
     */
    public static jpgen.clang.CXCursor clang_getCursor(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, jpgen.clang.CXSourceLocation arg2)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursor.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the physical location of the source constructor referenced
     * by the given cursor.
     *
     * The location of a declaration is typically the location of the name of that
     * declaration, where the name of that declaration would occur if it is
     * unnamed, or some keyword that introduces that particular declaration.
     * The location of a reference is where that reference occurs within the
     * source code.
     */
    public static jpgen.clang.CXSourceLocation clang_getCursorLocation(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getCursorLocation.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the physical extent of the source construct referenced by
     * the given cursor.
     *
     * The extent of a cursor starts with the file/line/column pointing at the
     * first character within the source construct that the cursor refers to and
     * ends with the last character within that source construct. For a
     * declaration, the extent covers the declaration itself. For a reference,
     * the extent covers the location of the reference (e.g., where the referenced
     * entity was actually used).
     */
    public static jpgen.clang.CXSourceRange clang_getCursorExtent(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getCursorExtent.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the type of a CXCursor (if any).
     */
    public static jpgen.clang.CXType clang_getCursorType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getCursorType.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Pretty-print the underlying type using the rules of the
     * language of the translation unit from which it came.
     *
     * If the type is invalid, an empty string is returned.
     */
    public static jpgen.clang.CXString clang_getTypeSpelling(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType CT)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypeSpelling.invokeExact(allocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the underlying type of a typedef declaration.
     *
     * If the cursor does not reference a typedef declaration, an invalid type is
     * returned.
     */
    public static jpgen.clang.CXType clang_getTypedefDeclUnderlyingType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getTypedefDeclUnderlyingType.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the integer type of an enum declaration.
     *
     * If the cursor does not reference an enum declaration, an invalid type is
     * returned.
     */
    public static jpgen.clang.CXType clang_getEnumDeclIntegerType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getEnumDeclIntegerType.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the integer value of an enum constant declaration as a signed
     *  long long.
     *
     * If the cursor does not reference an enum constant declaration, LLONG_MIN is
     * returned. Since this is also potentially a valid constant value, the kind of
     * the cursor must be verified before calling this function.
     */
    public static long clang_getEnumConstantDeclValue(jpgen.clang.CXCursor C)
    {
        try {return (long)MTD$clang_getEnumConstantDeclValue.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the integer value of an enum constant declaration as an unsigned
     *  long long.
     *
     * If the cursor does not reference an enum constant declaration, ULLONG_MAX is
     * returned. Since this is also potentially a valid constant value, the kind of
     * the cursor must be verified before calling this function.
     */
    public static long clang_getEnumConstantDeclUnsignedValue(jpgen.clang.CXCursor C)
    {
        try {return (long)MTD$clang_getEnumConstantDeclUnsignedValue.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the cursor specifies a Record member that is a bit-field.
     */
    public static int clang_Cursor_isBitField(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isBitField.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the bit width of a bit-field declaration as an integer.
     *
     * If the cursor does not reference a bit-field, or if the bit-field's width
     * expression cannot be evaluated, -1 is returned.
     *
     * For example:
     * \code
     * if (clang_Cursor_isBitField(Cursor)) {
     *   int Width = clang_getFieldDeclBitWidth(Cursor);
     *   if (Width != -1) {
     *     // The bit-field width is not value-dependent.
     *   }
     * }
     * \endcode
     */
    public static int clang_getFieldDeclBitWidth(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_getFieldDeclBitWidth.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of non-variadic arguments associated with a given
     * cursor.
     *
     * The number of arguments can be determined for calls as well as for
     * declarations of functions or methods. For other cursors -1 is returned.
     */
    public static int clang_Cursor_getNumArguments(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_getNumArguments.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the argument cursor of a function or method.
     *
     * The argument cursor can be determined for calls as well as for declarations
     * of functions or methods. For other cursors and for invalid indices, an
     * invalid cursor is returned.
     */
    public static jpgen.clang.CXCursor clang_Cursor_getArgument(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C, int i)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getArgument.invokeExact(allocator, C.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the number of template args of a function, struct, or class decl
     * representing a template specialization.
     *
     * If the argument cursor cannot be converted into a template function
     * declaration, -1 is returned.
     *
     * For example, for the following declaration and specialization:
     *   template <typename T, int kInt, bool kBool>
     *   void foo() { ... }
     *
     *   template <>
     *   void foo<float, -7, true>();
     *
     * The value 3 would be returned from this call.
     */
    public static int clang_Cursor_getNumTemplateArguments(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_getNumTemplateArguments.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the kind of the I'th template argument of the CXCursor C.
     *
     * If the argument CXCursor does not represent a FunctionDecl, StructDecl, or
     * ClassTemplatePartialSpecialization, an invalid template argument kind is
     * returned.
     *
     * For example, for the following declaration and specialization:
     *   template <typename T, int kInt, bool kBool>
     *   void foo() { ... }
     *
     *   template <>
     *   void foo<float, -7, true>();
     *
     * For I = 0, 1, and 2, Type, Integral, and Integral will be returned,
     * respectively.
     */
    public static int clang_Cursor_getTemplateArgumentKind(jpgen.clang.CXCursor C, int I)
    {
        try {return (int)MTD$clang_Cursor_getTemplateArgumentKind.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a CXType representing the type of a TemplateArgument of a
     *  function decl representing a template specialization.
     *
     * If the argument CXCursor does not represent a FunctionDecl, StructDecl,
     * ClassDecl or ClassTemplatePartialSpecialization whose I'th template argument
     * has a kind of CXTemplateArgKind_Integral, an invalid type is returned.
     *
     * For example, for the following declaration and specialization:
     *   template <typename T, int kInt, bool kBool>
     *   void foo() { ... }
     *
     *   template <>
     *   void foo<float, -7, true>();
     *
     * If called with I = 0, "float", will be returned.
     * Invalid types will be returned for I == 1 or 2.
     */
    public static jpgen.clang.CXType clang_Cursor_getTemplateArgumentType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C, int I)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getTemplateArgumentType.invokeExact(allocator, C.ptr(), I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the value of an Integral TemplateArgument (of a function
     *  decl representing a template specialization) as a signed long long.
     *
     * It is undefined to call this function on a CXCursor that does not represent a
     * FunctionDecl, StructDecl, ClassDecl or ClassTemplatePartialSpecialization
     * whose I'th template argument is not an integral value.
     *
     * For example, for the following declaration and specialization:
     *   template <typename T, int kInt, bool kBool>
     *   void foo() { ... }
     *
     *   template <>
     *   void foo<float, -7, true>();
     *
     * If called with I = 1 or 2, -7 or true will be returned, respectively.
     * For I == 0, this function's behavior is undefined.
     */
    public static long clang_Cursor_getTemplateArgumentValue(jpgen.clang.CXCursor C, int I)
    {
        try {return (long)MTD$clang_Cursor_getTemplateArgumentValue.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the value of an Integral TemplateArgument (of a function
     *  decl representing a template specialization) as an unsigned long long.
     *
     * It is undefined to call this function on a CXCursor that does not represent a
     * FunctionDecl, StructDecl, ClassDecl or ClassTemplatePartialSpecialization or
     * whose I'th template argument is not an integral value.
     *
     * For example, for the following declaration and specialization:
     *   template <typename T, int kInt, bool kBool>
     *   void foo() { ... }
     *
     *   template <>
     *   void foo<float, 2147483649, true>();
     *
     * If called with I = 1 or 2, 2147483649 or true will be returned, respectively.
     * For I == 0, this function's behavior is undefined.
     */
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(jpgen.clang.CXCursor C, int I)
    {
        try {return (long)MTD$clang_Cursor_getTemplateArgumentUnsignedValue.invokeExact(C.ptr(), I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether two CXTypes represent the same type.
     *
     * \returns non-zero if the CXTypes represent the same type and
     *          zero otherwise.
     */
    public static int clang_equalTypes(jpgen.clang.CXType A, jpgen.clang.CXType B)
    {
        try {return (int)MTD$clang_equalTypes.invokeExact(A.ptr(), B.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the canonical type for a CXType.
     *
     * Clang's type system explicitly models typedefs and all the ways
     * a specific type can be represented.  The canonical type is the underlying
     * type with all the "sugar" removed.  For example, if 'T' is a typedef
     * for 'int', the canonical type for 'T' would be 'int'.
     */
    public static jpgen.clang.CXType clang_getCanonicalType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getCanonicalType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a CXType has the "const" qualifier set,
     * without looking through typedefs that may have added "const" at a
     * different level.
     */
    public static int clang_isConstQualifiedType(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_isConstQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a  CXCursor that is a macro, is
     * function like.
     */
    public static int clang_Cursor_isMacroFunctionLike(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isMacroFunctionLike.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a  CXCursor that is a macro, is a
     * builtin one.
     */
    public static int clang_Cursor_isMacroBuiltin(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isMacroBuiltin.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a  CXCursor that is a function declaration, is an
     * inline declaration.
     */
    public static int clang_Cursor_isFunctionInlined(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isFunctionInlined.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a CXType has the "volatile" qualifier set,
     * without looking through typedefs that may have added "volatile" at
     * a different level.
     */
    public static int clang_isVolatileQualifiedType(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_isVolatileQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether a CXType has the "restrict" qualifier set,
     * without looking through typedefs that may have added "restrict" at a
     * different level.
     */
    public static int clang_isRestrictQualifiedType(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_isRestrictQualifiedType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the address space of the given type.
     */
    public static int clang_getAddressSpace(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_getAddressSpace.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the typedef name of the given type.
     */
    public static jpgen.clang.CXString clang_getTypedefName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType CT)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypedefName.invokeExact(allocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For pointer types, returns the type of the pointee.
     */
    public static jpgen.clang.CXType clang_getPointeeType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getPointeeType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the unqualified variant of the given type, removing as
     * little sugar as possible.
     *
     * For example, given the following series of typedefs:
     *
     * \code
     * typedef int Integer;
     * typedef const Integer CInteger;
     * typedef CInteger DifferenceType;
     * \endcode
     *
     * Executing \c clang_getUnqualifiedType() on a \c CXType that
     * represents \c DifferenceType, will desugar to a type representing
     * \c Integer, that has no qualifiers.
     *
     * And, executing \c clang_getUnqualifiedType() on the type of the
     * first argument of the following function declaration:
     *
     * \code
     * void foo(const int);
     * \endcode
     *
     * Will return a type representing \c int, removing the \c const
     * qualifier.
     *
     * Sugar over array types is not desugared.
     *
     * A type can be checked for qualifiers with \c
     * clang_isConstQualifiedType(), \c clang_isVolatileQualifiedType()
     * and \c clang_isRestrictQualifiedType().
     *
     * A type that resulted from a call to \c clang_getUnqualifiedType
     * will return \c false for all of the above calls.
     */
    public static jpgen.clang.CXType clang_getUnqualifiedType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType CT)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getUnqualifiedType.invokeExact(allocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For reference types (e.g., "const int&"), returns the type that the
     * reference refers to (e.g "const int").
     *
     * Otherwise, returns the type itself.
     *
     * A type that has kind \c CXType_LValueReference or
     * \c CXType_RValueReference is a reference type.
     */
    public static jpgen.clang.CXType clang_getNonReferenceType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType CT)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getNonReferenceType.invokeExact(allocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the cursor for the declaration of the given type.
     */
    public static jpgen.clang.CXCursor clang_getTypeDeclaration(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getTypeDeclaration.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the Objective-C type encoding for the specified declaration.
     */
    public static jpgen.clang.CXString clang_getDeclObjCTypeEncoding(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDeclObjCTypeEncoding.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the Objective-C type encoding for the specified CXType.
     */
    public static jpgen.clang.CXString clang_Type_getObjCEncoding(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType type)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCEncoding.invokeExact(allocator, type.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the spelling of a given CXTypeKind.
     */
    public static jpgen.clang.CXString clang_getTypeKindSpelling(java.lang.foreign.SegmentAllocator allocator, int K)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getTypeKindSpelling.invokeExact(allocator, K));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the calling convention associated with a function type.
     *
     * If a non-function type is passed in, CXCallingConv_Invalid is returned.
     */
    public static int clang_getFunctionTypeCallingConv(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_getFunctionTypeCallingConv.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the return type associated with a function type.
     *
     * If a non-function type is passed in, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_getResultType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getResultType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the exception specification type associated with a function type.
     * This is a value of type CXCursor_ExceptionSpecificationKind.
     *
     * If a non-function type is passed in, an error code of -1 is returned.
     */
    public static int clang_getExceptionSpecificationType(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_getExceptionSpecificationType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of non-variadic parameters associated with a
     * function type.
     *
     * If a non-function type is passed in, -1 is returned.
     */
    public static int clang_getNumArgTypes(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_getNumArgTypes.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the type of a parameter of a function type.
     *
     * If a non-function type is passed in or the function does not have enough
     * parameters, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_getArgType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T, int i)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getArgType.invokeExact(allocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieves the base type of the ObjCObjectType.
     *
     * If the type is not an ObjC object, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getObjCObjectBaseType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCObjectBaseType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of protocol references associated with an ObjC object/id.
     *
     * If the type is not an ObjC object, 0 is returned.
     */
    public static int clang_Type_getNumObjCProtocolRefs(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_getNumObjCProtocolRefs.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the decl for a protocol reference for an ObjC object/id.
     *
     * If the type is not an ObjC object or there are not enough protocol
     * references, an invalid cursor is returned.
     */
    public static jpgen.clang.CXCursor clang_Type_getObjCProtocolDecl(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T, int i)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCProtocolDecl.invokeExact(allocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of type arguments associated with an ObjC object.
     *
     * If the type is not an ObjC object, 0 is returned.
     */
    public static int clang_Type_getNumObjCTypeArgs(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_getNumObjCTypeArgs.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a type argument associated with an ObjC object.
     *
     * If the type is not an ObjC or the index is not valid,
     * an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getObjCTypeArg(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T, int i)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getObjCTypeArg.invokeExact(allocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return 1 if the CXType is a variadic function type, and 0 otherwise.
     */
    public static int clang_isFunctionTypeVariadic(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_isFunctionTypeVariadic.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the return type associated with a given cursor.
     *
     * This only returns a valid type if the cursor refers to a function or method.
     */
    public static jpgen.clang.CXType clang_getCursorResultType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getCursorResultType.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the exception specification type associated with a given cursor.
     * This is a value of type CXCursor_ExceptionSpecificationKind.
     *
     * This only returns a valid result if the cursor refers to a function or
     * method.
     */
    public static int clang_getCursorExceptionSpecificationType(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_getCursorExceptionSpecificationType.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return 1 if the CXType is a POD (plain old data) type, and 0
     *  otherwise.
     */
    public static int clang_isPODType(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_isPODType.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the element type of an array, complex, or vector type.
     *
     * If a type is passed in that is not an array, complex, or vector type,
     * an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_getElementType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getElementType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the number of elements of an array or vector type.
     *
     * If a type is passed in that is not an array or vector type,
     * -1 is returned.
     */
    public static long clang_getNumElements(jpgen.clang.CXType T)
    {
        try {return (long)MTD$clang_getNumElements.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the element type of an array type.
     *
     * If a non-array type is passed in, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_getArrayElementType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getArrayElementType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the array size of a constant array.
     *
     * If a non-array type is passed in, -1 is returned.
     */
    public static long clang_getArraySize(jpgen.clang.CXType T)
    {
        try {return (long)MTD$clang_getArraySize.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the type named by the qualified-id.
     *
     * If a non-elaborated type is passed in, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getNamedType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getNamedType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a typedef is 'transparent' tag.
     *
     * A typedef is considered 'transparent' if it shares a name and spelling
     * location with its underlying tag type, as is the case with the NS_ENUM macro.
     *
     * \returns non-zero if transparent and zero otherwise.
     */
    public static int clang_Type_isTransparentTagTypedef(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_isTransparentTagTypedef.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the nullability kind of a pointer type.
     */
    public static int clang_Type_getNullability(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_getNullability.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the alignment of a type in bytes as per C++[expr.alignof]
     *   standard.
     *
     * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
     * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
     *   is returned.
     * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
     *   returned.
     * If the type declaration is not a constant size type,
     *   CXTypeLayoutError_NotConstantSize is returned.
     */
    public static long clang_Type_getAlignOf(jpgen.clang.CXType T)
    {
        try {return (long)MTD$clang_Type_getAlignOf.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the class type of an member pointer type.
     *
     * If a non-member-pointer type is passed in, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getClassType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getClassType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the size of a type in bytes as per C++[expr.sizeof] standard.
     *
     * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
     * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
     *   is returned.
     * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
     *   returned.
     */
    public static long clang_Type_getSizeOf(jpgen.clang.CXType T)
    {
        try {return (long)MTD$clang_Type_getSizeOf.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the offset of a field named S in a record of type T in bits
     *   as it would be returned by __offsetof__ as per C++11[18.2p4]
     *
     * If the cursor is not a record field declaration, CXTypeLayoutError_Invalid
     *   is returned.
     * If the field's type declaration is an incomplete type,
     *   CXTypeLayoutError_Incomplete is returned.
     * If the field's type declaration is a dependent type,
     *   CXTypeLayoutError_Dependent is returned.
     * If the field's name S is not found,
     *   CXTypeLayoutError_InvalidFieldName is returned.
     */
    public static long clang_Type_getOffsetOf(jpgen.clang.CXType T, java.lang.foreign.MemorySegment S)
    {
        try {return (long)MTD$clang_Type_getOffsetOf.invokeExact(T.ptr(), S);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the type that was modified by this attributed type.
     *
     * If the type is not an attributed type, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getModifiedType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getModifiedType.invokeExact(allocator, T.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Gets the type contained by this atomic type.
     *
     * If a non-atomic type is passed in, an invalid type is returned.
     */
    public static jpgen.clang.CXType clang_Type_getValueType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType CT)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getValueType.invokeExact(allocator, CT.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the offset of the field represented by the Cursor.
     *
     * If the cursor is not a field declaration, -1 is returned.
     * If the cursor semantic parent is not a record field declaration,
     *   CXTypeLayoutError_Invalid is returned.
     * If the field's type declaration is an incomplete type,
     *   CXTypeLayoutError_Incomplete is returned.
     * If the field's type declaration is a dependent type,
     *   CXTypeLayoutError_Dependent is returned.
     * If the field's name S is not found,
     *   CXTypeLayoutError_InvalidFieldName is returned.
     */
    public static long clang_Cursor_getOffsetOfField(jpgen.clang.CXCursor C)
    {
        try {return (long)MTD$clang_Cursor_getOffsetOfField.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor represents an anonymous
     * tag or namespace
     */
    public static int clang_Cursor_isAnonymous(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isAnonymous.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor represents an anonymous record
     * declaration.
     */
    public static int clang_Cursor_isAnonymousRecordDecl(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isAnonymousRecordDecl.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the given cursor represents an inline namespace
     * declaration.
     */
    public static int clang_Cursor_isInlineNamespace(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isInlineNamespace.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the number of template arguments for given template
     * specialization, or -1 if type \c T is not a template specialization.
     */
    public static int clang_Type_getNumTemplateArguments(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_getNumTemplateArguments.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the type template argument of a template class specialization
     * at given index.
     *
     * This function only returns template type arguments and does not handle
     * template template arguments or variadic packs.
     */
    public static jpgen.clang.CXType clang_Type_getTemplateArgumentAsType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXType T, int i)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Type_getTemplateArgumentAsType.invokeExact(allocator, T.ptr(), i));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the ref-qualifier kind of a function or method.
     *
     * The ref-qualifier is returned for C++ functions or methods. For other types
     * or non-C++ declarations, CXRefQualifier_None is returned.
     */
    public static int clang_Type_getCXXRefQualifier(jpgen.clang.CXType T)
    {
        try {return (int)MTD$clang_Type_getCXXRefQualifier.invokeExact(T.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns 1 if the base class specified by the cursor with kind
     *   CX_CXXBaseSpecifier is virtual.
     */
    public static int clang_isVirtualBase(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_isVirtualBase.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the access control level for the referenced object.
     *
     * If the cursor refers to a C++ declaration, its access control level within
     * its parent scope is returned. Otherwise, if the cursor refers to a base
     * specifier or access specifier, the specifier itself is returned.
     */
    public static int clang_getCXXAccessSpecifier(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_getCXXAccessSpecifier.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the storage class for a function or variable declaration.
     *
     * If the passed in Cursor is not a function or variable declaration,
     * CX_SC_Invalid is returned else the storage class.
     */
    public static int clang_Cursor_getStorageClass(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_Cursor_getStorageClass.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of overloaded declarations referenced by a
     * \c CXCursor_OverloadedDeclRef cursor.
     *
     * \param cursor The cursor whose overloaded declarations are being queried.
     *
     * \returns The number of overloaded declarations referenced by \c cursor. If it
     * is not a \c CXCursor_OverloadedDeclRef cursor, returns 0.
     */
    public static int clang_getNumOverloadedDecls(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getNumOverloadedDecls.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a cursor for one of the overloaded declarations referenced
     * by a \c CXCursor_OverloadedDeclRef cursor.
     *
     * \param cursor The cursor whose overloaded declarations are being queried.
     *
     * \param index The zero-based index into the set of overloaded declarations in
     * the cursor.
     *
     * \returns A cursor representing the declaration referenced by the given
     * \c cursor at the specified \c index. If the cursor does not have an
     * associated set of overloaded declarations, or if the index is out of bounds,
     * returns \c clang_getNullCursor();
     */
    public static jpgen.clang.CXCursor clang_getOverloadedDecl(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor cursor, int index)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getOverloadedDecl.invokeExact(allocator, cursor.ptr(), index));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For cursors representing an iboutletcollection attribute,
     *  this function returns the collection element type.
     *
     */
    public static jpgen.clang.CXType clang_getIBOutletCollectionType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_getIBOutletCollectionType.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Visit the children of a particular cursor.
     *
     * This function visits all the direct children of the given cursor,
     * invoking the given \p visitor function with the cursors of each
     * visited child. The traversal may be recursive, if the visitor returns
     * \c CXChildVisit_Recurse. The traversal may also be ended prematurely, if
     * the visitor returns \c CXChildVisit_Break.
     *
     * \param parent the cursor whose child may be visited. All kinds of
     * cursors can be visited, including invalid cursors (which, by
     * definition, have no children).
     *
     * \param visitor the visitor function that will be invoked for each
     * child of \p parent.
     *
     * \param client_data pointer data supplied by the client, which will
     * be passed to the visitor each time it is invoked.
     *
     * \returns a non-zero value if the traversal was terminated
     * prematurely by the visitor returning \c CXChildVisit_Break.
     */
    public static int clang_visitChildren(jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {return (int)MTD$clang_visitChildren.invokeExact(parent.ptr(), visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Visits the children of a cursor using the specified block.  Behaves
     * identically to clang_visitChildren() in all other respects.
     */
    public static int clang_visitChildrenWithBlock(jpgen.clang.CXCursor parent, java.lang.foreign.MemorySegment block)
    {
        try {return (int)MTD$clang_visitChildrenWithBlock.invokeExact(parent.ptr(), block);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a Unified Symbol Resolution (USR) for the entity referenced
     * by the given cursor.
     *
     * A Unified Symbol Resolution (USR) is a string that identifies a particular
     * entity (function, class, variable, etc.) within a program. USRs can be
     * compared across translation units to determine, e.g., when references in
     * one translation refer to an entity defined in another translation unit.
     */
    public static jpgen.clang.CXString clang_getCursorUSR(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorUSR.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C class.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCClass(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment class_name)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCClass.invokeExact(allocator, class_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C category.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCCategory(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment class_name, java.lang.foreign.MemorySegment category_name)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCCategory.invokeExact(allocator, class_name, category_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C protocol.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCProtocol(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment protocol_name)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCProtocol.invokeExact(allocator, protocol_name));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C instance variable and
     *   the USR for its containing class.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCIvar(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment name, jpgen.clang.CXString classUSR)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCIvar.invokeExact(allocator, name, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C method and
     *   the USR for its containing class.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCMethod(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment name, int isInstanceMethod, jpgen.clang.CXString classUSR)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCMethod.invokeExact(allocator, name, isInstanceMethod, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Construct a USR for a specified Objective-C property and the USR
     *  for its containing class.
     */
    public static jpgen.clang.CXString clang_constructUSR_ObjCProperty(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment property, jpgen.clang.CXString classUSR)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_constructUSR_ObjCProperty.invokeExact(allocator, property, classUSR.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a name for the entity referenced by this cursor.
     */
    public static jpgen.clang.CXString clang_getCursorSpelling(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorSpelling.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a range for a piece that forms the cursors spelling name.
     * Most of the times there is only one range for the complete spelling but for
     * Objective-C methods and Objective-C message expressions, there are multiple
     * pieces for each selector identifier.
     *
     * \param pieceIndex the index of the spelling name piece. If this is greater
     * than the actual number of pieces, it will return a NULL (invalid) range.
     *
     * \param options Reserved.
     */
    public static jpgen.clang.CXSourceRange clang_Cursor_getSpellingNameRange(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1, int pieceIndex, int options)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getSpellingNameRange.invokeExact(allocator, arg1.ptr(), pieceIndex, options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get a property value for the given printing policy.
     */
    public static int clang_PrintingPolicy_getProperty(java.lang.foreign.MemorySegment Policy, int Property)
    {
        try {return (int)MTD$clang_PrintingPolicy_getProperty.invokeExact(Policy, Property);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Set a property value for the given printing policy.
     */
    public static void clang_PrintingPolicy_setProperty(java.lang.foreign.MemorySegment Policy, int Property, int Value)
    {
        try {MTD$clang_PrintingPolicy_setProperty.invokeExact(Policy, Property, Value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the default policy for the cursor.
     *
     * The policy should be released after use with \c
     * clang_PrintingPolicy_dispose.
     */
    public static java.lang.foreign.MemorySegment clang_getCursorPrintingPolicy(jpgen.clang.CXCursor arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getCursorPrintingPolicy.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Release a printing policy.
     */
    public static void clang_PrintingPolicy_dispose(java.lang.foreign.MemorySegment Policy)
    {
        try {MTD$clang_PrintingPolicy_dispose.invokeExact(Policy);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Pretty print declarations.
     *
     * \param Cursor The cursor representing a declaration.
     *
     * \param Policy The policy to control the entities being printed. If
     * NULL, a default policy is used.
     *
     * \returns The pretty printed declaration or the empty string for
     * other cursors.
     */
    public static jpgen.clang.CXString clang_getCursorPrettyPrinted(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor Cursor, java.lang.foreign.MemorySegment Policy)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorPrettyPrinted.invokeExact(allocator, Cursor.ptr(), Policy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the display name for the entity referenced by this cursor.
     *
     * The display name contains extra information that helps identify the cursor,
     * such as the parameters of a function or template or the arguments of a
     * class template specialization.
     */
    public static jpgen.clang.CXString clang_getCursorDisplayName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorDisplayName.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** For a cursor that is a reference, retrieve a cursor representing the
     * entity that it references.
     *
     * Reference cursors refer to other entities in the AST. For example, an
     * Objective-C superclass reference cursor refers to an Objective-C class.
     * This function produces the cursor for the Objective-C class from the
     * cursor for the superclass reference. If the input cursor is a declaration or
     * definition, it returns that declaration or definition unchanged.
     * Otherwise, returns the NULL cursor.
     */
    public static jpgen.clang.CXCursor clang_getCursorReferenced(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorReferenced.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     *  For a cursor that is either a reference to or a declaration
     *  of some entity, retrieve a cursor that describes the definition of
     *  that entity.
     *
     *  Some entities can be declared multiple times within a translation
     *  unit, but only one of those declarations can also be a
     *  definition. For example, given:
     *
     *  \code
     *  int f(int, int);
     *  int g(int x, int y) { return f(x, y); }
     *  int f(int a, int b) { return a + b; }
     *  int f(int, int);
     *  \endcode
     *
     *  there are three declarations of the function "f", but only the
     *  second one is a definition. The clang_getCursorDefinition()
     *  function will take any cursor pointing to a declaration of "f"
     *  (the first or fourth lines of the example) or a cursor referenced
     *  that uses "f" (the call to "f' inside "g") and will return a
     *  declaration cursor pointing to the definition (the second "f"
     *  declaration).
     *
     *  If given a cursor for which there is no corresponding definition,
     *  e.g., because there is no definition of that entity within this
     *  translation unit, returns a NULL cursor.
     */
    public static jpgen.clang.CXCursor clang_getCursorDefinition(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCursorDefinition.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether the declaration pointed to by this cursor
     * is also a definition of that entity.
     */
    public static int clang_isCursorDefinition(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_isCursorDefinition.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the canonical cursor corresponding to the given cursor.
     *
     * In the C family of languages, many kinds of entities can be declared several
     * times within a single translation unit. For example, a structure type can
     * be forward-declared (possibly multiple times) and later defined:
     *
     * \code
     * struct X;
     * struct X;
     * struct X {
     *   int member;
     * };
     * \endcode
     *
     * The declarations and the definition of \c X are represented by three
     * different cursors, all of which are declarations of the same underlying
     * entity. One of these cursor is considered the "canonical" cursor, which
     * is effectively the representative for the underlying entity. One can
     * determine if two cursors are declarations of the same underlying entity by
     * comparing their canonical cursors.
     *
     * \returns The canonical cursor for the entity referred to by the given cursor.
     */
    public static jpgen.clang.CXCursor clang_getCanonicalCursor(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getCanonicalCursor.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * If the cursor points to a selector identifier in an Objective-C
     * method or message expression, this returns the selector index.
     *
     * After getting a cursor with #clang_getCursor, this can be called to
     * determine if the location points to a selector identifier.
     *
     * \returns The selector index if the cursor is an Objective-C method or message
     * expression and the cursor is pointing to a selector identifier, or -1
     * otherwise.
     */
    public static int clang_Cursor_getObjCSelectorIndex(jpgen.clang.CXCursor arg1)
    {
        try {return (int)MTD$clang_Cursor_getObjCSelectorIndex.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor pointing to a C++ method call or an Objective-C
     * message, returns non-zero if the method/message is "dynamic", meaning:
     *
     * For a C++ method: the call is virtual.
     * For an Objective-C message: the receiver is an object instance, not 'super'
     * or a specific class.
     *
     * If the method/message is "static" or the cursor does not point to a
     * method/message, it will return zero.
     */
    public static int clang_Cursor_isDynamicCall(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isDynamicCall.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor pointing to an Objective-C message or property
     * reference, or C++ method call, returns the CXType of the receiver.
     */
    public static jpgen.clang.CXType clang_Cursor_getReceiverType(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXType((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getReceiverType.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a property declaration, return the
     * associated property attributes. The bits are formed from
     * \c CXObjCPropertyAttrKind.
     *
     * \param reserved Reserved for future use, pass 0.
     */
    public static int clang_Cursor_getObjCPropertyAttributes(jpgen.clang.CXCursor C, int reserved)
    {
        try {return (int)MTD$clang_Cursor_getObjCPropertyAttributes.invokeExact(C.ptr(), reserved);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a property declaration, return the
     * name of the method that implements the getter.
     */
    public static jpgen.clang.CXString clang_Cursor_getObjCPropertyGetterName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCPropertyGetterName.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a property declaration, return the
     * name of the method that implements the setter, if any.
     */
    public static jpgen.clang.CXString clang_Cursor_getObjCPropertySetterName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCPropertySetterName.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents an Objective-C method or parameter
     * declaration, return the associated Objective-C qualifiers for the return
     * type or the parameter respectively. The bits are formed from
     * CXObjCDeclQualifierKind.
     */
    public static int clang_Cursor_getObjCDeclQualifiers(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_getObjCDeclQualifiers.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents an Objective-C method or property
     * declaration, return non-zero if the declaration was affected by "\@optional".
     * Returns zero if the cursor is not such a declaration or it is "\@required".
     */
    public static int clang_Cursor_isObjCOptional(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isObjCOptional.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the given cursor is a variadic function or method.
     */
    public static int clang_Cursor_isVariadic(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_Cursor_isVariadic.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the given cursor points to a symbol marked with
     * external_source_symbol attribute.
     *
     * \param language If non-NULL, and the attribute is present, will be set to
     * the 'language' string from the attribute.
     *
     * \param definedIn If non-NULL, and the attribute is present, will be set to
     * the 'definedIn' string from the attribute.
     *
     * \param isGenerated If non-NULL, and the attribute is present, will be set to
     * non-zero if the 'generated_declaration' is set in the attribute.
     */
    public static int clang_Cursor_isExternalSymbol(jpgen.clang.CXCursor C, java.lang.foreign.MemorySegment language, java.lang.foreign.MemorySegment definedIn, java.lang.foreign.MemorySegment isGenerated)
    {
        try {return (int)MTD$clang_Cursor_isExternalSymbol.invokeExact(C.ptr(), language, definedIn, isGenerated);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a declaration, return the associated
     * comment's source range.  The range may include multiple consecutive comments
     * with whitespace in between.
     */
    public static jpgen.clang.CXSourceRange clang_Cursor_getCommentRange(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getCommentRange.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a declaration, return the associated
     * comment text, including comment markers.
     */
    public static jpgen.clang.CXString clang_Cursor_getRawCommentText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getRawCommentText.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a documentable entity (e.g.,
     * declaration), return the associated \paragraph; otherwise return the
     * first paragraph.
     */
    public static jpgen.clang.CXString clang_Cursor_getBriefCommentText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getBriefCommentText.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the CXString representing the mangled name of the cursor.
     */
    public static jpgen.clang.CXString clang_Cursor_getMangling(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getMangling.invokeExact(allocator, arg1.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the CXStrings representing the mangled symbols of the C++
     * constructor or destructor at the cursor.
     */
    public static java.lang.foreign.MemorySegment clang_Cursor_getCXXManglings(jpgen.clang.CXCursor arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getCXXManglings.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the CXStrings representing the mangled symbols of the ObjC
     * class interface or implementation at the cursor.
     */
    public static java.lang.foreign.MemorySegment clang_Cursor_getObjCManglings(jpgen.clang.CXCursor arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getObjCManglings.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a CXCursor_ModuleImportDecl cursor, return the associated module.
     */
    public static java.lang.foreign.MemorySegment clang_Cursor_getModule(jpgen.clang.CXCursor C)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_getModule.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a CXFile header file, return the module that contains it, if one
     * exists.
     */
    public static java.lang.foreign.MemorySegment clang_getModuleForFile(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getModuleForFile.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns the module file where the provided module object came from.
     */
    public static java.lang.foreign.MemorySegment clang_Module_getASTFile(java.lang.foreign.MemorySegment Module)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getASTFile.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns the parent of a sub-module or NULL if the given module is top-level,
     * e.g. for 'std.vector' it will return the 'std' module.
     */
    public static java.lang.foreign.MemorySegment clang_Module_getParent(java.lang.foreign.MemorySegment Module)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getParent.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns the name of the module, e.g. for the 'std.vector' sub-module it
     * will return "vector".
     */
    public static jpgen.clang.CXString clang_Module_getName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Module)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Module_getName.invokeExact(allocator, Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns the full name of the module, e.g. "std.vector".
     */
    public static jpgen.clang.CXString clang_Module_getFullName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Module)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_Module_getFullName.invokeExact(allocator, Module));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns non-zero if the module is a system one.
     */
    public static int clang_Module_isSystem(java.lang.foreign.MemorySegment Module)
    {
        try {return (int)MTD$clang_Module_isSystem.invokeExact(Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \returns the number of top level headers associated with this module.
     */
    public static int clang_Module_getNumTopLevelHeaders(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Module)
    {
        try {return (int)MTD$clang_Module_getNumTopLevelHeaders.invokeExact(arg1, Module);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Module a module object.
     *
     * \param Index top level header index (zero-based).
     *
     * \returns the specified top level header associated with the module.
     */
    public static java.lang.foreign.MemorySegment clang_Module_getTopLevelHeader(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment Module, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Module_getTopLevelHeader.invokeExact(arg1, Module, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ constructor is a converting constructor.
     */
    public static int clang_CXXConstructor_isConvertingConstructor(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXConstructor_isConvertingConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ constructor is a copy constructor.
     */
    public static int clang_CXXConstructor_isCopyConstructor(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXConstructor_isCopyConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ constructor is the default constructor.
     */
    public static int clang_CXXConstructor_isDefaultConstructor(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXConstructor_isDefaultConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ constructor is a move constructor.
     */
    public static int clang_CXXConstructor_isMoveConstructor(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXConstructor_isMoveConstructor.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ field is declared 'mutable'.
     */
    public static int clang_CXXField_isMutable(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXField_isMutable.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ method is declared '= default'.
     */
    public static int clang_CXXMethod_isDefaulted(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isDefaulted.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ method is declared '= delete'.
     */
    public static int clang_CXXMethod_isDeleted(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isDeleted.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function or member function template is
     * pure virtual.
     */
    public static int clang_CXXMethod_isPureVirtual(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isPureVirtual.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function or member function template is
     * declared 'static'.
     */
    public static int clang_CXXMethod_isStatic(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isStatic.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function or member function template is
     * explicitly declared 'virtual' or if it overrides a virtual method from
     * one of the base classes.
     */
    public static int clang_CXXMethod_isVirtual(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isVirtual.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function is a copy-assignment operator,
     * returning 1 if such is the case and 0 otherwise.
     *
     * > A copy-assignment operator `X::operator=` is a non-static,
     * > non-template member function of _class_ `X` with exactly one
     * > parameter of type `X`, `X&`, `const X&`, `volatile X&` or `const
     * > volatile X&`.
     *
     * That is, for example, the `operator=` in:
     *
     *    class Foo {
     *        bool operator=(const volatile Foo&);
     *    };
     *
     * Is a copy-assignment operator, while the `operator=` in:
     *
     *    class Bar {
     *        bool operator=(const int&);
     *    };
     *
     * Is not.
     */
    public static int clang_CXXMethod_isCopyAssignmentOperator(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isCopyAssignmentOperator.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function is a move-assignment operator,
     * returning 1 if such is the case and 0 otherwise.
     *
     * > A move-assignment operator `X::operator=` is a non-static,
     * > non-template member function of _class_ `X` with exactly one
     * > parameter of type `X&&`, `const X&&`, `volatile X&&` or `const
     * > volatile X&&`.
     *
     * That is, for example, the `operator=` in:
     *
     *    class Foo {
     *        bool operator=(const volatile Foo&&);
     *    };
     *
     * Is a move-assignment operator, while the `operator=` in:
     *
     *    class Bar {
     *        bool operator=(const int&&);
     *    };
     *
     * Is not.
     */
    public static int clang_CXXMethod_isMoveAssignmentOperator(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isMoveAssignmentOperator.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determines if a C++ constructor or conversion function was declared
     * explicit, returning 1 if such is the case and 0 otherwise.
     *
     * Constructors or conversion functions are declared explicit through
     * the use of the explicit specifier.
     *
     * For example, the following constructor and conversion function are
     * not explicit as they lack the explicit specifier:
     *
     *     class Foo {
     *         Foo();
     *         operator int();
     *     };
     *
     * While the following constructor and conversion function are
     * explicit as they are declared with the explicit specifier.
     *
     *     class Foo {
     *         explicit Foo();
     *         explicit operator int();
     *     };
     *
     * This function will return 0 when given a cursor pointing to one of
     * the former declarations and it will return 1 for a cursor pointing
     * to the latter declarations.
     *
     * The explicit specifier allows the user to specify a
     * conditional compile-time expression whose value decides
     * whether the marked element is explicit or not.
     *
     * For example:
     *
     *     constexpr bool foo(int i) { return i % 2 == 0; }
     *
     *     class Foo {
     *          explicit(foo(1)) Foo();
     *          explicit(foo(2)) operator int();
     *     }
     *
     * This function will return 0 for the constructor and 1 for
     * the conversion function.
     */
    public static int clang_CXXMethod_isExplicit(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isExplicit.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ record is abstract, i.e. whether a class or struct
     * has a pure virtual member function.
     */
    public static int clang_CXXRecord_isAbstract(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXRecord_isAbstract.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if an enum declaration refers to a scoped enum.
     */
    public static int clang_EnumDecl_isScoped(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_EnumDecl_isScoped.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine if a C++ member function or member function template is
     * declared 'const'.
     */
    public static int clang_CXXMethod_isConst(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_CXXMethod_isConst.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a template, determine
     * the cursor kind of the specializations would be generated by instantiating
     * the template.
     *
     * This routine can be used to determine what flavor of function template,
     * class template, or class template partial specialization is stored in the
     * cursor. For example, it can describe whether a class template cursor is
     * declared with "struct", "class" or "union".
     *
     * \param C The cursor to query. This cursor should represent a template
     * declaration.
     *
     * \returns The cursor kind of the specializations that would be generated
     * by instantiating the template \p C. If \p C is not a template, returns
     * \c CXCursor_NoDeclFound.
     */
    public static int clang_getTemplateCursorKind(jpgen.clang.CXCursor C)
    {
        try {return (int)MTD$clang_getTemplateCursorKind.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that may represent a specialization or instantiation
     * of a template, retrieve the cursor that represents the template that it
     * specializes or from which it was instantiated.
     *
     * This routine determines the template involved both for explicit
     * specializations of templates and for implicit instantiations of the template,
     * both of which are referred to as "specializations". For a class template
     * specialization (e.g., \c std::vector<bool>), this routine will return
     * either the primary template (\c std::vector) or, if the specialization was
     * instantiated from a class template partial specialization, the class template
     * partial specialization. For a class template partial specialization and a
     * function template specialization (including instantiations), this
     * this routine will return the specialized template.
     *
     * For members of a class template (e.g., member functions, member classes, or
     * static data members), returns the specialized or instantiated member.
     * Although not strictly "templates" in the C++ language, members of class
     * templates have the same notions of specializations and instantiations that
     * templates do, so this routine treats them similarly.
     *
     * \param C A cursor that may be a specialization of a template or a member
     * of a template.
     *
     * \returns If the given cursor is a specialization or instantiation of a
     * template or a member thereof, the template or member that it specializes or
     * from which it was instantiated. Otherwise, returns a NULL cursor.
     */
    public static jpgen.clang.CXCursor clang_getSpecializedCursorTemplate(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXCursor((java.lang.foreign.MemorySegment)MTD$clang_getSpecializedCursorTemplate.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that references something else, return the source range
     * covering that reference.
     *
     * \param C A cursor pointing to a member reference, a declaration reference, or
     * an operator call.
     * \param NameFlags A bitset with three independent flags:
     * CXNameRange_WantQualifier, CXNameRange_WantTemplateArgs, and
     * CXNameRange_WantSinglePiece.
     * \param PieceIndex For contiguous names or when passing the flag
     * CXNameRange_WantSinglePiece, only one piece with index 0 is
     * available. When the CXNameRange_WantSinglePiece flag is not passed for a
     * non-contiguous names, this index can be used to retrieve the individual
     * pieces of the name. See also CXNameRange_WantSinglePiece.
     *
     * \returns The piece of the name pointed to by the given cursor. If there is no
     * name, or if the PieceIndex is out-of-range, a null-cursor will be returned.
     */
    public static jpgen.clang.CXSourceRange clang_getCursorReferenceNameRange(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C, int NameFlags, int PieceIndex)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getCursorReferenceNameRange.invokeExact(allocator, C.ptr(), NameFlags, PieceIndex));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the raw lexical token starting with the given location.
     *
     * \param TU the translation unit whose text is being tokenized.
     *
     * \param Location the source location with which the token starts.
     *
     * \returns The token starting with the given location or NULL if no such token
     * exist. The returned pointer must be freed with clang_disposeTokens before the
     * translation unit is destroyed.
     */
    public static java.lang.foreign.MemorySegment clang_getToken(java.lang.foreign.MemorySegment TU, jpgen.clang.CXSourceLocation Location)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getToken.invokeExact(TU, Location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the kind of the given token.
     */
    public static int clang_getTokenKind(jpgen.clang.CXToken arg1)
    {
        try {return (int)MTD$clang_getTokenKind.invokeExact(arg1.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the spelling of the given token.
     *
     * The spelling of a token is the textual representation of that token, e.g.,
     * the text of an identifier or keyword.
     */
    public static jpgen.clang.CXString clang_getTokenSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, jpgen.clang.CXToken arg2)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getTokenSpelling.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the source location of the given token.
     */
    public static jpgen.clang.CXSourceLocation clang_getTokenLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, jpgen.clang.CXToken arg2)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getTokenLocation.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a source range that covers the given token.
     */
    public static jpgen.clang.CXSourceRange clang_getTokenExtent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, jpgen.clang.CXToken arg2)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getTokenExtent.invokeExact(allocator, arg1, arg2.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Tokenize the source code described by the given range into raw
     * lexical tokens.
     *
     * \param TU the translation unit whose text is being tokenized.
     *
     * \param Range the source range in which text should be tokenized. All of the
     * tokens produced by tokenization will fall within this source range,
     *
     * \param Tokens this pointer will be set to point to the array of tokens
     * that occur within the given source range. The returned pointer must be
     * freed with clang_disposeTokens() before the translation unit is destroyed.
     *
     * \param NumTokens will be set to the number of tokens in the \c *Tokens
     * array.
     *
     */
    public static void clang_tokenize(java.lang.foreign.MemorySegment TU, jpgen.clang.CXSourceRange Range, java.lang.foreign.MemorySegment Tokens, java.lang.foreign.MemorySegment NumTokens)
    {
        try {MTD$clang_tokenize.invokeExact(TU, Range.ptr(), Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Annotate the given set of tokens by providing cursors for each token
     * that can be mapped to a specific entity within the abstract syntax tree.
     *
     * This token-annotation routine is equivalent to invoking
     * clang_getCursor() for the source locations of each of the
     * tokens. The cursors provided are filtered, so that only those
     * cursors that have a direct correspondence to the token are
     * accepted. For example, given a function call \c f(x),
     * clang_getCursor() would provide the following cursors:
     *
     *   * when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.
     *   * when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.
     *   * when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'.
     *
     * Only the first and last of these cursors will occur within the
     * annotate, since the tokens "f" and "x' directly refer to a function
     * and a variable, respectively, but the parentheses are just a small
     * part of the full syntax of the function call expression, which is
     * not provided as an annotation.
     *
     * \param TU the translation unit that owns the given tokens.
     *
     * \param Tokens the set of tokens to annotate.
     *
     * \param NumTokens the number of tokens in \p Tokens.
     *
     * \param Cursors an array of \p NumTokens cursors, whose contents will be
     * replaced with the cursors corresponding to each token.
     */
    public static void clang_annotateTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens, java.lang.foreign.MemorySegment Cursors)
    {
        try {MTD$clang_annotateTokens.invokeExact(TU, Tokens, NumTokens, Cursors);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given set of tokens.
     */
    public static void clang_disposeTokens(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment Tokens, int NumTokens)
    {
        try {MTD$clang_disposeTokens.invokeExact(TU, Tokens, NumTokens);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* for debug/testing */
    public static jpgen.clang.CXString clang_getCursorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int Kind)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCursorKindSpelling.invokeExact(allocator, Kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void clang_getDefinitionSpellingAndExtent(jpgen.clang.CXCursor arg1, java.lang.foreign.MemorySegment startBuf, java.lang.foreign.MemorySegment endBuf, java.lang.foreign.MemorySegment startLine, java.lang.foreign.MemorySegment startColumn, java.lang.foreign.MemorySegment endLine, java.lang.foreign.MemorySegment endColumn)
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

    /**
     * Determine the kind of a particular chunk within a completion string.
     *
     * \param completion_string the completion string to query.
     *
     * \param chunk_number the 0-based index of the chunk in the completion string.
     *
     * \returns the kind of the chunk at the index \c chunk_number.
     */
    public static int clang_getCompletionChunkKind(java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return (int)MTD$clang_getCompletionChunkKind.invokeExact(completion_string, chunk_number);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the text associated with a particular chunk within a
     * completion string.
     *
     * \param completion_string the completion string to query.
     *
     * \param chunk_number the 0-based index of the chunk in the completion string.
     *
     * \returns the text associated with the chunk at index \c chunk_number.
     */
    public static jpgen.clang.CXString clang_getCompletionChunkText(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionChunkText.invokeExact(allocator, completion_string, chunk_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the completion string associated with a particular chunk
     * within a completion string.
     *
     * \param completion_string the completion string to query.
     *
     * \param chunk_number the 0-based index of the chunk in the completion string.
     *
     * \returns the completion string associated with the chunk at index
     * \c chunk_number.
     */
    public static java.lang.foreign.MemorySegment clang_getCompletionChunkCompletionString(java.lang.foreign.MemorySegment completion_string, int chunk_number)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getCompletionChunkCompletionString.invokeExact(completion_string, chunk_number);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of chunks in the given code-completion string.
     */
    public static int clang_getNumCompletionChunks(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD$clang_getNumCompletionChunks.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the priority of this code completion.
     *
     * The priority of a code completion indicates how likely it is that this
     * particular completion is the completion that the user will select. The
     * priority is selected by various internal heuristics.
     *
     * \param completion_string The completion string to query.
     *
     * \returns The priority of this completion string. Smaller values indicate
     * higher-priority (more likely) completions.
     */
    public static int clang_getCompletionPriority(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD$clang_getCompletionPriority.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the availability of the entity that this code-completion
     * string refers to.
     *
     * \param completion_string The completion string to query.
     *
     * \returns The availability of the completion string.
     */
    public static int clang_getCompletionAvailability(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD$clang_getCompletionAvailability.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of annotations associated with the given
     * completion string.
     *
     * \param completion_string the completion string to query.
     *
     * \returns the number of annotations associated with the given completion
     * string.
     */
    public static int clang_getCompletionNumAnnotations(java.lang.foreign.MemorySegment completion_string)
    {
        try {return (int)MTD$clang_getCompletionNumAnnotations.invokeExact(completion_string);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the annotation associated with the given completion string.
     *
     * \param completion_string the completion string to query.
     *
     * \param annotation_number the 0-based index of the annotation of the
     * completion string.
     *
     * \returns annotation string associated with the completion at index
     * \c annotation_number, or a NULL string if that annotation is not available.
     */
    public static jpgen.clang.CXString clang_getCompletionAnnotation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, int annotation_number)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionAnnotation.invokeExact(allocator, completion_string, annotation_number));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the parent context of the given completion string.
     *
     * The parent context of a completion string is the semantic parent of
     * the declaration (if any) that the code completion represents. For example,
     * a code completion for an Objective-C method would have the method's class
     * or protocol as its context.
     *
     * \param completion_string The code completion string whose parent is
     * being queried.
     *
     * \param kind DEPRECATED: always set to CXCursor_NotImplemented if non-NULL.
     *
     * \returns The name of the completion parent, e.g., "NSObject" if
     * the completion string represents a method in the NSObject class.
     */
    public static jpgen.clang.CXString clang_getCompletionParent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string, java.lang.foreign.MemorySegment kind)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionParent.invokeExact(allocator, completion_string, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the brief documentation comment attached to the declaration
     * that corresponds to the given completion string.
     */
    public static jpgen.clang.CXString clang_getCompletionBriefComment(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment completion_string)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionBriefComment.invokeExact(allocator, completion_string));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a completion string for an arbitrary declaration or macro
     * definition cursor.
     *
     * \param cursor The cursor to query.
     *
     * \returns A non-context-sensitive completion string for declaration and macro
     * definition cursors, or NULL for other kinds of cursors.
     */
    public static java.lang.foreign.MemorySegment clang_getCursorCompletionString(jpgen.clang.CXCursor cursor)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getCursorCompletionString.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the number of fix-its for the given completion index.
     *
     * Calling this makes sense only if CXCodeComplete_IncludeCompletionsWithFixIts
     * option was set.
     *
     * \param results The structure keeping all completion results
     *
     * \param completion_index The index of the completion
     *
     * \return The number of fix-its which must be applied before the completion at
     * completion_index can be applied
     */
    public static int clang_getCompletionNumFixIts(java.lang.foreign.MemorySegment results, int completion_index)
    {
        try {return (int)MTD$clang_getCompletionNumFixIts.invokeExact(results, completion_index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Fix-its that *must* be applied before inserting the text for the
     * corresponding completion.
     *
     * By default, clang_codeCompleteAt() only returns completions with empty
     * fix-its. Extra completions with non-empty fix-its should be explicitly
     * requested by setting CXCodeComplete_IncludeCompletionsWithFixIts.
     *
     * For the clients to be able to compute position of the cursor after applying
     * fix-its, the following conditions are guaranteed to hold for
     * replacement_range of the stored fix-its:
     *  - Ranges in the fix-its are guaranteed to never contain the completion
     *  point (or identifier under completion point, if any) inside them, except
     *  at the start or at the end of the range.
     *  - If a fix-it range starts or ends with completion point (or starts or
     *  ends after the identifier under completion point), it will contain at
     *  least one character. It allows to unambiguously recompute completion
     *  point after applying the fix-it.
     *
     * The intuition is that provided fix-its change code around the identifier we
     * complete, but are not allowed to touch the identifier itself or the
     * completion point. One example of completions with corrections are the ones
     * replacing '.' with '->' and vice versa:
     *
     * std::unique_ptr<std::vector<int>> vec_ptr;
     * In 'vec_ptr.^', one of the completions is 'push_back', it requires
     * replacing '.' with '->'.
     * In 'vec_ptr->^', one of the completions is 'release', it requires
     * replacing '->' with '.'.
     *
     * \param results The structure keeping all completion results
     *
     * \param completion_index The index of the completion
     *
     * \param fixit_index The index of the fix-it for the completion at
     * completion_index
     *
     * \param replacement_range The fix-it range that must be replaced before the
     * completion at completion_index can be applied
     *
     * \returns The fix-it string that must replace the code at replacement_range
     * before the completion at completion_index can be applied
     */
    public static jpgen.clang.CXString clang_getCompletionFixIt(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment results, int completion_index, int fixit_index, java.lang.foreign.MemorySegment replacement_range)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getCompletionFixIt.invokeExact(allocator, results, completion_index, fixit_index, replacement_range));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns a default set of code-completion options that can be
     * passed to\c clang_codeCompleteAt().
     */
    public static int clang_defaultCodeCompleteOptions()
    {
        try {return (int)MTD$clang_defaultCodeCompleteOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Perform code completion at a given location in a translation unit.
     *
     * This function performs code completion at a particular file, line, and
     * column within source code, providing results that suggest potential
     * code snippets based on the context of the completion. The basic model
     * for code completion is that Clang will parse a complete source file,
     * performing syntax checking up to the location where code-completion has
     * been requested. At that point, a special code-completion token is passed
     * to the parser, which recognizes this token and determines, based on the
     * current location in the C/Objective-C/C++ grammar and the state of
     * semantic analysis, what completions to provide. These completions are
     * returned via a new \c CXCodeCompleteResults structure.
     *
     * Code completion itself is meant to be triggered by the client when the
     * user types punctuation characters or whitespace, at which point the
     * code-completion location will coincide with the cursor. For example, if \c p
     * is a pointer, code-completion might be triggered after the "-" and then
     * after the ">" in \c p->. When the code-completion location is after the ">",
     * the completion results will provide, e.g., the members of the struct that
     * "p" points to. The client is responsible for placing the cursor at the
     * beginning of the token currently being typed, then filtering the results
     * based on the contents of the token. For example, when code-completing for
     * the expression \c p->get, the client should provide the location just after
     * the ">" (e.g., pointing at the "g") to this code-completion hook. Then, the
     * client can filter the results based on the current token text ("get"), only
     * showing those results that start with "get". The intent of this interface
     * is to separate the relatively high-latency acquisition of code-completion
     * results from the filtering of results on a per-character basis, which must
     * have a lower latency.
     *
     * \param TU The translation unit in which code-completion should
     * occur. The source files for this translation unit need not be
     * completely up-to-date (and the contents of those source files may
     * be overridden via \p unsaved_files). Cursors referring into the
     * translation unit may be invalidated by this invocation.
     *
     * \param complete_filename The name of the source file where code
     * completion should be performed. This filename may be any file
     * included in the translation unit.
     *
     * \param complete_line The line at which code-completion should occur.
     *
     * \param complete_column The column at which code-completion should occur.
     * Note that the column should point just after the syntactic construct that
     * initiated code completion, and not in the middle of a lexical token.
     *
     * \param unsaved_files the Files that have not yet been saved to disk
     * but may be required for parsing or code completion, including the
     * contents of those files.  The contents and name of these files (as
     * specified by CXUnsavedFile) are copied when necessary, so the
     * client only needs to guarantee their validity until the call to
     * this function returns.
     *
     * \param num_unsaved_files The number of unsaved file entries in \p
     * unsaved_files.
     *
     * \param options Extra options that control the behavior of code
     * completion, expressed as a bitwise OR of the enumerators of the
     * CXCodeComplete_Flags enumeration. The
     * \c clang_defaultCodeCompleteOptions() function returns a default set
     * of code-completion options.
     *
     * \returns If successful, a new \c CXCodeCompleteResults structure
     * containing code-completion results, which should eventually be
     * freed with \c clang_disposeCodeCompleteResults(). If code
     * completion fails, returns NULL.
     */
    public static java.lang.foreign.MemorySegment clang_codeCompleteAt(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment complete_filename, int complete_line, int complete_column, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_codeCompleteAt.invokeExact(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Sort the code-completion results in case-insensitive alphabetical
     * order.
     *
     * \param Results The set of results to sort.
     * \param NumResults The number of results in \p Results.
     */
    public static void clang_sortCodeCompletionResults(java.lang.foreign.MemorySegment Results, int NumResults)
    {
        try {MTD$clang_sortCodeCompletionResults.invokeExact(Results, NumResults);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given set of code-completion results.
     */
    public static void clang_disposeCodeCompleteResults(java.lang.foreign.MemorySegment Results)
    {
        try {MTD$clang_disposeCodeCompleteResults.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of diagnostics produced prior to the
     * location where code completion was performed.
     */
    public static int clang_codeCompleteGetNumDiagnostics(java.lang.foreign.MemorySegment Results)
    {
        try {return (int)MTD$clang_codeCompleteGetNumDiagnostics.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a diagnostic associated with the given code completion.
     *
     * \param Results the code completion results to query.
     * \param Index the zero-based diagnostic number to retrieve.
     *
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    public static java.lang.foreign.MemorySegment clang_codeCompleteGetDiagnostic(java.lang.foreign.MemorySegment Results, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetDiagnostic.invokeExact(Results, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determines what completions are appropriate for the context
     * the given code completion.
     *
     * \param Results the code completion results to query
     *
     * \returns the kinds of completions that are appropriate for use
     * along with the given code completion results.
     */
    public static long clang_codeCompleteGetContexts(java.lang.foreign.MemorySegment Results)
    {
        try {return (long)MTD$clang_codeCompleteGetContexts.invokeExact(Results);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the cursor kind for the container for the current code
     * completion context. The container is only guaranteed to be set for
     * contexts where a container exists (i.e. member accesses or Objective-C
     * message sends); if there is not a container, this function will return
     * CXCursor_InvalidCode.
     *
     * \param Results the code completion results to query
     *
     * \param IsIncomplete on return, this value will be false if Clang has complete
     * information about the container. If Clang does not have complete
     * information, this value will be true.
     *
     * \returns the container kind, or CXCursor_InvalidCode if there is not a
     * container
     */
    public static int clang_codeCompleteGetContainerKind(java.lang.foreign.MemorySegment Results, java.lang.foreign.MemorySegment IsIncomplete)
    {
        try {return (int)MTD$clang_codeCompleteGetContainerKind.invokeExact(Results, IsIncomplete);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the USR for the container for the current code completion
     * context. If there is not a container for the current context, this
     * function will return the empty string.
     *
     * \param Results the code completion results to query
     *
     * \returns the USR for the container
     */
    public static jpgen.clang.CXString clang_codeCompleteGetContainerUSR(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Results)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetContainerUSR.invokeExact(allocator, Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the currently-entered selector for an Objective-C message
     * send, formatted like "initWithFoo:bar:". Only guaranteed to return a
     * non-empty string for CXCompletionContext_ObjCInstanceMessage and
     * CXCompletionContext_ObjCClassMessage.
     *
     * \param Results the code completion results to query
     *
     * \returns the selector (or partial selector) that has been entered thus far
     * for an Objective-C message send.
     */
    public static jpgen.clang.CXString clang_codeCompleteGetObjCSelector(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Results)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_codeCompleteGetObjCSelector.invokeExact(allocator, Results));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return a version string, suitable for showing to a user, but not
     *        intended to be parsed (the format is not guaranteed to be stable).
     */
    public static jpgen.clang.CXString clang_getClangVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getClangVersion.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Enable/disable crash recovery.
     *
     * \param isEnabled Flag to indicate if crash recovery is enabled.  A non-zero
     *        value enables crash recovery, while 0 disables it.
     */
    public static void clang_toggleCrashRecovery(int isEnabled)
    {
        try {MTD$clang_toggleCrashRecovery.invokeExact(isEnabled);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Visit the set of preprocessor inclusions in a translation unit.
     *   The visitor function is called with the provided data for every included
     *   file.  This does not include headers included by the PCH file (unless one
     *   is inspecting the inclusions in the PCH file itself).
     */
    public static void clang_getInclusions(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {MTD$clang_getInclusions.invokeExact(tu, visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * If cursor is a statement declaration tries to evaluate the
     * statement and if its variable, tries to evaluate its initializer,
     * into its corresponding type.
     * If it's an expression, tries to evaluate the expression.
     */
    public static java.lang.foreign.MemorySegment clang_Cursor_Evaluate(jpgen.clang.CXCursor C)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_Cursor_Evaluate.invokeExact(C.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the kind of the evaluated result.
     */
    public static int clang_EvalResult_getKind(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD$clang_EvalResult_getKind.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the evaluation result as integer if the
     * kind is Int.
     */
    public static int clang_EvalResult_getAsInt(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD$clang_EvalResult_getAsInt.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the evaluation result as a long long integer if the
     * kind is Int. This prevents overflows that may happen if the result is
     * returned with clang_EvalResult_getAsInt.
     */
    public static long clang_EvalResult_getAsLongLong(java.lang.foreign.MemorySegment E)
    {
        try {return (long)MTD$clang_EvalResult_getAsLongLong.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns a non-zero value if the kind is Int and the evaluation
     * result resulted in an unsigned integer.
     */
    public static int clang_EvalResult_isUnsignedInt(java.lang.foreign.MemorySegment E)
    {
        try {return (int)MTD$clang_EvalResult_isUnsignedInt.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the evaluation result as an unsigned integer if
     * the kind is Int and clang_EvalResult_isUnsignedInt is non-zero.
     */
    public static long clang_EvalResult_getAsUnsigned(java.lang.foreign.MemorySegment E)
    {
        try {return (long)MTD$clang_EvalResult_getAsUnsigned.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the evaluation result as double if the
     * kind is double.
     */
    public static double clang_EvalResult_getAsDouble(java.lang.foreign.MemorySegment E)
    {
        try {return (double)MTD$clang_EvalResult_getAsDouble.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the evaluation result as a constant string if the
     * kind is other than Int or float. User must not free this pointer,
     * instead call clang_EvalResult_dispose on the CXEvalResult returned
     * by clang_Cursor_Evaluate.
     */
    public static java.lang.foreign.MemorySegment clang_EvalResult_getAsStr(java.lang.foreign.MemorySegment E)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_EvalResult_getAsStr.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Disposes the created Eval memory.
     */
    public static void clang_EvalResult_dispose(java.lang.foreign.MemorySegment E)
    {
        try {MTD$clang_EvalResult_dispose.invokeExact(E);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a remapping.
     *
     * \param path the path that contains metadata about remappings.
     *
     * \returns the requested remapping. This remapping must be freed
     * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
     */
    public static java.lang.foreign.MemorySegment clang_getRemappings(java.lang.foreign.MemorySegment path)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getRemappings.invokeExact(path);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a remapping.
     *
     * \param filePaths pointer to an array of file paths containing remapping info.
     *
     * \param numFiles number of file paths.
     *
     * \returns the requested remapping. This remapping must be freed
     * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
     */
    public static java.lang.foreign.MemorySegment clang_getRemappingsFromFileList(java.lang.foreign.MemorySegment filePaths, int numFiles)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getRemappingsFromFileList.invokeExact(filePaths, numFiles);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of remappings.
     */
    public static int clang_remap_getNumFiles(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_remap_getNumFiles.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the original and the associated filename from the remapping.
     *
     * \param original If non-NULL, will be set to the original filename.
     *
     * \param transformed If non-NULL, will be set to the filename that the original
     * is associated with.
     */
    public static void clang_remap_getFilenames(java.lang.foreign.MemorySegment arg1, int index, java.lang.foreign.MemorySegment original, java.lang.foreign.MemorySegment transformed)
    {
        try {MTD$clang_remap_getFilenames.invokeExact(arg1, index, original, transformed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Dispose the remapping.
     */
    public static void clang_remap_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_remap_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Find references of a declaration in a specific file.
     *
     * \param cursor pointing to a declaration or a reference of one.
     *
     * \param file to search for references.
     *
     * \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
     * each reference found.
     * The CXSourceRange will point inside the file; if the reference is inside
     * a macro (and not a macro argument) the CXSourceRange will be invalid.
     *
     * \returns one of the CXResult enumerators.
     */
    public static int clang_findReferencesInFile(jpgen.clang.CXCursor cursor, java.lang.foreign.MemorySegment file, jpgen.clang.CXCursorAndRangeVisitor visitor)
    {
        try {return (int)MTD$clang_findReferencesInFile.invokeExact(cursor.ptr(), file, visitor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Find #import/#include directives in a specific file.
     *
     * \param TU translation unit containing the file to query.
     *
     * \param file to search for #import/#include directives.
     *
     * \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
     * each directive found.
     *
     * \returns one of the CXResult enumerators.
     */
    public static int clang_findIncludesInFile(java.lang.foreign.MemorySegment TU, java.lang.foreign.MemorySegment file, jpgen.clang.CXCursorAndRangeVisitor visitor)
    {
        try {return (int)MTD$clang_findIncludesInFile.invokeExact(TU, file, visitor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int clang_findReferencesInFileWithBlock(jpgen.clang.CXCursor arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
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

    /**
     * For retrieving a custom CXIdxClientContainer attached to a
     * container.
     */
    public static java.lang.foreign.MemorySegment clang_index_getClientContainer(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getClientContainer.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For setting a custom CXIdxClientContainer attached to a
     * container.
     */
    public static void clang_index_setClientContainer(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$clang_index_setClientContainer.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For retrieving a custom CXIdxClientEntity attached to an entity.
     */
    public static java.lang.foreign.MemorySegment clang_index_getClientEntity(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_index_getClientEntity.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * For setting a custom CXIdxClientEntity attached to an entity.
     */
    public static void clang_index_setClientEntity(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$clang_index_setClientEntity.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * An indexing action/session, to be applied to one or multiple
     * translation units.
     *
     * \param CIdx The index object with which the index action will be associated.
     */
    public static java.lang.foreign.MemorySegment clang_IndexAction_create(java.lang.foreign.MemorySegment CIdx)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_IndexAction_create.invokeExact(CIdx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy the given index action.
     *
     * The index action must not be destroyed until all of the translation units
     * created within that index action have been destroyed.
     */
    public static void clang_IndexAction_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_IndexAction_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Index the given source file and the translation unit corresponding
     * to that file via callbacks implemented through #IndexerCallbacks.
     *
     * \param client_data pointer data supplied by the client, which will
     * be passed to the invoked callbacks.
     *
     * \param index_callbacks Pointer to indexing callbacks that the client
     * implements.
     *
     * \param index_callbacks_size Size of #IndexerCallbacks structure that gets
     * passed in index_callbacks.
     *
     * \param index_options A bitmask of options that affects how indexing is
     * performed. This should be a bitwise OR of the CXIndexOpt_XXX flags.
     *
     * \param[out] out_TU pointer to store a \c CXTranslationUnit that can be
     * reused after indexing is finished. Set to \c NULL if you do not require it.
     *
     * \returns 0 on success or if there were errors from which the compiler could
     * recover.  If there is a failure from which there is no recovery, returns
     * a non-zero \c CXErrorCode.
     *
     * The rest of the parameters are the same as #clang_parseTranslationUnit.
     */
    public static int clang_indexSourceFile(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
    {
        try {return (int)MTD$clang_indexSourceFile.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Same as clang_indexSourceFile but requires a full command line
     * for \c command_line_args including argv[0]. This is useful if the standard
     * library paths are relative to the binary.
     */
    public static int clang_indexSourceFileFullArgv(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment source_filename, java.lang.foreign.MemorySegment command_line_args, int num_command_line_args, java.lang.foreign.MemorySegment unsaved_files, int num_unsaved_files, java.lang.foreign.MemorySegment out_TU, int TU_options)
    {
        try {return (int)MTD$clang_indexSourceFileFullArgv.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Index the given translation unit via callbacks implemented through
     * #IndexerCallbacks.
     *
     * The order of callback invocations is not guaranteed to be the same as
     * when indexing a source file. The high level order will be:
     *
     *   -Preprocessor callbacks invocations
     *   -Declaration/reference callbacks invocations
     *   -Diagnostic callback invocations
     *
     * The parameters are the same as #clang_indexSourceFile.
     *
     * \returns If there is a failure from which there is no recovery, returns
     * non-zero, otherwise returns 0.
     */
    public static int clang_indexTranslationUnit(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment client_data, java.lang.foreign.MemorySegment index_callbacks, int index_callbacks_size, int index_options, java.lang.foreign.MemorySegment arg6)
    {
        try {return (int)MTD$clang_indexTranslationUnit.invokeExact(arg1, client_data, index_callbacks, index_callbacks_size, index_options, arg6);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the CXIdxFile, file, line, column, and offset represented by
     * the given CXIdxLoc.
     *
     * If the location refers into a macro expansion, retrieves the
     * location of the macro expansion and if it refers into a macro argument
     * retrieves the location of the argument.
     */
    public static void clang_indexLoc_getFileLocation(jpgen.clang.CXIdxLoc loc, java.lang.foreign.MemorySegment indexFile, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD$clang_indexLoc_getFileLocation.invokeExact(loc.ptr(), indexFile, file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the CXSourceLocation represented by the given CXIdxLoc.
     */
    public static jpgen.clang.CXSourceLocation clang_indexLoc_getCXSourceLocation(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXIdxLoc loc)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_indexLoc_getCXSourceLocation.invokeExact(allocator, loc.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Visit the fields of a particular type.
     *
     * This function visits all the direct fields of the given cursor,
     * invoking the given \p visitor function with the cursors of each
     * visited field. The traversal may be ended prematurely, if
     * the visitor returns \c CXFieldVisit_Break.
     *
     * \param T the record type whose field may be visited.
     *
     * \param visitor the visitor function that will be invoked for each
     * field of \p T.
     *
     * \param client_data pointer data supplied by the client, which will
     * be passed to the visitor each time it is invoked.
     *
     * \returns a non-zero value if the traversal was terminated
     * prematurely by the visitor returning \c CXFieldVisit_Break.
     */
    public static int clang_Type_visitFields(jpgen.clang.CXType T, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment client_data)
    {
        try {return (int)MTD$clang_Type_visitFields.invokeExact(T.ptr(), visitor, client_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the spelling of a given CXBinaryOperatorKind.
     */
    public static jpgen.clang.CXString clang_getBinaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int kind)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getBinaryOperatorKindSpelling.invokeExact(allocator, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the binary operator kind of this cursor.
     *
     * If this cursor is not a binary operator then returns Invalid.
     */
    public static int clang_getCursorBinaryOperatorKind(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorBinaryOperatorKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the spelling of a given CXUnaryOperatorKind.
     */
    public static jpgen.clang.CXString clang_getUnaryOperatorKindSpelling(java.lang.foreign.SegmentAllocator allocator, int kind)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getUnaryOperatorKindSpelling.invokeExact(allocator, kind));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the unary operator kind of this cursor.
     *
     * If this cursor is not a unary operator then returns Invalid.
     */
    public static int clang_getCursorUnaryOperatorKind(jpgen.clang.CXCursor cursor)
    {
        try {return (int)MTD$clang_getCursorUnaryOperatorKind.invokeExact(cursor.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Create CXRewriter.
     */
    public static java.lang.foreign.MemorySegment clang_CXRewriter_create(java.lang.foreign.MemorySegment TU)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_CXRewriter_create.invokeExact(TU);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Insert the specified string at the specified location in the original buffer.
     */
    public static void clang_CXRewriter_insertTextBefore(java.lang.foreign.MemorySegment Rew, jpgen.clang.CXSourceLocation Loc, java.lang.foreign.MemorySegment Insert)
    {
        try {MTD$clang_CXRewriter_insertTextBefore.invokeExact(Rew, Loc.ptr(), Insert);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Replace the specified range of characters in the input with the specified
     * replacement.
     */
    public static void clang_CXRewriter_replaceText(java.lang.foreign.MemorySegment Rew, jpgen.clang.CXSourceRange ToBeReplaced, java.lang.foreign.MemorySegment Replacement)
    {
        try {MTD$clang_CXRewriter_replaceText.invokeExact(Rew, ToBeReplaced.ptr(), Replacement);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Remove the specified range.
     */
    public static void clang_CXRewriter_removeText(java.lang.foreign.MemorySegment Rew, jpgen.clang.CXSourceRange ToBeRemoved)
    {
        try {MTD$clang_CXRewriter_removeText.invokeExact(Rew, ToBeRemoved.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Save all changed files to disk.
     * Returns 1 if any files were not saved successfully, returns 0 otherwise.
     */
    public static int clang_CXRewriter_overwriteChangedFiles(java.lang.foreign.MemorySegment Rew)
    {
        try {return (int)MTD$clang_CXRewriter_overwriteChangedFiles.invokeExact(Rew);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Write out rewritten version of the main file to stdout.
     */
    public static void clang_CXRewriter_writeMainFileToStdOut(java.lang.foreign.MemorySegment Rew)
    {
        try {MTD$clang_CXRewriter_writeMainFileToStdOut.invokeExact(Rew);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given CXRewriter.
     */
    public static void clang_CXRewriter_dispose(java.lang.foreign.MemorySegment Rew)
    {
        try {MTD$clang_CXRewriter_dispose.invokeExact(Rew);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Installs error handler that prints error message to stderr and calls abort().
     * Replaces currently installed error handler (if any).
     */
    public static void clang_install_aborting_llvm_fatal_error_handler()
    {
        try {MTD$clang_install_aborting_llvm_fatal_error_handler.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Removes currently installed error handler (if any).
     * If no error handler is intalled, the default strategy is to print error
     * message to stderr and call exit(1).
     */
    public static void clang_uninstall_llvm_fatal_error_handler()
    {
        try {MTD$clang_uninstall_llvm_fatal_error_handler.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Given a cursor that represents a documentable entity (e.g.,
     * declaration), return the associated parsed comment as a
     * \c CXComment_FullComment AST node.
     */
    public static jpgen.clang.CXComment clang_Cursor_getParsedComment(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor C)
    {
        try {return new jpgen.clang.CXComment((java.lang.foreign.MemorySegment)MTD$clang_Cursor_getParsedComment.invokeExact(allocator, C.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment AST node of any kind.
     *
     * \returns the type of the AST node.
     */
    public static int clang_Comment_getKind(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_Comment_getKind.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment AST node of any kind.
     *
     * \returns number of children of the AST node.
     */
    public static int clang_Comment_getNumChildren(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_Comment_getNumChildren.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment AST node of any kind.
     *
     * \param ChildIdx child index (zero-based).
     *
     * \returns the specified child of the AST node.
     */
    public static jpgen.clang.CXComment clang_Comment_getChild(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment, int ChildIdx)
    {
        try {return new jpgen.clang.CXComment((java.lang.foreign.MemorySegment)MTD$clang_Comment_getChild.invokeExact(allocator, Comment.ptr(), ChildIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * A \c CXComment_Paragraph node is considered whitespace if it contains
     * only \c CXComment_Text nodes that are empty or whitespace.
     *
     * Other AST nodes (except \c CXComment_Paragraph and \c CXComment_Text) are
     * never considered whitespace.
     *
     * \returns non-zero if \c Comment is whitespace.
     */
    public static int clang_Comment_isWhitespace(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_Comment_isWhitespace.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \returns non-zero if \c Comment is inline content and has a newline
     * immediately following it in the comment text.  Newlines between paragraphs
     * do not count.
     */
    public static int clang_InlineContentComment_hasTrailingNewline(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_InlineContentComment_hasTrailingNewline.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_Text AST node.
     *
     * \returns text contained in the AST node.
     */
    public static jpgen.clang.CXString clang_TextComment_getText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_TextComment_getText.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     *
     * \returns name of the inline command.
     */
    public static jpgen.clang.CXString clang_InlineCommandComment_getCommandName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_InlineCommandComment_getCommandName.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     *
     * \returns the most appropriate rendering mode, chosen on command
     * semantics in Doxygen.
     */
    public static int clang_InlineCommandComment_getRenderKind(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_InlineCommandComment_getRenderKind.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     *
     * \returns number of command arguments.
     */
    public static int clang_InlineCommandComment_getNumArgs(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_InlineCommandComment_getNumArgs.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     *
     * \param ArgIdx argument index (zero-based).
     *
     * \returns text of the specified argument.
     */
    public static jpgen.clang.CXString clang_InlineCommandComment_getArgText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment, int ArgIdx)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_InlineCommandComment_getArgText.invokeExact(allocator, Comment.ptr(), ArgIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
     * node.
     *
     * \returns HTML tag name.
     */
    public static jpgen.clang.CXString clang_HTMLTagComment_getTagName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLTagComment_getTagName.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     *
     * \returns non-zero if tag is self-closing (for example, &lt;br /&gt;).
     */
    public static int clang_HTMLStartTagComment_isSelfClosing(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_HTMLStartTagComment_isSelfClosing.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     *
     * \returns number of attributes (name-value pairs) attached to the start tag.
     */
    public static int clang_HTMLStartTag_getNumAttrs(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_HTMLStartTag_getNumAttrs.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     *
     * \param AttrIdx attribute index (zero-based).
     *
     * \returns name of the specified attribute.
     */
    public static jpgen.clang.CXString clang_HTMLStartTag_getAttrName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment, int AttrIdx)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLStartTag_getAttrName.invokeExact(allocator, Comment.ptr(), AttrIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     *
     * \param AttrIdx attribute index (zero-based).
     *
     * \returns value of the specified attribute.
     */
    public static jpgen.clang.CXString clang_HTMLStartTag_getAttrValue(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment, int AttrIdx)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLStartTag_getAttrValue.invokeExact(allocator, Comment.ptr(), AttrIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     *
     * \returns name of the block command.
     */
    public static jpgen.clang.CXString clang_BlockCommandComment_getCommandName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getCommandName.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     *
     * \returns number of word-like arguments.
     */
    public static int clang_BlockCommandComment_getNumArgs(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_BlockCommandComment_getNumArgs.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     *
     * \param ArgIdx argument index (zero-based).
     *
     * \returns text of the specified word-like argument.
     */
    public static jpgen.clang.CXString clang_BlockCommandComment_getArgText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment, int ArgIdx)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getArgText.invokeExact(allocator, Comment.ptr(), ArgIdx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_BlockCommand or
     * \c CXComment_VerbatimBlockCommand AST node.
     *
     * \returns paragraph argument of the block command.
     */
    public static jpgen.clang.CXComment clang_BlockCommandComment_getParagraph(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXComment((java.lang.foreign.MemorySegment)MTD$clang_BlockCommandComment_getParagraph.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     *
     * \returns parameter name.
     */
    public static jpgen.clang.CXString clang_ParamCommandComment_getParamName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_ParamCommandComment_getParamName.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     *
     * \returns non-zero if the parameter that this AST node represents was found
     * in the function prototype and \c clang_ParamCommandComment_getParamIndex
     * function will return a meaningful value.
     */
    public static int clang_ParamCommandComment_isParamIndexValid(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_ParamCommandComment_isParamIndexValid.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     *
     * \returns zero-based parameter index in function prototype.
     */
    public static int clang_ParamCommandComment_getParamIndex(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_ParamCommandComment_getParamIndex.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     *
     * \returns non-zero if parameter passing direction was specified explicitly in
     * the comment.
     */
    public static int clang_ParamCommandComment_isDirectionExplicit(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_ParamCommandComment_isDirectionExplicit.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     *
     * \returns parameter passing direction.
     */
    public static int clang_ParamCommandComment_getDirection(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_ParamCommandComment_getDirection.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     *
     * \returns template parameter name.
     */
    public static jpgen.clang.CXString clang_TParamCommandComment_getParamName(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_TParamCommandComment_getParamName.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     *
     * \returns non-zero if the parameter that this AST node represents was found
     * in the template parameter list and
     * \c clang_TParamCommandComment_getDepth and
     * \c clang_TParamCommandComment_getIndex functions will return a meaningful
     * value.
     */
    public static int clang_TParamCommandComment_isParamPositionValid(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_TParamCommandComment_isParamPositionValid.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     *
     * \returns zero-based nesting depth of this parameter in the template parameter list.
     *
     * For example,
     * \verbatim
     *     template<typename C, template<typename T> class TT>
     *     void test(TT<int> aaa);
     * \endverbatim
     * for C and TT nesting depth is 0,
     * for T nesting depth is 1.
     */
    public static int clang_TParamCommandComment_getDepth(jpgen.clang.CXComment Comment)
    {
        try {return (int)MTD$clang_TParamCommandComment_getDepth.invokeExact(Comment.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     *
     * \returns zero-based parameter index in the template parameter list at a
     * given nesting depth.
     *
     * For example,
     * \verbatim
     *     template<typename C, template<typename T> class TT>
     *     void test(TT<int> aaa);
     * \endverbatim
     * for C and TT nesting depth is 0, so we can ask for index at depth 0:
     * at depth 0 C's index is 0, TT's index is 1.
     *
     * For T nesting depth is 1, so we can ask for index at depth 0 and 1:
     * at depth 0 T's index is 1 (same as TT's),
     * at depth 1 T's index is 0.
     */
    public static int clang_TParamCommandComment_getIndex(jpgen.clang.CXComment Comment, int Depth)
    {
        try {return (int)MTD$clang_TParamCommandComment_getIndex.invokeExact(Comment.ptr(), Depth);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_VerbatimBlockLine AST node.
     *
     * \returns text contained in the AST node.
     */
    public static jpgen.clang.CXString clang_VerbatimBlockLineComment_getText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_VerbatimBlockLineComment_getText.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * \param Comment a \c CXComment_VerbatimLine AST node.
     *
     * \returns text contained in the AST node.
     */
    public static jpgen.clang.CXString clang_VerbatimLineComment_getText(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_VerbatimLineComment_getText.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Convert an HTML tag AST node to string.
     *
     * \param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
     * node.
     *
     * \returns string containing an HTML tag.
     */
    public static jpgen.clang.CXString clang_HTMLTagComment_getAsString(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_HTMLTagComment_getAsString.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Convert a given full parsed comment to an HTML fragment.
     *
     * Specific details of HTML layout are subject to change.  Don't try to parse
     * this HTML back into an AST, use other APIs instead.
     *
     * Currently the following CSS classes are used:
     * \li "para-brief" for \paragraph and equivalent commands;
     * \li "para-returns" for \\returns paragraph and equivalent commands;
     * \li "word-returns" for the "Returns" word in \\returns paragraph.
     *
     * Function argument documentation is rendered as a \<dl\> list with arguments
     * sorted in function prototype order.  CSS classes used:
     * \li "param-name-index-NUMBER" for parameter name (\<dt\>);
     * \li "param-descr-index-NUMBER" for parameter description (\<dd\>);
     * \li "param-name-index-invalid" and "param-descr-index-invalid" are used if
     * parameter index is invalid.
     *
     * Template parameter documentation is rendered as a \<dl\> list with
     * parameters sorted in template parameter list order.  CSS classes used:
     * \li "tparam-name-index-NUMBER" for parameter name (\<dt\>);
     * \li "tparam-descr-index-NUMBER" for parameter description (\<dd\>);
     * \li "tparam-name-index-other" and "tparam-descr-index-other" are used for
     * names inside template template parameters;
     * \li "tparam-name-index-invalid" and "tparam-descr-index-invalid" are used if
     * parameter position is invalid.
     *
     * \param Comment a \c CXComment_FullComment AST node.
     *
     * \returns string containing an HTML fragment.
     */
    public static jpgen.clang.CXString clang_FullComment_getAsHTML(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_FullComment_getAsHTML.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Convert a given full parsed comment to an XML document.
     *
     * A Relax NG schema for the XML can be found in comment-xml-schema.rng file
     * inside clang source tree.
     *
     * \param Comment a \c CXComment_FullComment AST node.
     *
     * \returns string containing an XML document.
     */
    public static jpgen.clang.CXString clang_FullComment_getAsXML(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXComment Comment)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_FullComment_getAsXML.invokeExact(allocator, Comment.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Traverses the translation unit to create a \c CXAPISet.
     *
     * \param tu is the \c CXTranslationUnit to build the \c CXAPISet for.
     *
     * \param out_api is a pointer to the output of this function. It is needs to be
     * disposed of by calling clang_disposeAPISet.
     *
     * \returns Error code indicating success or failure of the APISet creation.
     */
    public static int clang_createAPISet(java.lang.foreign.MemorySegment tu, java.lang.foreign.MemorySegment out_api)
    {
        try {return (int)MTD$clang_createAPISet.invokeExact(tu, out_api);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Dispose of an APISet.
     *
     * The provided \c CXAPISet can not be used after this function is called.
     */
    public static void clang_disposeAPISet(java.lang.foreign.MemorySegment api)
    {
        try {MTD$clang_disposeAPISet.invokeExact(api);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Generate a single symbol symbol graph for the given USR. Returns a null
     * string if the associated symbol can not be found in the provided \c CXAPISet.
     *
     * The output contains the symbol graph as well as some additional information
     * about related symbols.
     *
     * \param usr is a string containing the USR of the symbol to generate the
     * symbol graph for.
     *
     * \param api the \c CXAPISet to look for the symbol in.
     *
     * \returns a string containing the serialized symbol graph representation for
     * the symbol being queried or a null string if it can not be found in the
     * APISet.
     */
    public static jpgen.clang.CXString clang_getSymbolGraphForUSR(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment usr, java.lang.foreign.MemorySegment api)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getSymbolGraphForUSR.invokeExact(allocator, usr, api));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Generate a single symbol symbol graph for the declaration at the given
     * cursor. Returns a null string if the AST node for the cursor isn't a
     * declaration.
     *
     * The output contains the symbol graph as well as some additional information
     * about related symbols.
     *
     * \param cursor the declaration for which to generate the single symbol symbol
     * graph.
     *
     * \returns a string containing the serialized symbol graph representation for
     * the symbol being queried or a null string if it can not be found in the
     * APISet.
     */
    public static jpgen.clang.CXString clang_getSymbolGraphForCursor(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXCursor cursor)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getSymbolGraphForCursor.invokeExact(allocator, cursor.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the character data associated with the given string.
     */
    public static java.lang.foreign.MemorySegment clang_getCString(jpgen.clang.CXString string)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getCString.invokeExact(string.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given string.
     */
    public static void clang_disposeString(jpgen.clang.CXString string)
    {
        try {MTD$clang_disposeString.invokeExact(string.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given string set.
     */
    public static void clang_disposeStringSet(java.lang.foreign.MemorySegment set)
    {
        try {MTD$clang_disposeStringSet.invokeExact(set);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a NULL (invalid) source location.
     */
    public static jpgen.clang.CXSourceLocation clang_getNullLocation(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getNullLocation.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether two source locations, which must refer into
     * the same translation unit, refer to exactly the same point in the source
     * code.
     *
     * \returns non-zero if the source locations refer to the same location, zero
     * if they refer to different locations.
     */
    public static int clang_equalLocations(jpgen.clang.CXSourceLocation loc1, jpgen.clang.CXSourceLocation loc2)
    {
        try {return (int)MTD$clang_equalLocations.invokeExact(loc1.ptr(), loc2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the given source location is in a system header.
     */
    public static int clang_Location_isInSystemHeader(jpgen.clang.CXSourceLocation location)
    {
        try {return (int)MTD$clang_Location_isInSystemHeader.invokeExact(location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the given source location is in the main file of
     * the corresponding translation unit.
     */
    public static int clang_Location_isFromMainFile(jpgen.clang.CXSourceLocation location)
    {
        try {return (int)MTD$clang_Location_isFromMainFile.invokeExact(location.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a NULL (invalid) source range.
     */
    public static jpgen.clang.CXSourceRange clang_getNullRange(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getNullRange.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a source range given the beginning and ending source
     * locations.
     */
    public static jpgen.clang.CXSourceRange clang_getRange(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXSourceLocation begin, jpgen.clang.CXSourceLocation end)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getRange.invokeExact(allocator, begin.ptr(), end.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine whether two ranges are equivalent.
     *
     * \returns non-zero if the ranges are the same, zero if they differ.
     */
    public static int clang_equalRanges(jpgen.clang.CXSourceRange range1, jpgen.clang.CXSourceRange range2)
    {
        try {return (int)MTD$clang_equalRanges.invokeExact(range1.ptr(), range2.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if \p range is null.
     */
    public static int clang_Range_isNull(jpgen.clang.CXSourceRange range)
    {
        try {return (int)MTD$clang_Range_isNull.invokeExact(range.ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     *
     * If the location refers into a macro expansion, retrieves the
     * location of the macro expansion.
     *
     * \param location the location within a source file that will be decomposed
     * into its parts.
     *
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     *
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     *
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     *
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    public static void clang_getExpansionLocation(jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD$clang_getExpansionLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the file, line and column represented by the given source
     * location, as specified in a # line directive.
     *
     * Example: given the following source code in a file somefile.c
     *
     * \code
     * #123 "dummy.c" 1
     *
     * static int func(void)
     * {
     *     return 0;
     * }
     * \endcode
     *
     * the location information returned by this function would be
     *
     * File: dummy.c Line: 124 Column: 12
     *
     * whereas clang_getExpansionLocation would have returned
     *
     * File: somefile.c Line: 3 Column: 12
     *
     * \param location the location within a source file that will be decomposed
     * into its parts.
     *
     * \param filename [out] if non-NULL, will be set to the filename of the
     * source location. Note that filenames returned will be for "virtual" files,
     * which don't necessarily exist on the machine running clang - e.g. when
     * parsing preprocessed output obtained from a different environment. If
     * a non-NULL value is passed in, remember to dispose of the returned value
     * using \c clang_disposeString() once you've finished with it. For an invalid
     * source location, an empty string is returned.
     *
     * \param line [out] if non-NULL, will be set to the line number of the
     * source location. For an invalid source location, zero is returned.
     *
     * \param column [out] if non-NULL, will be set to the column number of the
     * source location. For an invalid source location, zero is returned.
     */
    public static void clang_getPresumedLocation(jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column)
    {
        try {MTD$clang_getPresumedLocation.invokeExact(location.ptr(), filename, line, column);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Legacy API to retrieve the file, line, column, and offset represented
     * by the given source location.
     *
     * This interface has been replaced by the newer interface
     * #clang_getExpansionLocation(). See that interface's documentation for
     * details.
     */
    public static void clang_getInstantiationLocation(jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD$clang_getInstantiationLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     *
     * If the location refers into a macro instantiation, return where the
     * location was originally spelled in the source file.
     *
     * \param location the location within a source file that will be decomposed
     * into its parts.
     *
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     *
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     *
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     *
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    public static void clang_getSpellingLocation(jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD$clang_getSpellingLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     *
     * If the location refers into a macro expansion, return where the macro was
     * expanded or where the macro argument was written, if the location points at
     * a macro argument.
     *
     * \param location the location within a source file that will be decomposed
     * into its parts.
     *
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     *
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     *
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     *
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    public static void clang_getFileLocation(jpgen.clang.CXSourceLocation location, java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment line, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment offset)
    {
        try {MTD$clang_getFileLocation.invokeExact(location.ptr(), file, line, column, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a source location representing the first character within a
     * source range.
     */
    public static jpgen.clang.CXSourceLocation clang_getRangeStart(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXSourceRange range)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getRangeStart.invokeExact(allocator, range.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a source location representing the last character within a
     * source range.
     */
    public static jpgen.clang.CXSourceLocation clang_getRangeEnd(java.lang.foreign.SegmentAllocator allocator, jpgen.clang.CXSourceRange range)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getRangeEnd.invokeExact(allocator, range.ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy the given \c CXSourceRangeList.
     */
    public static void clang_disposeSourceRangeList(java.lang.foreign.MemorySegment ranges)
    {
        try {MTD$clang_disposeSourceRangeList.invokeExact(ranges);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the complete file and path name of the given file.
     */
    public static jpgen.clang.CXString clang_getFileName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment SFile)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getFileName.invokeExact(allocator, SFile));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the last modification time of the given file.
     */
    public static long clang_getFileTime(java.lang.foreign.MemorySegment SFile)
    {
        try {return (long)MTD$clang_getFileTime.invokeExact(SFile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the unique ID for the given \c file.
     *
     * \param file the file to get the ID for.
     * \param outID stores the returned CXFileUniqueID.
     * \returns If there was a failure getting the unique ID, returns non-zero,
     * otherwise returns 0.
     */
    public static int clang_getFileUniqueID(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment outID)
    {
        try {return (int)MTD$clang_getFileUniqueID.invokeExact(file, outID);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns non-zero if the \c file1 and \c file2 point to the same file,
     * or they are both NULL.
     */
    public static int clang_File_isEqual(java.lang.foreign.MemorySegment file1, java.lang.foreign.MemorySegment file2)
    {
        try {return (int)MTD$clang_File_isEqual.invokeExact(file1, file2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Returns the real path name of \c file.
     *
     * An empty string may be returned. Use \c clang_getFileName() in that case.
     */
    public static jpgen.clang.CXString clang_File_tryGetRealPathName(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment file)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_File_tryGetRealPathName.invokeExact(allocator, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of diagnostics in a CXDiagnosticSet.
     */
    public static int clang_getNumDiagnosticsInSet(java.lang.foreign.MemorySegment Diags)
    {
        try {return (int)MTD$clang_getNumDiagnosticsInSet.invokeExact(Diags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a diagnostic associated with the given CXDiagnosticSet.
     *
     * \param Diags the CXDiagnosticSet to query.
     * \param Index the zero-based diagnostic number to retrieve.
     *
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    public static java.lang.foreign.MemorySegment clang_getDiagnosticInSet(java.lang.foreign.MemorySegment Diags, int Index)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticInSet.invokeExact(Diags, Index);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Deserialize a set of diagnostics from a Clang diagnostics bitcode
     * file.
     *
     * \param file The name of the file to deserialize.
     * \param error A pointer to a enum value recording if there was a problem
     *        deserializing the diagnostics.
     * \param errorString A pointer to a CXString for recording the error string
     *        if the file was not successfully loaded.
     *
     * \returns A loaded CXDiagnosticSet if successful, and NULL otherwise.  These
     * diagnostics should be released using clang_disposeDiagnosticSet().
     */
    public static java.lang.foreign.MemorySegment clang_loadDiagnostics(java.lang.foreign.MemorySegment file, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment errorString)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_loadDiagnostics.invokeExact(file, error, errorString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Release a CXDiagnosticSet and all of its contained diagnostics.
     */
    public static void clang_disposeDiagnosticSet(java.lang.foreign.MemorySegment Diags)
    {
        try {MTD$clang_disposeDiagnosticSet.invokeExact(Diags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the child diagnostics of a CXDiagnostic.
     *
     * This CXDiagnosticSet does not need to be released by
     * clang_disposeDiagnosticSet.
     */
    public static java.lang.foreign.MemorySegment clang_getChildDiagnostics(java.lang.foreign.MemorySegment D)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_getChildDiagnostics.invokeExact(D);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Destroy a diagnostic.
     */
    public static void clang_disposeDiagnostic(java.lang.foreign.MemorySegment Diagnostic)
    {
        try {MTD$clang_disposeDiagnostic.invokeExact(Diagnostic);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Format the given diagnostic in a manner that is suitable for display.
     *
     * This routine will format the given diagnostic to a string, rendering
     * the diagnostic according to the various options given. The
     * \c clang_defaultDiagnosticDisplayOptions() function returns the set of
     * options that most closely mimics the behavior of the clang compiler.
     *
     * \param Diagnostic The diagnostic to print.
     *
     * \param Options A set of options that control the diagnostic display,
     * created by combining \c CXDiagnosticDisplayOptions values.
     *
     * \returns A new string containing for formatted diagnostic.
     */
    public static jpgen.clang.CXString clang_formatDiagnostic(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int Options)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_formatDiagnostic.invokeExact(allocator, Diagnostic, Options));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the set of display options most similar to the
     * default behavior of the clang compiler.
     *
     * \returns A set of display options suitable for use with \c
     * clang_formatDiagnostic().
     */
    public static int clang_defaultDiagnosticDisplayOptions()
    {
        try {return (int)MTD$clang_defaultDiagnosticDisplayOptions.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the severity of the given diagnostic.
     */
    public static int clang_getDiagnosticSeverity(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_getDiagnosticSeverity.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the source location of the given diagnostic.
     *
     * This location is where Clang would print the caret ('^') when
     * displaying the diagnostic on the command line.
     */
    public static jpgen.clang.CXSourceLocation clang_getDiagnosticLocation(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXSourceLocation((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticLocation.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the text of the given diagnostic.
     */
    public static jpgen.clang.CXString clang_getDiagnosticSpelling(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticSpelling.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the name of the command-line option that enabled this
     * diagnostic.
     *
     * \param Diag The diagnostic to be queried.
     *
     * \param Disable If non-NULL, will be set to the option that disables this
     * diagnostic (if any).
     *
     * \returns A string that contains the command-line option used to enable this
     * warning, such as "-Wconversion" or "-pedantic".
     */
    public static jpgen.clang.CXString clang_getDiagnosticOption(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diag, java.lang.foreign.MemorySegment Disable)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticOption.invokeExact(allocator, Diag, Disable));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the category number for this diagnostic.
     *
     * Diagnostics can be categorized into groups along with other, related
     * diagnostics (e.g., diagnostics under the same warning flag). This routine
     * retrieves the category number for the given diagnostic.
     *
     * \returns The number of the category that contains this diagnostic, or zero
     * if this diagnostic is uncategorized.
     */
    public static int clang_getDiagnosticCategory(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_getDiagnosticCategory.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the name of a particular diagnostic category.  This
     *  is now deprecated.  Use clang_getDiagnosticCategoryText()
     *  instead.
     *
     * \param Category A diagnostic category number, as returned by
     * \c clang_getDiagnosticCategory().
     *
     * \returns The name of the given diagnostic category.
     */
    public static jpgen.clang.CXString clang_getDiagnosticCategoryName(java.lang.foreign.SegmentAllocator allocator, int Category)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticCategoryName.invokeExact(allocator, Category));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the diagnostic category text for a given diagnostic.
     *
     * \returns The text of the given diagnostic category.
     */
    public static jpgen.clang.CXString clang_getDiagnosticCategoryText(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticCategoryText.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of source ranges associated with the given
     * diagnostic.
     */
    public static int clang_getDiagnosticNumRanges(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_getDiagnosticNumRanges.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve a source range associated with the diagnostic.
     *
     * A diagnostic's source ranges highlight important elements in the source
     * code. On the command line, Clang displays source ranges by
     * underlining them with '~' characters.
     *
     * \param Diagnostic the diagnostic whose range is being extracted.
     *
     * \param Range the zero-based index specifying which range to
     *
     * \returns the requested source range.
     */
    public static jpgen.clang.CXSourceRange clang_getDiagnosticRange(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int Range)
    {
        try {return new jpgen.clang.CXSourceRange((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticRange.invokeExact(allocator, Diagnostic, Range));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Determine the number of fix-it hints associated with the
     * given diagnostic.
     */
    public static int clang_getDiagnosticNumFixIts(java.lang.foreign.MemorySegment Diagnostic)
    {
        try {return (int)MTD$clang_getDiagnosticNumFixIts.invokeExact(Diagnostic);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Retrieve the replacement information for a given fix-it.
     *
     * Fix-its are described in terms of a source range whose contents
     * should be replaced by a string. This approach generalizes over
     * three kinds of operations: removal of source code (the range covers
     * the code to be removed and the replacement string is empty),
     * replacement of source code (the range covers the code to be
     * replaced and the replacement string provides the new code), and
     * insertion (both the start and end of the range point at the
     * insertion location, and the replacement string provides the text to
     * insert).
     *
     * \param Diagnostic The diagnostic whose fix-its are being queried.
     *
     * \param FixIt The zero-based index of the fix-it.
     *
     * \param ReplacementRange The source range whose contents will be
     * replaced with the returned replacement string. Note that source
     * ranges are half-open ranges [a, b), so the source code should be
     * replaced from a and up to (but not including) b.
     *
     * \returns A string containing text that should be replace the source
     * code indicated by the \c ReplacementRange.
     */
    public static jpgen.clang.CXString clang_getDiagnosticFixIt(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment Diagnostic, int FixIt, java.lang.foreign.MemorySegment ReplacementRange)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_getDiagnosticFixIt.invokeExact(allocator, Diagnostic, FixIt, ReplacementRange));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Creates a compilation database from the database found in directory
     * buildDir. For example, CMake can output a compile_commands.json which can
     * be used to build the database.
     *
     * It must be freed by \c clang_CompilationDatabase_dispose.
     */
    public static java.lang.foreign.MemorySegment clang_CompilationDatabase_fromDirectory(java.lang.foreign.MemorySegment BuildDir, java.lang.foreign.MemorySegment ErrorCode)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_fromDirectory.invokeExact(BuildDir, ErrorCode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given compilation database
     */
    public static void clang_CompilationDatabase_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_CompilationDatabase_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Find the compile commands used for a file. The compile commands
     * must be freed by \c clang_CompileCommands_dispose.
     */
    public static java.lang.foreign.MemorySegment clang_CompilationDatabase_getCompileCommands(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment CompleteFileName)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_getCompileCommands.invokeExact(arg1, CompleteFileName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get all the compile commands in the given compilation database.
     */
    public static java.lang.foreign.MemorySegment clang_CompilationDatabase_getAllCompileCommands(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_CompilationDatabase_getAllCompileCommands.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Free the given CompileCommands
     */
    public static void clang_CompileCommands_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_CompileCommands_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the number of CompileCommand we have for a file
     */
    public static int clang_CompileCommands_getSize(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_CompileCommands_getSize.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the I'th CompileCommand for a file
     *
     * Note : 0 <= i < clang_CompileCommands_getSize(CXCompileCommands)
     */
    public static java.lang.foreign.MemorySegment clang_CompileCommands_getCommand(java.lang.foreign.MemorySegment arg1, int I)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_CompileCommands_getCommand.invokeExact(arg1, I);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the working directory where the CompileCommand was executed from
     */
    public static jpgen.clang.CXString clang_CompileCommand_getDirectory(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getDirectory.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the filename associated with the CompileCommand.
     */
    public static jpgen.clang.CXString clang_CompileCommand_getFilename(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getFilename.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the number of arguments in the compiler invocation.
     *
     */
    public static int clang_CompileCommand_getNumArgs(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_CompileCommand_getNumArgs.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the I'th argument value in the compiler invocations
     *
     * Invariant :
     *  - argument 0 is the compiler executable
     */
    public static jpgen.clang.CXString clang_CompileCommand_getArg(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getArg.invokeExact(allocator, arg1, I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the number of source mappings for the compiler invocation.
     */
    public static int clang_CompileCommand_getNumMappedSources(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$clang_CompileCommand_getNumMappedSources.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the I'th mapped source path for the compiler invocation.
     */
    public static jpgen.clang.CXString clang_CompileCommand_getMappedSourcePath(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getMappedSourcePath.invokeExact(allocator, arg1, I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Get the I'th mapped source content for the compiler invocation.
     */
    public static jpgen.clang.CXString clang_CompileCommand_getMappedSourceContent(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, int I)
    {
        try {return new jpgen.clang.CXString((java.lang.foreign.MemorySegment)MTD$clang_CompileCommand_getMappedSourceContent.invokeExact(allocator, arg1, I));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Return the timestamp for use with Clang's
     * \c -fbuild-session-timestamp= option.
     */
    public static long clang_getBuildSessionTimestamp()
    {
        try {return (long)MTD$clang_getBuildSessionTimestamp.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Create a \c CXVirtualFileOverlay object.
     * Must be disposed with \c clang_VirtualFileOverlay_dispose().
     *
     * \param options is reserved, always pass 0.
     */
    public static java.lang.foreign.MemorySegment clang_VirtualFileOverlay_create(int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_VirtualFileOverlay_create.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Map an absolute virtual file path to an absolute real one.
     * The virtual path must be canonicalized (not contain "."/"..").
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_VirtualFileOverlay_addFileMapping(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment virtualPath, java.lang.foreign.MemorySegment realPath)
    {
        try {return (int)MTD$clang_VirtualFileOverlay_addFileMapping.invokeExact(arg1, virtualPath, realPath);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Set the case sensitivity for the \c CXVirtualFileOverlay object.
     * The \c CXVirtualFileOverlay object is case-sensitive by default, this
     * option can be used to override the default.
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_VirtualFileOverlay_setCaseSensitivity(java.lang.foreign.MemorySegment arg1, int caseSensitive)
    {
        try {return (int)MTD$clang_VirtualFileOverlay_setCaseSensitivity.invokeExact(arg1, caseSensitive);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Write out the \c CXVirtualFileOverlay object to a char buffer.
     *
     * \param options is reserved, always pass 0.
     * \param out_buffer_ptr pointer to receive the buffer pointer, which should be
     * disposed using \c clang_free().
     * \param out_buffer_size pointer to receive the buffer size.
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_VirtualFileOverlay_writeToBuffer(java.lang.foreign.MemorySegment arg1, int options, java.lang.foreign.MemorySegment out_buffer_ptr, java.lang.foreign.MemorySegment out_buffer_size)
    {
        try {return (int)MTD$clang_VirtualFileOverlay_writeToBuffer.invokeExact(arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * free memory allocated by libclang, such as the buffer returned by
     * \c CXVirtualFileOverlay() or \c clang_ModuleMapDescriptor_writeToBuffer().
     *
     * \param buffer memory pointer to free.
     */
    public static void clang_free(java.lang.foreign.MemorySegment buffer)
    {
        try {MTD$clang_free.invokeExact(buffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Dispose a \c CXVirtualFileOverlay object.
     */
    public static void clang_VirtualFileOverlay_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_VirtualFileOverlay_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Create a \c CXModuleMapDescriptor object.
     * Must be disposed with \c clang_ModuleMapDescriptor_dispose().
     *
     * \param options is reserved, always pass 0.
     */
    public static java.lang.foreign.MemorySegment clang_ModuleMapDescriptor_create(int options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$clang_ModuleMapDescriptor_create.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Sets the framework module name that the module.modulemap describes.
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD$clang_ModuleMapDescriptor_setFrameworkModuleName.invokeExact(arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Sets the umbrella header name that the module.modulemap describes.
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD$clang_ModuleMapDescriptor_setUmbrellaHeader.invokeExact(arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Write out the \c CXModuleMapDescriptor object to a char buffer.
     *
     * \param options is reserved, always pass 0.
     * \param out_buffer_ptr pointer to receive the buffer pointer, which should be
     * disposed using \c clang_free().
     * \param out_buffer_size pointer to receive the buffer size.
     * \returns 0 for success, non-zero to indicate an error.
     */
    public static int clang_ModuleMapDescriptor_writeToBuffer(java.lang.foreign.MemorySegment arg1, int options, java.lang.foreign.MemorySegment out_buffer_ptr, java.lang.foreign.MemorySegment out_buffer_size)
    {
        try {return (int)MTD$clang_ModuleMapDescriptor_writeToBuffer.invokeExact(arg1, options, out_buffer_ptr, out_buffer_size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
     * Dispose a \c CXModuleMapDescriptor object.
     */
    public static void clang_ModuleMapDescriptor_dispose(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$clang_ModuleMapDescriptor_dispose.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libclang");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$clang_createIndex = gLibLookup.find("clang_createIndex").orElseThrow();
        MTD$clang_createIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createIndex, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_disposeIndex = gLibLookup.find("clang_disposeIndex").orElseThrow();
        MTD$clang_disposeIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeIndex, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_createIndexWithOptions = gLibLookup.find("clang_createIndexWithOptions").orElseThrow();
        MTD$clang_createIndexWithOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createIndexWithOptions, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXIndex_setGlobalOptions = gLibLookup.find("clang_CXIndex_setGlobalOptions").orElseThrow();
        MTD$clang_CXIndex_setGlobalOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXIndex_setGlobalOptions, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_CXIndex_getGlobalOptions = gLibLookup.find("clang_CXIndex_getGlobalOptions").orElseThrow();
        MTD$clang_CXIndex_getGlobalOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXIndex_getGlobalOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXIndex_setInvocationEmissionPathOption = gLibLookup.find("clang_CXIndex_setInvocationEmissionPathOption").orElseThrow();
        MTD$clang_CXIndex_setInvocationEmissionPathOption = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXIndex_setInvocationEmissionPathOption, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_isFileMultipleIncludeGuarded = gLibLookup.find("clang_isFileMultipleIncludeGuarded").orElseThrow();
        MTD$clang_isFileMultipleIncludeGuarded = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isFileMultipleIncludeGuarded, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFile = gLibLookup.find("clang_getFile").orElseThrow();
        MTD$clang_getFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFileContents = gLibLookup.find("clang_getFileContents").orElseThrow();
        MTD$clang_getFileContents = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFileContents, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getLocation = gLibLookup.find("clang_getLocation").orElseThrow();
        MTD$clang_getLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getLocationForOffset = gLibLookup.find("clang_getLocationForOffset").orElseThrow();
        MTD$clang_getLocationForOffset = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getLocationForOffset, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getSkippedRanges = gLibLookup.find("clang_getSkippedRanges").orElseThrow();
        MTD$clang_getSkippedRanges = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getSkippedRanges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getAllSkippedRanges = gLibLookup.find("clang_getAllSkippedRanges").orElseThrow();
        MTD$clang_getAllSkippedRanges = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getAllSkippedRanges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getNumDiagnostics = gLibLookup.find("clang_getNumDiagnostics").orElseThrow();
        MTD$clang_getNumDiagnostics = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumDiagnostics, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnostic = gLibLookup.find("clang_getDiagnostic").orElseThrow();
        MTD$clang_getDiagnostic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnostic, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getDiagnosticSetFromTU = gLibLookup.find("clang_getDiagnosticSetFromTU").orElseThrow();
        MTD$clang_getDiagnosticSetFromTU = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticSetFromTU, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getTranslationUnitSpelling = gLibLookup.find("clang_getTranslationUnitSpelling").orElseThrow();
        MTD$clang_getTranslationUnitSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTranslationUnitSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_createTranslationUnitFromSourceFile = gLibLookup.find("clang_createTranslationUnitFromSourceFile").orElseThrow();
        MTD$clang_createTranslationUnitFromSourceFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createTranslationUnitFromSourceFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_createTranslationUnit = gLibLookup.find("clang_createTranslationUnit").orElseThrow();
        MTD$clang_createTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createTranslationUnit, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_createTranslationUnit2 = gLibLookup.find("clang_createTranslationUnit2").orElseThrow();
        MTD$clang_createTranslationUnit2 = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createTranslationUnit2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_defaultEditingTranslationUnitOptions = gLibLookup.find("clang_defaultEditingTranslationUnitOptions").orElseThrow();
        MTD$clang_defaultEditingTranslationUnitOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_defaultEditingTranslationUnitOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_parseTranslationUnit = gLibLookup.find("clang_parseTranslationUnit").orElseThrow();
        MTD$clang_parseTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_parseTranslationUnit, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_parseTranslationUnit2 = gLibLookup.find("clang_parseTranslationUnit2").orElseThrow();
        MTD$clang_parseTranslationUnit2 = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_parseTranslationUnit2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_parseTranslationUnit2FullArgv = gLibLookup.find("clang_parseTranslationUnit2FullArgv").orElseThrow();
        MTD$clang_parseTranslationUnit2FullArgv = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_parseTranslationUnit2FullArgv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_defaultSaveOptions = gLibLookup.find("clang_defaultSaveOptions").orElseThrow();
        MTD$clang_defaultSaveOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_defaultSaveOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_saveTranslationUnit = gLibLookup.find("clang_saveTranslationUnit").orElseThrow();
        MTD$clang_saveTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_saveTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_suspendTranslationUnit = gLibLookup.find("clang_suspendTranslationUnit").orElseThrow();
        MTD$clang_suspendTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_suspendTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeTranslationUnit = gLibLookup.find("clang_disposeTranslationUnit").orElseThrow();
        MTD$clang_disposeTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeTranslationUnit, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_defaultReparseOptions = gLibLookup.find("clang_defaultReparseOptions").orElseThrow();
        MTD$clang_defaultReparseOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_defaultReparseOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_reparseTranslationUnit = gLibLookup.find("clang_reparseTranslationUnit").orElseThrow();
        MTD$clang_reparseTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_reparseTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getTUResourceUsageName = gLibLookup.find("clang_getTUResourceUsageName").orElseThrow();
        MTD$clang_getTUResourceUsageName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTUResourceUsageName, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCXTUResourceUsage = gLibLookup.find("clang_getCXTUResourceUsage").orElseThrow();
        MTD$clang_getCXTUResourceUsage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCXTUResourceUsage, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXTUResourceUsage.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeCXTUResourceUsage = gLibLookup.find("clang_disposeCXTUResourceUsage").orElseThrow();
        MTD$clang_disposeCXTUResourceUsage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeCXTUResourceUsage, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXTUResourceUsage.gStructLayout));
        MTD_ADDRESS$clang_getTranslationUnitTargetInfo = gLibLookup.find("clang_getTranslationUnitTargetInfo").orElseThrow();
        MTD$clang_getTranslationUnitTargetInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTranslationUnitTargetInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_TargetInfo_dispose = gLibLookup.find("clang_TargetInfo_dispose").orElseThrow();
        MTD$clang_TargetInfo_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TargetInfo_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_TargetInfo_getTriple = gLibLookup.find("clang_TargetInfo_getTriple").orElseThrow();
        MTD$clang_TargetInfo_getTriple = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TargetInfo_getTriple, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_TargetInfo_getPointerWidth = gLibLookup.find("clang_TargetInfo_getPointerWidth").orElseThrow();
        MTD$clang_TargetInfo_getPointerWidth = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TargetInfo_getPointerWidth, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getNullCursor = gLibLookup.find("clang_getNullCursor").orElseThrow();
        MTD$clang_getNullCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNullCursor, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getTranslationUnitCursor = gLibLookup.find("clang_getTranslationUnitCursor").orElseThrow();
        MTD$clang_getTranslationUnitCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTranslationUnitCursor, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_equalCursors = gLibLookup.find("clang_equalCursors").orElseThrow();
        MTD$clang_equalCursors = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_equalCursors, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isNull = gLibLookup.find("clang_Cursor_isNull").orElseThrow();
        MTD$clang_Cursor_isNull = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isNull, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_hashCursor = gLibLookup.find("clang_hashCursor").orElseThrow();
        MTD$clang_hashCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_hashCursor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorKind = gLibLookup.find("clang_getCursorKind").orElseThrow();
        MTD$clang_getCursorKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isDeclaration = gLibLookup.find("clang_isDeclaration").orElseThrow();
        MTD$clang_isDeclaration = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isDeclaration, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isInvalidDeclaration = gLibLookup.find("clang_isInvalidDeclaration").orElseThrow();
        MTD$clang_isInvalidDeclaration = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isInvalidDeclaration, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isReference = gLibLookup.find("clang_isReference").orElseThrow();
        MTD$clang_isReference = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isReference, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isExpression = gLibLookup.find("clang_isExpression").orElseThrow();
        MTD$clang_isExpression = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isExpression, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isStatement = gLibLookup.find("clang_isStatement").orElseThrow();
        MTD$clang_isStatement = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isStatement, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isAttribute = gLibLookup.find("clang_isAttribute").orElseThrow();
        MTD$clang_isAttribute = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isAttribute, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_hasAttrs = gLibLookup.find("clang_Cursor_hasAttrs").orElseThrow();
        MTD$clang_Cursor_hasAttrs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_hasAttrs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isInvalid = gLibLookup.find("clang_isInvalid").orElseThrow();
        MTD$clang_isInvalid = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isInvalid, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isTranslationUnit = gLibLookup.find("clang_isTranslationUnit").orElseThrow();
        MTD$clang_isTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isPreprocessing = gLibLookup.find("clang_isPreprocessing").orElseThrow();
        MTD$clang_isPreprocessing = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isPreprocessing, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isUnexposed = gLibLookup.find("clang_isUnexposed").orElseThrow();
        MTD$clang_isUnexposed = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isUnexposed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCursorLinkage = gLibLookup.find("clang_getCursorLinkage").orElseThrow();
        MTD$clang_getCursorLinkage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorLinkage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorVisibility = gLibLookup.find("clang_getCursorVisibility").orElseThrow();
        MTD$clang_getCursorVisibility = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorVisibility, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorAvailability = gLibLookup.find("clang_getCursorAvailability").orElseThrow();
        MTD$clang_getCursorAvailability = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorPlatformAvailability = gLibLookup.find("clang_getCursorPlatformAvailability").orElseThrow();
        MTD$clang_getCursorPlatformAvailability = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorPlatformAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_disposeCXPlatformAvailability = gLibLookup.find("clang_disposeCXPlatformAvailability").orElseThrow();
        MTD$clang_disposeCXPlatformAvailability = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeCXPlatformAvailability, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Cursor_getVarDeclInitializer = gLibLookup.find("clang_Cursor_getVarDeclInitializer").orElseThrow();
        MTD$clang_Cursor_getVarDeclInitializer = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getVarDeclInitializer, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_hasVarDeclGlobalStorage = gLibLookup.find("clang_Cursor_hasVarDeclGlobalStorage").orElseThrow();
        MTD$clang_Cursor_hasVarDeclGlobalStorage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_hasVarDeclGlobalStorage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_hasVarDeclExternalStorage = gLibLookup.find("clang_Cursor_hasVarDeclExternalStorage").orElseThrow();
        MTD$clang_Cursor_hasVarDeclExternalStorage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_hasVarDeclExternalStorage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorLanguage = gLibLookup.find("clang_getCursorLanguage").orElseThrow();
        MTD$clang_getCursorLanguage = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorLanguage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorTLSKind = gLibLookup.find("clang_getCursorTLSKind").orElseThrow();
        MTD$clang_getCursorTLSKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorTLSKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getTranslationUnit = gLibLookup.find("clang_Cursor_getTranslationUnit").orElseThrow();
        MTD$clang_Cursor_getTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getTranslationUnit, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_createCXCursorSet = gLibLookup.find("clang_createCXCursorSet").orElseThrow();
        MTD$clang_createCXCursorSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createCXCursorSet, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeCXCursorSet = gLibLookup.find("clang_disposeCXCursorSet").orElseThrow();
        MTD$clang_disposeCXCursorSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeCXCursorSet, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXCursorSet_contains = gLibLookup.find("clang_CXCursorSet_contains").orElseThrow();
        MTD$clang_CXCursorSet_contains = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXCursorSet_contains, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXCursorSet_insert = gLibLookup.find("clang_CXCursorSet_insert").orElseThrow();
        MTD$clang_CXCursorSet_insert = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXCursorSet_insert, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorSemanticParent = gLibLookup.find("clang_getCursorSemanticParent").orElseThrow();
        MTD$clang_getCursorSemanticParent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorSemanticParent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorLexicalParent = gLibLookup.find("clang_getCursorLexicalParent").orElseThrow();
        MTD$clang_getCursorLexicalParent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorLexicalParent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getOverriddenCursors = gLibLookup.find("clang_getOverriddenCursors").orElseThrow();
        MTD$clang_getOverriddenCursors = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getOverriddenCursors, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeOverriddenCursors = gLibLookup.find("clang_disposeOverriddenCursors").orElseThrow();
        MTD$clang_disposeOverriddenCursors = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeOverriddenCursors, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getIncludedFile = gLibLookup.find("clang_getIncludedFile").orElseThrow();
        MTD$clang_getIncludedFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getIncludedFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursor = gLibLookup.find("clang_getCursor").orElseThrow();
        MTD$clang_getCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursor, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_getCursorLocation = gLibLookup.find("clang_getCursorLocation").orElseThrow();
        MTD$clang_getCursorLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorExtent = gLibLookup.find("clang_getCursorExtent").orElseThrow();
        MTD$clang_getCursorExtent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorExtent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorType = gLibLookup.find("clang_getCursorType").orElseThrow();
        MTD$clang_getCursorType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getTypeSpelling = gLibLookup.find("clang_getTypeSpelling").orElseThrow();
        MTD$clang_getTypeSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTypeSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getTypedefDeclUnderlyingType = gLibLookup.find("clang_getTypedefDeclUnderlyingType").orElseThrow();
        MTD$clang_getTypedefDeclUnderlyingType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTypedefDeclUnderlyingType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getEnumDeclIntegerType = gLibLookup.find("clang_getEnumDeclIntegerType").orElseThrow();
        MTD$clang_getEnumDeclIntegerType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getEnumDeclIntegerType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getEnumConstantDeclValue = gLibLookup.find("clang_getEnumConstantDeclValue").orElseThrow();
        MTD$clang_getEnumConstantDeclValue = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getEnumConstantDeclValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getEnumConstantDeclUnsignedValue = gLibLookup.find("clang_getEnumConstantDeclUnsignedValue").orElseThrow();
        MTD$clang_getEnumConstantDeclUnsignedValue = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getEnumConstantDeclUnsignedValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isBitField = gLibLookup.find("clang_Cursor_isBitField").orElseThrow();
        MTD$clang_Cursor_isBitField = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isBitField, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getFieldDeclBitWidth = gLibLookup.find("clang_getFieldDeclBitWidth").orElseThrow();
        MTD$clang_getFieldDeclBitWidth = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFieldDeclBitWidth, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getNumArguments = gLibLookup.find("clang_Cursor_getNumArguments").orElseThrow();
        MTD$clang_Cursor_getNumArguments = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getNumArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getArgument = gLibLookup.find("clang_Cursor_getArgument").orElseThrow();
        MTD$clang_Cursor_getArgument = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getArgument, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_getNumTemplateArguments = gLibLookup.find("clang_Cursor_getNumTemplateArguments").orElseThrow();
        MTD$clang_Cursor_getNumTemplateArguments = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getNumTemplateArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getTemplateArgumentKind = gLibLookup.find("clang_Cursor_getTemplateArgumentKind").orElseThrow();
        MTD$clang_Cursor_getTemplateArgumentKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getTemplateArgumentKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_getTemplateArgumentType = gLibLookup.find("clang_Cursor_getTemplateArgumentType").orElseThrow();
        MTD$clang_Cursor_getTemplateArgumentType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getTemplateArgumentType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_getTemplateArgumentValue = gLibLookup.find("clang_Cursor_getTemplateArgumentValue").orElseThrow();
        MTD$clang_Cursor_getTemplateArgumentValue = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getTemplateArgumentValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_getTemplateArgumentUnsignedValue = gLibLookup.find("clang_Cursor_getTemplateArgumentUnsignedValue").orElseThrow();
        MTD$clang_Cursor_getTemplateArgumentUnsignedValue = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getTemplateArgumentUnsignedValue, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_equalTypes = gLibLookup.find("clang_equalTypes").orElseThrow();
        MTD$clang_equalTypes = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_equalTypes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getCanonicalType = gLibLookup.find("clang_getCanonicalType").orElseThrow();
        MTD$clang_getCanonicalType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCanonicalType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_isConstQualifiedType = gLibLookup.find("clang_isConstQualifiedType").orElseThrow();
        MTD$clang_isConstQualifiedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isConstQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isMacroFunctionLike = gLibLookup.find("clang_Cursor_isMacroFunctionLike").orElseThrow();
        MTD$clang_Cursor_isMacroFunctionLike = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isMacroFunctionLike, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isMacroBuiltin = gLibLookup.find("clang_Cursor_isMacroBuiltin").orElseThrow();
        MTD$clang_Cursor_isMacroBuiltin = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isMacroBuiltin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isFunctionInlined = gLibLookup.find("clang_Cursor_isFunctionInlined").orElseThrow();
        MTD$clang_Cursor_isFunctionInlined = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isFunctionInlined, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isVolatileQualifiedType = gLibLookup.find("clang_isVolatileQualifiedType").orElseThrow();
        MTD$clang_isVolatileQualifiedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isVolatileQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_isRestrictQualifiedType = gLibLookup.find("clang_isRestrictQualifiedType").orElseThrow();
        MTD$clang_isRestrictQualifiedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isRestrictQualifiedType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getAddressSpace = gLibLookup.find("clang_getAddressSpace").orElseThrow();
        MTD$clang_getAddressSpace = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getAddressSpace, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getTypedefName = gLibLookup.find("clang_getTypedefName").orElseThrow();
        MTD$clang_getTypedefName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTypedefName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getPointeeType = gLibLookup.find("clang_getPointeeType").orElseThrow();
        MTD$clang_getPointeeType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getPointeeType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getUnqualifiedType = gLibLookup.find("clang_getUnqualifiedType").orElseThrow();
        MTD$clang_getUnqualifiedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getUnqualifiedType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getNonReferenceType = gLibLookup.find("clang_getNonReferenceType").orElseThrow();
        MTD$clang_getNonReferenceType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNonReferenceType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getTypeDeclaration = gLibLookup.find("clang_getTypeDeclaration").orElseThrow();
        MTD$clang_getTypeDeclaration = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTypeDeclaration, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getDeclObjCTypeEncoding = gLibLookup.find("clang_getDeclObjCTypeEncoding").orElseThrow();
        MTD$clang_getDeclObjCTypeEncoding = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDeclObjCTypeEncoding, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Type_getObjCEncoding = gLibLookup.find("clang_Type_getObjCEncoding").orElseThrow();
        MTD$clang_Type_getObjCEncoding = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getObjCEncoding, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getTypeKindSpelling = gLibLookup.find("clang_getTypeKindSpelling").orElseThrow();
        MTD$clang_getTypeKindSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTypeKindSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getFunctionTypeCallingConv = gLibLookup.find("clang_getFunctionTypeCallingConv").orElseThrow();
        MTD$clang_getFunctionTypeCallingConv = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFunctionTypeCallingConv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getResultType = gLibLookup.find("clang_getResultType").orElseThrow();
        MTD$clang_getResultType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getResultType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getExceptionSpecificationType = gLibLookup.find("clang_getExceptionSpecificationType").orElseThrow();
        MTD$clang_getExceptionSpecificationType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getExceptionSpecificationType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getNumArgTypes = gLibLookup.find("clang_getNumArgTypes").orElseThrow();
        MTD$clang_getNumArgTypes = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumArgTypes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getArgType = gLibLookup.find("clang_getArgType").orElseThrow();
        MTD$clang_getArgType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getArgType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Type_getObjCObjectBaseType = gLibLookup.find("clang_Type_getObjCObjectBaseType").orElseThrow();
        MTD$clang_Type_getObjCObjectBaseType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getObjCObjectBaseType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getNumObjCProtocolRefs = gLibLookup.find("clang_Type_getNumObjCProtocolRefs").orElseThrow();
        MTD$clang_Type_getNumObjCProtocolRefs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getNumObjCProtocolRefs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getObjCProtocolDecl = gLibLookup.find("clang_Type_getObjCProtocolDecl").orElseThrow();
        MTD$clang_Type_getObjCProtocolDecl = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getObjCProtocolDecl, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Type_getNumObjCTypeArgs = gLibLookup.find("clang_Type_getNumObjCTypeArgs").orElseThrow();
        MTD$clang_Type_getNumObjCTypeArgs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getNumObjCTypeArgs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getObjCTypeArg = gLibLookup.find("clang_Type_getObjCTypeArg").orElseThrow();
        MTD$clang_Type_getObjCTypeArg = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getObjCTypeArg, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_isFunctionTypeVariadic = gLibLookup.find("clang_isFunctionTypeVariadic").orElseThrow();
        MTD$clang_isFunctionTypeVariadic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isFunctionTypeVariadic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getCursorResultType = gLibLookup.find("clang_getCursorResultType").orElseThrow();
        MTD$clang_getCursorResultType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorResultType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorExceptionSpecificationType = gLibLookup.find("clang_getCursorExceptionSpecificationType").orElseThrow();
        MTD$clang_getCursorExceptionSpecificationType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorExceptionSpecificationType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isPODType = gLibLookup.find("clang_isPODType").orElseThrow();
        MTD$clang_isPODType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isPODType, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getElementType = gLibLookup.find("clang_getElementType").orElseThrow();
        MTD$clang_getElementType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getElementType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getNumElements = gLibLookup.find("clang_getNumElements").orElseThrow();
        MTD$clang_getNumElements = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumElements, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getArrayElementType = gLibLookup.find("clang_getArrayElementType").orElseThrow();
        MTD$clang_getArrayElementType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getArrayElementType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_getArraySize = gLibLookup.find("clang_getArraySize").orElseThrow();
        MTD$clang_getArraySize = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getArraySize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getNamedType = gLibLookup.find("clang_Type_getNamedType").orElseThrow();
        MTD$clang_Type_getNamedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getNamedType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_isTransparentTagTypedef = gLibLookup.find("clang_Type_isTransparentTagTypedef").orElseThrow();
        MTD$clang_Type_isTransparentTagTypedef = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_isTransparentTagTypedef, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getNullability = gLibLookup.find("clang_Type_getNullability").orElseThrow();
        MTD$clang_Type_getNullability = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getNullability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getAlignOf = gLibLookup.find("clang_Type_getAlignOf").orElseThrow();
        MTD$clang_Type_getAlignOf = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getAlignOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getClassType = gLibLookup.find("clang_Type_getClassType").orElseThrow();
        MTD$clang_Type_getClassType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getClassType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getSizeOf = gLibLookup.find("clang_Type_getSizeOf").orElseThrow();
        MTD$clang_Type_getSizeOf = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getSizeOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getOffsetOf = gLibLookup.find("clang_Type_getOffsetOf").orElseThrow();
        MTD$clang_Type_getOffsetOf = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getOffsetOf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXType.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Type_getModifiedType = gLibLookup.find("clang_Type_getModifiedType").orElseThrow();
        MTD$clang_Type_getModifiedType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getModifiedType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getValueType = gLibLookup.find("clang_Type_getValueType").orElseThrow();
        MTD$clang_Type_getValueType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getValueType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getOffsetOfField = gLibLookup.find("clang_Cursor_getOffsetOfField").orElseThrow();
        MTD$clang_Cursor_getOffsetOfField = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getOffsetOfField, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isAnonymous = gLibLookup.find("clang_Cursor_isAnonymous").orElseThrow();
        MTD$clang_Cursor_isAnonymous = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isAnonymous, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isAnonymousRecordDecl = gLibLookup.find("clang_Cursor_isAnonymousRecordDecl").orElseThrow();
        MTD$clang_Cursor_isAnonymousRecordDecl = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isAnonymousRecordDecl, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isInlineNamespace = gLibLookup.find("clang_Cursor_isInlineNamespace").orElseThrow();
        MTD$clang_Cursor_isInlineNamespace = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isInlineNamespace, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Type_getNumTemplateArguments = gLibLookup.find("clang_Type_getNumTemplateArguments").orElseThrow();
        MTD$clang_Type_getNumTemplateArguments = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getNumTemplateArguments, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_Type_getTemplateArgumentAsType = gLibLookup.find("clang_Type_getTemplateArgumentAsType").orElseThrow();
        MTD$clang_Type_getTemplateArgumentAsType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getTemplateArgumentAsType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXType.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Type_getCXXRefQualifier = gLibLookup.find("clang_Type_getCXXRefQualifier").orElseThrow();
        MTD$clang_Type_getCXXRefQualifier = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_getCXXRefQualifier, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout));
        MTD_ADDRESS$clang_isVirtualBase = gLibLookup.find("clang_isVirtualBase").orElseThrow();
        MTD$clang_isVirtualBase = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isVirtualBase, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCXXAccessSpecifier = gLibLookup.find("clang_getCXXAccessSpecifier").orElseThrow();
        MTD$clang_getCXXAccessSpecifier = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCXXAccessSpecifier, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getStorageClass = gLibLookup.find("clang_Cursor_getStorageClass").orElseThrow();
        MTD$clang_Cursor_getStorageClass = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getStorageClass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getNumOverloadedDecls = gLibLookup.find("clang_getNumOverloadedDecls").orElseThrow();
        MTD$clang_getNumOverloadedDecls = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumOverloadedDecls, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getOverloadedDecl = gLibLookup.find("clang_getOverloadedDecl").orElseThrow();
        MTD$clang_getOverloadedDecl = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getOverloadedDecl, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getIBOutletCollectionType = gLibLookup.find("clang_getIBOutletCollectionType").orElseThrow();
        MTD$clang_getIBOutletCollectionType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getIBOutletCollectionType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_visitChildren = gLibLookup.find("clang_visitChildren").orElseThrow();
        MTD$clang_visitChildren = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_visitChildren, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_visitChildrenWithBlock = gLibLookup.find("clang_visitChildrenWithBlock").orElseThrow();
        MTD$clang_visitChildrenWithBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_visitChildrenWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCursorUSR = gLibLookup.find("clang_getCursorUSR").orElseThrow();
        MTD$clang_getCursorUSR = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorUSR, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_constructUSR_ObjCClass = gLibLookup.find("clang_constructUSR_ObjCClass").orElseThrow();
        MTD$clang_constructUSR_ObjCClass = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCClass, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_constructUSR_ObjCCategory = gLibLookup.find("clang_constructUSR_ObjCCategory").orElseThrow();
        MTD$clang_constructUSR_ObjCCategory = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCCategory, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_constructUSR_ObjCProtocol = gLibLookup.find("clang_constructUSR_ObjCProtocol").orElseThrow();
        MTD$clang_constructUSR_ObjCProtocol = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCProtocol, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_constructUSR_ObjCIvar = gLibLookup.find("clang_constructUSR_ObjCIvar").orElseThrow();
        MTD$clang_constructUSR_ObjCIvar = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCIvar, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_constructUSR_ObjCMethod = gLibLookup.find("clang_constructUSR_ObjCMethod").orElseThrow();
        MTD$clang_constructUSR_ObjCMethod = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCMethod, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_constructUSR_ObjCProperty = gLibLookup.find("clang_constructUSR_ObjCProperty").orElseThrow();
        MTD$clang_constructUSR_ObjCProperty = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_constructUSR_ObjCProperty, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_getCursorSpelling = gLibLookup.find("clang_getCursorSpelling").orElseThrow();
        MTD$clang_getCursorSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getSpellingNameRange = gLibLookup.find("clang_Cursor_getSpellingNameRange").orElseThrow();
        MTD$clang_Cursor_getSpellingNameRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getSpellingNameRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_PrintingPolicy_getProperty = gLibLookup.find("clang_PrintingPolicy_getProperty").orElseThrow();
        MTD$clang_PrintingPolicy_getProperty = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_PrintingPolicy_getProperty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_PrintingPolicy_setProperty = gLibLookup.find("clang_PrintingPolicy_setProperty").orElseThrow();
        MTD$clang_PrintingPolicy_setProperty = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_PrintingPolicy_setProperty, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCursorPrintingPolicy = gLibLookup.find("clang_getCursorPrintingPolicy").orElseThrow();
        MTD$clang_getCursorPrintingPolicy = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorPrintingPolicy, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_PrintingPolicy_dispose = gLibLookup.find("clang_PrintingPolicy_dispose").orElseThrow();
        MTD$clang_PrintingPolicy_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_PrintingPolicy_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCursorPrettyPrinted = gLibLookup.find("clang_getCursorPrettyPrinted").orElseThrow();
        MTD$clang_getCursorPrettyPrinted = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorPrettyPrinted, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCursorDisplayName = gLibLookup.find("clang_getCursorDisplayName").orElseThrow();
        MTD$clang_getCursorDisplayName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorDisplayName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorReferenced = gLibLookup.find("clang_getCursorReferenced").orElseThrow();
        MTD$clang_getCursorReferenced = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorReferenced, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorDefinition = gLibLookup.find("clang_getCursorDefinition").orElseThrow();
        MTD$clang_getCursorDefinition = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorDefinition, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_isCursorDefinition = gLibLookup.find("clang_isCursorDefinition").orElseThrow();
        MTD$clang_isCursorDefinition = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_isCursorDefinition, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCanonicalCursor = gLibLookup.find("clang_getCanonicalCursor").orElseThrow();
        MTD$clang_getCanonicalCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCanonicalCursor, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getObjCSelectorIndex = gLibLookup.find("clang_Cursor_getObjCSelectorIndex").orElseThrow();
        MTD$clang_Cursor_getObjCSelectorIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCSelectorIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isDynamicCall = gLibLookup.find("clang_Cursor_isDynamicCall").orElseThrow();
        MTD$clang_Cursor_isDynamicCall = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isDynamicCall, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getReceiverType = gLibLookup.find("clang_Cursor_getReceiverType").orElseThrow();
        MTD$clang_Cursor_getReceiverType = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getReceiverType, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXType.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getObjCPropertyAttributes = gLibLookup.find("clang_Cursor_getObjCPropertyAttributes").orElseThrow();
        MTD$clang_Cursor_getObjCPropertyAttributes = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCPropertyAttributes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Cursor_getObjCPropertyGetterName = gLibLookup.find("clang_Cursor_getObjCPropertyGetterName").orElseThrow();
        MTD$clang_Cursor_getObjCPropertyGetterName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCPropertyGetterName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getObjCPropertySetterName = gLibLookup.find("clang_Cursor_getObjCPropertySetterName").orElseThrow();
        MTD$clang_Cursor_getObjCPropertySetterName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCPropertySetterName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getObjCDeclQualifiers = gLibLookup.find("clang_Cursor_getObjCDeclQualifiers").orElseThrow();
        MTD$clang_Cursor_getObjCDeclQualifiers = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCDeclQualifiers, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isObjCOptional = gLibLookup.find("clang_Cursor_isObjCOptional").orElseThrow();
        MTD$clang_Cursor_isObjCOptional = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isObjCOptional, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isVariadic = gLibLookup.find("clang_Cursor_isVariadic").orElseThrow();
        MTD$clang_Cursor_isVariadic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isVariadic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_isExternalSymbol = gLibLookup.find("clang_Cursor_isExternalSymbol").orElseThrow();
        MTD$clang_Cursor_isExternalSymbol = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_isExternalSymbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Cursor_getCommentRange = gLibLookup.find("clang_Cursor_getCommentRange").orElseThrow();
        MTD$clang_Cursor_getCommentRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getCommentRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getRawCommentText = gLibLookup.find("clang_Cursor_getRawCommentText").orElseThrow();
        MTD$clang_Cursor_getRawCommentText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getRawCommentText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getBriefCommentText = gLibLookup.find("clang_Cursor_getBriefCommentText").orElseThrow();
        MTD$clang_Cursor_getBriefCommentText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getBriefCommentText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getMangling = gLibLookup.find("clang_Cursor_getMangling").orElseThrow();
        MTD$clang_Cursor_getMangling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getMangling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getCXXManglings = gLibLookup.find("clang_Cursor_getCXXManglings").orElseThrow();
        MTD$clang_Cursor_getCXXManglings = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getCXXManglings, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getObjCManglings = gLibLookup.find("clang_Cursor_getObjCManglings").orElseThrow();
        MTD$clang_Cursor_getObjCManglings = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getObjCManglings, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Cursor_getModule = gLibLookup.find("clang_Cursor_getModule").orElseThrow();
        MTD$clang_Cursor_getModule = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getModule, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getModuleForFile = gLibLookup.find("clang_getModuleForFile").orElseThrow();
        MTD$clang_getModuleForFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getModuleForFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getASTFile = gLibLookup.find("clang_Module_getASTFile").orElseThrow();
        MTD$clang_Module_getASTFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getASTFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getParent = gLibLookup.find("clang_Module_getParent").orElseThrow();
        MTD$clang_Module_getParent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getParent, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getName = gLibLookup.find("clang_Module_getName").orElseThrow();
        MTD$clang_Module_getName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getFullName = gLibLookup.find("clang_Module_getFullName").orElseThrow();
        MTD$clang_Module_getFullName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getFullName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_isSystem = gLibLookup.find("clang_Module_isSystem").orElseThrow();
        MTD$clang_Module_isSystem = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_isSystem, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getNumTopLevelHeaders = gLibLookup.find("clang_Module_getNumTopLevelHeaders").orElseThrow();
        MTD$clang_Module_getNumTopLevelHeaders = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getNumTopLevelHeaders, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Module_getTopLevelHeader = gLibLookup.find("clang_Module_getTopLevelHeader").orElseThrow();
        MTD$clang_Module_getTopLevelHeader = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Module_getTopLevelHeader, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_CXXConstructor_isConvertingConstructor = gLibLookup.find("clang_CXXConstructor_isConvertingConstructor").orElseThrow();
        MTD$clang_CXXConstructor_isConvertingConstructor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXConstructor_isConvertingConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXConstructor_isCopyConstructor = gLibLookup.find("clang_CXXConstructor_isCopyConstructor").orElseThrow();
        MTD$clang_CXXConstructor_isCopyConstructor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXConstructor_isCopyConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXConstructor_isDefaultConstructor = gLibLookup.find("clang_CXXConstructor_isDefaultConstructor").orElseThrow();
        MTD$clang_CXXConstructor_isDefaultConstructor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXConstructor_isDefaultConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXConstructor_isMoveConstructor = gLibLookup.find("clang_CXXConstructor_isMoveConstructor").orElseThrow();
        MTD$clang_CXXConstructor_isMoveConstructor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXConstructor_isMoveConstructor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXField_isMutable = gLibLookup.find("clang_CXXField_isMutable").orElseThrow();
        MTD$clang_CXXField_isMutable = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXField_isMutable, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isDefaulted = gLibLookup.find("clang_CXXMethod_isDefaulted").orElseThrow();
        MTD$clang_CXXMethod_isDefaulted = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isDefaulted, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isDeleted = gLibLookup.find("clang_CXXMethod_isDeleted").orElseThrow();
        MTD$clang_CXXMethod_isDeleted = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isDeleted, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isPureVirtual = gLibLookup.find("clang_CXXMethod_isPureVirtual").orElseThrow();
        MTD$clang_CXXMethod_isPureVirtual = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isPureVirtual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isStatic = gLibLookup.find("clang_CXXMethod_isStatic").orElseThrow();
        MTD$clang_CXXMethod_isStatic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isStatic, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isVirtual = gLibLookup.find("clang_CXXMethod_isVirtual").orElseThrow();
        MTD$clang_CXXMethod_isVirtual = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isVirtual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isCopyAssignmentOperator = gLibLookup.find("clang_CXXMethod_isCopyAssignmentOperator").orElseThrow();
        MTD$clang_CXXMethod_isCopyAssignmentOperator = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isCopyAssignmentOperator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isMoveAssignmentOperator = gLibLookup.find("clang_CXXMethod_isMoveAssignmentOperator").orElseThrow();
        MTD$clang_CXXMethod_isMoveAssignmentOperator = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isMoveAssignmentOperator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isExplicit = gLibLookup.find("clang_CXXMethod_isExplicit").orElseThrow();
        MTD$clang_CXXMethod_isExplicit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isExplicit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXRecord_isAbstract = gLibLookup.find("clang_CXXRecord_isAbstract").orElseThrow();
        MTD$clang_CXXRecord_isAbstract = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXRecord_isAbstract, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_EnumDecl_isScoped = gLibLookup.find("clang_EnumDecl_isScoped").orElseThrow();
        MTD$clang_EnumDecl_isScoped = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EnumDecl_isScoped, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXXMethod_isConst = gLibLookup.find("clang_CXXMethod_isConst").orElseThrow();
        MTD$clang_CXXMethod_isConst = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXXMethod_isConst, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getTemplateCursorKind = gLibLookup.find("clang_getTemplateCursorKind").orElseThrow();
        MTD$clang_getTemplateCursorKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTemplateCursorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getSpecializedCursorTemplate = gLibLookup.find("clang_getSpecializedCursorTemplate").orElseThrow();
        MTD$clang_getSpecializedCursorTemplate = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getSpecializedCursorTemplate, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXCursor.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCursorReferenceNameRange = gLibLookup.find("clang_getCursorReferenceNameRange").orElseThrow();
        MTD$clang_getCursorReferenceNameRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorReferenceNameRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXCursor.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getToken = gLibLookup.find("clang_getToken").orElseThrow();
        MTD$clang_getToken = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getToken, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_getTokenKind = gLibLookup.find("clang_getTokenKind").orElseThrow();
        MTD$clang_getTokenKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTokenKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXToken.gStructLayout));
        MTD_ADDRESS$clang_getTokenSpelling = gLibLookup.find("clang_getTokenSpelling").orElseThrow();
        MTD$clang_getTokenSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTokenSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXToken.gStructLayout));
        MTD_ADDRESS$clang_getTokenLocation = gLibLookup.find("clang_getTokenLocation").orElseThrow();
        MTD$clang_getTokenLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTokenLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXToken.gStructLayout));
        MTD_ADDRESS$clang_getTokenExtent = gLibLookup.find("clang_getTokenExtent").orElseThrow();
        MTD$clang_getTokenExtent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getTokenExtent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXToken.gStructLayout));
        MTD_ADDRESS$clang_tokenize = gLibLookup.find("clang_tokenize").orElseThrow();
        MTD$clang_tokenize = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_tokenize, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceRange.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_annotateTokens = gLibLookup.find("clang_annotateTokens").orElseThrow();
        MTD$clang_annotateTokens = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_annotateTokens, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeTokens = gLibLookup.find("clang_disposeTokens").orElseThrow();
        MTD$clang_disposeTokens = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeTokens, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCursorKindSpelling = gLibLookup.find("clang_getCursorKindSpelling").orElseThrow();
        MTD$clang_getCursorKindSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorKindSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getDefinitionSpellingAndExtent = gLibLookup.find("clang_getDefinitionSpellingAndExtent").orElseThrow();
        MTD$clang_getDefinitionSpellingAndExtent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDefinitionSpellingAndExtent, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_enableStackTraces = gLibLookup.find("clang_enableStackTraces").orElseThrow();
        MTD$clang_enableStackTraces = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_enableStackTraces, java.lang.foreign.FunctionDescriptor.ofVoid());
        MTD_ADDRESS$clang_executeOnThread = gLibLookup.find("clang_executeOnThread").orElseThrow();
        MTD$clang_executeOnThread = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_executeOnThread, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCompletionChunkKind = gLibLookup.find("clang_getCompletionChunkKind").orElseThrow();
        MTD$clang_getCompletionChunkKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionChunkKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCompletionChunkText = gLibLookup.find("clang_getCompletionChunkText").orElseThrow();
        MTD$clang_getCompletionChunkText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionChunkText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCompletionChunkCompletionString = gLibLookup.find("clang_getCompletionChunkCompletionString").orElseThrow();
        MTD$clang_getCompletionChunkCompletionString = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionChunkCompletionString, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getNumCompletionChunks = gLibLookup.find("clang_getNumCompletionChunks").orElseThrow();
        MTD$clang_getNumCompletionChunks = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumCompletionChunks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCompletionPriority = gLibLookup.find("clang_getCompletionPriority").orElseThrow();
        MTD$clang_getCompletionPriority = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionPriority, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCompletionAvailability = gLibLookup.find("clang_getCompletionAvailability").orElseThrow();
        MTD$clang_getCompletionAvailability = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionAvailability, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCompletionNumAnnotations = gLibLookup.find("clang_getCompletionNumAnnotations").orElseThrow();
        MTD$clang_getCompletionNumAnnotations = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionNumAnnotations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCompletionAnnotation = gLibLookup.find("clang_getCompletionAnnotation").orElseThrow();
        MTD$clang_getCompletionAnnotation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionAnnotation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCompletionParent = gLibLookup.find("clang_getCompletionParent").orElseThrow();
        MTD$clang_getCompletionParent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionParent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCompletionBriefComment = gLibLookup.find("clang_getCompletionBriefComment").orElseThrow();
        MTD$clang_getCompletionBriefComment = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionBriefComment, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getCursorCompletionString = gLibLookup.find("clang_getCursorCompletionString").orElseThrow();
        MTD$clang_getCursorCompletionString = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorCompletionString, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCompletionNumFixIts = gLibLookup.find("clang_getCompletionNumFixIts").orElseThrow();
        MTD$clang_getCompletionNumFixIts = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionNumFixIts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCompletionFixIt = gLibLookup.find("clang_getCompletionFixIt").orElseThrow();
        MTD$clang_getCompletionFixIt = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCompletionFixIt, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_defaultCodeCompleteOptions = gLibLookup.find("clang_defaultCodeCompleteOptions").orElseThrow();
        MTD$clang_defaultCodeCompleteOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_defaultCodeCompleteOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_codeCompleteAt = gLibLookup.find("clang_codeCompleteAt").orElseThrow();
        MTD$clang_codeCompleteAt = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteAt, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_sortCodeCompletionResults = gLibLookup.find("clang_sortCodeCompletionResults").orElseThrow();
        MTD$clang_sortCodeCompletionResults = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_sortCodeCompletionResults, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_disposeCodeCompleteResults = gLibLookup.find("clang_disposeCodeCompleteResults").orElseThrow();
        MTD$clang_disposeCodeCompleteResults = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeCodeCompleteResults, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_codeCompleteGetNumDiagnostics = gLibLookup.find("clang_codeCompleteGetNumDiagnostics").orElseThrow();
        MTD$clang_codeCompleteGetNumDiagnostics = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetNumDiagnostics, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_codeCompleteGetDiagnostic = gLibLookup.find("clang_codeCompleteGetDiagnostic").orElseThrow();
        MTD$clang_codeCompleteGetDiagnostic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetDiagnostic, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_codeCompleteGetContexts = gLibLookup.find("clang_codeCompleteGetContexts").orElseThrow();
        MTD$clang_codeCompleteGetContexts = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetContexts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_codeCompleteGetContainerKind = gLibLookup.find("clang_codeCompleteGetContainerKind").orElseThrow();
        MTD$clang_codeCompleteGetContainerKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetContainerKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_codeCompleteGetContainerUSR = gLibLookup.find("clang_codeCompleteGetContainerUSR").orElseThrow();
        MTD$clang_codeCompleteGetContainerUSR = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetContainerUSR, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_codeCompleteGetObjCSelector = gLibLookup.find("clang_codeCompleteGetObjCSelector").orElseThrow();
        MTD$clang_codeCompleteGetObjCSelector = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_codeCompleteGetObjCSelector, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getClangVersion = gLibLookup.find("clang_getClangVersion").orElseThrow();
        MTD$clang_getClangVersion = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getClangVersion, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_toggleCrashRecovery = gLibLookup.find("clang_toggleCrashRecovery").orElseThrow();
        MTD$clang_toggleCrashRecovery = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_toggleCrashRecovery, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getInclusions = gLibLookup.find("clang_getInclusions").orElseThrow();
        MTD$clang_getInclusions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getInclusions, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_Cursor_Evaluate = gLibLookup.find("clang_Cursor_Evaluate").orElseThrow();
        MTD$clang_Cursor_Evaluate = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_Evaluate, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_EvalResult_getKind = gLibLookup.find("clang_EvalResult_getKind").orElseThrow();
        MTD$clang_EvalResult_getKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_getAsInt = gLibLookup.find("clang_EvalResult_getAsInt").orElseThrow();
        MTD$clang_EvalResult_getAsInt = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getAsInt, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_getAsLongLong = gLibLookup.find("clang_EvalResult_getAsLongLong").orElseThrow();
        MTD$clang_EvalResult_getAsLongLong = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getAsLongLong, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_isUnsignedInt = gLibLookup.find("clang_EvalResult_isUnsignedInt").orElseThrow();
        MTD$clang_EvalResult_isUnsignedInt = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_isUnsignedInt, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_getAsUnsigned = gLibLookup.find("clang_EvalResult_getAsUnsigned").orElseThrow();
        MTD$clang_EvalResult_getAsUnsigned = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getAsUnsigned, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_getAsDouble = gLibLookup.find("clang_EvalResult_getAsDouble").orElseThrow();
        MTD$clang_EvalResult_getAsDouble = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getAsDouble, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_getAsStr = gLibLookup.find("clang_EvalResult_getAsStr").orElseThrow();
        MTD$clang_EvalResult_getAsStr = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_getAsStr, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_EvalResult_dispose = gLibLookup.find("clang_EvalResult_dispose").orElseThrow();
        MTD$clang_EvalResult_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_EvalResult_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getRemappings = gLibLookup.find("clang_getRemappings").orElseThrow();
        MTD$clang_getRemappings = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getRemappings, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getRemappingsFromFileList = gLibLookup.find("clang_getRemappingsFromFileList").orElseThrow();
        MTD$clang_getRemappingsFromFileList = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getRemappingsFromFileList, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_remap_getNumFiles = gLibLookup.find("clang_remap_getNumFiles").orElseThrow();
        MTD$clang_remap_getNumFiles = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_remap_getNumFiles, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_remap_getFilenames = gLibLookup.find("clang_remap_getFilenames").orElseThrow();
        MTD$clang_remap_getFilenames = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_remap_getFilenames, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_remap_dispose = gLibLookup.find("clang_remap_dispose").orElseThrow();
        MTD$clang_remap_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_remap_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_findReferencesInFile = gLibLookup.find("clang_findReferencesInFile").orElseThrow();
        MTD$clang_findReferencesInFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_findReferencesInFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursorAndRangeVisitor.gStructLayout));
        MTD_ADDRESS$clang_findIncludesInFile = gLibLookup.find("clang_findIncludesInFile").orElseThrow();
        MTD$clang_findIncludesInFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_findIncludesInFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXCursorAndRangeVisitor.gStructLayout));
        MTD_ADDRESS$clang_findReferencesInFileWithBlock = gLibLookup.find("clang_findReferencesInFileWithBlock").orElseThrow();
        MTD$clang_findReferencesInFileWithBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_findReferencesInFileWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_findIncludesInFileWithBlock = gLibLookup.find("clang_findIncludesInFileWithBlock").orElseThrow();
        MTD$clang_findIncludesInFileWithBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_findIncludesInFileWithBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_isEntityObjCContainerKind = gLibLookup.find("clang_index_isEntityObjCContainerKind").orElseThrow();
        MTD$clang_index_isEntityObjCContainerKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_isEntityObjCContainerKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_index_getObjCContainerDeclInfo = gLibLookup.find("clang_index_getObjCContainerDeclInfo").orElseThrow();
        MTD$clang_index_getObjCContainerDeclInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getObjCContainerDeclInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getObjCInterfaceDeclInfo = gLibLookup.find("clang_index_getObjCInterfaceDeclInfo").orElseThrow();
        MTD$clang_index_getObjCInterfaceDeclInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getObjCInterfaceDeclInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getObjCCategoryDeclInfo = gLibLookup.find("clang_index_getObjCCategoryDeclInfo").orElseThrow();
        MTD$clang_index_getObjCCategoryDeclInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getObjCCategoryDeclInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getObjCProtocolRefListInfo = gLibLookup.find("clang_index_getObjCProtocolRefListInfo").orElseThrow();
        MTD$clang_index_getObjCProtocolRefListInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getObjCProtocolRefListInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getObjCPropertyDeclInfo = gLibLookup.find("clang_index_getObjCPropertyDeclInfo").orElseThrow();
        MTD$clang_index_getObjCPropertyDeclInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getObjCPropertyDeclInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getIBOutletCollectionAttrInfo = gLibLookup.find("clang_index_getIBOutletCollectionAttrInfo").orElseThrow();
        MTD$clang_index_getIBOutletCollectionAttrInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getIBOutletCollectionAttrInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getCXXClassDeclInfo = gLibLookup.find("clang_index_getCXXClassDeclInfo").orElseThrow();
        MTD$clang_index_getCXXClassDeclInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getCXXClassDeclInfo, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getClientContainer = gLibLookup.find("clang_index_getClientContainer").orElseThrow();
        MTD$clang_index_getClientContainer = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getClientContainer, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_setClientContainer = gLibLookup.find("clang_index_setClientContainer").orElseThrow();
        MTD$clang_index_setClientContainer = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_setClientContainer, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_getClientEntity = gLibLookup.find("clang_index_getClientEntity").orElseThrow();
        MTD$clang_index_getClientEntity = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_getClientEntity, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_index_setClientEntity = gLibLookup.find("clang_index_setClientEntity").orElseThrow();
        MTD$clang_index_setClientEntity = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_index_setClientEntity, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_IndexAction_create = gLibLookup.find("clang_IndexAction_create").orElseThrow();
        MTD$clang_IndexAction_create = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_IndexAction_create, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_IndexAction_dispose = gLibLookup.find("clang_IndexAction_dispose").orElseThrow();
        MTD$clang_IndexAction_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_IndexAction_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_indexSourceFile = gLibLookup.find("clang_indexSourceFile").orElseThrow();
        MTD$clang_indexSourceFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_indexSourceFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_indexSourceFileFullArgv = gLibLookup.find("clang_indexSourceFileFullArgv").orElseThrow();
        MTD$clang_indexSourceFileFullArgv = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_indexSourceFileFullArgv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_indexTranslationUnit = gLibLookup.find("clang_indexTranslationUnit").orElseThrow();
        MTD$clang_indexTranslationUnit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_indexTranslationUnit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_indexLoc_getFileLocation = gLibLookup.find("clang_indexLoc_getFileLocation").orElseThrow();
        MTD$clang_indexLoc_getFileLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_indexLoc_getFileLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXIdxLoc.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_indexLoc_getCXSourceLocation = gLibLookup.find("clang_indexLoc_getCXSourceLocation").orElseThrow();
        MTD$clang_indexLoc_getCXSourceLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_indexLoc_getCXSourceLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXIdxLoc.gStructLayout));
        MTD_ADDRESS$clang_Type_visitFields = gLibLookup.find("clang_Type_visitFields").orElseThrow();
        MTD$clang_Type_visitFields = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Type_visitFields, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXType.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getBinaryOperatorKindSpelling = gLibLookup.find("clang_getBinaryOperatorKindSpelling").orElseThrow();
        MTD$clang_getBinaryOperatorKindSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getBinaryOperatorKindSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCursorBinaryOperatorKind = gLibLookup.find("clang_getCursorBinaryOperatorKind").orElseThrow();
        MTD$clang_getCursorBinaryOperatorKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorBinaryOperatorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getUnaryOperatorKindSpelling = gLibLookup.find("clang_getUnaryOperatorKindSpelling").orElseThrow();
        MTD$clang_getUnaryOperatorKindSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getUnaryOperatorKindSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getCursorUnaryOperatorKind = gLibLookup.find("clang_getCursorUnaryOperatorKind").orElseThrow();
        MTD$clang_getCursorUnaryOperatorKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCursorUnaryOperatorKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_CXRewriter_create = gLibLookup.find("clang_CXRewriter_create").orElseThrow();
        MTD$clang_CXRewriter_create = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_create, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXRewriter_insertTextBefore = gLibLookup.find("clang_CXRewriter_insertTextBefore").orElseThrow();
        MTD$clang_CXRewriter_insertTextBefore = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_insertTextBefore, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXRewriter_replaceText = gLibLookup.find("clang_CXRewriter_replaceText").orElseThrow();
        MTD$clang_CXRewriter_replaceText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_replaceText, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceRange.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXRewriter_removeText = gLibLookup.find("clang_CXRewriter_removeText").orElseThrow();
        MTD$clang_CXRewriter_removeText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_removeText, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_CXRewriter_overwriteChangedFiles = gLibLookup.find("clang_CXRewriter_overwriteChangedFiles").orElseThrow();
        MTD$clang_CXRewriter_overwriteChangedFiles = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_overwriteChangedFiles, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXRewriter_writeMainFileToStdOut = gLibLookup.find("clang_CXRewriter_writeMainFileToStdOut").orElseThrow();
        MTD$clang_CXRewriter_writeMainFileToStdOut = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_writeMainFileToStdOut, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CXRewriter_dispose = gLibLookup.find("clang_CXRewriter_dispose").orElseThrow();
        MTD$clang_CXRewriter_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CXRewriter_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_install_aborting_llvm_fatal_error_handler = gLibLookup.find("clang_install_aborting_llvm_fatal_error_handler").orElseThrow();
        MTD$clang_install_aborting_llvm_fatal_error_handler = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_install_aborting_llvm_fatal_error_handler, java.lang.foreign.FunctionDescriptor.ofVoid());
        MTD_ADDRESS$clang_uninstall_llvm_fatal_error_handler = gLibLookup.find("clang_uninstall_llvm_fatal_error_handler").orElseThrow();
        MTD$clang_uninstall_llvm_fatal_error_handler = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_uninstall_llvm_fatal_error_handler, java.lang.foreign.FunctionDescriptor.ofVoid());
        MTD_ADDRESS$clang_Cursor_getParsedComment = gLibLookup.find("clang_Cursor_getParsedComment").orElseThrow();
        MTD$clang_Cursor_getParsedComment = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Cursor_getParsedComment, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXComment.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_Comment_getKind = gLibLookup.find("clang_Comment_getKind").orElseThrow();
        MTD$clang_Comment_getKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Comment_getKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_Comment_getNumChildren = gLibLookup.find("clang_Comment_getNumChildren").orElseThrow();
        MTD$clang_Comment_getNumChildren = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Comment_getNumChildren, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_Comment_getChild = gLibLookup.find("clang_Comment_getChild").orElseThrow();
        MTD$clang_Comment_getChild = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Comment_getChild, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXComment.gStructLayout, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_Comment_isWhitespace = gLibLookup.find("clang_Comment_isWhitespace").orElseThrow();
        MTD$clang_Comment_isWhitespace = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Comment_isWhitespace, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_InlineContentComment_hasTrailingNewline = gLibLookup.find("clang_InlineContentComment_hasTrailingNewline").orElseThrow();
        MTD$clang_InlineContentComment_hasTrailingNewline = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_InlineContentComment_hasTrailingNewline, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_TextComment_getText = gLibLookup.find("clang_TextComment_getText").orElseThrow();
        MTD$clang_TextComment_getText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TextComment_getText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_InlineCommandComment_getCommandName = gLibLookup.find("clang_InlineCommandComment_getCommandName").orElseThrow();
        MTD$clang_InlineCommandComment_getCommandName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_InlineCommandComment_getCommandName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_InlineCommandComment_getRenderKind = gLibLookup.find("clang_InlineCommandComment_getRenderKind").orElseThrow();
        MTD$clang_InlineCommandComment_getRenderKind = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_InlineCommandComment_getRenderKind, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_InlineCommandComment_getNumArgs = gLibLookup.find("clang_InlineCommandComment_getNumArgs").orElseThrow();
        MTD$clang_InlineCommandComment_getNumArgs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_InlineCommandComment_getNumArgs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_InlineCommandComment_getArgText = gLibLookup.find("clang_InlineCommandComment_getArgText").orElseThrow();
        MTD$clang_InlineCommandComment_getArgText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_InlineCommandComment_getArgText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_HTMLTagComment_getTagName = gLibLookup.find("clang_HTMLTagComment_getTagName").orElseThrow();
        MTD$clang_HTMLTagComment_getTagName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLTagComment_getTagName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_HTMLStartTagComment_isSelfClosing = gLibLookup.find("clang_HTMLStartTagComment_isSelfClosing").orElseThrow();
        MTD$clang_HTMLStartTagComment_isSelfClosing = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLStartTagComment_isSelfClosing, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_HTMLStartTag_getNumAttrs = gLibLookup.find("clang_HTMLStartTag_getNumAttrs").orElseThrow();
        MTD$clang_HTMLStartTag_getNumAttrs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLStartTag_getNumAttrs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_HTMLStartTag_getAttrName = gLibLookup.find("clang_HTMLStartTag_getAttrName").orElseThrow();
        MTD$clang_HTMLStartTag_getAttrName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLStartTag_getAttrName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_HTMLStartTag_getAttrValue = gLibLookup.find("clang_HTMLStartTag_getAttrValue").orElseThrow();
        MTD$clang_HTMLStartTag_getAttrValue = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLStartTag_getAttrValue, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_BlockCommandComment_getCommandName = gLibLookup.find("clang_BlockCommandComment_getCommandName").orElseThrow();
        MTD$clang_BlockCommandComment_getCommandName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_BlockCommandComment_getCommandName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_BlockCommandComment_getNumArgs = gLibLookup.find("clang_BlockCommandComment_getNumArgs").orElseThrow();
        MTD$clang_BlockCommandComment_getNumArgs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_BlockCommandComment_getNumArgs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_BlockCommandComment_getArgText = gLibLookup.find("clang_BlockCommandComment_getArgText").orElseThrow();
        MTD$clang_BlockCommandComment_getArgText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_BlockCommandComment_getArgText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_BlockCommandComment_getParagraph = gLibLookup.find("clang_BlockCommandComment_getParagraph").orElseThrow();
        MTD$clang_BlockCommandComment_getParagraph = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_BlockCommandComment_getParagraph, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXComment.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_ParamCommandComment_getParamName = gLibLookup.find("clang_ParamCommandComment_getParamName").orElseThrow();
        MTD$clang_ParamCommandComment_getParamName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ParamCommandComment_getParamName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_ParamCommandComment_isParamIndexValid = gLibLookup.find("clang_ParamCommandComment_isParamIndexValid").orElseThrow();
        MTD$clang_ParamCommandComment_isParamIndexValid = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ParamCommandComment_isParamIndexValid, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_ParamCommandComment_getParamIndex = gLibLookup.find("clang_ParamCommandComment_getParamIndex").orElseThrow();
        MTD$clang_ParamCommandComment_getParamIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ParamCommandComment_getParamIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_ParamCommandComment_isDirectionExplicit = gLibLookup.find("clang_ParamCommandComment_isDirectionExplicit").orElseThrow();
        MTD$clang_ParamCommandComment_isDirectionExplicit = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ParamCommandComment_isDirectionExplicit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_ParamCommandComment_getDirection = gLibLookup.find("clang_ParamCommandComment_getDirection").orElseThrow();
        MTD$clang_ParamCommandComment_getDirection = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ParamCommandComment_getDirection, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_TParamCommandComment_getParamName = gLibLookup.find("clang_TParamCommandComment_getParamName").orElseThrow();
        MTD$clang_TParamCommandComment_getParamName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TParamCommandComment_getParamName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_TParamCommandComment_isParamPositionValid = gLibLookup.find("clang_TParamCommandComment_isParamPositionValid").orElseThrow();
        MTD$clang_TParamCommandComment_isParamPositionValid = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TParamCommandComment_isParamPositionValid, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_TParamCommandComment_getDepth = gLibLookup.find("clang_TParamCommandComment_getDepth").orElseThrow();
        MTD$clang_TParamCommandComment_getDepth = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TParamCommandComment_getDepth, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_TParamCommandComment_getIndex = gLibLookup.find("clang_TParamCommandComment_getIndex").orElseThrow();
        MTD$clang_TParamCommandComment_getIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_TParamCommandComment_getIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXComment.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_VerbatimBlockLineComment_getText = gLibLookup.find("clang_VerbatimBlockLineComment_getText").orElseThrow();
        MTD$clang_VerbatimBlockLineComment_getText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VerbatimBlockLineComment_getText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_VerbatimLineComment_getText = gLibLookup.find("clang_VerbatimLineComment_getText").orElseThrow();
        MTD$clang_VerbatimLineComment_getText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VerbatimLineComment_getText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_HTMLTagComment_getAsString = gLibLookup.find("clang_HTMLTagComment_getAsString").orElseThrow();
        MTD$clang_HTMLTagComment_getAsString = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_HTMLTagComment_getAsString, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_FullComment_getAsHTML = gLibLookup.find("clang_FullComment_getAsHTML").orElseThrow();
        MTD$clang_FullComment_getAsHTML = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_FullComment_getAsHTML, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_FullComment_getAsXML = gLibLookup.find("clang_FullComment_getAsXML").orElseThrow();
        MTD$clang_FullComment_getAsXML = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_FullComment_getAsXML, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXComment.gStructLayout));
        MTD_ADDRESS$clang_createAPISet = gLibLookup.find("clang_createAPISet").orElseThrow();
        MTD$clang_createAPISet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_createAPISet, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeAPISet = gLibLookup.find("clang_disposeAPISet").orElseThrow();
        MTD$clang_disposeAPISet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeAPISet, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getSymbolGraphForUSR = gLibLookup.find("clang_getSymbolGraphForUSR").orElseThrow();
        MTD$clang_getSymbolGraphForUSR = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getSymbolGraphForUSR, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getSymbolGraphForCursor = gLibLookup.find("clang_getSymbolGraphForCursor").orElseThrow();
        MTD$clang_getSymbolGraphForCursor = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getSymbolGraphForCursor, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.clang.CXCursor.gStructLayout));
        MTD_ADDRESS$clang_getCString = gLibLookup.find("clang_getCString").orElseThrow();
        MTD$clang_getCString = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getCString, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_disposeString = gLibLookup.find("clang_disposeString").orElseThrow();
        MTD$clang_disposeString = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXString.gStructLayout));
        MTD_ADDRESS$clang_disposeStringSet = gLibLookup.find("clang_disposeStringSet").orElseThrow();
        MTD$clang_disposeStringSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeStringSet, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getNullLocation = gLibLookup.find("clang_getNullLocation").orElseThrow();
        MTD$clang_getNullLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNullLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_equalLocations = gLibLookup.find("clang_equalLocations").orElseThrow();
        MTD$clang_equalLocations = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_equalLocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_Location_isInSystemHeader = gLibLookup.find("clang_Location_isInSystemHeader").orElseThrow();
        MTD$clang_Location_isInSystemHeader = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Location_isInSystemHeader, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_Location_isFromMainFile = gLibLookup.find("clang_Location_isFromMainFile").orElseThrow();
        MTD$clang_Location_isFromMainFile = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Location_isFromMainFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_getNullRange = gLibLookup.find("clang_getNullRange").orElseThrow();
        MTD$clang_getNullRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNullRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_getRange = gLibLookup.find("clang_getRange").orElseThrow();
        MTD$clang_getRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXSourceLocation.gStructLayout));
        MTD_ADDRESS$clang_equalRanges = gLibLookup.find("clang_equalRanges").orElseThrow();
        MTD$clang_equalRanges = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_equalRanges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXSourceRange.gStructLayout, jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_Range_isNull = gLibLookup.find("clang_Range_isNull").orElseThrow();
        MTD$clang_Range_isNull = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_Range_isNull, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_getExpansionLocation = gLibLookup.find("clang_getExpansionLocation").orElseThrow();
        MTD$clang_getExpansionLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getExpansionLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getPresumedLocation = gLibLookup.find("clang_getPresumedLocation").orElseThrow();
        MTD$clang_getPresumedLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getPresumedLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getInstantiationLocation = gLibLookup.find("clang_getInstantiationLocation").orElseThrow();
        MTD$clang_getInstantiationLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getInstantiationLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getSpellingLocation = gLibLookup.find("clang_getSpellingLocation").orElseThrow();
        MTD$clang_getSpellingLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getSpellingLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFileLocation = gLibLookup.find("clang_getFileLocation").orElseThrow();
        MTD$clang_getFileLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFileLocation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getRangeStart = gLibLookup.find("clang_getRangeStart").orElseThrow();
        MTD$clang_getRangeStart = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getRangeStart, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_getRangeEnd = gLibLookup.find("clang_getRangeEnd").orElseThrow();
        MTD$clang_getRangeEnd = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getRangeEnd, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.clang.CXSourceRange.gStructLayout));
        MTD_ADDRESS$clang_disposeSourceRangeList = gLibLookup.find("clang_disposeSourceRangeList").orElseThrow();
        MTD$clang_disposeSourceRangeList = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeSourceRangeList, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFileName = gLibLookup.find("clang_getFileName").orElseThrow();
        MTD$clang_getFileName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFileName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFileTime = gLibLookup.find("clang_getFileTime").orElseThrow();
        MTD$clang_getFileTime = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFileTime, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getFileUniqueID = gLibLookup.find("clang_getFileUniqueID").orElseThrow();
        MTD$clang_getFileUniqueID = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getFileUniqueID, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_File_isEqual = gLibLookup.find("clang_File_isEqual").orElseThrow();
        MTD$clang_File_isEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_File_isEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_File_tryGetRealPathName = gLibLookup.find("clang_File_tryGetRealPathName").orElseThrow();
        MTD$clang_File_tryGetRealPathName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_File_tryGetRealPathName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getNumDiagnosticsInSet = gLibLookup.find("clang_getNumDiagnosticsInSet").orElseThrow();
        MTD$clang_getNumDiagnosticsInSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getNumDiagnosticsInSet, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticInSet = gLibLookup.find("clang_getDiagnosticInSet").orElseThrow();
        MTD$clang_getDiagnosticInSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticInSet, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_loadDiagnostics = gLibLookup.find("clang_loadDiagnostics").orElseThrow();
        MTD$clang_loadDiagnostics = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_loadDiagnostics, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeDiagnosticSet = gLibLookup.find("clang_disposeDiagnosticSet").orElseThrow();
        MTD$clang_disposeDiagnosticSet = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeDiagnosticSet, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getChildDiagnostics = gLibLookup.find("clang_getChildDiagnostics").orElseThrow();
        MTD$clang_getChildDiagnostics = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getChildDiagnostics, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_disposeDiagnostic = gLibLookup.find("clang_disposeDiagnostic").orElseThrow();
        MTD$clang_disposeDiagnostic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_disposeDiagnostic, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_formatDiagnostic = gLibLookup.find("clang_formatDiagnostic").orElseThrow();
        MTD$clang_formatDiagnostic = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_formatDiagnostic, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_defaultDiagnosticDisplayOptions = gLibLookup.find("clang_defaultDiagnosticDisplayOptions").orElseThrow();
        MTD$clang_defaultDiagnosticDisplayOptions = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_defaultDiagnosticDisplayOptions, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getDiagnosticSeverity = gLibLookup.find("clang_getDiagnosticSeverity").orElseThrow();
        MTD$clang_getDiagnosticSeverity = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticSeverity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticLocation = gLibLookup.find("clang_getDiagnosticLocation").orElseThrow();
        MTD$clang_getDiagnosticLocation = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticLocation, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceLocation.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticSpelling = gLibLookup.find("clang_getDiagnosticSpelling").orElseThrow();
        MTD$clang_getDiagnosticSpelling = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticSpelling, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticOption = gLibLookup.find("clang_getDiagnosticOption").orElseThrow();
        MTD$clang_getDiagnosticOption = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticOption, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticCategory = gLibLookup.find("clang_getDiagnosticCategory").orElseThrow();
        MTD$clang_getDiagnosticCategory = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticCategory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticCategoryName = gLibLookup.find("clang_getDiagnosticCategoryName").orElseThrow();
        MTD$clang_getDiagnosticCategoryName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticCategoryName, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getDiagnosticCategoryText = gLibLookup.find("clang_getDiagnosticCategoryText").orElseThrow();
        MTD$clang_getDiagnosticCategoryText = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticCategoryText, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticNumRanges = gLibLookup.find("clang_getDiagnosticNumRanges").orElseThrow();
        MTD$clang_getDiagnosticNumRanges = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticNumRanges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticRange = gLibLookup.find("clang_getDiagnosticRange").orElseThrow();
        MTD$clang_getDiagnosticRange = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticRange, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXSourceRange.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getDiagnosticNumFixIts = gLibLookup.find("clang_getDiagnosticNumFixIts").orElseThrow();
        MTD$clang_getDiagnosticNumFixIts = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticNumFixIts, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_getDiagnosticFixIt = gLibLookup.find("clang_getDiagnosticFixIt").orElseThrow();
        MTD$clang_getDiagnosticFixIt = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getDiagnosticFixIt, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompilationDatabase_fromDirectory = gLibLookup.find("clang_CompilationDatabase_fromDirectory").orElseThrow();
        MTD$clang_CompilationDatabase_fromDirectory = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompilationDatabase_fromDirectory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompilationDatabase_dispose = gLibLookup.find("clang_CompilationDatabase_dispose").orElseThrow();
        MTD$clang_CompilationDatabase_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompilationDatabase_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompilationDatabase_getCompileCommands = gLibLookup.find("clang_CompilationDatabase_getCompileCommands").orElseThrow();
        MTD$clang_CompilationDatabase_getCompileCommands = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompilationDatabase_getCompileCommands, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompilationDatabase_getAllCompileCommands = gLibLookup.find("clang_CompilationDatabase_getAllCompileCommands").orElseThrow();
        MTD$clang_CompilationDatabase_getAllCompileCommands = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompilationDatabase_getAllCompileCommands, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommands_dispose = gLibLookup.find("clang_CompileCommands_dispose").orElseThrow();
        MTD$clang_CompileCommands_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommands_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommands_getSize = gLibLookup.find("clang_CompileCommands_getSize").orElseThrow();
        MTD$clang_CompileCommands_getSize = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommands_getSize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommands_getCommand = gLibLookup.find("clang_CompileCommands_getCommand").orElseThrow();
        MTD$clang_CompileCommands_getCommand = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommands_getCommand, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_CompileCommand_getDirectory = gLibLookup.find("clang_CompileCommand_getDirectory").orElseThrow();
        MTD$clang_CompileCommand_getDirectory = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getDirectory, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommand_getFilename = gLibLookup.find("clang_CompileCommand_getFilename").orElseThrow();
        MTD$clang_CompileCommand_getFilename = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getFilename, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommand_getNumArgs = gLibLookup.find("clang_CompileCommand_getNumArgs").orElseThrow();
        MTD$clang_CompileCommand_getNumArgs = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getNumArgs, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommand_getArg = gLibLookup.find("clang_CompileCommand_getArg").orElseThrow();
        MTD$clang_CompileCommand_getArg = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getArg, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_CompileCommand_getNumMappedSources = gLibLookup.find("clang_CompileCommand_getNumMappedSources").orElseThrow();
        MTD$clang_CompileCommand_getNumMappedSources = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getNumMappedSources, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_CompileCommand_getMappedSourcePath = gLibLookup.find("clang_CompileCommand_getMappedSourcePath").orElseThrow();
        MTD$clang_CompileCommand_getMappedSourcePath = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getMappedSourcePath, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_CompileCommand_getMappedSourceContent = gLibLookup.find("clang_CompileCommand_getMappedSourceContent").orElseThrow();
        MTD$clang_CompileCommand_getMappedSourceContent = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_CompileCommand_getMappedSourceContent, java.lang.foreign.FunctionDescriptor.of(jpgen.clang.CXString.gStructLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_getBuildSessionTimestamp = gLibLookup.find("clang_getBuildSessionTimestamp").orElseThrow();
        MTD$clang_getBuildSessionTimestamp = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_getBuildSessionTimestamp, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$clang_VirtualFileOverlay_create = gLibLookup.find("clang_VirtualFileOverlay_create").orElseThrow();
        MTD$clang_VirtualFileOverlay_create = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VirtualFileOverlay_create, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_VirtualFileOverlay_addFileMapping = gLibLookup.find("clang_VirtualFileOverlay_addFileMapping").orElseThrow();
        MTD$clang_VirtualFileOverlay_addFileMapping = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VirtualFileOverlay_addFileMapping, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_VirtualFileOverlay_setCaseSensitivity = gLibLookup.find("clang_VirtualFileOverlay_setCaseSensitivity").orElseThrow();
        MTD$clang_VirtualFileOverlay_setCaseSensitivity = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VirtualFileOverlay_setCaseSensitivity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_VirtualFileOverlay_writeToBuffer = gLibLookup.find("clang_VirtualFileOverlay_writeToBuffer").orElseThrow();
        MTD$clang_VirtualFileOverlay_writeToBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VirtualFileOverlay_writeToBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_free = gLibLookup.find("clang_free").orElseThrow();
        MTD$clang_free = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_VirtualFileOverlay_dispose = gLibLookup.find("clang_VirtualFileOverlay_dispose").orElseThrow();
        MTD$clang_VirtualFileOverlay_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_VirtualFileOverlay_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_ModuleMapDescriptor_create = gLibLookup.find("clang_ModuleMapDescriptor_create").orElseThrow();
        MTD$clang_ModuleMapDescriptor_create = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ModuleMapDescriptor_create, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$clang_ModuleMapDescriptor_setFrameworkModuleName = gLibLookup.find("clang_ModuleMapDescriptor_setFrameworkModuleName").orElseThrow();
        MTD$clang_ModuleMapDescriptor_setFrameworkModuleName = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ModuleMapDescriptor_setFrameworkModuleName, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_ModuleMapDescriptor_setUmbrellaHeader = gLibLookup.find("clang_ModuleMapDescriptor_setUmbrellaHeader").orElseThrow();
        MTD$clang_ModuleMapDescriptor_setUmbrellaHeader = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ModuleMapDescriptor_setUmbrellaHeader, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_ModuleMapDescriptor_writeToBuffer = gLibLookup.find("clang_ModuleMapDescriptor_writeToBuffer").orElseThrow();
        MTD$clang_ModuleMapDescriptor_writeToBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ModuleMapDescriptor_writeToBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS$clang_ModuleMapDescriptor_dispose = gLibLookup.find("clang_ModuleMapDescriptor_dispose").orElseThrow();
        MTD$clang_ModuleMapDescriptor_dispose = gSystemLinker.downcallHandle(MTD_ADDRESS$clang_ModuleMapDescriptor_dispose, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
    }
}
