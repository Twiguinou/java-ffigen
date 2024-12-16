package fr.kenlek.jpgen.data.features;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.Feature;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;

public sealed class PrintMember implements Feature.Void permits PrintMember.Plain, PrintMember.Array
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

    public final PrintingContext context;
    public final JavaPath layoutsClass;

    protected PrintMember(PrintingContext context, JavaPath layoutsClass)
    {
        this.context = context;
        this.layoutsClass = layoutsClass;
    }

    public void writeConstant(PrintingContext.Consumer writer) throws IOException
    {
        this.context.append("public static final ");
        writer.accept(this.context);
        this.context.breakLine(';');
    }

    public void writeFunction(boolean singleLine, PrintingContext.Consumer descriptorWriter, PrintingContext.Consumer bodyWriter) throws IOException
    {
        this.context.append("public ");
        descriptorWriter.accept(this.context);
        if (singleLine)
        {
            this.context.append(" {");
            bodyWriter.accept(this.context);
            this.context.breakLine('}');
            return;
        }

        this.context.breakLine();
        this.context.breakLine('{').pushControlFlow();
        bodyWriter.accept(this.context);
        this.context.popControlFlow().breakLine('}');
    }
}
