package jpgen.clang;

public final class CXCommentKind
{private CXCommentKind() {}

	public static final int CXComment_Null = 0;
	public static final int CXComment_Text = 1;
	public static final int CXComment_InlineCommand = 2;
	public static final int CXComment_HTMLStartTag = 3;
	public static final int CXComment_HTMLEndTag = 4;
	public static final int CXComment_Paragraph = 5;
	public static final int CXComment_BlockCommand = 6;
	public static final int CXComment_ParamCommand = 7;
	public static final int CXComment_TParamCommand = 8;
	public static final int CXComment_VerbatimBlockCommand = 9;
	public static final int CXComment_VerbatimBlockLine = 10;
	public static final int CXComment_VerbatimLine = 11;
	public static final int CXComment_FullComment = 12;
}
