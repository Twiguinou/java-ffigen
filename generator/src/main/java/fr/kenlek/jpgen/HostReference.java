package fr.kenlek.jpgen;

import fr.kenlek.jpgen.data.path.JavaPath;

public record HostReference(String name, JavaPath path)
{
    public record Path(HostReference host, JavaPath path) {}

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof HostReference(String n, _) && this.name.equals(n);
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
}
