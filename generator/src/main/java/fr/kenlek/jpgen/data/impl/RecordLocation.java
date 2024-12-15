package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;

public record RecordLocation(JavaPath layoutsClass, RecordType.Decl record, RecordType.Member member) implements Type.InputLocation
{
    public record Array(JavaPath layoutsClass, String name) implements Type.InputLocation {}

    public static void writeConstant(PrintingContext context, PrintingContext.Consumer writer) throws IOException
    {
        context.append("public static final ");
        writer.accept(context);
        context.breakLine(';');
    }

    public static void writeFunction(PrintingContext context, boolean singleLine, PrintingContext.Consumer descriptorWriter, PrintingContext.Consumer bodyWriter) throws IOException
    {
        context.append("public ");
        descriptorWriter.accept(context);
        if (singleLine)
        {
            context.append(" {");
            bodyWriter.accept(context);
            context.breakLine('}');
            return;
        }

        context.breakLine();
        context.breakLine('{').pushControlFlow();
        bodyWriter.accept(context);
        context.popControlFlow().breakLine('}');
    }

    public String pointer()
    {
        return "this.".concat(this.record().pointerName);
    }
}
