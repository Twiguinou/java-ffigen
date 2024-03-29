package jpgen.codegen.poet;

import javax.annotation.Nullable;

public sealed abstract class FieldDeclaration implements Declaration permits EnumField, MemberField
{
    private final String m_name;
    protected final @Nullable String initializer;

    protected FieldDeclaration(String name, @Nullable String initializer)
    {
        this.m_name = name;
        this.initializer = initializer;
    }

    @Override
    public String name()
    {
        return this.m_name;
    }

    @Override
    public boolean equals(Object o)
    {
        return o == this || (o instanceof FieldDeclaration field && field.name().equals(this.name()));
    }

    @Override
    public int hashCode()
    {
        return this.name().hashCode();
    }
}
