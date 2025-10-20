package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;

import fr.kenlek.jpgen.generator.data.features.GetEnumField;
import java.util.Optional;
import java.util.Set;
import javax.lang.model.element.Modifier;

import static javax.lang.model.element.Modifier.*;

public record EnumDeclaration(EnumType underlying, ClassName path, Optional<CodeBlock> javadoc)
    implements Type.Delegated, Declaration
{
    public static final Set<Modifier> CONSTANT_MODIFIER_SET = Set.of(PUBLIC, STATIC, FINAL);

    public EnumDeclaration(EnumType underlying, ClassName path)
    {
        this(underlying, path, Optional.empty());
    }

    public static Modifier[] constantModifiers()
    {
        return CONSTANT_MODIFIER_SET.toArray(Modifier[]::new);
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

        builder.addFields(this.underlying().constants().stream()
            .map(constant -> this.underlying().apply(new GetEnumField(constant)))
            .toList());

        return Optional.of(builder.build());
    }
}
