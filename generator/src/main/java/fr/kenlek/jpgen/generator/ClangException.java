package fr.kenlek.jpgen.generator;

/// This exception is thrown if any error occurs during the initialization or parsing phases.
@SuppressWarnings("serial")
public class ClangException extends RuntimeException
{
    public ClangException()
    {
        super();
    }

    public ClangException(String s)
    {
        super(s);
    }
}
