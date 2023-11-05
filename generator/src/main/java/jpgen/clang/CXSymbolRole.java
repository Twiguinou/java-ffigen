package jpgen.clang;

public final class CXSymbolRole
{private CXSymbolRole() {}

	public static final int CXSymbolRole_None = 0;
	public static final int CXSymbolRole_Declaration = 1;
	public static final int CXSymbolRole_Definition = 2;
	public static final int CXSymbolRole_Reference = 4;
	public static final int CXSymbolRole_Read = 8;
	public static final int CXSymbolRole_Write = 16;
	public static final int CXSymbolRole_Call = 32;
	public static final int CXSymbolRole_Dynamic = 64;
	public static final int CXSymbolRole_AddressOf = 128;
	public static final int CXSymbolRole_Implicit = 256;
}
