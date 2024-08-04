package fr.akshir.jpgen;

import fr.akshir.jpgen.clang.CXCursor;
import fr.akshir.jpgen.clang.CXCursorKind;
import fr.akshir.jpgen.clang.CXSourceLocation;
import fr.akshir.jpgen.clang.CXString;
import fr.akshir.jpgen.clang.CXType;
import fr.akshir.jpgen.clang.Index_h;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import static java.lang.foreign.MemorySegment.NULL;

public final class ClangUtils
{private ClangUtils() {}

    public static Optional<String> retrieveString(CXString string)
    {
        MemorySegment cString = Index_h.clang_getCString(string);
        if (cString.equals(NULL))
        {
            return Optional.empty();
        }

        final String res = cString.getString(0);
        Index_h.clang_disposeString(string);
        return Optional.of(res);
    }

    public static boolean isCursorAnonymous(CXCursor cursor)
    {
        if (Index_h.clang_getCursorKind(cursor) == CXCursorKind.CXCursor_FieldDecl)
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXType fieldType = Index_h.clang_getCursorType(arena, cursor);
                CXCursor typeDeclaration = Index_h.clang_getTypeDeclaration(arena, fieldType);
                return isCursorAnonymous(typeDeclaration);
            }
        }

        return Index_h.clang_Cursor_isAnonymous(cursor) != 0;
    }

    public static Optional<String> getCursorSpelling(SegmentAllocator allocator, CXCursor cursor)
    {
        if (isCursorAnonymous(cursor))
        {
            return Optional.empty();
        }

        return retrieveString(Index_h.clang_getCursorSpelling(allocator, cursor));
    }

    public static boolean isRecordDeclaration(int cursorKind)
    {
        return cursorKind == CXCursorKind.CXCursor_StructDecl || cursorKind == CXCursorKind.CXCursor_UnionDecl;
    }

    public static CXSourceLocation getCursorLocation(SegmentAllocator allocator, CXCursor cursor, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        CXSourceLocation location = Index_h.clang_getCursorLocation(allocator, cursor);
        Index_h.clang_getFileLocation(location, file, line, column, offset);
        return location;
    }

    public static Optional<Path> getCursorFilePath(SegmentAllocator allocator, CXCursor cursor)
    {
        MemorySegment pFile = allocator.allocate(NativeTypes.UNBOUNDED_POINTER);
        getCursorLocation(allocator, cursor, pFile, NULL, NULL, NULL);
        return ClangUtils.retrieveString(Index_h.clang_getFileName(allocator, pFile.get(NativeTypes.UNBOUNDED_POINTER, 0)))
                .map(filename -> Paths.get(filename).toAbsolutePath());
    }
}
