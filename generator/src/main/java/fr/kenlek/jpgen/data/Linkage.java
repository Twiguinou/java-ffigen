package fr.kenlek.jpgen.data;

import static fr.kenlek.jpgen.clang.CXLinkageKind.CXLinkage_Internal;

public enum Linkage
{
    INTERNAL,
    EXTERNAL;

    public static Linkage map(int linkageKind)
    {
        return linkageKind == CXLinkage_Internal ? INTERNAL : EXTERNAL;
    }
}
