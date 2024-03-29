package jpgen.codegen.poet;

import javax.annotation.Nullable;
import java.io.IOException;

public final class EnumField extends FieldDeclaration
{
    public EnumField(String name, @Nullable String initializer)
    {
        super(name, initializer);
    }

    @Override
    public Visibility visibility()
    {
        return Visibility.PUBLIC;
    }

    @Override
    public Scope scope()
    {
        return Scope.STATIC;
    }

    @Override
    public Mutability mutability()
    {
        return Mutability.FINAL;
    }

    @Override
    public void print(OutputContext context) throws IOException
    {
        context.append(this.name());
        if (this.initializer != null)
        {
            context.append('(').append(this.initializer).append(')');
        }
    }
}
