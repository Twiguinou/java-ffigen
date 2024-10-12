package fr.kenlek.jpgen.libhelp;

import fr.kenlek.jpgen.ClassMaker;
import fr.kenlek.jpgen.ElementFilter;
import fr.kenlek.jpgen.PathProvider;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.ParseResults;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.SourceScopeScanner;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.EnumType;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.RecordType;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main
{
    private static final Declaration.JavaPath PATH = new Declaration.JavaPath("fr.kenlek.jpgen", "clang");
    private static final String HEADER_NAME = "Index_h";

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0)
                .map(dir -> new File(dir, PATH.toString().replaceAll("\\.", "/")))
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
            if (!outputDirectory.exists() && !outputDirectory.mkdirs())
            {
                throw new IllegalStateException("Failed to create output directory.");
            }

            List<Declaration> declarations = new ArrayList<>();
            declarations.addAll(results.gatherRecordDeclarations(PATH));
            declarations.addAll(results.gatherEnumDeclarations(PATH));
            declarations.addAll(results.makeCallbacks(PATH));
            declarations.add(new HeaderDeclaration(PATH.child(HEADER_NAME), results.gatherBindings(PATH)));
            declarations.add(Declaration.resolveLayouts(PATH.child("Layouts"), declarations));

            ClassMaker maker = new ClassMaker((Declaration.Layouts)declarations.getLast());

            for (Declaration declaration : declarations)
            {
                File sourceFile = new File(outputDirectory, String.format("%s.java", declaration.path().name()));
                try (FileWriter writer = new FileWriter(sourceFile))
                {
                    PrintingContext context = new PrintingContext(writer);
                    switch (declaration)
                    {
                        case EnumType.Decl enumDecl -> ClassMaker.makeEnum(context, enumDecl);
                        case RecordType.Decl record -> maker.makeRecord(context, record);
                        case CallbackDeclaration callback -> maker.makeCallback(context, callback);
                        case HeaderDeclaration header -> maker.makeHeader(context, header);
                        case Declaration.Layouts _ -> maker.makeLayouts(context);
                        default -> throw new IllegalStateException(String.format("Unexpected declaration kind: %s", declaration));
                    }
                }

                scanner.logger.info(String.format("Generated declaration: %s", declaration.path().name()));
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        Optional.ofNullable(System.getenv("LIBCLANG_19_PATH")).ifPresentOrElse(
                System::load,
                () -> System.loadLibrary("clang-19")
        );

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
