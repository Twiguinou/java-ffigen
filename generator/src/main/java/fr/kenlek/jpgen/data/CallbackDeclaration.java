package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.List;

public class CallbackDeclaration extends FunctionType.Wrapper implements Declaration
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "DESCRIPTOR";
    public static final String DEFAULT_STUB_NAME = "UPCALL_STUB";

    private final JavaPath m_path;
    private final List<String> m_parametersNames;
    public final String descriptorName, stubName;

    public CallbackDeclaration(JavaPath path, Type descriptorType, List<String> parametersNames,
                               String descriptorName, String stubName)
    {
        super(descriptorType);
        parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
        this.descriptorName = LanguageUtils.requireJavaIdentifier(descriptorName);
        this.stubName = LanguageUtils.requireJavaIdentifier(stubName);
        this.m_path = path;
        this.m_parametersNames = parametersNames;
    }

    public CallbackDeclaration(JavaPath path, Type descriptorType, List<String> parametersNames)
    {
        this(path, descriptorType, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
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
        if (this.m_parametersNames.isEmpty())
        {
            return String.format("CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s]",
                    this.m_path, this.descriptorType(), this.descriptorName, this.stubName);
        }

        return String.format("CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s, args={%s}]",
                this.m_path, this.descriptorType(), this.descriptorName, this.stubName,
                String.join(", ", this.m_parametersNames));
    }
}
