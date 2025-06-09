package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.HeaderFlag;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

public record HeaderDeclaration(JavaPath path, String classAnnotations, List<Constant> constants, List<Binding> bindings)
    implements Declaration.Writable
{
    public record Constant(String type, String name, String value)
    {
        public Constant
        {
            LanguageUtils.requireJavaIdentifier(name);
        }
    }

    public static final class Binding extends FunctionType.Wrapper
    {
        public final String name;
        public final String annotations;

        public Binding(String name, FunctionType descriptorType, List<String> parameterNames, String annotations)
        {
            super(descriptorType, parameterNames);

            this.name = LanguageUtils.requireJavaIdentifier(name);
            this.annotations = annotations;
        }

        public Binding(String name, FunctionType descriptorType, List<String> parameterNames)
        {
            this(name, descriptorType, parameterNames, "");
        }
    }

    public HeaderDeclaration(JavaPath path, List<Constant> constants, List<Binding> bindings)
    {
        this(path, "", constants, bindings);
    }

    @Override
    public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        if (!this.classAnnotations().isEmpty())
        {
            context.breakLine(this.classAnnotations());
        }

        context.breakLine("public interface %s", this.path().tail());
        context.breakLine('{').pushControlFlow();

        for (Constant constant : this.constants())
        {
            context.breakLine("%s %s = %s;", constant.type(), constant.name(), constant.value());
        }

        NameResolver dispatcherResolver = new NameResolver();

        context.breakLine();
        for (Binding binding : this.bindings())
        {
            dispatcherResolver.register(binding.name);
            if (!binding.annotations.isEmpty())
            {
                context.breakLine(binding.annotations);
            }

            JavaTypeString parameterTypeString = new JavaTypeString(JavaTypeString.Target.HEADER_PARAMETER, layoutsClass, true);
            String parameters = binding.parameters.stream()
                .map(parameter -> parameter.type().apply(parameterTypeString) + " " + parameter.name())
                .collect(Collectors.joining(", "));
            if (binding.descriptorType.returnType().apply(HeaderFlag.APPEND_ALLOCATOR))
            {
                NameResolver resolver = new NameResolver();
                for (FunctionType.Parameter parameter : binding.parameters)
                {
                    resolver.register(parameter.name());
                }

                String allocator = "@%s %s %s".formatted(IGNORE, SEGMENT_ALLOCATOR, resolver.resolve("allocator"));
                parameters = parameters.isEmpty() ? allocator : (allocator + ", " + parameters);
            }

            if (parameters.isEmpty())
            {
                dispatcherResolver.register(binding.name);
            }

            context.breakLine("%s %s(%s);",
                binding.descriptorType.returnType().apply(new JavaTypeString(JavaTypeString.Target.HEADER_RETURN, layoutsClass, true)),
                binding.name, parameters
            );
        }

        context.breakLine();
        context.append('@').breakLine(DISPATCHER);
        context.breakLine("%s %s();", DOWNCALL_DISPATCHER, dispatcherResolver.resolve("dispatcher"));

        context.popControlFlow().breakLine('}');
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of();
    }
}
