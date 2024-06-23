package jpgen.libhelp;

import jpgen.SizedIterable;
import jpgen.SourceScopeScanner;
import jpgen.data.CallbackDeclaration;
import jpgen.data.Constant;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.ClassMaker;
import jpgen.data.HeaderDeclaration;
import jpgen.PrintingContext;
import jpgen.data.RecordType;
import jpgen.data.Type;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

public class Main
{
    private static final String HEADER_NAME = "Index_h";
    private static final String DIRECTORY = "jpgen/clang";
    private static final String PACKAGE = DIRECTORY.replaceAll("/", ".");

    private static void configureLog4j()
    {
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

        builder.setConfigurationName("jpgen-log4j-logger");
        builder.setStatusLevel(Level.WARN);

        builder.add(builder.newAppender("Console", "CONSOLE")
                .addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT)
                .add(builder.newLayout("PatternLayout")
                        .addAttribute("disableAnsi", false)
                        .addAttribute("pattern", "%highlight{[%d] - %msg%n}{FATAL=red blink, ERROR=red, WARN=yellow bold, INFO=green, DEBUG=green bold, TRACE=blue}")));

        builder.add(builder.newRootLogger(Level.ALL)
                .add(builder.newAppenderRef("Console")));

        Configurator.reconfigure(builder.build());
    }

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
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0, File::new)
                .map(dir -> new File(dir, DIRECTORY))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        File clangCInclude = arguments.getArgValueIndexed("clang_c_include", 0, File::new)
                .filter(File::isDirectory)
                .orElseThrow(() -> new IllegalStateException("Missing clang_c_include argument."));

        configureLog4j();

        try (SourceScopeScanner scanner = new SourceScopeScanner(LogManager.getLogger(Main.class), false, PACKAGE))
        {
            scanner.process(new File(clangCInclude, "Index.h").toPath(), new String[] {}, clangCInclude.toPath());

            List<HeaderDeclaration.FunctionSpecifier> specifiers = new ArrayList<>();
            for (Declaration decl : scanner.declarations())
            {
                if (decl instanceof FunctionType.Decl func)
                {
                    specifiers.add(HeaderDeclaration.FunctionSpecifier.of(func));
                }
            }

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
                public Optional<String> canonicalPackage()
                {
                    return Optional.of(PACKAGE);
                }
            };

            Iterable<Type> types = scanner.getTypeTable().values();

            List<RecordType.Decl> records = StreamSupport.stream(types.spliterator(), false)
                    .map(Type::discover)
                    .filter(type -> type instanceof RecordType.Decl)
                    .distinct()
                    .map(type -> (RecordType.Decl)type)
                    .toList();

            List<EnumType.Decl> enums = StreamSupport.stream(types.spliterator(), false)
                    .map(Type::discover)
                    .filter(type -> type instanceof EnumType.Decl)
                    .distinct()
                    .map(type -> (EnumType.Decl)type)
                    .toList();

            List<CallbackDeclaration> callbacks = StreamSupport.stream(types.spliterator(), false)
                    .map(Type::discover)
                    .filter(type -> type instanceof Type.Alias && type.flatten() instanceof Type.Pointer pointer && pointer.referencedType.flatten() instanceof FunctionType)
                    .distinct()
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
