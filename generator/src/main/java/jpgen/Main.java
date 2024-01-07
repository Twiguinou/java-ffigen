package jpgen;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

import java.io.File;
import java.net.URISyntaxException;

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

    public static void main(String... args) throws URISyntaxException
    {
        configureLog4j();

        SourceScopeScanner scanner = new SourceScopeScanner();
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\Index.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXString.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\Rewrite.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\FatalErrorHandler.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\Documentation.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXSourceLocation.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXFile.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXDiagnostic.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXCompilationDatabase.h");
        scanner.process("C:\\msys64\\mingw64\\include\\clang-c\\CXErrorCode.h");

        File outputDirectory = new File(System.getProperty("user.dir"), "output_clang/jpgen/clang");
        if (outputDirectory.exists() || outputDirectory.mkdirs())
        {
            scanner.produceOutput(outputDirectory, "jpgen.clang", "Index_h", "libclang");
        }

        scanner.dispose();
    }
}
