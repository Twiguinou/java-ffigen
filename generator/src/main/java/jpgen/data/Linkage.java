package jpgen.data;

import static jpgen.clang.CXLinkageKind.*;

public enum Linkage
{
    INTERNAL,
    EXTERNAL;

    public static Linkage map(int linkageKind)
    {
        return linkageKind == CXLinkage_Internal ? INTERNAL : EXTERNAL;
    }
}
