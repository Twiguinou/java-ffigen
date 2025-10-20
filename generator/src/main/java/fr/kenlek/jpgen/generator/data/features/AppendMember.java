package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.LayoutPath;
import java.util.Optional;

public record AppendMember(TypeSpec.Builder builder, ClassName layouts, NameResolver names,
                           LayoutPath path, Optional<String> name)
    implements TypeFeature.Void
{}
