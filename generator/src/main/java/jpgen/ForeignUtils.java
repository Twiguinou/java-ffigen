package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXString;

import java.lang.foreign.SegmentAllocator;
import java.util.Optional;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXLanguageKind.*;
import static jpgen.clang.CXLinkageKind.*;

public final class ForeignUtils
{private ForeignUtils() {}

    public static String retrieveString(CXString string)
    {
        final String res = clang_getCString(string).reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0);
        clang_disposeString(string);
        return res;
    }

    public static Optional<String> tryGetCursorSpelling(SegmentAllocator allocator, CXCursor cursor)
    {
        if (clang_Cursor_isAnonymous(cursor) != 0)
        {
            return Optional.empty();
        }

        String spelling = ForeignUtils.retrieveString(clang_getCursorSpelling(allocator, cursor));
        return spelling.isBlank() ? Optional.empty() : Optional.of(spelling);
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
