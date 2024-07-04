package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXString;
import jpgen.clang.CXType;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.Optional;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXCursorKind.*;
import static java.lang.foreign.MemorySegment.NULL;

public final class ClangUtils
{private ClangUtils() {}

    public static Optional<String> retrieveString(CXString string)
    {
        MemorySegment cString = clang_getCString(string);
        if (cString.equals(NULL))
        {
            return Optional.empty();
        }

        final String res = cString.getString(0);
        clang_disposeString(string);
        return Optional.of(res);
    }

    public static boolean isCursorAnonymous(CXCursor cursor)
    {
        if (clang_getCursorKind(cursor) == CXCursor_FieldDecl)
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXType fieldType = clang_getCursorType(arena, cursor);
                CXCursor typeDeclaration = clang_getTypeDeclaration(arena, fieldType);
                return isCursorAnonymous(typeDeclaration);
            }
        }

        return clang_Cursor_isAnonymous(cursor) != 0;
    }

    public static Optional<String> getCursorSpelling(SegmentAllocator allocator, CXCursor cursor)
    {
        if (isCursorAnonymous(cursor))
        {
            return Optional.empty();
        }

        return retrieveString(clang_getCursorSpelling(allocator, cursor));
    }

    public static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursor_StructDecl || cursorKind == CXCursor_UnionDecl;
    }
}
