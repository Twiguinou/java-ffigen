package jpgen.clang;

public final class CXEvalResultKind
{private CXEvalResultKind() {}

	public static final int CXEval_Int = 1;
	public static final int CXEval_Float = 2;
	public static final int CXEval_ObjCStrLiteral = 3;
	public static final int CXEval_StrLiteral = 4;
	public static final int CXEval_CFStr = 5;
	public static final int CXEval_Other = 6;
	public static final int CXEval_UnExposed = 0;
}
