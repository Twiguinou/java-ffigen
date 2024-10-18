package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public class CallbackDeclaration extends FunctionType.Wrapper implements Declaration.CodeGenerator
{
    public static final String DEFAULT_DESCRIPTOR_NAME = "DESCRIPTOR";
    public static final String DEFAULT_STUB_NAME = "UPCALL_STUB";

    private final JavaPath m_path;
    private final List<String> m_parametersNames;
    public final String descriptorName, stubName;

    public CallbackDeclaration(JavaPath path, Type.Reference<FunctionType> descriptorType, List<String> parametersNames,
                               String descriptorName, String stubName)
    {
        super(descriptorType);
        parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
        this.descriptorName = LanguageUtils.requireJavaIdentifier(descriptorName);
        this.stubName = LanguageUtils.requireJavaIdentifier(stubName);
        this.m_path = path;
        this.m_parametersNames = parametersNames;
    }

    public CallbackDeclaration(JavaPath path, Type.Reference<FunctionType> descriptorType, List<String> parametersNames)
    {
        this(path, descriptorType, parametersNames, DEFAULT_DESCRIPTOR_NAME, DEFAULT_STUB_NAME);
    }

    @Override
    public List<String> parametersNames()
    {
        return this.m_parametersNames;
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        FunctionType descriptorType = this.descriptorType();
        List<FunctionType.Parameter> parameters = this.parameters();
        boolean redirect = descriptorType.hasTranslatableTypes();
        boolean isVoid = descriptorType.isVoid();

        this.emitClassPrefix(context);

        context.breakLine("public interface %s", this.path().name());
        context.breakLine('{').pushControlFlow();

        context.breakLine("%s %s = %s;", FUNCTION_DESCRIPTOR, this.descriptorName,
                makeFunctionDescriptor(descriptorType, new LayoutReference.Descriptor(layoutsClass)));
        context.breakLine("%s %s = %s.initUpcallStub(%s, \"%s\", %s.class);",
                METHOD_HANDLE, this.stubName, FOREIGN_UTILS, this.descriptorName, redirect ? "_invoke" : "invoke", this.path().name());

        context.breakLine();
        context.breakLine("%s invoke(%s);",
                descriptorType.returnType().process(TypeReference.CALLBACK), makeJavaParameters(TypeReference.CALLBACK, parameters));

        if (redirect)
        {
            context.breakLine();
            context.breakLine("default %s _invoke(%s)",
                    descriptorType.returnType().process(TypeReference.CALLBACK_RAW), makeJavaParameters(TypeReference.CALLBACK_RAW, parameters));
            context.breakLine('{').pushControlFlow();

            String result = String.format("this.invoke(%s)", CodeUtils.processParameters(true, parameters));
            if (!isVoid) context.append("return ");
            context.append(descriptorType.returnType().process(new TypeOp(false, result))).breakLine(';');

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
    public String toString()
    {
        if (this.parametersNames().isEmpty())
        {
            return String.format("CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s]",
                    this.path(), this.descriptorType(), this.descriptorName, this.stubName);
        }

        return String.format("CallbackDeclaration[%s, descriptor=%s, descriptorField=%s, stubField=%s, args={%s}]",
                this.path(), this.descriptorType(), this.descriptorName, this.stubName, String.join(", ", this.parametersNames()));
    }
}
