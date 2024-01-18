package jpgen.codegen;

import jpgen.data.FunctionType;

import java.util.Optional;

public interface FunctionImport
{
    default boolean staticInit()
    {
        return true;
    }

    FunctionType.Declaration declaration();

    default String parameterClasspath(int index, String original)
    {
        return original;
    }

    default String unwrapParameter(int index, String argName, String original)
    {
        return original;
    }

    // Unused if native return type is void
    default String returnClasspath(String original)
    {
        return original;
    }

    // Unused if native return type is void
    default String wrapReturnValue(String value)
    {
        return value;
    }

    default Optional<String> handleReference(String[] parameterNames)
    {
        return Optional.empty();
    }
}
