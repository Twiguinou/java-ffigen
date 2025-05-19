package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data2.features.JavaTypeString;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import static fr.kenlek.jpgen.generator.LanguageUtils.requireJavaIdentifier;
import static fr.kenlek.jpgen.generator.data2.CodeUtils.*;

public class CallbackDeclaration extends FunctionType.Wrapper implements Declaration.Writable
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "DESCRIPTOR";
    public static final String DEFAULT_HANDLE_NAME = "UPCALL_HANDLE";

    private final JavaPath m_path;
    public final String descriptorName, handleName;

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parameterNames,
                               String descriptorName, String handleName)
    {
        super(descriptorType, parameterNames);
        Declaration.checkPath(path);
        if (descriptorName.equals(handleName))
        {
            throw new IllegalArgumentException("Descriptor name and handle name must not be equal.");
        }

        this.descriptorName = requireJavaIdentifier(descriptorName);
        this.handleName = requireJavaIdentifier(handleName);
        this.m_path = path;
    }

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parameterNames)
    {
        this(path, descriptorType, parameterNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_HANDLE_NAME);
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

        context.breakLine("%s invoke(", this.descriptorType.returnType().apply(JavaTypeString.CALLBACK_RETURN));
        for (ListIterator<FunctionType.Parameter> iterator = this.parameters.listIterator();;)
        {
            FunctionType.Parameter parameter = iterator.next();
            context.append("%s %s", parameter.type().apply(JavaTypeString.CALLBACK_PARAMETER), parameter.name());
            if (iterator.hasNext())
            {
                context.append(", ");
            }
            else
            {
                break;
            }
        }
        context.breakLine(");");

        context.breakLine();
        context.breakLine("default %s makeHandle(%s arena, %s... options)", MEMORY_SEGMENT, ARENA, LINKER_OPTION);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return %s.upcall(%s.class, this, arena, options);", NATIVE_PROXIES, this.path().tail());
        context.popControlFlow().breakLine('}');

        context.popControlFlow().breakLine('}');
    }

    @Override
    public String toString()
    {
        if (this.parameters.isEmpty())
        {
            return "CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s]".formatted(this.path(), this.descriptorType, this.descriptorName, this.handleName);
        }

        return "CallbackDeclaration[%s, descriptorField=%s, stubField=%s, args={%s}]".formatted(this.path(), this.descriptorName, this.handleName,
            this.parameters.stream().map(FunctionType.Parameter::toString).collect(Collectors.joining(", ")));
    }
}
