package jpgen;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.net.URISyntaxException;
import java.nio.file.Paths;

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

    public static void main(String... args)
    {
        configureLog4j();
        //SourceScopeScanner scanner = new SourceScopeScanner("C:\\msys64\\mingw64\\include\\clang-c\\Index.h");
        //scanner.process();
        //scanner.dispose();
        try
        {
            SourceScopeScanner scanner = new SourceScopeScanner(Paths.get(Main.class.getClassLoader().getResource("test_header.h").toURI()).toString());
            scanner.process();
            scanner.dispose();
        }
        catch (URISyntaxException e)
        {
            throw new RuntimeException(e);
        }
    }
}
