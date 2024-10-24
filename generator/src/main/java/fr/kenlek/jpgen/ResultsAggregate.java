package fr.kenlek.jpgen;

import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ResultsAggregate implements AutoCloseable
{
    public final SourceScopeScanner scanner;
    private final Map<HostReference, ParseResults> m_results = new HashMap<>();

    public ResultsAggregate(SourceScopeScanner scanner)
    {
        this.scanner = scanner;
    }

    public boolean process(HostReference host, ParseOptions options) throws IOException, ClangException
    {
        if (this.m_results.containsKey(host)) return false;

        this.m_results.put(host, this.scanner.process(options));
        return true;
    }

    public Set<HostReference> hosts()
    {
        return this.m_results.keySet();
    }

    public ParseResults results(HostReference host)
    {
        return Objects.requireNonNull(this.m_results.get(host));
    }

    public Map<JavaPath, Map<HostReference, ParseResults.TypeKey>> gatherTypeDeclarations(JavaPath path)
    {
        record HostKeyPair(HostReference host, ParseResults.TypeKey typeKey) {}

        return this.m_results.entrySet().stream()
                .flatMap(entry -> entry.getValue().typeTable.entrySet().stream()
                        .filter(e -> e.getValue() instanceof Declaration<?> declaration && path.contains(declaration.path()))
                        .map(e -> new HostKeyPair(entry.getKey(), e.getKey())))
                .collect(Collectors.groupingBy(pair -> ((Declaration<?>)pair.typeKey().discover()).path(),
                        Collectors.toUnmodifiableMap(HostKeyPair::host, HostKeyPair::typeKey)));
    }

    public Map<JavaPath, Map<HostReference, CallbackDeclaration>> makeCallbacks(JavaPath path, String descriptorName, String stubName)
    {
        record HostCallbackPair(HostReference host, CallbackDeclaration callback) {}

        return this.m_results.entrySet().stream()
                .flatMap(entry -> entry.getValue().makeCallbacks(path, descriptorName, stubName).stream()
                        .map(callback -> new HostCallbackPair(entry.getKey(), callback)))
                .collect(Collectors.groupingBy(pair -> pair.callback.path(),
                        Collectors.toUnmodifiableMap(HostCallbackPair::host, HostCallbackPair::callback)));
    }

    public Map<JavaPath, Map<HostReference, CallbackDeclaration>> makeCallbacks(JavaPath path)
    {
        return makeCallbacks(path, CallbackDeclaration.DEFAULT_DESCRIPTOR_NAME, CallbackDeclaration.DEFAULT_STUB_NAME);
    }

    public Map<HostReference, List<HeaderDeclaration.Constant>> constants()
    {
        return this.m_results.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().constants));
    }

    public Map<HostReference, List<HeaderDeclaration.Binding>> gatherBindings(JavaPath path)
    {
        return this.m_results.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().gatherBindings(path)));
    }

    @Override
    public void close()
    {
        this.m_results.values().forEach(ParseResults::close);
        this.m_results.clear();
    }
}
