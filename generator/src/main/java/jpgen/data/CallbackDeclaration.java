package jpgen.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CallbackDeclaration implements Declaration
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "gDescriptor";
    public static final String DEFAULT_STUB_NAME = "gUpcallStub";

    private final String m_name;
    private final CanonicalPackage m_location;
    public final FunctionType descriptorType;
    public final List<FunctionType.Parameter> parameters;
    public final String descriptorName, stubName;

    public CallbackDeclaration(String name, CanonicalPackage location, FunctionType type, List<String> parametersNames, String descriptorName, String stubName)
    {
        this.parameters = FunctionType.createParameters(type.parametersTypes(), parametersNames);
        this.m_name = name;
        this.m_location = location;
        this.descriptorType = type;
        this.descriptorName = descriptorName;
        this.stubName = stubName;
    }

    public CallbackDeclaration(String name, CanonicalPackage location, FunctionType type, String descriptorName, String stubName)
    {
        this(name, location, type, IntStream.range(0, type.parametersTypes().size())
                .mapToObj(i -> String.format("arg%d", i))
                .toList(),
                descriptorName, stubName);
    }

    @SuppressWarnings("unused")
    public CallbackDeclaration(String name, CanonicalPackage location, FunctionType type, List<String> parametersNames)
    {
        this(name, location, type, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    @SuppressWarnings("unused")
    public CallbackDeclaration(String name, CanonicalPackage location, FunctionType type)
    {
        this(name, location, type, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
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

    public boolean requiresRedirect()
    {
        if (this.descriptorType.returnType().requiresRedirect())
        {
            return true;
        }

        return this.descriptorType.parametersTypes().stream().anyMatch(Type::requiresRedirect);
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return String.format("VoidCallbackDeclaration[%s, returnType=%s, descriptor=%s, stub=%s]",
                    this.m_name, this.descriptorType.returnType(), this.descriptorName, this.stubName);
        }

        return String.format("CallbackDeclaration[%s, returnType=%s, variadic=%b, descriptor=%s, stub=%s, args={%s}]",
                this.m_name, this.descriptorType.returnType(), this.descriptorType.variadic(), this.descriptorName, this.stubName,
                this.parameters.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
