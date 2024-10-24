package fr.kenlek.jpgen.data.path;

record ElementJavaPath(JavaPath parent, String tail) implements JavaPath
{
    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public String toString()
    {
        if (this.parent().isEmpty())
        {
            return this.tail();
        }

        return String.format("%s.%s", this.parent(), this.tail());
    }
}
