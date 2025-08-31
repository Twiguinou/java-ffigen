package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.generator.data.features.AppendLayouts;

import java.util.List;
import java.util.Optional;

import static javax.lang.model.element.Modifier.*;

public record LayoutsDeclaration(ClassName path, Optional<CodeBlock> javadoc, List<DependencyProvider> providers)
    implements Declaration
{
    public LayoutsDeclaration(ClassName path, Optional<CodeBlock> javadoc, List<DependencyProvider> providers)
    {
        this.path = path;
        this.javadoc = javadoc;
        this.providers = List.copyOf(providers);
    }

    public LayoutsDeclaration(ClassName path, List<DependencyProvider> providers)
    {
        this(path, Optional.empty(), providers);
    }

    @Override
    public List<Type> dependencies()
    {
        return List.of();
    }

    @Override
    public Optional<TypeSpec> define(ClassName layouts)
    {
        TypeSpec.Builder builder = TypeSpec.classBuilder(this.path())
            .addModifiers(PUBLIC, FINAL)
            .addMethod(MethodSpec.constructorBuilder()
                .addModifiers(PRIVATE)
                .build());
        this.javadoc().ifPresent(builder::addJavadoc);

        AppendLayouts appendLayouts = new AppendLayouts(builder, this.path());
        this.providers().stream()
            .flatMap(provider -> provider.dependencies().stream())
            .distinct()
            .forEachOrdered(type -> type.apply(appendLayouts));

        return Optional.of(builder.build());
    }
}
