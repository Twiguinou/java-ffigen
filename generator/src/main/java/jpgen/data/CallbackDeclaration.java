package jpgen.data;

import jpgen.ParallelIterator;
import jpgen.SizedIterable;

import java.util.Optional;

public class CallbackDeclaration implements Declaration
{
    public final FunctionType type;
    private final String m_javaPackage;
    private final String m_name;
    public final SizedIterable<String> parameterNames;
    public final String descriptorName, stubName;

    public CallbackDeclaration(FunctionType type, String javaPackage, String name, SizedIterable<String> parameterNames, String descriptorName, String stubName)
    {
        if (type.parameterTypes().size() != parameterNames.size())
        {
            throw new IllegalArgumentException("Invalid number of named parameters.");
        }

        this.type = type;
        this.m_javaPackage = javaPackage;
        this.m_name = name;
        this.parameterNames = parameterNames;
        this.descriptorName = descriptorName;
        this.stubName = stubName;
    }

    public CallbackDeclaration(FunctionType type, String javaPackage, String name, SizedIterable<String> parameterNames)
    {
        this(type, javaPackage, name, parameterNames, "gDescriptor", "gUpcallStub");
    }

    @Override
    public String name()
    {
        return this.m_name;
    }

    @Override
    public Optional<String> canonicalPackage()
    {
        if (this.m_javaPackage.isEmpty())
        {
            return Optional.empty();
        }

        return Optional.of(this.m_javaPackage);
    }

    public boolean requiresRedirect()
    {
        if (!this.type.returnType().getWrappedFunctionReturnType().equals(this.type.returnType().getUnwrappedFunctionReturnType()))
        {
            return true;
        }

        for (Type parameterType : this.type.parameterTypes())
        {
            if (!parameterType.getWrappedFunctionParameterType().equals(parameterType.getUnwrappedFunctionParameterType()))
            {
                return true;
            }
        }

        return false;
    }

    public final ParallelIterator<Type, String> getParameterIterator()
    {
        return ParallelIterator.of(this.type.parameterTypes().iterator(), this.parameterNames.iterator());
    }
}
