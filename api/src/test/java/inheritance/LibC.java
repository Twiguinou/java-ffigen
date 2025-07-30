package inheritance;

public abstract class LibC
{
    public final String someVariable;

    protected LibC(String someVariable)
    {
        this.someVariable = someVariable;
    }

    public abstract int abs(int value);
}
