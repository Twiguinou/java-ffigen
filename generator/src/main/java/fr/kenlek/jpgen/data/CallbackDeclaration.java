package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public class CallbackDeclaration extends FunctionType.Wrapper implements Declaration.CodeGenerator<CallbackDeclaration>
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "DESCRIPTOR";
    public static final String DEFAULT_STUB_NAME = "UPCALL_STUB";

    private final JavaPath m_path;
    public final String descriptorName, stubName;

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parametersNames,
                               String descriptorName, String stubName)
    {
        super(descriptorType, parametersNames);
        this.descriptorName = LanguageUtils.requireJavaIdentifier(descriptorName);
        this.stubName = LanguageUtils.requireJavaIdentifier(stubName);
        this.m_path = path;
    }

    public CallbackDeclaration(JavaPath path, FunctionType descriptorType, List<String> parametersNames)
    {
        this(path, descriptorType, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public CallbackDeclaration withPath(JavaPath path)
    {
        return new CallbackDeclaration(path, this.descriptorType, this.parametersNames, this.descriptorName, this.stubName);
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        List<FunctionType.Parameter> parameters = this.createParameters();
        boolean redirect = this.descriptorType.hasTranslatableTypes();
        boolean isVoid = this.descriptorType.isVoid();

        this.emitClassPrefix(context);

        context.breakLine("public interface %s", this.path().tail());
        context.breakLine('{').pushControlFlow();

        context.breakLine("%s %s = %s;", FUNCTION_DESCRIPTOR, this.descriptorName,
                makeFunctionDescriptor(this.descriptorType, new LayoutReference.Descriptor(layoutsClass)));
        context.breakLine("%s %s = %s.initUpcallStub(%s, \"%s\", %s.class);",
                METHOD_HANDLE, this.stubName, FOREIGN_UTILS, this.descriptorName, redirect ? "_invoke" : "invoke", this.path().tail());

        context.breakLine();
        context.breakLine("%s invoke(%s);",
                this.descriptorType.returnType().process(TypeReference.CALLBACK), makeJavaParameters(TypeReference.CALLBACK, parameters));

        if (redirect)
        {
            context.breakLine();
            context.breakLine("default %s _invoke(%s)",
                    this.descriptorType.returnType().process(TypeReference.CALLBACK_RAW), makeJavaParameters(TypeReference.CALLBACK_RAW, parameters));
            context.breakLine('{').pushControlFlow();

            String result = String.format("this.invoke(%s)", CodeUtils.processParameters(true, parameters));
            if (!isVoid) context.append("return ");
            context.append(this.descriptorType.returnType().process(new TypeOp(false, result))).breakLine(';');

            context.popControlFlow().breakLine('}');
        }

        context.breakLine();
        context.breakLine("default %s makeHandle(%s arena)", MEMORY_SEGMENT, ARENA);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return %s.SYSTEM_LINKER.upcallStub(%s.bindTo(this), %s, arena);", FOREIGN_UTILS, this.stubName, this.descriptorName);
        context.popControlFlow().breakLine('}');

        context.popControlFlow().breakLine('}');
    }

    @Override
    public boolean printable()
    {
        return true;
    }

    @Override
    public String toString()
    {
        List<FunctionType.Parameter> parameters = this.createParameters();
        if (parameters.isEmpty())
        {
            return String.format("CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s]",
                    this.path(), this.descriptorType, this.descriptorName, this.stubName);
        }

        return String.format("CallbackDeclaration[%s, descriptorField=%s, stubField=%s, args={%s}]",
                this.path(), this.descriptorName, this.stubName, parameters.stream().map(FunctionType.Parameter::toString).collect(Collectors.joining(", ")));
    }
}
