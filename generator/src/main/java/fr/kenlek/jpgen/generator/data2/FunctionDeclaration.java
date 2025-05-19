package fr.kenlek.jpgen.generator.data2;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionDeclaration extends FunctionType.Wrapper implements Declaration
{
    private final JavaPath m_path;
    public final Linkage linkage;

    public FunctionDeclaration(JavaPath path, Linkage linkage, FunctionType descriptorType, List<String> parameterNames)
    {
        super(descriptorType, parameterNames);
        Declaration.checkPath(path);
        this.m_path = path;
        this.linkage = linkage;
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return "FunctionDeclaration[%s, descriptor=%s, linkage=%s]".formatted(this.path(), this.descriptorType, this.linkage);
        }

        return "FunctionDeclaration[%s, linkage=%s, args={%s}]".formatted(this.path(), this.linkage,
            this.parameters.stream().map(FunctionType.Parameter::toString).collect(Collectors.joining(", ")));
    }
}
