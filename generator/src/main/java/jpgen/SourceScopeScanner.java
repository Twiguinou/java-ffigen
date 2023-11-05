package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXSourceLocation;
import jpgen.clang.CXType;
import jpgen.data.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.*;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXTranslationUnit_Flags.*;
import static jpgen.clang.CXErrorCode.*;
import static jpgen.clang.CXDiagnosticDisplayOptions.*;
import static jpgen.clang.CXDiagnosticSeverity.*;
import static jpgen.clang.CXChildVisitResult.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXTypeKind.*;

public class SourceScopeScanner
{
    private static final Logger gScannerLogger = LogManager.getLogger(SourceScopeScanner.class);

    private final MemorySegment m_index;
    private final MemorySegment m_translationUnit;
    private final Map<TypeKey, TypeDeclaration> m_typeLookup = new HashMap<>();
    private final Map<String, FunctionDeclaration> m_functions = new HashMap<>();

    public SourceScopeScanner(String header_filename)
    {
        try (Arena arena = Arena.ofConfined())
        {
            gScannerLogger.info(ForeignUtils.retrieveString(clang_getClangVersion(arena)));

            List<String> clangArgs = new ArrayList<>();
            clangArgs.add("-fparse-all-comments");
            clangArgs.add("-Weverything");
            clangArgs.add("-xc");
            // TODO: what the fuck
            clangArgs.add("-IC:\\msys64\\mingw64\\include");
            clangArgs.add("-IC:\\msys64\\mingw64\\lib\\gcc\\x86_64-w64-mingw32\\13.2.0\\include");

            MemorySegment clangArgsNative = arena.allocateArray(ValueLayout.ADDRESS, clangArgs.size());
            for (int i = 0; i < clangArgs.size(); i++)
            {
                clangArgsNative.setAtIndex(ValueLayout.ADDRESS, i, arena.allocateUtf8String(clangArgs.get(i)));
            }

            this.m_index = clang_createIndex(0, 0);
            MemorySegment pTu = arena.allocate(ValueLayout.ADDRESS);
            int error = clang_parseTranslationUnit2(this.m_index, arena.allocateUtf8String(header_filename), clangArgsNative, clangArgs.size(), MemorySegment.NULL, 0, CXTranslationUnit_DetailedPreprocessingRecord, pTu);
            if (error != CXError_Success)
            {
                clang_disposeIndex(this.m_index);
                throw new IllegalStateException("Failed to parse translation unit: " + error);
            }
            this.m_translationUnit = pTu.get(ValueLayout.ADDRESS, 0);

            MemorySegment diagnostics = clang_getDiagnosticSetFromTU(this.m_translationUnit);
            StringBuilder clangReport = new StringBuilder("------- Clang debug parsing output -------");
            final int startLength = clangReport.length();
            if (dumpDiagnostics(arena, diagnostics, clangReport))
            {
                gScannerLogger.error(clangReport.toString());
                clang_disposeTranslationUnit(this.m_translationUnit);
                clang_disposeIndex(this.m_index);
                throw new RuntimeException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                gScannerLogger.warn(clangReport);
            }
        }
    }

    private static boolean dumpDiagnostics(Arena arena, MemorySegment diagnostics, StringBuilder clangReport)
    {
        boolean fail = false;
        for (int i = 0; i < clang_getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diag = clang_getDiagnosticInSet(diagnostics, i);
            clangReport.append(System.getProperty("line.separator"));
            clangReport.append(ForeignUtils.retrieveString(clang_formatDiagnostic(arena, diag, CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName)));

            MemorySegment children = clang_getChildDiagnostics(diag);
            fail |= clang_getDiagnosticSeverity(diag) >= CXDiagnostic_Error;
            fail |= dumpDiagnostics(arena, children, clangReport);
            clang_disposeDiagnostic(diag);
        }

        return fail;
    }

    private static Optional<TypeDeclaration.Primitive<?>> parsePrimitiveType(CXType type) throws IllegalArgumentException
    {
        return switch (type.kind())
        {
            case CXType_Void -> Optional.of(TypeDeclaration.VOID);
            case CXType_Bool -> Optional.of(TypeDeclaration.BOOL);
            case CXType_Char_U, CXType_UChar, CXType_Char_S -> Optional.of(TypeDeclaration.CHAR);
            case CXType_UShort, CXType_Short -> Optional.of(TypeDeclaration.SHORT);
            case CXType_UInt, CXType_Int -> Optional.of(TypeDeclaration.INT);
            case CXType_ULong, CXType_ULongLong, CXType_Long, CXType_LongLong -> Optional.of(TypeDeclaration.LONG);
            case CXType_Float -> Optional.of(TypeDeclaration.FLOAT);
            case CXType_Double -> Optional.of(TypeDeclaration.DOUBLE);
            default -> Optional.empty();
        };
    }

    private TypeReference parseType(CXType type)
    {
        return parsePrimitiveType(type).map(TypeReference::fromPrimitive).orElseGet(() ->
                switch (type.kind())
                {
                    case CXType_ConstantArray, CXType_DependentSizedArray ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            TypeDeclaration.Array arrayDeclaration = new TypeDeclaration.Array(this.parseType(clang_getArrayElementType(arena, type)), clang_getArraySize(type));
                            yield () -> arrayDeclaration;
                        }
                    }
                    default ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            yield TypeReference.withLookup(ForeignUtils.typeDeclarationUSR(arena, type), this.m_symbolLookup);
                        }
                    }
                });
    }

    private static EnumDeclaration parseEnum(CXCursor cursor, String name)
    {
        assert clang_getCursorKind(cursor) == CXCursor_EnumDecl;
        try (Arena arena = Arena.ofConfined())
        {
            TypeDeclaration.IntegerPrimitive intType = (TypeDeclaration.IntegerPrimitive) parsePrimitiveType(clang_getEnumDeclIntegerType(arena, cursor)).orElseThrow();
            List<EnumDeclaration.Constant> constants = new ArrayList<>();
            clang_visitChildren(arena, cursor, (member_cursor, parent, client_data) ->
            {
                final String constantName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, member_cursor));
                final long value = clang_getEnumConstantDeclUnsignedValue(member_cursor);
                constants.add(new EnumDeclaration.Constant(constantName, value));
                return CXChildVisit_Continue;
            }, MemorySegment.NULL);

            return new EnumDeclaration(name, constants.toArray(EnumDeclaration.Constant[]::new), intType);
        }
    }

    private FunctionDeclaration parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            final String name = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
            final TypeReference returnType = this.parseType(clang_getCursorResultType(arena, cursor));

            List<FunctionDeclaration.Argument> args = new ArrayList<>();
            clang_visitChildren(arena, cursor, (member_cursor, parent, client_data) ->
            {
                if (clang_getCursorKind(member_cursor) == CXCursor_ParmDecl)
                {
                    final String parameterName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, member_cursor));
                    gScannerLogger.info(clang_getCanonicalType(arena, clang_getCursorType(arena, member_cursor)).kind());
                    args.add(new FunctionDeclaration.Argument(parameterName, this.parseType(clang_getCursorType(arena, member_cursor))));
                }

                return CXChildVisit_Continue;
            }, MemorySegment.NULL);

            return new FunctionDeclaration(name, clang_Cursor_isVariadic(cursor) != 0, returnType, args.toArray(FunctionDeclaration.Argument[]::new));
        }
    }

    //TODO: remove
    private static int cursorLine(CXCursor cursor)
    {
        try (Arena arena = Arena.ofConfined())
        {
            CXSourceLocation location = clang_getCursorLocation(arena, cursor);
            MemorySegment line = arena.allocate(ValueLayout.JAVA_INT);
            clang_getExpansionLocation(location, MemorySegment.NULL, line, MemorySegment.NULL, MemorySegment.NULL);
            return line.get(ValueLayout.JAVA_INT, 0);
        }
    }

    private RecordDeclaration parseRecord(CXCursor cursor, String name)
    {
        assert clang_getCursorKind(cursor) == CXCursor_StructDecl;
        try (Arena arena = Arena.ofConfined())
        {
            List<RecordDeclaration.Field> fields = new ArrayList<>();
            clang_visitChildren(arena, cursor, (member_cursor, parent, client_data) ->
            {
                if (clang_getCursorKind(member_cursor) == CXCursor_FieldDecl)
                {
                    final String fieldName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, member_cursor));
                    final long offset = clang_Cursor_getOffsetOfField(member_cursor);
                    fields.add(new RecordDeclaration.Field(fieldName, offset, this.parseType(clang_getCursorType(arena, member_cursor))));
                }

                return CXChildVisit_Continue;
            }, MemorySegment.NULL);

            return new RecordDeclaration(name, fields.toArray(RecordDeclaration.Field[]::new));
        }
    }

    public void process()
    {
        this.clear();
        try (Arena arena = Arena.ofConfined())
        {
            clang_visitChildren(arena, clang_getTranslationUnitCursor(arena, this.m_translationUnit), (cursor, parent, clientData) ->
            {
                if (clang_Location_isInSystemHeader(clang_getCursorLocation(arena, cursor)) != 0)
                {
                    return CXChildVisit_Continue;
                }

                switch (clang_getCursorKind(cursor))
                {
                    case CXCursor_EnumDecl ->
                    {
                        if (clang_Cursor_isAnonymous(cursor) != 0 || clang_isCursorDefinition(cursor) == 0) break;

                        final EnumDeclaration decl = parseEnum(cursor, ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor)));
                        this.m_symbolLookup.put(ForeignUtils.retrieveString(clang_getCursorUSR(arena, cursor)), decl);
                    }
                    case CXCursor_StructDecl ->
                    {
                        if (clang_Cursor_isAnonymous(cursor) != 0 || clang_isCursorDefinition(cursor) == 0) break;

                        final RecordDeclaration decl = parseRecord(cursor, ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor)));
                        this.m_symbolLookup.put(ForeignUtils.retrieveString(clang_getCursorUSR(arena, cursor)), decl);
                    }
                    case CXCursor_FunctionDecl -> this.m_functions.computeIfAbsent(ForeignUtils.retrieveString(clang_getCursorUSR(arena, cursor)), usr -> parseFunction(cursor));
                    case CXCursor_TypedefDecl ->
                    {
                        //this.parseTypedefAssociation(cursor);
                    }
                    case CXCursor_UnexposedDecl ->
                    {
                        return CXChildVisit_Recurse;
                    }
                }

                return CXChildVisit_Continue;
            }, MemorySegment.NULL);
        }

        gScannerLogger.info("SYMBOLS >>> " + this.m_symbolLookup);
        gScannerLogger.info("FUNCTIONS >>> " + this.m_functions);
    }

    public void clear()
    {
        this.m_symbolLookup.clear();
        this.m_functions.clear();
    }

    public void dispose()
    {
        this.clear();
        clang_disposeTranslationUnit(this.m_translationUnit);
        clang_disposeIndex(this.m_index);
    }
}
