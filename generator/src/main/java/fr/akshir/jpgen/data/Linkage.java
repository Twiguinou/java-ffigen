package fr.akshir.jpgen.data;

import fr.akshir.jpgen.clang.CXLinkageKind;

public enum Linkage
{
    INTERNAL,
    EXTERNAL;

    public static Linkage map(int linkageKind)
    {
        return linkageKind == CXLinkageKind.CXLinkage_Internal ? INTERNAL : EXTERNAL;
    }
}
