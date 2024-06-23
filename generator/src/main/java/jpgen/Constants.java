package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXCursorVisitor;
import jpgen.clang.CXUnsavedFile;
import jpgen.data.Constant;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXSaveError.*;
import static jpgen.clang.CXTranslationUnit_Flags.*;
import static jpgen.clang.CXChildVisitResult.*;
import static jpgen.clang.CXErrorCode.*;
import static jpgen.clang.CXEvalResultKind.*;
import static jpgen.clang.CXCursorKind.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public final class Constants implements Closeable
{
    private static final String AUTO_GEN_PREFIX = "$$jpgen__macro_var__";

    private final MemorySegment m_index;
    private final Map<String, Constant> m_parsedConstants = new HashMap<>();
    private final Map<String, String[]> m_unparsed = new HashMap<>();
    private final File m_varFile;
    private final MemorySegment m_refUnit;

    private Constants(MemorySegment index, MemorySegment refUnit, File varFile)
    {
        this.m_index = index;
        this.m_refUnit = refUnit;
        this.m_varFile = varFile;
    }

    public static Constants make(MemorySegment translationUnit) throws IOException
    {
        try (Arena arena = Arena.ofConfined())
        {
            File precompiled = Files.createTempFile("jpgen-pdata", ".pch").toFile();
            precompiled.deleteOnExit();
            File vars = Files.createTempFile("jpgen-pdata-parse", ".h").toFile();
            vars.deleteOnExit();

            MemorySegment pPrecompiledPath = arena.allocateFrom(precompiled.getAbsolutePath());
            MemorySegment pVarsPath = arena.allocateFrom(vars.getAbsolutePath());
            if (clang_saveTranslationUnit(translationUnit, pPrecompiledPath, 0) != CXSaveError_None)
            {
                throw new ClangException();
            }

            MemorySegment clangArgs = arena.allocate(ADDRESS, 4);
            clangArgs.setAtIndex(ADDRESS, 0, arena.allocateFrom("-nostdinc"));
            clangArgs.setAtIndex(ADDRESS, 1, arena.allocateFrom("-ferror-limit=0"));
            clangArgs.setAtIndex(ADDRESS, 2, arena.allocateFrom("-include-pch"));
            clangArgs.setAtIndex(ADDRESS, 3, pPrecompiledPath);

            // todo: handle errors
            MemorySegment index = clang_createIndex(1, 0);
            MemorySegment refTu = clang_parseTranslationUnit(index, pVarsPath, clangArgs, 4, NULL, 0, CXTranslationUnit_ForSerialization);
            return new Constants(index, refTu, vars);
        }
    }

    public Iterable<Constant> getParsedSet()
    {
        return this.m_parsedConstants.values();
    }

    public void process(String[] tokens)
    {
        String name = tokens[0];
        if (tokens.length == 2 && !tokens[1].isBlank() && tokens[1].charAt(0) != '#')
        {
            try
            {
                this.m_parsedConstants.put(name, new Constant.Int(name, Integer.decode(tokens[1])));
                return;
            }
            catch (NumberFormatException _) {}
        }

        if (!this.m_parsedConstants.containsKey(name))
        {
            this.m_unparsed.put(name, Arrays.copyOfRange(tokens, 1, tokens.length));
        }
    }

    public void parseRemaining()
    {
        List<String> parsingList = this.m_unparsed.keySet().stream().toList();
        for (String toParse : parsingList)
        {
            if (!this.reparse(toParse))
            {
                this.m_unparsed.remove(toParse);
            }
        }
    }

    private boolean reparse(String macroName)
    {
        try (Arena arena = Arena.ofConfined())
        {
            String varName = String.format("%s%s", AUTO_GEN_PREFIX, macroName);
            String code = String.format("__auto_type %s = %s;\n", varName, macroName);

            CXUnsavedFile file = new CXUnsavedFile(arena);
            file.Filename(arena.allocateFrom(this.m_varFile.getAbsolutePath()));
            file.Contents(arena.allocateFrom(code));
            file.Length(code.length());

            if (clang_reparseTranslationUnit(this.m_refUnit, 1, file.ptr(), clang_defaultReparseOptions(this.m_refUnit)) != CXError_Success)
            {
                return false;
            }

            CXCursor topLevel = clang_getTranslationUnitCursor(arena, this.m_refUnit);
            clang_visitChildren(topLevel, ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (clang_getCursorKind(cursor) == CXCursor_VarDecl)
                {
                    Optional<String> spelling = ClangUtils.getCursorSpelling(arena, cursor);
                    if (spelling.isPresent() && spelling.get().equals(varName))
                    {
                        MemorySegment eval = clang_Cursor_Evaluate(cursor);
                        if (!eval.equals(NULL))
                        {
                            boolean parsed = switch (clang_EvalResult_getKind(eval))
                            {
                                case CXEval_Int ->
                                {
                                    int value = clang_EvalResult_getAsInt(eval);
                                    this.m_parsedConstants.put(macroName, new Constant.Int(macroName, value));
                                    yield true;
                                }
                                case CXEval_Float ->
                                {
                                    double value = clang_EvalResult_getAsDouble(eval);
                                    this.m_parsedConstants.put(macroName, new Constant.Float(macroName, value));
                                    yield true;
                                }
                                case CXEval_StrLiteral ->
                                {
                                    String value = clang_EvalResult_getAsStr(eval).getString(0);
                                    this.m_parsedConstants.put(macroName, new Constant.StringLiteral(macroName, value));
                                    yield true;
                                }
                                default -> false;
                            };

                            if (parsed)
                            {
                                this.m_unparsed.remove(macroName);
                            }
                        }

                        return CXChildVisit_Break;
                    }
                }

                return CXChildVisit_Continue;
            }).makeHandle(arena), NULL);

            return !this.m_unparsed.containsKey(macroName);
        }
    }

    @Override
    public void close()
    {
        clang_disposeTranslationUnit(this.m_refUnit);
        clang_disposeIndex(this.m_index);
    }
}
