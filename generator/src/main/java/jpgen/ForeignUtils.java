package jpgen;

import jpgen.clang.CXString;
import jpgen.clang.CXType;

import java.lang.foreign.SegmentAllocator;

import static jpgen.clang.Index_h.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static String retrieveString(CXString string)
    {
        final String res = clang_getCString(string).getUtf8String(0);
        clang_disposeString(string);
        return res;
    }

    public static String typeDeclarationUSR(SegmentAllocator allocator, CXType type)
    {
        return retrieveString(clang_getCursorUSR(allocator, clang_getTypeDeclaration(allocator, type)));
    }
}
