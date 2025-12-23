package tests;

import module java.base;

import com.palantir.javapoet.ClassName;
import fr.kenlek.jpgen.generator.ElementFilter;
import fr.kenlek.jpgen.generator.ParseOptions;
import fr.kenlek.jpgen.generator.ParseResults;
import fr.kenlek.jpgen.generator.PathProvider;
import fr.kenlek.jpgen.generator.SourceScopeScanner;
import fr.kenlek.jpgen.generator.TypeResolver;
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
            List<Declaration> declarations = new ArrayList<>();
            ParseResults results = scanner.parse(headerPath, List.of(), new ParseOptions(
                ElementFilter.of(headerPath), PathProvider.TOP_LEVEL,
                TypeResolver.NAMED_CALLBACKS.or(TypeResolver.DEFAULT)
            ));

            declarations.addAll(results.typeDeclarations());
            declarations.add(new HeaderDeclaration(ClassName.get("", "TestHeader"), results.functions()));
            for (Declaration declaration : declarations)
            {
                declaration.build(ClassName.get("", "Layouts")).ifPresent(IO::println);
            }
        }
    }
}
