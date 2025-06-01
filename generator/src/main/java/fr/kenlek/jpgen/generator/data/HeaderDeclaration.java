package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public record HeaderDeclaration(JavaPath path, String classAnnotations, List<Constant> constants, List<? extends Binding> bindings)
    implements Declaration.Writable
{
    public record Constant(String type, String name, String value)
    {
        public Constant
        {
            LanguageUtils.requireJavaIdentifier(name);
        }
    }

    public static class Binding extends FunctionType.Wrapper
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

    public HeaderDeclaration(JavaPath path, List<Constant> constants, List<? extends Binding> bindings)
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
            context.breakLine("public static final %s %s = %s;", constant.type(), constant.name(), constant.value());
        }

        context.breakLine();
        for (Binding binding : this.bindings())
        {
            if (!binding.annotations.isEmpty())
            {
                context.breakLine(binding.annotations);
            }

            context.breakLine("%s %s(%s);",
                binding.descriptorType.returnType().apply(new JavaTypeString(JavaTypeString.Target.HEADER_RETURN, layoutsClass)),
                binding.name,
                binding.parameters.stream()
                    .map(parameter -> parameter.type().apply(new JavaTypeString(JavaTypeString.Target.HEADER_PARAMETER, layoutsClass)) + " " + parameter.name())
                    .collect(Collectors.joining(", "))
            );
        }

        context.popControlFlow().breakLine('}');
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of();
    }
}
