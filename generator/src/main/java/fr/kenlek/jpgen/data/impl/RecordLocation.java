package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.CodeUtils;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;

public record RecordLocation(JavaPath layoutsClass, RecordType.Decl record, int index, Target target)
        implements Type.InputLocation
{
    public enum Target
    {
        PROTOTYPE,
        OVERRIDE,
        PLAIN;

        public void tryWriteConstant(PrintingContext context, PrintingContext.Consumer writer) throws IOException
        {
            if (this != PROTOTYPE)
            {
                context.append("public static final ");
                writer.accept(context);
                context.breakLine(';');
            }
        }

        public void writeFunction(PrintingContext context, boolean singleLine,
                           PrintingContext.Consumer descriptorWriter, PrintingContext.Consumer bodyWriter) throws IOException
        {
            if (this == PROTOTYPE)
            {
                descriptorWriter.accept(context);
                context.breakLine(';');
                return;
            }

            if (this == OVERRIDE) context.append("@%s ", CodeUtils.OVERRIDE);
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
    }

    public record Array(JavaPath layoutsClass, String name, Target target) implements Type.InputLocation {}

    public RecordType.Member member()
    {
        return this.record().members.get(this.index);
    }

    public String pointer()
    {
        return "this.".concat(this.record().pointerName);
    }
}
