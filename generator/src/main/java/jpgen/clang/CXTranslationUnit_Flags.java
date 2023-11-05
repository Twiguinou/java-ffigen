package jpgen.clang;

public final class CXTranslationUnit_Flags
{private CXTranslationUnit_Flags() {}

	public static final int CXTranslationUnit_None = 0;
	public static final int CXTranslationUnit_DetailedPreprocessingRecord = 1;
	public static final int CXTranslationUnit_Incomplete = 2;
	public static final int CXTranslationUnit_PrecompiledPreamble = 4;
	public static final int CXTranslationUnit_CacheCompletionResults = 8;
	public static final int CXTranslationUnit_ForSerialization = 16;
	public static final int CXTranslationUnit_CXXChainedPCH = 32;
	public static final int CXTranslationUnit_SkipFunctionBodies = 64;
	public static final int CXTranslationUnit_IncludeBriefCommentsInCodeCompletion = 128;
	public static final int CXTranslationUnit_CreatePreambleOnFirstParse = 256;
	public static final int CXTranslationUnit_KeepGoing = 512;
	public static final int CXTranslationUnit_SingleFileParse = 1024;
	public static final int CXTranslationUnit_LimitSkipFunctionBodiesToPreamble = 2048;
	public static final int CXTranslationUnit_IncludeAttributedTypes = 4096;
	public static final int CXTranslationUnit_VisitImplicitAttributes = 8192;
	public static final int CXTranslationUnit_IgnoreNonErrorsFromIncludedFiles = 16384;
	public static final int CXTranslationUnit_RetainExcludedConditionalBlocks = 32768;
}
