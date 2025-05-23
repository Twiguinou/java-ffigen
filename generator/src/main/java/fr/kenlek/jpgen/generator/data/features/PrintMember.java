package fr.kenlek.jpgen.generator.data.features;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.Feature;
import fr.kenlek.jpgen.generator.data.RecordType;
import fr.kenlek.jpgen.generator.data.JavaPath;

import java.io.IOException;

public sealed class PrintMember implements Feature.Opt permits PrintMember.Plain, PrintMember.Array
{
    public static final class Plain extends PrintMember
    {
        public final String pointer;
        public final RecordType.Member member;

        public Plain(PrintingContext context, JavaPath layoutsClass, String pointer, RecordType.Member member)
        {
            super(context, layoutsClass);
            this.pointer = pointer;
            this.member = member;
        }
    }

    public static final class Array extends PrintMember
    {
        public final String name;

        public Array(PrintingContext context, JavaPath layoutsClass, String name)
        {
            super(context, layoutsClass);
            this.name = name;
        }
    }

    private final PrintingContext m_context;
    public final JavaPath layoutsClass;

    protected PrintMember(PrintingContext context, JavaPath layoutsClass)
    {
        this.m_context = context;
        this.layoutsClass = layoutsClass;
    }

    @Override
    public PrintingContext context()
    {
        return this.m_context;
    }

    public void writeConstant(PrintingContext.Consumer writer) throws IOException
    {
        this.context().append("public static final ");
        writer.accept(this.context());
        this.context().breakLine(';');
    }

    public void writeFunction(boolean singleLine, PrintingContext.Consumer descriptorWriter,
                              PrintingContext.Consumer bodyWriter) throws IOException
    {
        this.context().append("public ");
        descriptorWriter.accept(this.context());
        if (singleLine)
        {
            this.context().append(" {");
            bodyWriter.accept(this.context());
            this.context().breakLine('}');
            return;
        }

        this.context().breakLine();
        this.context().breakLine('{').pushControlFlow();
        bodyWriter.accept(this.context());
        this.context().popControlFlow().breakLine('}');
    }
}
