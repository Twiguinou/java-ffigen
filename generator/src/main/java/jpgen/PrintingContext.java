package jpgen;

import java.io.IOException;

@SuppressWarnings("unused")
public class PrintingContext implements Appendable
{
    public final Appendable output;
    public final String indent;
    public final String lineSeparator;
    private int m_controlFlowCount = 0;
    private boolean m_emptyLine = true;

    public PrintingContext(Appendable output, String indent, String lineSeparator)
    {
        this.output = output;
        this.indent = indent;
        this.lineSeparator = lineSeparator;
    }

    public PrintingContext(Appendable output)
    {
        this(output, "    ", "\n");
    }

    public PrintingContext pushControlFlow()
    {
        ++this.m_controlFlowCount;
        return this;
    }

    public PrintingContext popControlFlow()
    {
        this.m_controlFlowCount = Math.max(0, this.m_controlFlowCount - 1);
        return this;
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

    public PrintingContext breakLine(CharSequence csq, int start, int end) throws IOException
    {
        return this.append(csq, start, end).breakLine();
    }
}
