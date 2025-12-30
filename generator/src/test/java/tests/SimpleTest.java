package tests;

import module java.base;

import com.palantir.javapoet.ClassName;
import fr.kenlek.jpgen.generator.*;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.HeaderDeclaration;

import static java.util.Objects.requireNonNull;

public final class SimpleTest
{private SimpleTest() {}

    static void main() throws IOException
    {
        Path headerPath = Files.createTempFile("simple", "h");
        try (InputStream input = requireNonNull(SimpleTest.class.getClassLoader().getResourceAsStream("simple.h")))
        {
            Files.copy(input, headerPath, StandardCopyOption.REPLACE_EXISTING);
            headerPath.toFile().deleteOnExit();
        }
        catch (Throwable t)
        {
            Files.deleteIfExists(headerPath);
            throw t;
        }

        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            ParseResults results = scanner.parse(headerPath, List.of(), new ParseOptions(
                ElementFilter.of(headerPath), PathProvider.TOP_LEVEL,
                TypeResolver.NAMED_CALLBACKS.or(TypeResolver.DEFAULT)
            ));

            List<Declaration> declarations = new ArrayList<>(results.typeDeclarations());
            declarations.add(new HeaderDeclaration(ClassName.get("", "TestHeader"), results.functions()));
            for (Declaration declaration : declarations)
            {
                declaration.build(ClassName.get("", "Layouts")).ifPresent(IO::println);
            }
        }
    }
}
