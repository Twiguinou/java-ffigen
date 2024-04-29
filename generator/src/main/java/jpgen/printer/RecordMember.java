package jpgen.printer;

public interface RecordMember
{
    String name();

    String layoutClass();

    String layoutReference();

    long padding();

    static RecordMember ofPadding(long padding)
    {
        if (padding <= 0)
        {
            throw new IllegalArgumentException("Padding must be strictly positive.");
        }

        return new RecordMember()
        {
            @Override public String name() {throw new UnsupportedOperationException();}
            @Override public String layoutClass() {throw new UnsupportedOperationException();}
            @Override public String layoutReference() {throw new UnsupportedOperationException();}

            @Override
            public long padding()
            {
                return padding;
            }
        };
    }
}
