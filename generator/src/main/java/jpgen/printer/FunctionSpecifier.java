package jpgen.printer;

import jpgen.data.FunctionType;

import java.util.Optional;

public interface FunctionSpecifier
{
    FunctionType.Decl function();

    Optional<String> getFunctionHandle(String[] parameters);

    Optional<String> getParameterType(int index);

    Optional<String> unwrapParameter(int index, String name);

    Optional<String> getParameterName(int index);

    static FunctionSpecifier of(FunctionType.Decl function)
    {
        return new FunctionSpecifier()
        {
            @Override
            public FunctionType.Decl function()
            {
                return function;
            }

            @Override
            public Optional<String> getFunctionHandle(String[] parameters)
            {
                return Optional.empty();
            }

            @Override
            public Optional<String> getParameterType(int index)
            {
                return Optional.empty();
            }

            @Override
            public Optional<String> unwrapParameter(int index, String name)
            {
                return Optional.empty();
            }

            @Override
            public Optional<String> getParameterName(int index)
            {
                return Optional.empty();
            }
        };
    }
}
