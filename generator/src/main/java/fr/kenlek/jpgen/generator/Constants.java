package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.HeaderDeclaration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import static java.lang.foreign.MemorySegment.NULL;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.api.ForeignUtils.allocateStringArray;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.CXCursor_VarDecl;
import static fr.kenlek.jpgen.clang.CXErrorCode.CXError_Success;
import static fr.kenlek.jpgen.clang.CXEvalResultKind.*;
import static fr.kenlek.jpgen.clang.CXSaveError.CXSaveError_None;
import static fr.kenlek.jpgen.clang.CXTranslationUnit_Flags.*;
import static fr.kenlek.jpgen.generator.SourceScopeScanner.createTempFile;

public final class Constants implements AutoCloseable
{
    private static final String AUTO_GEN_PREFIX = "$$jpgen__macro_var__";
    private static final int PARSING_OPTIONS = CXTranslationUnit_SingleFileParse | CXTranslationUnit_SkipFunctionBodies;

    private final LibClang m_libClang;
    private final MemorySegment m_index;
    private final Map<String, HeaderDeclaration.Constant> m_parsedConstants = new HashMap<>();
    private final Map<String, String[]> m_unparsed = new HashMap<>();
    private final String m_varFile, m_precompiledFile;
    private final Logger m_logger;

    private Constants(LibClang libClang, Logger logger, MemorySegment index, String varFile, String precompiledFile)
    {
        this.m_libClang = libClang;
        this.m_logger = logger;
        this.m_index = index;
        this.m_varFile = varFile;
        this.m_precompiledFile = precompiledFile;
    }

    public static Constants make(LibClang libClang, Logger logger, boolean clangOutput, MemorySegment translationUnit) throws IOException
    {
        try (Arena arena = Arena.ofConfined())
        {
            File precompiled = createTempFile("jpgen-pdata", ".pch");
            File vars = createTempFile("jpgen-pdata-parse", ".h");

            MemorySegment pPrecompiledPath = arena.allocateFrom(precompiled.getAbsolutePath());
            if (libClang.saveTranslationUnit(translationUnit, pPrecompiledPath, 0) != CXSaveError_None)
            {
                throw new ClangException();
            }

            MemorySegment index = libClang.createIndex(true, clangOutput);

            return new Constants(libClang, logger, index, vars.getAbsolutePath(), precompiled.getAbsolutePath());
        }
    }

    public Collection<HeaderDeclaration.Constant> getParsedSet()
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
                this.m_parsedConstants.put(name, new HeaderDeclaration.Constant("int", name, Integer.toString(Integer.decode(tokens[1]))));
                return;
            }
            catch (NumberFormatException _)
            {
            }
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
            String varName = AUTO_GEN_PREFIX + macroName;

            try (FileWriter writer = new FileWriter(this.m_varFile))
            {
                writer.write("__auto_type ");
                writer.write(varName);
                writer.write(" = ");
                writer.write(macroName);
                writer.write(";\n");
            }
            catch (IOException e)
            {
                this.m_logger.severe(e.toString());
                return false;
            }

            List<String> rawClangArgs = List.of(
                "-nostdinc",
                "-ferror-limit=0",
                // I forgot to add this argument after fixing the thing with K&R functions
                "-fno-knr-functions",
                "-include-pch", this.m_precompiledFile
            );

            MemorySegment clangArgs = allocateStringArray(arena, rawClangArgs);

            MemorySegment pTu = arena.allocate(ADDRESS);
            if (this.m_libClang.parseTranslationUnit2(this.m_index, arena.allocateFrom(this.m_varFile), clangArgs, rawClangArgs.size(), NULL, 0, PARSING_OPTIONS, pTu) != CXError_Success)
            {
                return false;
            }

            MemorySegment translationUnit = pTu.get(ADDRESS, 0);

            CXCursor topLevel = this.m_libClang.getTranslationUnitCursor(arena, translationUnit);
            this.m_libClang.visitChildren(topLevel, ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (this.m_libClang.getCursorKind(cursor) == CXCursor_VarDecl)
                {
                    Optional<String> spelling = this.m_libClang.getCursorSpelling(cursor);
                    if (spelling.isPresent() && spelling.get().equals(varName))
                    {
                        MemorySegment eval = this.m_libClang.Cursor_Evaluate(cursor);
                        if (!eval.equals(NULL))
                        {
                            boolean parsed = switch (this.m_libClang.EvalResult_getKind(eval))
                            {
                                case CXEval_Int ->
                                {
                                    int value = this.m_libClang.EvalResult_getAsInt(eval);
                                    this.m_parsedConstants.put(macroName, new HeaderDeclaration.Constant("int", macroName, Integer.toString(value)));
                                    yield true;
                                }
                                case CXEval_Float ->
                                {
                                    double value = this.m_libClang.EvalResult_getAsDouble(eval);
                                    this.m_parsedConstants.put(macroName, new HeaderDeclaration.Constant("double", macroName, Double.toString(value)));
                                    yield true;
                                }
                                case CXEval_StrLiteral ->
                                {
                                    String value = this.m_libClang.EvalResult_getAsStr(eval).getString(0);
                                    this.m_parsedConstants.put(macroName, new HeaderDeclaration.Constant("String", macroName, "\"" + value + "\""));
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

            this.m_libClang.disposeTranslationUnit(translationUnit);
            return !this.m_unparsed.containsKey(macroName);
        }
    }

    @Override
    public void close()
    {
        this.m_libClang.disposeIndex(this.m_index);
    }
}
