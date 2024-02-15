package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXSourceRange;
import jpgen.clang.CXString;
import jpgen.clang.CXToken;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXLanguageKind.*;
import static jpgen.clang.CXLinkageKind.*;

public final class ClangUtils
{private ClangUtils() {}

    public static String retrieveString(CXString string)
    {
        MemorySegment cString = clang_getCString(string);
        if (cString.equals(MemorySegment.NULL))
        {
            return "";
        }

        final String res = cString.reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0);
        clang_disposeString(string);
        return res;
    }

    public static Optional<String> tryGetCursorSpelling(SegmentAllocator allocator, CXCursor cursor)
    {
        if (clang_Cursor_isAnonymous(cursor) != 0)
        {
            return Optional.empty();
        }

        String spelling = ClangUtils.retrieveString(clang_getCursorSpelling(allocator, cursor));
        return spelling.isBlank() ? Optional.empty() : Optional.of(spelling);
    }

    public static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursor_StructDecl || cursorKind == CXCursor_UnionDecl;
    }

    public static boolean isInvalidDeclaration(CXCursor cursor)
    {
        return clang_isDeclaration(clang_getCursorKind(cursor)) == 0 || clang_getCursorLanguage(cursor) != CXLanguage_C || clang_getCursorLinkage(cursor) == CXLinkage_Internal || clang_Cursor_isFunctionInlined(cursor) != 0;
    }

    public static String[] tokenizeRange(SegmentAllocator allocator, MemorySegment translationUnit, CXSourceRange range)
    {
        MemorySegment pNumTokens = allocator.allocate(ValueLayout.JAVA_INT);
        MemorySegment pTokens = allocator.allocate(ValueLayout.ADDRESS);
        clang_tokenize(translationUnit, range, pTokens, pNumTokens);

        int numTokens = pNumTokens.get(ValueLayout.JAVA_INT, 0);
        MemorySegment tokens = pTokens.get(ValueLayout.ADDRESS, 0).reinterpret(numTokens * CXToken.gStructLayout.byteSize());
        String[] spellings = new String[numTokens];
        for (int i = 0; i < numTokens; i++)
        {
            CXToken token = new CXToken(tokens.asSlice(i * CXToken.gStructLayout.byteSize(), CXToken.gStructLayout));
            spellings[i] = ClangUtils.retrieveString(clang_getTokenSpelling(allocator, translationUnit, token));
        }

        clang_disposeTokens(translationUnit, tokens, numTokens);
        return spellings;
    }
}
