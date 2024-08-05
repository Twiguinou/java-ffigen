package fr.kenlek.jpgen.data;

import java.util.Optional;

public class Binding
{
    public enum CriticalState
    {
        NON_CRITICAL,
        CRITICAL_DISALLOW_HEAP,
        CRITICAL_ALLOW_HEAP
    }

    public final FunctionDeclaration function;
    public final CriticalState criticalState;

    public Binding(FunctionDeclaration function, CriticalState criticalState)
    {
        this.function = function;
        this.criticalState = criticalState;
    }

    public Binding(FunctionDeclaration function)
    {
        this(function, CriticalState.NON_CRITICAL);
    }

    public Optional<String> getFunctionHandle()
    {
        return Optional.empty();
    }

    public Optional<String> getAllocatorParameterName()
    {
        if (this.function.descriptorType.returnType().flatten() instanceof RecordType)
        {
            return Optional.of("allocator");
        }

        return Optional.empty();
    }
}
