package fr.kenlek.jpgen.libhelp;

import fr.kenlek.jpgen.ClangUtils;
import fr.kenlek.jpgen.ElementFilter;
import fr.kenlek.jpgen.PathProvider;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.ParseResults;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.SourceScopeScanner;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.FunctionType;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.NumericType;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main
{
    public static final JavaPath PATH = JavaPath.of("fr.kenlek.jpgen.clang");
    private static final String HEADER_NAME = "Index_h";

    private static final Set<JavaPath> UNSUPPORTED_RECORDS = Set.of(
            PATH.child("CXUnsavedFile"),
            PATH.child("CXTUResourceUsageEntry")
    );

    private static List<CallbackDeclaration> createCallbacks(ParseResults results)
    {
        JavaPath cxCursorPath = PATH.child("CXCursor");
        Type cursorType = results.findTypeDeclaration(declaration -> declaration instanceof RecordType.Decl && declaration.path().equals(cxCursorPath)).orElseThrow();

        return List.of(
                new CallbackDeclaration(PATH.child("CXCursorVisitor"), new FunctionType.Builder(NumericType.INT_32)
                        .addParameter(cursorType).addParameter(cursorType).addParameter(NumericType.POINTER).build(),
                        List.of("cursor", "parent", "client_data")),
                new CallbackDeclaration(PATH.child("CXFieldVisitor"), new FunctionType.Builder(NumericType.INT_32)
                        .addParameter(cursorType).addParameter(NumericType.POINTER).build(),
                        List.of("C", "client_data"))
        );
    }

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        Path outputDirectory = arguments.getArgValueIndexed("output_directory", 0)
                .map(Path::of)
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        Path llvmInclude = arguments.getArgValueIndexed("llvm_include", 0)
                .map(Path::of)
                .orElseThrow(() -> new IllegalStateException("Missing llvm_include argument."));
        boolean debug = arguments.getArgValueIndexed("debug", 0)
                .map(Boolean::parseBoolean)
                .orElse(false);

        Path clangCInclude = llvmInclude.resolve("clang-c");

        PathProvider pathProvider = new PathProvider.ModuleTree(clangCInclude, PATH, List.of());
        ParseOptions options = new ParseOptions.Builder(new ParseOptions.Hints(pathProvider, ElementFilter.ofConfined(clangCInclude), true))
                .addHeader(clangCInclude.resolve("Index.h"))
                .addArgument(String.format("-I%s", llvmInclude))
                .build();

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Generator"), debug);
             ParseResults results = scanner.process(options))
        {
            List<Declaration.CodeGenerator<?>> declarations = new ArrayList<>();
            declarations.addAll(results.gatherGeneratorDeclarations(PATH).stream()
                    .filter(declaration -> !UNSUPPORTED_RECORDS.contains(declaration.path()))
                    .toList());
            declarations.addAll(createCallbacks(results));
            declarations.add(new HeaderDeclaration(PATH.child(HEADER_NAME), results.gatherBindings(PATH)));
            declarations.add(Declaration.resolveLayouts(PATH.child("Layouts"), declarations));

            JavaPath layoutsClass = declarations.getLast().path();

            for (Declaration.CodeGenerator<?> declaration : declarations)
            {
                File sourceDirectory = outputDirectory.resolve(declaration.path().parent().getFileSystemPath()).toFile();
                if (!sourceDirectory.exists() && !sourceDirectory.mkdirs())
                {
                    throw new IllegalStateException("Failed to create source path directory: ".concat(declaration.path().toString()));
                }

                File sourceFile = new File(sourceDirectory, declaration.path().tail().concat(".java"));
                try (FileWriter writer = new FileWriter(sourceFile))
                {
                    declaration.writeSourceFile(new PrintingContext(writer), layoutsClass);
                }

                scanner.logger.info("Generated declaration: ".concat(declaration.path().toString()));
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        ClangUtils.loadClang();
        try
        {
            LogManager.getLogManager().readConfiguration(new ByteArrayInputStream("""
                    handlers=java.util.logging.ConsoleHandler
                    java.util.logging.SimpleFormatter.format=(%3$s) | %4$s | %5$s\\n
                    .level=ALL
                    """.getBytes(StandardCharsets.UTF_8)));
        }
        catch (IOException e)
        {
            System.err.printf("Failed to initialize logging configuration: %s%n", e);
        }
    }
}
