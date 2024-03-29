package jpgen.libhelp;

import jpgen.ProgramArguments;
import jpgen.SourceScopeScanner;
import jpgen.codegen.FunctionImport;
import jpgen.codegen.HeaderInformation;
import jpgen.codegen.RecordInformation;
import jpgen.codegen.TypeTranslation;
import jpgen.codegen.poet.ClassLocation;
import jpgen.codegen.poet.EnumDeclaration;
import jpgen.codegen.poet.MemberField;
import jpgen.codegen.poet.MethodDeclaration;
import jpgen.codegen.poet.OutputContext;
import jpgen.codegen.poet.TypeDeclaration;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import static jpgen.codegen.ClassMaker.*;
import static jpgen.codegen.CommonFunctions.*;

public class Main
{
    private static final String HEADER_NAME = "Index_h";
    private static final String LIB_NAME = "libclang";
    private static final String DIRECTORY = "jpgen/clang";
    private static final String PACKAGE = DIRECTORY.replaceAll("/", ".");

    public static void main(String... args) throws IOException
    {
        TypeDeclaration enumDecl = new EnumDeclaration.Builder(jpgen.codegen.poet.Declaration.Visibility.PUBLIC, new ClassLocation("jpgen.clang", "TestEnum"))
                .appendDeclaration(new MethodDeclaration.Builder(jpgen.codegen.poet.Declaration.Visibility.PACKAGE, false, false, new ClassLocation(int.class), "test_mtd", false)
                        .appendParameter(new MethodDeclaration.Parameter(new ClassLocation(int.class), "test_param"))
                        .appendParameter(new MethodDeclaration.Parameter(new ClassLocation(String.class), "WhatTheFuck"))
                        .appendInstruction("return test_param;")
                        .build())
                .appendDeclaration(new MethodDeclaration.Builder(jpgen.codegen.poet.Declaration.Visibility.PRIVATE, false, false, null, "TestEnum", false)
                        .appendNoOp()
                        .build())
                .appendDeclaration(new MemberField(jpgen.codegen.poet.Declaration.Visibility.PUBLIC, jpgen.codegen.poet.Declaration.Scope.STATIC, jpgen.codegen.poet.Declaration.Mutability.FINAL, new ClassLocation(int.class), "hello", null))
                .build();

        OutputContext context = new OutputContext(new StringBuilder(), "    ", System.lineSeparator());
        jpgen.codegen.poet.Declaration.printSourceFile(enumDecl, context);

        System.out.println(context.output);

        System.exit(0);


        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0, File::new)
                .map(dir -> new File(dir, DIRECTORY))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        String clangCInclude = arguments.getArgValueIndexed("clang_c_include", 0, Function.identity())
                .orElseThrow(() -> new IllegalStateException("Missing clang_c_include argument."));

        SourceScopeScanner.configureLog4j();
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{clangCInclude}/Index.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/Rewrite.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/Platform.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/FatalErrorHandler.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/ExternC.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/Documentation.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXString.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXSourceLocation.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXFile.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXErrorCode.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXDiagnostic.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/CXCompilationDatabase.h", new String[] {});
            scanner.process(STR."\{clangCInclude}/BuildSystem.h", new String[] {});

            if (outputDirectory.exists() || outputDirectory.mkdirs())
            {
                HeaderInformation headerInfo = new HeaderInformation(HEADER_NAME, PACKAGE, "gSystemLinker", "gLibLookup");
                Map<Declaration<?>, String> typeNames = scanner.translateDeclarations();
                TypeTranslation translation = new TypeTranslation()
                {
                    @Override
                    public HeaderInformation headerInfo()
                    {
                        return headerInfo;
                    }

                    @Override
                    public RecordInformation recordInfo(TypeManifold type)
                    {
                        return new RecordInformation(typeNames.get((RecordType)flattenType(type)), PACKAGE, "gStructLayout", "ptr");
                    }
                };

                for (Declaration<?> declaration : scanner.gatherTypeDeclarations())
                {
                    Optional<String> code = switch (declaration)
                    {
                        case EnumType enumType -> Optional.of(generateEnum(enumType, translation, PACKAGE, typeNames.get(enumType)));
                        case RecordType recordType ->
                        {
                            try
                            {
                                yield Optional.of(generateRecord(recordType, translation));
                            }
                            catch (Throwable _)
                            {
                                yield Optional.empty();
                            }
                        }
                        case FunctionType.Callback callback -> Optional.of(generateCallback(callback, translation, PACKAGE, typeNames.get(callback), "gDescriptor", "gUpcallStub"));
                        default -> Optional.empty();
                    };

                    code.ifPresent(codeString ->
                    {
                        File outputFile = new File(outputDirectory, STR."\{typeNames.get(declaration)}.java");
                        try (FileOutputStream outputStream = new FileOutputStream(outputFile))
                        {
                            outputStream.write(codeString.getBytes(StandardCharsets.UTF_8));
                        }
                        catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
                }

                File headerFile = new File(outputDirectory, STR."\{HEADER_NAME}.java");
                try (FileOutputStream outputStream = new FileOutputStream(headerFile))
                {
                    List<FunctionImport> imports = new ArrayList<>();
                    for (FunctionType.Declaration function : scanner.getDeclaredFunctions())
                    {
                        imports.add(() -> function);
                    }

                    outputStream.write(generateHeader(translation, LIB_NAME, imports, scanner.getMacroConstants()).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
            else
            {
                throw new IllegalStateException("Failed to create output directory folder.");
            }
        }
    }
}
