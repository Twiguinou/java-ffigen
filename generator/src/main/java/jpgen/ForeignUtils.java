package jpgen;

import jpgen.clang.CXString;

import static jpgen.clang.Index_h.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static String retrieveString(CXString string)
    {
        final String res = clang_getCString(string).getUtf8String(0);
        clang_disposeString(string);
        return res;
    }
}
