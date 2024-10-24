package fr.kenlek.jpgen.data.path;

enum EmptyJavaPath implements JavaPath
{
    VALUE;

    @Override
    public JavaPath parent()
    {
        return EMPTY;
    }

    @Override
    public String tail()
    {
        return "";
    }

    @Override
    public boolean isEmpty()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return "";
    }
}
