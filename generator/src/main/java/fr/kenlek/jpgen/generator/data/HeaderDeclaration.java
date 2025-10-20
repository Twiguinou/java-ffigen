package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module java.base;

import fr.kenlek.jpgen.api.dynload.Ignore;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.GetFlag;
import fr.kenlek.jpgen.generator.data.features.GetType;

import static javax.lang.model.element.Modifier.*;

public record HeaderDeclaration(ClassName path, Optional<CodeBlock> javadoc, List<FunctionDeclaration> functions)
    implements Declaration
{
    public HeaderDeclaration(ClassName path, Optional<CodeBlock> javadoc, List<FunctionDeclaration> functions)
    {
        this.path = path;
        this.javadoc = javadoc;
        this.functions = List.copyOf(functions);
    }

    public HeaderDeclaration(ClassName path, List<FunctionDeclaration> functions)
    {
        this(path, Optional.empty(), functions);
    }

    @Override
    public List<Type> dependencies()
    {
        return this.functions().stream()
            .flatMap(function -> function.type().dependencies().stream())
            .toList();
    }

    @Override
    public Optional<TypeSpec> define(ClassName layouts)
    {
        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(this.path())
            .addModifiers(PUBLIC);
        this.javadoc().ifPresent(builder::addJavadoc);

        NameResolver names = new NameResolver();
        builder.addMethods(this.functions().stream()
            .map(function ->
            {
                MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(names.resolve(function.name()))
                    .addModifiers(PUBLIC, ABSTRACT)
                    .returns(function.type().returnType().apply(new GetType(GetType.Target.HEADER_RETURN, layouts)));
                List<ParameterSpec> parameters = function.type().parameterSpecs(function.parameterInfos(), GetType.Target.HEADER_PARAMETER, layouts);
                if (function.type().returnType().apply(GetFlag.NEEDS_ALLOCATOR))
                {
                    NameResolver resolver = new NameResolver();
                    resolver.register(parameters.stream().map(ParameterSpec::name).toArray(String[]::new));
                    methodBuilder.addParameter(
                        TypeName.get(SegmentAllocator.class).annotated(AnnotationSpec.builder(Ignore.class).build()),
                        resolver.resolve("allocator")
                    );
                }

                methodBuilder.addParameters(parameters);
                return methodBuilder.build();
            })
            .toList());

        return Optional.of(builder.build());
    }

    public static class Builder
    {
        public final List<FunctionDeclaration> functions = new ArrayList<>();

        public Builder() {}

        public Builder withFunction(FunctionDeclaration function)
        {
            this.functions.add(function);
            return this;
        }

        public HeaderDeclaration build(ClassName path, Optional<CodeBlock> javadoc)
        {
            return new HeaderDeclaration(path, javadoc, this.functions);
        }

        public HeaderDeclaration build(ClassName path)
        {
            return new HeaderDeclaration(path, this.functions);
        }
    }
}
