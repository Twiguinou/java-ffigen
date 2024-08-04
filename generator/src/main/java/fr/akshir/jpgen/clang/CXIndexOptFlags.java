package fr.akshir.jpgen.clang;

public final class CXIndexOptFlags
{private CXIndexOptFlags() {}

    public static final int CXIndexOpt_None = 0;
    public static final int CXIndexOpt_SuppressRedundantRefs = 1;
    public static final int CXIndexOpt_IndexFunctionLocalSymbols = 2;
    public static final int CXIndexOpt_IndexImplicitTemplateInstantiations = 4;
    public static final int CXIndexOpt_SuppressWarnings = 8;
    public static final int CXIndexOpt_SkipParsedBodiesInSession = 16;
}
