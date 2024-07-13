package jpgen.data;

import java.util.Optional;

public interface HeaderDeclaration extends Declaration
{
    Iterable<FunctionSpecifier> functions();

    Iterable<Constant> constants();

    enum CriticalState
    {
        NON_CRITICAL,
        CRITICAL_DISALLOW_HEAP,
        CRITICAL_ALLOW_HEAP
    }

    interface FunctionSpecifier
    {
        FunctionType.Decl function();

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
                public Optional<String> getFunctionHandle()
                {
                    return Optional.empty();
                }
            };
        }
    }
}
