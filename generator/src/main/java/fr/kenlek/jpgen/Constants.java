package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXChildVisitResult;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorKind;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXErrorCode;
import fr.kenlek.jpgen.clang.CXEvalResultKind;
import fr.kenlek.jpgen.clang.CXSaveError;
import fr.kenlek.jpgen.clang.CXTranslationUnit_Flags;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.data.Constant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public final class Constants implements AutoCloseable
{
    private static final String AUTO_GEN_PREFIX = "$$jpgen__macro_var__";
    private static final int PARSING_OPTIONS = CXTranslationUnit_Flags.CXTranslationUnit_SingleFileParse | CXTranslationUnit_Flags.CXTranslationUnit_SkipFunctionBodies;

    private final MemorySegment m_index;
    private final Set<String> m_exclusionSet;
    private final Map<String, Constant> m_parsedConstants = new HashMap<>();
    private final Map<String, String[]> m_unparsed = new HashMap<>();
    private final String m_varFile, m_precompiledFile;
    private final Logger m_logger;

    private Constants(Logger logger, MemorySegment index, String varFile, String precompiledFile, Set<String> exclusionSet)
    {
        this.m_logger = logger;
        this.m_index = index;
        this.m_varFile = varFile;
        this.m_precompiledFile = precompiledFile;
        this.m_exclusionSet = exclusionSet;
    }

    public static Constants make(Logger logger, boolean clangOutput, MemorySegment translationUnit, List<Constant> exclusionList) throws IOException
    {
        try (Arena arena = Arena.ofConfined())
        {
            File precompiled = Files.createTempFile("jpgen-pdata", ".pch").toFile();
            precompiled.deleteOnExit();
            File vars = Files.createTempFile("jpgen-pdata-parse", ".h").toFile();
            vars.deleteOnExit();

            MemorySegment pPrecompiledPath = arena.allocateFrom(precompiled.getAbsolutePath());
            if (Index_h.clang_saveTranslationUnit(translationUnit, pPrecompiledPath, 0) != CXSaveError.CXSaveError_None)
            {
                throw new ClangException();
            }

            MemorySegment index = Index_h.clang_createIndex(1, clangOutput ? 1 : 0);

            return new Constants(logger, index, vars.getAbsolutePath(), precompiled.getAbsolutePath(), exclusionList.stream()
                    .map(Constant::name)
                    .collect(Collectors.toUnmodifiableSet()));
        }
    }

    public Iterable<Constant> getParsedSet()
    {
        return this.m_parsedConstants.values();
    }

    public void process(String[] tokens)
    {
        String name = tokens[0];
        if (this.m_exclusionSet.contains(name))
        {
            return;
        }

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

            try (FileOutputStream outputStream = new FileOutputStream(this.m_varFile))
            {
                String code = String.format("__auto_type %s = %s;\n", varName, macroName);
                outputStream.write(code.getBytes(StandardCharsets.UTF_8));
            }
            catch (IOException e)
            {
                this.m_logger.severe(e.toString());
                return false;
            }

            MemorySegment clangArgs = arena.allocate(ADDRESS, 5);
            clangArgs.setAtIndex(ADDRESS, 0, arena.allocateFrom("-nostdinc"));
            clangArgs.setAtIndex(ADDRESS, 1, arena.allocateFrom("-ferror-limit=0"));
            // I forgot to add this argument after fixing the thing with K&R functions
            clangArgs.setAtIndex(ADDRESS, 2, arena.allocateFrom("-fno-knr-functions"));
            clangArgs.setAtIndex(ADDRESS, 3, arena.allocateFrom("-include-pch"));
            clangArgs.setAtIndex(ADDRESS, 4, arena.allocateFrom(this.m_precompiledFile));

            MemorySegment pTu = arena.allocate(ADDRESS);
            if (Index_h.clang_parseTranslationUnit2(this.m_index, arena.allocateFrom(this.m_varFile), clangArgs, 5, NULL, 0, PARSING_OPTIONS, pTu) != CXErrorCode.CXError_Success)
            {
                return false;
            }

            MemorySegment translationUnit = pTu.get(ADDRESS, 0);

            CXCursor topLevel = Index_h.clang_getTranslationUnitCursor(arena, translationUnit);
            Index_h.clang_visitChildren(topLevel, ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (Index_h.clang_getCursorKind(cursor) == CXCursorKind.CXCursor_VarDecl)
                {
                    Optional<String> spelling = ClangUtils.getCursorSpelling(arena, cursor);
                    if (spelling.isPresent() && spelling.get().equals(varName))
                    {
                        MemorySegment eval = Index_h.clang_Cursor_Evaluate(cursor);
                        if (!eval.equals(NULL))
                        {
                            boolean parsed = switch (Index_h.clang_EvalResult_getKind(eval))
                            {
                                case CXEvalResultKind.CXEval_Int ->
                                {
                                    int value = Index_h.clang_EvalResult_getAsInt(eval);
                                    this.m_parsedConstants.put(macroName, new Constant.Int(macroName, value));
                                    yield true;
                                }
                                case CXEvalResultKind.CXEval_Float ->
                                {
                                    double value = Index_h.clang_EvalResult_getAsDouble(eval);
                                    this.m_parsedConstants.put(macroName, new Constant.Float(macroName, value));
                                    yield true;
                                }
                                case CXEvalResultKind.CXEval_StrLiteral ->
                                {
                                    String value = Index_h.clang_EvalResult_getAsStr(eval).getString(0);
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

                        return CXChildVisitResult.CXChildVisit_Break;
                    }
                }

                return CXChildVisitResult.CXChildVisit_Continue;
            }).makeHandle(arena), NULL);

            Index_h.clang_disposeTranslationUnit(translationUnit);
            return !this.m_unparsed.containsKey(macroName);
        }
    }

    @Override
    public void close()
    {
        Index_h.clang_disposeIndex(this.m_index);
    }
}
