package jpgen.codegen.poet;

import java.io.IOException;

public class OutputContext
{
    public final Appendable output;
    public final String indent;
    public final String lineSeparator;
    private int m_controlFlowCount = 0;
    private boolean m_emptyLine = true;

    public OutputContext(Appendable output, String indent, String lineSeparator)
    {
        this.output = output;
        this.indent = indent;
        this.lineSeparator = lineSeparator;
    }

    public void pushControlFlow()
    {
        ++this.m_controlFlowCount;
    }

    public void popControlFlow()
    {
        this.m_controlFlowCount = Math.max(this.m_controlFlowCount - 1, 0);
    }

    private void manageIndents() throws IOException
    {
        if (this.m_emptyLine)
        {
            this.m_emptyLine = false;
            this.output.append(this.indent.repeat(this.m_controlFlowCount));
        }
    }

    public OutputContext append(char c) throws IOException
    {
        this.manageIndents();
        this.output.append(c);
        return this;
    }

    public OutputContext append(CharSequence csq) throws IOException
    {
        this.manageIndents();
        this.output.append(csq);
        return this;
    }

    public OutputContext append(CharSequence csq, int start, int end) throws IOException
    {
        this.manageIndents();
        this.output.append(csq, start, end);
        return this;
    }

    public OutputContext breakLine() throws IOException
    {
        this.output.append(this.lineSeparator);
        this.m_emptyLine = true;
        return this;
    }

    public OutputContext breakLine(char c) throws IOException
    {
        this.append(c);
        return this.breakLine();
    }

    public OutputContext breakLine(CharSequence csq) throws IOException
    {
        this.append(csq);
        return this.breakLine();
    }

    public OutputContext breakLine(CharSequence csq, int start, int end) throws IOException
    {
        this.append(csq, start, end);
        return this.breakLine();
    }
}
