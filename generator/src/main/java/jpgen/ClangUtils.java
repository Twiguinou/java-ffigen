package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXSourceLocation;
import jpgen.clang.CXString;
import jpgen.clang.CXType;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public static CXSourceLocation getCursorLocation(SegmentAllocator allocator, CXCursor cursor, MemorySegment file, MemorySegment line, MemorySegment column, MemorySegment offset)
    {
        CXSourceLocation location = clang_getCursorLocation(allocator, cursor);
        clang_getFileLocation(location, file, line, column, offset);
        return location;
    }

    public static Optional<Path> getCursorFilePath(SegmentAllocator allocator, CXCursor cursor)
    {
        MemorySegment pFile = allocator.allocate(NativeTypes.UNBOUNDED_POINTER);
        getCursorLocation(allocator, cursor, pFile, NULL, NULL, NULL);
        return ClangUtils.retrieveString(clang_getFileName(allocator, pFile.get(NativeTypes.UNBOUNDED_POINTER, 0)))
                .map(filename -> Paths.get(filename).toAbsolutePath());
    }
}
