package fr.kenlek.jpgen.libhelp;

import fr.kenlek.jpgen.ClassMaker;
import fr.kenlek.jpgen.ElementFilter;
import fr.kenlek.jpgen.LocationProvider;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.ParseResults;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.SourceScopeScanner;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.CanonicalPackage;
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
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main
{
    private static final String HEADER_NAME = "Index_h";
    private static final String DIRECTORY = "fr/kenlek/jpgen/clang";

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0)
                .map(dir -> new File(dir, DIRECTORY))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        Path clangInclude = arguments.getArgValueIndexed("clang_include", 0)
                .map(Path::of)
                .orElseThrow(() -> new IllegalStateException("Missing clang_include argument."));
        boolean debug = arguments.getArgValueIndexed("debug", 0)
                .map(Boolean::parseBoolean)
                .orElse(false);

        Path clangCInclude = clangInclude.resolve("clang-c");
        CanonicalPackage location = CanonicalPackage.of(DIRECTORY.replaceAll("/", "."));

        LocationProvider locationProvider = new LocationProvider.ModuleTree(clangCInclude, location);
        ParseOptions options = new ParseOptions.Builder(new ParseOptions.Hints(locationProvider, ElementFilter.ofConfined(clangCInclude), true))
                .addHeader(clangCInclude.resolve("Index.h"))
                .addArgument(String.format("-I%s", clangCInclude))
                .build();

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Generator"), debug);
             ParseResults results = scanner.process(options))
        {
            if (!outputDirectory.exists() && !outputDirectory.mkdirs())
            {
                throw new IllegalStateException("Failed to create output directory.");
            }

            List<Declaration> declarations = new ArrayList<>();
            declarations.addAll(results.gatherRecordDeclarations(location));
            declarations.addAll(results.gatherEnumDeclarations(location));
            declarations.addAll(results.makeCallbacks(location));
            declarations.add(new HeaderDeclaration(HEADER_NAME, location, results.gatherBindings(location), results.constants));

            for (Declaration declaration : declarations)
            {
                File sourceFile = new File(outputDirectory, String.format("%s.java", declaration.name()));
                try (FileWriter writer = new FileWriter(sourceFile))
                {
                    PrintingContext context = new PrintingContext(writer);
                    switch (declaration)
                    {
                        case EnumType.Decl enumDecl -> ClassMaker.makeEnum(context, enumDecl);
                        case RecordType.Decl record -> ClassMaker.makeRecord(context, record);
                        case CallbackDeclaration callback -> ClassMaker.makeCallback(context, callback);
                        case HeaderDeclaration header -> ClassMaker.makeHeader(context, header);
                        default -> throw new IllegalStateException(String.format("Unexpected declaration kind: %s", declaration));
                    }
                }

                scanner.logger.info(String.format("Generated declaration: %s", declaration.name()));
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        System.loadLibrary("clang");

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
