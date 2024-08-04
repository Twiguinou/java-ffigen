package fr.akshir.jpgen.libhelp;

import fr.akshir.jpgen.ClassMaker;
import fr.akshir.jpgen.LocationProvider;
import fr.akshir.jpgen.PrintingContext;
import fr.akshir.jpgen.SourceScopeScanner;
import fr.akshir.jpgen.data.CallbackDeclaration;
import fr.akshir.jpgen.data.CanonicalPackage;
import fr.akshir.jpgen.data.Declaration;
import fr.akshir.jpgen.data.EnumType;
import fr.akshir.jpgen.data.HeaderDeclaration;
import fr.akshir.jpgen.data.RecordType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main
{
    private static final String HEADER_NAME = "Index_h";
    private static final String DIRECTORY = "fr/akshir/jpgen/clang";
    private static final CanonicalPackage PACKAGE = CanonicalPackage.of(DIRECTORY.replaceAll("/", "."));

    private static void printToFile(String data, File outputFile) throws IOException
    {
        try (FileOutputStream outputStream = new FileOutputStream(outputFile))
        {
            outputStream.write(data.getBytes(StandardCharsets.UTF_8));
        }
    }

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0)
                .map(dir -> new File(dir, DIRECTORY))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        Path clangCInclude = arguments.getArgValueIndexed("clang_c_include", 0)
                .map(Paths::get)
                .orElseThrow(() -> new IllegalStateException("Missing clang_c_include argument."));
        boolean debug = arguments.getArgValueIndexed("debug", 0)
                .map(Boolean::parseBoolean)
                .orElse(false);

        LocationProvider.ModuleTree moduleTree = new LocationProvider.ModuleTree(clangCInclude, PACKAGE);
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Generator"), debug, LocationProvider.of(moduleTree)))
        {
            scanner.process(clangCInclude.resolve("Index.h"), new String[] {}, true, clangCInclude);

            if (!outputDirectory.exists() && !outputDirectory.mkdirs())
            {
                throw new IllegalStateException("Failed to create output directory.");
            }

            List<Declaration> declarations = new ArrayList<>();
            declarations.addAll(scanner.gatherRecordDeclarations(CanonicalPackage.EMPTY));
            declarations.addAll(scanner.gatherEnumDeclarations(CanonicalPackage.EMPTY));
            declarations.addAll(scanner.makeCallbacks(CanonicalPackage.EMPTY));
            declarations.add(new HeaderDeclaration(HEADER_NAME, PACKAGE, scanner.gatherBindings(), scanner.constants()));

            for (Declaration declaration : declarations)
            {
                StringBuilder code = new StringBuilder();
                PrintingContext context = new PrintingContext(code);
                switch (declaration)
                {
                    case EnumType.Decl enumDecl -> ClassMaker.makeEnum(context, enumDecl);
                    case RecordType.Decl record -> ClassMaker.makeRecord(context, record);
                    case CallbackDeclaration callback -> ClassMaker.makeCallback(context, callback);
                    case HeaderDeclaration header -> ClassMaker.makeHeader(context, header);
                    default -> throw new IllegalStateException(String.format("Unexpected declaration kind: %s", declaration));
                }

                printToFile(code.toString(), new File(outputDirectory, String.format("%s.java", declaration.name())));
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        System.loadLibrary("libclang");
    }
}
