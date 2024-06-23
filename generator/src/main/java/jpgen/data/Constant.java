package jpgen.data;

import java.io.IOException;

public interface Constant
{
    String name();

    void write(Appendable output) throws IOException;

    record Int(String name, int value) implements Constant
    {
        @Override
        public void write(Appendable output) throws IOException
        {
            String valueString = Integer.toString(this.value);
            output.append("public static final int ").append(this.name).append(" = ").append(valueString).append(";");
        }
    }

    record Float(String name, double value) implements Constant
    {
        @Override
        public void write(Appendable output) throws IOException
        {
            String valueString = Double.toString(this.value);
            output.append("public static final double ").append(this.name).append(" = ").append(valueString).append(";");
        }
    }

    record StringLiteral(String name, String value) implements Constant
    {
        @Override
        public void write(Appendable output) throws IOException
        {
            output.append("public static final String ").append(this.name).append(" = \"").append(this.value).append("\";");
        }
    }
}
