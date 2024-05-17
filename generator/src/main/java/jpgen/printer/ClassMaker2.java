package jpgen.printer;

import jpgen.data2.EnumType;

import java.io.IOException;
import java.util.Optional;

public class ClassMaker2
{
    private final Settings m_settings;
    private final TypeTable m_types;

    public ClassMaker2(Settings settings, TypeTable types)
    {
        this.m_settings = settings;
        this.m_types = types;
    }

    private boolean emitClassPrefix(PrintingContext context) throws IOException
    {
        Optional<String> path = this.m_settings.javaPackage().toCanonicalPath();
        if (path.isPresent())
        {
            context.append("package ").append(path.get()).breakLine(';');
            return true;
        }

        return false;
    }

    public PrintingContext makeEnum(PrintingContext context, EnumType.Decl declaration) throws IOException
    {
        if (this.emitClassPrefix(context))
        {
            context.breakLine();
        }

        context.append("public final class ").breakLine(declaration.name());
        context.append("{private ").append(declaration.name()).breakLine("() {}");

        context.breakLine();
        context.pushControlFlow();
        for (EnumType.Constant constant : declaration.constants)
        {
            context.append("public static final ").append(declaration.integralType.javaType()).append(' ').append(constant.name())
                    .append(" = ").append(Long.toString(constant.value())).breakLine(';');
        }
        context.popControlFlow();

        return context.breakLine('}');
    }
}
