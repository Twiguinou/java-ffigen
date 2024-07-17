package jpgen.data;

import jpgen.ParallelIterable;
import jpgen.SizedIterable;

public record CallbackDeclaration(FunctionType type, CanonicalPackage location, String name, SizedIterable<String> parametersNames,
                                  String descriptorName, String stubName) implements Declaration
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "gDescriptor";
    public static final String DEFAULT_STUB_NAME = "gUpcallStub";

    public CallbackDeclaration
    {
        if (type.parameterTypes().size() != parametersNames.size())
        {
            throw new IllegalArgumentException("Invalid number of named parameters.");
        }
    }

    public CallbackDeclaration(FunctionType type, CanonicalPackage location, String name, SizedIterable<String> parametersNames)
    {
        this(type, location, name, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    public boolean requiresRedirect()
    {
        if (this.type.returnType().requiresRedirect())
        {
            return true;
        }

        for (Type parameterType : this.type.parameterTypes())
        {
            if (parameterType.requiresRedirect())
            {
                return true;
            }
        }

        return false;
    }

    public ParallelIterable<Type, String> getParameters()
    {
        return ParallelIterable.of(this.type.parameterTypes(), this.parametersNames);
    }
}
