package jpgen.data;

import java.util.List;
import java.util.Optional;

public interface HeaderDeclaration extends Declaration
{
    List<FunctionSpecifier> functions();

    List<Constant> constants();

    enum CriticalState
    {
        NON_CRITICAL,
        CRITICAL_DISALLOW_HEAP,
        CRITICAL_ALLOW_HEAP
    }

    interface FunctionSpecifier
    {
        FunctionDeclaration function();

        Optional<String> getFunctionHandle();

        default CriticalState criticalState()
        {
            return CriticalState.NON_CRITICAL;
        }

        default Optional<String> getAllocatorParameterName()
        {
            if (this.function().descriptorType.returnType().flatten() instanceof RecordType)
            {
                return Optional.of("allocator");
            }

            return Optional.empty();
        }

        static FunctionSpecifier of(FunctionDeclaration function)
        {
            return new FunctionSpecifier()
            {
                @Override
                public FunctionDeclaration function()
                {
                    return function;
                }

                @Override
                public Optional<String> getFunctionHandle()
                {
                    return Optional.empty();
                }
            };
        }
    }
}
