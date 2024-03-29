package jpgen.codegen.poet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public sealed abstract class TypeDeclaration implements Declaration permits EnumDeclaration
{
    private final Visibility m_visibility;
    private final Scope m_scope;
    private final Mutability m_mutability;
    public final ClassLocation location;
    public final Iterable<Declaration> declarations;

    protected TypeDeclaration(Visibility visibility, Scope scope, Mutability mutability, ClassLocation location, Iterable<Declaration> declarations)
    {
        this.m_visibility = visibility;
        this.m_scope = scope;
        this.m_mutability = mutability;
        this.location = location;
        this.declarations = declarations;
    }

    @Override
    public String name()
    {
        return this.location.name();
    }

    @Override
    public Visibility visibility()
    {
        return this.m_visibility;
    }

    @Override
    public Scope scope()
    {
        return this.m_scope;
    }

    @Override
    public Mutability mutability()
    {
        return this.m_mutability;
    }

    public static sealed abstract class Builder permits EnumDeclaration.Builder
    {
        public final ClassLocation location;
        private final List<Declaration> m_declarations = new ArrayList<>();
        private final Set<String> m_fieldNames = new HashSet<>();
        private final Set<String> m_otherNames = new HashSet<>();
        public final Declaration.Visibility visibility;
        public final Declaration.Scope scope;
        public final Declaration.Mutability mutability;

        protected Builder(Declaration.Visibility visibility, Declaration.Scope scope, Declaration.Mutability mutability, ClassLocation location)
        {
            this.location = location;
            this.visibility = visibility;
            this.scope = scope;
            this.mutability = mutability;
        }

        public Iterable<Declaration> declarations()
        {
            return this.m_declarations;
        }

        protected abstract boolean isValidDeclaration(Declaration declaration);

        public Builder appendDeclaration(Declaration declaration)
        {
            if (!this.isValidDeclaration(declaration))
            {
                throw new IllegalArgumentException("Invalid declaration for class type.");
            }

            if (declaration instanceof FieldDeclaration)
            {
                if (!this.m_fieldNames.add(declaration.name()))
                {
                    throw new IllegalArgumentException(STR."Field was already declared: \{declaration.name()}");
                }
            }
            else if (!this.m_otherNames.add(declaration.name()))
            {
                throw new IllegalArgumentException(STR."Declaration name already used: \{declaration.name()}");
            }

            this.m_declarations.add(declaration);
            return this;
        }

        public abstract TypeDeclaration build();
    }
}
