package fr.kenlek.jpgen.libhelp;

import fr.kenlek.jpgen.ElementFilter;
import fr.kenlek.jpgen.HostReference;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.ParseResults;
import fr.kenlek.jpgen.PathProvider;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.ResultsAggregate;
import fr.kenlek.jpgen.SourceScopeScanner;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.CodeUtils;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MultiPassMain
{
    public static void main(String... args)
    {
        JavaPath PKG = JavaPath.of("test");
        HostReference globalHost = new HostReference("", JavaPath.of("global_host_path"));

        Path testHeader = Path.of("clang-bindings/src/main/resources/test_header.h");
        PathProvider pathProvider = new PathProvider.ModuleTree(testHeader, PKG, List.of());
        ParseOptions.Hints hints = new ParseOptions.Hints(pathProvider, ElementFilter.ofConfined(testHeader), false);

        Map<HostReference, ParseOptions> options = Map.of(
                new HostReference("linux", JavaPath.of("linux_host_path")), new ParseOptions.Builder(hints)
                        .addHeader(testHeader)
                        .build(),
                new HostReference("win32", JavaPath.of("win32_host_path")), new ParseOptions.Builder(hints)
                        .addHeader(testHeader)
                        .addArgument("--target=x86_64-pc-windows-gnu")
                        .build()
        );

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Test"), false);
             ResultsAggregate aggregate = new ResultsAggregate(scanner))
        {
            for (Map.Entry<HostReference, ParseOptions> entry : options.entrySet())
            {
                aggregate.process(entry.getKey(), entry.getValue());
            }

            List<Declaration.CodeGenerator<?>> declarations = new ArrayList<>();

            // just to make sure of the type
            Map<JavaPath, Map<HostReference, ParseResults.TypeKey>> typeDeclarations = aggregate.gatherTypeDeclarations(PKG);
            Map<JavaPath, Map<HostReference, CallbackDeclaration>> callbacks = aggregate.makeCallbacks(PKG);

            for (var entry : typeDeclarations.entrySet())
            {
                Map<HostReference, ParseResults.TypeKey> versions = entry.getValue();
                JavaPath path = entry.getKey();

                Map<HostReference, ? extends Declaration<?>> specialized = CodeUtils.specializeOpaque(versions.entrySet().stream()
                        .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, e -> (Declaration<?>)e.getValue().discover())),
                        globalHost, host -> path.parent().child(host.name()).child(path.tail()));

                if (specialized.containsKey(globalHost))
                {
                    Declaration<?> value = specialized.get(globalHost);
                    versions.forEach((host, typeKey) -> aggregate.results(host).typeTable.put(typeKey, (Type)value));
                }
                else
                {
                    versions.forEach((host, typeKey) ->
                    {
                        Declaration<?> value = specialized.get(host);
                        aggregate.results(host).typeTable.put(typeKey, (Type)value);
                    });
                }

                specialized.values().forEach(value ->
                {
                    if (value instanceof Declaration.CodeGenerator<?> generator)
                    {
                        declarations.add(generator);
                    }
                });
            }

            for (var entry : callbacks.entrySet())
            {
                Map<HostReference, CallbackDeclaration> versions = entry.getValue();
                JavaPath path = entry.getKey();

                Map<HostReference, CallbackDeclaration> specialized = CodeUtils.specializeCallbacks(versions, globalHost,
                        host -> path.parent().child(host.name()).child(path.tail()));

                declarations.addAll(specialized.values());
            }

            Map<HostReference, List<HeaderDeclaration.Constant>> hostsConstants = aggregate.constants();
            Map<HostReference, List<HeaderDeclaration.Binding>> hostsBindings = aggregate.gatherBindings(PKG);
            Map<HostReference, HeaderDeclaration> headers = new HashMap<>();
            for (HostReference host : options.keySet())
            {
                List<HeaderDeclaration.Constant> constants = hostsConstants.get(host);
                List<HeaderDeclaration.Binding> bindings = hostsBindings.get(host);

                headers.put(host, new HeaderDeclaration(PKG.child("TestHeader"), bindings, constants));
            }

            Map<HostReference, HeaderDeclaration> specializedHeaders = CodeUtils.specializeHeaders(headers, globalHost,
                    host -> PKG.child(host.name()).child("TestHeader"));
            declarations.addAll(specializedHeaders.values());

            declarations.add(Declaration.resolveLayouts(PKG.child("Layouts"), declarations));
            for (Declaration.CodeGenerator<?> declaration : declarations)
            {
                System.out.println();
                System.out.println("------   " + declaration.path() + "   ------");
                StringBuilder code = new StringBuilder();
                try
                {
                    declaration.writeSourceFile(new PrintingContext(code), declarations.getLast().path());
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }

                System.out.println(code);
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static
    {
        Optional.ofNullable(System.getenv("LIBCLANG_19_PATH")).ifPresentOrElse(
                System::load,
                () -> System.loadLibrary("clang-19")
        );
    }
}
