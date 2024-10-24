package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.util.List;

public class FunctionDeclaration extends FunctionType.Wrapper implements Declaration<FunctionDeclaration>
{
    private final JavaPath m_path;
    private final List<String> m_parametersNames;
    public final Linkage linkage;

    public FunctionDeclaration(JavaPath path, Linkage linkage, Type.Reference<FunctionType> descriptorType,
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
    public FunctionDeclaration withPath(JavaPath path)
    {
        return new FunctionDeclaration(path, this.linkage, this.descriptorType, this.parametersNames());
    }

    @Override
    public String toString()
    {
        if (this.parametersNames().isEmpty())
        {
            return String.format("FunctionDeclaration[%s, descriptor=%s, linkage=%s]",
                    this.path(), this.descriptorType(), this.linkage);
        }

        return String.format("FunctionDeclaration[%s, descriptor=%s, linkage=%s, args={%s}]",
                this.path(), this.descriptorType(), this.linkage, String.join(", ", this.parametersNames()));
    }
}
