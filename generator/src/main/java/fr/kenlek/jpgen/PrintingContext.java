package fr.kenlek.jpgen;

import java.io.IOException;
import java.util.Formatter;

public class PrintingContext implements Appendable
{
    public interface Consumer
    {
        void accept(PrintingContext context) throws IOException;
    }

    public final Appendable output;
    private final Formatter m_formatter;
    public final String indent;
    public final String lineSeparator;
    private int m_controlFlowCount = 0;
    private boolean m_emptyLine = true;

    public PrintingContext(Appendable output, String indent, String lineSeparator)
    {
        this.output = output;
        this.indent = indent;
        this.lineSeparator = lineSeparator;
        this.m_formatter = new Formatter(this);
    }

    public PrintingContext(Appendable output)
    {
        this(output, "    ", "\n");
    }

    public PrintingContext pushControlFlow(int count)
    {
        if (count < 0)
        {
            throw new IllegalArgumentException("Provided control flow push count is strictly negative.");
        }

        this.m_controlFlowCount += count;
        return this;
    }

    public PrintingContext pushControlFlow()
    {
        return this.pushControlFlow(1);
    }

    public PrintingContext popControlFlow(int count)
    {
        if (count < 0)
        {
            throw new IllegalArgumentException("Provided control flow pop count is strictly negative.");
        }

        this.m_controlFlowCount = Math.max(0, this.m_controlFlowCount - count);
        return this;
    }

    public PrintingContext popControlFlow()
    {
        return this.popControlFlow(1);
    }

    private void manageIndents() throws IOException
    {
        if (!this.m_emptyLine)
        {
            return;
        }

        this.m_emptyLine = false;
        for (int i = 0; i < this.m_controlFlowCount; i++)
        {
            this.output.append(this.indent);
        }
    }

    private PrintingContext checkFormatter() throws IOException
    {
        if (this.m_formatter.ioException() != null)
        {
            throw this.m_formatter.ioException();
        }

        return this;
    }

    public PrintingContext append(char c) throws IOException
    {
        this.manageIndents();
        this.output.append(c);
        return this;
    }

    public PrintingContext append(CharSequence csq) throws IOException
    {
        if (csq == null || !csq.isEmpty())
        {
            this.manageIndents();
            this.output.append(csq);
        }

        return this;
    }

    public PrintingContext append(Object o) throws IOException
    {
        return this.append(String.valueOf(o));
    }

    public PrintingContext append(String format, Object... args) throws IOException
    {
        this.m_formatter.format(format, args);
        return this.checkFormatter();
    }

    public PrintingContext append(CharSequence csq, int start, int end) throws IOException
    {
        if (csq == null || (!csq.isEmpty() && end - start > 0))
        {
            this.manageIndents();
            this.output.append(csq, start, end);
        }

        return this;
    }

    public PrintingContext breakLine() throws IOException
    {
        this.output.append(this.lineSeparator);
        this.m_emptyLine = true;
        return this;
    }

    public PrintingContext breakLine(char c) throws IOException
    {
        return this.append(c).breakLine();
    }

    public PrintingContext breakLine(CharSequence csq) throws IOException
    {
        return this.append(csq).breakLine();
    }

    public PrintingContext breakLine(Object o) throws IOException
    {
        return this.breakLine(String.valueOf(o));
    }

    public PrintingContext breakLine(String format, Object... args) throws IOException
    {
        this.m_formatter.format(format, args);
        return this.checkFormatter().breakLine();
    }

    public PrintingContext breakLine(CharSequence csq, int start, int end) throws IOException
    {
        return this.append(csq, start, end).breakLine();
    }
}
