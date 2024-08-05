package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.clang.CXLinkageKind;

public enum Linkage
{
    INTERNAL,
    EXTERNAL;

    public static Linkage map(int linkageKind)
    {
        return linkageKind == CXLinkageKind.CXLinkage_Internal ? INTERNAL : EXTERNAL;
    }
}
