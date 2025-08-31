package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.util.Optional;

public record AliasDeclaration(Type underlying, ClassName path, Optional<CodeBlock> javadoc)
    implements Type.Delegated, Declaration
{
    public AliasDeclaration(Type underlying, ClassName path)
    {
        this(underlying, path, Optional.empty());
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetSymbolicName _ -> this.symbolicName();
            default -> Delegated.super.apply(feature);
        });
    }
}
