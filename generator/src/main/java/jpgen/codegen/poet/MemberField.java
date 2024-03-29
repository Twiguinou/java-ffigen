package jpgen.codegen.poet;

import javax.annotation.Nullable;
import java.io.IOException;

public final class MemberField extends FieldDeclaration
{
    private final Visibility m_visibility;
    private final Scope m_scope;
    private final Mutability m_mutability;
    public final ClassLocation typeLocation;

    public MemberField(Visibility visibility, Scope scope, Mutability mutability, ClassLocation typeLocation, String name, @Nullable String initializer)
    {
        super(name, initializer);
        this.m_visibility = visibility;
        this.m_scope = scope;
        this.m_mutability = mutability;
        this.typeLocation = typeLocation;
    }

    public Visibility visibility()
    {
        return this.m_visibility;
    }

    public Scope scope()
    {
        return this.m_scope;
    }

    public Mutability mutability()
    {
        return this.m_mutability;
    }

    @Override
    public void print(OutputContext context) throws IOException
    {
        // Field modifiers
        if (this.m_scope != Scope.INSTANCE) context.append(this.m_scope.keyword()).append(' ');
        if (this.m_mutability != Mutability.MUTABLE) context.append(this.m_mutability.keyword()).append(' ');

        context.append(this.typeLocation.classpath()).append(' ').append(this.name());
        if (this.initializer != null) context.append(" = ").append(this.initializer);

        context.append(';');
    }
}
