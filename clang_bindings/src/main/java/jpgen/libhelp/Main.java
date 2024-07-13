package jpgen.libhelp;

import jpgen.*;
import jpgen.data.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        LocationProvider.ModuleTree moduleTree = LocationProvider.ModuleTree.of(clangCInclude, PACKAGE);

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Generator"), false, LocationProvider.of(moduleTree)))
        {
            scanner.process(clangCInclude.resolve("Index.h"), new String[] {}, clangCInclude);

            List<HeaderDeclaration.FunctionSpecifier> specifiers = scanner.functions().stream()
                    .map(HeaderDeclaration.FunctionSpecifier::of)
                    .toList();

            HeaderDeclaration header = new HeaderDeclaration()
            {
                @Override
                public Iterable<FunctionSpecifier> functions()
                {
                    return specifiers;
                }

                @Override
                public Iterable<Constant> constants()
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
            };

            List<RecordType.Decl> records = scanner.getTypeTable().values().stream()
                    .filter(type -> type instanceof RecordType.Decl)
                    .map(type -> (RecordType.Decl)type)
                    .toList();

            List<EnumType.Decl> enums = scanner.getTypeTable().values().stream()
                    .filter(type -> type instanceof EnumType.Decl)
                    .map(type -> (EnumType.Decl)type)
                    .toList();

            List<CallbackDeclaration> callbacks = scanner.getTypeTable().values().stream()
                    .filter(type -> type instanceof Type.Alias && type.flatten() instanceof Type.Pointer pointer && pointer.referencedType.flatten() instanceof FunctionType)
                    .map(type ->
                    {
                        Type.Alias alias = (Type.Alias) type;
                        Type.Pointer pointer = (Type.Pointer) alias.flatten();
                        FunctionType functionType = (FunctionType) pointer.referencedType.flatten();

                        String[] parameterNames = new String[functionType.parameterTypes().size()];
                        for (int i = 0; i < parameterNames.length; i++)
                        {
                            parameterNames[i] = String.format("arg%d", i);
                        }

                        return new CallbackDeclaration(functionType, PACKAGE, alias.identifier(), SizedIterable.ofArray(parameterNames));
                    })
                    .toList();

            if (outputDirectory.exists() || outputDirectory.mkdirs())
            {
                for (EnumType.Decl enumDecl : enums)
                {
                    StringBuilder code = new StringBuilder();
                    ClassMaker.makeEnum(new PrintingContext(code), enumDecl);
                    printToFile(code.toString(), new File(outputDirectory, String.format("%s.java", enumDecl.name())));
                }

                for (RecordType.Decl record : records)
                {
                    if (record.layout().isEmpty())
                    {
                        continue;
                    }

                    StringBuilder code = new StringBuilder();
                    ClassMaker.makeRecord(new PrintingContext(code), record);
                    printToFile(code.toString(), new File(outputDirectory, String.format("%s.java", record.name())));
                }

                for (CallbackDeclaration callback : callbacks)
                {
                    StringBuilder code = new StringBuilder();
                    ClassMaker.makeCallback(new PrintingContext(code), callback);
                    printToFile(code.toString(), new File(outputDirectory, String.format("%s.java", callback.name())));
                }

                StringBuilder headerCode = new StringBuilder();
                ClassMaker.makeHeader(new PrintingContext(headerCode), header);
                printToFile(headerCode.toString(), new File(outputDirectory, String.format("%s.java", HEADER_NAME)));
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        System.loadLibrary("libclang");
    }
}
