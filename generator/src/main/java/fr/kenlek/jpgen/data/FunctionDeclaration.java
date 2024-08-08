package fr.kenlek.jpgen.data;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionDeclaration implements Declaration
{
    private final String m_name;
    private final CanonicalPackage m_location;
    public final FunctionType descriptorType;
    public final List<FunctionType.Parameter> parameters;
    public final Linkage linkage;

    public FunctionDeclaration(String name, CanonicalPackage location, Linkage linkage, FunctionType descriptorType, List<String> parametersNames)
    {
        this.parameters = FunctionType.createParameters(descriptorType.parametersTypes(), parametersNames);
        this.m_name = name;
        this.linkage = linkage;
        this.descriptorType = descriptorType;
        this.m_location = location;
    }

    @Override
    public String name()
    {
        return this.m_name;
    }

    @Override
    public CanonicalPackage location()
    {
        return this.m_location;
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return String.format("VoidFunctionDeclaration[%s, returnType=%s, linkage=%s]", this.m_name, this.descriptorType.returnType(), this.linkage);
        }

        return String.format("FunctionDeclaration[%s, returnType=%s, variadic=%b, linkage=%s, args={%s}]",
                this.m_name, this.descriptorType.returnType(), this.descriptorType.variadic(), this.linkage,
                this.parameters.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
