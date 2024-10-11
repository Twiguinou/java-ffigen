package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CallbackDeclaration implements Declaration
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "DESCRIPTOR";
    public static final String DEFAULT_STUB_NAME = "UPCALL_STUB";

    private final JavaPath m_path;
    public final FunctionType descriptorType;
    public final List<FunctionType.Parameter> parameters;
    public final String descriptorName, stubName;

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parametersNames,
                               String descriptorName, String stubName)
    {
        this.parameters = FunctionType.createParameters(descriptorType.parametersTypes(), parametersNames);
        this.m_path = path;
        this.descriptorType = descriptorType;
        this.descriptorName = LanguageUtils.requireJavaIdentifier(descriptorName);
        this.stubName = LanguageUtils.requireJavaIdentifier(stubName);
    }

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType,
                               String descriptorName, String stubName)
    {
        this(path, descriptorType, IntStream.range(0, descriptorType.parametersTypes().size())
                .mapToObj(i -> String.format("arg%d", i))
                .toList(),
                descriptorName, stubName);
    }

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parametersNames)
    {
        this(path, descriptorType, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType)
    {
        this(path, descriptorType, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.descriptorType.getDependencies();
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return String.format("CallbackDeclaration[%s, returnType=%s, descriptor=%s, stub=%s]",
                    this.m_path, this.descriptorType.returnType(), this.descriptorName, this.stubName);
        }

        return String.format("CallbackDeclaration[%s, returnType=%s, variadic=%b, descriptor=%s, stub=%s, args={%s}]",
                this.m_path, this.descriptorType.returnType(), this.descriptorType.variadic(), this.descriptorName, this.stubName,
                this.parameters.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
