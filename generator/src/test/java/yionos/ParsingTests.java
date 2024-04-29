package yionos;

import jpgen.data2.RecordType;
import jpgen.printer.ClassMaker;
import jpgen.SourceScopeScanner;
import org.apache.logging.log4j.LogManager;
import org.apache.velocity.util.StringBuilderWriter;

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

    public static void main(String... args)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(LogManager.getLogger("Test Parser"), false))
        {
            scanner.process(getAbsolutePath(TEST_HEADER_FILE), new String[] {});
            scanner.declarations().forEach(decl ->
            {
                if (decl instanceof RecordType.Decl recordDecl)
                {
                    StringBuilder lines = new StringBuilder();
                    try (StringBuilderWriter writer = new StringBuilderWriter(lines))
                    {
                        new ClassMaker().writeRecord(writer, "hello", recordDecl);
                    }

                    System.out.println(lines);
                }
            });
        }
    }
}
