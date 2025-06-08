package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

public class CallbackDeclaration extends FunctionType.Wrapper implements Declaration.Writable
{
    private final JavaPath m_path;

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parameterNames)
    {
        super(descriptorType, parameterNames);

        this.m_path = Declaration.checkPath(path);
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        context.breakLine("public interface %s", this.path().tail());
        context.breakLine('{').pushControlFlow();

        context.breakLine("@" + UPCALL_TARGET);
        context.breakLine("%s invoke(%s);", this.descriptorType.returnType().apply(new JavaTypeString(
            JavaTypeString.Target.CALLBACK_RETURN, layoutsClass, true
        )), this.parameters.stream()
            .map(parameter -> parameter.type().apply(new JavaTypeString(
                JavaTypeString.Target.CALLBACK_PARAMETER, layoutsClass, true
            )) + " " + parameter.name())
            .collect(Collectors.joining(", ")));

        context.breakLine();
        context.breakLine("default %s makeHandle(%s arena, %s... options)", MEMORY_SEGMENT, ARENA, LINKER_OPTION);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return %s.upcall(%s.class, this, arena, options);", NATIVE_PROXIES, this.path().tail());
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("static %s makeHandle(%s target, %s arena, %s... options)", MEMORY_SEGMENT, this.path().tail(), ARENA, LINKER_OPTION);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return target.makeHandle(arena, options);");
        context.popControlFlow().breakLine('}');

        context.popControlFlow().breakLine('}');
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return "CallbackDeclaration[%s, descriptor=%s]".formatted(this.path(), this.descriptorType);
        }

        return "CallbackDeclaration[%s, args={%s}]".formatted(this.path(), this.parameters.stream().map(FunctionType.Parameter::toString).collect(Collectors.joining(", ")));
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return this.descriptorType.dependencies();
    }
}
