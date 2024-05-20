package jpgen.printer;

import jpgen.ParallelIterator;
import jpgen.SizedIterable;
import jpgen.data.FunctionType;
import jpgen.data.Type;

public record CallbackDescriptor(FunctionType type, String name, SizedIterable<String> parameterNames)
{
    public CallbackDescriptor
    {
        if (type.parameterTypes().size() != parameterNames.size())
        {
            throw new IllegalArgumentException("Invalid number of named parameters.");
        }
    }

    public ParallelIterator<Type, String> parameterIterator()
    {
        return ParallelIterator.of(this.type.parameterTypes().iterator(), this.parameterNames.iterator());
    }
}
