package fr.kenlek.jpgen.data;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FunctionDeclaration implements Declaration
{
    private final JavaPath m_path;
    public final FunctionType descriptorType;
    public final List<FunctionType.Parameter> parameters;
    public final Linkage linkage;

    public FunctionDeclaration(JavaPath path, Linkage linkage, FunctionType descriptorType,
                               List<String> parametersNames)
    {
        this.parameters = FunctionType.createParameters(descriptorType.parametersTypes(), parametersNames);
        this.m_path = path;
        this.linkage = linkage;
        this.descriptorType = descriptorType;
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
            return String.format("FunctionDeclaration[%s, returnType=%s, linkage=%s]",
                    this.m_path, this.descriptorType.returnType(), this.linkage);
        }

        return String.format("FunctionDeclaration[%s, returnType=%s, linkage=%s, args={%s}]",
                this.m_path, this.descriptorType.returnType(), this.linkage,
                this.parameters.stream().map(Objects::toString).collect(Collectors.joining(", ")));
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.descriptorType.getDependencies();
    }
}
