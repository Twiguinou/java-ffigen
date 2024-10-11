/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public final class Layouts
{private Layouts() {}

    public static final java.lang.foreign.SequenceLayout ARRAY_2__PTR = java.lang.foreign.MemoryLayout.sequenceLayout(2, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxLoc", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(ARRAY_2__PTR.withName("ptr_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("int_data"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxIncludedFileInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxIncludedFileInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("hashLoc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("filename")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("file")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isImport")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isAngled")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isModuleImport"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXUnsavedFile = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXUnsavedFile", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Filename")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Contents")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_LONG.withName("Length"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXType = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXType", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(ARRAY_2__PTR.withName("data"))
    ));
    public static final java.lang.foreign.SequenceLayout ARRAY_3__PTR = java.lang.foreign.MemoryLayout.sequenceLayout(3, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCursor", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("xdata")),
            new fr.kenlek.jpgen.Member.Field(ARRAY_3__PTR.withName("data"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCProtocolRefInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCProtocolRefInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocol")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXCursorAndRangeVisitor = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCursorAndRangeVisitor", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("context")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("visit"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXVersion", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Major")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Minor")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Subminor"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsage = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXTUResourceUsage", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numEntries")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entries"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXSourceRangeList", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("count")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ranges"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCProtocolRefListInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCProtocolRefListInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numProtocols"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxContainerInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxContainerInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$IndexerCallbacks = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("IndexerCallbacks", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("abortQuery")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("diagnostic")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("enteredMainFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ppIncludedFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("importedASTFile")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("startedTranslationUnit")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexDeclaration")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("indexEntityReference"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entityInfo")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("semanticContainer")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("lexicalContainer")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isRedeclaration")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isDefinition")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isContainer")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declAsContainer")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attributes")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("flags"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXTUResourceUsageEntry = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXTUResourceUsageEntry", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_LONG.withName("amount"))
    ));
    public static final java.lang.foreign.SequenceLayout ARRAY_4__INT_32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXToken = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXToken", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(ARRAY_4__INT_32.withName("int_data")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ptr_data"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXString = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXString", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("private_flags"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxEntityInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxEntityInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("templateKind")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("lang")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("name")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("USR")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attributes")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numAttributes"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXSourceLocation", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(ARRAY_2__PTR.withName("ptr_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("int_data"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXStringSet", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Strings")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Count"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCInterfaceDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCInterfaceDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("containerInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("superInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCContainerDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCContainerDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declInfo")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxImportedASTFileInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxImportedASTFileInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("file")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("module")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("isImplicit"))
    ));
    public static final java.lang.foreign.SequenceLayout ARRAY_3__INT_64 = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_LONG);
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXFileUniqueID", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(ARRAY_3__INT_64.withName("data"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxBaseClassInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxBaseClassInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("base")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxIBOutletCollectionAttrInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxIBOutletCollectionAttrInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("attrInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("objcClass")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("classCursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("classLoc"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCCategoryDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCCategoryDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("containerInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("objcClass")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("classCursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("classLoc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxEntityRefInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxEntityRefInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("referencedEntity")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("parentEntity")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("container")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("role"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxCXXClassDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxCXXClassDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("bases")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("numBases"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxAttrInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxAttrInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("kind")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXCursor.layout.withName("cursor")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxLoc.layout.withName("loc"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXCompletionResult = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCompletionResult", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("CursorKind")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("CompletionString"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXIdxObjCPropertyDeclInfo = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIdxObjCPropertyDeclInfo", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("declInfo")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("getter")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("setter"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCodeCompleteResults", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Results")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("NumResults"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXPlatformAvailability", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.withName("Platform")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.withName("Introduced")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.withName("Deprecated")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.withName("Obsoleted")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Unavailable")),
            new fr.kenlek.jpgen.Member.Field(RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.withName("Message"))
    ));
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRange = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXSourceRange", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(ARRAY_2__PTR.withName("ptr_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("begin_int_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("end_int_data"))
    ));
}
