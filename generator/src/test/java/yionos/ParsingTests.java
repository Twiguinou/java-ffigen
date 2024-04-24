package yionos;

import jpgen.SourceScopeScanner;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class ParsingTests
{
    private static final String TEST_HEADER_FILE = "test_header.h";

    private static String getAbsolutePath(String filename)
    {
        try
        {
            URI resourceUri = ParsingTests.class.getClassLoader().getResource(filename).toURI();
            return Paths.get(resourceUri).toFile().getAbsolutePath();
        }
        catch (URISyntaxException e)
        {
            throw new RuntimeException(e);
        }
    }

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

    public static void main()
    {
        configureLog4j();

        try (SourceScopeScanner scanner = new SourceScopeScanner(LogManager.getLogger("Test Parser"), false))
        {
            scanner.process(getAbsolutePath(TEST_HEADER_FILE), new String[] {});
        }
    }
}
