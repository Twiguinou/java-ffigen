package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.data.path.JavaPath;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionDeclaration extends FunctionType.Wrapper implements Declaration<FunctionDeclaration>
{
    private final JavaPath m_path;
    public final Linkage linkage;

    public FunctionDeclaration(JavaPath path, Linkage linkage, FunctionType descriptorType, List<String> parametersNames)
    {
        super(descriptorType, parametersNames);
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
        List<FunctionType.Parameter> parameters = this.createParameters();
        if (parameters.isEmpty())
        {
            return String.format("FunctionDeclaration[%s, descriptor=%s, linkage=%s]", this.path(), this.descriptorType, this.linkage);
        }

        return String.format("FunctionDeclaration[%s, linkage=%s, args={%s}]",
                this.path(), this.linkage, parameters.stream().map(FunctionType.Parameter::toString).collect(Collectors.joining(", ")));
    }
}
