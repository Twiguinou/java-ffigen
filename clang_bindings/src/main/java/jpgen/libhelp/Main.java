package jpgen.libhelp;

import jpgen.SizedIterable;
import jpgen.SourceScopeScanner;
import jpgen.data.Declaration;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.Type;
import jpgen.printer.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.io.File;
import java.util.function.Function;
import java.util.stream.StreamSupport;

public class Main
{
    private static final String HEADER_NAME = "Index_h";
    private static final String LIB_NAME = "libclang";
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

    public static void main(String... args)
    {
        configureLog4j();

        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0, File::new)
                .map(dir -> new File(dir, DIRECTORY))
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        String clangCInclude = arguments.getArgValueIndexed("clang_c_include", 0, Function.identity())
                .orElseThrow(() -> new IllegalStateException("Missing clang_c_include argument."));

        try (SourceScopeScanner scanner = new SourceScopeScanner(LogManager.getLogger(Main.class), false))
        {
            scanner.process(String.format("%s/Index.h", clangCInclude), new String[] {});

            Iterable<FunctionSpecifier> specifiers = StreamSupport.stream(scanner.declarations().spliterator(), false)
                    .filter(decl -> decl instanceof FunctionType.Decl)
                    .map(decl -> FunctionSpecifier.of((FunctionType.Decl) decl))
                    .toList();

            ClassMaker maker = new ClassMaker(new Settings("jpgen.clang", "ptr", "gRecordLayout", "gDescriptor", "gUpcallStub"))
            {
                @Override
                public String getRecordTypeName(RecordType recordType)
                {
                    return recordType instanceof Declaration decl ? decl.name() : "Unnamed";
                }
            };

            StringBuilder builder = new StringBuilder();
            PrintingContext context = new PrintingContext(builder);

            maker.makeHeader(context, "Index_h", specifiers);
            System.out.println(builder);

            /*if (outputDirectory.exists() || outputDirectory.mkdirs())
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
            }*/
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
