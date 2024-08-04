package fr.akshir.jpgen.clang;

public final class CXCompletionContext
{private CXCompletionContext() {}

    public static final int CXCompletionContext_Unexposed = 0;
    public static final int CXCompletionContext_AnyType = 1;
    public static final int CXCompletionContext_AnyValue = 2;
    public static final int CXCompletionContext_ObjCObjectValue = 4;
    public static final int CXCompletionContext_ObjCSelectorValue = 8;
    public static final int CXCompletionContext_CXXClassTypeValue = 16;
    public static final int CXCompletionContext_DotMemberAccess = 32;
    public static final int CXCompletionContext_ArrowMemberAccess = 64;
    public static final int CXCompletionContext_ObjCPropertyAccess = 128;
    public static final int CXCompletionContext_EnumTag = 256;
    public static final int CXCompletionContext_UnionTag = 512;
    public static final int CXCompletionContext_StructTag = 1024;
    public static final int CXCompletionContext_ClassTag = 2048;
    public static final int CXCompletionContext_Namespace = 4096;
    public static final int CXCompletionContext_NestedNameSpecifier = 8192;
    public static final int CXCompletionContext_ObjCInterface = 16384;
    public static final int CXCompletionContext_ObjCProtocol = 32768;
    public static final int CXCompletionContext_ObjCCategory = 65536;
    public static final int CXCompletionContext_ObjCInstanceMessage = 131072;
    public static final int CXCompletionContext_ObjCClassMessage = 262144;
    public static final int CXCompletionContext_ObjCSelectorName = 524288;
    public static final int CXCompletionContext_MacroName = 1048576;
    public static final int CXCompletionContext_NaturalLanguage = 2097152;
    public static final int CXCompletionContext_IncludedFile = 4194304;
    public static final int CXCompletionContext_Unknown = 8388607;
}
