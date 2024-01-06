package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXString;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXLanguageKind.*;
import static jpgen.clang.CXLinkageKind.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static String retrieveString(CXString string)
    {
        final String res = clang_getCString(string).getUtf8String(0);
        clang_disposeString(string);
        return res;
    }

    public static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursor_StructDecl || cursorKind == CXCursor_UnionDecl;
    }

    public static boolean isInvalidDeclaration(CXCursor cursor)
    {
        return clang_isDeclaration(clang_getCursorKind(cursor)) == 0 || clang_getCursorLanguage(cursor) != CXLanguage_C || clang_getCursorLinkage(cursor) == CXLinkage_Internal;
    }
}
