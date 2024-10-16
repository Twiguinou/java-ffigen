package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.List;

public class FunctionDeclaration extends FunctionType.Wrapper implements Declaration
{
    private final JavaPath m_path;
    private final List<String> m_parametersNames;
    public final Linkage linkage;

    public FunctionDeclaration(JavaPath path, Linkage linkage, Type descriptorType,
                               List<String> parametersNames)
    {
        super(descriptorType);
        parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
        this.m_parametersNames = parametersNames;
        this.m_path = path;
        this.linkage = linkage;
    }

    @Override
    public List<String> parametersNames()
    {
        return this.m_parametersNames;
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public String toString()
    {
        if (this.parametersNames().isEmpty())
        {
            return String.format("FunctionDeclaration[%s, descriptor=%s, linkage=%s]",
                    this.m_path, this.rawDescriptorType, this.linkage);
        }

        return String.format("FunctionDeclaration[%s, descriptor=%s, linkage=%s, args={%s}]",
                this.m_path, this.rawDescriptorType, this.linkage, String.join(", ", this.m_parametersNames));
    }
}
