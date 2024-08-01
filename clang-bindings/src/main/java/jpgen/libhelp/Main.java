package jpgen.libhelp;

import jpgen.ClassMaker;
import jpgen.LocationProvider;
import jpgen.PrintingContext;
import jpgen.SourceScopeScanner;
import jpgen.data.CallbackDeclaration;
import jpgen.data.CanonicalPackage;
import jpgen.data.Constant;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.HeaderDeclaration;
import jpgen.data.RecordType;

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
    private static final String DIRECTORY = "jpgen/clang";
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

        LocationProvider.ModuleTree moduleTree = LocationProvider.ModuleTree.of(clangCInclude, PACKAGE);

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Generator"), debug, LocationProvider.of(moduleTree)))
        {
            scanner.process(clangCInclude.resolve("Index.h"), new String[] {}, true, clangCInclude);

            if (!outputDirectory.exists() && !outputDirectory.mkdirs())
            {
                throw new IllegalStateException("Failed to create output directory.");
            }

            List<HeaderDeclaration.FunctionSpecifier> specifiers = scanner.gatherFunctions();

            List<Declaration> declarations = new ArrayList<>();
            declarations.addAll(scanner.gatherRecordDeclarations(CanonicalPackage.EMPTY));
            declarations.addAll(scanner.gatherEnumDeclarations(CanonicalPackage.EMPTY));
            declarations.addAll(scanner.makeCallbacks(CanonicalPackage.EMPTY));
            declarations.add(new HeaderDeclaration()
            {
                @Override
                public List<FunctionSpecifier> functions()
                {
                    return specifiers;
                }

                @Override
                public List<Constant> constants()
                {
                    return scanner.constants();
                }

                @Override
                public String name()
                {
                    return HEADER_NAME;
                }

                @Override
                public CanonicalPackage location()
                {
                    return PACKAGE;
                }
            });

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
