package jpgen;

import jpgen.data.FunctionType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main
{
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

    private static void validateHeaders(String[] headers) throws FileNotFoundException
    {
        for (String header : headers)
        {
            if (!((new File(header)).exists()))
            {
                throw new FileNotFoundException(header);
            }
        }
    }

    public static void main(String... args) throws FileNotFoundException
    {
        if (args.length != 1)
        {
            throw new IllegalArgumentException("Expected a single argument.");
        }

        ProgramOptions options = ProgramOptions.fromJsonFile(new File(System.getProperty("user.dir"), args[0]));
        if (options.headers().length == 0)
        {
            System.out.println("No headers were provided.");
            return;
        }

        configureLog4j();

        validateHeaders(options.headers());
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            String[] includeArgs = Arrays.stream(options.includePaths()).map(path -> STR."-I\{path}").toArray(String[]::new);
            for (String header : options.headers())
            {
                scanner.process(header, includeArgs);
            }

            if (options.templateFile().isPresent())
            {
                File outputFile = new File(options.templateFile().get());
                if (!(outputFile.exists() || outputFile.createNewFile()))
                {
                    throw new IllegalStateException("Failed to create output template file.");
                }

                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8)))
                {
                    List<String> functions = scanner.getDeclaredFunctions().stream().map(FunctionType.Declaration::fname).toList();
                    options.writeTemplate(functions, writer);
                }
            }
            else
            {
                Set<String> symbols = Arrays.stream(options.functions()).map(ProgramOptions.FunctionSymbol::name).collect(Collectors.toUnmodifiableSet());

                File outputDirectory = new File(System.getProperty("user.dir"), STR."output/\{options.packageName().replace('.', '/')}");
                if (outputDirectory.exists() || outputDirectory.mkdirs())
                {
                    scanner.produceOutput(outputDirectory, options.packageName(), options.mainClassName(), "vulkan-1", declaration -> !(declaration instanceof FunctionType.Declaration func) || symbols.contains(func.fname()));
                }
            }
        }
        catch (IOException e)
        {
            throw new IllegalStateException(e);
        }
    }
}
